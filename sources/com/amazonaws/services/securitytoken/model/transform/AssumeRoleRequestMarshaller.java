package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;
import com.amazonaws.services.securitytoken.model.Tag;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

public class AssumeRoleRequestMarshaller implements Marshaller<Request<AssumeRoleRequest>, AssumeRoleRequest> {
    public Request<AssumeRoleRequest> marshall(AssumeRoleRequest assumeRoleRequest) {
        if (assumeRoleRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(assumeRoleRequest, "AWSSecurityTokenService");
            defaultRequest.addParameter(JsonDocumentFields.ACTION, "AssumeRole");
            defaultRequest.addParameter(JsonDocumentFields.VERSION, "2011-06-15");
            if (assumeRoleRequest.getRoleArn() != null) {
                defaultRequest.addParameter("RoleArn", StringUtils.fromString(assumeRoleRequest.getRoleArn()));
            }
            if (assumeRoleRequest.getRoleSessionName() != null) {
                defaultRequest.addParameter("RoleSessionName", StringUtils.fromString(assumeRoleRequest.getRoleSessionName()));
            }
            int i = 1;
            if (assumeRoleRequest.getPolicyArns() != null) {
                int i2 = 1;
                for (PolicyDescriptorType next : assumeRoleRequest.getPolicyArns()) {
                    String f = C16759e.m42350f("PolicyArns", ".member.", i2);
                    if (next != null) {
                        PolicyDescriptorTypeStaxMarshaller.getInstance().marshall(next, defaultRequest, C25541a.m63881k(f, "."));
                    }
                    i2++;
                }
            }
            if (assumeRoleRequest.getPolicy() != null) {
                defaultRequest.addParameter("Policy", StringUtils.fromString(assumeRoleRequest.getPolicy()));
            }
            if (assumeRoleRequest.getDurationSeconds() != null) {
                defaultRequest.addParameter("DurationSeconds", StringUtils.fromInteger(assumeRoleRequest.getDurationSeconds()));
            }
            if (assumeRoleRequest.getTags() != null) {
                int i3 = 1;
                for (Tag next2 : assumeRoleRequest.getTags()) {
                    String f2 = C16759e.m42350f("Tags", ".member.", i3);
                    if (next2 != null) {
                        TagStaxMarshaller.getInstance().marshall(next2, defaultRequest, C25541a.m63881k(f2, "."));
                    }
                    i3++;
                }
            }
            if (assumeRoleRequest.getTransitiveTagKeys() != null) {
                for (String next3 : assumeRoleRequest.getTransitiveTagKeys()) {
                    String f3 = C16759e.m42350f("TransitiveTagKeys", ".member.", i);
                    if (next3 != null) {
                        defaultRequest.addParameter(f3, StringUtils.fromString(next3));
                    }
                    i++;
                }
            }
            if (assumeRoleRequest.getExternalId() != null) {
                defaultRequest.addParameter("ExternalId", StringUtils.fromString(assumeRoleRequest.getExternalId()));
            }
            if (assumeRoleRequest.getSerialNumber() != null) {
                defaultRequest.addParameter("SerialNumber", StringUtils.fromString(assumeRoleRequest.getSerialNumber()));
            }
            if (assumeRoleRequest.getTokenCode() != null) {
                defaultRequest.addParameter("TokenCode", StringUtils.fromString(assumeRoleRequest.getTokenCode()));
            }
            if (assumeRoleRequest.getSourceIdentity() != null) {
                defaultRequest.addParameter("SourceIdentity", StringUtils.fromString(assumeRoleRequest.getSourceIdentity()));
            }
            return defaultRequest;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(AssumeRoleRequest)");
    }
}
