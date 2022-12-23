package p242s1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: s1.o0 */
public final class C6380o0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C6386q0 f20033a;

    /* renamed from: b */
    public final /* synthetic */ View f20034b;

    public C6380o0(C6386q0 q0Var, View view) {
        this.f20033a = q0Var;
        this.f20034b = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f20033a.mo2022a(this.f20034b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f20033a.mo909b(this.f20034b);
    }

    public final void onAnimationStart(Animator animator) {
        this.f20033a.mo957d();
    }
}
