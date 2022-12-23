package com.github.clans.fab;

import android.animation.ValueAnimator;
import android.graphics.Color;

/* renamed from: com.github.clans.fab.c */
public final class C3806c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f13236a;

    /* renamed from: b */
    public final /* synthetic */ int f13237b;

    /* renamed from: c */
    public final /* synthetic */ int f13238c;

    /* renamed from: d */
    public final /* synthetic */ FloatingActionMenu f13239d;

    public C3806c(FloatingActionMenu floatingActionMenu, int i, int i2, int i3) {
        this.f13239d = floatingActionMenu;
        this.f13236a = i;
        this.f13237b = i2;
        this.f13238c = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13239d.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f13236a, this.f13237b, this.f13238c));
    }
}
