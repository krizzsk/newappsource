package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.C13950c;

/* renamed from: com.google.android.material.transformation.c */
public final class C14222c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C13950c f35737a;

    public C14222c(C13950c cVar) {
        this.f35737a = cVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C13950c.C13954d revealInfo = this.f35737a.getRevealInfo();
        revealInfo.f34618c = Float.MAX_VALUE;
        this.f35737a.setRevealInfo(revealInfo);
    }
}
