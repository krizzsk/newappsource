package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
public final class C1189i extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C1119a0 f4507a;

    /* renamed from: b */
    public final /* synthetic */ View f4508b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f4509c;

    /* renamed from: d */
    public final /* synthetic */ C1179g f4510d;

    public C1189i(View view, ViewPropertyAnimator viewPropertyAnimator, C1179g gVar, RecyclerView.C1119a0 a0Var) {
        this.f4510d = gVar;
        this.f4507a = a0Var;
        this.f4508b = view;
        this.f4509c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f4508b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4509c.setListener((Animator.AnimatorListener) null);
        this.f4510d.mo4774d(this.f4507a);
        this.f4510d.f4477o.remove(this.f4507a);
        this.f4510d.mo5062o();
    }

    public final void onAnimationStart(Animator animator) {
        this.f4510d.getClass();
    }
}
