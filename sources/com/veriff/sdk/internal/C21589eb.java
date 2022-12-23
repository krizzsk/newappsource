package com.veriff.sdk.internal;

import android.content.Context;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.eb */
public final class C21589eb implements C23588c<C22704xu> {

    /* renamed from: a */
    private final C25292a<Context> f54324a;

    public C21589eb(C25292a<Context> aVar) {
        this.f54324a = aVar;
    }

    /* renamed from: a */
    public C22704xu get() {
        return m51640a(this.f54324a.get());
    }

    /* renamed from: a */
    public static C21589eb m51639a(C25292a<Context> aVar) {
        return new C21589eb(aVar);
    }

    /* renamed from: a */
    public static C22704xu m51640a(Context context) {
        C22704xu a = C21584dx.f54319a.mo54599a(context);
        C13641g.m34118f(a);
        return a;
    }
}
