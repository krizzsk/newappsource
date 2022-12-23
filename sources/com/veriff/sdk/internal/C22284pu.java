package com.veriff.sdk.internal;

import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.pu */
public final class C22284pu implements C23588c<C22281ps> {

    /* renamed from: a */
    private final C25292a<C21900jz> f56203a;

    /* renamed from: b */
    private final C25292a<C22243pa> f56204b;

    /* renamed from: c */
    private final C25292a<C24426d> f56205c;

    /* renamed from: d */
    private final C25292a<xb$a> f56206d;

    /* renamed from: e */
    private final C25292a<C21895jw> f56207e;

    public C22284pu(C25292a<C21900jz> aVar, C25292a<C22243pa> aVar2, C25292a<C24426d> aVar3, C25292a<xb$a> aVar4, C25292a<C21895jw> aVar5) {
        this.f56203a = aVar;
        this.f56204b = aVar2;
        this.f56205c = aVar3;
        this.f56206d = aVar4;
        this.f56207e = aVar5;
    }

    /* renamed from: a */
    public C22281ps get() {
        return m54313a(this.f56203a.get(), this.f56204b.get(), this.f56205c.get(), this.f56206d.get(), this.f56207e.get());
    }

    /* renamed from: a */
    public static C22284pu m54314a(C25292a<C21900jz> aVar, C25292a<C22243pa> aVar2, C25292a<C24426d> aVar3, C25292a<xb$a> aVar4, C25292a<C21895jw> aVar5) {
        return new C22284pu(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: a */
    public static C22281ps m54313a(C21900jz jzVar, C22243pa paVar, C24426d dVar, xb$a xb_a, C21895jw jwVar) {
        return new C22281ps(jzVar, paVar, dVar, xb_a, jwVar);
    }
}
