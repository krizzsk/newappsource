package com.moovit.app.ads;

import android.os.SystemClock;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import java.util.EnumSet;
import p269u2.C6677a;
import p543hq.C17474b;

/* renamed from: com.moovit.app.ads.s */
public final /* synthetic */ class C14758s implements OnInitializationCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ MobileAdsManager f37567a;

    /* renamed from: b */
    public final /* synthetic */ Trace f37568b;

    /* renamed from: c */
    public final /* synthetic */ long f37569c;

    public /* synthetic */ C14758s(MobileAdsManager mobileAdsManager, Trace trace, long j) {
        this.f37567a = mobileAdsManager;
        this.f37568b = trace;
        this.f37569c = j;
    }

    public final void onInitializationComplete(InitializationStatus initializationStatus) {
        MobileAdsManager mobileAdsManager = this.f37567a;
        Trace trace = this.f37568b;
        long j = this.f37569c;
        EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
        mobileAdsManager.getClass();
        trace.stop();
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        C6677a aVar = mobileAdsManager.f37461c.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = mobileAdsManager.f37461c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.APP;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mobile_ads_initialization_end");
        aVar2.mo49936d(AnalyticsAttributeKey.TIME, elapsedRealtime);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, true, bVarArr);
        mobileAdsManager.f37464f.open();
    }
}
