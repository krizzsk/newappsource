package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PutRecordsResult implements Serializable {
    private String encryptionType;
    private Integer failedRecordCount;
    private List<PutRecordsResultEntry> records = new ArrayList();

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
        if (obj == null || !(obj instanceof PutRecordsResult)) {
            return false;
        }
        PutRecordsResult putRecordsResult = (PutRecordsResult) obj;
        if (putRecordsResult.getFailedRecordCount() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getFailedRecordCount() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (putRecordsResult.getFailedRecordCount() != null && !putRecordsResult.getFailedRecordCount().equals(getFailedRecordCount())) {
            return false;
        }
        if (putRecordsResult.getRecords() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getRecords() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordsResult.getRecords() != null && !putRecordsResult.getRecords().equals(getRecords())) {
            return false;
        }
        if (putRecordsResult.getEncryptionType() == null) {
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
        if (putRecordsResult.getEncryptionType() == null || putRecordsResult.getEncryptionType().equals(getEncryptionType())) {
            return true;
        }
        return false;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public Integer getFailedRecordCount() {
        return this.failedRecordCount;
    }

    public List<PutRecordsResultEntry> getRecords() {
        return this.records;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getFailedRecordCount() == null) {
            i = 0;
        } else {
            i = getFailedRecordCount().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getRecords() == null) {
            i2 = 0;
        } else {
            i2 = getRecords().hashCode();
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

    public void setFailedRecordCount(Integer num) {
        this.failedRecordCount = num;
    }

    public void setRecords(Collection<PutRecordsResultEntry> collection) {
        if (collection == null) {
            this.records = null;
        } else {
            this.records = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getFailedRecordCount() != null) {
            StringBuilder k2 = C13555b.m33972k("FailedRecordCount: ");
            k2.append(getFailedRecordCount());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getRecords() != null) {
            StringBuilder k3 = C13555b.m33972k("Records: ");
            k3.append(getRecords());
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

    public PutRecordsResult withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }

    public PutRecordsResult withFailedRecordCount(Integer num) {
        this.failedRecordCount = num;
        return this;
    }

    public PutRecordsResult withRecords(PutRecordsResultEntry... putRecordsResultEntryArr) {
        if (getRecords() == null) {
            this.records = new ArrayList(putRecordsResultEntryArr.length);
        }
        for (PutRecordsResultEntry add : putRecordsResultEntryArr) {
            this.records.add(add);
        }
        return this;
    }

    public void setEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
    }

    public PutRecordsResult withEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
        return this;
    }

    public PutRecordsResult withRecords(Collection<PutRecordsResultEntry> collection) {
        setRecords(collection);
        return this;
    }
}
