package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.b */
public final class C14125b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f35345a;

    public C14125b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f35345a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f35345a.f35310c.setScaleX(floatValue);
        this.f35345a.f35310c.setScaleY(floatValue);
    }
}
