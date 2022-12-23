package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class DescribeStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartShardId;
    private Integer limit;
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
        if (obj == null || !(obj instanceof DescribeStreamRequest)) {
            return false;
        }
        DescribeStreamRequest describeStreamRequest = (DescribeStreamRequest) obj;
        if (describeStreamRequest.getStreamName() == null) {
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
        if (describeStreamRequest.getStreamName() != null && !describeStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (describeStreamRequest.getLimit() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getLimit() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (describeStreamRequest.getLimit() != null && !describeStreamRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if (describeStreamRequest.getExclusiveStartShardId() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getExclusiveStartShardId() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (describeStreamRequest.getExclusiveStartShardId() == null || describeStreamRequest.getExclusiveStartShardId().equals(getExclusiveStartShardId())) {
            return true;
        }
        return false;
    }

    public String getExclusiveStartShardId() {
        return this.exclusiveStartShardId;
    }

    public Integer getLimit() {
        return this.limit;
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
        if (getLimit() == null) {
            i2 = 0;
        } else {
            i2 = getLimit().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getExclusiveStartShardId() != null) {
            i3 = getExclusiveStartShardId().hashCode();
        }
        return i5 + i3;
    }

    public void setExclusiveStartShardId(String str) {
        this.exclusiveStartShardId = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
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
        if (getLimit() != null) {
            StringBuilder k3 = C13555b.m33972k("Limit: ");
            k3.append(getLimit());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getExclusiveStartShardId() != null) {
            StringBuilder k4 = C13555b.m33972k("ExclusiveStartShardId: ");
            k4.append(getExclusiveStartShardId());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DescribeStreamRequest withExclusiveStartShardId(String str) {
        this.exclusiveStartShardId = str;
        return this;
    }

    public DescribeStreamRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public DescribeStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
