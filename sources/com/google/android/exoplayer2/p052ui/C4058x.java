package com.google.android.exoplayer2.p052ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.exoplayer2.ui.x */
public final /* synthetic */ class C4058x implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C4060z f14515a;

    public /* synthetic */ C4058x(C4060z zVar) {
        this.f14515a = zVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C4060z zVar = this.f14515a;
        zVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = zVar.f14521b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = zVar.f14522c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = zVar.f14524e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }
}
