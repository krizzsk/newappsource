package com.moovit.app.home.dashboard.suggestions.station;

import android.app.Application;
import ff0.C23349c;
import p474et.C16876h;
import p546ht.C17490c;
import wh0.C25177g;
import wh0.C25184i0;

/* renamed from: com.moovit.app.home.dashboard.suggestions.station.b */
public final class C14983b extends C17490c {
    /* renamed from: b */
    public final Object mo45182b(Application application, C16876h hVar, C23349c cVar) {
        return C25177g.m63221e(C25184i0.f63460b, new NearbyStopSuggestionCardProvider$loadCards$2(application, this, hVar, (C23349c<? super NearbyStopSuggestionCardProvider$loadCards$2>) null), cVar);
    }

    /* renamed from: d */
    public final String mo45187d() {
        return "suggestion_nearby_station";
    }
}
