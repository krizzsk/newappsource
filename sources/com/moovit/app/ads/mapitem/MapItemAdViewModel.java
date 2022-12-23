package com.moovit.app.ads.mapitem;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1040t;
import bf0.C21049c;
import kotlin.C23812a;
import mf0.C24362h;

public final class MapItemAdViewModel extends C0989a {

    /* renamed from: c */
    public final C21049c f37554c = C23812a.m58432b(MapItemAdViewModel$adConfigMutableLiveData$2.f37557f);

    /* renamed from: d */
    public final C21049c f37555d;

    /* renamed from: e */
    public final C1040t f37556e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdViewModel(Application application) {
        super(application);
        C24362h.m61211f(application, "application");
        C21049c b = C23812a.m58432b(new MapItemAdViewModel$adViewMutableLiveData$2(this));
        this.f37555d = b;
        this.f37556e = (C1040t) b.getValue();
    }
}
