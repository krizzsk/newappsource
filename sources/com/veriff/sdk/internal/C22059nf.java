package com.veriff.sdk.internal;

import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.nf */
public final class C22059nf implements C23588c<C22054nd> {

    /* renamed from: a */
    private final C25292a<xb$a> f55645a;

    /* renamed from: b */
    private final C25292a<C24426d> f55646b;

    public C22059nf(C25292a<xb$a> aVar, C25292a<C24426d> aVar2) {
        this.f55645a = aVar;
        this.f55646b = aVar2;
    }

    /* renamed from: a */
    public C22054nd get() {
        return m53793a(this.f55645a.get(), this.f55646b.get());
    }

    /* renamed from: a */
    public static C22059nf m53794a(C25292a<xb$a> aVar, C25292a<C24426d> aVar2) {
        return new C22059nf(aVar, aVar2);
    }

    /* renamed from: a */
    public static C22054nd m53793a(xb$a xb_a, C24426d dVar) {
        return new C22054nd(xb_a, dVar);
    }
}
