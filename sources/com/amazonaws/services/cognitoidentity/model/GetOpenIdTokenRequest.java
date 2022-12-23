package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GetOpenIdTokenRequest extends AmazonWebServiceRequest implements Serializable {
    private String identityId;
    private Map<String, String> logins;

    public GetOpenIdTokenRequest addLoginsEntry(String str, String str2) {
        if (this.logins == null) {
            this.logins = new HashMap();
        }
        if (!this.logins.containsKey(str)) {
            this.logins.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public GetOpenIdTokenRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOpenIdTokenRequest)) {
            return false;
        }
        GetOpenIdTokenRequest getOpenIdTokenRequest = (GetOpenIdTokenRequest) obj;
        if (getOpenIdTokenRequest.getIdentityId() == null) {
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
        if (getOpenIdTokenRequest.getIdentityId() != null && !getOpenIdTokenRequest.getIdentityId().equals(getIdentityId())) {
            return false;
        }
        if (getOpenIdTokenRequest.getLogins() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getLogins() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getOpenIdTokenRequest.getLogins() == null || getOpenIdTokenRequest.getLogins().equals(getLogins())) {
            return true;
        }
        return false;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public Map<String, String> getLogins() {
        return this.logins;
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
        if (getLogins() != null) {
            i2 = getLogins().hashCode();
        }
        return i3 + i2;
    }

    public void setIdentityId(String str) {
        this.identityId = str;
    }

    public void setLogins(Map<String, String> map) {
        this.logins = map;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityId: ");
            k2.append(getIdentityId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getLogins() != null) {
            StringBuilder k3 = C13555b.m33972k("Logins: ");
            k3.append(getLogins());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetOpenIdTokenRequest withIdentityId(String str) {
        this.identityId = str;
        return this;
    }

    public GetOpenIdTokenRequest withLogins(Map<String, String> map) {
        this.logins = map;
        return this;
    }
}
