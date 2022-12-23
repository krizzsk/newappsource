package com.veriff.sdk.internal.permission;

import android.app.Activity;
import ie0.C23588c;
import ye0.C25292a;

/* renamed from: com.veriff.sdk.internal.permission.b */
public final class C22253b implements C23588c<C22252a> {

    /* renamed from: a */
    private final C25292a<Activity> f56111a;

    public C22253b(C25292a<Activity> aVar) {
        this.f56111a = aVar;
    }

    /* renamed from: a */
    public C22252a get() {
        return m54172a(this.f56111a.get());
    }

    /* renamed from: a */
    public static C22253b m54173a(C25292a<Activity> aVar) {
        return new C22253b(aVar);
    }

    /* renamed from: a */
    public static C22252a m54172a(Activity activity) {
        return new C22252a(activity);
    }
}
