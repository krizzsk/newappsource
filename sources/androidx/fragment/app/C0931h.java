package androidx.fragment.app;

import androidx.fragment.app.SpecialEffectsController;
import p241s0.C6302b;

/* renamed from: androidx.fragment.app.h */
public final class C0931h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f3768b;

    /* renamed from: c */
    public final /* synthetic */ SpecialEffectsController.Operation f3769c;

    /* renamed from: d */
    public final /* synthetic */ boolean f3770d;

    public C0931h(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, C6302b bVar) {
        this.f3768b = operation;
        this.f3769c = operation2;
        this.f3770d = z;
    }

    public final void run() {
        Fragment fragment = this.f3768b.f3694c;
        Fragment fragment2 = this.f3769c.f3694c;
        boolean z = this.f3770d;
        C0939k0 k0Var = C0935i0.f3800a;
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }
}
