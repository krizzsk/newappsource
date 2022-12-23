package androidx.lifecycle;

import androidx.lifecycle.C0992b;
import androidx.lifecycle.Lifecycle;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C1025n {

    /* renamed from: b */
    public final Object f3891b;

    /* renamed from: c */
    public final C0992b.C0993a f3892c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3891b = obj;
        this.f3892c = C0992b.f3908c.mo4267b(obj.getClass());
    }

    /* renamed from: f */
    public final void mo740f(C1033p pVar, Lifecycle.Event event) {
        C0992b.C0993a aVar = this.f3892c;
        Object obj = this.f3891b;
        C0992b.C0993a.m2858a((List) aVar.f3911a.get(event), pVar, event, obj);
        C0992b.C0993a.m2858a((List) aVar.f3911a.get(Lifecycle.Event.ON_ANY), pVar, event, obj);
    }
}
