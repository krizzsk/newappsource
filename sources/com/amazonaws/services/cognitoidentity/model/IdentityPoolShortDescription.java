package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class IdentityPoolShortDescription implements Serializable {
    private String identityPoolId;
    private String identityPoolName;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IdentityPoolShortDescription)) {
            return false;
        }
        IdentityPoolShortDescription identityPoolShortDescription = (IdentityPoolShortDescription) obj;
        if (identityPoolShortDescription.getIdentityPoolId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityPoolId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (identityPoolShortDescription.getIdentityPoolId() != null && !identityPoolShortDescription.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (identityPoolShortDescription.getIdentityPoolName() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getIdentityPoolName() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (identityPoolShortDescription.getIdentityPoolName() == null || identityPoolShortDescription.getIdentityPoolName().equals(getIdentityPoolName())) {
            return true;
        }
        return false;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getIdentityPoolName() {
        return this.identityPoolName;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getIdentityPoolId() == null) {
            i = 0;
        } else {
            i = getIdentityPoolId().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getIdentityPoolName() != null) {
            i2 = getIdentityPoolName().hashCode();
        }
        return i3 + i2;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setIdentityPoolName(String str) {
        this.identityPoolName = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityPoolId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityPoolId: ");
            k2.append(getIdentityPoolId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getIdentityPoolName() != null) {
            StringBuilder k3 = C13555b.m33972k("IdentityPoolName: ");
            k3.append(getIdentityPoolName());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public IdentityPoolShortDescription withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public IdentityPoolShortDescription withIdentityPoolName(String str) {
        this.identityPoolName = str;
        return this;
    }
}
