package h90;

import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.storedvalue.StoredValueStatus;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.util.CurrencyAmount;

/* renamed from: h90.a */
public final class C12739a {

    /* renamed from: a */
    public final ServerId f31467a;

    /* renamed from: b */
    public final TicketAgency f31468b;

    /* renamed from: c */
    public final CurrencyAmount f31469c;

    /* renamed from: d */
    public final StoredValueStatus f31470d;

    /* renamed from: e */
    public final boolean f31471e;

    /* renamed from: f */
    public final CurrencyAmount f31472f;

    public C12739a(ServerId serverId, TicketAgency ticketAgency, CurrencyAmount currencyAmount, StoredValueStatus storedValueStatus, boolean z, CurrencyAmount currencyAmount2) {
        C21100e.m49373x(serverId, "providerId");
        this.f31467a = serverId;
        C21100e.m49373x(ticketAgency, "agency");
        this.f31468b = ticketAgency;
        C21100e.m49373x(currencyAmount, "priceAmount");
        this.f31469c = currencyAmount;
        C21100e.m49373x(storedValueStatus, ServerParameters.STATUS);
        this.f31470d = storedValueStatus;
        this.f31471e = z;
        this.f31472f = currencyAmount2;
    }
}
