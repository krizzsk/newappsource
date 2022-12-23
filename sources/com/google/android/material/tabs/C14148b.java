package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.material.tabs.b */
public final class C14148b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f35452a;

    /* renamed from: b */
    public final /* synthetic */ View f35453b;

    /* renamed from: c */
    public final /* synthetic */ TabLayout.C14142f f35454c;

    public C14148b(TabLayout.C14142f fVar, View view, View view2) {
        this.f35454c = fVar;
        this.f35452a = view;
        this.f35453b = view2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f35454c.mo42356c(this.f35452a, this.f35453b, valueAnimator.getAnimatedFraction());
    }
}
