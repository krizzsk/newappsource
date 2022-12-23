package e20;

import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DbEntityRef;
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
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import g30.C4776h;
import i30.C5268d;
import i30.C5269e;
import i30.C5274h;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p824tp.C19728f;

/* renamed from: e20.h */
public final class C16776h {

    /* renamed from: e20.h$a */
    public static class C16777a implements Leg.C16144a<Void> {

        /* renamed from: b */
        public final C5269e f43677b;

        public C16777a(C5269e eVar) {
            this.f43677b = eVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo39909a(CarLeg carLeg) {
            return null;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            for (WaitToTransitLineLeg next : waitToMultiTransitLinesLeg.f42117b) {
                next.getClass();
                mo39915g(next);
            }
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
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            DbEntityRef<BicycleStop> c = bicycleRentalLeg.mo48345c();
            if (c != null) {
                this.f43677b.mo21066a(MetroEntityType.BICYCLE_STOP, c.getServerId());
            }
            List<DbEntityRef<BicycleStop>> list = bicycleRentalLeg.f41950e;
            if (!list.isEmpty()) {
                C5269e eVar = this.f43677b;
                eVar.f17412b.mo47002b(MetroEntityType.BICYCLE_STOP, ServerId.m11393d(list));
            }
            DbEntityRef<BicycleStop> b = bicycleRentalLeg.mo48344b();
            if (b != null) {
                this.f43677b.mo21066a(MetroEntityType.BICYCLE_STOP, b.getServerId());
            }
            List<DbEntityRef<BicycleStop>> list2 = bicycleRentalLeg.f41952g;
            if (list2.isEmpty()) {
                return null;
            }
            C5269e eVar2 = this.f43677b;
            eVar2.f17412b.mo47002b(MetroEntityType.BICYCLE_STOP, ServerId.m11393d(list2));
            return null;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            this.f43677b.mo21066a(MetroEntityType.TRANSIT_LINE, waitToTransitLineLeg.f42135f.getServerId());
            C5269e eVar = this.f43677b;
            MetroEntityType metroEntityType = MetroEntityType.TRANSIT_STOP;
            eVar.mo21066a(metroEntityType, waitToTransitLineLeg.f42136g.getServerId());
            this.f43677b.mo21066a(metroEntityType, waitToTransitLineLeg.f42137h.getServerId());
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
            this.f43677b.mo21066a(MetroEntityType.TRANSIT_LINE, transitLineLeg.f42110d.getServerId());
            C5269e eVar = this.f43677b;
            eVar.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, ServerId.m11393d(transitLineLeg.f42111e));
            return null;
        }

        /* renamed from: p */
        public final /* bridge */ /* synthetic */ Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return null;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            this.f43677b.mo21066a(MetroEntityType.TRANSIT_STOP, pathwayWalkLeg.f42092d.getServerId());
            return null;
        }

