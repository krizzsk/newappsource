package com.amazonaws.services.securitytoken.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class AssumeRoleWithWebIdentityResult implements Serializable {
    private AssumedRoleUser assumedRoleUser;
    private String audience;
    private Credentials credentials;
    private Integer packedPolicySize;
    private String provider;
    private String sourceIdentity;
    private String subjectFromWebIdentityToken;

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
        if (obj == null || !(obj instanceof AssumeRoleWithWebIdentityResult)) {
            return false;
        }
        AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentityResult = (AssumeRoleWithWebIdentityResult) obj;
        if (assumeRoleWithWebIdentityResult.getCredentials() == null) {
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
        if (assumeRoleWithWebIdentityResult.getCredentials() != null && !assumeRoleWithWebIdentityResult.getCredentials().equals(getCredentials())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getSubjectFromWebIdentityToken() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getSubjectFromWebIdentityToken() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getSubjectFromWebIdentityToken() != null && !assumeRoleWithWebIdentityResult.getSubjectFromWebIdentityToken().equals(getSubjectFromWebIdentityToken())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getAssumedRoleUser() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getAssumedRoleUser() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getAssumedRoleUser() != null && !assumeRoleWithWebIdentityResult.getAssumedRoleUser().equals(getAssumedRoleUser())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getPackedPolicySize() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getPackedPolicySize() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getPackedPolicySize() != null && !assumeRoleWithWebIdentityResult.getPackedPolicySize().equals(getPackedPolicySize())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getProvider() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getProvider() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getProvider() != null && !assumeRoleWithWebIdentityResult.getProvider().equals(getProvider())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getAudience() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getAudience() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getAudience() != null && !assumeRoleWithWebIdentityResult.getAudience().equals(getAudience())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getSourceIdentity() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (getSourceIdentity() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.getSourceIdentity() == null || assumeRoleWithWebIdentityResult.getSourceIdentity().equals(getSourceIdentity())) {
            return true;
        }
        return false;
    }

    public AssumedRoleUser getAssumedRoleUser() {
        return this.assumedRoleUser;
    }

    public String getAudience() {
        return this.audience;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public Integer getPackedPolicySize() {
        return this.packedPolicySize;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

    public String getSubjectFromWebIdentityToken() {
        return this.subjectFromWebIdentityToken;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (getCredentials() == null) {
            i = 0;
        } else {
            i = getCredentials().hashCode();
        }
        int i8 = (i + 31) * 31;
        if (getSubjectFromWebIdentityToken() == null) {
            i2 = 0;
        } else {
            i2 = getSubjectFromWebIdentityToken().hashCode();
        }
        int i9 = (i8 + i2) * 31;
        if (getAssumedRoleUser() == null) {
            i3 = 0;
        } else {
            i3 = getAssumedRoleUser().hashCode();
        }
        int i11 = (i9 + i3) * 31;
        if (getPackedPolicySize() == null) {
            i4 = 0;
        } else {
            i4 = getPackedPolicySize().hashCode();
        }
        int i12 = (i11 + i4) * 31;
        if (getProvider() == null) {
            i5 = 0;
        } else {
            i5 = getProvider().hashCode();
        }
        int i13 = (i12 + i5) * 31;
        if (getAudience() == null) {
            i6 = 0;
        } else {
            i6 = getAudience().hashCode();
        }
        int i14 = (i13 + i6) * 31;
        if (getSourceIdentity() != null) {
            i7 = getSourceIdentity().hashCode();
        }
        return i14 + i7;
    }

    public void setAssumedRoleUser(AssumedRoleUser assumedRoleUser2) {
        this.assumedRoleUser = assumedRoleUser2;
    }

    public void setAudience(String str) {
        this.audience = str;
    }

    public void setCredentials(Credentials credentials2) {
        this.credentials = credentials2;
    }

    public void setPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSourceIdentity(String str) {
        this.sourceIdentity = str;
    }

    public void setSubjectFromWebIdentityToken(String str) {
        this.subjectFromWebIdentityToken = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getCredentials() != null) {
            StringBuilder k2 = C13555b.m33972k("Credentials: ");
            k2.append(getCredentials());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getSubjectFromWebIdentityToken() != null) {
            StringBuilder k3 = C13555b.m33972k("SubjectFromWebIdentityToken: ");
            k3.append(getSubjectFromWebIdentityToken());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getAssumedRoleUser() != null) {
            StringBuilder k4 = C13555b.m33972k("AssumedRoleUser: ");
            k4.append(getAssumedRoleUser());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getPackedPolicySize() != null) {
            StringBuilder k5 = C13555b.m33972k("PackedPolicySize: ");
            k5.append(getPackedPolicySize());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getProvider() != null) {
            StringBuilder k6 = C13555b.m33972k("Provider: ");
            k6.append(getProvider());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getAudience() != null) {
            StringBuilder k7 = C13555b.m33972k("Audience: ");
            k7.append(getAudience());
            k7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k7.toString());
        }
        if (getSourceIdentity() != null) {
            StringBuilder k8 = C13555b.m33972k("SourceIdentity: ");
            k8.append(getSourceIdentity());
            k.append(k8.toString());
        }
        k.append("}");
        return k.toString();
    }

    public AssumeRoleWithWebIdentityResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser2) {
        this.assumedRoleUser = assumedRoleUser2;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withAudience(String str) {
        this.audience = str;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withCredentials(Credentials credentials2) {
        this.credentials = credentials2;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withProvider(String str) {
        this.provider = str;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withSourceIdentity(String str) {
        this.sourceIdentity = str;
        return this;
    }

    public AssumeRoleWithWebIdentityResult withSubjectFromWebIdentityToken(String str) {
        this.subjectFromWebIdentityToken = str;
        return this;
    }
}
