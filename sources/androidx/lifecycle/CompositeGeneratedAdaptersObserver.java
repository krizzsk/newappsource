package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;

class CompositeGeneratedAdaptersObserver implements C1025n {

    /* renamed from: b */
    public final C1008g[] f3872b;

    public CompositeGeneratedAdaptersObserver(C1008g[] gVarArr) {
        this.f3872b = gVarArr;
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        new HashMap();
        for (C1008g a : this.f3872b) {
            a.mo4302a();
        }
        for (C1008g a2 : this.f3872b) {
            a2.mo4302a();
        }
    }
}
