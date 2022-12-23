package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C14026d;

/* renamed from: com.google.android.material.floatingactionbutton.b */
public final class C14024b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f34845a;

    /* renamed from: b */
    public final /* synthetic */ boolean f34846b;

    /* renamed from: c */
    public final /* synthetic */ C14026d.C14033g f34847c;

    /* renamed from: d */
    public final /* synthetic */ C14026d f34848d;

    public C14024b(C14026d dVar, boolean z, C14023a aVar) {
        this.f34848d = dVar;
        this.f34846b = z;
        this.f34847c = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f34845a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        int i;
        C14026d dVar = this.f34848d;
        dVar.f34878r = 0;
        dVar.f34872l = null;
        if (!this.f34845a) {
            FloatingActionButton floatingActionButton = dVar.f34882v;
            boolean z = this.f34846b;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton.mo41851b(i, z);
            C14026d.C14033g gVar = this.f34847c;
            if (gVar != null) {
                C14023a aVar = (C14023a) gVar;
                aVar.f34843a.mo41040a(aVar.f34844b);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f34848d.f34882v.mo41851b(0, this.f34846b);
        C14026d dVar = this.f34848d;
        dVar.f34878r = 1;
        dVar.f34872l = animator;
        this.f34845a = false;
    }
}
