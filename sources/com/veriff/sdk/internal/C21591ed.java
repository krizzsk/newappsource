package com.veriff.sdk.internal;

import android.content.Context;
import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.ed */
public final class C21591ed implements C23588c<C22746yp> {

    /* renamed from: a */
    private final C25292a<C22746yp> f54330a;

    /* renamed from: b */
    private final C25292a<C24426d> f54331b;

    /* renamed from: c */
    private final C25292a<Context> f54332c;

    public C21591ed(C25292a<C22746yp> aVar, C25292a<C24426d> aVar2, C25292a<Context> aVar3) {
        this.f54330a = aVar;
        this.f54331b = aVar2;
        this.f54332c = aVar3;
    }

    /* renamed from: a */
    public C22746yp get() {
        return m51646a(this.f54330a.get(), this.f54331b.get(), this.f54332c.get());
    }

    /* renamed from: a */
    public static C21591ed m51645a(C25292a<C22746yp> aVar, C25292a<C24426d> aVar2, C25292a<Context> aVar3) {
        return new C21591ed(aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public static C22746yp m51646a(C22746yp ypVar, C24426d dVar, Context context) {
        C22746yp a = C21584dx.f54319a.mo54600a(ypVar, dVar, context);
        C13641g.m34118f(a);
        return a;
    }
}
