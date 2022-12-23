package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import p001a0.C0016g;

public class MergeDeveloperIdentitiesRequestMarshaller implements Marshaller<Request<MergeDeveloperIdentitiesRequest>, MergeDeveloperIdentitiesRequest> {
    public Request<MergeDeveloperIdentitiesRequest> marshall(MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest) {
        if (mergeDeveloperIdentitiesRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(mergeDeveloperIdentitiesRequest, "AmazonCognitoIdentity");
            defaultRequest.addHeader("X-Amz-Target", "AWSCognitoIdentityService.MergeDeveloperIdentities");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                StringWriter stringWriter = new StringWriter();
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
                jsonWriter.beginObject();
                if (mergeDeveloperIdentitiesRequest.getSourceUserIdentifier() != null) {
                    String sourceUserIdentifier = mergeDeveloperIdentitiesRequest.getSourceUserIdentifier();
                    jsonWriter.name("SourceUserIdentifier");
                    jsonWriter.value(sourceUserIdentifier);
                }
                if (mergeDeveloperIdentitiesRequest.getDestinationUserIdentifier() != null) {
                    String destinationUserIdentifier = mergeDeveloperIdentitiesRequest.getDestinationUserIdentifier();
                    jsonWriter.name("DestinationUserIdentifier");
                    jsonWriter.value(destinationUserIdentifier);
                }
                if (mergeDeveloperIdentitiesRequest.getDeveloperProviderName() != null) {
                    String developerProviderName = mergeDeveloperIdentitiesRequest.getDeveloperProviderName();
                    jsonWriter.name("DeveloperProviderName");
                    jsonWriter.value(developerProviderName);
                }
                if (mergeDeveloperIdentitiesRequest.getIdentityPoolId() != null) {
                    String identityPoolId = mergeDeveloperIdentitiesRequest.getIdentityPoolId();
                    jsonWriter.name("IdentityPoolId");
                    jsonWriter.value(identityPoolId);
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
            throw new AmazonClientException("Invalid argument passed to marshall(MergeDeveloperIdentitiesRequest)");
        }
    }
}
