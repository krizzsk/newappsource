package com.veriff.sdk.internal;

import android.content.Context;
import ie0.C23588c;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.xr */
public final class C22701xr implements C23588c<C22700xq> {

    /* renamed from: a */
    private final C25292a<Context> f57384a;

    /* renamed from: b */
    private final C25292a<C22696xo> f57385b;

    public C22701xr(C25292a<Context> aVar, C25292a<C22696xo> aVar2) {
        this.f57384a = aVar;
        this.f57385b = aVar2;
    }

    /* renamed from: a */
    public C22700xq get() {
        return m55394a(this.f57384a.get(), this.f57385b.get());
    }

    /* renamed from: a */
    public static C22701xr m55395a(C25292a<Context> aVar, C25292a<C22696xo> aVar2) {
        return new C22701xr(aVar, aVar2);
    }

    /* renamed from: a */
    public static C22700xq m55394a(Context context, C22696xo xoVar) {
        return new C22700xq(context, xoVar);
    }
}
