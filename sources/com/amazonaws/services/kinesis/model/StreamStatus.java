package com.amazonaws.services.kinesis.model;

import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;

public enum StreamStatus {
    CREATING("CREATING"),
    DELETING("DELETING"),
    ACTIVE("ACTIVE"),
    UPDATING("UPDATING");
    
    private static final Map<String, StreamStatus> enumMap = null;
    private String value;

    /* access modifiers changed from: public */
    static {
        StreamStatus streamStatus;
        StreamStatus streamStatus2;
        StreamStatus streamStatus3;
        StreamStatus streamStatus4;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CREATING", streamStatus);
        hashMap.put("DELETING", streamStatus2);
        hashMap.put("ACTIVE", streamStatus3);
        hashMap.put("UPDATING", streamStatus4);
    }

    private StreamStatus(String str) {
        this.value = str;
    }

    public static StreamStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, StreamStatus> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot create enum from ", str, " value!"));
    }

    public String toString() {
        return this.value;
    }
}
