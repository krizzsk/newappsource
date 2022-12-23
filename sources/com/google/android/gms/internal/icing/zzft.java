package com.google.android.gms.internal.icing;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzft {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzcf.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private zzft(Object obj) {
        this.zzj = obj;
    }
}
