package com.amazonaws.services.kinesis.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class Tag implements Serializable {
    private String key;
    private String value;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if (tag.getKey() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getKey() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (tag.getKey() != null && !tag.getKey().equals(getKey())) {
            return false;
        }
        if (tag.getValue() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getValue() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (tag.getValue() == null || tag.getValue().equals(getValue())) {
            return true;
        }
        return false;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (getKey() == null) {
            i = 0;
        } else {
            i = getKey().hashCode();
        }
        int i3 = (i + 31) * 31;
        if (getValue() != null) {
            i2 = getValue().hashCode();
        }
        return i3 + i2;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getKey() != null) {
            StringBuilder k2 = C13555b.m33972k("Key: ");
            k2.append(getKey());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getValue() != null) {
            StringBuilder k3 = C13555b.m33972k("Value: ");
            k3.append(getValue());
            k.append(k3.toString());
        }
        k.append("}");
        return k.toString();
    }

    public Tag withKey(String str) {
        this.key = str;
        return this;
    }

    public Tag withValue(String str) {
        this.value = str;
        return this;
    }
}
