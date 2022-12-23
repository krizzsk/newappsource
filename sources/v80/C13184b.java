package v80;

import ce0.C21100e;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.util.CurrencyAmount;
import p019b0.C1426c;

/* renamed from: v80.b */
public final class C13184b {

    /* renamed from: a */
    public final String f32729a;

    /* renamed from: b */
    public final TicketFare f32730b;

    /* renamed from: c */
    public final int f32731c;

    /* renamed from: d */
    public final CurrencyAmount f32732d;

    /* renamed from: e */
    public final PurchaseFilters f32733e;

    /* renamed from: f */
    public final C1426c f32734f;

    public C13184b(String str, TicketFare ticketFare, int i, CurrencyAmount currencyAmount, PurchaseFilters purchaseFilters, C1426c cVar) {
        C21100e.m49373x(str, "contextId");
        this.f32729a = str;
        C21100e.m49373x(ticketFare, "ticketFare");
        this.f32730b = ticketFare;
        C21100e.m49375y(1, Integer.MAX_VALUE, "quantity", i);
        this.f32731c = i;
        C21100e.m49373x(currencyAmount, "totalPrice");
        this.f32732d = currencyAmount;
        this.f32733e = purchaseFilters;
        this.f32734f = cVar == null ? new C1426c(8) : cVar;
    }
}
