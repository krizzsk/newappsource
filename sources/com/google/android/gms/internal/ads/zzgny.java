package com.google.android.gms.internal.ads;

public enum zzgny {
    DOUBLE(zzgnz.DOUBLE, 1),
    FLOAT(zzgnz.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzgnz.BOOLEAN, 0),
    STRING(zzgnz.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzgnz.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzgnz.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzgnz zzt;

    private zzgny(zzgnz zzgnz, int i) {
        this.zzt = zzgnz;
    }

    public final zzgnz zza() {
        return this.zzt;
    }
}
