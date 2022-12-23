package com.google.android.gms.internal.measurement;

public enum zznd {
    DOUBLE(zzne.DOUBLE, 1),
    FLOAT(zzne.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzne.BOOLEAN, 0),
    STRING(zzne.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzne.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzne.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzne zzt;

    private zznd(zzne zzne, int i) {
        this.zzt = zzne;
    }

    public final zzne zza() {
        return this.zzt;
    }
}
