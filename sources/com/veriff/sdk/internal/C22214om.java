package com.veriff.sdk.internal;

import ie0.C23588c;
import kotlinx.coroutines.CoroutineDispatcher;
import wh0.C25235z;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.om */
public final class C22214om implements C23588c<C22206ol> {

    /* renamed from: a */
    private final C25292a<C21629fg> f55996a;

    /* renamed from: b */
    private final C25292a<CoroutineDispatcher> f55997b;

    /* renamed from: c */
    private final C25292a<CoroutineDispatcher> f55998c;

    /* renamed from: d */
    private final C25292a<C25235z> f55999d;

    public C22214om(C25292a<C21629fg> aVar, C25292a<CoroutineDispatcher> aVar2, C25292a<CoroutineDispatcher> aVar3, C25292a<C25235z> aVar4) {
        this.f55996a = aVar;
        this.f55997b = aVar2;
        this.f55998c = aVar3;
        this.f55999d = aVar4;
    }

    /* renamed from: a */
    public C22206ol get() {
        return m54032a(this.f55996a.get(), this.f55997b.get(), this.f55998c.get(), this.f55999d.get());
    }

    /* renamed from: a */
    public static C22214om m54033a(C25292a<C21629fg> aVar, C25292a<CoroutineDispatcher> aVar2, C25292a<CoroutineDispatcher> aVar3, C25292a<C25235z> aVar4) {
        return new C22214om(aVar, aVar2, aVar3, aVar4);
    }

    /* renamed from: a */
    public static C22206ol m54032a(C21629fg fgVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, C25235z zVar) {
        return new C22206ol(fgVar, coroutineDispatcher, coroutineDispatcher2, zVar);
    }
}
