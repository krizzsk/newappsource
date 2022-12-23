package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.BidderTokenProvider;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdBase;
import com.google.ads.mediation.facebook.C3831a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.util.ArrayList;
import java.util.List;
import p136j9.C5408a;
import p149k9.C5527a;
import p149k9.C5528b;
import p149k9.C5530d;

public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookAdapter";
    private C5527a banner;
    private C5528b interstitial;
    private C5530d nativeAd;
    private C3833b rewardedAd;
    private C5408a rewardedInterstitialAd;

    /* renamed from: com.google.ads.mediation.facebook.FacebookMediationAdapter$a */
    public class C3830a implements C3831a.C3832a {

        /* renamed from: a */
        public final /* synthetic */ InitializationCompleteCallback f13279a;

        public C3830a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f13279a = initializationCompleteCallback;
        }

        /* renamed from: a */
        public final void mo15696a(AdError adError) {
            this.f13279a.onInitializationFailed(adError.getMessage());
        }

        /* renamed from: b */
        public final void mo15697b() {
            this.f13279a.onInitializationSucceeded();
        }
    }

    public static AdError getAdError(com.facebook.ads.AdError adError) {
        return new AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    public static String getPlacementID(Bundle bundle) {
        String string = bundle.getString("placement_id");
        if (string == null) {
            return bundle.getString("pubid");
        }
        return string;
    }

    public static void setMixedAudience(MediationAdConfiguration mediationAdConfiguration) {
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    public VersionInfo getSDKVersionInfo() {
        String[] split = BuildConfig.VERSION_NAME.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        String.format("Unexpected SDK version format: %s.Returning 0.0.0 for SDK version.", new Object[]{BuildConfig.VERSION_NAME});
        return new VersionInfo(0, 0, 0);
    }

    public VersionInfo getVersionInfo() {
        String[] split = "6.11.0.1".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        String.format("Unexpected adapter version format: %s.Returning 0.0.0 for adapter version.", new Object[]{"6.11.0.1"});
        return new VersionInfo(0, 0, 0);
    }

    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        ArrayList arrayList = new ArrayList();
        for (MediationConfiguration serverParameters : list) {
            String placementID = getPlacementID(serverParameters.getServerParameters());
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (arrayList.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed("Initialization failed. No placement IDs found.");
        } else {
            C3831a.m10133a().mo15715c(context, arrayList, new C3830a(initializationCompleteCallback));
        }
    }

    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        C5527a aVar = new C5527a(mediationBannerAdConfiguration, mediationAdLoadCallback);
        this.banner = aVar;
        String placementID = getPlacementID(mediationBannerAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        setMixedAudience(mediationBannerAdConfiguration);
        try {
            aVar.f18106b = new AdView(mediationBannerAdConfiguration.getContext(), placementID, mediationBannerAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationBannerAdConfiguration.getWatermark())) {
                aVar.f18106b.setExtraHints(new ExtraHints.Builder().mediationData(mediationBannerAdConfiguration.getWatermark()).build());
            }
            Context context = mediationBannerAdConfiguration.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mediationBannerAdConfiguration.getAdSize().getWidthInPixels(context), -2);
            aVar.f18107c = new FrameLayout(context);
            aVar.f18106b.setLayoutParams(layoutParams);
            aVar.f18107c.addView(aVar.f18106b);
            AdView adView = aVar.f18106b;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(aVar).withBid(mediationBannerAdConfiguration.getBidResponse()).build());
        } catch (Exception e) {
            StringBuilder k = C13555b.m33972k("Failed to create banner ad: ");
            k.append(e.getMessage());
            AdError adError2 = new AdError(111, k.toString(), ERROR_DOMAIN);
            adError2.getMessage();
            aVar.f18105a.onFailure(adError2);
        }
    }

    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        C5528b bVar = new C5528b(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.interstitial = bVar;
        String placementID = getPlacementID(bVar.f18109a.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty. ", ERROR_DOMAIN);
            adError.getMessage();
            bVar.f18110b.onFailure(adError);
            return;
        }
        setMixedAudience(bVar.f18109a);
        bVar.f18111c = new InterstitialAd(bVar.f18109a.getContext(), placementID);
        if (!TextUtils.isEmpty(bVar.f18109a.getWatermark())) {
            bVar.f18111c.setExtraHints(new ExtraHints.Builder().mediationData(bVar.f18109a.getWatermark()).build());
        }
        InterstitialAd interstitialAd = bVar.f18111c;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(bVar.f18109a.getBidResponse()).withAdListener(bVar).build());
    }

    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        C5530d dVar = new C5530d(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.nativeAd = dVar;
        String placementID = getPlacementID(dVar.f18116a.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", ERROR_DOMAIN);
            adError.getMessage();
            dVar.f18117b.onFailure(adError);
            return;
        }
        setMixedAudience(dVar.f18116a);
        dVar.f18120e = new MediaView(dVar.f18116a.getContext());
        try {
            dVar.f18118c = NativeAdBase.fromBidPayload(dVar.f18116a.getContext(), placementID, dVar.f18116a.getBidResponse());
            if (!TextUtils.isEmpty(dVar.f18116a.getWatermark())) {
                dVar.f18118c.setExtraHints(new ExtraHints.Builder().mediationData(dVar.f18116a.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = dVar.f18118c;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new C5530d.C5532b(dVar.f18116a.getContext(), dVar.f18118c)).withBid(dVar.f18116a.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            StringBuilder k = C13555b.m33972k("Failed to create native ad from bid payload: ");
            k.append(e.getMessage());
            AdError adError2 = new AdError(109, k.toString(), ERROR_DOMAIN);
            adError2.getMessage();
            dVar.f18117b.onFailure(adError2);
        }
    }

    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        C3833b bVar = new C3833b(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rewardedAd = bVar;
        bVar.mo15717b();
    }

    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        C5408a aVar = new C5408a(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rewardedInterstitialAd = aVar;
        aVar.mo15717b();
    }

    public void loadRtbRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        C5408a aVar = new C5408a(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rewardedInterstitialAd = aVar;
        aVar.mo15717b();
    }
}
