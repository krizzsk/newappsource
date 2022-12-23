package com.moovit.app.ads;

import android.os.SystemClock;
import ce0.C21100e;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p172m9.C5720b;
import p269u2.C6677a;
import p435de.C16596f;
import p543hq.C17474b;
import p977zz.C20944i0;

/* renamed from: com.moovit.app.ads.m */
public class C14749m extends AdListener {

    /* renamed from: b */
    public final MoovitApplication<?, ?, ?> f37537b;

    /* renamed from: c */
    public final MoovitActivity f37538c;

    /* renamed from: d */
    public final boolean f37539d;

    /* renamed from: e */
    public final String f37540e;

    /* renamed from: f */
    public final AdView f37541f;

    /* renamed from: g */
    public String f37542g = null;

    /* renamed from: h */
    public long f37543h;

    public C14749m(MoovitApplication<?, ?, ?> moovitApplication, MoovitActivity moovitActivity, boolean z, String str, AdView adView) {
        C21100e.m49373x(moovitApplication, "application");
        this.f37537b = moovitApplication;
        C21100e.m49373x(moovitActivity, "activity");
        this.f37538c = moovitActivity;
        this.f37539d = z;
        C21100e.m49373x(str, "adUnitIdKey");
        this.f37540e = str;
        this.f37541f = adView;
    }

    /* renamed from: a */
    public final String mo44752a() {
        ResponseInfo responseInfo = this.f37541f.getResponseInfo();
        if (responseInfo != null) {
            return responseInfo.getMediationAdapterClassName();
        }
        return null;
    }

    /* renamed from: b */
    public final void mo44753b(boolean z) {
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        C6677a aVar = this.f37537b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37537b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_load_end");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37539d);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37542g);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37541f.getAdUnitId());
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37540e);
        aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, mo44752a());
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public final void onAdClicked() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f37543h;
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        this.f37541f.getAdUnitId();
        TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime);
        C6677a aVar = this.f37537b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37537b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_clicked");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37539d);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37542g);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37541f.getAdUnitId());
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37540e);
        aVar2.mo49936d(AnalyticsAttributeKey.TIME, elapsedRealtime);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, mo44752a());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37538c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public final void onAdClosed() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f37543h;
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        this.f37541f.getAdUnitId();
        TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime);
        C6677a aVar = this.f37537b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37537b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_dismissed");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37539d);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37542g);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37541f.getAdUnitId());
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37540e);
        aVar2.mo49936d(AnalyticsAttributeKey.TIME, elapsedRealtime);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, mo44752a());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37538c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f37541f.getAdUnitId();
        this.f37542g = null;
        mo44753b(false);
        C16596f a = C16596f.m42113a();
        a.mo49363b("Failed to load an ad " + loadAdError);
    }

    public final void onAdImpression() {
        this.f37543h = SystemClock.elapsedRealtime();
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        this.f37541f.getAdUnitId();
        C6677a aVar = this.f37537b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37537b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_impression");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37539d);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37542g);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37541f.getAdUnitId());
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37540e);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, mo44752a());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37538c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }

    public void onAdLoaded() {
        this.f37542g = UUID.randomUUID().toString();
        this.f37541f.getAdUnitId();
        mo44753b(true);
    }

    public final void onAdOpened() {
        MobileAdsManager h = MobileAdsManager.m37073h();
        String j = h.mo44709j();
        C20944i0<String, String> d = h.mo44707d();
        this.f37541f.getAdUnitId();
        C6677a aVar = this.f37537b.mo44558j().f50173c;
        MoovitApplication<?, ?, ?> moovitApplication = this.f37537b;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_opened");
        aVar2.mo49941i(AnalyticsAttributeKey.IS_TEST_DEVICE, this.f37539d);
        aVar2.mo49939g(AnalyticsAttributeKey.ID, this.f37542g);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37541f.getAdUnitId());
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID_KEY, this.f37540e);
        aVar2.mo49945m(AnalyticsAttributeKey.PROVIDER, mo44752a());
        aVar2.mo49944l(AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID, C5720b.m14057h(this.f37538c));
        aVar2.mo49945m(AnalyticsAttributeKey.SESSION_ID, j);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME, (String) d.f52692a);
        aVar2.mo49945m(AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE, (String) d.f52693b);
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(moovitApplication, analyticsFlowKey, false, bVarArr);
    }
}
