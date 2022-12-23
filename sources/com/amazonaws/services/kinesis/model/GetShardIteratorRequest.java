package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.Date;

public class GetShardIteratorRequest extends AmazonWebServiceRequest implements Serializable {
    private String shardId;
    private String shardIteratorType;
    private String startingSequenceNumber;
    private String streamName;
    private Date timestamp;

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
        if (obj == null || !(obj instanceof GetShardIteratorRequest)) {
            return false;
        }
        GetShardIteratorRequest getShardIteratorRequest = (GetShardIteratorRequest) obj;
        if (getShardIteratorRequest.getStreamName() == null) {
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
        if (getShardIteratorRequest.getStreamName() != null && !getShardIteratorRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (getShardIteratorRequest.getShardId() == null) {
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
        if (getShardIteratorRequest.getShardId() != null && !getShardIteratorRequest.getShardId().equals(getShardId())) {
            return false;
        }
        if (getShardIteratorRequest.getShardIteratorType() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getShardIteratorType() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getShardIteratorRequest.getShardIteratorType() != null && !getShardIteratorRequest.getShardIteratorType().equals(getShardIteratorType())) {
            return false;
        }
        if (getShardIteratorRequest.getStartingSequenceNumber() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getStartingSequenceNumber() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (getShardIteratorRequest.getStartingSequenceNumber() != null && !getShardIteratorRequest.getStartingSequenceNumber().equals(getStartingSequenceNumber())) {
            return false;
        }
        if (getShardIteratorRequest.getTimestamp() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getTimestamp() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (getShardIteratorRequest.getTimestamp() == null || getShardIteratorRequest.getTimestamp().equals(getTimestamp())) {
            return true;
        }
        return false;
    }

    public String getShardId() {
        return this.shardId;
    }

    public String getShardIteratorType() {
        return this.shardIteratorType;
    }

    public String getStartingSequenceNumber() {
        return this.startingSequenceNumber;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public Date getTimestamp() {
        return this.timestamp;
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
        if (getShardId() == null) {
            i2 = 0;
        } else {
            i2 = getShardId().hashCode();
        }
        int i7 = (i6 + i2) * 31;
        if (getShardIteratorType() == null) {
            i3 = 0;
        } else {
            i3 = getShardIteratorType().hashCode();
        }
        int i8 = (i7 + i3) * 31;
        if (getStartingSequenceNumber() == null) {
            i4 = 0;
        } else {
            i4 = getStartingSequenceNumber().hashCode();
        }
        int i9 = (i8 + i4) * 31;
        if (getTimestamp() != null) {
            i5 = getTimestamp().hashCode();
        }
        return i9 + i5;
    }

    public void setShardId(String str) {
        this.shardId = str;
    }

    public void setShardIteratorType(String str) {
        this.shardIteratorType = str;
    }

    public void setStartingSequenceNumber(String str) {
        this.startingSequenceNumber = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamName() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamName: ");
            k2.append(getStreamName());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getShardId() != null) {
            StringBuilder k3 = C13555b.m33972k("ShardId: ");
            k3.append(getShardId());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getShardIteratorType() != null) {
            StringBuilder k4 = C13555b.m33972k("ShardIteratorType: ");
            k4.append(getShardIteratorType());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getStartingSequenceNumber() != null) {
            StringBuilder k5 = C13555b.m33972k("StartingSequenceNumber: ");
            k5.append(getStartingSequenceNumber());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getTimestamp() != null) {
            StringBuilder k6 = C13555b.m33972k("Timestamp: ");
            k6.append(getTimestamp());
            k.append(k6.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetShardIteratorRequest withShardId(String str) {
        this.shardId = str;
        return this;
    }

    public GetShardIteratorRequest withShardIteratorType(String str) {
        this.shardIteratorType = str;
        return this;
    }

    public GetShardIteratorRequest withStartingSequenceNumber(String str) {
        this.startingSequenceNumber = str;
        return this;
    }

    public GetShardIteratorRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public GetShardIteratorRequest withTimestamp(Date date) {
        this.timestamp = date;
        return this;
    }

    public void setShardIteratorType(ShardIteratorType shardIteratorType2) {
        this.shardIteratorType = shardIteratorType2.toString();
    }

    public GetShardIteratorRequest withShardIteratorType(ShardIteratorType shardIteratorType2) {
        this.shardIteratorType = shardIteratorType2.toString();
        return this;
    }
}
