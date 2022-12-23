package p092g3;

import androidx.lifecycle.C1043v;
import androidx.work.impl.utils.futures.C1420a;
import p081f3.C4660j;

/* renamed from: g3.c */
public final class C4754c implements C4660j {

    /* renamed from: c */
    public final C1043v<C4660j.C4661a> f16038c = new C1043v<>();

    /* renamed from: d */
    public final C1420a<C4660j.C4661a.C4664c> f16039d = new C1420a<>();

    public C4754c() {
        mo20261a(C4660j.f15902b);
    }

    /* renamed from: a */
    public final void mo20261a(C4660j.C4661a aVar) {
        this.f16038c.postValue(aVar);
        if (aVar instanceof C4660j.C4661a.C4664c) {
            this.f16039d.mo5756h((C4660j.C4661a.C4664c) aVar);
        } else if (aVar instanceof C4660j.C4661a.C4662a) {
            this.f16039d.mo5757i(((C4660j.C4661a.C4662a) aVar).f15903a);
        }
    }
}
