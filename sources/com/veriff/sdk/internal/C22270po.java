package com.veriff.sdk.internal;

import android.content.Context;
import com.veriff.sdk.views.base.verification.C22816c;
import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.po */
public final class C22270po implements C23588c<C22267pn> {

    /* renamed from: a */
    private final C25292a<Context> f56160a;

    /* renamed from: b */
    private final C25292a<C24426d> f56161b;

    /* renamed from: c */
    private final C25292a<C21639fp> f56162c;

    /* renamed from: d */
    private final C25292a<C21789ix> f56163d;

    /* renamed from: e */
    private final C25292a<C22816c> f56164e;

    /* renamed from: f */
    private final C25292a<C22243pa> f56165f;

    /* renamed from: g */
    private final C25292a<C21895jw> f56166g;

    /* renamed from: h */
    private final C25292a<C22261pi> f56167h;

    public C22270po(C25292a<Context> aVar, C25292a<C24426d> aVar2, C25292a<C21639fp> aVar3, C25292a<C21789ix> aVar4, C25292a<C22816c> aVar5, C25292a<C22243pa> aVar6, C25292a<C21895jw> aVar7, C25292a<C22261pi> aVar8) {
        this.f56160a = aVar;
        this.f56161b = aVar2;
        this.f56162c = aVar3;
        this.f56163d = aVar4;
        this.f56164e = aVar5;
        this.f56165f = aVar6;
        this.f56166g = aVar7;
        this.f56167h = aVar8;
    }

    /* renamed from: a */
    public C22267pn get() {
        return m54257a(this.f56160a.get(), this.f56161b.get(), this.f56162c.get(), this.f56163d.get(), this.f56164e.get(), this.f56165f.get(), this.f56166g.get(), this.f56167h.get());
    }

    /* renamed from: a */
    public static C22270po m54258a(C25292a<Context> aVar, C25292a<C24426d> aVar2, C25292a<C21639fp> aVar3, C25292a<C21789ix> aVar4, C25292a<C22816c> aVar5, C25292a<C22243pa> aVar6, C25292a<C21895jw> aVar7, C25292a<C22261pi> aVar8) {
        return new C22270po(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    /* renamed from: a */
    public static C22267pn m54257a(Context context, C24426d dVar, C21639fp fpVar, C21789ix ixVar, C22816c cVar, C22243pa paVar, C21895jw jwVar, C22261pi piVar) {
        return new C22267pn(context, dVar, fpVar, ixVar, cVar, paVar, jwVar, piVar);
    }
}
