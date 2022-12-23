package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import mf0.C24362h;
import wh0.C25232y0;

/* renamed from: androidx.lifecycle.k */
public final class C1018k {

    /* renamed from: a */
    public final Lifecycle f3951a;

    /* renamed from: b */
    public final Lifecycle.State f3952b;

    /* renamed from: c */
    public final C1000d f3953c;

    /* renamed from: d */
    public final C1016j f3954d;

    public C1018k(Lifecycle lifecycle, Lifecycle.State state, C1000d dVar, C25232y0 y0Var) {
        C24362h.m61211f(lifecycle, "lifecycle");
        C24362h.m61211f(state, "minState");
        C24362h.m61211f(dVar, "dispatchQueue");
        this.f3951a = lifecycle;
        this.f3952b = state;
        this.f3953c = dVar;
        C1016j jVar = new C1016j(this, y0Var);
        this.f3954d = jVar;
        if (lifecycle.mo4225b() == Lifecycle.State.DESTROYED) {
            y0Var.mo61776a((CancellationException) null);
            mo4306a();
            return;
        }
        lifecycle.mo4224a(jVar);
    }

    /* renamed from: a */
    public final void mo4306a() {
        this.f3951a.mo4226c(this.f3954d);
        C1000d dVar = this.f3953c;
        dVar.f3920b = true;
        dVar.mo4291a();
    }
}
