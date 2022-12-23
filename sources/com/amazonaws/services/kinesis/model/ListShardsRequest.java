package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.Date;

public class ListShardsRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartShardId;
    private Integer maxResults;
    private String nextToken;
    private Date streamCreationTimestamp;
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
        if (obj == null || !(obj instanceof ListShardsRequest)) {
            return false;
        }
        ListShardsRequest listShardsRequest = (ListShardsRequest) obj;
        if (listShardsRequest.getStreamName() == null) {
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
        if (listShardsRequest.getStreamName() != null && !listShardsRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (listShardsRequest.getNextToken() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getNextToken() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listShardsRequest.getNextToken() != null && !listShardsRequest.getNextToken().equals(getNextToken())) {
            return false;
        }
        if (listShardsRequest.getExclusiveStartShardId() == null) {
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
        if (listShardsRequest.getExclusiveStartShardId() != null && !listShardsRequest.getExclusiveStartShardId().equals(getExclusiveStartShardId())) {
            return false;
        }
        if (listShardsRequest.getMaxResults() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getMaxResults() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (listShardsRequest.getMaxResults() != null && !listShardsRequest.getMaxResults().equals(getMaxResults())) {
            return false;
        }
        if (listShardsRequest.getStreamCreationTimestamp() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getStreamCreationTimestamp() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (listShardsRequest.getStreamCreationTimestamp() == null || listShardsRequest.getStreamCreationTimestamp().equals(getStreamCreationTimestamp())) {
            return true;
        }
        return false;
    }

    public String getExclusiveStartShardId() {
        return this.exclusiveStartShardId;
    }

    public Integer getMaxResults() {
        return this.maxResults;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public Date getStreamCreationTimestamp() {
        return this.streamCreationTimestamp;
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
        if (getNextToken() == null) {
            i2 = 0;
        } else {
            i2 = getNextToken().hashCode();
        }
        int i7 = (i6 + i2) * 31;
        if (getExclusiveStartShardId() == null) {
            i3 = 0;
        } else {
            i3 = getExclusiveStartShardId().hashCode();
        }
        int i8 = (i7 + i3) * 31;
        if (getMaxResults() == null) {
            i4 = 0;
        } else {
            i4 = getMaxResults().hashCode();
        }
        int i9 = (i8 + i4) * 31;
        if (getStreamCreationTimestamp() != null) {
            i5 = getStreamCreationTimestamp().hashCode();
        }
        return i9 + i5;
    }

    public void setExclusiveStartShardId(String str) {
        this.exclusiveStartShardId = str;
    }

    public void setMaxResults(Integer num) {
        this.maxResults = num;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
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
        if (getNextToken() != null) {
            StringBuilder k3 = C13555b.m33972k("NextToken: ");
            k3.append(getNextToken());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getExclusiveStartShardId() != null) {
            StringBuilder k4 = C13555b.m33972k("ExclusiveStartShardId: ");
            k4.append(getExclusiveStartShardId());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getMaxResults() != null) {
            StringBuilder k5 = C13555b.m33972k("MaxResults: ");
            k5.append(getMaxResults());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getStreamCreationTimestamp() != null) {
            StringBuilder k6 = C13555b.m33972k("StreamCreationTimestamp: ");
            k6.append(getStreamCreationTimestamp());
            k.append(k6.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListShardsRequest withExclusiveStartShardId(String str) {
        this.exclusiveStartShardId = str;
        return this;
    }

    public ListShardsRequest withMaxResults(Integer num) {
        this.maxResults = num;
        return this;
    }

    public ListShardsRequest withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListShardsRequest withStreamCreationTimestamp(Date date) {
        this.streamCreationTimestamp = date;
        return this;
    }

    public ListShardsRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
