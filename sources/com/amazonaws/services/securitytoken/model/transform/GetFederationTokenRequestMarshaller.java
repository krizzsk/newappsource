package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.securitytoken.model.GetFederationTokenRequest;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;
import com.amazonaws.services.securitytoken.model.Tag;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

public class GetFederationTokenRequestMarshaller implements Marshaller<Request<GetFederationTokenRequest>, GetFederationTokenRequest> {
    public Request<GetFederationTokenRequest> marshall(GetFederationTokenRequest getFederationTokenRequest) {
        if (getFederationTokenRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(getFederationTokenRequest, "AWSSecurityTokenService");
            defaultRequest.addParameter(JsonDocumentFields.ACTION, "GetFederationToken");
            defaultRequest.addParameter(JsonDocumentFields.VERSION, "2011-06-15");
            if (getFederationTokenRequest.getName() != null) {
                defaultRequest.addParameter("Name", StringUtils.fromString(getFederationTokenRequest.getName()));
            }
            if (getFederationTokenRequest.getPolicy() != null) {
                defaultRequest.addParameter("Policy", StringUtils.fromString(getFederationTokenRequest.getPolicy()));
            }
            int i = 1;
            if (getFederationTokenRequest.getPolicyArns() != null) {
                int i2 = 1;
                for (PolicyDescriptorType next : getFederationTokenRequest.getPolicyArns()) {
                    String f = C16759e.m42350f("PolicyArns", ".member.", i2);
                    if (next != null) {
                        PolicyDescriptorTypeStaxMarshaller.getInstance().marshall(next, defaultRequest, C25541a.m63881k(f, "."));
                    }
                    i2++;
                }
            }
            if (getFederationTokenRequest.getDurationSeconds() != null) {
                defaultRequest.addParameter("DurationSeconds", StringUtils.fromInteger(getFederationTokenRequest.getDurationSeconds()));
            }
            if (getFederationTokenRequest.getTags() != null) {
                for (Tag next2 : getFederationTokenRequest.getTags()) {
                    String f2 = C16759e.m42350f("Tags", ".member.", i);
                    if (next2 != null) {
                        TagStaxMarshaller.getInstance().marshall(next2, defaultRequest, C25541a.m63881k(f2, "."));
                    }
                    i++;
                }
            }
            return defaultRequest;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(GetFederationTokenRequest)");
    }
}
