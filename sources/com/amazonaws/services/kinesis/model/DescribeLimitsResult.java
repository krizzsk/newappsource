package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class DescribeLimitsResult implements Serializable {
    private Integer openShardCount;
    private Integer shardLimit;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLimitsResult)) {
            return false;
        }
        DescribeLimitsResult describeLimitsResult = (DescribeLimitsResult) obj;
        if (describeLimitsResult.getShardLimit() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getShardLimit() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (describeLimitsResult.getShardLimit() != null && !describeLimitsResult.getShardLimit().equals(getShardLimit())) {
            return false;
        }
        if (describeLimitsResult.getOpenShardCount() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getOpenShardCount() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (describeLimitsResult.getOpenShardCount() == null || describeLimitsResult.getOpenShardCount().equals(getOpenShardCount())) {
            return true;
        }
        return false;
    }

    public Integer getOpenShardCount() {
        return this.openShardCount;
    }

    public Integer getShardLimit() {
        return this.shardLimit;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getShardLimit() == null) {
            i = 0;
        } else {
            i = getShardLimit().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getOpenShardCount() != null) {
            i2 = getOpenShardCount().hashCode();
        }
        return i3 + i2;
    }

    public void setOpenShardCount(Integer num) {
        this.openShardCount = num;
    }

    public void setShardLimit(Integer num) {
        this.shardLimit = num;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getShardLimit() != null) {
            StringBuilder k2 = C13555b.m33972k("ShardLimit: ");
            k2.append(getShardLimit());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getOpenShardCount() != null) {
            StringBuilder k3 = C13555b.m33972k("OpenShardCount: ");
            k3.append(getOpenShardCount());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public DescribeLimitsResult withOpenShardCount(Integer num) {
        this.openShardCount = num;
        return this;
    }

    public DescribeLimitsResult withShardLimit(Integer num) {
        this.shardLimit = num;
        return this;
    }
}
