package com.veriff.sdk.internal;

import android.content.Context;
import ie0.C23588c;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.iv */
public final class C21786iv implements C23588c<C21784it> {

    /* renamed from: a */
    private final C25292a<Context> f55129a;

    /* renamed from: b */
    private final C25292a<C21910kf> f55130b;

    /* renamed from: c */
    private final C25292a<C21450bi> f55131c;

    public C21786iv(C25292a<Context> aVar, C25292a<C21910kf> aVar2, C25292a<C21450bi> aVar3) {
        this.f55129a = aVar;
        this.f55130b = aVar2;
        this.f55131c = aVar3;
    }

    /* renamed from: a */
    public C21784it get() {
        return m53191a(this.f55129a.get(), this.f55130b.get(), this.f55131c.get());
    }

    /* renamed from: a */
    public static C21786iv m53192a(C25292a<Context> aVar, C25292a<C21910kf> aVar2, C25292a<C21450bi> aVar3) {
        return new C21786iv(aVar, aVar2, aVar3);
    }

    /* renamed from: a */
    public static C21784it m53191a(Context context, C21910kf kfVar, C21450bi biVar) {
        return new C21784it(context, kfVar, biVar);
    }
}
