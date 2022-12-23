package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: com.google.android.material.bottomappbar.c */
public final class C13912c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f34337a;

    /* renamed from: b */
    public final /* synthetic */ ActionMenuView f34338b;

    /* renamed from: c */
    public final /* synthetic */ int f34339c;

    /* renamed from: d */
    public final /* synthetic */ boolean f34340d;

    /* renamed from: e */
    public final /* synthetic */ BottomAppBar f34341e;

    public C13912c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f34341e = bottomAppBar;
        this.f34338b = actionMenuView;
        this.f34339c = i;
        this.f34340d = z;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f34337a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        boolean z;
        if (!this.f34337a) {
            BottomAppBar bottomAppBar = this.f34341e;
            int i = bottomAppBar.f34311t0;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            if (i != 0) {
                bottomAppBar.f34311t0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.mo1953k(i);
            }
            this.f34341e.mo41007F(this.f34338b, this.f34339c, this.f34340d, z);
        }
    }
}
