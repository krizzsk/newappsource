package p160l9;

import android.app.Activity;
import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* renamed from: l9.j */
public final class C5651j implements MediationRewardedAd {

    /* renamed from: a */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f18404a;

    /* renamed from: b */
    public MediationRewardedAdCallback f18405b;

    /* renamed from: c */
    public InneractiveAdSpot f18406c;

    /* renamed from: d */
    public InneractiveFullscreenUnitController f18407d;

    public C5651j(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f18404a = mediationAdLoadCallback;
    }

    public final void showAd(Context context) {
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(107, "Cannot show a rewarded ad without an activity context.", FyberMediationAdapter.ERROR_DOMAIN);
            InneractiveMediationName inneractiveMediationName = FyberMediationAdapter.f13294g;
            adError.getMessage();
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f18405b;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f18406c;
        if (inneractiveAdSpot != null && this.f18407d != null && inneractiveAdSpot.isReady()) {
            this.f18407d.show((Activity) context);
        } else if (this.f18405b != null) {
            AdError adError2 = new AdError(106, "Fyber's rewarded spot is not ready.", FyberMediationAdapter.ERROR_DOMAIN);
            InneractiveMediationName inneractiveMediationName2 = FyberMediationAdapter.f13294g;
            adError2.getMessage();
            this.f18405b.onAdFailedToShow(adError2);
        }
    }
}
