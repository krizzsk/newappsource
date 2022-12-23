package androidx.fragment.app;

import androidx.fragment.app.C0911b;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Objects;

/* renamed from: androidx.fragment.app.k */
public final class C0938k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0911b.C0915d f3804b;

    /* renamed from: c */
    public final /* synthetic */ SpecialEffectsController.Operation f3805c;

    public C0938k(C0911b.C0915d dVar, SpecialEffectsController.Operation operation) {
        this.f3804b = dVar;
        this.f3805c = operation;
    }

    public final void run() {
        this.f3804b.mo4054a();
        if (FragmentManager.m2590J(2)) {
            Objects.toString(this.f3805c);
        }
    }
}
