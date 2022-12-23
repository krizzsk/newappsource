package com.moovit.ticketing.purchase.itinerary;

import android.os.Parcelable;

public abstract class TicketItineraryLegFare implements Parcelable {

    /* renamed from: com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare$a */
    public interface C7702a<V, R> {
        /* renamed from: c */
        R mo24134c(TicketItineraryLegMissingFare ticketItineraryLegMissingFare, V v);

        /* renamed from: i */
        R mo24135i(TicketItineraryLegPurchasableFare ticketItineraryLegPurchasableFare, V v);
    }

    /* renamed from: b */
    public abstract <V, R> R mo24133b(C7702a<V, R> aVar, V v);
}
