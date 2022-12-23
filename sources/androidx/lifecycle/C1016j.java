package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import mf0.C24362h;
import wh0.C25232y0;

/* renamed from: androidx.lifecycle.j */
public final /* synthetic */ class C1016j implements C1025n {

    /* renamed from: b */
    public final /* synthetic */ C1018k f3947b;

    /* renamed from: c */
    public final /* synthetic */ C25232y0 f3948c;

    public /* synthetic */ C1016j(C1018k kVar, C25232y0 y0Var) {
        this.f3947b = kVar;
        this.f3948c = y0Var;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        C1018k kVar = this.f3947b;
        C25232y0 y0Var = this.f3948c;
        C24362h.m61211f(kVar, "this$0");
        C24362h.m61211f(y0Var, "$parentJob");
        if (pVar.getLifecycle().mo4225b() == Lifecycle.State.DESTROYED) {
            y0Var.mo61776a((CancellationException) null);
            kVar.mo4306a();
        } else if (pVar.getLifecycle().mo4225b().compareTo(kVar.f3952b) < 0) {
            kVar.f3953c.f3919a = true;
        } else {
            C1000d dVar = kVar.f3953c;
            if (dVar.f3919a) {
                if (!dVar.f3920b) {
                    dVar.f3919a = false;
                    dVar.mo4291a();
                    return;
                }
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
        }
    }
}
