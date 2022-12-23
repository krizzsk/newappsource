package com.veriff.sdk.internal;

import android.content.Context;
import com.veriff.sdk.internal.C22377ri;
import ie0.C23588c;
import mobi.lab.veriff.util.C24469n;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.rj */
public final class C22387rj implements C23588c<C22377ri> {

    /* renamed from: a */
    private final C25292a<Context> f56510a;

    /* renamed from: b */
    private final C25292a<C24469n> f56511b;

    /* renamed from: c */
    private final C25292a<C21616ex> f56512c;

    /* renamed from: d */
    private final C25292a<C22700xq> f56513d;

    /* renamed from: e */
    private final C25292a<C21645fu> f56514e;

    /* renamed from: f */
    private final C25292a<Boolean> f56515f;

    /* renamed from: g */
    private final C25292a<C22377ri.C22380c> f56516g;

    public C22387rj(C25292a<Context> aVar, C25292a<C24469n> aVar2, C25292a<C21616ex> aVar3, C25292a<C22700xq> aVar4, C25292a<C21645fu> aVar5, C25292a<Boolean> aVar6, C25292a<C22377ri.C22380c> aVar7) {
        this.f56510a = aVar;
        this.f56511b = aVar2;
        this.f56512c = aVar3;
        this.f56513d = aVar4;
        this.f56514e = aVar5;
        this.f56515f = aVar6;
        this.f56516g = aVar7;
    }

    /* renamed from: a */
    public C22377ri get() {
        return m54626a(this.f56510a.get(), this.f56511b.get(), this.f56512c.get(), this.f56513d.get(), this.f56514e.get(), this.f56515f.get().booleanValue(), this.f56516g.get());
    }

    /* renamed from: a */
    public static C22387rj m54627a(C25292a<Context> aVar, C25292a<C24469n> aVar2, C25292a<C21616ex> aVar3, C25292a<C22700xq> aVar4, C25292a<C21645fu> aVar5, C25292a<Boolean> aVar6, C25292a<C22377ri.C22380c> aVar7) {
        return new C22387rj(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* renamed from: a */
    public static C22377ri m54626a(Context context, C24469n nVar, C21616ex exVar, C22700xq xqVar, C21645fu fuVar, boolean z, C22377ri.C22380c cVar) {
        return new C22377ri(context, nVar, exVar, xqVar, fuVar, z, cVar);
    }
}
