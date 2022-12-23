package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.google.android.material.bottomappbar.d */
public final class C13913d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BottomAppBar f34342a;

    public C13913d(BottomAppBar bottomAppBar) {
        this.f34342a = bottomAppBar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f34342a.f34298A0.onAnimationStart(animator);
        FloatingActionButton x = this.f34342a.mo41026x();
        if (x != null) {
            x.setTranslationX(this.f34342a.getFabTranslationX());
        }
    }
}
