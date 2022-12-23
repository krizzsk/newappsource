package com.fyber.inneractive.sdk.protobuf;

/* renamed from: com.fyber.inneractive.sdk.protobuf.d */
public final class C3487d {

    /* renamed from: a */
    public static final Class<?> f12411a;

    /* renamed from: b */
    public static final boolean f12412b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f12411a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f12412b = z;
    }

    /* renamed from: a */
    public static boolean m8743a() {
        return f12411a != null && !f12412b;
    }
}
