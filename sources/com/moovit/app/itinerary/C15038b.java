package com.moovit.app.itinerary;

import c70.C13752e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest;
import e20.C16795t;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: com.moovit.app.itinerary.b */
public final /* synthetic */ class C15038b implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ ItineraryActivity f38532b;

    /* renamed from: c */
    public final /* synthetic */ C13752e f38533c;

    /* renamed from: d */
    public final /* synthetic */ C19728f f38534d;

    /* renamed from: e */
    public final /* synthetic */ C19047a f38535e;

    /* renamed from: f */
    public final /* synthetic */ Itinerary f38536f;

    /* renamed from: g */
    public final /* synthetic */ int f38537g;

    /* renamed from: h */
    public final /* synthetic */ int f38538h;

    public /* synthetic */ C15038b(ItineraryActivity itineraryActivity, C13752e eVar, C19728f fVar, C19047a aVar, Itinerary itinerary, int i, int i2) {
        this.f38532b = itineraryActivity;
        this.f38533c = eVar;
        this.f38534d = fVar;
        this.f38535e = aVar;
        this.f38536f = itinerary;
        this.f38537g = i;
        this.f38538h = i2;
    }

    public final void onSuccess(Object obj) {
        ItineraryActivity itineraryActivity = this.f38532b;
        C13752e eVar = this.f38533c;
        C19728f fVar = this.f38534d;
        C19047a aVar = this.f38535e;
        Itinerary itinerary = this.f38536f;
        int i = ItineraryActivity.f38474B0;
        itineraryActivity.getClass();
        C16795t tVar = new C16795t(this.f38537g, this.f38538h, fVar, aVar, itinerary, eVar, (MVTripPlanRequest) obj);
        itineraryActivity.mo44528l2(tVar.f43731A, tVar, itineraryActivity.f38493y0);
    }
}
