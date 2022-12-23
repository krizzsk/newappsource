package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

public class AssumeRoleWithSAMLRequestMarshaller implements Marshaller<Request<AssumeRoleWithSAMLRequest>, AssumeRoleWithSAMLRequest> {
    public Request<AssumeRoleWithSAMLRequest> marshall(AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest) {
        if (assumeRoleWithSAMLRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(assumeRoleWithSAMLRequest, "AWSSecurityTokenService");
            defaultRequest.addParameter(JsonDocumentFields.ACTION, "AssumeRoleWithSAML");
            defaultRequest.addParameter(JsonDocumentFields.VERSION, "2011-06-15");
            if (assumeRoleWithSAMLRequest.getRoleArn() != null) {
                defaultRequest.addParameter("RoleArn", StringUtils.fromString(assumeRoleWithSAMLRequest.getRoleArn()));
            }
            if (assumeRoleWithSAMLRequest.getPrincipalArn() != null) {
                defaultRequest.addParameter("PrincipalArn", StringUtils.fromString(assumeRoleWithSAMLRequest.getPrincipalArn()));
            }
            if (assumeRoleWithSAMLRequest.getSAMLAssertion() != null) {
                defaultRequest.addParameter("SAMLAssertion", StringUtils.fromString(assumeRoleWithSAMLRequest.getSAMLAssertion()));
            }
            if (assumeRoleWithSAMLRequest.getPolicyArns() != null) {
                int i = 1;
                for (PolicyDescriptorType next : assumeRoleWithSAMLRequest.getPolicyArns()) {
                    String f = C16759e.m42350f("PolicyArns", ".member.", i);
                    if (next != null) {
                        PolicyDescriptorTypeStaxMarshaller.getInstance().marshall(next, defaultRequest, C25541a.m63881k(f, "."));
                    }
                    i++;
                }
            }
            if (assumeRoleWithSAMLRequest.getPolicy() != null) {
                defaultRequest.addParameter("Policy", StringUtils.fromString(assumeRoleWithSAMLRequest.getPolicy()));
            }
            if (assumeRoleWithSAMLRequest.getDurationSeconds() != null) {
                defaultRequest.addParameter("DurationSeconds", StringUtils.fromInteger(assumeRoleWithSAMLRequest.getDurationSeconds()));
            }
            return defaultRequest;
        }
        throw new AmazonClientException("Invalid argument passed to marshall(AssumeRoleWithSAMLRequest)");
    }
}
