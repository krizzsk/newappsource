package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaff */
public enum zzaff {
    DOUBLE(zzafg.DOUBLE, 1),
    FLOAT(zzafg.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzafg.BOOLEAN, 0),
    STRING(zzafg.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzafg.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzafg.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzafg zzt;

    private zzaff(zzafg zzafg, int i) {
        this.zzt = zzafg;
    }

    public final zzafg zza() {
        return this.zzt;
    }
}
