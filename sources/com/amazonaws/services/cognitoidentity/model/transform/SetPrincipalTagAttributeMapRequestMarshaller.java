package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.SetPrincipalTagAttributeMapRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import java.util.Map;
import p001a0.C0016g;

public class SetPrincipalTagAttributeMapRequestMarshaller implements Marshaller<Request<SetPrincipalTagAttributeMapRequest>, SetPrincipalTagAttributeMapRequest> {
    public Request<SetPrincipalTagAttributeMapRequest> marshall(SetPrincipalTagAttributeMapRequest setPrincipalTagAttributeMapRequest) {
        if (setPrincipalTagAttributeMapRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(setPrincipalTagAttributeMapRequest, "AmazonCognitoIdentity");
            defaultRequest.addHeader("X-Amz-Target", "AWSCognitoIdentityService.SetPrincipalTagAttributeMap");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                StringWriter stringWriter = new StringWriter();
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
                jsonWriter.beginObject();
                if (setPrincipalTagAttributeMapRequest.getIdentityPoolId() != null) {
                    String identityPoolId = setPrincipalTagAttributeMapRequest.getIdentityPoolId();
                    jsonWriter.name("IdentityPoolId");
                    jsonWriter.value(identityPoolId);
                }
                if (setPrincipalTagAttributeMapRequest.getIdentityProviderName() != null) {
                    String identityProviderName = setPrincipalTagAttributeMapRequest.getIdentityProviderName();
                    jsonWriter.name("IdentityProviderName");
                    jsonWriter.value(identityProviderName);
                }
                if (setPrincipalTagAttributeMapRequest.getUseDefaults() != null) {
                    Boolean useDefaults = setPrincipalTagAttributeMapRequest.getUseDefaults();
                    jsonWriter.name("UseDefaults");
                    jsonWriter.value(useDefaults.booleanValue());
                }
                if (setPrincipalTagAttributeMapRequest.getPrincipalTags() != null) {
                    Map<String, String> principalTags = setPrincipalTagAttributeMapRequest.getPrincipalTags();
                    jsonWriter.name("PrincipalTags");
                    jsonWriter.beginObject();
                    for (Map.Entry next : principalTags.entrySet()) {
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
            throw new AmazonClientException("Invalid argument passed to marshall(SetPrincipalTagAttributeMapRequest)");
        }
    }
}
