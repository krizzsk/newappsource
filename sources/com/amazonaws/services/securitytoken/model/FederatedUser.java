package com.amazonaws.services.securitytoken.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class FederatedUser implements Serializable {
    private String arn;
    private String federatedUserId;

    public FederatedUser() {
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FederatedUser)) {
            return false;
        }
        FederatedUser federatedUser = (FederatedUser) obj;
        if (federatedUser.getFederatedUserId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getFederatedUserId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (federatedUser.getFederatedUserId() != null && !federatedUser.getFederatedUserId().equals(getFederatedUserId())) {
            return false;
        }
        if (federatedUser.getArn() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getArn() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (federatedUser.getArn() == null || federatedUser.getArn().equals(getArn())) {
            return true;
        }
        return false;
    }

    public String getArn() {
        return this.arn;
    }

    public String getFederatedUserId() {
        return this.federatedUserId;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getFederatedUserId() == null) {
            i = 0;
        } else {
            i = getFederatedUserId().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getArn() != null) {
            i2 = getArn().hashCode();
        }
        return i3 + i2;
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setFederatedUserId(String str) {
        this.federatedUserId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getFederatedUserId() != null) {
            StringBuilder k2 = C13555b.m33972k("FederatedUserId: ");
            k2.append(getFederatedUserId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getArn() != null) {
            StringBuilder k3 = C13555b.m33972k("Arn: ");
            k3.append(getArn());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public FederatedUser withArn(String str) {
        this.arn = str;
        return this;
    }

    public FederatedUser withFederatedUserId(String str) {
        this.federatedUserId = str;
        return this;
    }

    public FederatedUser(String str, String str2) {
        setFederatedUserId(str);
        setArn(str2);
    }
}
