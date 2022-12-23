package p732pq;

import android.app.Application;
import android.os.Parcelable;
import c00.C13722f;
import com.moovit.app.mot.model.MotActivationRegion;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polygon;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountProductType;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.payment.account.profile.PaymentAccountEditProfileActivity;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitAgency;
import com.moovit.transit.TransitLine;
import d50.C25717a;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import y20.C20699e;

/* renamed from: pq.k */
public final /* synthetic */ class C18950k implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f48249b;

    /* renamed from: c */
    public final /* synthetic */ Object f48250c;

    public /* synthetic */ C18950k(Object obj, int i) {
        this.f48249b = i;
        this.f48250c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f48249b) {
            case 0:
                C18951l lVar = (C18951l) this.f48250c;
                lVar.getClass();
                TransitAgency c = C7843b.m17876c((TransitLine) ((DbEntityRef) obj).get());
                if (c == null || !lVar.f48253t.contains(c.f23672b)) {
                    return false;
                }
                return true;
            case 1:
                return ((Map) this.f48250c).containsKey((ServerId) obj);
            case 2:
                Polygon polygon = (Polygon) obj;
                Parcelable.Creator<MotActivationRegion> creator = MotActivationRegion.CREATOR;
                return polygon.mo46935h((LatLonE6) this.f48250c);
            case 3:
                return ((C20699e.C20700a) obj).mo52845a((Application) this.f48250c);
            case 4:
                Parcelable.Creator<PaymentAccount> creator2 = PaymentAccount.CREATOR;
                return ((C25717a) obj).f64145b.equals((PaymentAccountProductType) this.f48250c);
            case 5:
                return ((PaymentAccountEditProfileActivity) this.f48250c).f64102Y.equals(((PaymentAccountProfile) obj).f64033b.f42828b);
            case 6:
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                return ((Ticket) this.f48250c).f23474c.equals(((TicketId) obj).f23513d);
            default:
                return ((Set) this.f48250c).contains(((Ticket) obj).f23478g.f23495b);
        }
    }
}
