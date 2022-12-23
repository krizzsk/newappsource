package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.app.Application;
import ff0.C23349c;
import p474et.C16876h;
import wh0.C25177g;
import wh0.C25184i0;

/* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.f */
public final class C14977f extends C14973b {

    /* renamed from: a */
    public final boolean f38334a;

    /* renamed from: b */
    public float f38335b;

    public C14977f(boolean z) {
        this.f38334a = z;
    }

    /* renamed from: b */
    public final Object mo45182b(Application application, C16876h hVar, C23349c cVar) {
        return C25177g.m63221e(C25184i0.f63460b, new RecentSearchSuggestionCardsProvider$loadCards$2(application, this, hVar, (C23349c<? super RecentSearchSuggestionCardsProvider$loadCards$2>) null), cVar);
    }

    /* renamed from: d */
    public final String mo45165d() {
        return this.f38334a ? "suggestion_recent_trip_matched" : "suggestion_recent_trip";
    }
}
