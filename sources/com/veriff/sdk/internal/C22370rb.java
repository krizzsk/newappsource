package com.veriff.sdk.internal;

import he0.C23454a;
import ie0.C23587b;
import ie0.C23588c;
import kotlinx.coroutines.CoroutineDispatcher;
import wh0.C25235z;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.rb */
public final class C22370rb implements C23588c<C22362qz> {

    /* renamed from: a */
    private final C25292a<qu$c> f56450a;

    /* renamed from: b */
    private final C25292a<C22374rf> f56451b;

    /* renamed from: c */
    private final C25292a<qu$a> f56452c;

    /* renamed from: d */
    private final C25292a<C21645fu> f56453d;

    /* renamed from: e */
    private final C25292a<C21910kf> f56454e;

    /* renamed from: f */
    private final C25292a<C21895jw> f56455f;

    /* renamed from: g */
    private final C25292a<C25235z> f56456g;

    /* renamed from: h */
    private final C25292a<CoroutineDispatcher> f56457h;

    public C22370rb(C25292a<qu$c> aVar, C25292a<C22374rf> aVar2, C25292a<qu$a> aVar3, C25292a<C21645fu> aVar4, C25292a<C21910kf> aVar5, C25292a<C21895jw> aVar6, C25292a<C25235z> aVar7, C25292a<CoroutineDispatcher> aVar8) {
        this.f56450a = aVar;
        this.f56451b = aVar2;
        this.f56452c = aVar3;
        this.f56453d = aVar4;
        this.f56454e = aVar5;
        this.f56455f = aVar6;
        this.f56456g = aVar7;
        this.f56457h = aVar8;
    }

    /* renamed from: a */
    public C22362qz get() {
        return m54559a(C23587b.m57772a(this.f56450a), this.f56451b.get(), this.f56452c.get(), this.f56453d.get(), this.f56454e.get(), this.f56455f.get(), this.f56456g.get(), this.f56457h.get());
    }

    /* renamed from: a */
    public static C22370rb m54560a(C25292a<qu$c> aVar, C25292a<C22374rf> aVar2, C25292a<qu$a> aVar3, C25292a<C21645fu> aVar4, C25292a<C21910kf> aVar5, C25292a<C21895jw> aVar6, C25292a<C25235z> aVar7, C25292a<CoroutineDispatcher> aVar8) {
        return new C22370rb(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8);
    }

    /* renamed from: a */
    public static C22362qz m54559a(C23454a<qu$c> aVar, C22374rf rfVar, qu$a qu_a, C21645fu fuVar, C21910kf kfVar, C21895jw jwVar, C25235z zVar, CoroutineDispatcher coroutineDispatcher) {
        return new C22362qz(aVar, rfVar, qu_a, fuVar, kfVar, jwVar, zVar, coroutineDispatcher);
    }
}
