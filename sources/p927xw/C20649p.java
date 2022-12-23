package p927xw;

import android.content.Context;
import c00.C13722f;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiDashboardConfig;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.tod.C15462b;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.payment.account.model.PaymentAccount;
import java.util.Set;
import l30.C5577i;
import p977zz.C20975x0;

/* renamed from: xw.p */
public final /* synthetic */ class C20649p implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f52220b;

    /* renamed from: c */
    public final /* synthetic */ Object f52221c;

    /* renamed from: d */
    public final /* synthetic */ Object f52222d;

    /* renamed from: e */
    public final /* synthetic */ Object f52223e;

    public /* synthetic */ C20649p(int i, Object obj, Object obj2, Object obj3) {
        this.f52220b = i;
        this.f52221c = obj;
        this.f52222d = obj2;
        this.f52223e = obj3;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f52220b) {
            case 0:
                Context context = (Context) this.f52221c;
                PaymentAccount paymentAccount = (PaymentAccount) this.f52222d;
                LatLonE6 latLonE6 = (LatLonE6) this.f52223e;
                TaxiProvider taxiProvider = (TaxiProvider) obj;
                int i = C15462b.f40053x;
                TaxiDashboardConfig taxiDashboardConfig = taxiProvider.f39978m;
                if (taxiDashboardConfig == null || !"TOD".equals(taxiDashboardConfig.f39932b) || !C15413a.m39457b(context, taxiProvider, taxiDashboardConfig.f39935e, paymentAccount, latLonE6)) {
                    return false;
                }
                return true;
            default:
                String str = (String) this.f52222d;
                Set set = (Set) this.f52223e;
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) obj;
                C5577i iVar = C5577i.f18275d;
                if (!C20975x0.m49118e((String) this.f52221c, microMobilityRide.f14984b) || !C20975x0.m49118e(str, microMobilityRide.f14985c) || !set.contains(microMobilityRide.f14991i.f15007b)) {
                    return false;
                }
                return true;
        }
    }
}
