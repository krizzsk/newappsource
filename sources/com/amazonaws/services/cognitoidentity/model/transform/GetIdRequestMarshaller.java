package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;
import p001a0.C0016g;

public class GetIdRequestMarshaller implements Marshaller<Request<GetIdRequest>, GetIdRequest> {
    public Request<GetIdRequest> marshall(GetIdRequest getIdRequest) {
        if (getIdRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(getIdRequest, "AmazonCognitoIdentity");
            defaultRequest.addHeader("X-Amz-Target", "AWSCognitoIdentityService.GetId");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                StringWriter stringWriter = new StringWriter();
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
                jsonWriter.beginObject();
                if (getIdRequest.getAccountId() != null) {
                    String accountId = getIdRequest.getAccountId();
                    jsonWriter.name("AccountId");
                    jsonWriter.value(accountId);
                }
                if (getIdRequest.getIdentityPoolId() != null) {
                    String identityPoolId = getIdRequest.getIdentityPoolId();
                    jsonWriter.name("IdentityPoolId");
                    jsonWriter.value(identityPoolId);
                }
                if (getIdRequest.getLogins() != null) {
                    Map<String, String> logins = getIdRequest.getLogins();
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
            throw new AmazonClientException("Invalid argument passed to marshall(GetIdRequest)");
        }
    }
}
