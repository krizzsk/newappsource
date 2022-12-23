package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.transformation.a */
public final class C14220a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f35734a;

    public C14220a(View view) {
        this.f35734a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f35734a.invalidate();
    }
}
