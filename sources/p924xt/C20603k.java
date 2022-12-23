package p924xt;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import c00.C13722f;
import com.moovit.app.search.locations.C15284a;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.database.DbEntityRef;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.EventBookingOption;
import com.moovit.transit.TransitPatternShape;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.util.time.Time;
import p713ov.C18841h;
import p810sz.C19617r;
import t60.C19634d;
import w40.C25765g;

/* renamed from: xt.k */
public final /* synthetic */ class C20603k implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f52115b;

    public /* synthetic */ C20603k(int i) {
        this.f52115b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f52115b) {
            case 0:
                Leg leg = (Leg) obj;
                if (leg.getType() != 7 || ((CarpoolLeg) leg).f41976l.f41986c == null) {
                    return false;
                }
                return true;
            case 1:
                Time time = (Time) obj;
                if (!time.mo24633j() || time.f23912m == null) {
                    return false;
                }
                return true;
            case 2:
                int i = C18841h.f47970s;
                if (((EventBookingOption) obj).f42933h != null) {
                    return true;
                }
                return false;
            case 3:
                ServerId serverId = C15284a.f39471U;
                return SearchLocationItem.Type.STOP.equals(((SearchLocationItem) obj).f39458c);
            case 4:
                return ((Time) obj).mo24633j();
            case 5:
                C19617r rVar = C25765g.f64279a;
                return ((Fragment) obj) instanceof C19634d;
            default:
                Parcelable.Creator<TransitPatternTrips> creator = TransitPatternTrips.CREATOR;
                return DbEntityRef.areFullyResolved(((TransitPatternShape) obj).f23713b);
        }
    }
}
