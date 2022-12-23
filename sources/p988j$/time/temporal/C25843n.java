package p988j$.time.temporal;

import p988j$.time.C25819g;
import p988j$.time.C25822j;
import p988j$.time.C25826n;
import p988j$.time.ZoneOffset;
import p988j$.time.chrono.C25791g;

/* renamed from: j$.time.temporal.n */
public final /* synthetic */ class C25843n implements C25845p {

    /* renamed from: a */
    public final /* synthetic */ int f64434a;

    public /* synthetic */ C25843n(int i) {
        this.f64434a = i;
    }

    /* renamed from: a */
    public final Object mo83672a(C25841l lVar) {
        switch (this.f64434a) {
            case 0:
                return (C25826n) lVar.mo83606h(C25844o.f64435a);
            case 1:
                return (C25791g) lVar.mo83606h(C25844o.f64436b);
            case 2:
                return (C25846q) lVar.mo83606h(C25844o.f64437c);
            case 3:
                C25830a aVar = C25830a.OFFSET_SECONDS;
                if (lVar.mo83603f(aVar)) {
                    return ZoneOffset.m64398k(lVar.mo83601b(aVar));
                }
                return null;
            case 4:
                C25826n nVar = (C25826n) lVar.mo83606h(C25844o.f64435a);
                return nVar != null ? nVar : (C25826n) lVar.mo83606h(C25844o.f64438d);
            case 5:
                C25830a aVar2 = C25830a.EPOCH_DAY;
                if (lVar.mo83603f(aVar2)) {
                    return C25819g.m64491s(lVar.mo83604g(aVar2));
                }
                return null;
            default:
                C25830a aVar3 = C25830a.NANO_OF_DAY;
                if (lVar.mo83603f(aVar3)) {
                    return C25822j.m64518n(lVar.mo83604g(aVar3));
                }
                return null;
        }
    }
}
