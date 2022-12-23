package com.amazonaws.services.kinesis.model;

import java.io.Serializable;

public class GetShardIteratorResult implements Serializable {
    private String shardIterator;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetShardIteratorResult)) {
            return false;
        }
        GetShardIteratorResult getShardIteratorResult = (GetShardIteratorResult) obj;
        if (getShardIteratorResult.getShardIterator() == null) {
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
        if (getShardIteratorResult.getShardIterator() == null || getShardIteratorResult.getShardIterator().equals(getShardIterator())) {
            return true;
        }
        return false;
    }

    public String getShardIterator() {
        return this.shardIterator;
    }

    public int hashCode() {
        return 31 + (getShardIterator() == null ? 0 : getShardIterator().hashCode());
    }

    public void setShardIterator(String str) {
        this.shardIterator = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getShardIterator() != null) {
            StringBuilder k2 = C13555b.m33972k("ShardIterator: ");
            k2.append(getShardIterator());
            k.append(k2.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetShardIteratorResult withShardIterator(String str) {
        this.shardIterator = str;
        return this;
    }
}
