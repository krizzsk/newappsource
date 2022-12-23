package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.BuildConfig;
import com.google.ads.mediation.vungle.C3852a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.vungle.mediation.C23060a;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23135f0;
import com.vungle.warren.C23258z;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kd0.C23759d;
import p211p9.C6101a;
import p211p9.C6103c;
import p211p9.C6105d;
import p211p9.C6106e;
import p584jl.C17885a;

public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, C23258z, C23135f0 {
    public static final int ERROR_AD_ALREADY_LOADED = 104;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_VUNGLE_BANNER_NULL = 106;
    public static final String KEY_APP_ID = "appid";
    public static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.warren";
    /* access modifiers changed from: private */
    public static final HashMap<String, WeakReference<VungleMediationAdapter>> mPlacementsInUse = new HashMap<>();
    /* access modifiers changed from: private */
    public AdConfig mAdConfig;
    /* access modifiers changed from: private */
    public MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mMediationAdLoadCallback;
    /* access modifiers changed from: private */
    public MediationRewardedAdCallback mMediationRewardedAdCallback;
    /* access modifiers changed from: private */
    public String mPlacement;
    /* access modifiers changed from: private */
    public String mUserID;
    private C6103c rtbInterstitialAd;
    private C6106e rtbRewardedAd;

    /* renamed from: com.google.ads.mediation.vungle.VungleMediationAdapter$a */
    public class C3849a implements C3852a.C3855c {

        /* renamed from: a */
        public final /* synthetic */ InitializationCompleteCallback f13334a;

        public C3849a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f13334a = initializationCompleteCallback;
        }

        /* renamed from: a */
        public final void mo15744a(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.getMessage();
            this.f13334a.onInitializationFailed(adError.getMessage());
        }

        /* renamed from: b */
        public final void mo15745b() {
            this.f13334a.onInitializationSucceeded();
        }
    }

    /* renamed from: com.google.ads.mediation.vungle.VungleMediationAdapter$b */
    public class C3850b implements C3852a.C3855c {
        public C3850b() {
        }

        /* renamed from: a */
        public final void mo15744a(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.getMessage();
            VungleMediationAdapter.this.mMediationAdLoadCallback.onFailure(adError);
            VungleMediationAdapter.mPlacementsInUse.remove(VungleMediationAdapter.this.mPlacement);
        }

        /* renamed from: b */
        public final void mo15745b() {
            Vungle.setIncentivizedFields(VungleMediationAdapter.this.mUserID, (String) null, (String) null, (String) null, (String) null);
            VungleMediationAdapter.mPlacementsInUse.put(VungleMediationAdapter.this.mPlacement, new WeakReference(VungleMediationAdapter.this));
            if (Vungle.canPlayAd(VungleMediationAdapter.this.mPlacement)) {
                VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
                MediationRewardedAdCallback unused = vungleMediationAdapter.mMediationRewardedAdCallback = (MediationRewardedAdCallback) vungleMediationAdapter.mMediationAdLoadCallback.onSuccess(VungleMediationAdapter.this);
                return;
            }
            Vungle.loadAd(VungleMediationAdapter.this.mPlacement, VungleMediationAdapter.this.mAdConfig, VungleMediationAdapter.this);
        }
    }

    /* renamed from: com.google.ads.mediation.vungle.VungleMediationAdapter$c */
    public static class C3851c implements RewardItem {
        public final int getAmount() {
            return 1;
        }

        public final String getType() {
            return "vungle";
        }
    }

    public static AdError getAdError(VungleException vungleException) {
        return new AdError(vungleException.mo58207a(), vungleException.getLocalizedMessage(), VUNGLE_SDK_ERROR_DOMAIN);
    }

    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(Vungle.getAvailableBidTokens(rtbSignalData.getContext()));
    }

    public void creativeId(String str) {
    }

    public VersionInfo getSDKVersionInfo() {
        String[] split = BuildConfig.VERSION_NAME.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", new Object[]{BuildConfig.VERSION_NAME});
        return new VersionInfo(0, 0, 0);
    }

    public VersionInfo getVersionInfo() {
        String[] split = "6.11.0.2".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", new Object[]{"6.11.0.2"});
        return new VersionInfo(0, 0, 0);
    }

    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (Vungle.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        for (MediationConfiguration serverParameters : list) {
            String string = serverParameters.getServerParameters().getString("appid");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", new Object[]{"appid", hashSet, str});
            }
            C3852a.f13336d.mo15750c(str, context.getApplicationContext(), new C3849a(initializationCompleteCallback));
        } else if (initializationCompleteCallback != null) {
            AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
            adError.getMessage();
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        }
    }

    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mMediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.mUserID = mediationExtras.getString("userId");
        }
        C23759d.m58339b().getClass();
        String a = C23759d.m58338a(mediationExtras, serverParameters);
        this.mPlacement = a;
        if (TextUtils.isEmpty(a)) {
            AdError adError = new AdError(101, "Failed to load ad from Vungle. Missing or invalid Placement ID.", ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        HashMap<String, WeakReference<VungleMediationAdapter>> hashMap = mPlacementsInUse;
        if (!hashMap.containsKey(this.mPlacement) || hashMap.get(this.mPlacement).get() == null) {
            String string = serverParameters.getString("appid");
            if (TextUtils.isEmpty(string)) {
                AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid App ID.", ERROR_DOMAIN);
                adError2.getMessage();
                mediationAdLoadCallback.onFailure(adError2);
                return;
            }
            this.mAdConfig = C17885a.m44435e(mediationExtras, false);
            C3852a aVar = C3852a.f13336d;
            int taggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
            aVar.getClass();
            C3852a.m10151d(taggedForChildDirectedTreatment);
            aVar.mo15750c(string, mediationRewardedAdConfiguration.getContext(), new C3850b());
            return;
        }
        AdError adError3 = new AdError(104, "Only a maximum of one ad can be loaded per placement.", ERROR_DOMAIN);
        adError3.getMessage();
        mediationAdLoadCallback.onFailure(adError3);
    }

    public void loadRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        C3852a aVar = C3852a.f13336d;
        int taggedForChildDirectedTreatment = mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        C3852a.m10151d(taggedForChildDirectedTreatment);
        C6103c cVar = new C6103c(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.rtbInterstitialAd = cVar;
        Bundle mediationExtras = mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Missing or invalid App ID.", ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        C23759d.m58339b().getClass();
        String a = C23759d.m58338a(mediationExtras, serverParameters);
        cVar.f19371d = a;
        if (TextUtils.isEmpty(a)) {
            AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid Placement ID.", ERROR_DOMAIN);
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        cVar.f19372e = mediationInterstitialAdConfiguration.getBidResponse();
        C23060a.C23061a a2 = C23060a.m56985a(mediationExtras, string);
        cVar.f19370c = C17885a.m44435e(mediationExtras, false);
        aVar.mo15750c(a2.f58484a, mediationInterstitialAdConfiguration.getContext(), new C6101a(cVar));
    }

    public void loadRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        C3852a aVar = C3852a.f13336d;
        int taggedForChildDirectedTreatment = mediationRewardedAdConfiguration.taggedForChildDirectedTreatment();
        aVar.getClass();
        C3852a.m10151d(taggedForChildDirectedTreatment);
        C6106e eVar = new C6106e(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rtbRewardedAd = eVar;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            eVar.f19380f = mediationExtras.getString("userId");
        }
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Missing or invalid App ID.", ERROR_DOMAIN);
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        C23759d.m58339b().getClass();
        String a = C23759d.m58338a(mediationExtras, serverParameters);
        eVar.f19378d = a;
        if (TextUtils.isEmpty(a)) {
            AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or invalid Placement ID.", ERROR_DOMAIN);
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        eVar.f19379e = mediationRewardedAdConfiguration.getBidResponse();
        eVar.f19377c = C17885a.m44435e(mediationExtras, false);
        C3852a.m10151d(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        aVar.mo15750c(string, mediationRewardedAdConfiguration.getContext(), new C6105d(eVar));
    }

    public void onAdClick(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    public void onAdEnd(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        mPlacementsInUse.remove(str);
    }

    @Deprecated
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    public void onAdLeftApplication(String str) {
    }

    public void onAdLoad(String str) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mMediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            this.mMediationRewardedAdCallback = mediationAdLoadCallback.onSuccess(this);
        }
        mPlacementsInUse.put(this.mPlacement, new WeakReference(this));
    }

    public void onAdRewarded(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.mMediationRewardedAdCallback.onUserEarnedReward(new C3851c());
        }
    }

    public void onAdStart(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    public void onAdViewed(String str) {
        this.mMediationRewardedAdCallback.onVideoStart();
        this.mMediationRewardedAdCallback.reportAdImpression();
    }

    public void onError(String str, VungleException vungleException) {
        AdError adError = getAdError(vungleException);
        adError.getMessage();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mMediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        } else {
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mMediationAdLoadCallback;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError);
            }
        }
        mPlacementsInUse.remove(str);
    }

    public void showAd(Context context) {
        Vungle.playAd(this.mPlacement, this.mAdConfig, this);
    }
}
