package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GetIdRequest extends AmazonWebServiceRequest implements Serializable {
    private String accountId;
    private String identityPoolId;
    private Map<String, String> logins;

    public GetIdRequest addLoginsEntry(String str, String str2) {
        if (this.logins == null) {
            this.logins = new HashMap();
        }
        if (!this.logins.containsKey(str)) {
            this.logins.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public GetIdRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetIdRequest)) {
            return false;
        }
        GetIdRequest getIdRequest = (GetIdRequest) obj;
        if (getIdRequest.getAccountId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getAccountId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (getIdRequest.getAccountId() != null && !getIdRequest.getAccountId().equals(getAccountId())) {
            return false;
        }
        if (getIdRequest.getIdentityPoolId() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getIdentityPoolId() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getIdRequest.getIdentityPoolId() != null && !getIdRequest.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (getIdRequest.getLogins() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getLogins() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getIdRequest.getLogins() == null || getIdRequest.getLogins().equals(getLogins())) {
            return true;
        }
        return false;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public Map<String, String> getLogins() {
        return this.logins;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getAccountId() == null) {
            i = 0;
        } else {
            i = getAccountId().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getIdentityPoolId() == null) {
            i2 = 0;
        } else {
            i2 = getIdentityPoolId().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getLogins() != null) {
            i3 = getLogins().hashCode();
        }
        return i5 + i3;
    }

    public void setAccountId(String str) {
        this.accountId = str;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setLogins(Map<String, String> map) {
        this.logins = map;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getAccountId() != null) {
            StringBuilder k2 = C13555b.m33972k("AccountId: ");
            k2.append(getAccountId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getIdentityPoolId() != null) {
            StringBuilder k3 = C13555b.m33972k("IdentityPoolId: ");
            k3.append(getIdentityPoolId());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getLogins() != null) {
            StringBuilder k4 = C13555b.m33972k("Logins: ");
            k4.append(getLogins());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetIdRequest withAccountId(String str) {
        this.accountId = str;
        return this;
    }

    public GetIdRequest withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public GetIdRequest withLogins(Map<String, String> map) {
        this.logins = map;
        return this;
    }
}
