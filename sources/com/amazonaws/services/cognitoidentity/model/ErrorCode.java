package com.amazonaws.services.cognitoidentity.model;

import java.util.HashMap;
import java.util.Map;
import p358af.C13437d;

public enum ErrorCode {
    AccessDenied("AccessDenied"),
    InternalServerError("InternalServerError");
    
    private static final Map<String, ErrorCode> enumMap = null;
    private String value;

    /* access modifiers changed from: public */
    static {
        ErrorCode errorCode;
        ErrorCode errorCode2;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("AccessDenied", errorCode);
        hashMap.put("InternalServerError", errorCode2);
    }

    private ErrorCode(String str) {
        this.value = str;
    }

    public static ErrorCode fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ErrorCode> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException(C13437d.m33706k("Cannot create enum from ", str, " value!"));
    }

    public String toString() {
        return this.value;
    }
}
