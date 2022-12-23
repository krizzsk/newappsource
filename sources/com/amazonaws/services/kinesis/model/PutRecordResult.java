package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class PutRecordResult implements Serializable {
    private String encryptionType;
    private String sequenceNumber;
    private String shardId;

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
        if (obj == null || !(obj instanceof PutRecordResult)) {
            return false;
        }
        PutRecordResult putRecordResult = (PutRecordResult) obj;
        if (putRecordResult.getShardId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getShardId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (putRecordResult.getShardId() != null && !putRecordResult.getShardId().equals(getShardId())) {
            return false;
        }
        if (putRecordResult.getSequenceNumber() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getSequenceNumber() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordResult.getSequenceNumber() != null && !putRecordResult.getSequenceNumber().equals(getSequenceNumber())) {
            return false;
        }
        if (putRecordResult.getEncryptionType() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getEncryptionType() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (putRecordResult.getEncryptionType() == null || putRecordResult.getEncryptionType().equals(getEncryptionType())) {
            return true;
        }
        return false;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public String getShardId() {
        return this.shardId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getShardId() == null) {
            i = 0;
        } else {
            i = getShardId().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getSequenceNumber() == null) {
            i2 = 0;
        } else {
            i2 = getSequenceNumber().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getEncryptionType() != null) {
            i3 = getEncryptionType().hashCode();
        }
        return i5 + i3;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public void setShardId(String str) {
        this.shardId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getShardId() != null) {
            StringBuilder k2 = C13555b.m33972k("ShardId: ");
            k2.append(getShardId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getSequenceNumber() != null) {
            StringBuilder k3 = C13555b.m33972k("SequenceNumber: ");
            k3.append(getSequenceNumber());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getEncryptionType() != null) {
            StringBuilder k4 = C13555b.m33972k("EncryptionType: ");
            k4.append(getEncryptionType());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PutRecordResult withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }

    public PutRecordResult withSequenceNumber(String str) {
        this.sequenceNumber = str;
        return this;
    }

    public PutRecordResult withShardId(String str) {
        this.shardId = str;
        return this;
    }

    public void setEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
    }

    public PutRecordResult withEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
        return this;
    }
}
