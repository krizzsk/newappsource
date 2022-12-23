package p124i9;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: i9.c */
public final class C5308c extends InterstitialAdLoadCallback {
    @VisibleForTesting

    /* renamed from: b */
    public final AbstractAdViewAdapter f17490b;
    @VisibleForTesting

    /* renamed from: c */
    public final MediationInterstitialListener f17491c;

    public C5308c(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f17490b = abstractAdViewAdapter;
        this.f17491c = mediationInterstitialListener;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f17491c.onAdFailedToLoad((MediationInterstitialAdapter) this.f17490b, (AdError) loadAdError);
    }

    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        InterstitialAd interstitialAd = (InterstitialAd) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f17490b;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd;
        interstitialAd.setFullScreenContentCallback(new C5309d(abstractAdViewAdapter, this.f17491c));
        this.f17491c.onAdLoaded(this.f17490b);
    }
}
