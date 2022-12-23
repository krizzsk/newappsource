package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.circularreveal.C13950c;

/* renamed from: com.google.android.material.transformation.b */
public final class C14221b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C13950c f35735a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f35736b;

    public C14221b(C13950c cVar, Drawable drawable) {
        this.f35735a = cVar;
        this.f35736b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f35735a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f35735a.setCircularRevealOverlayDrawable(this.f35736b);
    }
}
