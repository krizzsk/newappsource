package s80;

import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult;

/* renamed from: s80.a */
public final class C13062a implements PurchaseStepResult.C7646a<Boolean, RuntimeException> {
    /* renamed from: a */
    public final Object mo24019a(PurchaseTicketFareSelectionStepResult purchaseTicketFareSelectionStepResult) throws Exception {
        return Boolean.valueOf(purchaseTicketFareSelectionStepResult.f23249b.startsWith("com.masabi.purchase"));
    }

    /* renamed from: b */
    public final Object mo24020b(PurchaseStationSelectionStepResult purchaseStationSelectionStepResult) throws Exception {
        return Boolean.valueOf(purchaseStationSelectionStepResult.f23249b.startsWith("com.masabi.purchase"));
    }

    /* renamed from: e */
    public final Object mo24021e(SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult) throws Exception {
        boolean z;
        SuggestedTicketFare suggestedTicketFare = suggestedTicketFareSelectionStepResult.f23324c;
        if (suggestedTicketFare == null || !C13065d.f32318d.equals(suggestedTicketFare.f23313b)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: g */
    public final Object mo24022g(PurchaseTypeSelectionStepResult purchaseTypeSelectionStepResult) throws Exception {
        return Boolean.valueOf(purchaseTypeSelectionStepResult.f23249b.startsWith("com.masabi.purchase"));
    }

    /* renamed from: h */
    public final Object mo24023h(PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult) throws Exception {
        return Boolean.valueOf(purchaseItineraryLegSelectionStepResult.f23249b.startsWith("com.masabi.purchase"));
    }

    /* renamed from: k */
    public final Object mo24024k(PurchaseMasabiStepResult purchaseMasabiStepResult) throws Exception {
        return Boolean.valueOf(purchaseMasabiStepResult.f23249b.startsWith("com.masabi"));
    }

    /* renamed from: m */
    public final Object mo24025m(PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult) throws Exception {
        return Boolean.valueOf(purchaseFilterSelectionStepResult.f23249b.startsWith("com.masabi.purchase"));
    }

    /* renamed from: n */
    public final Object mo24026n(PurchaseStoredValueSelectionStepResult purchaseStoredValueSelectionStepResult) throws Exception {
        return Boolean.valueOf(purchaseStoredValueSelectionStepResult.f23249b.startsWith("com.masabi.purchase"));
    }
}
