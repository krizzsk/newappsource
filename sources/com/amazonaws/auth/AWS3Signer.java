package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import p001a0.C0016g;

@Deprecated
public class AWS3Signer extends AbstractAWSSigner {
    private static final String AUTHORIZATION_HEADER = "X-Amzn-Authorization";
    private static final String HTTPS_SCHEME = "AWS3-HTTPS";
    private static final String HTTP_SCHEME = "AWS3";
    private static final String NONCE_HEADER = "x-amz-nonce";
    private static final Log log = LogFactory.getLog((Class<?>) AWS3Signer.class);
    private String overriddenDate;

    private String getSignedHeadersComponent(Request<?> request) {
        StringBuilder k = C13555b.m33972k("SignedHeaders=");
        boolean z = true;
        for (String next : getHeadersForStringToSign(request)) {
            if (!z) {
                k.append(";");
            }
            k.append(next);
            z = false;
        }
        return k.toString();
    }

    public void addSessionCredentials(Request<?> request, AWSSessionCredentials aWSSessionCredentials) {
        request.addHeader("x-amz-security-token", aWSSessionCredentials.getSessionToken());
    }

    public String getCanonicalizedHeadersForStringToSign(Request<?> request) {
        List<String> headersForStringToSign = getHeadersForStringToSign(request);
        for (int i = 0; i < headersForStringToSign.size(); i++) {
            headersForStringToSign.set(i, StringUtils.lowerCase(headersForStringToSign.get(i)));
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry next : request.getHeaders().entrySet()) {
            if (headersForStringToSign.contains(StringUtils.lowerCase((String) next.getKey()))) {
                treeMap.put(StringUtils.lowerCase((String) next.getKey()), next.getValue());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append(StringUtils.lowerCase((String) entry.getKey()));
            sb.append(":");
            sb.append((String) entry.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    public List<String> getHeadersForStringToSign(Request<?> request) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> key : request.getHeaders().entrySet()) {
            String str = (String) key.getKey();
            String lowerCase = StringUtils.lowerCase(str);
            if (lowerCase.startsWith("x-amz") || "host".equals(lowerCase)) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public void overrideDate(String str) {
        this.overriddenDate = str;
    }

    public boolean shouldUseHttpsScheme(Request<?> request) {
        try {
            String lowerCase = StringUtils.lowerCase(request.getEndpoint().toURL().getProtocol());
            if ("http".equals(lowerCase)) {
                return false;
            }
            if ("https".equals(lowerCase)) {
                return true;
            }
            throw new AmazonClientException("Unknown request endpoint protocol encountered while signing request: " + lowerCase);
        } catch (MalformedURLException e) {
            throw new AmazonClientException("Unable to parse request endpoint during signing", e);
        }
    }

    public void sign(Request<?> request, AWSCredentials aWSCredentials) {
        if (!(aWSCredentials instanceof AnonymousAWSCredentials)) {
            AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
            SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
            UUID.randomUUID().toString();
            String formatRFC822Date = DateUtils.formatRFC822Date(getSignatureDate(getTimeOffset(request)));
            String str = this.overriddenDate;
            if (str != null) {
                formatRFC822Date = str;
            }
            request.addHeader(HttpHeader.DATE, formatRFC822Date);
            request.addHeader("X-Amz-Date", formatRFC822Date);
            String host = request.getEndpoint().getHost();
            if (HttpUtils.isUsingNonDefaultPort(request.getEndpoint())) {
                StringBuilder t = C0016g.m36t(host, ":");
                t.append(request.getEndpoint().getPort());
                host = t.toString();
            }
            request.addHeader(HttpHeader.HOST, host);
            if (sanitizeCredentials instanceof AWSSessionCredentials) {
                addSessionCredentials(request, (AWSSessionCredentials) sanitizeCredentials);
            }
            String appendUri = HttpUtils.appendUri(request.getEndpoint().getPath(), request.getResourcePath());
            String str2 = request.getHttpMethod().toString() + "\n" + getCanonicalizedResourcePath(appendUri) + "\n" + getCanonicalizedQueryString(request.getParameters()) + "\n" + getCanonicalizedHeadersForStringToSign(request) + "\n" + getRequestPayloadWithoutQueryParams(request);
            byte[] hash = hash(str2);
            log.debug("Calculated StringToSign: " + str2);
            String signAndBase64Encode = signAndBase64Encode(hash, sanitizeCredentials.getAWSSecretKey(), signingAlgorithm);
            StringBuilder t2 = C0016g.m36t(HTTP_SCHEME, " ");
            StringBuilder k = C13555b.m33972k("AWSAccessKeyId=");
            k.append(sanitizeCredentials.getAWSAccessKeyId());
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            t2.append(k.toString());
            t2.append("Algorithm=" + signingAlgorithm.toString() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            StringBuilder sb = new StringBuilder();
            sb.append(getSignedHeadersComponent(request));
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            t2.append(sb.toString());
            t2.append("Signature=" + signAndBase64Encode);
            request.addHeader(AUTHORIZATION_HEADER, t2.toString());
        }
    }
}
