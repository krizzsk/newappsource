package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.b */
public final class C14172b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C14165a f35584a;

    public C14172b(C14165a aVar) {
        this.f35584a = aVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f35584a.f35621a.setEndIconVisible(true);
    }
}
