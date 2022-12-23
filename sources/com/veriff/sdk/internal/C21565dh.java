package com.veriff.sdk.internal;

import android.content.Context;
import ie0.C23588c;
import kotlinx.coroutines.CoroutineDispatcher;
import mobi.lab.veriff.data.C24426d;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.dh */
public final class C21565dh implements C23588c<C21919kj> {

    /* renamed from: a */
    private final C25292a<Context> f54304a;

    /* renamed from: b */
    private final C25292a<C21910kf> f54305b;

    /* renamed from: c */
    private final C25292a<C24426d> f54306c;

    /* renamed from: d */
    private final C25292a<CoroutineDispatcher> f54307d;

    public C21565dh(C25292a<Context> aVar, C25292a<C21910kf> aVar2, C25292a<C24426d> aVar3, C25292a<CoroutineDispatcher> aVar4) {
        this.f54304a = aVar;
        this.f54305b = aVar2;
        this.f54306c = aVar3;
        this.f54307d = aVar4;
    }

    /* renamed from: a */
    public C21919kj get() {
        return m51586a(this.f54304a.get(), this.f54305b.get(), this.f54306c.get(), this.f54307d.get());
    }

    /* renamed from: a */
    public static C21565dh m51585a(C25292a<Context> aVar, C25292a<C21910kf> aVar2, C25292a<C24426d> aVar3, C25292a<CoroutineDispatcher> aVar4) {
        return new C21565dh(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: a */
    public static C21919kj m51586a(Context context, C21910kf kfVar, C24426d dVar, CoroutineDispatcher coroutineDispatcher) {
        C21919kj a = C21562df.f54299a.mo54577a(context, kfVar, dVar, coroutineDispatcher);
        C13641g.m34118f(a);
        return a;
    }
}
