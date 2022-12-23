package n10;

import c00.C13733n;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.itinerary.C16080a;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.ticketing.message.TicketAgencyMessage;
import com.moovit.ticketing.purchase.station.PurchaseStation;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessage;
import com.tranzmate.moovit.protocol.ticketingV2.MVAgencyMessageType;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicket;
import m50.C18331g;
import p798sn.C19493a;
import p810sz.C19617r;
import q80.C13036y;

/* renamed from: n10.b */
public final /* synthetic */ class C18505b implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f47124b;

    public /* synthetic */ C18505b(int i) {
        this.f47124b = i;
    }

    public final Object convert(Object obj) {
        TicketAgencyMessage.Type type;
        switch (this.f47124b) {
            case 0:
                return ((SearchLineFragment.C15995c) obj).mo48147e0();
            case 1:
                return C16080a.m40955k((MVRouteType) obj);
            case 2:
                return ((MarkerZoomStyle) obj).f42449c;
            case 3:
                return Boolean.valueOf(((C18331g) obj).mo50785m2());
            case 4:
                return Boolean.valueOf(((PaymentGatewayFragment.C16322a) obj).mo23103A1());
            case 5:
                return ((MVTicket) obj).passBookId;
            case 6:
                MVAgencyMessage mVAgencyMessage = (MVAgencyMessage) obj;
                C19617r rVar = C13036y.f32248a;
                MVAgencyMessageType mVAgencyMessageType = mVAgencyMessage.type;
                int i = C13036y.C13037a.f32258j[mVAgencyMessageType.ordinal()];
                if (i == 1) {
                    type = TicketAgencyMessage.Type.INFO;
                } else if (i == 2) {
                    type = TicketAgencyMessage.Type.POSITIVE;
                } else if (i == 3) {
                    type = TicketAgencyMessage.Type.ALERT;
                } else if (i == 4) {
                    type = TicketAgencyMessage.Type.CRITICAL;
                } else {
                    throw new IllegalStateException("Unknown message type: " + mVAgencyMessageType);
                }
                return new TicketAgencyMessage(type, mVAgencyMessage.message, mVAgencyMessage.expirationUtc);
            case 7:
                return ((C19493a) obj).f49559d;
            default:
                return ((PurchaseStation) obj).f23420c;
        }
    }
}
