package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.snackbar.a */
public final class C14124a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f35344a;

    public C14124a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f35344a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f35344a.f35310c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
