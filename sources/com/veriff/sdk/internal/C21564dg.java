package com.veriff.sdk.internal;

import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.dg */
public final class C21564dg implements C23588c<xb$a> {

    /* renamed from: a */
    private final C25292a<C22746yp> f54301a;

    /* renamed from: b */
    private final C25292a<C21450bi> f54302b;

    /* renamed from: c */
    private final C25292a<C24426d> f54303c;

    public C21564dg(C25292a<C22746yp> aVar, C25292a<C21450bi> aVar2, C25292a<C24426d> aVar3) {
        this.f54301a = aVar;
        this.f54302b = aVar2;
        this.f54303c = aVar3;
    }

    /* renamed from: a */
    public xb$a get() {
        return m51583a(this.f54301a.get(), this.f54302b.get(), this.f54303c.get());
    }

    /* renamed from: a */
    public static C21564dg m51582a(C25292a<C22746yp> aVar, C25292a<C21450bi> aVar2, C25292a<C24426d> aVar3) {
        return new C21564dg(aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public static xb$a m51583a(C22746yp ypVar, C21450bi biVar, C24426d dVar) {
        xb$a a = C21562df.f54299a.mo54578a(ypVar, biVar, dVar);
        C13641g.m34118f(a);
        return a;
    }
}
