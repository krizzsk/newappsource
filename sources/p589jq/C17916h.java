package p589jq;

import android.content.Context;
import c00.C13722f;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polygon;
import com.moovit.ticketing.providers.TicketingEngine;
import com.moovit.transit.TransitStop;
import com.moovit.tripplanner.TripPlannerTransportType;
import java.util.List;
import p785ry.C19385e;
import p80.C12991b;
import p805su.C19544f;
import y20.C20695c;

/* renamed from: jq.h */
public final /* synthetic */ class C17916h implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f45971b;

    /* renamed from: c */
    public final /* synthetic */ Object f45972c;

    public /* synthetic */ C17916h(Object obj, int i) {
        this.f45971b = i;
        this.f45972c = obj;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f45971b) {
            case 0:
                return ((List) this.f45972c).contains((TripPlannerTransportType) obj);
            case 1:
                TransitStop transitStop = (TransitStop) this.f45972c;
                TransitStop transitStop2 = ((C19544f.C19546b) obj).f49671b;
                if (transitStop2 == null || !transitStop2.equals(transitStop)) {
                    return false;
                }
                return true;
            case 2:
                C19385e eVar = C19385e.f49315c;
                return ((String) this.f45972c).equals(((WondoOffer) obj).f40720g.f40997b);
            case 3:
                return !((C20695c) this.f45972c).f52270e.contains((String) obj);
            case 4:
                Polygon polygon = (Polygon) obj;
                C12991b.C12992a aVar = C12991b.f32158f;
                return polygon.mo46935h((LatLonE6) this.f45972c);
            default:
                return ((TicketingEngine) obj).isSupported((Context) this.f45972c);
        }
    }
}
