package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.e */
public final class C14175e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C14165a f35587a;

    public C14175e(C14165a aVar) {
        this.f35587a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f35587a.f35623c.setScaleX(floatValue);
        this.f35587a.f35623c.setScaleY(floatValue);
    }
}
