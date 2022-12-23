package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

public class DescribeIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    private String identityId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeIdentityRequest)) {
            return false;
        }
        DescribeIdentityRequest describeIdentityRequest = (DescribeIdentityRequest) obj;
        if (describeIdentityRequest.getIdentityId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (describeIdentityRequest.getIdentityId() == null || describeIdentityRequest.getIdentityId().equals(getIdentityId())) {
            return true;
        }
        return false;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public int hashCode() {
        return 31 + (getIdentityId() == null ? 0 : getIdentityId().hashCode());
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityId: ");
            k2.append(getIdentityId());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DescribeIdentityRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }
}
