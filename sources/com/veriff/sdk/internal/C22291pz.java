package com.veriff.sdk.internal;

import com.veriff.sdk.views.C22808a;
import com.veriff.sdk.views.base.verification.C22818e;
import he0.C23454a;
import ie0.C23587b;
import ie0.C23588c;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.pz */
public final class C22291pz implements C23588c<C22290py> {

    /* renamed from: a */
    private final C25292a<C22808a> f56243a;

    /* renamed from: b */
    private final C25292a<C22295qc> f56244b;

    /* renamed from: c */
    private final C25292a<pr$b> f56245c;

    /* renamed from: d */
    private final C25292a<C21645fu> f56246d;

    /* renamed from: e */
    private final C25292a<C22818e> f56247e;

    /* renamed from: f */
    private final C25292a<C22243pa> f56248f;

    public C22291pz(C25292a<C22808a> aVar, C25292a<C22295qc> aVar2, C25292a<pr$b> aVar3, C25292a<C21645fu> aVar4, C25292a<C22818e> aVar5, C25292a<C22243pa> aVar6) {
        this.f56243a = aVar;
        this.f56244b = aVar2;
        this.f56245c = aVar3;
        this.f56246d = aVar4;
        this.f56247e = aVar5;
        this.f56248f = aVar6;
    }

    /* renamed from: a */
    public C22290py get() {
        return m54342a(this.f56243a.get(), this.f56244b.get(), C23587b.m57772a(this.f56245c), this.f56246d.get(), this.f56247e.get(), this.f56248f.get());
    }

    /* renamed from: a */
    public static C22291pz m54343a(C25292a<C22808a> aVar, C25292a<C22295qc> aVar2, C25292a<pr$b> aVar3, C25292a<C21645fu> aVar4, C25292a<C22818e> aVar5, C25292a<C22243pa> aVar6) {
        return new C22291pz(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    /* renamed from: a */
    public static C22290py m54342a(C22808a aVar, C22295qc qcVar, C23454a<pr$b> aVar2, C21645fu fuVar, C22818e eVar, C22243pa paVar) {
        return new C22290py(aVar, qcVar, aVar2, fuVar, eVar, paVar);
    }
}
