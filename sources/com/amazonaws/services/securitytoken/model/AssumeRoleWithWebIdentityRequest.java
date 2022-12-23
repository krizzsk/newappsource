package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AssumeRoleWithWebIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer durationSeconds;
    private String policy;
    private List<PolicyDescriptorType> policyArns;
    private String providerId;
    private String roleArn;
    private String roleSessionName;
    private String webIdentityToken;

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
        boolean z14;
        boolean z15;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithWebIdentityRequest)) {
            return false;
        }
        AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest = (AssumeRoleWithWebIdentityRequest) obj;
        if (assumeRoleWithWebIdentityRequest.getRoleArn() == null) {
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
        if (assumeRoleWithWebIdentityRequest.getRoleArn() != null && !assumeRoleWithWebIdentityRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getRoleSessionName() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getRoleSessionName() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getRoleSessionName() != null && !assumeRoleWithWebIdentityRequest.getRoleSessionName().equals(getRoleSessionName())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getWebIdentityToken() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getWebIdentityToken() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getWebIdentityToken() != null && !assumeRoleWithWebIdentityRequest.getWebIdentityToken().equals(getWebIdentityToken())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getProviderId() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getProviderId() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getProviderId() != null && !assumeRoleWithWebIdentityRequest.getProviderId().equals(getProviderId())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getPolicyArns() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getPolicyArns() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getPolicyArns() != null && !assumeRoleWithWebIdentityRequest.getPolicyArns().equals(getPolicyArns())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getPolicy() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getPolicy() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getPolicy() != null && !assumeRoleWithWebIdentityRequest.getPolicy().equals(getPolicy())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getDurationSeconds() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (getDurationSeconds() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getDurationSeconds() == null || assumeRoleWithWebIdentityRequest.getDurationSeconds().equals(getDurationSeconds())) {
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

    public String getProviderId() {
        return this.providerId;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public String getWebIdentityToken() {
        return this.webIdentityToken;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (getRoleArn() == null) {
            i = 0;
        } else {
            i = getRoleArn().hashCode();
        }
        int i8 = (i + 31) * 31;
        if (getRoleSessionName() == null) {
            i2 = 0;
        } else {
            i2 = getRoleSessionName().hashCode();
        }
        int i9 = (i8 + i2) * 31;
        if (getWebIdentityToken() == null) {
            i3 = 0;
        } else {
            i3 = getWebIdentityToken().hashCode();
        }
        int i11 = (i9 + i3) * 31;
        if (getProviderId() == null) {
            i4 = 0;
        } else {
            i4 = getProviderId().hashCode();
        }
        int i12 = (i11 + i4) * 31;
        if (getPolicyArns() == null) {
            i5 = 0;
        } else {
            i5 = getPolicyArns().hashCode();
        }
        int i13 = (i12 + i5) * 31;
        if (getPolicy() == null) {
            i6 = 0;
        } else {
            i6 = getPolicy().hashCode();
        }
        int i14 = (i13 + i6) * 31;
        if (getDurationSeconds() != null) {
            i7 = getDurationSeconds().hashCode();
        }
        return i14 + i7;
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

    public void setProviderId(String str) {
        this.providerId = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setRoleSessionName(String str) {
        this.roleSessionName = str;
    }

    public void setWebIdentityToken(String str) {
        this.webIdentityToken = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getRoleArn() != null) {
            StringBuilder k2 = C13555b.m33972k("RoleArn: ");
            k2.append(getRoleArn());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getRoleSessionName() != null) {
            StringBuilder k3 = C13555b.m33972k("RoleSessionName: ");
            k3.append(getRoleSessionName());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getWebIdentityToken() != null) {
            StringBuilder k4 = C13555b.m33972k("WebIdentityToken: ");
            k4.append(getWebIdentityToken());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getProviderId() != null) {
            StringBuilder k5 = C13555b.m33972k("ProviderId: ");
            k5.append(getProviderId());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getPolicyArns() != null) {
            StringBuilder k6 = C13555b.m33972k("PolicyArns: ");
            k6.append(getPolicyArns());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getPolicy() != null) {
            StringBuilder k7 = C13555b.m33972k("Policy: ");
            k7.append(getPolicy());
            k7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k7.toString());
        }
        if (getDurationSeconds() != null) {
            StringBuilder k8 = C13555b.m33972k("DurationSeconds: ");
            k8.append(getDurationSeconds());
            k.append(k8.toString());
        }
        k.append("}");
        return k.toString();
    }

    public AssumeRoleWithWebIdentityRequest withDurationSeconds(Integer num) {
        this.durationSeconds = num;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withPolicy(String str) {
        this.policy = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withPolicyArns(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (getPolicyArns() == null) {
            this.policyArns = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType add : policyDescriptorTypeArr) {
            this.policyArns.add(add);
        }
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withProviderId(String str) {
        this.providerId = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withRoleSessionName(String str) {
        this.roleSessionName = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withWebIdentityToken(String str) {
        this.webIdentityToken = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withPolicyArns(Collection<PolicyDescriptorType> collection) {
        setPolicyArns(collection);
        return this;
    }
}
