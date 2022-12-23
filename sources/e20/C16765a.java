package e20;

import com.moovit.commons.utils.AppDeepLink;
import com.moovit.image.model.Image;
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
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.Time;
import java.util.List;

/* renamed from: e20.a */
public final class C16765a implements Leg.C16144a<Leg> {

    /* renamed from: b */
    public final Time f43641b;

    /* renamed from: c */
    public final Time f43642c;

    /* renamed from: d */
    public final Time f43643d;

    /* renamed from: e */
    public final Time f43644e;

    /* renamed from: f */
    public final WaitToTransitLineLeg.DeparturesInfo f43645f = null;

    public C16765a(Time time, Time time2, Time time3, Time time4) {
        this.f43641b = time;
        this.f43642c = time2;
        this.f43643d = time3;
        this.f43644e = time4;
    }

    /* renamed from: a */
    public final Object mo39909a(CarLeg carLeg) {
        return new CarLeg(mo49464s(carLeg), mo49463o(carLeg), carLeg.f41960d, carLeg.f41961e, carLeg.f41962f, carLeg.f41963g);
    }

    /* renamed from: b */
    public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
        throw new UnsupportedOperationException("WaitToMultiTransitLinesLeg isn't supported!");
    }

    /* renamed from: c */
    public final Object mo39911c(TaxiLeg taxiLeg) {
        return new TaxiLeg(taxiLeg.f42097b, mo49464s(taxiLeg), mo49463o(taxiLeg), taxiLeg.f42100e, taxiLeg.f42101f, taxiLeg.f42102g, taxiLeg.f42103h, taxiLeg.f42104i, taxiLeg.f42105j);
    }

    /* renamed from: d */
    public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
        throw new UnsupportedOperationException("MultiTransitLinesLeg isn't supported!");
    }

    /* renamed from: e */
    public final Object mo39913e(WalkLeg walkLeg) {
        return new WalkLeg(mo49464s(walkLeg), mo49463o(walkLeg), walkLeg.f42149d, walkLeg.f42150e, walkLeg.f42151f, walkLeg.f42152g);
    }

    /* renamed from: f */
    public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
        return new BicycleRentalLeg(mo49464s(bicycleRentalLeg), mo49463o(bicycleRentalLeg), bicycleRentalLeg.f41949d, bicycleRentalLeg.f41950e, bicycleRentalLeg.f41951f, bicycleRentalLeg.f41952g, bicycleRentalLeg.f41953h, bicycleRentalLeg.f41954i, bicycleRentalLeg.f41955j);
    }

    /* renamed from: g */
    public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
        WaitToTransitLineLeg.DeparturesInfo departuresInfo = this.f43645f;
        if (departuresInfo == null) {
            departuresInfo = waitToTransitLineLeg.f42138i;
        }
        WaitToTransitLineLeg.DeparturesInfo departuresInfo2 = departuresInfo;
        Time s = mo49464s(waitToTransitLineLeg);
        Time o = mo49463o(waitToTransitLineLeg);
        Time time = this.f43643d;
        if (time == null) {
            time = waitToTransitLineLeg.f42133d;
        }
        Time time2 = time;
        Time time3 = this.f43644e;
        if (time3 == null) {
            time3 = waitToTransitLineLeg.f42134e;
        }
        return new WaitToTransitLineLeg(s, o, time2, time3, waitToTransitLineLeg.f42135f, waitToTransitLineLeg.f42136g, waitToTransitLineLeg.f42137h, departuresInfo2, waitToTransitLineLeg.f42139j, waitToTransitLineLeg.f42140k);
    }

    /* renamed from: h */
    public final Object mo39916h(CarpoolLeg carpoolLeg) {
        AppDeepLink appDeepLink;
        CarpoolLeg carpoolLeg2 = carpoolLeg;
        Time s = mo49464s(carpoolLeg);
        Time o = mo49463o(carpoolLeg);
        boolean z = carpoolLeg2.f41968d;
        LocationDescriptor locationDescriptor = carpoolLeg2.f41969e;
        LocationDescriptor locationDescriptor2 = carpoolLeg2.f41970f;
        CarpoolLeg.CarpoolProvider carpoolProvider = carpoolLeg2.f41971g;
        CarpoolLeg.CarpoolType carpoolType = carpoolLeg2.f41972h;
        Image image = carpoolLeg2.f41973i;
        CurrencyAmount currencyAmount = carpoolLeg2.f41974j;
        CurrencyAmount currencyAmount2 = carpoolLeg2.f41975k;
        CarpoolLeg.CarpoolDriverInfo carpoolDriverInfo = carpoolLeg2.f41976l;
        List<CarpoolLeg.CarpoolAttribute> list = carpoolLeg2.f41977m;
        AppDeepLink appDeepLink2 = carpoolLeg2.f41978n;
        AppDeepLink appDeepLink3 = carpoolLeg2.f41979o;
        if (appDeepLink3 != null) {
            appDeepLink = appDeepLink3;
        } else {
            appDeepLink = appDeepLink2;
        }
        return new CarpoolLeg(s, o, z, locationDescriptor, locationDescriptor2, carpoolProvider, carpoolType, image, currencyAmount, currencyAmount2, carpoolDriverInfo, list, appDeepLink2, appDeepLink, carpoolLeg2.f41980p, carpoolLeg2.f41981q, carpoolLeg2.f41982r, carpoolLeg.mo48340w1());
    }

    /* renamed from: i */
    public final Object mo39917i(BicycleLeg bicycleLeg) {
        return new BicycleLeg(mo49464s(bicycleLeg), mo49463o(bicycleLeg), bicycleLeg.f41941d, bicycleLeg.f41942e, bicycleLeg.f41943f, bicycleLeg.f41944g);
    }

    /* renamed from: j */
    public final Object mo39918j(EventLeg eventLeg) {
        throw new UnsupportedOperationException("EventLeg isn't supported!");
    }

    /* renamed from: k */
    public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
        return new DocklessBicycleLeg(mo49464s(docklessBicycleLeg), mo49463o(docklessBicycleLeg), docklessBicycleLeg.f41998d, docklessBicycleLeg.f41999e, docklessBicycleLeg.f42000f, docklessBicycleLeg.f42001g, docklessBicycleLeg.f42002h, docklessBicycleLeg.f42003i, docklessBicycleLeg.f42004j);
    }

    /* renamed from: l */
    public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
        return new WaitToTaxiLeg(waitToTaxiLeg.f42122b, mo49464s(waitToTaxiLeg), mo49463o(waitToTaxiLeg), waitToTaxiLeg.f42125e, waitToTaxiLeg.f42126f, waitToTaxiLeg.f42127g, waitToTaxiLeg.f42128h);
    }

    /* renamed from: m */
    public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
        return new DocklessCarLeg(mo49464s(docklessCarLeg), mo49463o(docklessCarLeg), docklessCarLeg.f42020d, docklessCarLeg.f42021e, docklessCarLeg.f42022f, docklessCarLeg.f42023g, docklessCarLeg.f42024h, docklessCarLeg.f42025i, docklessCarLeg.f42026j);
    }

    /* renamed from: n */
    public final Object mo39922n(TransitLineLeg transitLineLeg) {
        return new TransitLineLeg(mo49464s(transitLineLeg), mo49463o(transitLineLeg), transitLineLeg.f42110d, transitLineLeg.f42111e, transitLineLeg.f42112f, transitLineLeg.f42113g, transitLineLeg.f42114h);
    }

    /* renamed from: o */
    public final Time mo49463o(Leg leg) {
        Time time = this.f43642c;
        return time != null ? time : leg.mo48331K1();
    }

    /* renamed from: p */
    public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
        return new DocklessScooterLeg(mo49464s(docklessScooterLeg), mo49463o(docklessScooterLeg), docklessScooterLeg.f42064d, docklessScooterLeg.f42065e, docklessScooterLeg.f42066f, docklessScooterLeg.f42067g, docklessScooterLeg.f42068h, docklessScooterLeg.f42069i, docklessScooterLeg.f42070j);
    }

    /* renamed from: q */
    public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
        return new PathwayWalkLeg(mo49464s(pathwayWalkLeg), mo49463o(pathwayWalkLeg), pathwayWalkLeg.f42092d, pathwayWalkLeg.f42093e, pathwayWalkLeg.f42094f);
    }

    /* renamed from: r */
    public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
        return new DocklessMopedLeg(mo49464s(docklessMopedLeg), mo49463o(docklessMopedLeg), docklessMopedLeg.f42042d, docklessMopedLeg.f42043e, docklessMopedLeg.f42044f, docklessMopedLeg.f42045g, docklessMopedLeg.f42046h, docklessMopedLeg.f42047i, docklessMopedLeg.f42048j);
    }

    /* renamed from: s */
    public final Time mo49464s(Leg leg) {
        Time time = this.f43641b;
        return time != null ? time : leg.mo48339o1();
    }
}
