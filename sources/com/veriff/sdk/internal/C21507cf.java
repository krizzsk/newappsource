package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.cf */
public enum C21507cf {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: d */
    public final int f54103d;

    private C21507cf(int i) {
        this.f54103d = i;
    }

    /* renamed from: a */
    public static boolean m51406a(int i) {
        return (i & NO_CACHE.f54103d) == 0;
    }

    /* renamed from: b */
    public static boolean m51407b(int i) {
        return (i & NO_STORE.f54103d) == 0;
    }

    /* renamed from: c */
    public static boolean m51408c(int i) {
        return (i & OFFLINE.f54103d) != 0;
    }
}
