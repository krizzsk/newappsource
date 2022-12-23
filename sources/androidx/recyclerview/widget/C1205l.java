package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1179g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.recyclerview.widget.l */
public final class C1205l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1179g.C1183d f4539a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f4540b;

    /* renamed from: c */
    public final /* synthetic */ View f4541c;

    /* renamed from: d */
    public final /* synthetic */ C1179g f4542d;

    public C1205l(C1179g gVar, C1179g.C1183d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4542d = gVar;
        this.f4539a = dVar;
        this.f4540b = viewPropertyAnimator;
        this.f4541c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4540b.setListener((Animator.AnimatorListener) null);
        this.f4541c.setAlpha(1.0f);
        this.f4541c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        this.f4541c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.f4542d.mo4774d(this.f4539a.f4488b);
        this.f4542d.f4480r.remove(this.f4539a.f4488b);
        this.f4542d.mo5062o();
    }

    public final void onAnimationStart(Animator animator) {
        C1179g gVar = this.f4542d;
        RecyclerView.C1119a0 a0Var = this.f4539a.f4488b;
        gVar.getClass();
    }
}
