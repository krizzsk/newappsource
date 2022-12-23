package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AssumeRoleRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer durationSeconds;
    private String externalId;
    private String policy;
    private List<PolicyDescriptorType> policyArns;
    private String roleArn;
    private String roleSessionName;
    private String serialNumber;
    private String sourceIdentity;
    private List<Tag> tags;
    private String tokenCode;
    private List<String> transitiveTagKeys;

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
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleRequest)) {
            return false;
        }
        AssumeRoleRequest assumeRoleRequest = (AssumeRoleRequest) obj;
        if (assumeRoleRequest.getRoleArn() == null) {
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
        if (assumeRoleRequest.getRoleArn() != null && !assumeRoleRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if (assumeRoleRequest.getRoleSessionName() == null) {
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
        if (assumeRoleRequest.getRoleSessionName() != null && !assumeRoleRequest.getRoleSessionName().equals(getRoleSessionName())) {
            return false;
        }
        if (assumeRoleRequest.getPolicyArns() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getPolicyArns() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleRequest.getPolicyArns() != null && !assumeRoleRequest.getPolicyArns().equals(getPolicyArns())) {
            return false;
        }
        if (assumeRoleRequest.getPolicy() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getPolicy() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleRequest.getPolicy() != null && !assumeRoleRequest.getPolicy().equals(getPolicy())) {
            return false;
        }
        if (assumeRoleRequest.getDurationSeconds() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getDurationSeconds() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (assumeRoleRequest.getDurationSeconds() != null && !assumeRoleRequest.getDurationSeconds().equals(getDurationSeconds())) {
            return false;
        }
        if (assumeRoleRequest.getTags() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getTags() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (assumeRoleRequest.getTags() != null && !assumeRoleRequest.getTags().equals(getTags())) {
            return false;
        }
        if (assumeRoleRequest.getTransitiveTagKeys() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (getTransitiveTagKeys() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if (assumeRoleRequest.getTransitiveTagKeys() != null && !assumeRoleRequest.getTransitiveTagKeys().equals(getTransitiveTagKeys())) {
            return false;
        }
        if (assumeRoleRequest.getExternalId() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (getExternalId() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z16 ^ z17) {
            return false;
        }
        if (assumeRoleRequest.getExternalId() != null && !assumeRoleRequest.getExternalId().equals(getExternalId())) {
            return false;
        }
        if (assumeRoleRequest.getSerialNumber() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (getSerialNumber() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z18 ^ z19) {
            return false;
        }
        if (assumeRoleRequest.getSerialNumber() != null && !assumeRoleRequest.getSerialNumber().equals(getSerialNumber())) {
            return false;
        }
        if (assumeRoleRequest.getTokenCode() == null) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (getTokenCode() == null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z21 ^ z22) {
            return false;
        }
        if (assumeRoleRequest.getTokenCode() != null && !assumeRoleRequest.getTokenCode().equals(getTokenCode())) {
            return false;
        }
        if (assumeRoleRequest.getSourceIdentity() == null) {
            z23 = true;
        } else {
            z23 = false;
        }
        if (getSourceIdentity() == null) {
            z24 = true;
        } else {
            z24 = false;
        }
        if (z23 ^ z24) {
            return false;
        }
        if (assumeRoleRequest.getSourceIdentity() == null || assumeRoleRequest.getSourceIdentity().equals(getSourceIdentity())) {
            return true;
        }
        return false;
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getPolicy() {
        return this.policy;
    }

    public List<PolicyDescriptorType> getPolicyArns() {
        return this.policyArns;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public String getTokenCode() {
        return this.tokenCode;
    }

    public List<String> getTransitiveTagKeys() {
        return this.transitiveTagKeys;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12 = 0;
        if (getRoleArn() == null) {
            i = 0;
        } else {
            i = getRoleArn().hashCode();
        }
        int i13 = (i + 31) * 31;
        if (getRoleSessionName() == null) {
            i2 = 0;
        } else {
            i2 = getRoleSessionName().hashCode();
        }
        int i14 = (i13 + i2) * 31;
        if (getPolicyArns() == null) {
            i3 = 0;
        } else {
            i3 = getPolicyArns().hashCode();
        }
        int i15 = (i14 + i3) * 31;
        if (getPolicy() == null) {
            i4 = 0;
        } else {
            i4 = getPolicy().hashCode();
        }
        int i16 = (i15 + i4) * 31;
        if (getDurationSeconds() == null) {
            i5 = 0;
        } else {
            i5 = getDurationSeconds().hashCode();
        }
        int i17 = (i16 + i5) * 31;
        if (getTags() == null) {
            i6 = 0;
        } else {
            i6 = getTags().hashCode();
        }
        int i18 = (i17 + i6) * 31;
        if (getTransitiveTagKeys() == null) {
            i7 = 0;
        } else {
            i7 = getTransitiveTagKeys().hashCode();
        }
        int i19 = (i18 + i7) * 31;
        if (getExternalId() == null) {
            i8 = 0;
        } else {
            i8 = getExternalId().hashCode();
        }
        int i21 = (i19 + i8) * 31;
        if (getSerialNumber() == null) {
            i9 = 0;
        } else {
            i9 = getSerialNumber().hashCode();
        }
        int i22 = (i21 + i9) * 31;
        if (getTokenCode() == null) {
            i11 = 0;
        } else {
            i11 = getTokenCode().hashCode();
        }
        int i23 = (i22 + i11) * 31;
        if (getSourceIdentity() != null) {
            i12 = getSourceIdentity().hashCode();
        }
        return i23 + i12;
    }

    public void setDurationSeconds(Integer num) {
        this.durationSeconds = num;
    }

    public void setExternalId(String str) {
        this.externalId = str;
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

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setRoleSessionName(String str) {
        this.roleSessionName = str;
    }

    public void setSerialNumber(String str) {
        this.serialNumber = str;
    }

    public void setSourceIdentity(String str) {
        this.sourceIdentity = str;
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public void setTokenCode(String str) {
        this.tokenCode = str;
    }

    public void setTransitiveTagKeys(Collection<String> collection) {
        if (collection == null) {
            this.transitiveTagKeys = null;
        } else {
            this.transitiveTagKeys = new ArrayList(collection);
        }
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
        if (getPolicyArns() != null) {
            StringBuilder k4 = C13555b.m33972k("PolicyArns: ");
            k4.append(getPolicyArns());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getPolicy() != null) {
            StringBuilder k5 = C13555b.m33972k("Policy: ");
            k5.append(getPolicy());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getDurationSeconds() != null) {
            StringBuilder k6 = C13555b.m33972k("DurationSeconds: ");
            k6.append(getDurationSeconds());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getTags() != null) {
            StringBuilder k7 = C13555b.m33972k("Tags: ");
            k7.append(getTags());
            k7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k7.toString());
        }
        if (getTransitiveTagKeys() != null) {
            StringBuilder k8 = C13555b.m33972k("TransitiveTagKeys: ");
            k8.append(getTransitiveTagKeys());
            k8.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k8.toString());
        }
        if (getExternalId() != null) {
            StringBuilder k9 = C13555b.m33972k("ExternalId: ");
            k9.append(getExternalId());
            k9.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k9.toString());
        }
        if (getSerialNumber() != null) {
            StringBuilder k11 = C13555b.m33972k("SerialNumber: ");
            k11.append(getSerialNumber());
            k11.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k11.toString());
        }
        if (getTokenCode() != null) {
            StringBuilder k12 = C13555b.m33972k("TokenCode: ");
            k12.append(getTokenCode());
            k12.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k12.toString());
        }
        if (getSourceIdentity() != null) {
            StringBuilder k13 = C13555b.m33972k("SourceIdentity: ");
            k13.append(getSourceIdentity());
            k.append(k13.toString());
        }
        k.append("}");
        return k.toString();
    }

    public AssumeRoleRequest withDurationSeconds(Integer num) {
        this.durationSeconds = num;
        return this;
    }

    public AssumeRoleRequest withExternalId(String str) {
        this.externalId = str;
        return this;
    }

    public AssumeRoleRequest withPolicy(String str) {
        this.policy = str;
        return this;
    }

    public AssumeRoleRequest withPolicyArns(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (getPolicyArns() == null) {
            this.policyArns = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType add : policyDescriptorTypeArr) {
            this.policyArns.add(add);
        }
        return this;
    }

    public AssumeRoleRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public AssumeRoleRequest withRoleSessionName(String str) {
        this.roleSessionName = str;
        return this;
    }

    public AssumeRoleRequest withSerialNumber(String str) {
        this.serialNumber = str;
        return this;
    }

    public AssumeRoleRequest withSourceIdentity(String str) {
        this.sourceIdentity = str;
        return this;
    }

    public AssumeRoleRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag add : tagArr) {
            this.tags.add(add);
        }
        return this;
    }

    public AssumeRoleRequest withTokenCode(String str) {
        this.tokenCode = str;
        return this;
    }

    public AssumeRoleRequest withTransitiveTagKeys(String... strArr) {
        if (getTransitiveTagKeys() == null) {
            this.transitiveTagKeys = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.transitiveTagKeys.add(add);
        }
        return this;
    }

    public AssumeRoleRequest withPolicyArns(Collection<PolicyDescriptorType> collection) {
        setPolicyArns(collection);
        return this;
    }

    public AssumeRoleRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }

    public AssumeRoleRequest withTransitiveTagKeys(Collection<String> collection) {
        setTransitiveTagKeys(collection);
        return this;
    }
}
