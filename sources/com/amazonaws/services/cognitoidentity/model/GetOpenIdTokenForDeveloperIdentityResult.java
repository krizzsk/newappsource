package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class GetOpenIdTokenForDeveloperIdentityResult implements Serializable {
    private String identityId;
    private String token;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOpenIdTokenForDeveloperIdentityResult)) {
            return false;
        }
        GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentityResult = (GetOpenIdTokenForDeveloperIdentityResult) obj;
        if (getOpenIdTokenForDeveloperIdentityResult.getIdentityId() == null) {
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
        if (getOpenIdTokenForDeveloperIdentityResult.getIdentityId() != null && !getOpenIdTokenForDeveloperIdentityResult.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityResult.getToken() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getToken() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityResult.getToken() == null || getOpenIdTokenForDeveloperIdentityResult.getToken().equals(getToken())) {
            return true;
        }
        return false;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getToken() {
        return this.token;
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
        if (getToken() != null) {
            i2 = getToken().hashCode();
        }
        return i3 + i2;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityId: ");
            k2.append(getIdentityId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getToken() != null) {
            StringBuilder k3 = C13555b.m33972k("Token: ");
            k3.append(getToken());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetOpenIdTokenForDeveloperIdentityResult withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityResult withToken(String str) {
        this.token = str;
        return this;
    }
}
