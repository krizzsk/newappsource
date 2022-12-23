package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.j */
public final class C14190j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C14178h f35617a;

    public C14190j(C14178h hVar) {
        this.f35617a = hVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C14178h hVar = this.f35617a;
        hVar.f35623c.setChecked(hVar.f35597m);
        this.f35617a.f35603s.start();
    }
}
