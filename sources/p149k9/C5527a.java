package p149k9;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.C2289Ad;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* renamed from: k9.a */
public final class C5527a implements MediationBannerAd, AdListener {

    /* renamed from: a */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f18105a;

    /* renamed from: b */
    public AdView f18106b;

    /* renamed from: c */
    public FrameLayout f18107c;

    /* renamed from: d */
    public MediationBannerAdCallback f18108d;

    public C5527a(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f18105a = mediationAdLoadCallback;
    }

    public final View getView() {
        return this.f18107c;
    }

    public final void onAdClicked(C2289Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18108d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f18108d.onAdOpened();
            this.f18108d.onAdLeftApplication();
        }
    }

    public final void onAdLoaded(C2289Ad ad) {
        this.f18108d = this.f18105a.onSuccess(this);
    }

    public final void onError(C2289Ad ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getMessage();
        this.f18105a.onFailure(adError2);
    }

    public final void onLoggingImpression(C2289Ad ad) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f18108d;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
