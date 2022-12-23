package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class ListStreamsRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartStreamName;
    private Integer limit;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListStreamsRequest)) {
            return false;
        }
        ListStreamsRequest listStreamsRequest = (ListStreamsRequest) obj;
        if (listStreamsRequest.getLimit() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getLimit() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listStreamsRequest.getLimit() != null && !listStreamsRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if (listStreamsRequest.getExclusiveStartStreamName() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getExclusiveStartStreamName() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listStreamsRequest.getExclusiveStartStreamName() == null || listStreamsRequest.getExclusiveStartStreamName().equals(getExclusiveStartStreamName())) {
            return true;
        }
        return false;
    }

    public String getExclusiveStartStreamName() {
        return this.exclusiveStartStreamName;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getLimit() == null) {
            i = 0;
        } else {
            i = getLimit().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getExclusiveStartStreamName() != null) {
            i2 = getExclusiveStartStreamName().hashCode();
        }
        return i3 + i2;
    }

    public void setExclusiveStartStreamName(String str) {
        this.exclusiveStartStreamName = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getLimit() != null) {
            StringBuilder k2 = C13555b.m33972k("Limit: ");
            k2.append(getLimit());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getExclusiveStartStreamName() != null) {
            StringBuilder k3 = C13555b.m33972k("ExclusiveStartStreamName: ");
            k3.append(getExclusiveStartStreamName());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListStreamsRequest withExclusiveStartStreamName(String str) {
        this.exclusiveStartStreamName = str;
        return this;
    }

    public ListStreamsRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }
}
