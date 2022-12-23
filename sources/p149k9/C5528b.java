package p149k9;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.C2289Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: k9.b */
public final class C5528b implements MediationInterstitialAd, InterstitialAdExtendedListener {

    /* renamed from: a */
    public final MediationInterstitialAdConfiguration f18109a;

    /* renamed from: b */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f18110b;

    /* renamed from: c */
    public InterstitialAd f18111c;

    /* renamed from: d */
    public MediationInterstitialAdCallback f18112d;

    /* renamed from: e */
    public final AtomicBoolean f18113e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f18114f = new AtomicBoolean();

    public C5528b(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f18109a = mediationInterstitialAdConfiguration;
        this.f18110b = mediationAdLoadCallback;
    }

    public final void onAdClicked(C2289Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18112d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.f18112d.onAdLeftApplication();
        }
    }

    public final void onAdLoaded(C2289Ad ad) {
        this.f18112d = this.f18110b.onSuccess(this);
    }

    public final void onError(C2289Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getMessage();
        if (this.f18113e.get()) {
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18112d;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdOpened();
                this.f18112d.onAdClosed();
                return;
            }
            return;
        }
        this.f18110b.onFailure(adError2);
    }

    public final void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (!this.f18114f.getAndSet(true) && (mediationInterstitialAdCallback = this.f18112d) != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    public final void onInterstitialDismissed(C2289Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (!this.f18114f.getAndSet(true) && (mediationInterstitialAdCallback = this.f18112d) != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    public final void onInterstitialDisplayed(C2289Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18112d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    public final void onLoggingImpression(C2289Ad ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18112d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    public final void onRewardedAdCompleted() {
    }

    public final void onRewardedAdServerFailed() {
    }

    public final void onRewardedAdServerSucceeded() {
    }

    public final void showAd(Context context) {
        this.f18113e.set(true);
        if (!this.f18111c.show()) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", FacebookMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f18112d;
            if (mediationInterstitialAdCallback != null) {
                mediationInterstitialAdCallback.onAdFailedToShow(adError);
            }
        }
    }
}
