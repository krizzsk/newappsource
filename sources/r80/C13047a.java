package r80;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import java.util.List;
import java.util.Map;
import m90.C12890b;
import n80.C12916c;
import p80.C12991b;
import q80.C13011b;
import q80.C13017f;
import q80.C13019h;
import v80.C13184b;

/* renamed from: r80.a */
public interface C13047a {
    C13011b activateTicket(C13752e eVar, C12991b bVar, C12916c cVar) throws ServerException;

    Map<String, String> createProperties(Context context, C12991b bVar, List<TicketItineraryLegFare> list);

    C12890b getReceipt(C13752e eVar, TicketId ticketId) throws ServerException;

    boolean isSupported(Context context);

    Boolean isValid(Context context, SuggestedTicketFare suggestedTicketFare);

    C13017f perform(Context context, C12991b bVar, PurchaseStepResult purchaseStepResult) throws ServerException;

    void populateHistoryUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) throws ServerException;

    void populateUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) throws ServerException;

    C13019h purchaseTicket(C13752e eVar, C12991b bVar, C13184b bVar2) throws ServerException;
}
