package r80;

import android.content.Context;
import c00.C13723g;
import c70.C13752e;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.providers.TicketingEngine;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m90.C12890b;
import n80.C12916c;
import p435de.C16596f;
import p589jq.C17916h;
import p594jv.C17939i;
import p80.C12991b;
import q80.C13011b;
import q80.C13017f;
import q80.C13019h;
import v80.C13184b;

/* renamed from: r80.b */
public final class C13048b implements C13047a {

    /* renamed from: c */
    public static final C13048b f32272c = new C13048b();

    /* renamed from: b */
    public List<TicketingEngine> f32273b;

    /* renamed from: a */
    public final List<TicketingEngine> mo39933a(Context context) {
        if (this.f32273b == null) {
            synchronized (this) {
                if (this.f32273b == null) {
                    ArrayList c = C13723g.m34282c(Arrays.asList(TicketingEngine.values()), new C17916h(context, 5));
                    this.f32273b = c;
                    this.f32273b = Collections.unmodifiableList(c);
                }
            }
        }
        return this.f32273b;
    }

    public final C13011b activateTicket(C13752e eVar, C12991b bVar, C12916c cVar) throws ServerException {
        for (TicketingEngine activateTicket : mo39933a(eVar.f33852a)) {
            C13011b activateTicket2 = activateTicket.activateTicket(eVar, bVar, cVar);
            if (activateTicket2 != null) {
                return activateTicket2;
            }
        }
        return null;
    }

    public final Map<String, String> createProperties(Context context, C12991b bVar, List<TicketItineraryLegFare> list) {
        for (TicketingEngine createProperties : mo39933a(context)) {
            Map<String, String> createProperties2 = createProperties.createProperties(context, bVar, list);
            if (createProperties2 != null) {
                return createProperties2;
            }
        }
        return null;
    }

    public final C12890b getReceipt(C13752e eVar, TicketId ticketId) throws ServerException {
        for (TicketingEngine receipt : mo39933a(eVar.f33852a)) {
            C12890b receipt2 = receipt.getReceipt(eVar, ticketId);
            if (receipt2 != null) {
                return receipt2;
            }
        }
        return null;
    }

    public final boolean isSupported(Context context) {
        return !mo39933a(context).isEmpty();
    }

    public final Boolean isValid(Context context, SuggestedTicketFare suggestedTicketFare) {
        Boolean bool;
        Iterator<TicketingEngine> it = mo39933a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = it.next().isValid(context, suggestedTicketFare);
            if (bool != null) {
                break;
            }
        }
        if (Boolean.FALSE.equals(bool)) {
            C17939i.m44563k(context, suggestedTicketFare);
        }
        return bool;
    }

    public final C13017f perform(Context context, C12991b bVar, PurchaseStepResult purchaseStepResult) throws ServerException {
        for (TicketingEngine perform : mo39933a(context)) {
            C13017f perform2 = perform.perform(context, bVar, purchaseStepResult);
            if (perform2 != null) {
                return perform2;
            }
        }
        return null;
    }

    public final void populateHistoryUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) {
        for (TicketingEngine populateHistoryUserTickets : mo39933a(eVar.f33852a)) {
            try {
                populateHistoryUserTickets.populateHistoryUserTickets(eVar, bVar, list, z);
            } catch (Exception e) {
                C16596f.m42113a().mo49364c(e);
            }
        }
    }

    public final void populateUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) {
        for (TicketingEngine populateUserTickets : mo39933a(eVar.f33852a)) {
            try {
                populateUserTickets.populateUserTickets(eVar, bVar, list, z);
            } catch (Exception e) {
                C16596f.m42113a().mo49364c(e);
            }
        }
    }

    public final C13019h purchaseTicket(C13752e eVar, C12991b bVar, C13184b bVar2) throws ServerException {
        for (TicketingEngine purchaseTicket : mo39933a(eVar.f33852a)) {
            C13019h purchaseTicket2 = purchaseTicket.purchaseTicket(eVar, bVar, bVar2);
            if (purchaseTicket2 != null) {
                return purchaseTicket2;
            }
        }
        return null;
    }
}
