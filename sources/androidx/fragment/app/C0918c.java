package androidx.fragment.app;

import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.c */
public final class C0918c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ List f3726b;

    /* renamed from: c */
    public final /* synthetic */ SpecialEffectsController.Operation f3727c;

    /* renamed from: d */
    public final /* synthetic */ C0911b f3728d;

    public C0918c(C0911b bVar, ArrayList arrayList, SpecialEffectsController.Operation operation) {
        this.f3728d = bVar;
        this.f3726b = arrayList;
        this.f3727c = operation;
    }

    public final void run() {
        if (this.f3726b.contains(this.f3727c)) {
            this.f3726b.remove(this.f3727c);
            C0911b bVar = this.f3728d;
            SpecialEffectsController.Operation operation = this.f3727c;
            bVar.getClass();
            operation.f3692a.applyState(operation.f3694c.mView);
        }
    }
}
