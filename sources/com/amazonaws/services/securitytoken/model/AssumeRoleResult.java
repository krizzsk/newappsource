package com.amazonaws.services.securitytoken.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class AssumeRoleResult implements Serializable {
    private AssumedRoleUser assumedRoleUser;
    private Credentials credentials;
    private Integer packedPolicySize;
    private String sourceIdentity;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleResult)) {
            return false;
        }
        AssumeRoleResult assumeRoleResult = (AssumeRoleResult) obj;
        if (assumeRoleResult.getCredentials() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getCredentials() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (assumeRoleResult.getCredentials() != null && !assumeRoleResult.getCredentials().equals(getCredentials())) {
            return false;
        }
        if (assumeRoleResult.getAssumedRoleUser() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getAssumedRoleUser() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (assumeRoleResult.getAssumedRoleUser() != null && !assumeRoleResult.getAssumedRoleUser().equals(getAssumedRoleUser())) {
            return false;
        }
        if (assumeRoleResult.getPackedPolicySize() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getPackedPolicySize() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleResult.getPackedPolicySize() != null && !assumeRoleResult.getPackedPolicySize().equals(getPackedPolicySize())) {
            return false;
        }
        if (assumeRoleResult.getSourceIdentity() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getSourceIdentity() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleResult.getSourceIdentity() == null || assumeRoleResult.getSourceIdentity().equals(getSourceIdentity())) {
            return true;
        }
        return false;
    }

    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public Integer getPackedPolicySize() {
        return this.packedPolicySize;
    }

    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (getCredentials() == null) {
            i = 0;
        } else {
            i = getCredentials().hashCode();
        }
        int i5 = (i + 31) * 31;
        if (getAssumedRoleUser() == null) {
            i2 = 0;
        } else {
            i2 = getAssumedRoleUser().hashCode();
        }
        int i6 = (i5 + i2) * 31;
        if (getPackedPolicySize() == null) {
            i3 = 0;
        } else {
            i3 = getPackedPolicySize().hashCode();
        }
        int i7 = (i6 + i3) * 31;
        if (getSourceIdentity() != null) {
            i4 = getSourceIdentity().hashCode();
        }
        return i7 + i4;
    }

    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser2) {
        this.assumedRoleUser = assumedRoleUser2;
    }

    public void setCredentials(Credentials credentials2) {
        this.credentials = credentials2;
    }

    public void setPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
    }

    public void setSourceIdentity(String str) {
        this.sourceIdentity = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getCredentials() != null) {
            StringBuilder k2 = C13555b.m33972k("Credentials: ");
            k2.append(getCredentials());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getAssumedRoleUser() != null) {
            StringBuilder k3 = C13555b.m33972k("AssumedRoleUser: ");
            k3.append(getAssumedRoleUser());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getPackedPolicySize() != null) {
            StringBuilder k4 = C13555b.m33972k("PackedPolicySize: ");
            k4.append(getPackedPolicySize());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getSourceIdentity() != null) {
            StringBuilder k5 = C13555b.m33972k("SourceIdentity: ");
            k5.append(getSourceIdentity());
            k.append(k5.toString());
        }
        k.append("}");
        return k.toString();
    }

    public AssumeRoleResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser2) {
        this.assumedRoleUser = assumedRoleUser2;
        return this;
    }

    public AssumeRoleResult withCredentials(Credentials credentials2) {
        this.credentials = credentials2;
        return this;
    }

    public AssumeRoleResult withPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
        return this;
    }

    public AssumeRoleResult withSourceIdentity(String str) {
        this.sourceIdentity = str;
        return this;
    }
}
