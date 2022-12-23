package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Date;

public class Record implements Serializable {
    private Date approximateArrivalTimestamp;
    private ByteBuffer data;
    private String encryptionType;
    private String partitionKey;
    private String sequenceNumber;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Record)) {
            return false;
        }
        Record record = (Record) obj;
        if (record.getSequenceNumber() == null) {
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
        if (record.getSequenceNumber() != null && !record.getSequenceNumber().equals(getSequenceNumber())) {
            return false;
        }
        if (record.getApproximateArrivalTimestamp() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getApproximateArrivalTimestamp() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (record.getApproximateArrivalTimestamp() != null && !record.getApproximateArrivalTimestamp().equals(getApproximateArrivalTimestamp())) {
            return false;
        }
        if (record.getData() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getData() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (record.getData() != null && !record.getData().equals(getData())) {
            return false;
        }
        if (record.getPartitionKey() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getPartitionKey() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (record.getPartitionKey() != null && !record.getPartitionKey().equals(getPartitionKey())) {
            return false;
        }
        if (record.getEncryptionType() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getEncryptionType() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (record.getEncryptionType() == null || record.getEncryptionType().equals(getEncryptionType())) {
            return true;
        }
        return false;
    }

    public Date getApproximateArrivalTimestamp() {
        return this.approximateArrivalTimestamp;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public String getEncryptionType() {
        return this.encryptionType;
    }

    public String getPartitionKey() {
        return this.partitionKey;
    }

    public String getSequenceNumber() {
        return this.sequenceNumber;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (getSequenceNumber() == null) {
            i = 0;
        } else {
            i = getSequenceNumber().hashCode();
        }
        int i6 = (i + 31) * 31;
        if (getApproximateArrivalTimestamp() == null) {
            i2 = 0;
        } else {
            i2 = getApproximateArrivalTimestamp().hashCode();
        }
        int i7 = (i6 + i2) * 31;
        if (getData() == null) {
            i3 = 0;
        } else {
            i3 = getData().hashCode();
        }
        int i8 = (i7 + i3) * 31;
        if (getPartitionKey() == null) {
            i4 = 0;
        } else {
            i4 = getPartitionKey().hashCode();
        }
        int i9 = (i8 + i4) * 31;
        if (getEncryptionType() != null) {
            i5 = getEncryptionType().hashCode();
        }
        return i9 + i5;
    }

    public void setApproximateArrivalTimestamp(Date date) {
        this.approximateArrivalTimestamp = date;
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setEncryptionType(String str) {
        this.encryptionType = str;
    }

    public void setPartitionKey(String str) {
        this.partitionKey = str;
    }

    public void setSequenceNumber(String str) {
        this.sequenceNumber = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getSequenceNumber() != null) {
            StringBuilder k2 = C13555b.m33972k("SequenceNumber: ");
            k2.append(getSequenceNumber());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getApproximateArrivalTimestamp() != null) {
            StringBuilder k3 = C13555b.m33972k("ApproximateArrivalTimestamp: ");
            k3.append(getApproximateArrivalTimestamp());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getData() != null) {
            StringBuilder k4 = C13555b.m33972k("Data: ");
            k4.append(getData());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getPartitionKey() != null) {
            StringBuilder k5 = C13555b.m33972k("PartitionKey: ");
            k5.append(getPartitionKey());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getEncryptionType() != null) {
            StringBuilder k6 = C13555b.m33972k("EncryptionType: ");
            k6.append(getEncryptionType());
            k.append(k6.toString());
        }
        k.append("}");
        return k.toString();
    }

    public Record withApproximateArrivalTimestamp(Date date) {
        this.approximateArrivalTimestamp = date;
        return this;
    }

    public Record withData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        return this;
    }

    public Record withEncryptionType(String str) {
        this.encryptionType = str;
        return this;
    }

    public Record withPartitionKey(String str) {
        this.partitionKey = str;
        return this;
    }

    public Record withSequenceNumber(String str) {
        this.sequenceNumber = str;
        return this;
    }

    public void setEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
    }

    public Record withEncryptionType(EncryptionType encryptionType2) {
        this.encryptionType = encryptionType2.toString();
        return this;
    }
}
