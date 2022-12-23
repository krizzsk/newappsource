package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzpe {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzld.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zzpe(Object obj) {
        this.zzk = obj;
    }
}
