package p948yu;

import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLegType;
import com.tranzmate.moovit.protocol.navigation.MVLegNavigationRequest;
import com.tranzmate.moovit.protocol.navigation.MVNavigationRequest;
import java.util.ArrayList;
import java.util.Collections;
import mf0.C24361g;

/* renamed from: yu.b */
public final class C20769b extends C13778r<C20769b, C20771c, MVNavigationRequest> {

    /* renamed from: x */
    public static final int[] f52409x = {1, 11, 12, 2, 5, 9, 8, 14, 15, 16, 17, 18};

    /* renamed from: y */
    public static final C20770a f52410y = new C20770a();

    /* renamed from: w */
    public final Itinerary f52411w;

    /* renamed from: yu.b$a */
    public class C20770a implements C13722f<Leg> {
        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            return C24361g.m61132B(C20769b.f52409x, ((Leg) obj).getType());
        }
    }

    public C20769b(Itinerary itinerary, C13752e eVar) {
        super(eVar, R.string.api_path_itinerary_navigation_request_path, C20771c.class);
        MVLegNavigationRequest mVLegNavigationRequest;
        C21100e.m49373x(itinerary, "itinerary");
        this.f52411w = itinerary;
        ArrayList<T> c = C13723g.m34282c(itinerary.mo48295u0(), f52410y);
        ArrayList arrayList = new ArrayList(c.size());
        for (T t : c) {
            switch (t.getType()) {
                case 1:
                    mVLegNavigationRequest = new MVLegNavigationRequest(MVLegType.Walk);
                    mVLegNavigationRequest.walkEncodedPolylines = Collections.singletonList(Polylon.m40196n(((WalkLeg) t).f42151f));
                    break;
                case 2:
                    mVLegNavigationRequest = m48756O((TransitLineLeg) t);
                    break;
                case 5:
                    mVLegNavigationRequest = new MVLegNavigationRequest(MVLegType.Car);
                    mVLegNavigationRequest.walkEncodedPolylines = Collections.singletonList(Polylon.m40196n(((TaxiLeg) t).f42102g));
                    break;
                case 8:
                    mVLegNavigationRequest = new MVLegNavigationRequest(MVLegType.Walk);
                    mVLegNavigationRequest.walkEncodedPolylines = Collections.singletonList(Polylon.m40196n(((PathwayWalkLeg) t).mo48340w1()));
                    break;
                case 9:
                    mVLegNavigationRequest = m48756O(((MultiTransitLinesLeg) t).mo48440b());
                    break;
                case 11:
                case 12:
                    mVLegNavigationRequest = new MVLegNavigationRequest(MVLegType.Bicycle);
                    mVLegNavigationRequest.walkEncodedPolylines = Collections.singletonList(Polylon.m40196n(t.mo48340w1()));
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                    mVLegNavigationRequest = new MVLegNavigationRequest(MVLegType.Dockless);
                    mVLegNavigationRequest.walkEncodedPolylines = Collections.singletonList(Polylon.m40196n(t.mo48340w1()));
                    break;
                case 18:
                    mVLegNavigationRequest = new MVLegNavigationRequest(MVLegType.PersonalCar);
                    mVLegNavigationRequest.walkEncodedPolylines = Collections.singletonList(Polylon.m40196n(((CarLeg) t).f41962f));
                    break;
                default:
                    StringBuilder k = C13555b.m33972k("Unknown leg type: ");
                    k.append(t.getType());
                    throw new ApplicationBugException(k.toString());
            }
            arrayList.add(mVLegNavigationRequest);
        }
        RO mVNavigationRequest = new MVNavigationRequest();
        mVNavigationRequest.legs = arrayList;
        mVNavigationRequest.guid = itinerary.f41894b;
        this.f33922v = mVNavigationRequest;
    }

    /* renamed from: O */
    public static MVLegNavigationRequest m48756O(TransitLineLeg transitLineLeg) {
        MVLegNavigationRequest mVLegNavigationRequest = new MVLegNavigationRequest(MVLegType.Transit);
        mVLegNavigationRequest.lineId = transitLineLeg.f42110d.getServerId().f15142b;
        mVLegNavigationRequest.mo29172m();
        mVLegNavigationRequest.firstStopId = transitLineLeg.mo48460c().getServerId().f15142b;
        mVLegNavigationRequest.mo29170k();
        mVLegNavigationRequest.lastStopId = transitLineLeg.mo48459b().getServerId().f15142b;
        mVLegNavigationRequest.mo29171l();
        return mVLegNavigationRequest;
    }
}
