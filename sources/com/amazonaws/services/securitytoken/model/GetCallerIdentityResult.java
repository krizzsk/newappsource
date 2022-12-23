package com.amazonaws.services.securitytoken.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class GetCallerIdentityResult implements Serializable {
    private String account;
    private String arn;
    private String userId;

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
        if (obj == null || !(obj instanceof GetCallerIdentityResult)) {
            return false;
        }
        GetCallerIdentityResult getCallerIdentityResult = (GetCallerIdentityResult) obj;
        if (getCallerIdentityResult.getUserId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getUserId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (getCallerIdentityResult.getUserId() != null && !getCallerIdentityResult.getUserId().equals(getUserId())) {
            return false;
        }
        if (getCallerIdentityResult.getAccount() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getAccount() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getCallerIdentityResult.getAccount() != null && !getCallerIdentityResult.getAccount().equals(getAccount())) {
            return false;
        }
        if (getCallerIdentityResult.getArn() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getArn() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getCallerIdentityResult.getArn() == null || getCallerIdentityResult.getArn().equals(getArn())) {
            return true;
        }
        return false;
    }

    public String getAccount() {
        return this.account;
    }

    public String getArn() {
        return this.arn;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getUserId() == null) {
            i = 0;
        } else {
            i = getUserId().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getAccount() == null) {
            i2 = 0;
        } else {
            i2 = getAccount().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getArn() != null) {
            i3 = getArn().hashCode();
        }
        return i5 + i3;
    }

    public void setAccount(String str) {
        this.account = str;
    }

    public void setArn(String str) {
        this.arn = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getUserId() != null) {
            StringBuilder k2 = C13555b.m33972k("UserId: ");
            k2.append(getUserId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getAccount() != null) {
            StringBuilder k3 = C13555b.m33972k("Account: ");
            k3.append(getAccount());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getArn() != null) {
            StringBuilder k4 = C13555b.m33972k("Arn: ");
            k4.append(getArn());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetCallerIdentityResult withAccount(String str) {
        this.account = str;
        return this;
    }

    public GetCallerIdentityResult withArn(String str) {
        this.arn = str;
        return this;
    }

    public GetCallerIdentityResult withUserId(String str) {
        this.userId = str;
        return this;
    }
}
