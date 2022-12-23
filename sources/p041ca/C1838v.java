package p041ca;

import p041ca.C1822i;
import p075ea.C4614a;
import p075ea.C4615b;
import p075ea.C4617c;
import p301w9.C7003a;
import p313x9.C7179a;
import p313x9.C7180b;
import ye0.C25292a;

/* renamed from: ca.v */
public final class C1838v implements C7180b<C1835u> {

    /* renamed from: a */
    public final C25292a<C4614a> f6359a;

    /* renamed from: b */
    public final C25292a<C4614a> f6360b;

    /* renamed from: c */
    public final C25292a<C1816e> f6361c;

    /* renamed from: d */
    public final C25292a<C1811b0> f6362d;

    /* renamed from: e */
    public final C25292a<String> f6363e;

    public C1838v(C1814c0 c0Var, C1819g gVar) {
        C4615b bVar = C4615b.C4616a.f15836a;
        C4617c cVar = C4617c.C4618a.f15837a;
        C1822i iVar = C1822i.C1823a.f6323a;
        this.f6359a = bVar;
        this.f6360b = cVar;
        this.f6361c = iVar;
        this.f6362d = c0Var;
        this.f6363e = gVar;
    }

    public final Object get() {
        C7179a aVar;
        C4614a aVar2 = this.f6359a.get();
        C4614a aVar3 = this.f6360b.get();
        C1816e eVar = this.f6361c.get();
        C1811b0 b0Var = this.f6362d.get();
        C25292a<String> aVar4 = this.f6363e;
        Object obj = C7179a.f22275c;
        if (aVar4 instanceof C7003a) {
            aVar = (C7003a) aVar4;
        } else {
            aVar4.getClass();
            aVar = new C7179a(aVar4);
        }
        return new C1835u(aVar2, aVar3, eVar, b0Var, aVar);
    }
}
