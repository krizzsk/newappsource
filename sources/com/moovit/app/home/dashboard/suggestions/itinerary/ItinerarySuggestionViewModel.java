package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1040t;
import bf0.C21049c;
import kotlin.C23812a;
import mf0.C24362h;

public final class ItinerarySuggestionViewModel extends C0989a {

    /* renamed from: c */
    public final C21049c f38325c = C23812a.m58432b(ItinerarySuggestionViewModel$locationMutableLiveData$2.f38328f);

    /* renamed from: d */
    public final C21049c f38326d;

    /* renamed from: e */
    public final C1040t f38327e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItinerarySuggestionViewModel(Application application) {
        super(application);
        C24362h.m61211f(application, "application");
        C21049c b = C23812a.m58432b(new ItinerarySuggestionViewModel$itineraryMutableLiveData$2(this));
        this.f38326d = b;
        this.f38327e = (C1040t) b.getValue();
    }
}
