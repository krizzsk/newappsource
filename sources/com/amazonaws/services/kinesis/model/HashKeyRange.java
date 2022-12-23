package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class HashKeyRange implements Serializable {
    private String endingHashKey;
    private String startingHashKey;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HashKeyRange)) {
            return false;
        }
        HashKeyRange hashKeyRange = (HashKeyRange) obj;
        if (hashKeyRange.getStartingHashKey() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getStartingHashKey() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (hashKeyRange.getStartingHashKey() != null && !hashKeyRange.getStartingHashKey().equals(getStartingHashKey())) {
            return false;
        }
        if (hashKeyRange.getEndingHashKey() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getEndingHashKey() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (hashKeyRange.getEndingHashKey() == null || hashKeyRange.getEndingHashKey().equals(getEndingHashKey())) {
            return true;
        }
        return false;
    }

    public String getEndingHashKey() {
        return this.endingHashKey;
    }

    public String getStartingHashKey() {
        return this.startingHashKey;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getStartingHashKey() == null) {
            i = 0;
        } else {
            i = getStartingHashKey().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getEndingHashKey() != null) {
            i2 = getEndingHashKey().hashCode();
        }
        return i3 + i2;
    }

    public void setEndingHashKey(String str) {
        this.endingHashKey = str;
    }

    public void setStartingHashKey(String str) {
        this.startingHashKey = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getStartingHashKey() != null) {
            StringBuilder k2 = C13555b.m33972k("StartingHashKey: ");
            k2.append(getStartingHashKey());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getEndingHashKey() != null) {
            StringBuilder k3 = C13555b.m33972k("EndingHashKey: ");
            k3.append(getEndingHashKey());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public HashKeyRange withEndingHashKey(String str) {
        this.endingHashKey = str;
        return this;
    }

    public HashKeyRange withStartingHashKey(String str) {
        this.startingHashKey = str;
        return this;
    }
}
