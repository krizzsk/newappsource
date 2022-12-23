package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import p185n9.C5882c;

/* renamed from: com.google.ads.mediation.unity.a */
public final class C3846a implements MediationRewardedAd {

    /* renamed from: a */
    public MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f13326a;

    /* renamed from: b */
    public MediationRewardedAdCallback f13327b;

    /* renamed from: c */
    public String f13328c;

    /* renamed from: d */
    public C5882c f13329d;

    /* renamed from: e */
    public final C3847a f13330e = new C3847a();

    /* renamed from: f */
    public final C3848b f13331f = new C3848b();

    /* renamed from: com.google.ads.mediation.unity.a$a */
    public class C3847a implements IUnityAdsLoadListener {
        public C3847a() {
        }

        public final void onUnityAdsAdLoaded(String str) {
            String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", new Object[]{str});
            C3846a aVar = C3846a.this;
            aVar.f13328c = str;
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = aVar.f13326a;
            if (mediationAdLoadCallback != null) {
                MediationRewardedAdCallback onSuccess = mediationAdLoadCallback.onSuccess(aVar);
                aVar.f13327b = onSuccess;
                aVar.f13329d = new C5882c(onSuccess);
            }
        }

        public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            C3846a.this.f13328c = str;
            C3846a.this.mo15731a(UnityAdsAdapterUtils.m10144c(unityAdsLoadError, str2));
        }
    }

    /* renamed from: com.google.ads.mediation.unity.a$b */
    public class C3848b implements IUnityAdsShowListener {
        public C3848b() {
        }

        public final void onUnityAdsShowClick(String str) {
            C3846a.this.f13329d.mo21756a(UnityAdsAdapterUtils.AdEvent.CLICKED);
        }

        public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                C3846a.this.f13329d.mo21756a(UnityAdsAdapterUtils.AdEvent.VIDEO_COMPLETE);
                C3846a.this.f13329d.mo21756a(UnityAdsAdapterUtils.AdEvent.REWARD);
            }
            C3846a.this.f13329d.mo21756a(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            if (C3846a.this.f13327b != null) {
                C3846a.this.f13327b.onAdFailedToShow(UnityAdsAdapterUtils.m10145d(unityAdsShowError, str2));
            }
        }

        public final void onUnityAdsShowStart(String str) {
            C3846a.this.f13329d.mo21756a(UnityAdsAdapterUtils.AdEvent.OPENED);
            C3846a.this.f13329d.mo21756a(UnityAdsAdapterUtils.AdEvent.IMPRESSION);
            C3846a.this.f13329d.mo21756a(UnityAdsAdapterUtils.AdEvent.VIDEO_START);
        }
    }

    /* renamed from: a */
    public final void mo15731a(AdError adError) {
        adError.toString();
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f13326a;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    public final void showAd(Context context) {
        if (!(context instanceof Activity)) {
            AdError a = UnityAdsAdapterUtils.m10142a(105, "Unity Ads requires an Activity context to show ads.");
            a.toString();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f13327b;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(a);
                return;
            }
            return;
        }
        UnityAds.show((Activity) context, this.f13328c, (IUnityAdsShowListener) this.f13331f);
    }
}
