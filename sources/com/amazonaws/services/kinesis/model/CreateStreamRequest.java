package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class CreateStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer shardCount;
    private String streamName;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateStreamRequest)) {
            return false;
        }
        CreateStreamRequest createStreamRequest = (CreateStreamRequest) obj;
        if (createStreamRequest.getStreamName() == null) {
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
        if (createStreamRequest.getStreamName() != null && !createStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (createStreamRequest.getShardCount() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getShardCount() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (createStreamRequest.getShardCount() == null || createStreamRequest.getShardCount().equals(getShardCount())) {
            return true;
        }
        return false;
    }

    public Integer getShardCount() {
        return this.shardCount;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getStreamName() == null) {
            i = 0;
        } else {
            i = getStreamName().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getShardCount() != null) {
            i2 = getShardCount().hashCode();
        }
        return i3 + i2;
    }

    public void setShardCount(Integer num) {
        this.shardCount = num;
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
        if (getShardCount() != null) {
            StringBuilder k3 = C13555b.m33972k("ShardCount: ");
            k3.append(getShardCount());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public CreateStreamRequest withShardCount(Integer num) {
        this.shardCount = num;
        return this;
    }

    public CreateStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
