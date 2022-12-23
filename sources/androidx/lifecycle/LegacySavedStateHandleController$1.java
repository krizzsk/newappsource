package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import p256t2.C6552c;

class LegacySavedStateHandleController$1 implements C1025n {

    /* renamed from: b */
    public final /* synthetic */ Lifecycle f3876b;

    /* renamed from: c */
    public final /* synthetic */ C6552c f3877c;

    public LegacySavedStateHandleController$1(Lifecycle lifecycle, C6552c cVar) {
        this.f3876b = lifecycle;
        this.f3877c = cVar;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_START) {
            this.f3876b.mo4226c(this);
            this.f3877c.mo22666d();
        }
    }
}
