package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.app.Application;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ff0.C23349c;
import p474et.C16873e;
import p474et.C16874f;
import p474et.C16876h;
import wh0.C25177g;
import wh0.C25184i0;

/* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.e */
public final class C14976e implements C16873e {
    /* renamed from: a */
    public final C16874f mo45183a() {
        return new C16874f("suggestion_latest_route", false, (float) BitmapDescriptorFactory.HUE_RED, 14);
    }

    /* renamed from: b */
    public final Object mo45182b(Application application, C16876h hVar, C23349c cVar) {
        return C25177g.m63221e(C25184i0.f63460b, new LatestItinerarySuggestionCardProvider$loadCards$2(application, this, (C23349c<? super LatestItinerarySuggestionCardProvider$loadCards$2>) null), cVar);
    }
}
