package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListShardsResult implements Serializable {
    private String nextToken;
    private List<Shard> shards = new ArrayList();

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListShardsResult)) {
            return false;
        }
        ListShardsResult listShardsResult = (ListShardsResult) obj;
        if (listShardsResult.getShards() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getShards() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (listShardsResult.getShards() != null && !listShardsResult.getShards().equals(getShards())) {
            return false;
        }
        if (listShardsResult.getNextToken() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getNextToken() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listShardsResult.getNextToken() == null || listShardsResult.getNextToken().equals(getNextToken())) {
            return true;
        }
        return false;
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<Shard> getShards() {
        return this.shards;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getShards() == null) {
            i = 0;
        } else {
            i = getShards().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getNextToken() != null) {
            i2 = getNextToken().hashCode();
        }
        return i3 + i2;
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setShards(Collection<Shard> collection) {
        if (collection == null) {
            this.shards = null;
        } else {
            this.shards = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getShards() != null) {
            StringBuilder k2 = C13555b.m33972k("Shards: ");
            k2.append(getShards());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getNextToken() != null) {
            StringBuilder k3 = C13555b.m33972k("NextToken: ");
            k3.append(getNextToken());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public ListShardsResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListShardsResult withShards(Shard... shardArr) {
        if (getShards() == null) {
            this.shards = new ArrayList(shardArr.length);
        }
        for (Shard add : shardArr) {
            this.shards.add(add);
        }
        return this;
    }

    public ListShardsResult withShards(Collection<Shard> collection) {
        setShards(collection);
        return this;
    }
}
