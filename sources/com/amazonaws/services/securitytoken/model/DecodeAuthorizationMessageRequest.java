package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

public class DecodeAuthorizationMessageRequest extends AmazonWebServiceRequest implements Serializable {
    private String encodedMessage;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecodeAuthorizationMessageRequest)) {
            return false;
        }
        DecodeAuthorizationMessageRequest decodeAuthorizationMessageRequest = (DecodeAuthorizationMessageRequest) obj;
        if (decodeAuthorizationMessageRequest.getEncodedMessage() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getEncodedMessage() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (decodeAuthorizationMessageRequest.getEncodedMessage() == null || decodeAuthorizationMessageRequest.getEncodedMessage().equals(getEncodedMessage())) {
            return true;
        }
        return false;
    }

    public String getEncodedMessage() {
        return this.encodedMessage;
    }

    public int hashCode() {
        return 31 + (getEncodedMessage() == null ? 0 : getEncodedMessage().hashCode());
    }

    public void setEncodedMessage(String str) {
        this.encodedMessage = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getEncodedMessage() != null) {
            StringBuilder k2 = C13555b.m33972k("EncodedMessage: ");
            k2.append(getEncodedMessage());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DecodeAuthorizationMessageRequest withEncodedMessage(String str) {
        this.encodedMessage = str;
        return this;
    }
}
