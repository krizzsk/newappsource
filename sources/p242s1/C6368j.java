package p242s1;

import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;

/* renamed from: s1.j */
public final /* synthetic */ class C6368j implements C1025n {

    /* renamed from: b */
    public final /* synthetic */ C6372l f20018b;

    /* renamed from: c */
    public final /* synthetic */ C6377n f20019c;

    public /* synthetic */ C6368j(C6372l lVar, C6377n nVar) {
        this.f20018b = lVar;
        this.f20019c = nVar;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        C6372l lVar = this.f20018b;
        C6377n nVar = this.f20019c;
        lVar.getClass();
        if (event == Lifecycle.Event.ON_DESTROY) {
            lVar.mo22477a(nVar);
        }
    }
}
