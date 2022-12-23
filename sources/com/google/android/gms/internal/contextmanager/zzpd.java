package com.google.android.gms.internal.contextmanager;

public enum zzpd {
    DOUBLE(zzpe.DOUBLE, 1),
    FLOAT(zzpe.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzpe.BOOLEAN, 0),
    STRING(zzpe.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzpe.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzpe.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzpe zzt;

    private zzpd(zzpe zzpe, int i) {
        this.zzt = zzpe;
    }

    public final zzpe zza() {
        return this.zzt;
    }
}
