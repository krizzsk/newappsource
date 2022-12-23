package p256t2;

import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import mf0.C24362h;

/* renamed from: t2.b */
public final /* synthetic */ class C6551b implements C1025n {

    /* renamed from: b */
    public final /* synthetic */ C6552c f20356b;

    public /* synthetic */ C6551b(C6552c cVar) {
        this.f20356b = cVar;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        C6552c cVar = this.f20356b;
        C24362h.m61211f(cVar, "this$0");
        if (event == Lifecycle.Event.ON_START) {
            cVar.f20362f = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            cVar.f20362f = false;
        }
    }
}
