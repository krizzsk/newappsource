package com.google.android.material.appbar;

import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.appbar.h */
public final class C13893h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CollapsingToolbarLayout f34234a;

    public C13893h(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f34234a = collapsingToolbarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34234a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
