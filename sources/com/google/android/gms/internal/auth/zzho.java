package com.google.android.gms.internal.auth;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzho {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzee.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zzho(Object obj) {
        this.zzk = obj;
    }
}
