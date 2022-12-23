package e20;

import c00.C13722f;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.payment.gateway.PaymentGatewayType;
import com.moovit.ticketing.purchase.itinerary.C7707a;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import com.moovit.transit.TransitPattern;
import com.moovit.util.time.Time;
import p80.C12991b;

/* renamed from: e20.f */
public final /* synthetic */ class C16774f implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f43672b;

    /* renamed from: c */
    public final /* synthetic */ Object f43673c;

    /* renamed from: d */
    public final /* synthetic */ Object f43674d;

    public /* synthetic */ C16774f(int i, Object obj, Object obj2) {
        this.f43672b = i;
        this.f43673c = obj;
        this.f43674d = obj2;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        boolean z;
        DbEntityRef<TransitPattern> dbEntityRef;
        TransitPattern transitPattern;
        switch (this.f43672b) {
            case 0:
                Time time = (Time) this.f43673c;
                ServerId serverId = (ServerId) this.f43674d;
                Time time2 = (Time) obj;
                if (time == null || time.compareTo(time2) <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z || (dbEntityRef = time2.f23905f) == null || (transitPattern = dbEntityRef.get()) == null) {
                    return false;
                }
                return transitPattern.mo24390g(serverId);
            case 1:
                PaymentGateway paymentGateway = (PaymentGateway) obj;
                return Boolean.TRUE.equals(paymentGateway.mo48904F1(((PaymentGatewayInstructions) this.f43673c).f42677b, (PaymentGatewayType) this.f43674d));
            default:
                return ((Boolean) ((TicketItineraryLegFare) obj).mo24133b(((C7707a) this.f43673c).f23405p, (C12991b) this.f43674d)).booleanValue();
        }
    }
}
