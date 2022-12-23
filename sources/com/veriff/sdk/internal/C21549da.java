package com.veriff.sdk.internal;

import android.app.Activity;
import ie0.C23588c;
import p389bl.C13641g;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.da */
public final class C21549da implements C23588c<C22420rr> {

    /* renamed from: a */
    private final C25292a<Activity> f54227a;

    /* renamed from: b */
    private final C25292a<C21789ix> f54228b;

    public C21549da(C25292a<Activity> aVar, C25292a<C21789ix> aVar2) {
        this.f54227a = aVar;
        this.f54228b = aVar2;
    }

    /* renamed from: a */
    public C22420rr get() {
        return m51528a(this.f54227a.get(), this.f54228b.get());
    }

    /* renamed from: a */
    public static C21549da m51527a(C25292a<Activity> aVar, C25292a<C21789ix> aVar2) {
        return new C21549da(aVar, aVar2);
    }

    /* renamed from: a */
    public static C22420rr m51528a(Activity activity, C21789ix ixVar) {
        C22420rr a = C21547cz.f54224a.mo54562a(activity, ixVar);
        C13641g.m34118f(a);
        return a;
    }
}
