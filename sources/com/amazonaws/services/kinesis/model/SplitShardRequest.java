package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class SplitShardRequest extends AmazonWebServiceRequest implements Serializable {
    private String newStartingHashKey;
    private String shardToSplit;
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
        if (obj == null || !(obj instanceof SplitShardRequest)) {
            return false;
        }
        SplitShardRequest splitShardRequest = (SplitShardRequest) obj;
        if (splitShardRequest.getStreamName() == null) {
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
        if (splitShardRequest.getStreamName() != null && !splitShardRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (splitShardRequest.getShardToSplit() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getShardToSplit() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (splitShardRequest.getShardToSplit() != null && !splitShardRequest.getShardToSplit().equals(getShardToSplit())) {
            return false;
        }
        if (splitShardRequest.getNewStartingHashKey() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getNewStartingHashKey() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (splitShardRequest.getNewStartingHashKey() == null || splitShardRequest.getNewStartingHashKey().equals(getNewStartingHashKey())) {
            return true;
        }
        return false;
    }

    public String getNewStartingHashKey() {
        return this.newStartingHashKey;
    }

    public String getShardToSplit() {
        return this.shardToSplit;
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
        if (getShardToSplit() == null) {
            i2 = 0;
        } else {
            i2 = getShardToSplit().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getNewStartingHashKey() != null) {
            i3 = getNewStartingHashKey().hashCode();
        }
        return i5 + i3;
    }

    public void setNewStartingHashKey(String str) {
        this.newStartingHashKey = str;
    }

    public void setShardToSplit(String str) {
        this.shardToSplit = str;
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
        if (getShardToSplit() != null) {
            StringBuilder k3 = C13555b.m33972k("ShardToSplit: ");
            k3.append(getShardToSplit());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getNewStartingHashKey() != null) {
            StringBuilder k4 = C13555b.m33972k("NewStartingHashKey: ");
            k4.append(getNewStartingHashKey());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public SplitShardRequest withNewStartingHashKey(String str) {
        this.newStartingHashKey = str;
        return this;
    }

    public SplitShardRequest withShardToSplit(String str) {
        this.shardToSplit = str;
        return this;
    }

    public SplitShardRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
