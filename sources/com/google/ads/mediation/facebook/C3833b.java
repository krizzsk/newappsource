package com.google.ads.mediation.facebook;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.C2289Ad;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.google.ads.mediation.facebook.C3831a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;
import p389bl.C13637c;

/* renamed from: com.google.ads.mediation.facebook.b */
public class C3833b implements MediationRewardedAd, RewardedVideoAdExtendedListener {

    /* renamed from: a */
    public final MediationRewardedAdConfiguration f13284a;

    /* renamed from: b */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f13285b;

    /* renamed from: c */
    public RewardedVideoAd f13286c;

    /* renamed from: d */
    public final AtomicBoolean f13287d = new AtomicBoolean();

    /* renamed from: e */
    public MediationRewardedAdCallback f13288e;

    /* renamed from: f */
    public boolean f13289f = false;

    /* renamed from: g */
    public final AtomicBoolean f13290g = new AtomicBoolean();

    /* renamed from: com.google.ads.mediation.facebook.b$a */
    public class C3834a implements C3831a.C3832a {

        /* renamed from: a */
        public final /* synthetic */ Context f13291a;

        /* renamed from: b */
        public final /* synthetic */ String f13292b;

        public C3834a(Context context, String str) {
            this.f13291a = context;
            this.f13292b = str;
        }

        /* renamed from: a */
        public final void mo15696a(AdError adError) {
            adError.getMessage();
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = C3833b.this.f13285b;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError);
            }
        }

        /* renamed from: b */
        public final void mo15697b() {
            C3833b bVar = C3833b.this;
            Context context = this.f13291a;
            String str = this.f13292b;
            bVar.getClass();
            RewardedVideoAd rewardedVideoAd = new RewardedVideoAd(context, str);
            bVar.f13286c = rewardedVideoAd;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(bVar).withAdExperience(bVar.mo15716a()).build());
        }
    }

    public C3833b(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f13284a = mediationRewardedAdConfiguration;
        this.f13285b = mediationAdLoadCallback;
    }

    /* renamed from: a */
    public AdExperienceType mo15716a() {
        return AdExperienceType.AD_EXPERIENCE_TYPE_REWARDED;
    }

    /* renamed from: b */
    public final void mo15717b() {
        Context context = this.f13284a.getContext();
        String placementID = FacebookMediationAdapter.getPlacementID(this.f13284a.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            this.f13285b.onFailure(adError);
            return;
        }
        String bidResponse = this.f13284a.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.f13289f = true;
        }
        FacebookMediationAdapter.setMixedAudience(this.f13284a);
        if (this.f13289f) {
            this.f13286c = new RewardedVideoAd(context, placementID);
            if (!TextUtils.isEmpty(this.f13284a.getWatermark())) {
                this.f13286c.setExtraHints(new ExtraHints.Builder().mediationData(this.f13284a.getWatermark()).build());
            }
            RewardedVideoAd rewardedVideoAd = this.f13286c;
            rewardedVideoAd.loadAd(rewardedVideoAd.buildLoadAdConfig().withAdListener(this).withBid(bidResponse).withAdExperience(mo15716a()).build());
            return;
        }
        C3831a a = C3831a.m10133a();
        C3834a aVar = new C3834a(context, placementID);
        a.getClass();
        C3831a.m10134b(context, placementID, aVar);
    }

    public final void onAdClicked(C2289Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f13288e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    public final void onAdLoaded(C2289Ad ad) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f13285b;
        if (mediationAdLoadCallback != null) {
            this.f13288e = mediationAdLoadCallback.onSuccess(this);
        }
    }

    public final void onError(C2289Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        if (this.f13287d.get()) {
            adError2.getMessage();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f13288e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError2);
            }
        } else {
            adError2.getMessage();
            MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f13285b;
            if (mediationAdLoadCallback != null) {
                mediationAdLoadCallback.onFailure(adError2);
            }
        }
        this.f13286c.destroy();
    }

    public final void onLoggingImpression(C2289Ad ad) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f13288e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdImpression();
        }
    }

    public final void onRewardedVideoActivityDestroyed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f13290g.getAndSet(true) && (mediationRewardedAdCallback = this.f13288e) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f13286c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    public final void onRewardedVideoClosed() {
        MediationRewardedAdCallback mediationRewardedAdCallback;
        if (!this.f13290g.getAndSet(true) && (mediationRewardedAdCallback = this.f13288e) != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
        RewardedVideoAd rewardedVideoAd = this.f13286c;
        if (rewardedVideoAd != null) {
            rewardedVideoAd.destroy();
        }
    }

    public final void onRewardedVideoCompleted() {
        this.f13288e.onVideoComplete();
        this.f13288e.onUserEarnedReward(new C13637c());
    }

    public final void showAd(Context context) {
        this.f13287d.set(true);
        if (!this.f13286c.show()) {
            AdError adError = new AdError(110, "Failed to present rewarded ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError.getMessage();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f13288e;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
            }
            this.f13286c.destroy();
            return;
        }
        MediationRewardedAdCallback mediationRewardedAdCallback2 = this.f13288e;
        if (mediationRewardedAdCallback2 != null) {
            mediationRewardedAdCallback2.onVideoStart();
            this.f13288e.onAdOpened();
        }
    }
}
