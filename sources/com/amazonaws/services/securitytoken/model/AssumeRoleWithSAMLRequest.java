package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AssumeRoleWithSAMLRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer durationSeconds;
    private String policy;
    private List<PolicyDescriptorType> policyArns;
    private String principalArn;
    private String roleArn;
    private String sAMLAssertion;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithSAMLRequest)) {
            return false;
        }
        AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest = (AssumeRoleWithSAMLRequest) obj;
        if (assumeRoleWithSAMLRequest.getRoleArn() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getRoleArn() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getRoleArn() != null && !assumeRoleWithSAMLRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getPrincipalArn() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getPrincipalArn() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getPrincipalArn() != null && !assumeRoleWithSAMLRequest.getPrincipalArn().equals(getPrincipalArn())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getSAMLAssertion() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getSAMLAssertion() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getSAMLAssertion() != null && !assumeRoleWithSAMLRequest.getSAMLAssertion().equals(getSAMLAssertion())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getPolicyArns() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getPolicyArns() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getPolicyArns() != null && !assumeRoleWithSAMLRequest.getPolicyArns().equals(getPolicyArns())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getPolicy() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getPolicy() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getPolicy() != null && !assumeRoleWithSAMLRequest.getPolicy().equals(getPolicy())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getDurationSeconds() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getDurationSeconds() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.getDurationSeconds() == null || assumeRoleWithSAMLRequest.getDurationSeconds().equals(getDurationSeconds())) {
            return true;
        }
        return false;
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public String getPolicy() {
        return this.policy;
    }

    public List<PolicyDescriptorType> getPolicyArns() {
        return this.policyArns;
    }

    public String getPrincipalArn() {
        return this.principalArn;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getSAMLAssertion() {
        return this.sAMLAssertion;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (getRoleArn() == null) {
            i = 0;
        } else {
            i = getRoleArn().hashCode();
        }
        int i7 = (i + 31) * 31;
        if (getPrincipalArn() == null) {
            i2 = 0;
        } else {
            i2 = getPrincipalArn().hashCode();
        }
        int i8 = (i7 + i2) * 31;
        if (getSAMLAssertion() == null) {
            i3 = 0;
        } else {
            i3 = getSAMLAssertion().hashCode();
        }
        int i9 = (i8 + i3) * 31;
        if (getPolicyArns() == null) {
            i4 = 0;
        } else {
            i4 = getPolicyArns().hashCode();
        }
        int i11 = (i9 + i4) * 31;
        if (getPolicy() == null) {
            i5 = 0;
        } else {
            i5 = getPolicy().hashCode();
        }
        int i12 = (i11 + i5) * 31;
        if (getDurationSeconds() != null) {
            i6 = getDurationSeconds().hashCode();
        }
        return i12 + i6;
    }

    public void setDurationSeconds(Integer num) {
        this.durationSeconds = num;
    }

    public void setPolicy(String str) {
        this.policy = str;
    }

    public void setPolicyArns(Collection<PolicyDescriptorType> collection) {
        if (collection == null) {
            this.policyArns = null;
        } else {
            this.policyArns = new ArrayList(collection);
        }
    }

    public void setPrincipalArn(String str) {
        this.principalArn = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setSAMLAssertion(String str) {
        this.sAMLAssertion = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getRoleArn() != null) {
            StringBuilder k2 = C13555b.m33972k("RoleArn: ");
            k2.append(getRoleArn());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getPrincipalArn() != null) {
            StringBuilder k3 = C13555b.m33972k("PrincipalArn: ");
            k3.append(getPrincipalArn());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getSAMLAssertion() != null) {
            StringBuilder k4 = C13555b.m33972k("SAMLAssertion: ");
            k4.append(getSAMLAssertion());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getPolicyArns() != null) {
            StringBuilder k5 = C13555b.m33972k("PolicyArns: ");
            k5.append(getPolicyArns());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getPolicy() != null) {
            StringBuilder k6 = C13555b.m33972k("Policy: ");
            k6.append(getPolicy());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getDurationSeconds() != null) {
            StringBuilder k7 = C13555b.m33972k("DurationSeconds: ");
            k7.append(getDurationSeconds());
            k.append(k7.toString());
        }
        k.append("}");
        return k.toString();
    }

    public AssumeRoleWithSAMLRequest withDurationSeconds(Integer num) {
        this.durationSeconds = num;
        return this;
    }

    public AssumeRoleWithSAMLRequest withPolicy(String str) {
        this.policy = str;
        return this;
    }

    public AssumeRoleWithSAMLRequest withPolicyArns(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (getPolicyArns() == null) {
            this.policyArns = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType add : policyDescriptorTypeArr) {
            this.policyArns.add(add);
        }
        return this;
    }

    public AssumeRoleWithSAMLRequest withPrincipalArn(String str) {
        this.principalArn = str;
        return this;
    }

    public AssumeRoleWithSAMLRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public AssumeRoleWithSAMLRequest withSAMLAssertion(String str) {
        this.sAMLAssertion = str;
        return this;
    }

    public AssumeRoleWithSAMLRequest withPolicyArns(Collection<PolicyDescriptorType> collection) {
        setPolicyArns(collection);
        return this;
    }
}