        /* renamed from: r */
        public final /* bridge */ /* synthetic */ Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return null;
        }
    }

    /* renamed from: e20.h$b */
    public static class C16778b implements Leg.C16144a<Boolean>, C13722f<Itinerary> {

        /* renamed from: b */
        public final C5268d f43678b;

        public C16778b(C5268d dVar) {
            this.f43678b = dVar;
        }

        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: b */
        public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            boolean z = true;
            for (WaitToTransitLineLeg next : waitToMultiTransitLinesLeg.f42117b) {
                next.getClass();
                z &= ((Boolean) mo39915g(next)).booleanValue();
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: d */
        public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            boolean z = true;
            for (TransitLineLeg next : multiTransitLinesLeg.f42086b) {
                next.getClass();
                z &= ((Boolean) mo39922n(next)).booleanValue();
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            DbEntityRef<BicycleStop> c = bicycleRentalLeg.mo48345c();
            if (c != null && !mo49469s(c)) {
                return Boolean.FALSE;
            }
            for (DbEntityRef<BicycleStop> s : bicycleRentalLeg.f41950e) {
                if (!mo49469s(s)) {
                    return Boolean.FALSE;
                }
            }
            DbEntityRef<BicycleStop> b = bicycleRentalLeg.mo48344b();
            if (b != null && !mo49469s(b)) {
                return Boolean.FALSE;
            }
            for (DbEntityRef<BicycleStop> s2 : bicycleRentalLeg.f41952g) {
                if (!mo49469s(s2)) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }

        /* renamed from: g */
        public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            boolean z;
            DbEntityRef<TransitLine> dbEntityRef = waitToTransitLineLeg.f42135f;
            boolean z2 = true;
            if (dbEntityRef.isResolved()) {
                z = true;
            } else {
                TransitLine b = this.f43678b.mo21063b(dbEntityRef.getServerId());
                if (b != null) {
                    dbEntityRef.resolveTo(b);
                }
                z = dbEntityRef.isResolved();
            }
            if (!z || !mo49470t(waitToTransitLineLeg.f42136g) || !mo49470t(waitToTransitLineLeg.f42137h)) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: j */
        public final Object mo39918j(EventLeg eventLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: n */
        public final Object mo39922n(TransitLineLeg transitLineLeg) {
            boolean z;
            DbEntityRef<TransitLine> dbEntityRef = transitLineLeg.f42110d;
            if (dbEntityRef.isResolved()) {
                z = true;
            } else {
                TransitLine b = this.f43678b.mo21063b(dbEntityRef.getServerId());
                if (b != null) {
                    dbEntityRef.resolveTo(b);
                }
                z = dbEntityRef.isResolved();
            }
            if (!z) {
                return Boolean.FALSE;
            }
            for (DbEntityRef<TransitStop> t : transitLineLeg.f42111e) {
                if (!mo49470t(t)) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }

        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            for (Leg i0 : ((Itinerary) obj).mo48295u0()) {
                if (!((Boolean) i0.mo48338i0(this)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: q */
        public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return Boolean.valueOf(mo49470t(pathwayWalkLeg.f42092d));
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            return Boolean.TRUE;
        }

        /* renamed from: s */
        public final boolean mo49469s(DbEntityRef<BicycleStop> dbEntityRef) {
            if (dbEntityRef.isResolved()) {
                return true;
            }
            C5268d dVar = this.f43678b;
            BicycleStop bicycleStop = (BicycleStop) dVar.f17408e.get(dbEntityRef.getServerId());
            if (bicycleStop != null) {
                dbEntityRef.resolveTo(bicycleStop);
            }
            return dbEntityRef.isResolved();
        }

        /* renamed from: t */
        public final boolean mo49470t(DbEntityRef<TransitStop> dbEntityRef) {
            if (dbEntityRef.isResolved()) {
                return true;
            }
            TransitStop c = this.f43678b.mo21064c(dbEntityRef.getServerId());
            if (c != null) {
                dbEntityRef.resolveTo(c);
            }
            return dbEntityRef.isResolved();
        }
    }

    /* renamed from: a */
    public static Itinerary m42406a(C13752e eVar, C19728f fVar, Itinerary itinerary) throws IOException, ServerException {
        List b = m42407b(eVar, fVar, Collections.singletonList(itinerary));
        if (b.isEmpty()) {
            return null;
        }
        return (Itinerary) b.get(0);
    }

    /* renamed from: b */
    public static List m42407b(C13752e eVar, C19728f fVar, List list) throws IOException, ServerException {
        C5269e eVar2 = new C5269e();
        C16777a aVar = new C16777a(eVar2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Leg i0 : ((Itinerary) it.next()).mo48295u0()) {
                i0.mo48338i0(aVar);
            }
        }
        if (eVar2.isEmpty()) {
            return list;
        }
        C4776h hVar = fVar.f50165a;
        C21100e.m49373x(eVar, "requestContext");
        C21100e.m49373x(hVar, "metroInfo");
        return C13723g.m34282c(list, new C16778b(new C5274h(eVar, "ItineraryResolver", hVar, eVar2).mo21062P()));
    }
}
