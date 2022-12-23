package com.veriff.sdk.internal;

import android.content.Context;
import ie0.C23588c;
import kotlinx.coroutines.CoroutineDispatcher;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.ke */
public final class C21909ke implements C23588c<C21905kb> {

    /* renamed from: a */
    private final C25292a<Context> f55387a;

    /* renamed from: b */
    private final C25292a<C21645fu> f55388b;

    /* renamed from: c */
    private final C25292a<xb$a> f55389c;

    /* renamed from: d */
    private final C25292a<CoroutineDispatcher> f55390d;

    public C21909ke(C25292a<Context> aVar, C25292a<C21645fu> aVar2, C25292a<xb$a> aVar3, C25292a<CoroutineDispatcher> aVar4) {
        this.f55387a = aVar;
        this.f55388b = aVar2;
        this.f55389c = aVar3;
        this.f55390d = aVar4;
    }

    /* renamed from: a */
    public C21905kb get() {
        return m53467a(this.f55387a.get(), this.f55388b.get(), this.f55389c.get(), this.f55390d.get());
    }

    /* renamed from: a */
    public static C21909ke m53468a(C25292a<Context> aVar, C25292a<C21645fu> aVar2, C25292a<xb$a> aVar3, C25292a<CoroutineDispatcher> aVar4) {
        return new C21909ke(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: a */
    public static C21905kb m53467a(Context context, C21645fu fuVar, xb$a xb_a, CoroutineDispatcher coroutineDispatcher) {
        return new C21905kb(context, fuVar, xb_a, coroutineDispatcher);
    }
}
