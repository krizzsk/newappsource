package com.amazonaws.services.kinesis.model;

import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;

public enum ScalingType {
    UNIFORM_SCALING("UNIFORM_SCALING");
    
    private static final Map<String, ScalingType> enumMap = null;
    private String value;

    /* access modifiers changed from: public */
    static {
        ScalingType scalingType;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("UNIFORM_SCALING", scalingType);
    }

    private ScalingType(String str) {
        this.value = str;
    }

    public static ScalingType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ScalingType> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot create enum from ", str, " value!"));
    }

    public String toString() {
        return this.value;
    }
}
