package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0911b;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;
import p177n1.C5802d;

/* renamed from: androidx.fragment.app.g */
public final class C0929g implements C5802d.C5803a {

    /* renamed from: a */
    public final /* synthetic */ View f3760a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f3761b;

    /* renamed from: c */
    public final /* synthetic */ C0911b.C0913b f3762c;

    /* renamed from: d */
    public final /* synthetic */ SpecialEffectsController.Operation f3763d;

    public C0929g(View view, ViewGroup viewGroup, C0911b.C0913b bVar, SpecialEffectsController.Operation operation) {
        this.f3760a = view;
        this.f3761b = viewGroup;
        this.f3762c = bVar;
        this.f3763d = operation;
    }

    public final void onCancel() {
        this.f3760a.clearAnimation();
        this.f3761b.endViewTransition(this.f3760a);
        this.f3762c.mo4054a();
        if (FragmentManager.m2590J(2)) {
            Objects.toString(this.f3763d);
        }
    }
}
