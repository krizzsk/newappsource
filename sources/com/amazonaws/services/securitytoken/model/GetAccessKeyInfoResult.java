package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

public class GetAccessKeyInfoResult implements Serializable {
    private String account;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetAccessKeyInfoResult)) {
            return false;
        }
        GetAccessKeyInfoResult getAccessKeyInfoResult = (GetAccessKeyInfoResult) obj;
        if (getAccessKeyInfoResult.getAccount() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getAccount() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (getAccessKeyInfoResult.getAccount() == null || getAccessKeyInfoResult.getAccount().equals(getAccount())) {
            return true;
        }
        return false;
    }

    public String getAccount() {
        return this.account;
    }

    public int hashCode() {
        return 31 + (getAccount() == null ? 0 : getAccount().hashCode());
    }

    public void setAccount(String str) {
        this.account = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getAccount() != null) {
            StringBuilder k2 = C13555b.m33972k("Account: ");
            k2.append(getAccount());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetAccessKeyInfoResult withAccount(String str) {
        this.account = str;
        return this;
    }
}
