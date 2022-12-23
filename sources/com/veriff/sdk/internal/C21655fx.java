package com.veriff.sdk.internal;

import ie0.C23588c;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.fx */
public final class C21655fx implements C23588c<C21650fw> {

    /* renamed from: a */
    private final C25292a<xb$a> f54701a;

    /* renamed from: b */
    private final C25292a<C21636fm> f54702b;

    /* renamed from: c */
    private final C25292a<C21636fm> f54703c;

    public C21655fx(C25292a<xb$a> aVar, C25292a<C21636fm> aVar2, C25292a<C21636fm> aVar3) {
        this.f54701a = aVar;
        this.f54702b = aVar2;
        this.f54703c = aVar3;
    }

    /* renamed from: a */
    public C21650fw get() {
        return m52571a(this.f54701a.get(), this.f54702b.get(), this.f54703c.get());
    }

    /* renamed from: a */
    public static C21655fx m52572a(C25292a<xb$a> aVar, C25292a<C21636fm> aVar2, C25292a<C21636fm> aVar3) {
        return new C21655fx(aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public static C21650fw m52571a(xb$a xb_a, C21636fm fmVar, C21636fm fmVar2) {
        return new C21650fw(xb_a, fmVar, fmVar2);
    }
}
