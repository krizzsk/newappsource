package com.moovit.itinerary.model.leg;

import android.os.Parcelable;
import com.moovit.commons.geo.Polyline;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;

public interface Leg extends Parcelable {

    /* renamed from: com.moovit.itinerary.model.leg.Leg$a */
    public interface C16144a<T> {
        /* renamed from: a */
        T mo39909a(CarLeg carLeg);

        /* renamed from: b */
        T mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg);

        /* renamed from: c */
        T mo39911c(TaxiLeg taxiLeg);

        /* renamed from: d */
        T mo39912d(MultiTransitLinesLeg multiTransitLinesLeg);

        /* renamed from: e */
        T mo39913e(WalkLeg walkLeg);

        /* renamed from: f */
        T mo39914f(BicycleRentalLeg bicycleRentalLeg);

        /* renamed from: g */
        T mo39915g(WaitToTransitLineLeg waitToTransitLineLeg);

        /* renamed from: h */
        T mo39916h(CarpoolLeg carpoolLeg);

        /* renamed from: i */
        T mo39917i(BicycleLeg bicycleLeg);

        /* renamed from: j */
        T mo39918j(EventLeg eventLeg);

        /* renamed from: k */
        T mo39919k(DocklessBicycleLeg docklessBicycleLeg);

        /* renamed from: l */
        T mo39920l(WaitToTaxiLeg waitToTaxiLeg);

        /* renamed from: m */
        T mo39921m(DocklessCarLeg docklessCarLeg);

        /* renamed from: n */
        T mo39922n(TransitLineLeg transitLineLeg);

        /* renamed from: p */
        T mo39924p(DocklessScooterLeg docklessScooterLeg);

        /* renamed from: q */
        T mo39925q(PathwayWalkLeg pathwayWalkLeg);

        /* renamed from: r */
        T mo39926r(DocklessMopedLeg docklessMopedLeg);
    }

    /* renamed from: K1 */
    Time mo48331K1();

    /* renamed from: W */
    LocationDescriptor mo48332W();

    /* renamed from: e2 */
    LocationDescriptor mo48334e2();

    int getType();

    /* renamed from: i0 */
    <T> T mo48338i0(C16144a<T> aVar);

    /* renamed from: o1 */
    Time mo48339o1();

    /* renamed from: w1 */
    Polyline mo48340w1();
}
