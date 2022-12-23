package com.veriff.sdk.internal;

import java.io.Closeable;

/* renamed from: com.veriff.sdk.internal.yv */
public abstract class C22759yv implements Closeable {
    /* renamed from: a */
    public static C22759yv m55785a(C22742yn ynVar, byte[] bArr) {
        return m55784a(ynVar, (long) bArr.length, new abi().mo53877c(bArr));
    }

    /* renamed from: a */
    public abstract C22742yn mo54031a();

    /* renamed from: b */
    public abstract long mo54032b();

    /* renamed from: c */
    public abstract abk mo54033c();

    public void close() {
        C22766za.m55834a((Closeable) mo54033c());
    }

    /* renamed from: a */
    public static C22759yv m55784a(final C22742yn ynVar, final long j, final abk abk) {
        if (abk != null) {
            return new C22759yv() {
                /* renamed from: a */
                public C22742yn mo54031a() {
                    return C22742yn.this;
                }

                /* renamed from: b */
                public long mo54032b() {
                    return j;
                }

                /* renamed from: c */
                public abk mo54033c() {
                    return abk;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
