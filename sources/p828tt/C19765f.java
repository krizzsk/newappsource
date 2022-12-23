package p828tt;

import c00.C13722f;
import com.moovit.matrolanguage.MetroLanguage;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.ticketing.message.TicketAgencyMessage;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.moovit.util.time.Time;
import e20.C16783l;
import p641lu.C18277b;

/* renamed from: tt.f */
public final /* synthetic */ class C19765f implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f50251b;

    public /* synthetic */ C19765f(int i) {
        this.f50251b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f50251b) {
            case 0:
                return C19766g.f50253d.contains(((TripPlannerTransportTypeInfo) obj).f23802b);
            case 1:
                C18277b bVar = C16783l.f43688a;
                return !((Time) obj).mo24633j();
            case 2:
                if (((MetroLanguage) obj).f14789c == null) {
                    return true;
                }
                return false;
            case 3:
                return ((PaymentMethod) obj).f64053c;
            case 4:
                return ((PurchaseStoredValueAmount) obj).f23433e;
            default:
                if (((TicketAgencyMessage) obj).f23244d > System.currentTimeMillis()) {
                    return true;
                }
                return false;
        }
    }
}
