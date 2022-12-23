package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class GetCredentialsForIdentityResult implements Serializable {
    private Credentials credentials;
    private String identityId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCredentialsForIdentityResult)) {
            return false;
        }
        GetCredentialsForIdentityResult getCredentialsForIdentityResult = (GetCredentialsForIdentityResult) obj;
        if (getCredentialsForIdentityResult.getIdentityId() == null) {
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
        if (getCredentialsForIdentityResult.getIdentityId() != null && !getCredentialsForIdentityResult.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if (getCredentialsForIdentityResult.getCredentials() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCredentials() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getCredentialsForIdentityResult.getCredentials() == null || getCredentialsForIdentityResult.getCredentials().equals(getCredentials())) {
            return true;
        }
        return false;
    }

    public Credentials getCredentials() {
        return this.credentials;
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
        if (getCredentials() != null) {
            i2 = getCredentials().hashCode();
        }
        return i3 + i2;
    }

    public void setCredentials(Credentials credentials2) {
        this.credentials = credentials2;
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
        if (getCredentials() != null) {
            StringBuilder k3 = C13555b.m33972k("Credentials: ");
            k3.append(getCredentials());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetCredentialsForIdentityResult withCredentials(Credentials credentials2) {
        this.credentials = credentials2;
        return this;
    }

    public GetCredentialsForIdentityResult withIdentityId(String str) {
        this.identityId = str;
        return this;
    }
}
