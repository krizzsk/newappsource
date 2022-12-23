package p732pq;

import com.moovit.app.MoovitAppActivity;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.BicycleLeg;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.EventLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.PathwayWalkLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.itinerary.model.leg.WalkLeg;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import java.util.HashSet;
import p732pq.C18951l;

/* renamed from: pq.a */
public abstract class C18939a<A extends MoovitAppActivity> extends C18951l<A> {

    /* renamed from: pq.a$a */
    public static class C18940a implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final HashSet f48241b = new HashSet();

        /* renamed from: c */
        public final HashSet f48242c = new HashSet();

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            return null;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo39911c(TaxiLeg taxiLeg) {
            return null;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            for (TransitLineLeg next : multiTransitLinesLeg.f42086b) {
                next.getClass();
                mo39922n(next);
            }
            return null;
        }

        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object mo39913e(WalkLeg walkLeg) {
            return null;
        }

        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            return null;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return null;
        }

        /* renamed from: h */
        public final /* bridge */ /* synthetic */ Object mo39916h(CarpoolLeg carpoolLeg) {
            return null;
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ Object mo39917i(BicycleLeg bicycleLeg) {
            return null;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ Object mo39918j(EventLeg eventLeg) {
            return null;
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            return null;
        }

        /* renamed from: l */
        public final /* bridge */ /* synthetic */ Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            return null;
        }

        /* renamed from: m */
        public final /* bridge */ /* synthetic */ Object mo39921m(DocklessCarLeg docklessCarLeg) {
            return null;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            TransitStop transitStop = transitLineLeg.mo48460c().get();
            if (transitStop != null) {
                this.f48241b.add(transitStop);
            }
            TransitLine transitLine = transitLineLeg.f42110d.get();
            if (transitLine == null) {
                return null;
            }
            this.f48242c.add(transitLine);
            return null;
        }

        /* renamed from: p */
        public final /* bridge */ /* synthetic */ Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return null;
        }

        /* renamed from: q */
        public final /* bridge */ /* synthetic */ Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return null;
        }

        /* renamed from: r */
        public final /* bridge */ /* synthetic */ Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return null;
        }
    }

    public C18939a(Class<A> cls) {
        super(cls);
    }

    /* renamed from: B2 */
    public final String mo51461B2() {
        String str;
        Itinerary D2 = mo51462D2();
        if (D2 != null) {
            str = D2.f41894b;
        } else {
            str = null;
        }
        return C25541a.m63881k("itinerary#", str);
    }

    /* renamed from: D2 */
    public abstract Itinerary mo51462D2();

    /* renamed from: z2 */
    public final C18951l.C18952a mo51463z2() {
        Itinerary D2 = mo51462D2();
        if (D2 == null) {
            return C18951l.C18952a.m46066a();
        }
        C18940a aVar = new C18940a();
        for (Leg i0 : D2.mo48295u0()) {
            i0.mo48338i0(aVar);
        }
        StringBuilder k = C13555b.m33972k("itinerary#");
        k.append(D2.f41894b);
        return new C18951l.C18952a(k.toString(), aVar.f48241b, aVar.f48242c);
    }
}
