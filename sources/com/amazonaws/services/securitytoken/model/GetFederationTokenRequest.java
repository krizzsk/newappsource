package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GetFederationTokenRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer durationSeconds;
    private String name;
    private String policy;
    private List<PolicyDescriptorType> policyArns;
    private List<Tag> tags;

    public GetFederationTokenRequest() {
    }

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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetFederationTokenRequest)) {
            return false;
        }
        GetFederationTokenRequest getFederationTokenRequest = (GetFederationTokenRequest) obj;
        if (getFederationTokenRequest.getName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (getFederationTokenRequest.getName() != null && !getFederationTokenRequest.getName().equals(getName())) {
            return false;
        }
        if (getFederationTokenRequest.getPolicy() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getPolicy() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getFederationTokenRequest.getPolicy() != null && !getFederationTokenRequest.getPolicy().equals(getPolicy())) {
            return false;
        }
        if (getFederationTokenRequest.getPolicyArns() == null) {
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
        if (getFederationTokenRequest.getPolicyArns() != null && !getFederationTokenRequest.getPolicyArns().equals(getPolicyArns())) {
            return false;
        }
        if (getFederationTokenRequest.getDurationSeconds() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getDurationSeconds() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (getFederationTokenRequest.getDurationSeconds() != null && !getFederationTokenRequest.getDurationSeconds().equals(getDurationSeconds())) {
            return false;
        }
        if (getFederationTokenRequest.getTags() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getTags() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (getFederationTokenRequest.getTags() == null || getFederationTokenRequest.getTags().equals(getTags())) {
            return true;
        }
        return false;
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public String getName() {
        return this.name;
    }

    public String getPolicy() {
        return this.policy;
    }

    public List<PolicyDescriptorType> getPolicyArns() {
        return this.policyArns;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (getName() == null) {
            i = 0;
        } else {
            i = getName().hashCode();
        }
        int i6 = (i + 31) * 31;
        if (getPolicy() == null) {
            i2 = 0;
        } else {
            i2 = getPolicy().hashCode();
        }
        int i7 = (i6 + i2) * 31;
        if (getPolicyArns() == null) {
            i3 = 0;
        } else {
            i3 = getPolicyArns().hashCode();
        }
        int i8 = (i7 + i3) * 31;
        if (getDurationSeconds() == null) {
            i4 = 0;
        } else {
            i4 = getDurationSeconds().hashCode();
        }
        int i9 = (i8 + i4) * 31;
        if (getTags() != null) {
            i5 = getTags().hashCode();
        }
        return i9 + i5;
    }

    public void setDurationSeconds(Integer num) {
        this.durationSeconds = num;
    }

    public void setName(String str) {
        this.name = str;
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

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getName() != null) {
            StringBuilder k2 = C13555b.m33972k("Name: ");
            k2.append(getName());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getPolicy() != null) {
            StringBuilder k3 = C13555b.m33972k("Policy: ");
            k3.append(getPolicy());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getPolicyArns() != null) {
            StringBuilder k4 = C13555b.m33972k("PolicyArns: ");
            k4.append(getPolicyArns());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getDurationSeconds() != null) {
            StringBuilder k5 = C13555b.m33972k("DurationSeconds: ");
            k5.append(getDurationSeconds());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getTags() != null) {
            StringBuilder k6 = C13555b.m33972k("Tags: ");
            k6.append(getTags());
            k.append(k6.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetFederationTokenRequest withDurationSeconds(Integer num) {
        this.durationSeconds = num;
        return this;
    }

    public GetFederationTokenRequest withName(String str) {
        this.name = str;
        return this;
    }

    public GetFederationTokenRequest withPolicy(String str) {
        this.policy = str;
        return this;
    }

    public GetFederationTokenRequest withPolicyArns(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (getPolicyArns() == null) {
            this.policyArns = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType add : policyDescriptorTypeArr) {
            this.policyArns.add(add);
        }
        return this;
    }

    public GetFederationTokenRequest withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag add : tagArr) {
            this.tags.add(add);
        }
        return this;
    }

    public GetFederationTokenRequest(String str) {
        setName(str);
    }

    public GetFederationTokenRequest withPolicyArns(Collection<PolicyDescriptorType> collection) {
        setPolicyArns(collection);
        return this;
    }

    public GetFederationTokenRequest withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
