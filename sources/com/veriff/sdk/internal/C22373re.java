package com.veriff.sdk.internal;

import android.content.Context;
import com.veriff.sdk.internal.permission.C22257e;
import com.veriff.sdk.views.base.verification.C22818e;
import ie0.C23588c;
import mobi.lab.veriff.util.C24457h;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.re */
public final class C22373re implements C23588c<C22371rc> {

    /* renamed from: a */
    private final C25292a<Context> f56468a;

    /* renamed from: b */
    private final C25292a<C22257e> f56469b;

    /* renamed from: c */
    private final C25292a<C24457h> f56470c;

    /* renamed from: d */
    private final C25292a<C22818e> f56471d;

    /* renamed from: e */
    private final C25292a<C22243pa> f56472e;

    /* renamed from: f */
    private final C25292a<C22377ri> f56473f;

    /* renamed from: g */
    private final C25292a<qu$b> f56474g;

    public C22373re(C25292a<Context> aVar, C25292a<C22257e> aVar2, C25292a<C24457h> aVar3, C25292a<C22818e> aVar4, C25292a<C22243pa> aVar5, C25292a<C22377ri> aVar6, C25292a<qu$b> aVar7) {
        this.f56468a = aVar;
        this.f56469b = aVar2;
        this.f56470c = aVar3;
        this.f56471d = aVar4;
        this.f56472e = aVar5;
        this.f56473f = aVar6;
        this.f56474g = aVar7;
    }

    /* renamed from: a */
    public C22371rc get() {
        return m54583a(this.f56468a.get(), this.f56469b.get(), this.f56470c.get(), this.f56471d.get(), this.f56472e.get(), this.f56473f, this.f56474g.get());
    }

    /* renamed from: a */
    public static C22373re m54584a(C25292a<Context> aVar, C25292a<C22257e> aVar2, C25292a<C24457h> aVar3, C25292a<C22818e> aVar4, C25292a<C22243pa> aVar5, C25292a<C22377ri> aVar6, C25292a<qu$b> aVar7) {
        return new C22373re(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* renamed from: a */
    public static C22371rc m54583a(Context context, C22257e eVar, C24457h hVar, C22818e eVar2, C22243pa paVar, C25292a<C22377ri> aVar, qu$b qu_b) {
        return new C22371rc(context, eVar, hVar, eVar2, paVar, aVar, qu_b);
    }
}
