package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import vg0.C25091a;

public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C25091a.f63298b),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object defaultDefault;

    private WireFormat$JavaType(Object obj) {
        this.defaultDefault = obj;
    }
}
