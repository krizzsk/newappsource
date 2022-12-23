package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class PutRecordsResultEntry implements Serializable {
    private String errorCode;
    private String errorMessage;
    private String sequenceNumber;
    private String shardId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutRecordsResultEntry)) {
            return false;
        }
        PutRecordsResultEntry putRecordsResultEntry = (PutRecordsResultEntry) obj;
        if (putRecordsResultEntry.getSequenceNumber() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getSequenceNumber() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (putRecordsResultEntry.getSequenceNumber() != null && !putRecordsResultEntry.getSequenceNumber().equals(getSequenceNumber())) {
            return false;
        }
        if (putRecordsResultEntry.getShardId() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getShardId() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordsResultEntry.getShardId() != null && !putRecordsResultEntry.getShardId().equals(getShardId())) {
            return false;
        }
        if (putRecordsResultEntry.getErrorCode() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getErrorCode() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (putRecordsResultEntry.getErrorCode() != null && !putRecordsResultEntry.getErrorCode().equals(getErrorCode())) {
            return false;
        }
        if (putRecordsResultEntry.getErrorMessage() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getErrorMessage() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (putRecordsResultEntry.getErrorMessage() == null || putRecordsResultEntry.getErrorMessage().equals(getErrorMessage())) {
            return true;
        }
        return false;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
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
        int i3;
        int i4 = 0;
        if (getSequenceNumber() == null) {
            i = 0;
        } else {
            i = getSequenceNumber().hashCode();
        }
        int i5 = (i + 31) * 31;
        if (getShardId() == null) {
            i2 = 0;
        } else {
            i2 = getShardId().hashCode();
        }
        int i6 = (i5 + i2) * 31;
        if (getErrorCode() == null) {
            i3 = 0;
        } else {
            i3 = getErrorCode().hashCode();
        }
        int i7 = (i6 + i3) * 31;
        if (getErrorMessage() != null) {
            i4 = getErrorMessage().hashCode();
        }
        return i7 + i4;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public void setShardId(String str) {
        this.shardId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getSequenceNumber() != null) {
            StringBuilder k2 = C13555b.m33972k("SequenceNumber: ");
            k2.append(getSequenceNumber());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getShardId() != null) {
            StringBuilder k3 = C13555b.m33972k("ShardId: ");
            k3.append(getShardId());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getErrorCode() != null) {
            StringBuilder k4 = C13555b.m33972k("ErrorCode: ");
            k4.append(getErrorCode());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getErrorMessage() != null) {
            StringBuilder k5 = C13555b.m33972k("ErrorMessage: ");
            k5.append(getErrorMessage());
            k.append(k5.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PutRecordsResultEntry withErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public PutRecordsResultEntry withErrorMessage(String str) {
        this.errorMessage = str;
        return this;
    }

    public PutRecordsResultEntry withSequenceNumber(String str) {
        this.sequenceNumber = str;
        return this;
    }

    public PutRecordsResultEntry withShardId(String str) {
        this.shardId = str;
        return this;
    }
}
