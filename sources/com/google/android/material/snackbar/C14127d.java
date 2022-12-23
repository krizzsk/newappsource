package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;

/* renamed from: com.google.android.material.snackbar.d */
public final class C14127d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f35347a;

    public C14127d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f35347a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.f35306o;
        this.f35347a.f35310c.setTranslationY((float) intValue);
    }
}
