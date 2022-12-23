package com.google.android.exoplayer2.p052ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.exoplayer2.ui.u */
public final /* synthetic */ class C4055u implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C4060z f14510a;

    public /* synthetic */ C4055u(C4060z zVar) {
        this.f14510a = zVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C4060z zVar = this.f14510a;
        zVar.getClass();
        zVar.mo16674b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
