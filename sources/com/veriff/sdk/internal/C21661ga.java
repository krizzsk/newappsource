package com.veriff.sdk.internal;

import ie0.C23588c;
import mobi.lab.veriff.data.C24426d;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.ga */
public final class C21661ga implements C23588c<C21657fz> {

    /* renamed from: a */
    private final C25292a<C21650fw> f54715a;

    /* renamed from: b */
    private final C25292a<C24426d> f54716b;

    public C21661ga(C25292a<C21650fw> aVar, C25292a<C24426d> aVar2) {
        this.f54715a = aVar;
        this.f54716b = aVar2;
    }

    /* renamed from: a */
    public C21657fz get() {
        return m52591a(this.f54715a.get(), this.f54716b.get());
    }

    /* renamed from: a */
    public static C21661ga m52592a(C25292a<C21650fw> aVar, C25292a<C24426d> aVar2) {
        return new C21661ga(aVar, aVar2);
    }

    /* renamed from: a */
    public static C21657fz m52591a(C21650fw fwVar, C24426d dVar) {
        return new C21657fz(fwVar, dVar);
    }
}
