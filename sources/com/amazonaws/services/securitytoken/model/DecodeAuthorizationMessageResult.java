package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

public class DecodeAuthorizationMessageResult implements Serializable {
    private String decodedMessage;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecodeAuthorizationMessageResult)) {
            return false;
        }
        DecodeAuthorizationMessageResult decodeAuthorizationMessageResult = (DecodeAuthorizationMessageResult) obj;
        if (decodeAuthorizationMessageResult.getDecodedMessage() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getDecodedMessage() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (decodeAuthorizationMessageResult.getDecodedMessage() == null || decodeAuthorizationMessageResult.getDecodedMessage().equals(getDecodedMessage())) {
            return true;
        }
        return false;
    }

    public String getDecodedMessage() {
        return this.decodedMessage;
    }

    public int hashCode() {
        return 31 + (getDecodedMessage() == null ? 0 : getDecodedMessage().hashCode());
    }

    public void setDecodedMessage(String str) {
        this.decodedMessage = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getDecodedMessage() != null) {
            StringBuilder k2 = C13555b.m33972k("DecodedMessage: ");
            k2.append(getDecodedMessage());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DecodeAuthorizationMessageResult withDecodedMessage(String str) {
        this.decodedMessage = str;
        return this;
    }
}
