package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;
import p001a0.C0016g;

public class UnlinkIdentityRequestMarshaller implements Marshaller<Request<UnlinkIdentityRequest>, UnlinkIdentityRequest> {
    public Request<UnlinkIdentityRequest> marshall(UnlinkIdentityRequest unlinkIdentityRequest) {
        if (unlinkIdentityRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(unlinkIdentityRequest, "AmazonCognitoIdentity");
            defaultRequest.addHeader("X-Amz-Target", "AWSCognitoIdentityService.UnlinkIdentity");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                StringWriter stringWriter = new StringWriter();
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
                jsonWriter.beginObject();
                if (unlinkIdentityRequest.getIdentityId() != null) {
                    String identityId = unlinkIdentityRequest.getIdentityId();
                    jsonWriter.name("IdentityId");
                    jsonWriter.value(identityId);
                }
                if (unlinkIdentityRequest.getLogins() != null) {
                    Map<String, String> logins = unlinkIdentityRequest.getLogins();
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
                if (unlinkIdentityRequest.getLoginsToRemove() != null) {
                    List<String> loginsToRemove = unlinkIdentityRequest.getLoginsToRemove();
                    jsonWriter.name("LoginsToRemove");
                    jsonWriter.beginArray();
                    for (String next2 : loginsToRemove) {
                        if (next2 != null) {
                            jsonWriter.value(next2);
                        }
                    }
                    jsonWriter.endArray();
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
            throw new AmazonClientException("Invalid argument passed to marshall(UnlinkIdentityRequest)");
        }
    }
}
