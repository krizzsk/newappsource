package com.fyber.inneractive.sdk.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.protobuf.b0 */
public enum C3480b0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C3508i.class, C3508i.class, C3508i.f12443b),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: a */
    public final Class<?> f12400a;

    /* renamed from: b */
    public final Object f12401b;

    /* access modifiers changed from: public */
    C3480b0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f12400a = cls2;
        this.f12401b = obj;
    }
}
