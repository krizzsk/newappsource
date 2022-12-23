package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

public class GetSessionTokenResult implements Serializable {
    private Credentials credentials;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetSessionTokenResult)) {
            return false;
        }
        GetSessionTokenResult getSessionTokenResult = (GetSessionTokenResult) obj;
        if (getSessionTokenResult.getCredentials() == null) {
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
        if (getSessionTokenResult.getCredentials() == null || getSessionTokenResult.getCredentials().equals(getCredentials())) {
            return true;
        }
        return false;
    }

    public Credentials getCredentials() {
        return this.credentials;
    }

    public int hashCode() {
        return 31 + (getCredentials() == null ? 0 : getCredentials().hashCode());
    }

    public void setCredentials(Credentials credentials2) {
        this.credentials = credentials2;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getCredentials() != null) {
            StringBuilder k2 = C13555b.m33972k("Credentials: ");
            k2.append(getCredentials());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetSessionTokenResult withCredentials(Credentials credentials2) {
        this.credentials = credentials2;
        return this;
    }
}
