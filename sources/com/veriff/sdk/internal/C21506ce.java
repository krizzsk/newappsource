package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.ce */
public enum C21506ce {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: c */
    public final int f54098c;

    private C21506ce(int i) {
        this.f54098c = i;
    }

    /* renamed from: a */
    public static boolean m51404a(int i) {
        return (i & NO_CACHE.f54098c) == 0;
    }

    /* renamed from: b */
    public static boolean m51405b(int i) {
        return (i & NO_STORE.f54098c) == 0;
    }
}
