package com.moovit.mediation;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.C1047z;
import bf0.C21049c;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ff0.C23349c;
import gk0.C23438a;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.C24179b;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17884p;
import wh0.C25177g;
import wh0.C25184i0;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J$\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016J$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00162\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006+"}, mo59060d2 = {"Lcom/moovit/mediation/MoovitMediationAdapter;", "Lcom/google/android/gms/ads/mediation/Adapter;", "", "includeBuild", "Lcom/google/android/gms/ads/mediation/VersionInfo;", "parseVersionInfo", "Landroid/content/Context;", "context", "Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;", "initializationCompleteCallback", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "list", "Lbf0/d;", "initialize", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "conf", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "callback", "loadBannerAd", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "loadInterstitialAd", "getSDKVersionInfo", "getVersionInfo", "Lwh0/z;", "scope", "Lwh0/z;", "adapterSdkVersionInfo$delegate", "Lbf0/c;", "getAdapterSdkVersionInfo", "()Lcom/google/android/gms/ads/mediation/VersionInfo;", "adapterSdkVersionInfo", "adapterVersionInfo$delegate", "getAdapterVersionInfo", "adapterVersionInfo", "<init>", "()V", "Companion", "a", "AdsMediation_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
@Keep
public final class MoovitMediationAdapter extends Adapter {
    public static final C4113a Companion = new C4113a();
    private static final String EXTRA_PREFIX = "com.moovit.mediation";
    public static final String EXTRA_TARGET_LOCATION = "com.moovit.mediation.target_location";
    public static final String EXTRA_USER_LOCATION = "com.moovit.mediation.user_location";
    private final C21049c adapterSdkVersionInfo$delegate = C23812a.m58432b(new MoovitMediationAdapter$adapterSdkVersionInfo$2(this));
    private final C21049c adapterVersionInfo$delegate = C23812a.m58432b(new MoovitMediationAdapter$adapterVersionInfo$2(this));
    private final C25235z scope = C13637c.m34064a(C17884p.m44356a().mo53082y(C25184i0.f63459a));

    /* renamed from: com.moovit.mediation.MoovitMediationAdapter$a */
    public static final class C4113a {
    }

    private final VersionInfo getAdapterSdkVersionInfo() {
        return (VersionInfo) this.adapterSdkVersionInfo$delegate.getValue();
    }

    private final VersionInfo getAdapterVersionInfo() {
        return (VersionInfo) this.adapterVersionInfo$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final VersionInfo parseVersionInfo(boolean z) {
        List X = C24179b.m60576X("1.0.0.0", new char[]{'.'});
        if (X.size() < 4) {
            C23438a.f59213a.getClass();
            return new VersionInfo(0, 0, 0);
        }
        int parseInt = Integer.parseInt((String) X.get(0));
        int parseInt2 = Integer.parseInt((String) X.get(1));
        int parseInt3 = Integer.parseInt((String) X.get(2));
        int parseInt4 = Integer.parseInt((String) X.get(3));
        if (z) {
            parseInt3 = (parseInt3 * 100000) + parseInt4;
        }
        return new VersionInfo(parseInt, parseInt2, parseInt3);
    }

    public VersionInfo getSDKVersionInfo() {
        return getAdapterSdkVersionInfo();
    }

    public VersionInfo getVersionInfo() {
        return getAdapterVersionInfo();
    }

    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(initializationCompleteCallback, "initializationCompleteCallback");
        C24362h.m61211f(list, "list");
        C1047z.f3987j.f3993g.mo4224a(MoovitAdTracker.f14791e.mo19373a(context));
        initializationCompleteCallback.onInitializationSucceeded();
    }

    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        C24362h.m61211f(mediationBannerAdConfiguration, "conf");
        C24362h.m61211f(mediationAdLoadCallback, WidgetMessageParser.KEY_CALLBACK);
        C25177g.m63218b(this.scope, (CoroutineContext) null, new MoovitMediationAdapter$loadBannerAd$1(mediationBannerAdConfiguration, mediationAdLoadCallback, (C23349c<? super MoovitMediationAdapter$loadBannerAd$1>) null), 3);
    }

    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        C24362h.m61211f(mediationInterstitialAdConfiguration, "conf");
        C24362h.m61211f(mediationAdLoadCallback, WidgetMessageParser.KEY_CALLBACK);
        C25177g.m63218b(this.scope, (CoroutineContext) null, new MoovitMediationAdapter$loadInterstitialAd$1(mediationInterstitialAdConfiguration, mediationAdLoadCallback, (C23349c<? super MoovitMediationAdapter$loadInterstitialAd$1>) null), 3);
    }
}
