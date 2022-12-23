package p972zu;

import android.content.Context;
import ce0.C21100e;
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
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e20.C16769e;
import h40.C5051b;

/* renamed from: zu.j */
public final class C20903j implements Leg.C16144a<C5051b> {

    /* renamed from: b */
    public final Context f52652b;

    /* renamed from: c */
    public final Navigable f52653c;

    /* renamed from: d */
    public final NavigationProgressEvent f52654d;

    /* renamed from: e */
    public final C4231d<?> f52655e;

    /* renamed from: f */
    public final C16769e.C16772c f52656f;

    public C20903j(Context context, Navigable navigable, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f52652b = context;
        C21100e.m49373x(navigable, "navigable");
        this.f52653c = navigable;
        this.f52654d = navigationProgressEvent;
        this.f52655e = dVar;
        this.f52656f = cVar;
    }

    /* renamed from: a */
    public final Object mo39909a(CarLeg carLeg) {
        return new C20897d(this.f52652b, this.f52653c, carLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: b */
    public final Object mo39910b(WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg) {
        return new C20907n(this.f52652b, this.f52653c, waitToMultiTransitLinesLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: c */
    public final Object mo39911c(TaxiLeg taxiLeg) {
        return new C20905l(this.f52652b, this.f52653c, taxiLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: d */
    public final Object mo39912d(MultiTransitLinesLeg multiTransitLinesLeg) {
        return new C20902i(this.f52652b, this.f52653c, multiTransitLinesLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: e */
    public final Object mo39913e(WalkLeg walkLeg) {
        return new C20910q(this.f52652b, this.f52653c, walkLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: f */
    public final Object mo39914f(BicycleRentalLeg bicycleRentalLeg) {
        return new C20896c(this.f52652b, this.f52653c, bicycleRentalLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: g */
    public final Object mo39915g(WaitToTransitLineLeg waitToTransitLineLeg) {
        return new C20909p(this.f52652b, this.f52653c, waitToTransitLineLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: h */
    public final Object mo39916h(CarpoolLeg carpoolLeg) {
        throw new UnsupportedOperationException("Carpool leg does not support notification alerts");
    }

    /* renamed from: i */
    public final Object mo39917i(BicycleLeg bicycleLeg) {
        return new C20895b(this.f52652b, this.f52653c, bicycleLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: j */
    public final Object mo39918j(EventLeg eventLeg) {
        throw new UnsupportedOperationException("Event leg does not support notification alerts");
    }

    /* renamed from: k */
    public final Object mo39919k(DocklessBicycleLeg docklessBicycleLeg) {
        return new C20898e(this.f52652b, this.f52653c, docklessBicycleLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: l */
    public final Object mo39920l(WaitToTaxiLeg waitToTaxiLeg) {
        return new C20908o(this.f52652b, this.f52653c, waitToTaxiLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: m */
    public final Object mo39921m(DocklessCarLeg docklessCarLeg) {
        return new C20899f(this.f52652b, this.f52653c, docklessCarLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: n */
    public final Object mo39922n(TransitLineLeg transitLineLeg) {
        return new C20906m(this.f52652b, this.f52653c, transitLineLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: p */
    public final Object mo39924p(DocklessScooterLeg docklessScooterLeg) {
        return new C20901h(this.f52652b, this.f52653c, docklessScooterLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: q */
    public final Object mo39925q(PathwayWalkLeg pathwayWalkLeg) {
        return new C20904k(this.f52652b, this.f52653c, pathwayWalkLeg, this.f52654d, this.f52655e, this.f52656f);
    }

    /* renamed from: r */
    public final Object mo39926r(DocklessMopedLeg docklessMopedLeg) {
        return new C20900g(this.f52652b, this.f52653c, docklessMopedLeg, this.f52654d, this.f52655e, this.f52656f);
    }
}
