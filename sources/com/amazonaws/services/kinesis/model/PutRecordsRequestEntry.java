package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class PutRecordsRequestEntry implements Serializable {
    private ByteBuffer data;
    private String explicitHashKey;
    private String partitionKey;

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
        if (obj == null || !(obj instanceof PutRecordsRequestEntry)) {
            return false;
        }
        PutRecordsRequestEntry putRecordsRequestEntry = (PutRecordsRequestEntry) obj;
        if (putRecordsRequestEntry.getData() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getData() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (putRecordsRequestEntry.getData() != null && !putRecordsRequestEntry.getData().equals(getData())) {
            return false;
        }
        if (putRecordsRequestEntry.getExplicitHashKey() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getExplicitHashKey() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordsRequestEntry.getExplicitHashKey() != null && !putRecordsRequestEntry.getExplicitHashKey().equals(getExplicitHashKey())) {
            return false;
        }
        if (putRecordsRequestEntry.getPartitionKey() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getPartitionKey() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (putRecordsRequestEntry.getPartitionKey() == null || putRecordsRequestEntry.getPartitionKey().equals(getPartitionKey())) {
            return true;
        }
        return false;
    }

    public ByteBuffer getData() {
        return this.data;
    }

    public String getExplicitHashKey() {
        return this.explicitHashKey;
    }

    public String getPartitionKey() {
        return this.partitionKey;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getData() == null) {
            i = 0;
        } else {
            i = getData().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getExplicitHashKey() == null) {
            i2 = 0;
        } else {
            i2 = getExplicitHashKey().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getPartitionKey() != null) {
            i3 = getPartitionKey().hashCode();
        }
        return i5 + i3;
    }

    public void setData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
    }

    public void setExplicitHashKey(String str) {
        this.explicitHashKey = str;
    }

    public void setPartitionKey(String str) {
        this.partitionKey = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getData() != null) {
            StringBuilder k2 = C13555b.m33972k("Data: ");
            k2.append(getData());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getExplicitHashKey() != null) {
            StringBuilder k3 = C13555b.m33972k("ExplicitHashKey: ");
            k3.append(getExplicitHashKey());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getPartitionKey() != null) {
            StringBuilder k4 = C13555b.m33972k("PartitionKey: ");
            k4.append(getPartitionKey());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PutRecordsRequestEntry withData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        return this;
    }

    public PutRecordsRequestEntry withExplicitHashKey(String str) {
        this.explicitHashKey = str;
        return this;
    }

    public PutRecordsRequestEntry withPartitionKey(String str) {
        this.partitionKey = str;
        return this;
    }
}
