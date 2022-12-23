package com.google.android.exoplayer2.p052ui;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.exoplayer2.ui.b */
public final /* synthetic */ class C4029b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ DefaultTimeBar f14487a;

    public /* synthetic */ C4029b(DefaultTimeBar defaultTimeBar) {
        this.f14487a = defaultTimeBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DefaultTimeBar defaultTimeBar = this.f14487a;
        int i = DefaultTimeBar.f14161Q;
        defaultTimeBar.getClass();
        defaultTimeBar.f14168G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f14178b);
    }
}
