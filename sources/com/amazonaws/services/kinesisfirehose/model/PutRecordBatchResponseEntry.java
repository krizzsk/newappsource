package com.amazonaws.services.kinesisfirehose.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class PutRecordBatchResponseEntry implements Serializable {
    private String errorCode;
    private String errorMessage;
    private String recordId;

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
        if (obj == null || !(obj instanceof PutRecordBatchResponseEntry)) {
            return false;
        }
        PutRecordBatchResponseEntry putRecordBatchResponseEntry = (PutRecordBatchResponseEntry) obj;
        if (putRecordBatchResponseEntry.getRecordId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getRecordId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (putRecordBatchResponseEntry.getRecordId() != null && !putRecordBatchResponseEntry.getRecordId().equals(getRecordId())) {
            return false;
        }
        if (putRecordBatchResponseEntry.getErrorCode() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getErrorCode() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordBatchResponseEntry.getErrorCode() != null && !putRecordBatchResponseEntry.getErrorCode().equals(getErrorCode())) {
            return false;
        }
        if (putRecordBatchResponseEntry.getErrorMessage() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getErrorMessage() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (putRecordBatchResponseEntry.getErrorMessage() == null || putRecordBatchResponseEntry.getErrorMessage().equals(getErrorMessage())) {
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

    public String getRecordId() {
        return this.recordId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getRecordId() == null) {
            i = 0;
        } else {
            i = getRecordId().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getErrorCode() == null) {
            i2 = 0;
        } else {
            i2 = getErrorCode().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getErrorMessage() != null) {
            i3 = getErrorMessage().hashCode();
        }
        return i5 + i3;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setRecordId(String str) {
        this.recordId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getRecordId() != null) {
            StringBuilder k2 = C13555b.m33972k("RecordId: ");
            k2.append(getRecordId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getErrorCode() != null) {
            StringBuilder k3 = C13555b.m33972k("ErrorCode: ");
            k3.append(getErrorCode());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getErrorMessage() != null) {
            StringBuilder k4 = C13555b.m33972k("ErrorMessage: ");
            k4.append(getErrorMessage());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PutRecordBatchResponseEntry withErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public PutRecordBatchResponseEntry withErrorMessage(String str) {
        this.errorMessage = str;
        return this;
    }

    public PutRecordBatchResponseEntry withRecordId(String str) {
        this.recordId = str;
        return this;
    }
}
