package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class DecreaseStreamRetentionPeriodRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer retentionPeriodHours;
    private String streamName;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecreaseStreamRetentionPeriodRequest)) {
            return false;
        }
        DecreaseStreamRetentionPeriodRequest decreaseStreamRetentionPeriodRequest = (DecreaseStreamRetentionPeriodRequest) obj;
        if (decreaseStreamRetentionPeriodRequest.getStreamName() == null) {
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
        if (decreaseStreamRetentionPeriodRequest.getStreamName() != null && !decreaseStreamRetentionPeriodRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (decreaseStreamRetentionPeriodRequest.getRetentionPeriodHours() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getRetentionPeriodHours() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (decreaseStreamRetentionPeriodRequest.getRetentionPeriodHours() == null || decreaseStreamRetentionPeriodRequest.getRetentionPeriodHours().equals(getRetentionPeriodHours())) {
            return true;
        }
        return false;
    }

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
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
        if (getRetentionPeriodHours() != null) {
            i2 = getRetentionPeriodHours().hashCode();
        }
        return i3 + i2;
    }

    public void setRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
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
        if (getRetentionPeriodHours() != null) {
            StringBuilder k3 = C13555b.m33972k("RetentionPeriodHours: ");
            k3.append(getRetentionPeriodHours());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DecreaseStreamRetentionPeriodRequest withRetentionPeriodHours(Integer num) {
        this.retentionPeriodHours = num;
        return this;
    }

    public DecreaseStreamRetentionPeriodRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }
}
