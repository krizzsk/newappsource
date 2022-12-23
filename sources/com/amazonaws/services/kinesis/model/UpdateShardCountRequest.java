package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class UpdateShardCountRequest extends AmazonWebServiceRequest implements Serializable {
    private String scalingType;
    private String streamName;
    private Integer targetShardCount;

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
        if (obj == null || !(obj instanceof UpdateShardCountRequest)) {
            return false;
        }
        UpdateShardCountRequest updateShardCountRequest = (UpdateShardCountRequest) obj;
        if (updateShardCountRequest.getStreamName() == null) {
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
        if (updateShardCountRequest.getStreamName() != null && !updateShardCountRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (updateShardCountRequest.getTargetShardCount() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getTargetShardCount() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (updateShardCountRequest.getTargetShardCount() != null && !updateShardCountRequest.getTargetShardCount().equals(getTargetShardCount())) {
            return false;
        }
        if (updateShardCountRequest.getScalingType() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getScalingType() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (updateShardCountRequest.getScalingType() == null || updateShardCountRequest.getScalingType().equals(getScalingType())) {
            return true;
        }
        return false;
    }

    public String getScalingType() {
        return this.scalingType;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public Integer getTargetShardCount() {
        return this.targetShardCount;
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
        if (getTargetShardCount() == null) {
            i2 = 0;
        } else {
            i2 = getTargetShardCount().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getScalingType() != null) {
            i3 = getScalingType().hashCode();
        }
        return i5 + i3;
    }

    public void setScalingType(String str) {
        this.scalingType = str;
    }

    public void setStreamName(String str) {
        this.streamName = str;
    }

    public void setTargetShardCount(Integer num) {
        this.targetShardCount = num;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStreamName() != null) {
            StringBuilder k2 = C13555b.m33972k("StreamName: ");
            k2.append(getStreamName());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getTargetShardCount() != null) {
            StringBuilder k3 = C13555b.m33972k("TargetShardCount: ");
            k3.append(getTargetShardCount());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getScalingType() != null) {
            StringBuilder k4 = C13555b.m33972k("ScalingType: ");
            k4.append(getScalingType());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public UpdateShardCountRequest withScalingType(String str) {
        this.scalingType = str;
        return this;
    }

    public UpdateShardCountRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public UpdateShardCountRequest withTargetShardCount(Integer num) {
        this.targetShardCount = num;
        return this;
    }

    public void setScalingType(ScalingType scalingType2) {
        this.scalingType = scalingType2.toString();
    }

    public UpdateShardCountRequest withScalingType(ScalingType scalingType2) {
        this.scalingType = scalingType2.toString();
        return this;
    }
}
