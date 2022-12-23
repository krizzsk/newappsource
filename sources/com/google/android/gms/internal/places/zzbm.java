package com.google.android.gms.internal.places;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzbm {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzw.class, zzw.class, zzw.zzeg),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzjp;
    private final Class<?> zzjq;
    private final Object zzjr;

    private zzbm(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzjp = cls;
        this.zzjq = cls2;
        this.zzjr = obj;
    }

    public final Class<?> zzbw() {
        return this.zzjq;
    }
}
