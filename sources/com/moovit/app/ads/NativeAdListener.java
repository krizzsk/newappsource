package com.moovit.app.ads;

import android.os.SystemClock;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import ce0.C21100e;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import java.util.concurrent.TimeUnit;
import p172m9.C5720b;
import p269u2.C6677a;
import p543hq.C17474b;
import p921xq.C20558d;
import p977zz.C20944i0;

public final class NativeAdListener extends AdListener {

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f37490b;

    /* renamed from: c */
    public final MoovitActivity f37491c;

    /* renamed from: d */
    public final C20558d f37492d;

    /* renamed from: e */
    public long f37493e;

    public static class AdViewLifeCycleHelper implements C1025n {

        /* renamed from: b */
        public final NativeAd f37494b;

        public AdViewLifeCycleHelper(NativeAd nativeAd) {
            this.f37494b = nativeAd;
        }

        /* renamed from: f */
        public final void mo740f(C1033p pVar, Lifecycle.Event event) {
            if (C14732a.f37495a[event.ordinal()] == 1) {
                NativeAd nativeAd = this.f37494b;
                if (nativeAd != null) {
                    nativeAd.destroy();
                }
                pVar.getLifecycle().mo4226c(this);
            }
        }
    }

    /* renamed from: com.moovit.app.ads.NativeAdListener$a */
    public static /* synthetic */ class C14732a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37495a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f37495a = iArr;
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public NativeAdListener(MoovitActivity moovitActivity, MoovitApplication moovitApplication, C20558d dVar) {
        C21100e.m49373x(moovitApplication, "application");
        this.f37490b = moovitApplication;
        C21100e.m49373x(moovitActivity, "activity");
        this.f37491c = moovitActivity;
        C21100e.m49373x(dVar, "nativeAdRef");
        this.f37492d = dVar;
    }

    public final void onAdClicked() {
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C20558d dVar = this.f37492d;
        boolean z = dVar.f51989a;
        String str = dVar.f51993e;
        String str2 = dVar.f51992d;
        String str3 = dVar.f51991c;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f37493e;
        TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime);
        C6677a aVar = this.f37490b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37490b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_clicked");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, z);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, str2);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, str);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, str3);
        aVar2.mo49936d(AnalyticsAttributeKey.TIME, elapsedRealtime);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f37492d.mo52756b());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37491c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public final void onAdClosed() {
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C20558d dVar = this.f37492d;
        boolean z = dVar.f51989a;
        String str = dVar.f51993e;
        String str2 = dVar.f51992d;
        String str3 = dVar.f51991c;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f37493e;
        TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime);
        C6677a aVar = this.f37490b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37490b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_dismissed");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, z);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, str2);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, str);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, str3);
        aVar2.mo49936d(AnalyticsAttributeKey.TIME, elapsedRealtime);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f37492d.mo52756b());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37491c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        boolean z = this.f37492d.f51989a;
        C20558d dVar = this.f37492d;
        String str = dVar.f51993e;
        String str2 = dVar.f51992d;
        String str3 = dVar.f51991c;
    }

    public final void onAdImpression() {
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C20558d dVar = this.f37492d;
        boolean z = dVar.f51989a;
        String str = dVar.f51993e;
        String str2 = dVar.f51992d;
        String str3 = dVar.f51991c;
        this.f37493e = SystemClock.elapsedRealtime();
        MobileAdsManager h2 = MobileAdsManager.m37073h();
        C20558d dVar2 = this.f37492d;
        if (dVar2 != null && dVar2.equals(h2.f37467i.get(dVar2.f51992d))) {
            h2.f37467i.remove(dVar2.f51992d);
        }
        this.f37491c.getLifecycle().mo4224a(new AdViewLifeCycleHelper(((C14766z) this.f37492d.f51994f).f37583a));
        C6677a aVar = this.f37490b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37490b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_impression");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, z);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, str2);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, str);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, str3);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f37492d.mo52756b());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37491c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public final void onAdLoaded() {
        boolean z = this.f37492d.f51989a;
        C20558d dVar = this.f37492d;
        String str = dVar.f51993e;
        String str2 = dVar.f51992d;
        String str3 = dVar.f51991c;
    }

    public final void onAdOpened() {
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C20558d dVar = this.f37492d;
        boolean z = dVar.f51989a;
        String str = dVar.f51993e;
        String str2 = dVar.f51992d;
        String str3 = dVar.f51991c;
        C6677a aVar = this.f37490b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37490b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_opened");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, z);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, str2);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, str);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, str3);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f37492d.mo52756b());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37491c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }
}
