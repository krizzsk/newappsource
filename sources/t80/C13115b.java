package t80;

import android.content.Context;
import android.util.SparseArray;
import c00.C13720d;
import com.moovit.app.home.dashboard.C14948l;
import com.moovit.ticketing.providers.masabi.MasabiTicketingException;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult;
import com.moovit.ticketing.ticket.TicketAgency;
import java.util.List;
import m80.C12873i;
import p705on.C18801i;
import p977zz.C20944i0;
import q80.C13035x;
import s80.C13063b;
import s80.C13070g;

/* renamed from: t80.b */
public final class C13115b extends C13118e {
    public C13115b(Context context, TicketAgency ticketAgency, String str, List list) {
        super(context, ticketAgency, str, list);
    }

    /* renamed from: b */
    public final Object mo24020b(PurchaseStationSelectionStepResult purchaseStationSelectionStepResult) throws Exception {
        throw new MasabiTicketingException("Unsupported operation, only one step on flat fares");
    }

    /* renamed from: h */
    public final Object mo24023h(PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult) throws Exception {
        throw new MasabiTicketingException("Unsupported operation, only one step on flat fares");
    }

    /* renamed from: i */
    public final String mo40013i() {
        return "com.masabi.purchase.flat";
    }

    /* renamed from: k */
    public final Object mo24024k(PurchaseMasabiStepResult purchaseMasabiStepResult) throws Exception {
        C18801i t = mo40021t();
        SparseArray<String> i = C13070g.m33017i(new C13063b(this.f32572d, this.f32574e, 0, (C20944i0<Integer, Integer>) null));
        return new PurchaseTicketFareSelectionStep("com.masabi.purchase.flat.purchase", "masabi_flat_purchase", C13720d.m34273c(t.f47874b, new C14948l(1), new C13035x(1, this.f32571c, i)), (String) null, (PurchaseFilters) null, this.f32570b.getString(C12873i.purchase_ticket_selection_select_ticket));
    }

    /* renamed from: m */
    public final Object mo24025m(PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult) throws Exception {
        throw new MasabiTicketingException("Unsupported operation, only one step on flat fares");
    }
}
