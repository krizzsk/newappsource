package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.recyclerview.widget.j */
public final class C1198j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.C1119a0 f4516a;

    /* renamed from: b */
    public final /* synthetic */ int f4517b;

    /* renamed from: c */
    public final /* synthetic */ View f4518c;

    /* renamed from: d */
    public final /* synthetic */ int f4519d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f4520e;

    /* renamed from: f */
    public final /* synthetic */ C1179g f4521f;

    public C1198j(C1179g gVar, RecyclerView.C1119a0 a0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4521f = gVar;
        this.f4516a = a0Var;
        this.f4517b = i;
        this.f4518c = view;
        this.f4519d = i2;
        this.f4520e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f4517b != 0) {
            this.f4518c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (this.f4519d != 0) {
            this.f4518c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4520e.setListener((Animator.AnimatorListener) null);
        this.f4521f.mo4774d(this.f4516a);
        this.f4521f.f4478p.remove(this.f4516a);
        this.f4521f.mo5062o();
    }

    public final void onAnimationStart(Animator animator) {
        this.f4521f.getClass();
    }
}
