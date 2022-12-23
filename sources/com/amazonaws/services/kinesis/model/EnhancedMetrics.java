package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EnhancedMetrics implements Serializable {
    private List<String> shardLevelMetrics = new ArrayList();

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof EnhancedMetrics)) {
            return false;
        }
        EnhancedMetrics enhancedMetrics = (EnhancedMetrics) obj;
        if (enhancedMetrics.getShardLevelMetrics() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getShardLevelMetrics() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (enhancedMetrics.getShardLevelMetrics() == null || enhancedMetrics.getShardLevelMetrics().equals(getShardLevelMetrics())) {
            return true;
        }
        return false;
    }

    public List<String> getShardLevelMetrics() {
        return this.shardLevelMetrics;
    }

    public int hashCode() {
        return 31 + (getShardLevelMetrics() == null ? 0 : getShardLevelMetrics().hashCode());
    }

    public void setShardLevelMetrics(Collection<String> collection) {
        if (collection == null) {
            this.shardLevelMetrics = null;
        } else {
            this.shardLevelMetrics = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getShardLevelMetrics() != null) {
            StringBuilder k2 = C13555b.m33972k("ShardLevelMetrics: ");
            k2.append(getShardLevelMetrics());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public EnhancedMetrics withShardLevelMetrics(String... strArr) {
        if (getShardLevelMetrics() == null) {
            this.shardLevelMetrics = new ArrayList(strArr.length);
        }
        for (String add : strArr) {
            this.shardLevelMetrics.add(add);
        }
        return this;
    }

    public EnhancedMetrics withShardLevelMetrics(Collection<String> collection) {
        setShardLevelMetrics(collection);
        return this;
    }
}
