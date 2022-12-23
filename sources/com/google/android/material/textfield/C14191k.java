package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.textfield.k */
public final class C14191k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C14178h f35618a;

    public C14191k(C14178h hVar) {
        this.f35618a = hVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f35618a.f35623c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
