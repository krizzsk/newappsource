package p211p9;

import android.content.Context;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C23135f0;
import com.vungle.warren.C23258z;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

/* renamed from: p9.e */
public final class C6106e implements MediationRewardedAd, C23258z, C23135f0 {

    /* renamed from: a */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f19375a;

    /* renamed from: b */
    public MediationRewardedAdCallback f19376b;

    /* renamed from: c */
    public AdConfig f19377c;

    /* renamed from: d */
    public String f19378d;

    /* renamed from: e */
    public String f19379e;

    /* renamed from: f */
    public String f19380f;

    public C6106e(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f19375a = mediationAdLoadCallback;
    }

    public final void creativeId(String str) {
    }

    public final void onAdClick(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19376b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    public final void onAdEnd(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19376b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    @Deprecated
    public final void onAdEnd(String str, boolean z, boolean z2) {
    }

    public final void onAdLeftApplication(String str) {
    }

    public final void onAdLoad(String str) {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f19375a;
        if (mediationAdLoadCallback != null) {
            this.f19376b = mediationAdLoadCallback.onSuccess(this);
        }
    }

    public final void onAdRewarded(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19376b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            this.f19376b.onUserEarnedReward(new VungleMediationAdapter.C3851c());
        }
    }

    public final void onAdStart(String str) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19376b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
        }
    }

    public final void onAdViewed(String str) {
        this.f19376b.onVideoStart();
        this.f19376b.reportAdImpression();
    }

    public final void onError(String str, VungleException vungleException) {
        AdError adError = VungleMediationAdapter.getAdError(vungleException);
        String str2 = VungleMediationAdapter.TAG;
        adError.getMessage();
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f19376b;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
            return;
        }
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.f19375a;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    public final void showAd(Context context) {
        Vungle.playAd(this.f19378d, this.f19379e, this.f19377c, this);
    }
}
