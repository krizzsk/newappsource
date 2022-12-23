package com.moovit.ticketing.providers;

import android.content.Context;
import c70.C13752e;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
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
import q80.C13011b;
import q80.C13017f;
import q80.C13019h;
import r80.C13047a;
import s80.C13065d;
import u80.C13137a;
import v80.C13184b;

public enum TicketingEngine implements C13047a {
    MASABI(new ServerId(MVTicketClinetEngine.MASABI.getValue()), new C13065d()),
    XIMEDES(new ServerId(MVTicketClinetEngine.XIMEDES.getValue()), new C13137a());
    
    private final C13047a interceptor;
    private final ServerId providerId;

    private TicketingEngine(ServerId serverId, C13047a aVar) {
        this.providerId = serverId;
        this.interceptor = aVar;
    }

    public C13011b activateTicket(C13752e eVar, C12991b bVar, C12916c cVar) throws ServerException {
        return this.interceptor.activateTicket(eVar, bVar, cVar);
    }

    public Map<String, String> createProperties(Context context, C12991b bVar, List<TicketItineraryLegFare> list) {
        return this.interceptor.createProperties(context, bVar, list);
    }

    public ServerId getProviderId() {
        return this.providerId;
    }

    public C12890b getReceipt(C13752e eVar, TicketId ticketId) throws ServerException {
        return this.interceptor.getReceipt(eVar, ticketId);
    }

    public boolean isSupported(Context context) {
        return this.interceptor.isSupported(context);
    }

    public Boolean isValid(Context context, SuggestedTicketFare suggestedTicketFare) {
        return this.interceptor.isValid(context, suggestedTicketFare);
    }

    public C13017f perform(Context context, C12991b bVar, PurchaseStepResult purchaseStepResult) throws ServerException {
        return this.interceptor.perform(context, bVar, purchaseStepResult);
    }

    public void populateHistoryUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) throws ServerException {
        this.interceptor.populateHistoryUserTickets(eVar, bVar, list, z);
    }

    public void populateUserTickets(C13752e eVar, C12991b bVar, List<Ticket> list, boolean z) throws ServerException {
        this.interceptor.populateUserTickets(eVar, bVar, list, z);
    }

    public C13019h purchaseTicket(C13752e eVar, C12991b bVar, C13184b bVar2) throws ServerException {
        return this.interceptor.purchaseTicket(eVar, bVar, bVar2);
    }
}
