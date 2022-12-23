package e20;

import android.content.Context;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
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
import com.moovit.transit.LocationDescriptor;
import com.usebutton.sdk.internal.api.AppActionRequest;
import j20.C17706c;
import j20.C17707d;
import j20.C17708e;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p172m9.C5720b;
import p241s0.C6302b;
import p824tp.C19728f;
import p977zz.C20964s0;
import p988j$.util.DesugarCollections;

/* renamed from: e20.i */
public final class C16779i {

    /* renamed from: e */
    public static final ThreadPoolExecutor f43679e = C5720b.m14033A(3, "IRGH");

    /* renamed from: a */
    public final C16780a f43680a = new C16780a();

    /* renamed from: b */
    public final Context f43681b;

    /* renamed from: c */
    public final C19728f f43682c;

    /* renamed from: d */
    public final Map<LatLonE6, LocationDescriptor> f43683d;

    /* renamed from: e20.i$a */
    public class C16780a implements Leg.C16144a<Void> {
        public C16780a() {
        }

        /* renamed from: a */
        public final Object mo39909a(CarLeg carLeg) {
            C16779i.this.mo49472b(carLeg.f41960d);
            C16779i.this.mo49472b(carLeg.f41961e);
            return null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
            return null;
        }

        /* renamed from: c */
        public final Object mo39911c(TaxiLeg taxiLeg) {
            C16779i.this.mo49472b(taxiLeg.f42100e);
            C16779i.this.mo49472b(taxiLeg.f42101f);
            return null;
        }

        /* renamed from: d */
        public final /* bridge */ /* synthetic */ Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
            return null;
        }

        /* renamed from: e */
        public final Object mo39913e(WalkLeg walkLeg) {
            C16779i.this.mo49472b(walkLeg.f42149d);
            C16779i.this.mo49472b(walkLeg.f42150e);
            return null;
        }

        /* renamed from: f */
        public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
            C16779i.this.mo49472b(bicycleRentalLeg.mo48332W());
            C16779i.this.mo49472b(bicycleRentalLeg.mo48334e2());
            return null;
        }

        /* renamed from: g */
        public final /* bridge */ /* synthetic */ Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
            return null;
        }

        /* renamed from: h */
        public final Object mo39916h(CarpoolLeg carpoolLeg) {
            C16779i.this.mo49472b(carpoolLeg.f41969e);
            C16779i.this.mo49472b(carpoolLeg.f41970f);
            return null;
        }

        /* renamed from: i */
        public final Object mo39917i(BicycleLeg bicycleLeg) {
            C16779i.this.mo49472b(bicycleLeg.f41941d);
            C16779i.this.mo49472b(bicycleLeg.f41942e);
            return null;
        }

        /* renamed from: j */
        public final /* bridge */ /* synthetic */ Object mo39918j(EventLeg eventLeg) {
            return null;
        }

        /* renamed from: k */
        public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
            C16779i.this.mo49472b(docklessBicycleLeg.f41998d);
            C16779i.this.mo49472b(docklessBicycleLeg.f41999e);
            return null;
        }

        /* renamed from: l */
        public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
            C16779i.this.mo49472b(waitToTaxiLeg.f42125e);
            return null;
        }

        /* renamed from: m */
        public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
            C16779i.this.mo49472b(docklessCarLeg.f42020d);
            C16779i.this.mo49472b(docklessCarLeg.f42021e);
            return null;
        }

        /* renamed from: n */
        public final /* bridge */ /* synthetic */ Object mo39922n(TransitLineLeg transitLineLeg) {
            return null;
        }

        /* renamed from: p */
        public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
            C16779i.this.mo49472b(docklessScooterLeg.f42064d);
            C16779i.this.mo49472b(docklessScooterLeg.f42065e);
            return null;
        }

        /* renamed from: q */
        public final /* bridge */ /* synthetic */ Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
            return null;
        }

        /* renamed from: r */
        public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
            C16779i.this.mo49472b(docklessMopedLeg.f42042d);
            C16779i.this.mo49472b(docklessMopedLeg.f42043e);
            return null;
        }
    }

    public C16779i(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        Context applicationContext = context.getApplicationContext();
        this.f43681b = applicationContext;
        this.f43682c = C19728f.m47195a(applicationContext);
        this.f43683d = DesugarCollections.synchronizedMap(new C6302b());
    }

    /* renamed from: a */
    public final void mo49471a(Itinerary itinerary) {
        for (Leg i0 : itinerary.mo48295u0()) {
            i0.mo48338i0(this.f43680a);
        }
    }

    /* renamed from: b */
    public final void mo49472b(LocationDescriptor locationDescriptor) {
        LocationDescriptor locationDescriptor2;
        String f = locationDescriptor.mo24313f();
        LatLonE6 d = locationDescriptor.mo24310d();
        if (C20964s0.m49090h(f) && d != null) {
            if (!this.f43683d.containsKey(d)) {
                locationDescriptor2 = null;
                try {
                    ThreadPoolExecutor threadPoolExecutor = f43679e;
                    C17707d dVar = (C17707d) Tasks.await(Tasks.call(threadPoolExecutor, new C17708e(this.f43681b, this.f43682c, locationDescriptor, true)).continueWith(threadPoolExecutor, new C17706c()), 3, TimeUnit.SECONDS);
                    if (dVar.f45452c == 2) {
                        locationDescriptor2 = dVar.f45454e;
                    }
                } catch (Exception unused) {
                }
                this.f43683d.put(d, locationDescriptor2);
            } else {
                locationDescriptor2 = this.f43683d.get(d);
            }
            if (locationDescriptor2 != null) {
                locationDescriptor.f23651f = locationDescriptor2.f23651f;
                locationDescriptor.f23652g = locationDescriptor2.f23652g;
            }
        }
    }
}
