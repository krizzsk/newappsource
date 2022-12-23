package com.google.android.material.navigation;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.navigation.b */
public final class C14101b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ float f35183a;

    /* renamed from: b */
    public final /* synthetic */ C14096a f35184b;

    public C14101b(C14096a aVar, float f) {
        this.f35184b = aVar;
        this.f35183a = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f35184b.mo41997b(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f35183a);
    }
}
