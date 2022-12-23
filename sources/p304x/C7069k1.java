package p304x;

import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0585i;
import androidx.camera.core.impl.C0590n;
import p019b0.C1429f;
import p291w.C6956a;

/* renamed from: x.k1 */
public final class C7069k1 extends C7032c0 {

    /* renamed from: c */
    public static final C7069k1 f21981c = new C7069k1(new C1429f());

    /* renamed from: b */
    public final C1429f f21982b;

    public C7069k1(C1429f fVar) {
        this.f21982b = fVar;
    }

    /* renamed from: a */
    public final void mo2483a(C0585i iVar, C0578e.C0579a aVar) {
        super.mo2483a(iVar, aVar);
        C6956a.C6957a aVar2 = new C6956a.C6957a();
        C0572a aVar3 = C0585i.f2001y;
        if (((C0590n) iVar.getConfig()).mo2425e(aVar3)) {
            C1429f fVar = this.f21982b;
            int intValue = ((Integer) ((C0590n) iVar.getConfig()).mo2422a(aVar3)).intValue();
            fVar.getClass();
            C1429f.m3820a(intValue, aVar2);
        }
        aVar.mo2481c(new C6956a(C0590n.m1678s(aVar2.f21715a)));
    }
}
