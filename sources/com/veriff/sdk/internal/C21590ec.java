package com.veriff.sdk.internal;

import android.content.Context;
import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.ec */
public final class C21590ec implements C23588c<C21512ci> {

    /* renamed from: a */
    private final C25292a<Context> f54325a;

    /* renamed from: b */
    private final C25292a<C24426d> f54326b;

    /* renamed from: c */
    private final C25292a<C21910kf> f54327c;

    /* renamed from: d */
    private final C25292a<C22746yp> f54328d;

    /* renamed from: e */
    private final C25292a<C22704xu> f54329e;

    public C21590ec(C25292a<Context> aVar, C25292a<C24426d> aVar2, C25292a<C21910kf> aVar3, C25292a<C22746yp> aVar4, C25292a<C22704xu> aVar5) {
        this.f54325a = aVar;
        this.f54326b = aVar2;
        this.f54327c = aVar3;
        this.f54328d = aVar4;
        this.f54329e = aVar5;
    }

    /* renamed from: a */
    public C21512ci get() {
        return m51642a(this.f54325a.get(), this.f54326b.get(), this.f54327c.get(), this.f54328d.get(), this.f54329e.get());
    }

    /* renamed from: a */
    public static C21590ec m51643a(C25292a<Context> aVar, C25292a<C24426d> aVar2, C25292a<C21910kf> aVar3, C25292a<C22746yp> aVar4, C25292a<C22704xu> aVar5) {
        return new C21590ec(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* renamed from: a */
    public static C21512ci m51642a(Context context, C24426d dVar, C21910kf kfVar, C22746yp ypVar, C22704xu xuVar) {
        C21512ci a = C21584dx.f54319a.mo54595a(context, dVar, kfVar, ypVar, xuVar);
        C13641g.m34118f(a);
        return a;
    }
}
