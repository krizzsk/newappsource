package d90;

import ce0.C21100e;
import com.moovit.ticketing.purchase.itinerary.TicketItineraryLegFare;
import com.moovit.util.CurrencyAmount;
import java.util.List;
import p019b0.C1426c;

/* renamed from: d90.a */
public final class C12607a {

    /* renamed from: a */
    public final String f31154a;

    /* renamed from: b */
    public final String f31155b;

    /* renamed from: c */
    public final List<TicketItineraryLegFare> f31156c;

    /* renamed from: d */
    public final CurrencyAmount f31157d;

    /* renamed from: e */
    public final C1426c f31158e;

    public C12607a(String str, String str2, List<TicketItineraryLegFare> list, CurrencyAmount currencyAmount, C1426c cVar) {
        C21100e.m49373x(str, "contextId");
        this.f31154a = str;
        C21100e.m49373x(str2, "itineraryId");
        this.f31155b = str2;
        C21100e.m49373x(list, "fares");
        this.f31156c = list;
        this.f31157d = currencyAmount;
        this.f31158e = cVar;
    }
}
