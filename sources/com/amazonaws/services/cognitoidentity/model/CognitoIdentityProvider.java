package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class CognitoIdentityProvider implements Serializable {
    private String clientId;
    private String providerName;
    private Boolean serverSideTokenCheck;

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
        if (obj == null || !(obj instanceof CognitoIdentityProvider)) {
            return false;
        }
        CognitoIdentityProvider cognitoIdentityProvider = (CognitoIdentityProvider) obj;
        if (cognitoIdentityProvider.getProviderName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getProviderName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (cognitoIdentityProvider.getProviderName() != null && !cognitoIdentityProvider.getProviderName().equals(getProviderName())) {
            return false;
        }
        if (cognitoIdentityProvider.getClientId() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getClientId() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (cognitoIdentityProvider.getClientId() != null && !cognitoIdentityProvider.getClientId().equals(getClientId())) {
            return false;
        }
        if (cognitoIdentityProvider.getServerSideTokenCheck() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getServerSideTokenCheck() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (cognitoIdentityProvider.getServerSideTokenCheck() == null || cognitoIdentityProvider.getServerSideTokenCheck().equals(getServerSideTokenCheck())) {
            return true;
        }
        return false;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public Boolean getServerSideTokenCheck() {
        return this.serverSideTokenCheck;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getProviderName() == null) {
            i = 0;
        } else {
            i = getProviderName().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getClientId() == null) {
            i2 = 0;
        } else {
            i2 = getClientId().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getServerSideTokenCheck() != null) {
            i3 = getServerSideTokenCheck().hashCode();
        }
        return i5 + i3;
    }

    public Boolean isServerSideTokenCheck() {
        return this.serverSideTokenCheck;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }

    public void setServerSideTokenCheck(Boolean bool) {
        this.serverSideTokenCheck = bool;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getProviderName() != null) {
            StringBuilder k2 = C13555b.m33972k("ProviderName: ");
            k2.append(getProviderName());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getClientId() != null) {
            StringBuilder k3 = C13555b.m33972k("ClientId: ");
            k3.append(getClientId());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getServerSideTokenCheck() != null) {
            StringBuilder k4 = C13555b.m33972k("ServerSideTokenCheck: ");
            k4.append(getServerSideTokenCheck());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public CognitoIdentityProvider withClientId(String str) {
        this.clientId = str;
        return this;
    }

    public CognitoIdentityProvider withProviderName(String str) {
        this.providerName = str;
        return this;
    }

    public CognitoIdentityProvider withServerSideTokenCheck(Boolean bool) {
        this.serverSideTokenCheck = bool;
        return this;
    }
}
