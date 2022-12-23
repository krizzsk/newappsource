package p372at;

import c00.C13722f;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.home.lines.favorites.FavoriteLinesFragment;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount;
import com.moovit.ticketing.validation.provider.agency.AgencySummaryInfo;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import k90.C12820b;
import p80.C12989a;
import p828tt.C19766g;

/* renamed from: at.a */
public final /* synthetic */ class C13514a implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f33430b;

    public /* synthetic */ C13514a(int i) {
        this.f33430b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f33430b) {
            case 0:
                return ((HistoryItem) obj).isExpired();
            case 1:
                return ((FavoriteLinesFragment.C15007l) obj).isEmpty();
            case 2:
                return C19766g.f50252c.contains(((TripPlannerTransportTypeInfo) obj).f23802b);
            case 3:
                return ((PaymentProfile) obj).f42832f;
            case 4:
                return ((PurchaseStoredValueAmount) obj).f23433e;
            case 5:
                AgencySummaryInfo agencySummaryInfo = (AgencySummaryInfo) obj;
                int i = C12820b.f31687v;
                if (agencySummaryInfo.f23574c != null || agencySummaryInfo.f23575d > 0) {
                    return true;
                }
                return false;
            default:
                return ((C12989a) obj).f32153e.contains(TicketingAgencyCapability.OFFLINE_MODE);
        }
    }
}
