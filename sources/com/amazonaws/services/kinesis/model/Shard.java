package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class Shard implements Serializable {
    private String adjacentParentShardId;
    private HashKeyRange hashKeyRange;
    private String parentShardId;
    private SequenceNumberRange sequenceNumberRange;
    private String shardId;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Shard)) {
            return false;
        }
        Shard shard = (Shard) obj;
        if (shard.getShardId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getShardId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (shard.getShardId() != null && !shard.getShardId().equals(getShardId())) {
            return false;
        }
        if (shard.getParentShardId() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getParentShardId() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (shard.getParentShardId() != null && !shard.getParentShardId().equals(getParentShardId())) {
            return false;
        }
        if (shard.getAdjacentParentShardId() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getAdjacentParentShardId() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (shard.getAdjacentParentShardId() != null && !shard.getAdjacentParentShardId().equals(getAdjacentParentShardId())) {
            return false;
        }
        if (shard.getHashKeyRange() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getHashKeyRange() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (shard.getHashKeyRange() != null && !shard.getHashKeyRange().equals(getHashKeyRange())) {
            return false;
        }
        if (shard.getSequenceNumberRange() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (getSequenceNumberRange() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 ^ z11) {
            return false;
        }
        if (shard.getSequenceNumberRange() == null || shard.getSequenceNumberRange().equals(getSequenceNumberRange())) {
            return true;
        }
        return false;
    }

    public String getAdjacentParentShardId() {
        return this.adjacentParentShardId;
    }

    public HashKeyRange getHashKeyRange() {
        return this.hashKeyRange;
    }

    public String getParentShardId() {
        return this.parentShardId;
    }

    public SequenceNumberRange getSequenceNumberRange() {
        return this.sequenceNumberRange;
    }

    public String getShardId() {
        return this.shardId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (getShardId() == null) {
            i = 0;
        } else {
            i = getShardId().hashCode();
        }
        int i6 = (i + 31) * 31;
        if (getParentShardId() == null) {
            i2 = 0;
        } else {
            i2 = getParentShardId().hashCode();
        }
        int i7 = (i6 + i2) * 31;
        if (getAdjacentParentShardId() == null) {
            i3 = 0;
        } else {
            i3 = getAdjacentParentShardId().hashCode();
        }
        int i8 = (i7 + i3) * 31;
        if (getHashKeyRange() == null) {
            i4 = 0;
        } else {
            i4 = getHashKeyRange().hashCode();
        }
        int i9 = (i8 + i4) * 31;
        if (getSequenceNumberRange() != null) {
            i5 = getSequenceNumberRange().hashCode();
        }
        return i9 + i5;
    }

    public void setAdjacentParentShardId(String str) {
        this.adjacentParentShardId = str;
    }

    public void setHashKeyRange(HashKeyRange hashKeyRange2) {
        this.hashKeyRange = hashKeyRange2;
    }

    public void setParentShardId(String str) {
        this.parentShardId = str;
    }

    public void setSequenceNumberRange(SequenceNumberRange sequenceNumberRange2) {
        this.sequenceNumberRange = sequenceNumberRange2;
    }

    public void setShardId(String str) {
        this.shardId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getShardId() != null) {
            StringBuilder k2 = C13555b.m33972k("ShardId: ");
            k2.append(getShardId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getParentShardId() != null) {
            StringBuilder k3 = C13555b.m33972k("ParentShardId: ");
            k3.append(getParentShardId());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getAdjacentParentShardId() != null) {
            StringBuilder k4 = C13555b.m33972k("AdjacentParentShardId: ");
            k4.append(getAdjacentParentShardId());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getHashKeyRange() != null) {
            StringBuilder k5 = C13555b.m33972k("HashKeyRange: ");
            k5.append(getHashKeyRange());
            k5.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k5.toString());
        }
        if (getSequenceNumberRange() != null) {
            StringBuilder k6 = C13555b.m33972k("SequenceNumberRange: ");
            k6.append(getSequenceNumberRange());
            k.append(k6.toString());
        }
        k.append("}");
        return k.toString();
    }

    public Shard withAdjacentParentShardId(String str) {
        this.adjacentParentShardId = str;
        return this;
    }

    public Shard withHashKeyRange(HashKeyRange hashKeyRange2) {
        this.hashKeyRange = hashKeyRange2;
        return this;
    }

    public Shard withParentShardId(String str) {
        this.parentShardId = str;
        return this;
    }

    public Shard withSequenceNumberRange(SequenceNumberRange sequenceNumberRange2) {
        this.sequenceNumberRange = sequenceNumberRange2;
        return this;
    }

    public Shard withShardId(String str) {
        this.shardId = str;
        return this;
    }
}
