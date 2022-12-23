package p924xt;

import com.moovit.app.ads.AdSource;
import com.moovit.itinerary.TripPlanFlexTimeBanner;
import com.moovit.itinerary.TripPlanTodBanner;
import com.moovit.itinerary.model.Itinerary;

/* renamed from: xt.f */
public final class C20595f {

    /* renamed from: a */
    public final Itinerary f52087a;

    /* renamed from: b */
    public final C20618y f52088b;

    /* renamed from: c */
    public final C20596g f52089c;

    /* renamed from: d */
    public final TripPlanTodBanner f52090d;

    /* renamed from: e */
    public final TripPlanFlexTimeBanner f52091e;

    /* renamed from: f */
    public final AdSource f52092f;

    public C20595f(Itinerary itinerary, C20618y yVar, C20596g gVar, TripPlanTodBanner tripPlanTodBanner, TripPlanFlexTimeBanner tripPlanFlexTimeBanner, AdSource adSource) {
        this.f52087a = itinerary;
        this.f52088b = yVar;
        this.f52089c = gVar;
        this.f52090d = tripPlanTodBanner;
        this.f52091e = tripPlanFlexTimeBanner;
        this.f52092f = adSource;
    }

    public final String toString() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        StringBuilder k = C13555b.m33972k("AdapterItem{itinerary=");
        boolean z6 = true;
        if (this.f52087a != null) {
            z = true;
        } else {
            z = false;
        }
        k.append(z);
        k.append(", showMoreItem=");
        if (this.f52088b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        k.append(z2);
        k.append(", horizontalSection=");
        if (this.f52089c != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        k.append(z3);
        k.append(", todBanner=");
        if (this.f52090d != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        k.append(z4);
        k.append(", flexTimeBanner=");
        if (this.f52091e != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        k.append(z5);
        k.append(", adSource=");
        if (this.f52092f == null) {
            z6 = false;
        }
        return C25541a.m63885p(k, z6, "}");
    }
}
