package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class ListTagsForStreamRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartTagKey;
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
        if (obj == null || !(obj instanceof ListTagsForStreamRequest)) {
            return false;
        }
        ListTagsForStreamRequest listTagsForStreamRequest = (ListTagsForStreamRequest) obj;
        if (listTagsForStreamRequest.getStreamName() == null) {
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
        if (listTagsForStreamRequest.getStreamName() != null && !listTagsForStreamRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (listTagsForStreamRequest.getExclusiveStartTagKey() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getExclusiveStartTagKey() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listTagsForStreamRequest.getExclusiveStartTagKey() != null && !listTagsForStreamRequest.getExclusiveStartTagKey().equals(getExclusiveStartTagKey())) {
            return false;
        }
        if (listTagsForStreamRequest.getLimit() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getLimit() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (listTagsForStreamRequest.getLimit() == null || listTagsForStreamRequest.getLimit().equals(getLimit())) {
            return true;
        }
        return false;
    }

    public String getExclusiveStartTagKey() {
        return this.exclusiveStartTagKey;
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
        if (getExclusiveStartTagKey() == null) {
            i2 = 0;
        } else {
            i2 = getExclusiveStartTagKey().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getLimit() != null) {
            i3 = getLimit().hashCode();
        }
        return i5 + i3;
    }

    public void setExclusiveStartTagKey(String str) {
        this.exclusiveStartTagKey = str;
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
        if (getExclusiveStartTagKey() != null) {
            StringBuilder k3 = C13555b.m33972k("ExclusiveStartTagKey: ");
            k3.append(getExclusiveStartTagKey());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getLimit() != null) {
            StringBuilder k4 = C13555b.m33972k("Limit: ");
            k4.append(getLimit());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListTagsForStreamRequest withExclusiveStartTagKey(String str) {
        this.exclusiveStartTagKey = str;
        return this;
    }

    public ListTagsForStreamRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListTagsForStreamRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
