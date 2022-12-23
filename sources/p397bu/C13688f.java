package p397bu;

import android.content.Context;
import ce0.C21100e;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.itinerary.view.leg.C15076a;
import com.moovit.app.itinerary.view.leg.C15077b;
import com.moovit.app.itinerary.view.leg.C15078c;
import com.moovit.app.itinerary.view.leg.C15079d;
import com.moovit.app.itinerary.view.leg.C15080e;
import com.moovit.app.itinerary.view.leg.C15081f;
import com.moovit.app.itinerary.view.leg.C15082g;
import com.moovit.app.itinerary.view.leg.C15083h;
import com.moovit.app.itinerary.view.leg.C15085j;
import com.moovit.app.itinerary.view.leg.C15086k;
import com.moovit.app.itinerary.view.leg.C15087l;
import com.moovit.app.itinerary.view.leg.C15089m;
import com.moovit.app.itinerary.view.leg.C15090n;
import com.moovit.app.itinerary.view.leg.C15092o;
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
import com.usebutton.sdk.internal.api.AppActionRequest;

/* renamed from: bu.f */
public final class C13688f implements Leg.C16144a<AbstractLegView<?>> {

    /* renamed from: b */
    public final Context f33740b;

    public C13688f(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f33740b = context;
    }

    /* renamed from: a */
    public final Object mo39909a(CarLeg carLeg) {
        return new C15078c(this.f33740b);
    }

    /* renamed from: b */
    public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
        return new C15087l(this.f33740b);
    }

    /* renamed from: c */
    public final Object mo39911c(TaxiLeg taxiLeg) {
        return new C15085j(this.f33740b);
    }

    /* renamed from: d */
    public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
        return new C15083h(this.f33740b);
    }

    /* renamed from: e */
    public final Object mo39913e(WalkLeg walkLeg) {
        return new C15092o(this.f33740b);
    }

    /* renamed from: f */
    public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
        return new C15077b(this.f33740b);
    }

    /* renamed from: g */
    public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
        return new C15090n(this.f33740b);
    }

    /* renamed from: h */
    public final Object mo39916h(CarpoolLeg carpoolLeg) {
        throw new UnsupportedOperationException("Carpool leg view isn't supported!");
    }

    /* renamed from: i */
    public final Object mo39917i(BicycleLeg bicycleLeg) {
        return new C15076a(this.f33740b);
    }

    /* renamed from: j */
    public final Object mo39918j(EventLeg eventLeg) {
        throw new UnsupportedOperationException("Event leg view isn't supported!");
    }

    /* renamed from: k */
    public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
        return new C15079d(this.f33740b);
    }

    /* renamed from: l */
    public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
        return new C15089m(this.f33740b);
    }

    /* renamed from: m */
    public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
        return new C15080e(this.f33740b);
    }

    /* renamed from: n */
    public final Object mo39922n(TransitLineLeg transitLineLeg) {
        return new C15086k(this.f33740b);
    }

    /* renamed from: p */
    public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
        return new C15082g(this.f33740b);
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
        return null;
    }

    /* renamed from: r */
    public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
        return new C15081f(this.f33740b);
    }
}
