package u80;

import android.content.Context;
import c70.C13752e;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketClinetEngine;
import java.util.List;
import java.util.Map;
import m90.C12890b;
import n80.C12916c;
import p80.C12991b;
import p810sz.C19617r;
import p977zz.C20943i;
import q80.C13011b;
import q80.C13017f;
import q80.C13019h;
import q80.C13036y;
import r80.C13047a;
import v80.C13184b;

/* renamed from: u80.a */
public final class C13137a implements C13047a {
    static {
        MVTicketClinetEngine mVTicketClinetEngine = MVTicketClinetEngine.XIMEDES;
        C19617r rVar = C13036y.f32248a;
        mVTicketClinetEngine.getValue();
    }

    public final C13011b activateTicket(C13752e eVar, C12991b bVar, C12916c cVar) {
        return null;
    }

    public final Map<String, String> createProperties(Context context, C12991b bVar, List<TicketItineraryLegFare> list) {
        return null;
    }

    public final C12890b getReceipt(C13752e eVar, TicketId ticketId) {
        return null;
    }

    public final boolean isSupported(Context context) {
        return C20943i.m49051d(26);
    }

    public final Boolean isValid(Context context, SuggestedTicketFare suggestedTicketFare) {
        return null;
    }

    public final C13017f perform(Context context, C12991b bVar, PurchaseStepResult purchaseStepResult) {
        return null;
    }

    public final void populateHistoryUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) {
    }

    public final void populateUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) {
    }

    public final C13019h purchaseTicket(C13752e eVar, C12991b bVar, C13184b bVar2) {
        return null;
    }
}
