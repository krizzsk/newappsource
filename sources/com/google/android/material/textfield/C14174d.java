package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.d */
public final class C14174d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C14165a f35586a;

    public C14174d(C14165a aVar) {
        this.f35586a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f35586a.f35623c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
