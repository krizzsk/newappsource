package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0911b;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;

/* renamed from: androidx.fragment.app.d */
public final class C0920d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f3729a;

    /* renamed from: b */
    public final /* synthetic */ View f3730b;

    /* renamed from: c */
    public final /* synthetic */ boolean f3731c;

    /* renamed from: d */
    public final /* synthetic */ SpecialEffectsController.Operation f3732d;

    /* renamed from: e */
    public final /* synthetic */ C0911b.C0913b f3733e;

    public C0920d(ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.Operation operation, C0911b.C0913b bVar) {
        this.f3729a = viewGroup;
        this.f3730b = view;
        this.f3731c = z;
        this.f3732d = operation;
        this.f3733e = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3729a.endViewTransition(this.f3730b);
        if (this.f3731c) {
            this.f3732d.f3692a.applyState(this.f3730b);
        }
        this.f3733e.mo4054a();
        if (FragmentManager.m2590J(2)) {
            Objects.toString(this.f3732d);
        }
    }
}
