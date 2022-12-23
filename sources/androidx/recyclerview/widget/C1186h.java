package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
public final class C1186h extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C1119a0 f4499a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f4500b;

    /* renamed from: c */
    public final /* synthetic */ View f4501c;

    /* renamed from: d */
    public final /* synthetic */ C1179g f4502d;

    public C1186h(View view, ViewPropertyAnimator viewPropertyAnimator, C1179g gVar, RecyclerView.C1119a0 a0Var) {
        this.f4502d = gVar;
        this.f4499a = a0Var;
        this.f4500b = viewPropertyAnimator;
        this.f4501c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4500b.setListener((Animator.AnimatorListener) null);
        this.f4501c.setAlpha(1.0f);
        this.f4502d.mo4774d(this.f4499a);
        this.f4502d.f4479q.remove(this.f4499a);
        this.f4502d.mo5062o();
    }

    public final void onAnimationStart(Animator animator) {
        this.f4502d.getClass();
    }
}
