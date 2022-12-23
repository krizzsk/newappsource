package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class UpdateShardCountResult implements Serializable {
    private Integer currentShardCount;
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
        if (obj == null || !(obj instanceof UpdateShardCountResult)) {
            return false;
        }
        UpdateShardCountResult updateShardCountResult = (UpdateShardCountResult) obj;
        if (updateShardCountResult.getStreamName() == null) {
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
        if (updateShardCountResult.getStreamName() != null && !updateShardCountResult.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (updateShardCountResult.getCurrentShardCount() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCurrentShardCount() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (updateShardCountResult.getCurrentShardCount() != null && !updateShardCountResult.getCurrentShardCount().equals(getCurrentShardCount())) {
            return false;
        }
        if (updateShardCountResult.getTargetShardCount() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getTargetShardCount() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (updateShardCountResult.getTargetShardCount() == null || updateShardCountResult.getTargetShardCount().equals(getTargetShardCount())) {
            return true;
        }
        return false;
    }

    public Integer getCurrentShardCount() {
        return this.currentShardCount;
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
        if (getCurrentShardCount() == null) {
            i2 = 0;
        } else {
            i2 = getCurrentShardCount().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getTargetShardCount() != null) {
            i3 = getTargetShardCount().hashCode();
        }
        return i5 + i3;
    }

    public void setCurrentShardCount(Integer num) {
        this.currentShardCount = num;
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
        if (getCurrentShardCount() != null) {
            StringBuilder k3 = C13555b.m33972k("CurrentShardCount: ");
            k3.append(getCurrentShardCount());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getTargetShardCount() != null) {
            StringBuilder k4 = C13555b.m33972k("TargetShardCount: ");
            k4.append(getTargetShardCount());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public UpdateShardCountResult withCurrentShardCount(Integer num) {
        this.currentShardCount = num;
        return this;
    }

    public UpdateShardCountResult withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public UpdateShardCountResult withTargetShardCount(Integer num) {
        this.targetShardCount = num;
        return this;
    }
}
