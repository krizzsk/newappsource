package p242s1;

import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;

/* renamed from: s1.k */
public final /* synthetic */ class C6370k implements C1025n {

    /* renamed from: b */
    public final /* synthetic */ C6372l f20020b;

    /* renamed from: c */
    public final /* synthetic */ Lifecycle.State f20021c;

    /* renamed from: d */
    public final /* synthetic */ C6377n f20022d;

    public /* synthetic */ C6370k(C6372l lVar, Lifecycle.State state, C6377n nVar) {
        this.f20020b = lVar;
        this.f20021c = state;
        this.f20022d = nVar;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        C6372l lVar = this.f20020b;
        Lifecycle.State state = this.f20021c;
        C6377n nVar = this.f20022d;
        lVar.getClass();
        if (event == Lifecycle.Event.upTo(state)) {
            lVar.f20025b.add(nVar);
            lVar.f20024a.run();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            lVar.mo22477a(nVar);
        } else if (event == Lifecycle.Event.downFrom(state)) {
            lVar.f20025b.remove(nVar);
            lVar.f20024a.run();
        }
    }
}
