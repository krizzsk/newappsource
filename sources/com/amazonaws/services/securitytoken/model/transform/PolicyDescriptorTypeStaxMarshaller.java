package com.amazonaws.services.securitytoken.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.securitytoken.model.PolicyDescriptorType;
import com.amazonaws.util.StringUtils;

class PolicyDescriptorTypeStaxMarshaller {
    private static PolicyDescriptorTypeStaxMarshaller instance;

    public static PolicyDescriptorTypeStaxMarshaller getInstance() {
        if (instance == null) {
            instance = new PolicyDescriptorTypeStaxMarshaller();
        }
        return instance;
    }

    public void marshall(PolicyDescriptorType policyDescriptorType, Request<?> request, String str) {
        if (policyDescriptorType.getArn() != null) {
            request.addParameter(C25541a.m63881k(str, "arn"), StringUtils.fromString(policyDescriptorType.getArn()));
        }
    }
}
