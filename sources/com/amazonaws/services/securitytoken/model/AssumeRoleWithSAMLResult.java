package com.amazonaws.services.securitytoken.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class AssumeRoleWithSAMLResult implements Serializable {
    private AssumedRoleUser assumedRoleUser;
    private String audience;
    private Credentials credentials;
    private String issuer;
    private String nameQualifier;
    private Integer packedPolicySize;
    private String sourceIdentity;
    private String subject;
    private String subjectType;

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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithSAMLResult)) {
            return false;
        }
        AssumeRoleWithSAMLResult assumeRoleWithSAMLResult = (AssumeRoleWithSAMLResult) obj;
        if (assumeRoleWithSAMLResult.getCredentials() == null) {
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
        if (assumeRoleWithSAMLResult.getCredentials() != null && !assumeRoleWithSAMLResult.getCredentials().equals(getCredentials())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getAssumedRoleUser() == null) {
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
        if (assumeRoleWithSAMLResult.getAssumedRoleUser() != null && !assumeRoleWithSAMLResult.getAssumedRoleUser().equals(getAssumedRoleUser())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getPackedPolicySize() == null) {
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
        if (assumeRoleWithSAMLResult.getPackedPolicySize() != null && !assumeRoleWithSAMLResult.getPackedPolicySize().equals(getPackedPolicySize())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getSubject() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getSubject() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getSubject() != null && !assumeRoleWithSAMLResult.getSubject().equals(getSubject())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getSubjectType() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getSubjectType() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getSubjectType() != null && !assumeRoleWithSAMLResult.getSubjectType().equals(getSubjectType())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getIssuer() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (getIssuer() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getIssuer() != null && !assumeRoleWithSAMLResult.getIssuer().equals(getIssuer())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getAudience() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (getAudience() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getAudience() != null && !assumeRoleWithSAMLResult.getAudience().equals(getAudience())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getNameQualifier() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (getNameQualifier() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z16 ^ z17) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getNameQualifier() != null && !assumeRoleWithSAMLResult.getNameQualifier().equals(getNameQualifier())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getSourceIdentity() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (getSourceIdentity() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z18 ^ z19) {
            return false;
        }
        if (assumeRoleWithSAMLResult.getSourceIdentity() == null || assumeRoleWithSAMLResult.getSourceIdentity().equals(getSourceIdentity())) {
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

    public String getIssuer() {
        return this.issuer;
    }

    public String getNameQualifier() {
        return this.nameQualifier;
    }

    public Integer getPackedPolicySize() {
        return this.packedPolicySize;
    }

    public String getSourceIdentity() {
        return this.sourceIdentity;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getSubjectType() {
        return this.subjectType;
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
        int i9 = 0;
        if (getCredentials() == null) {
            i = 0;
        } else {
            i = getCredentials().hashCode();
        }
        int i11 = (i + 31) * 31;
        if (getAssumedRoleUser() == null) {
            i2 = 0;
        } else {
            i2 = getAssumedRoleUser().hashCode();
        }
        int i12 = (i11 + i2) * 31;
        if (getPackedPolicySize() == null) {
            i3 = 0;
        } else {
            i3 = getPackedPolicySize().hashCode();
        }
        int i13 = (i12 + i3) * 31;
        if (getSubject() == null) {
            i4 = 0;
        } else {
            i4 = getSubject().hashCode();
        }
        int i14 = (i13 + i4) * 31;
        if (getSubjectType() == null) {
            i5 = 0;
        } else {
            i5 = getSubjectType().hashCode();
        }
        int i15 = (i14 + i5) * 31;
        if (getIssuer() == null) {
            i6 = 0;
        } else {
            i6 = getIssuer().hashCode();
        }
        int i16 = (i15 + i6) * 31;
        if (getAudience() == null) {
            i7 = 0;
        } else {
            i7 = getAudience().hashCode();
        }
        int i17 = (i16 + i7) * 31;
        if (getNameQualifier() == null) {
            i8 = 0;
        } else {
            i8 = getNameQualifier().hashCode();
        }
        int i18 = (i17 + i8) * 31;
        if (getSourceIdentity() != null) {
            i9 = getSourceIdentity().hashCode();
        }
        return i18 + i9;
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

    public void setIssuer(String str) {
        this.issuer = str;
    }

    public void setNameQualifier(String str) {
        this.nameQualifier = str;
    }

    public void setPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
    }

    public void setSourceIdentity(String str) {
        this.sourceIdentity = str;
    }

    public void setSubject(String str) {
        this.subject = str;
    }

    public void setSubjectType(String str) {
        this.subjectType = str;
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
        if (getSubject() != null) {
            StringBuilder k5 = C13555b.m33972k("Subject: ");
            k5.append(getSubject());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getSubjectType() != null) {
            StringBuilder k6 = C13555b.m33972k("SubjectType: ");
            k6.append(getSubjectType());
            k6.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k6.toString());
        }
        if (getIssuer() != null) {
            StringBuilder k7 = C13555b.m33972k("Issuer: ");
            k7.append(getIssuer());
            k7.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k7.toString());
        }
        if (getAudience() != null) {
            StringBuilder k8 = C13555b.m33972k("Audience: ");
            k8.append(getAudience());
            k8.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k8.toString());
        }
        if (getNameQualifier() != null) {
            StringBuilder k9 = C13555b.m33972k("NameQualifier: ");
            k9.append(getNameQualifier());
            k9.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k9.toString());
        }
        if (getSourceIdentity() != null) {
            StringBuilder k11 = C13555b.m33972k("SourceIdentity: ");
            k11.append(getSourceIdentity());
            k.append(k11.toString());
        }
        k.append("}");
        return k.toString();
    }

    public AssumeRoleWithSAMLResult withAssumedRoleUser(AssumedRoleUser assumedRoleUser2) {
        this.assumedRoleUser = assumedRoleUser2;
        return this;
    }

    public AssumeRoleWithSAMLResult withAudience(String str) {
        this.audience = str;
        return this;
    }

    public AssumeRoleWithSAMLResult withCredentials(Credentials credentials2) {
        this.credentials = credentials2;
        return this;
    }

    public AssumeRoleWithSAMLResult withIssuer(String str) {
        this.issuer = str;
        return this;
    }

    public AssumeRoleWithSAMLResult withNameQualifier(String str) {
        this.nameQualifier = str;
        return this;
    }

    public AssumeRoleWithSAMLResult withPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
        return this;
    }

    public AssumeRoleWithSAMLResult withSourceIdentity(String str) {
        this.sourceIdentity = str;
        return this;
    }

    public AssumeRoleWithSAMLResult withSubject(String str) {
        this.subject = str;
        return this;
    }

    public AssumeRoleWithSAMLResult withSubjectType(String str) {
        this.subjectType = str;
        return this;
    }
}
