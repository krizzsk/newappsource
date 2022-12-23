package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class UnprocessedIdentityId implements Serializable {
    private String errorCode;
    private String identityId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnprocessedIdentityId)) {
            return false;
        }
        UnprocessedIdentityId unprocessedIdentityId = (UnprocessedIdentityId) obj;
        if (unprocessedIdentityId.getIdentityId() == null) {
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
        if (unprocessedIdentityId.getIdentityId() != null && !unprocessedIdentityId.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if (unprocessedIdentityId.getErrorCode() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getErrorCode() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (unprocessedIdentityId.getErrorCode() == null || unprocessedIdentityId.getErrorCode().equals(getErrorCode())) {
            return true;
        }
        return false;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getIdentityId() == null) {
            i = 0;
        } else {
            i = getIdentityId().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getErrorCode() != null) {
            i2 = getErrorCode().hashCode();
        }
        return i3 + i2;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityId: ");
            k2.append(getIdentityId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getErrorCode() != null) {
            StringBuilder k3 = C13555b.m33972k("ErrorCode: ");
            k3.append(getErrorCode());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public UnprocessedIdentityId withErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public UnprocessedIdentityId withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public void setErrorCode(ErrorCode errorCode2) {
        this.errorCode = errorCode2.toString();
    }

    public UnprocessedIdentityId withErrorCode(ErrorCode errorCode2) {
        this.errorCode = errorCode2.toString();
        return this;
    }
}
