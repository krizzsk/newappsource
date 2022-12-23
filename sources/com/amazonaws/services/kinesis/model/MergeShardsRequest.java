package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class MergeShardsRequest extends AmazonWebServiceRequest implements Serializable {
    private String adjacentShardToMerge;
    private String shardToMerge;
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
        if (obj == null || !(obj instanceof MergeShardsRequest)) {
            return false;
        }
        MergeShardsRequest mergeShardsRequest = (MergeShardsRequest) obj;
        if (mergeShardsRequest.getStreamName() == null) {
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
        if (mergeShardsRequest.getStreamName() != null && !mergeShardsRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (mergeShardsRequest.getShardToMerge() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getShardToMerge() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (mergeShardsRequest.getShardToMerge() != null && !mergeShardsRequest.getShardToMerge().equals(getShardToMerge())) {
            return false;
        }
        if (mergeShardsRequest.getAdjacentShardToMerge() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getAdjacentShardToMerge() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (mergeShardsRequest.getAdjacentShardToMerge() == null || mergeShardsRequest.getAdjacentShardToMerge().equals(getAdjacentShardToMerge())) {
            return true;
        }
        return false;
    }

    public String getAdjacentShardToMerge() {
        return this.adjacentShardToMerge;
    }

    public String getShardToMerge() {
        return this.shardToMerge;
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
        if (getShardToMerge() == null) {
            i2 = 0;
        } else {
            i2 = getShardToMerge().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getAdjacentShardToMerge() != null) {
            i3 = getAdjacentShardToMerge().hashCode();
        }
        return i5 + i3;
    }

    public void setAdjacentShardToMerge(String str) {
        this.adjacentShardToMerge = str;
    }

    public void setShardToMerge(String str) {
        this.shardToMerge = str;
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
        if (getShardToMerge() != null) {
            StringBuilder k3 = C13555b.m33972k("ShardToMerge: ");
            k3.append(getShardToMerge());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getAdjacentShardToMerge() != null) {
            StringBuilder k4 = C13555b.m33972k("AdjacentShardToMerge: ");
            k4.append(getAdjacentShardToMerge());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public MergeShardsRequest withAdjacentShardToMerge(String str) {
        this.adjacentShardToMerge = str;
        return this;
    }

    public MergeShardsRequest withShardToMerge(String str) {
        this.shardToMerge = str;
        return this;
    }

    public MergeShardsRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
