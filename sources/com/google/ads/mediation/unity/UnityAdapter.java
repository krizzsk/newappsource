package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Keep;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.lang.ref.WeakReference;
import p172m9.C5719a;
import p172m9.C5720b;
import p185n9.C5880b;

@Keep
public class UnityAdapter extends UnityMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private UnityBannerAd bannerAd;
    /* access modifiers changed from: private */
    public C5880b eventAdapter;
    private final IUnityAdsLoadListener mUnityLoadListener = new C3839a();
    private final IUnityAdsShowListener mUnityShowListener = new C3841c();
    /* access modifiers changed from: private */
    public MediationInterstitialListener mediationInterstitialListener;
    /* access modifiers changed from: private */
    public String placementId;

    /* renamed from: com.google.ads.mediation.unity.UnityAdapter$a */
    public class C3839a implements IUnityAdsLoadListener {
        public C3839a() {
        }

        public final void onUnityAdsAdLoaded(String str) {
            String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", new Object[]{str});
            String unused = UnityAdapter.this.placementId = str;
            UnityAdapter.this.eventAdapter.mo21755a(UnityAdsAdapterUtils.AdEvent.LOADED);
        }

        public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            String unused = UnityAdapter.this.placementId = str;
            AdError c = UnityAdsAdapterUtils.m10144c(unityAdsLoadError, str2);
            c.toString();
            if (UnityAdapter.this.mediationInterstitialListener != null) {
                UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) UnityAdapter.this, c);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.unity.UnityAdapter$b */
    public class C3840b implements IUnityAdsInitializationListener {

        /* renamed from: a */
        public final /* synthetic */ String f13314a;

        public C3840b(String str) {
            this.f13314a = str;
        }

        public final void onInitializationComplete() {
            String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", new Object[]{this.f13314a, UnityAdapter.this.placementId});
        }

        public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError b = UnityAdsAdapterUtils.m10143b(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", new Object[]{this.f13314a, str}));
            b.toString();
            if (UnityAdapter.this.mediationInterstitialListener != null) {
                UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad((MediationInterstitialAdapter) UnityAdapter.this, b);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.unity.UnityAdapter$c */
    public class C3841c implements IUnityAdsShowListener {
        public C3841c() {
        }

        public final void onUnityAdsShowClick(String str) {
            String.format("Unity Ads interstitial ad was clicked for placement ID: %s", new Object[]{UnityAdapter.this.placementId});
            UnityAdapter.this.eventAdapter.mo21755a(UnityAdsAdapterUtils.AdEvent.CLICKED);
            UnityAdapter.this.eventAdapter.mo21755a(UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
        }

        public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            String.format("Unity Ads interstitial ad finished playing for placement ID: %s", new Object[]{UnityAdapter.this.placementId});
            UnityAdapter.this.eventAdapter.mo21755a(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            UnityAdsAdapterUtils.m10145d(unityAdsShowError, str2).toString();
            UnityAdapter.this.eventAdapter.mo21755a(UnityAdsAdapterUtils.AdEvent.OPENED);
            UnityAdapter.this.eventAdapter.mo21755a(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        public final void onUnityAdsShowStart(String str) {
            String.format("Unity Ads interstitial ad started for placement ID: %s", new Object[]{UnityAdapter.this.placementId});
            UnityAdapter.this.eventAdapter.mo21755a(UnityAdsAdapterUtils.AdEvent.OPENED);
        }
    }

    public static boolean areValidIds(String str, String str2) {
        return !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2);
    }

    private void sendAdFailedToLoad(int i, String str) {
        AdError a = UnityAdsAdapterUtils.m10142a(i, str);
        a.toString();
        MediationInterstitialListener mediationInterstitialListener2 = this.mediationInterstitialListener;
        if (mediationInterstitialListener2 != null) {
            mediationInterstitialListener2.onAdFailedToLoad((MediationInterstitialAdapter) this, a);
        }
    }

    public View getBannerView() {
        return this.bannerAd.getBannerView();
    }

    public void onDestroy() {
        this.mediationInterstitialListener = null;
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onDestroy();
        }
    }

    public void onPause() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onPause();
        }
    }

    public void onResume() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onResume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        UnityBannerAd unityBannerAd = new UnityBannerAd();
        this.bannerAd = unityBannerAd;
        unityBannerAd.requestBannerAd(context, mediationBannerListener, bundle, adSize, mediationAdRequest, bundle2);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener2, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener2;
        this.eventAdapter = new C5880b(mediationInterstitialListener2, this);
        String string = bundle.getString(UnityMediationAdapter.KEY_GAME_ID);
        String string2 = bundle.getString(UnityMediationAdapter.KEY_PLACEMENT_ID);
        this.placementId = string2;
        if (!areValidIds(string, string2)) {
            sendAdFailedToLoad(101, "Missing or invalid server parameters.");
            return;
        }
        C5720b m = C5720b.m14062m();
        C3840b bVar = new C3840b(string);
        m.getClass();
        C5720b.m14068s(context, string, bVar);
        UnityAds.load(this.placementId, this.mUnityLoadListener);
    }

    public void showInterstitial() {
        Activity activity;
        WeakReference<Activity> weakReference = C5719a.f18544d.f18545b;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            this.eventAdapter.mo21755a(UnityAdsAdapterUtils.AdEvent.CLOSED);
        } else {
            UnityAds.show(activity, this.placementId, this.mUnityShowListener);
        }
    }
}
