package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.material.tabs.c */
public final class C14149c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f35455a;

    /* renamed from: b */
    public final /* synthetic */ TabLayout.C14142f f35456b;

    public C14149c(TabLayout.C14142f fVar, int i) {
        this.f35456b = fVar;
        this.f35455a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f35456b.f35423c = this.f35455a;
    }

    public final void onAnimationStart(Animator animator) {
        this.f35456b.f35423c = this.f35455a;
    }
}
