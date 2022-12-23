package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum zzhg {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzdb.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzk;

    private zzhg(Object obj) {
        this.zzk = obj;
    }
}
