package com.veriff.sdk.internal;

import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24457h;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.qw */
public final class C22359qw implements C23588c<C22354qv> {

    /* renamed from: a */
    private final C25292a<C21895jw> f56415a;

    /* renamed from: b */
    private final C25292a<C22420rr> f56416b;

    /* renamed from: c */
    private final C25292a<C24426d> f56417c;

    /* renamed from: d */
    private final C25292a<xb$a> f56418d;

    /* renamed from: e */
    private final C25292a<C24457h> f56419e;

    public C22359qw(C25292a<C21895jw> aVar, C25292a<C22420rr> aVar2, C25292a<C24426d> aVar3, C25292a<xb$a> aVar4, C25292a<C24457h> aVar5) {
        this.f56415a = aVar;
        this.f56416b = aVar2;
        this.f56417c = aVar3;
        this.f56418d = aVar4;
        this.f56419e = aVar5;
    }

    /* renamed from: a */
    public C22354qv get() {
        return m54518a(this.f56415a.get(), this.f56416b.get(), this.f56417c.get(), this.f56418d.get(), this.f56419e.get());
    }

    /* renamed from: a */
    public static C22359qw m54519a(C25292a<C21895jw> aVar, C25292a<C22420rr> aVar2, C25292a<C24426d> aVar3, C25292a<xb$a> aVar4, C25292a<C24457h> aVar5) {
        return new C22359qw(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: a */
    public static C22354qv m54518a(C21895jw jwVar, C22420rr rrVar, C24426d dVar, xb$a xb_a, C24457h hVar) {
        return new C22354qv(jwVar, rrVar, dVar, xb_a, hVar);
    }
}
