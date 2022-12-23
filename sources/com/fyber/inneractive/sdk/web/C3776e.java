package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.ViewTreeObserver;

/* renamed from: com.fyber.inneractive.sdk.web.e */
public class C3776e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ Context f13043a;

    /* renamed from: b */
    public final /* synthetic */ C3764d f13044b;

    public C3776e(C3764d dVar, Context context) {
        this.f13044b = dVar;
        this.f13043a = context;
    }

    public boolean onPreDraw() {
        C3762c cVar = this.f13044b.f12957b;
        if (cVar == null) {
            return false;
        }
        cVar.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f13044b.mo15450a(this.f13043a, true);
        return false;
    }
}
