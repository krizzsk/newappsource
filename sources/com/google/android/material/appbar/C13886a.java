package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import p811tc.C19648g;

/* renamed from: com.google.android.material.appbar.a */
public final class C13886a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C19648g f34222a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f34223b;

    public C13886a(AppBarLayout appBarLayout, C19648g gVar) {
        this.f34223b = appBarLayout;
        this.f34222a = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f34222a.mo52003m(floatValue);
        Drawable drawable = this.f34223b.f34145s;
        if (drawable instanceof C19648g) {
            ((C19648g) drawable).mo52003m(floatValue);
        }
        Iterator it = this.f34223b.f34143q.iterator();
        while (it.hasNext()) {
            int i = this.f34222a.f49857v;
            ((AppBarLayout.C13881e) it.next()).mo40882a();
        }
    }
}
