package com.amazonaws.services.securitytoken.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class GetFederationTokenResult implements Serializable {
    private Credentials credentials;
    private FederatedUser federatedUser;
    private Integer packedPolicySize;

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
        if (obj == null || !(obj instanceof GetFederationTokenResult)) {
            return false;
        }
        GetFederationTokenResult getFederationTokenResult = (GetFederationTokenResult) obj;
        if (getFederationTokenResult.getCredentials() == null) {
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
        if (getFederationTokenResult.getCredentials() != null && !getFederationTokenResult.getCredentials().equals(getCredentials())) {
            return false;
        }
        if (getFederationTokenResult.getFederatedUser() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getFederatedUser() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getFederationTokenResult.getFederatedUser() != null && !getFederationTokenResult.getFederatedUser().equals(getFederatedUser())) {
            return false;
        }
        if (getFederationTokenResult.getPackedPolicySize() == null) {
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
        if (getFederationTokenResult.getPackedPolicySize() == null || getFederationTokenResult.getPackedPolicySize().equals(getPackedPolicySize())) {
            return true;
        }
        return false;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public FederatedUser getFederatedUser() {
        return this.federatedUser;
    }

    public Integer getPackedPolicySize() {
        return this.packedPolicySize;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getCredentials() == null) {
            i = 0;
        } else {
            i = getCredentials().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getFederatedUser() == null) {
            i2 = 0;
        } else {
            i2 = getFederatedUser().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getPackedPolicySize() != null) {
            i3 = getPackedPolicySize().hashCode();
        }
        return i5 + i3;
    }

    public void setCredentials(Credentials credentials2) {
        this.credentials = credentials2;
    }

    public void setFederatedUser(FederatedUser federatedUser2) {
        this.federatedUser = federatedUser2;
    }

    public void setPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getCredentials() != null) {
            StringBuilder k2 = C13555b.m33972k("Credentials: ");
            k2.append(getCredentials());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getFederatedUser() != null) {
            StringBuilder k3 = C13555b.m33972k("FederatedUser: ");
            k3.append(getFederatedUser());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getPackedPolicySize() != null) {
            StringBuilder k4 = C13555b.m33972k("PackedPolicySize: ");
            k4.append(getPackedPolicySize());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetFederationTokenResult withCredentials(Credentials credentials2) {
        this.credentials = credentials2;
        return this;
    }

    public GetFederationTokenResult withFederatedUser(FederatedUser federatedUser2) {
        this.federatedUser = federatedUser2;
        return this;
    }

    public GetFederationTokenResult withPackedPolicySize(Integer num) {
        this.packedPolicySize = num;
        return this;
    }
}
