package t80;

import android.content.Context;
import android.util.SparseArray;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import com.moovit.app.home.dashboard.C14948l;
import com.moovit.commons.request.ServerException;
import com.moovit.image.model.Image;
import com.moovit.ticketing.providers.masabi.MasabiTicketingException;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStep;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult;
import com.moovit.ticketing.ticket.TicketAgency;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import m80.C12873i;
import p638lr.C18262i;
import p705on.C18801i;
import p705on.C18805l;
import p826tr.C19752b;
import p829tu.C19777h;
import p977zz.C20944i0;
import q80.C13035x;
import s80.C13063b;
import s80.C13070g;

/* renamed from: t80.a */
public final class C13114a extends C13118e {
    public C13114a(Context context, TicketAgency ticketAgency, String str, List<String> list) {
        super(context, ticketAgency, str, list);
    }

    /* renamed from: b */
    public final Object mo24020b(PurchaseStationSelectionStepResult purchaseStationSelectionStepResult) throws Exception {
        throw new MasabiTicketingException("Unsupported operation, Fare type does not supported station result!");
    }

    /* renamed from: h */
    public final Object mo24023h(PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult) throws Exception {
        throw new MasabiTicketingException("Unsupported operation, Fare type does not supported leg selection result!");
    }

    /* renamed from: i */
    public final String mo40013i() {
        return "com.masabi.purchase.fare_type";
    }

    /* renamed from: k */
    public final Object mo24024k(PurchaseMasabiStepResult purchaseMasabiStepResult) throws Exception {
        List<C18805l> list = mo40021t().f47874b;
        C19752b bVar = new C19752b(22);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C13720d.m34276f(list, (C13722f) null, bVar, linkedHashSet);
        int size = linkedHashSet.size();
        if (size <= 1 || size >= list.size()) {
            return mo40014u((String) null);
        }
        return new PurchaseFilterSelectionStep("com.masabi.purchase.fare_type.filter", "masabi_fare_type_filter", this.f32570b.getString(C12873i.masabi_title_filter_fare_type), (String) null, (Image) null, (String) null, "com.masabi.filter.fare_type", PurchaseFilterSelectionStep.FilterPresentationType.INDICATORS, C13720d.m34273c(linkedHashSet, (C13722f) null, new C18262i(27)), this.f32571c);
    }

    /* renamed from: m */
    public final Object mo24025m(PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult) throws Exception {
        if ("com.masabi.filter.fare_type".equals(purchaseFilterSelectionStepResult.f23358c)) {
            return mo40014u(purchaseFilterSelectionStepResult.f23359d);
        }
        StringBuilder k = C13555b.m33972k("Unknown filter type: ");
        k.append(purchaseFilterSelectionStepResult.f23358c);
        throw new MasabiTicketingException(k.toString());
    }

    /* renamed from: u */
    public final PurchaseTicketFareSelectionStep mo40014u(String str) throws ServerException {
        Iterable iterable;
        C18801i t = mo40021t();
        PurchaseFilters purchaseFilters = null;
        SparseArray<String> i = C13070g.m33017i(new C13063b(this.f32572d, this.f32574e, 1, (C20944i0<Integer, Integer>) null));
        if (str != null) {
            iterable = C13723g.m34282c(t.f47874b, new C19777h(str, 3));
        } else {
            iterable = t.f47874b;
        }
        ArrayList c = C13720d.m34273c(iterable, new C14948l(1), new C13035x(1, this.f32571c, i));
        if (str != null) {
            purchaseFilters = new PurchaseFilters(Collections.singletonList(this.f32570b.getString(C12873i.masabi_filter_fare_type)), Collections.singletonList(str));
        }
        return new PurchaseTicketFareSelectionStep("com.masabi.purchase.fare_type.purchase", "masabi_fare_type_purchase", c, (String) null, purchaseFilters, this.f32570b.getString(C12873i.purchase_ticket_selection_select_ticket));
    }
}
