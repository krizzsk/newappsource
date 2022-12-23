package com.moovit.app.home.dashboard.suggestions.station;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1040t;
import bf0.C21049c;
import kotlin.C23812a;
import mf0.C24362h;

public final class StopSuggestionViewModel extends C0989a {

    /* renamed from: c */
    public final C21049c f38347c = C23812a.m58432b(StopSuggestionViewModel$stopMutableLiveData$2.f38350f);

    /* renamed from: d */
    public final C21049c f38348d;

    /* renamed from: e */
    public final C1040t f38349e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopSuggestionViewModel(Application application) {
        super(application);
        C24362h.m61211f(application, "application");
        C21049c b = C23812a.m58432b(new StopSuggestionViewModel$arrivalsMutableLiveData$2(this));
        this.f38348d = b;
        this.f38349e = (C1040t) b.getValue();
    }
}
