package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EnableEnhancedMonitoringResult implements Serializable {
    private List<String> currentShardLevelMetrics = new ArrayList();
    private List<String> desiredShardLevelMetrics = new ArrayList();
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
        if (obj == null || !(obj instanceof EnableEnhancedMonitoringResult)) {
            return false;
        }
        EnableEnhancedMonitoringResult enableEnhancedMonitoringResult = (EnableEnhancedMonitoringResult) obj;
        if (enableEnhancedMonitoringResult.getStreamName() == null) {
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
        if (enableEnhancedMonitoringResult.getStreamName() != null && !enableEnhancedMonitoringResult.getStreamName().equals(getStreamName())) {
            return false;
        }
        if (enableEnhancedMonitoringResult.getCurrentShardLevelMetrics() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getCurrentShardLevelMetrics() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (enableEnhancedMonitoringResult.getCurrentShardLevelMetrics() != null && !enableEnhancedMonitoringResult.getCurrentShardLevelMetrics().equals(getCurrentShardLevelMetrics())) {
            return false;
        }
        if (enableEnhancedMonitoringResult.getDesiredShardLevelMetrics() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getDesiredShardLevelMetrics() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (enableEnhancedMonitoringResult.getDesiredShardLevelMetrics() == null || enableEnhancedMonitoringResult.getDesiredShardLevelMetrics().equals(getDesiredShardLevelMetrics())) {
            return true;
        }
        return false;
    }

    public List<String> getCurrentShardLevelMetrics() {
        return this.currentShardLevelMetrics;
    }

    public List<String> getDesiredShardLevelMetrics() {
        return this.desiredShardLevelMetrics;
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
        if (getCurrentShardLevelMetrics() == null) {
            i2 = 0;
        } else {
            i2 = getCurrentShardLevelMetrics().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getDesiredShardLevelMetrics() != null) {
            i3 = getDesiredShardLevelMetrics().hashCode();
        }
        return i5 + i3;
    }

    public void setCurrentShardLevelMetrics(Collection<String> collection) {
        if (collection == null) {
            this.currentShardLevelMetrics = null;
        } else {
            this.currentShardLevelMetrics = new ArrayList(collection);
        }
    }

    public void setDesiredShardLevelMetrics(Collection<String> collection) {
        if (collection == null) {
            this.desiredShardLevelMetrics = null;
        } else {
            this.desiredShardLevelMetrics = new ArrayList(collection);
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
        if (getCurrentShardLevelMetrics() != null) {
            StringBuilder k3 = C13555b.m33972k("CurrentShardLevelMetrics: ");
            k3.append(getCurrentShardLevelMetrics());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getDesiredShardLevelMetrics() != null) {
            StringBuilder k4 = C13555b.m33972k("DesiredShardLevelMetrics: ");
            k4.append(getDesiredShardLevelMetrics());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public EnableEnhancedMonitoringResult withCurrentShardLevelMetrics(String... strArr) {
        if (getCurrentShardLevelMetrics() == null) {
            this.currentShardLevelMetrics = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.currentShardLevelMetrics.add(add);
        }
        return this;
    }

    public EnableEnhancedMonitoringResult withDesiredShardLevelMetrics(String... strArr) {
        if (getDesiredShardLevelMetrics() == null) {
            this.desiredShardLevelMetrics = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.desiredShardLevelMetrics.add(add);
        }
        return this;
    }

    public EnableEnhancedMonitoringResult withStreamName(String str) {
        this.streamName = str;
        return this;
    }

    public EnableEnhancedMonitoringResult withCurrentShardLevelMetrics(Collection<String> collection) {
        setCurrentShardLevelMetrics(collection);
        return this;
    }

    public EnableEnhancedMonitoringResult withDesiredShardLevelMetrics(Collection<String> collection) {
        setDesiredShardLevelMetrics(collection);
        return this;
    }
}
