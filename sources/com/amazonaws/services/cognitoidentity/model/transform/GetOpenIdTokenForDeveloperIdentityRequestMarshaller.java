package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;
import p001a0.C0016g;

public class GetOpenIdTokenForDeveloperIdentityRequestMarshaller implements Marshaller<Request<GetOpenIdTokenForDeveloperIdentityRequest>, GetOpenIdTokenForDeveloperIdentityRequest> {
    public Request<GetOpenIdTokenForDeveloperIdentityRequest> marshall(GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest) {
        if (getOpenIdTokenForDeveloperIdentityRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(getOpenIdTokenForDeveloperIdentityRequest, "AmazonCognitoIdentity");
            defaultRequest.addHeader("X-Amz-Target", "AWSCognitoIdentityService.GetOpenIdTokenForDeveloperIdentity");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                StringWriter stringWriter = new StringWriter();
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
                jsonWriter.beginObject();
                if (getOpenIdTokenForDeveloperIdentityRequest.getIdentityPoolId() != null) {
                    String identityPoolId = getOpenIdTokenForDeveloperIdentityRequest.getIdentityPoolId();
                    jsonWriter.name("IdentityPoolId");
                    jsonWriter.value(identityPoolId);
                }
                if (getOpenIdTokenForDeveloperIdentityRequest.getIdentityId() != null) {
                    String identityId = getOpenIdTokenForDeveloperIdentityRequest.getIdentityId();
                    jsonWriter.name("IdentityId");
                    jsonWriter.value(identityId);
                }
                if (getOpenIdTokenForDeveloperIdentityRequest.getLogins() != null) {
                    Map<String, String> logins = getOpenIdTokenForDeveloperIdentityRequest.getLogins();
                    jsonWriter.name("Logins");
                    jsonWriter.beginObject();
                    for (Map.Entry next : logins.entrySet()) {
                        String str = (String) next.getValue();
                        if (str != null) {
                            jsonWriter.name((String) next.getKey());
                            jsonWriter.value(str);
                        }
                    }
                    jsonWriter.endObject();
                }
                if (getOpenIdTokenForDeveloperIdentityRequest.getPrincipalTags() != null) {
                    Map<String, String> principalTags = getOpenIdTokenForDeveloperIdentityRequest.getPrincipalTags();
                    jsonWriter.name("PrincipalTags");
                    jsonWriter.beginObject();
                    for (Map.Entry next2 : principalTags.entrySet()) {
                        String str2 = (String) next2.getValue();
                        if (str2 != null) {
                            jsonWriter.name((String) next2.getKey());
                            jsonWriter.value(str2);
                        }
                    }
                    jsonWriter.endObject();
                }
                if (getOpenIdTokenForDeveloperIdentityRequest.getTokenDuration() != null) {
                    Long tokenDuration = getOpenIdTokenForDeveloperIdentityRequest.getTokenDuration();
                    jsonWriter.name("TokenDuration");
                    jsonWriter.value((Number) tokenDuration);
                }
                jsonWriter.endObject();
                jsonWriter.close();
                String stringWriter2 = stringWriter.toString();
                byte[] bytes = stringWriter2.getBytes(StringUtils.UTF8);
                defaultRequest.setContent(new StringInputStream(stringWriter2));
                defaultRequest.addHeader(HttpHeader.CONTENT_LENGTH, Integer.toString(bytes.length));
                if (!defaultRequest.getHeaders().containsKey(HttpHeader.CONTENT_TYPE)) {
                    defaultRequest.addHeader(HttpHeader.CONTENT_TYPE, "application/x-amz-json-1.1");
                }
                return defaultRequest;
            } catch (Throwable th) {
                throw new AmazonClientException(C0016g.m32p(th, C13555b.m33972k("Unable to marshall request to JSON: ")), th);
            }
        } else {
            throw new AmazonClientException("Invalid argument passed to marshall(GetOpenIdTokenForDeveloperIdentityRequest)");
        }
    }
}
