package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C14026d;

/* renamed from: com.google.android.material.floatingactionbutton.c */
public final class C14025c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f34849a;

    /* renamed from: b */
    public final /* synthetic */ C14026d.C14033g f34850b;

    /* renamed from: c */
    public final /* synthetic */ C14026d f34851c;

    public C14025c(C14026d dVar, boolean z, C14023a aVar) {
        this.f34851c = dVar;
        this.f34849a = z;
        this.f34850b = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C14026d dVar = this.f34851c;
        dVar.f34878r = 0;
        dVar.f34872l = null;
        C14026d.C14033g gVar = this.f34850b;
        if (gVar != null) {
            ((C14023a) gVar).f34843a.mo41041b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f34851c.f34882v.mo41851b(0, this.f34849a);
        C14026d dVar = this.f34851c;
        dVar.f34878r = 2;
        dVar.f34872l = animator;
    }
}
