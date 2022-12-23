package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import p160l9.C5641a;
import p160l9.C5642b;
import p160l9.C5644c;
import p160l9.C5646e;
import p160l9.C5648g;
import p160l9.C5651j;

public class FyberMediationAdapter extends Adapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    public static final int ERROR_AD_NOT_READY = 106;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 103;
    public static final int ERROR_CONTEXT_NOT_ACTIVITY_INSTANCE = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.fyber";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_WRONG_CONTROLLER_TYPE = 105;

    /* renamed from: g */
    public static final InneractiveMediationName f13294g = InneractiveMediationName.ADMOB;

    /* renamed from: a */
    public AdSize f13295a;

    /* renamed from: b */
    public InneractiveAdSpot f13296b;

    /* renamed from: c */
    public ViewGroup f13297c;

    /* renamed from: d */
    public MediationBannerListener f13298d;

    /* renamed from: e */
    public MediationInterstitialListener f13299e;

    /* renamed from: f */
    public InneractiveAdSpot f13300f;

    /* renamed from: com.google.ads.mediation.fyber.FyberMediationAdapter$a */
    public class C3835a implements OnFyberMarketplaceInitializedListener {

        /* renamed from: a */
        public final /* synthetic */ MediationAdLoadCallback f13301a;

        /* renamed from: b */
        public final /* synthetic */ MediationRewardedAdConfiguration f13302b;

        public C3835a(MediationAdLoadCallback mediationAdLoadCallback, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f13301a = mediationAdLoadCallback;
            this.f13302b = mediationRewardedAdConfiguration;
        }

        public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError b = C5642b.m13924b(fyberInitStatus);
                InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
                b.getMessage();
                this.f13301a.onFailure(b);
                return;
            }
            FyberMediationAdapter fyberMediationAdapter = FyberMediationAdapter.this;
            MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.f13302b;
            MediationAdLoadCallback mediationAdLoadCallback = this.f13301a;
            C5651j jVar = new C5651j(mediationRewardedAdConfiguration, mediationAdLoadCallback);
            fyberMediationAdapter.getClass();
            String string = mediationRewardedAdConfiguration.getServerParameters().getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Spot ID is null or empty.", FyberMediationAdapter.ERROR_DOMAIN);
                InneractiveMediationName inneractiveMediationName2 = FyberMediationAdapter.f13294g;
                adError.getMessage();
                mediationAdLoadCallback.onFailure(adError);
                return;
            }
            InneractiveAdSpot createSpot = InneractiveAdSpotManager.get().createSpot();
            jVar.f18406c = createSpot;
            createSpot.setMediationName(InneractiveMediationName.ADMOB);
            InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
            jVar.f18407d = inneractiveFullscreenUnitController;
            jVar.f18406c.addUnitController(inneractiveFullscreenUnitController);
            jVar.f18406c.setRequestListener(new C5648g(jVar));
            C5642b.m13925c(mediationRewardedAdConfiguration.getMediationExtras());
            jVar.f18406c.requestAd(new InneractiveAdRequest(string));
        }
    }

    /* renamed from: com.google.ads.mediation.fyber.FyberMediationAdapter$b */
    public class C3836b implements OnFyberMarketplaceInitializedListener {

        /* renamed from: a */
        public final /* synthetic */ InitializationCompleteCallback f13304a;

        public C3836b(InitializationCompleteCallback initializationCompleteCallback) {
            this.f13304a = initializationCompleteCallback;
        }

        public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError b = C5642b.m13924b(fyberInitStatus);
                InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
                b.getMessage();
                this.f13304a.onInitializationFailed(b.getMessage());
                return;
            }
            this.f13304a.onInitializationSucceeded();
        }
    }

    /* renamed from: com.google.ads.mediation.fyber.FyberMediationAdapter$c */
    public class C3837c implements OnFyberMarketplaceInitializedListener {

        /* renamed from: a */
        public final /* synthetic */ Bundle f13305a;

        /* renamed from: b */
        public final /* synthetic */ Context f13306b;

        /* renamed from: c */
        public final /* synthetic */ AdSize f13307c;

        /* renamed from: d */
        public final /* synthetic */ Bundle f13308d;

        public C3837c(Bundle bundle, Context context, AdSize adSize, Bundle bundle2) {
            this.f13305a = bundle;
            this.f13306b = context;
            this.f13307c = adSize;
            this.f13308d = bundle2;
        }

        public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError b = C5642b.m13924b(fyberInitStatus);
                InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
                b.getMessage();
                FyberMediationAdapter fyberMediationAdapter = FyberMediationAdapter.this;
                fyberMediationAdapter.f13298d.onAdFailedToLoad((MediationBannerAdapter) fyberMediationAdapter, b);
                return;
            }
            String string = this.f13305a.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", FyberMediationAdapter.ERROR_DOMAIN);
                InneractiveMediationName inneractiveMediationName2 = FyberMediationAdapter.f13294g;
                adError.getMessage();
                FyberMediationAdapter fyberMediationAdapter2 = FyberMediationAdapter.this;
                fyberMediationAdapter2.f13298d.onAdFailedToLoad((MediationBannerAdapter) fyberMediationAdapter2, adError);
                return;
            }
            FyberMediationAdapter.this.f13296b = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f13296b.setMediationName(FyberMediationAdapter.f13294g);
            FyberMediationAdapter.this.f13296b.addUnitController(new InneractiveAdViewUnitController());
            FyberMediationAdapter.this.f13297c = new RelativeLayout(this.f13306b);
            FyberMediationAdapter fyberMediationAdapter3 = FyberMediationAdapter.this;
            fyberMediationAdapter3.getClass();
            FyberMediationAdapter.this.f13296b.setRequestListener(new C5644c(fyberMediationAdapter3));
            FyberMediationAdapter.this.f13295a = this.f13307c;
            C5642b.m13925c(this.f13308d);
            FyberMediationAdapter.this.f13296b.requestAd(new InneractiveAdRequest(string));
        }
    }

    /* renamed from: com.google.ads.mediation.fyber.FyberMediationAdapter$d */
    public class C3838d implements OnFyberMarketplaceInitializedListener {

        /* renamed from: a */
        public final /* synthetic */ Bundle f13310a;

        /* renamed from: b */
        public final /* synthetic */ Bundle f13311b;

        public C3838d(Bundle bundle, Bundle bundle2) {
            this.f13310a = bundle;
            this.f13311b = bundle2;
        }

        public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError b = C5642b.m13924b(fyberInitStatus);
                InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
                b.getMessage();
                FyberMediationAdapter fyberMediationAdapter = FyberMediationAdapter.this;
                fyberMediationAdapter.f13299e.onAdFailedToLoad((MediationInterstitialAdapter) fyberMediationAdapter, b);
                return;
            }
            String string = this.f13310a.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", FyberMediationAdapter.ERROR_DOMAIN);
                InneractiveMediationName inneractiveMediationName2 = FyberMediationAdapter.f13294g;
                adError.getMessage();
                FyberMediationAdapter fyberMediationAdapter2 = FyberMediationAdapter.this;
                fyberMediationAdapter2.f13299e.onAdFailedToLoad((MediationInterstitialAdapter) fyberMediationAdapter2, adError);
                return;
            }
            FyberMediationAdapter.this.f13300f = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f13300f.setMediationName(FyberMediationAdapter.f13294g);
            FyberMediationAdapter.this.f13300f.addUnitController(new InneractiveFullscreenUnitController());
            FyberMediationAdapter fyberMediationAdapter3 = FyberMediationAdapter.this;
            fyberMediationAdapter3.getClass();
            FyberMediationAdapter.this.f13300f.setRequestListener(new C5646e(fyberMediationAdapter3));
            C5642b.m13925c(this.f13311b);
            FyberMediationAdapter.this.f13300f.requestAd(new InneractiveAdRequest(string));
        }
    }

    public View getBannerView() {
        return this.f13297c;
    }

    public VersionInfo getSDKVersionInfo() {
        String version = InneractiveAdManager.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", new Object[]{version});
        return new VersionInfo(0, 0, 0);
    }

    public VersionInfo getVersionInfo() {
        String[] split = "8.1.5.0".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", new Object[]{"8.1.5.0"});
        return new VersionInfo(0, 0, 0);
    }

    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (InneractiveAdManager.wasInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        for (MediationConfiguration serverParameters : list) {
            String string = serverParameters.getServerParameters().getString("applicationId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(101, "Fyber Marketplace SDK requires an appId to be configured on the AdMob UI.", ERROR_DOMAIN);
            adError.getMessage();
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (hashSet.size() > 1) {
            String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Fyber Marketplace SDK.", new Object[]{"applicationId", hashSet, str});
        }
        InneractiveAdManager.initialize(context, str, new C3836b(initializationCompleteCallback));
    }

    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new C3835a(mediationAdLoadCallback, mediationRewardedAdConfiguration));
    }

    public void onDestroy() {
        InneractiveAdSpot inneractiveAdSpot = this.f13296b;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.f13296b = null;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f13300f;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.f13300f = null;
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f13298d = mediationBannerListener;
        String string = bundle.getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
            adError.getMessage();
            this.f13298d.onAdFailedToLoad((MediationBannerAdapter) this, adError);
            return;
        }
        InneractiveAdManager.initialize(context, string, new C3837c(bundle, context, adSize, bundle2));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f13299e = mediationInterstitialListener;
        String string = bundle.getString("applicationId");
        AdError adError = new AdError(101, "App ID is null or empty.", ERROR_DOMAIN);
        if (TextUtils.isEmpty(string)) {
            adError.getMessage();
            this.f13299e.onAdFailedToLoad((MediationInterstitialAdapter) this, adError);
            return;
        }
        InneractiveAdManager.initialize(context, string, new C3838d(bundle, bundle2));
    }

    public void showInterstitial() {
        Activity activity;
        WeakReference<Activity> weakReference = C5641a.f18392d.f18393b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            this.f13299e.onAdOpened(this);
            this.f13299e.onAdClosed(this);
        } else if (!(this.f13300f.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
            this.f13299e.onAdOpened(this);
            this.f13299e.onAdClosed(this);
        } else {
            InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) this.f13300f.getSelectedUnitController();
            if (!this.f13300f.isReady()) {
                this.f13299e.onAdOpened(this);
                this.f13299e.onAdClosed(this);
                return;
            }
            inneractiveFullscreenUnitController.show(activity);
        }
    }
}
