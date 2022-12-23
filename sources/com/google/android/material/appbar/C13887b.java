package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.b */
public final class C13887b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f34224a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f34225b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f34226c;

    public C13887b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f34226c = baseBehavior;
        this.f34224a = coordinatorLayout;
        this.f34225b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f34226c.mo40959i(this.f34224a, this.f34225b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
