package com.moovit.app.ads;

import android.os.SystemClock;
import ce0.C21100e;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import p172m9.C5720b;
import p269u2.C6677a;
import p435de.C16596f;
import p543hq.C17474b;
import p921xq.C20554a;
import p977zz.C20944i0;

/* renamed from: com.moovit.app.ads.d */
public final class C14736d extends FullScreenContentCallback {

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f37506b;

    /* renamed from: c */
    public final MoovitActivity f37507c;

    /* renamed from: d */
    public final C20554a<?> f37508d;

    /* renamed from: e */
    public long f37509e;

    public C14736d(MoovitApplication<?, ?, ?> moovitApplication, MoovitActivity moovitActivity, C20554a<?> aVar) {
        C21100e.m49373x(moovitApplication, "application");
        this.f37506b = moovitApplication;
        C21100e.m49373x(moovitActivity, "activity");
        this.f37507c = moovitActivity;
        C21100e.m49373x(aVar, "adRef");
        this.f37508d = aVar;
    }

    public final void onAdClicked() {
        super.onAdClicked();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f37509e;
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C6677a aVar = this.f37506b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37506b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37508d.f51989a);
        aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, this.f37508d.f51990b);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_clicked");
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37508d.f51992d);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37508d.f51991c);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37508d.f51993e);
        aVar2.mo49936d(AnalyticsAttributeKey.TIME, elapsedRealtime);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f37508d.mo52756b());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37507c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public final void onAdDismissedFullScreenContent() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f37509e;
        MobileAdsManager h = MobileAdsManager.m37073h();
        h.mo44715p((C20554a<?>) null);
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C6677a aVar = this.f37506b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37506b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37508d.f51989a);
        aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, this.f37508d.f51990b);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_dismissed");
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37508d.f51992d);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37508d.f51991c);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37508d.f51993e);
        aVar2.mo49936d(AnalyticsAttributeKey.TIME, elapsedRealtime);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f37508d.mo52756b());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37507c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
        h.mo44712n("ad_dismiss", 0, false);
    }

    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C6677a aVar = this.f37506b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37506b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37508d.f51989a);
        aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, this.f37508d.f51990b);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_present_failed");
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37508d.f51992d);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37508d.f51991c);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37508d.f51993e);
        aVar2.mo49935c(AnalyticsAttributeKey.ERROR_CODE, adError.getCode());
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f37508d.mo52756b());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37507c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
        C16596f.m42113a().mo49363b("Failed to show full screen ad  SESSION ID " + j + " IS TEST DEVICE: " + this.f37508d.f51989a + " INITIATOR: " + this.f37508d.f51990b + " AD_ID: " + this.f37508d.f51992d + " AD_ID_KEY: " + this.f37508d.f51991c + " ID: " + this.f37508d.f51993e + " ERROR_CODE: " + adError.getCode() + " PROVIDER: " + this.f37508d.mo52756b());
    }

    public final void onAdImpression() {
        this.f37509e = SystemClock.elapsedRealtime();
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C6677a aVar = this.f37506b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37506b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37508d.f51989a);
        aVar2.mo49939g(AnalyticsAttributeKey.SOURCE, this.f37508d.f51990b);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_impression");
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37508d.f51992d);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37508d.f51991c);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37508d.f51993e);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, this.f37508d.mo52756b());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37507c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public final void onAdShowedFullScreenContent() {
        MobileAdsManager.m37073h().mo44715p(this.f37508d);
    }
}
