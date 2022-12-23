package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

public class PolicyDescriptorType implements Serializable {
    private String arn;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PolicyDescriptorType)) {
            return false;
        }
        PolicyDescriptorType policyDescriptorType = (PolicyDescriptorType) obj;
        if (policyDescriptorType.getArn() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getArn() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (policyDescriptorType.getArn() == null || policyDescriptorType.getArn().equals(getArn())) {
            return true;
        }
        return false;
    }

    public String getArn() {
        return this.arn;
    }

    public int hashCode() {
        return 31 + (getArn() == null ? 0 : getArn().hashCode());
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getArn() != null) {
            StringBuilder k2 = C13555b.m33972k("arn: ");
            k2.append(getArn());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PolicyDescriptorType withArn(String str) {
        this.arn = str;
        return this;
    }
}
