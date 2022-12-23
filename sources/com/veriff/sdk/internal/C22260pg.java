package com.veriff.sdk.internal;

import android.app.Activity;
import com.veriff.sdk.internal.C21580du;
import ie0.C23588c;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.pg */
public final class C22260pg implements C23588c<C22259pf> {

    /* renamed from: a */
    private final C25292a<Activity> f56124a;

    /* renamed from: b */
    private final C25292a<C21580du.C21581a> f56125b;

    public C22260pg(C25292a<Activity> aVar, C25292a<C21580du.C21581a> aVar2) {
        this.f56124a = aVar;
        this.f56125b = aVar2;
    }

    /* renamed from: a */
    public C22259pf get() {
        return m54187a(this.f56124a.get(), this.f56125b.get());
    }

    /* renamed from: a */
    public static C22260pg m54188a(C25292a<Activity> aVar, C25292a<C21580du.C21581a> aVar2) {
        return new C22260pg(aVar, aVar2);
    }

    /* renamed from: a */
    public static C22259pf m54187a(Activity activity, C21580du.C21581a aVar) {
        return new C22259pf(activity, aVar);
    }
}
