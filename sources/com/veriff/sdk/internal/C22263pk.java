package com.veriff.sdk.internal;

import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.pk */
public final class C22263pk implements C23588c<C22261pi> {

    /* renamed from: a */
    private final C25292a<C24426d> f56129a;

    /* renamed from: b */
    private final C25292a<C21639fp> f56130b;

    /* renamed from: c */
    private final C25292a<C21900jz> f56131c;

    public C22263pk(C25292a<C24426d> aVar, C25292a<C21639fp> aVar2, C25292a<C21900jz> aVar3) {
        this.f56129a = aVar;
        this.f56130b = aVar2;
        this.f56131c = aVar3;
    }

    /* renamed from: a */
    public C22261pi get() {
        return m54215a(this.f56129a.get(), this.f56130b.get(), this.f56131c.get());
    }

    /* renamed from: a */
    public static C22263pk m54216a(C25292a<C24426d> aVar, C25292a<C21639fp> aVar2, C25292a<C21900jz> aVar3) {
        return new C22263pk(aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public static C22261pi m54215a(C24426d dVar, C21639fp fpVar, C21900jz jzVar) {
        return new C22261pi(dVar, fpVar, jzVar);
    }
}
