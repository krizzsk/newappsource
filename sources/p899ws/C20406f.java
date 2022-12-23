package p899ws;

import c00.C13722f;
import com.moovit.app.help.feedback.CategoryType;
import com.moovit.app.home.lines.favorites.FavoriteLinesFragment;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.util.time.Time;
import com.moovit.view.ScheduleView;
import com.tranzmate.moovit.protocol.search.MVSearchResponseItem;
import com.tranzmate.moovit.protocol.search.MVSearchResultType;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig;
import e20.C16783l;
import java.util.List;
import p810sz.C19617r;
import p924xt.C20598h;
import p952yy.C20787c;
import q80.C13036y;
import s90.C13076d;

/* renamed from: ws.f */
public final /* synthetic */ class C20406f implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f51705b;

    public /* synthetic */ C20406f(int i) {
        this.f51705b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f51705b) {
            case 0:
                return ((CategoryType) obj).isSupported();
            case 1:
                return !C16783l.m42470b((Itinerary) obj, 7, 6, 5, 17, 14, 16, 15);
            case 2:
                int i = FavoriteLinesFragment.f38373E;
                C20787c a = ((FavoriteLinesFragment.C15003h) obj).mo45212a();
                if (a == null) {
                    return true;
                }
                return true ^ a.f52458c.mo24322B((Time) null);
            case 3:
                int i2 = C20598h.f52097z;
                if (5 == ((Leg) obj).getType()) {
                    return true;
                }
                return false;
            case 4:
                return ((Time) obj).mo24633j();
            case 5:
                int i3 = SingleLegCard.f38664n0;
                return ServiceStatusCategory.IMPORTANT_LEVEL.contains(((LineServiceAlertDigest) obj).f23186c.f23213b);
            case 6:
                return !MVSearchResultType.STOP.equals(((MVSearchResponseItem) obj).type);
            case 7:
                return C13076d.f32345h.contains(((Ticket) obj).f23475d);
            case 8:
                C19617r rVar = C13036y.f32248a;
                List<MVTicketingAgencyCapabilities> list = ((MVTicketingAgencyConfig) obj).capabilities;
                if (list == null || !list.contains(MVTicketingAgencyCapabilities.PROVIDER_LEVEL_VALIDATION_INFO)) {
                    return false;
                }
                return true;
            default:
                return ((ScheduleView) obj).f23977i;
        }
    }
}
