package com.amazonaws.services.kinesis.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DisableEnhancedMonitoringRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> shardLevelMetrics = new ArrayList();
    private String streamName;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DisableEnhancedMonitoringRequest)) {
            return false;
        }
        DisableEnhancedMonitoringRequest disableEnhancedMonitoringRequest = (DisableEnhancedMonitoringRequest) obj;
        if (disableEnhancedMonitoringRequest.getStreamName() == null) {
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
        if (disableEnhancedMonitoringRequest.getStreamName() != null && !disableEnhancedMonitoringRequest.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (disableEnhancedMonitoringRequest.getShardLevelMetrics() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getShardLevelMetrics() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (disableEnhancedMonitoringRequest.getShardLevelMetrics() == null || disableEnhancedMonitoringRequest.getShardLevelMetrics().equals(getShardLevelMetrics())) {
            return true;
        }
        return false;
    }

    public List<String> getShardLevelMetrics() {
        return this.shardLevelMetrics;
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
        if (getShardLevelMetrics() != null) {
            i2 = getShardLevelMetrics().hashCode();
        }
        return i3 + i2;
    }

    public void setShardLevelMetrics(Collection<String> collection) {
        if (collection == null) {
            this.shardLevelMetrics = null;
        } else {
            this.shardLevelMetrics = new ArrayList(collection);
        }
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
        if (getShardLevelMetrics() != null) {
            StringBuilder k3 = C13555b.m33972k("ShardLevelMetrics: ");
            k3.append(getShardLevelMetrics());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DisableEnhancedMonitoringRequest withShardLevelMetrics(String... strArr) {
        if (getShardLevelMetrics() == null) {
            this.shardLevelMetrics = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.shardLevelMetrics.add(add);
        }
        return this;
    }

    public DisableEnhancedMonitoringRequest withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public DisableEnhancedMonitoringRequest withShardLevelMetrics(Collection<String> collection) {
        setShardLevelMetrics(collection);
        return this;
    }
}
