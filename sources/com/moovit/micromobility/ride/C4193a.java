package com.moovit.micromobility.ride;

import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

/* renamed from: com.moovit.micromobility.ride.a */
public final class C4193a {

    /* renamed from: d */
    public static final C4194a f15005d = new C4194a();

    /* renamed from: a */
    public final boolean f15006a;

    /* renamed from: b */
    public final MicroMobilityRide.Status f15007b;

    /* renamed from: c */
    public final CurrencyAmount f15008c;

    /* renamed from: com.moovit.micromobility.ride.a$a */
    public class C4194a extends C19619s<C4193a> {
        public C4194a() {
            super(0, C4193a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new C4193a(pVar.mo51919b(), (MicroMobilityRide.Status) C13555b.m33968g(MicroMobilityRide.Status.CODER, pVar), (CurrencyAmount) pVar.mo51962q(CurrencyAmount.f23843f));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C4193a aVar = (C4193a) obj;
            qVar.mo51934b(aVar.f15006a);
            MicroMobilityRide.Status.CODER.write(aVar.f15007b, qVar);
            qVar.mo51967q(aVar.f15008c, CurrencyAmount.f23843f);
        }
    }

    public C4193a(boolean z, MicroMobilityRide.Status status, CurrencyAmount currencyAmount) {
        this.f15006a = z;
        C21100e.m49373x(status, ServerParameters.STATUS);
        this.f15007b = status;
        this.f15008c = currencyAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4193a)) {
            return false;
        }
        C4193a aVar = (C4193a) obj;
        if (this.f15006a == aVar.f15006a && this.f15007b == aVar.f15007b && C20975x0.m49118e(this.f15008c, aVar.f15008c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.f15006a;
        return C17884p.m44333D(z ? 1 : 0, C17884p.m44335F(this.f15007b), C17884p.m44335F(this.f15008c));
    }
}
