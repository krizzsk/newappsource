package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;

/* renamed from: com.google.android.material.snackbar.c */
public final class C14126c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f35346a;

    public C14126c(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.f35346a = baseTransientBottomBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.f35306o;
        this.f35346a.f35310c.setTranslationY((float) intValue);
    }
}
