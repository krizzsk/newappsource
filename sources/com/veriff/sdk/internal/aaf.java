package com.veriff.sdk.internal;

public enum aaf {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: l */
    public final int f53335l;

    private aaf(int i) {
        this.f53335l = i;
    }

    /* renamed from: a */
    public static aaf m50016a(int i) {
        for (aaf aaf : values()) {
            if (aaf.f53335l == i) {
                return aaf;
            }
        }
        return null;
    }
}
