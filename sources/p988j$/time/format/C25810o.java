package p988j$.time.format;

import p988j$.time.C25826n;
import p988j$.time.temporal.C25845p;

/* renamed from: j$.time.format.o */
final class C25810o implements C25802g {

    /* renamed from: a */
    private final C25845p f64370a;

    C25810o(C25796a aVar) {
        this.f64370a = aVar;
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        C25826n nVar = (C25826n) sVar.mo83713f(this.f64370a);
        if (nVar == null) {
            return false;
        }
        sb.append(nVar.mo83653i());
        return true;
    }

    public final String toString() {
        return "ZoneRegionId()";
    }
}
