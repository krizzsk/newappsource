package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1179g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.recyclerview.widget.k */
public final class C1202k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1179g.C1183d f4529a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f4530b;

    /* renamed from: c */
    public final /* synthetic */ View f4531c;

    /* renamed from: d */
    public final /* synthetic */ C1179g f4532d;

    public C1202k(C1179g gVar, C1179g.C1183d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4532d = gVar;
        this.f4529a = dVar;
        this.f4530b = viewPropertyAnimator;
        this.f4531c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4530b.setListener((Animator.AnimatorListener) null);
        this.f4531c.setAlpha(1.0f);
        this.f4531c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        this.f4531c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.f4532d.mo4774d(this.f4529a.f4487a);
        this.f4532d.f4480r.remove(this.f4529a.f4487a);
        this.f4532d.mo5062o();
    }

    public final void onAnimationStart(Animator animator) {
        C1179g gVar = this.f4532d;
        RecyclerView.C1119a0 a0Var = this.f4529a.f4487a;
        gVar.getClass();
    }
}
