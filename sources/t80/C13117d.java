package t80;

import android.content.Context;
import android.util.SparseArray;
import ce0.C21100e;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStep;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult;
import com.moovit.ticketing.ticket.TicketAgency;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.List;
import s80.C13063b;
import s80.C13070g;

/* renamed from: t80.d */
public final class C13117d implements PurchaseStepResult.C7646a<C13116c, RuntimeException> {

    /* renamed from: b */
    public final Context f32573b;

    public C13117d(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f32573b = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C13116c m33119c(Context context, int i, String str, List<String> list, TicketAgency ticketAgency) {
        if (i == 0) {
            return new C13115b(context, ticketAgency, str, list);
        }
        if (i == 1) {
            return new C13114a(context, ticketAgency, str, list);
        }
        if (i == 2) {
            return new C13119f(context, ticketAgency, str);
        }
        throw new IllegalStateException("Wizard type unidentified. helper not created!");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24019a(PurchaseTicketFareSelectionStepResult purchaseTicketFareSelectionStepResult) throws Exception {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo24020b(PurchaseStationSelectionStepResult purchaseStationSelectionStepResult) throws Exception {
        return null;
    }

    /* renamed from: e */
    public final Object mo24021e(SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult) throws Exception {
        SparseArray<String> sparseArray;
        SuggestedTicketFare suggestedTicketFare = suggestedTicketFareSelectionStepResult.f23324c;
        if (suggestedTicketFare == null || (sparseArray = suggestedTicketFare.f23320i) == null) {
            throw new IllegalStateException("No Masabi configuration data. helper not created!");
        }
        C13063b e = C13070g.m33013e(sparseArray);
        if (e != null) {
            return m33119c(this.f32573b, e.f32315c, e.f32313a, e.f32314b, suggestedTicketFare.f23317f);
        }
        throw new IllegalStateException("Masabi configuration data in invalid. helper not created!");
    }

    /* renamed from: g */
    public final Object mo24022g(PurchaseTypeSelectionStepResult purchaseTypeSelectionStepResult) throws Exception {
        throw new UnsupportedOperationException("Type selection does not supported!");
    }

    /* renamed from: h */
    public final Object mo24023h(PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult) throws Exception {
        throw new UnsupportedOperationException("Leg selection does not supported!");
    }

    /* renamed from: k */
    public final Object mo24024k(PurchaseMasabiStepResult purchaseMasabiStepResult) throws Exception {
        PurchaseMasabiStep purchaseMasabiStep = purchaseMasabiStepResult.f23417c;
        return m33119c(this.f32573b, purchaseMasabiStep.f23414g, purchaseMasabiStep.f23415h, purchaseMasabiStep.f23413f, purchaseMasabiStep.f23412e);
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Object mo24025m(PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult) throws Exception {
        return null;
    }

    /* renamed from: n */
    public final Object mo24026n(PurchaseStoredValueSelectionStepResult purchaseStoredValueSelectionStepResult) throws Exception {
        throw new UnsupportedOperationException("Stored value selection does not supported!");
    }
}
