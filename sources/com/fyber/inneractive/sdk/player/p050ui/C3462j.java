package com.fyber.inneractive.sdk.player.p050ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.fyber.inneractive.sdk.player.ui.j */
public class C3462j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C3457i f12362a;

    public C3462j(C3457i iVar) {
        this.f12362a = iVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C3457i iVar = this.f12362a;
        ViewGroup viewGroup = iVar.f12351y;
        if (viewGroup != null && viewGroup.getParent() != null) {
            ((View) iVar.f12351y.getParent()).setOnTouchListener((View.OnTouchListener) null);
        }
    }
}
