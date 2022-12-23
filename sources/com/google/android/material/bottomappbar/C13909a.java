package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.bottomappbar.a */
public final class C13909a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f34333a;

    public C13909a(BottomAppBar bottomAppBar) {
        this.f34333a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        BottomAppBar bottomAppBar = this.f34333a;
        int i = BottomAppBar.f34297C0;
        bottomAppBar.getClass();
        this.f34333a.f34303l0 = null;
    }

    public final void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.f34333a;
        int i = BottomAppBar.f34297C0;
        bottomAppBar.getClass();
    }
}
