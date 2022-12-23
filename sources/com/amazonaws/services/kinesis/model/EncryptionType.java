package com.amazonaws.services.kinesis.model;

import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;

public enum EncryptionType {
    NONE("NONE"),
    KMS("KMS");
    
    private static final Map<String, EncryptionType> enumMap = null;
    private String value;

    /* access modifiers changed from: public */
    static {
        EncryptionType encryptionType;
        EncryptionType encryptionType2;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("NONE", encryptionType);
        hashMap.put("KMS", encryptionType2);
    }

    private EncryptionType(String str) {
        this.value = str;
    }

    public static EncryptionType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, EncryptionType> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot create enum from ", str, " value!"));
    }

    public String toString() {
        return this.value;
    }
}
