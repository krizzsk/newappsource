package com.amazonaws.services.securitytoken.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class AssumedRoleUser implements Serializable {
    private String arn;
    private String assumedRoleId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumedRoleUser)) {
            return false;
        }
        AssumedRoleUser assumedRoleUser = (AssumedRoleUser) obj;
        if (assumedRoleUser.getAssumedRoleId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getAssumedRoleId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (assumedRoleUser.getAssumedRoleId() != null && !assumedRoleUser.getAssumedRoleId().equals(getAssumedRoleId())) {
            return false;
        }
        if (assumedRoleUser.getArn() == null) {
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
        if (assumedRoleUser.getArn() == null || assumedRoleUser.getArn().equals(getArn())) {
            return true;
        }
        return false;
    }

    public String getArn() {
        return this.arn;
    }

    public String getAssumedRoleId() {
        return this.assumedRoleId;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getAssumedRoleId() == null) {
            i = 0;
        } else {
            i = getAssumedRoleId().hashCode();
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

    public void setAssumedRoleId(String str) {
        this.assumedRoleId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getAssumedRoleId() != null) {
            StringBuilder k2 = C13555b.m33972k("AssumedRoleId: ");
            k2.append(getAssumedRoleId());
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

    public AssumedRoleUser withArn(String str) {
        this.arn = str;
        return this;
    }

    public AssumedRoleUser withAssumedRoleId(String str) {
        this.assumedRoleId = str;
        return this;
    }
}
