package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class GetRecordsRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer limit;
    private String shardIterator;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetRecordsRequest)) {
            return false;
        }
        GetRecordsRequest getRecordsRequest = (GetRecordsRequest) obj;
        if (getRecordsRequest.getShardIterator() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getShardIterator() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (getRecordsRequest.getShardIterator() != null && !getRecordsRequest.getShardIterator().equals(getShardIterator())) {
            return false;
        }
        if (getRecordsRequest.getLimit() == null) {
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
        if (getRecordsRequest.getLimit() == null || getRecordsRequest.getLimit().equals(getLimit())) {
            return true;
        }
        return false;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getShardIterator() {
        return this.shardIterator;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getShardIterator() == null) {
            i = 0;
        } else {
            i = getShardIterator().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getLimit() != null) {
            i2 = getLimit().hashCode();
        }
        return i3 + i2;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setShardIterator(String str) {
        this.shardIterator = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getShardIterator() != null) {
            StringBuilder k2 = C13555b.m33972k("ShardIterator: ");
            k2.append(getShardIterator());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getLimit() != null) {
            StringBuilder k3 = C13555b.m33972k("Limit: ");
            k3.append(getLimit());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetRecordsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public GetRecordsRequest withShardIterator(String str) {
        this.shardIterator = str;
        return this;
    }
}
