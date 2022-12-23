package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(ByteString.f36798b),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object defaultDefault;

    private WireFormat$JavaType(Object obj) {
        this.defaultDefault = obj;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }
}
