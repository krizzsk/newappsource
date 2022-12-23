package com.amazonaws.auth;

import com.usebutton.sdk.internal.util.DiskLruCache;

public enum SignatureVersion {
    V1(DiskLruCache.VERSION_1),
    V2("2");
    
    private String value;

    private SignatureVersion(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
