package com.amazonaws.services.kinesis.model;

import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;

public enum ShardIteratorType {
    AT_SEQUENCE_NUMBER("AT_SEQUENCE_NUMBER"),
    AFTER_SEQUENCE_NUMBER("AFTER_SEQUENCE_NUMBER"),
    TRIM_HORIZON("TRIM_HORIZON"),
    LATEST("LATEST"),
    AT_TIMESTAMP("AT_TIMESTAMP");
    
    private static final Map<String, ShardIteratorType> enumMap = null;
    private String value;

    /* access modifiers changed from: public */
    static {
        ShardIteratorType shardIteratorType;
        ShardIteratorType shardIteratorType2;
        ShardIteratorType shardIteratorType3;
        ShardIteratorType shardIteratorType4;
        ShardIteratorType shardIteratorType5;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("AT_SEQUENCE_NUMBER", shardIteratorType);
        hashMap.put("AFTER_SEQUENCE_NUMBER", shardIteratorType2);
        hashMap.put("TRIM_HORIZON", shardIteratorType3);
        hashMap.put("LATEST", shardIteratorType4);
        hashMap.put("AT_TIMESTAMP", shardIteratorType5);
    }

    private ShardIteratorType(String str) {
        this.value = str;
    }

    public static ShardIteratorType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ShardIteratorType> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot create enum from ", str, " value!"));
    }

    public String toString() {
        return this.value;
    }
}
