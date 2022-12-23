package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class StopStreamEncryptionRequest extends AmazonWebServiceRequest implements Serializable {
    private String encryptionType;
    private String keyId;
    private String streamName;

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
        if (obj == null || !(obj instanceof StopStreamEncryptionRequest)) {
            return false;
        }
        StopStreamEncryptionRequest stopStreamEncryptionRequest = (StopStreamEncryptionRequest) obj;
        if (stopStreamEncryptionRequest.getStreamName() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getStreamName() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (stopStreamEncryptionRequest.getStreamName() != null && !stopStreamEncryptionRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (stopStreamEncryptionRequest.getEncryptionType() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getEncryptionType() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (stopStreamEncryptionRequest.getEncryptionType() != null && !stopStreamEncryptionRequest.getEncryptionType().equals(getEncryptionType())) {
            return false;
        }
        if (stopStreamEncryptionRequest.getKeyId() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getKeyId() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (stopStreamEncryptionRequest.getKeyId() == null || stopStreamEncryptionRequest.getKeyId().equals(getKeyId())) {
            return true;
        }
        return false;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getStreamName() == null) {
            i = 0;
        } else {
            i = getStreamName().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getEncryptionType() == null) {
            i2 = 0;
        } else {
            i2 = getEncryptionType().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getKeyId() != null) {
            i3 = getKeyId().hashCode();
        }
        return i5 + i3;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamName() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamName: ");
            k2.append(getStreamName());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getEncryptionType() != null) {
            StringBuilder k3 = C13555b.m33972k("EncryptionType: ");
            k3.append(getEncryptionType());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getKeyId() != null) {
            StringBuilder k4 = C13555b.m33972k("KeyId: ");
            k4.append(getKeyId());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public StopStreamEncryptionRequest withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }

    public StopStreamEncryptionRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public StopStreamEncryptionRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public void setEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
    }

    public StopStreamEncryptionRequest withEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
        return this;
    }
}
