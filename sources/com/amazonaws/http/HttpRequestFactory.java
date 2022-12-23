package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0016g;
import p358af.C13437d;

public class HttpRequestFactory {
    private static final String DEFAULT_ENCODING = "UTF-8";

    private void configureHeaders(Map<String, String> map, Request<?> request, ExecutionContext executionContext, ClientConfiguration clientConfiguration) {
        URI endpoint = request.getEndpoint();
        String host = endpoint.getHost();
        if (HttpUtils.isUsingNonDefaultPort(endpoint)) {
            StringBuilder t = C0016g.m36t(host, ":");
            t.append(endpoint.getPort());
            host = t.toString();
        }
        map.put(HttpHeader.HOST, host);
        for (Map.Entry next : request.getHeaders().entrySet()) {
            map.put(next.getKey(), next.getValue());
        }
        if (map.get(HttpHeader.CONTENT_TYPE) == null || map.get(HttpHeader.CONTENT_TYPE).isEmpty()) {
            StringBuilder k = C13555b.m33972k("application/x-www-form-urlencoded; charset=");
            k.append(StringUtils.lowerCase(DEFAULT_ENCODING));
            map.put(HttpHeader.CONTENT_TYPE, k.toString());
        }
        if (executionContext != null && executionContext.getContextUserAgent() != null) {
            map.put(HttpHeader.USER_AGENT, createUserAgentString(clientConfiguration, executionContext.getContextUserAgent()));
        }
    }

    private String createUserAgentString(ClientConfiguration clientConfiguration, String str) {
        if (clientConfiguration.getUserAgent().contains(str)) {
            return clientConfiguration.getUserAgent();
        }
        return clientConfiguration.getUserAgent() + " " + str;
    }

    public HttpRequest createHttpRequest(Request<?> request, ClientConfiguration clientConfiguration, ExecutionContext executionContext) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        String appendUri = HttpUtils.appendUri(request.getEndpoint().toString(), request.getResourcePath(), true);
        String encodeParameters = HttpUtils.encodeParameters(request);
        HttpMethodName httpMethod = request.getHttpMethod();
        if (request.getContent() != null) {
            z = true;
        } else {
            z = false;
        }
        HttpMethodName httpMethodName = HttpMethodName.POST;
        if (httpMethod == httpMethodName) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !z) {
            z3 = false;
        }
        if (encodeParameters != null && z3) {
            appendUri = C13437d.m33706k(appendUri, "?", encodeParameters);
        }
        HashMap hashMap = new HashMap();
        configureHeaders(hashMap, request, executionContext, clientConfiguration);
        InputStream content = request.getContent();
        HttpMethodName httpMethodName2 = HttpMethodName.PATCH;
        if (httpMethod == httpMethodName2) {
            hashMap.put("X-HTTP-Method-Override", httpMethodName2.toString());
            httpMethod = httpMethodName;
        }
        if (httpMethod == httpMethodName && request.getContent() == null && encodeParameters != null) {
            byte[] bytes = encodeParameters.getBytes(StringUtils.UTF8);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            hashMap.put(HttpHeader.CONTENT_LENGTH, String.valueOf(bytes.length));
            content = byteArrayInputStream;
        }
        if (!clientConfiguration.isEnableGzip() || hashMap.get("Accept-Encoding") != null) {
            hashMap.put("Accept-Encoding", "identity");
        } else {
            hashMap.put("Accept-Encoding", "gzip");
        }
        HttpRequest httpRequest = new HttpRequest(httpMethod.toString(), URI.create(appendUri), hashMap, content);
        httpRequest.setStreaming(request.isStreaming());
        return httpRequest;
    }
}
