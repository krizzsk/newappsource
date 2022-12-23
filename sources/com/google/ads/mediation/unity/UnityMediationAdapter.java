package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import java.util.HashSet;
import java.util.List;
import p172m9.C5720b;
import p172m9.C5721c;

public class UnityMediationAdapter extends Adapter {
    public static final String ADAPTER_ERROR_DOMAIN = "com.google.ads.mediation.unity";
    public static final int ERROR_AD_ALREADY_LOADING = 108;
    public static final int ERROR_AD_NOT_READY = 106;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 110;
    public static final int ERROR_CONTEXT_NOT_ACTIVITY = 105;
    public static final int ERROR_FINISH = 109;
    public static final int ERROR_INITIALIZATION_FAILURE = 111;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_NULL_CONTEXT = 104;
    public static final int ERROR_PLACEMENT_STATE_DISABLED = 103;
    public static final int ERROR_PLACEMENT_STATE_NO_FILL = 102;
    public static final int ERROR_UNITY_ADS_NOT_SUPPORTED = 107;
    public static final String KEY_GAME_ID = "gameId";
    public static final String KEY_PLACEMENT_ID = "zoneId";
    public static final String SDK_ERROR_DOMAIN = "com.unity3d.ads";
    public static final String TAG = "UnityMediationAdapter";
    private C3846a rewardedAd;

    /* renamed from: com.google.ads.mediation.unity.UnityMediationAdapter$a */
    public class C3845a implements IUnityAdsInitializationListener {

        /* renamed from: a */
        public final /* synthetic */ InitializationCompleteCallback f13325a;

        public C3845a(InitializationCompleteCallback initializationCompleteCallback) {
            this.f13325a = initializationCompleteCallback;
        }

        public final void onInitializationComplete() {
            this.f13325a.onInitializationSucceeded();
        }

        public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError b = UnityAdsAdapterUtils.m10143b(unityAdsInitializationError, "Unity Ads initialization failed: [" + unityAdsInitializationError + "] " + str);
            b.toString();
            this.f13325a.onInitializationFailed(b.toString());
        }
    }

    public VersionInfo getSDKVersionInfo() {
        String version = UnityAds.getVersion();
        String[] split = version.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", new Object[]{version});
        return new VersionInfo(0, 0, 0);
    }

    public VersionInfo getVersionInfo() {
        String[] split = "4.2.1.1".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", new Object[]{"4.2.1.1"});
        return new VersionInfo(0, 0, 0);
    }

    public void initialize(Context context, InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        String str;
        HashSet hashSet = new HashSet();
        for (MediationConfiguration serverParameters : list) {
            String string = serverParameters.getServerParameters().getString(KEY_GAME_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            str = (String) hashSet.iterator().next();
            if (size > 1) {
                String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the UnityAds SDK", new Object[]{KEY_GAME_ID, hashSet, str});
            }
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            initializationCompleteCallback.onInitializationFailed(new AdError(101, "Missing or invalid Game ID.", ADAPTER_ERROR_DOMAIN).toString());
            return;
        }
        C5720b m = C5720b.m14062m();
        C3845a aVar = new C3845a(initializationCompleteCallback);
        m.getClass();
        C5720b.m14068s(context, str, aVar);
    }

    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        C3846a aVar = new C3846a();
        this.rewardedAd = aVar;
        aVar.f13326a = mediationAdLoadCallback;
        Context context = mediationRewardedAdConfiguration.getContext();
        if (!(context instanceof Activity)) {
            aVar.mo15731a(UnityAdsAdapterUtils.m10142a(105, "Unity Ads requires an Activity context to load ads."));
            return;
        }
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(KEY_GAME_ID);
        String string2 = serverParameters.getString(KEY_PLACEMENT_ID);
        if (!UnityAdapter.areValidIds(string, string2)) {
            aVar.mo15731a(UnityAdsAdapterUtils.m10142a(101, "Missing or invalid server parameters."));
            return;
        }
        C5720b m = C5720b.m14062m();
        C5721c cVar = new C5721c(aVar, string, string2);
        m.getClass();
        C5720b.m14068s(context, string, cVar);
        UnityAds.load(string2, aVar.f13330e);
    }
}
