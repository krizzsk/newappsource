package com.veriff.sdk.views.base.verification;

import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22233ot;
import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24457h;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.views.base.verification.d */
public final class C22817d implements C23588c<C22816c> {

    /* renamed from: a */
    private final C25292a<C22233ot> f57898a;

    /* renamed from: b */
    private final C25292a<C24426d> f57899b;

    /* renamed from: c */
    private final C25292a<C21895jw> f57900c;

    /* renamed from: d */
    private final C25292a<C24457h> f57901d;

    public C22817d(C25292a<C22233ot> aVar, C25292a<C24426d> aVar2, C25292a<C21895jw> aVar3, C25292a<C24457h> aVar4) {
        this.f57898a = aVar;
        this.f57899b = aVar2;
        this.f57900c = aVar3;
        this.f57901d = aVar4;
    }

    /* renamed from: a */
    public C22816c get() {
        return m56094a(this.f57898a.get(), this.f57899b.get(), this.f57900c.get(), this.f57901d.get());
    }

    /* renamed from: a */
    public static C22817d m56095a(C25292a<C22233ot> aVar, C25292a<C24426d> aVar2, C25292a<C21895jw> aVar3, C25292a<C24457h> aVar4) {
        return new C22817d(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: a */
    public static C22816c m56094a(C22233ot otVar, C24426d dVar, C21895jw jwVar, C24457h hVar) {
        return new C22816c(otVar, dVar, jwVar, hVar);
    }
}
