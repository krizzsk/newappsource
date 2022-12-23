package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import ce0.C21100e;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C2931r;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.play.core.appupdate.C14226d;
import p699oh.C18752e;

/* renamed from: com.fyber.inneractive.sdk.measurement.b */
public class C2818b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f9678a;

    /* renamed from: b */
    public final /* synthetic */ C2820d f9679b;

    public C2818b(C2820d dVar, Context context) {
        this.f9679b = dVar;
        this.f9678a = context;
    }

    public void run() {
        try {
            C21100e.m49342h(this.f9678a);
            C2820d dVar = this.f9679b;
            String version = InneractiveAdManager.getVersion();
            C14226d.m35348n0("Fyber", "Name is null or empty");
            C14226d.m35348n0(version, "Version is null or empty");
            dVar.f9682c = new C18752e(version);
            C2820d.m7017a(this.f9679b, this.f9678a);
            IAlog.m9902a("OMID SDK was activated - version %s", "1.3.30-Fyber");
        } catch (Throwable th) {
            IAlog.m9902a("Failed starting omsdk with exception %s", th.getLocalizedMessage());
            this.f9679b.getClass();
            C2931r.m7253a(th.getClass().getSimpleName(), String.format("%s - %s", new Object[]{"OpenMeasurementMeasurer", th.getMessage()}), (InneractiveAdRequest) null, (C3648e) null);
        }
    }
}
