package p647mc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: mc.c */
public final class C18357c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f46808a;

    /* renamed from: b */
    public final /* synthetic */ C18362g f46809b;

    public C18357c(C18353a aVar) {
        this.f46809b = aVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f46808a = true;
        this.f46809b.mo41644e();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f46809b.mo41637a();
        if (!this.f46808a) {
            this.f46809b.mo41639c();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f46809b.onAnimationStart(animator);
        this.f46808a = false;
    }
}
