package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.c */
public final class C14173c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C14165a f35585a;

    public C14173c(C14165a aVar) {
        this.f35585a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f35585a.f35621a.setEndIconVisible(false);
    }
}
