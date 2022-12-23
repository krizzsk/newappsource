package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class PutRecordRequest extends AmazonWebServiceRequest implements Serializable {
    private ByteBuffer data;
    private String explicitHashKey;
    private String partitionKey;
    private String sequenceNumberForOrdering;
    private String streamName;

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
        if (obj == null || !(obj instanceof PutRecordRequest)) {
            return false;
        }
        PutRecordRequest putRecordRequest = (PutRecordRequest) obj;
        if (putRecordRequest.getStreamName() == null) {
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
        if (putRecordRequest.getStreamName() != null && !putRecordRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (putRecordRequest.getData() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getData() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (putRecordRequest.getData() != null && !putRecordRequest.getData().equals(getData())) {
            return false;
        }
        if (putRecordRequest.getPartitionKey() == null) {
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
        if (putRecordRequest.getPartitionKey() != null && !putRecordRequest.getPartitionKey().equals(getPartitionKey())) {
            return false;
        }
        if (putRecordRequest.getExplicitHashKey() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getExplicitHashKey() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (putRecordRequest.getExplicitHashKey() != null && !putRecordRequest.getExplicitHashKey().equals(getExplicitHashKey())) {
            return false;
        }
        if (putRecordRequest.getSequenceNumberForOrdering() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getSequenceNumberForOrdering() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (putRecordRequest.getSequenceNumberForOrdering() == null || putRecordRequest.getSequenceNumberForOrdering().equals(getSequenceNumberForOrdering())) {
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

    public String getSequenceNumberForOrdering() {
        return this.sequenceNumberForOrdering;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (getStreamName() == null) {
            i = 0;
        } else {
            i = getStreamName().hashCode();
        }
        int i6 = (i + 31) * 31;
        if (getData() == null) {
            i2 = 0;
        } else {
            i2 = getData().hashCode();
        }
        int i7 = (i6 + i2) * 31;
        if (getPartitionKey() == null) {
            i3 = 0;
        } else {
            i3 = getPartitionKey().hashCode();
        }
        int i8 = (i7 + i3) * 31;
        if (getExplicitHashKey() == null) {
            i4 = 0;
        } else {
            i4 = getExplicitHashKey().hashCode();
        }
        int i9 = (i8 + i4) * 31;
        if (getSequenceNumberForOrdering() != null) {
            i5 = getSequenceNumberForOrdering().hashCode();
        }
        return i9 + i5;
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

    public void setSequenceNumberForOrdering(String str) {
        this.sequenceNumberForOrdering = str;
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
        if (getData() != null) {
            StringBuilder k3 = C13555b.m33972k("Data: ");
            k3.append(getData());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getPartitionKey() != null) {
            StringBuilder k4 = C13555b.m33972k("PartitionKey: ");
            k4.append(getPartitionKey());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getExplicitHashKey() != null) {
            StringBuilder k5 = C13555b.m33972k("ExplicitHashKey: ");
            k5.append(getExplicitHashKey());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getSequenceNumberForOrdering() != null) {
            StringBuilder k6 = C13555b.m33972k("SequenceNumberForOrdering: ");
            k6.append(getSequenceNumberForOrdering());
            k.append(k6.toString());
        }
        k.append("}");
        return k.toString();
    }

    public PutRecordRequest withData(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        return this;
    }

    public PutRecordRequest withExplicitHashKey(String str) {
        this.explicitHashKey = str;
        return this;
    }

    public PutRecordRequest withPartitionKey(String str) {
        this.partitionKey = str;
        return this;
    }

    public PutRecordRequest withSequenceNumberForOrdering(String str) {
        this.sequenceNumberForOrdering = str;
        return this;
    }

    public PutRecordRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
