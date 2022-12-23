package com.github.clans.fab;

import android.animation.ValueAnimator;
import android.graphics.Color;

/* renamed from: com.github.clans.fab.b */
public final class C3805b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f13232a;

    /* renamed from: b */
    public final /* synthetic */ int f13233b;

    /* renamed from: c */
    public final /* synthetic */ int f13234c;

    /* renamed from: d */
    public final /* synthetic */ FloatingActionMenu f13235d;

    public C3805b(FloatingActionMenu floatingActionMenu, int i, int i2, int i3) {
        this.f13235d = floatingActionMenu;
        this.f13232a = i;
        this.f13233b = i2;
        this.f13234c = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13235d.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f13232a, this.f13233b, this.f13234c));
    }
}
