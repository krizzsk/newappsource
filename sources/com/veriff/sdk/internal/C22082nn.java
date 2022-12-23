package com.veriff.sdk.internal;

import ie0.C23588c;
import kotlinx.coroutines.CoroutineDispatcher;
import wh0.C25235z;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.nn */
public final class C22082nn implements C23588c<C22067nl> {

    /* renamed from: a */
    private final C25292a<C25235z> f55707a;

    /* renamed from: b */
    private final C25292a<CoroutineDispatcher> f55708b;

    /* renamed from: c */
    private final C25292a<CoroutineDispatcher> f55709c;

    /* renamed from: d */
    private final C25292a<C21919kj> f55710d;

    /* renamed from: e */
    private final C25292a<C22054nd> f55711e;

    /* renamed from: f */
    private final C25292a<C21910kf> f55712f;

    /* renamed from: g */
    private final C25292a<C21450bi> f55713g;

    public C22082nn(C25292a<C25235z> aVar, C25292a<CoroutineDispatcher> aVar2, C25292a<CoroutineDispatcher> aVar3, C25292a<C21919kj> aVar4, C25292a<C22054nd> aVar5, C25292a<C21910kf> aVar6, C25292a<C21450bi> aVar7) {
        this.f55707a = aVar;
        this.f55708b = aVar2;
        this.f55709c = aVar3;
        this.f55710d = aVar4;
        this.f55711e = aVar5;
        this.f55712f = aVar6;
        this.f55713g = aVar7;
    }

    /* renamed from: a */
    public C22067nl get() {
        return m53861a(this.f55707a.get(), this.f55708b.get(), this.f55709c.get(), this.f55710d.get(), this.f55711e.get(), this.f55712f.get(), this.f55713g.get());
    }

    /* renamed from: a */
    public static C22082nn m53862a(C25292a<C25235z> aVar, C25292a<CoroutineDispatcher> aVar2, C25292a<CoroutineDispatcher> aVar3, C25292a<C21919kj> aVar4, C25292a<C22054nd> aVar5, C25292a<C21910kf> aVar6, C25292a<C21450bi> aVar7) {
        return new C22082nn(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    /* renamed from: a */
    public static C22067nl m53861a(C25235z zVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, C21919kj kjVar, C22054nd ndVar, C21910kf kfVar, C21450bi biVar) {
        return new C22067nl(zVar, coroutineDispatcher, coroutineDispatcher2, kjVar, ndVar, kfVar, biVar);
    }
}
