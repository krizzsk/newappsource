package p124i9;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: i9.e */
public final class C5310e extends AdListener implements UnifiedNativeAd.OnUnifiedNativeAdLoadedListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener {
    @VisibleForTesting

    /* renamed from: b */
    public final AbstractAdViewAdapter f17494b;
    @VisibleForTesting

    /* renamed from: c */
    public final MediationNativeListener f17495c;

    public C5310e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f17494b = abstractAdViewAdapter;
        this.f17495c = mediationNativeListener;
    }

    public final void onAdClicked() {
        this.f17495c.onAdClicked(this.f17494b);
    }

    public final void onAdClosed() {
        this.f17495c.onAdClosed(this.f17494b);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f17495c.onAdFailedToLoad((MediationNativeAdapter) this.f17494b, (AdError) loadAdError);
    }

    public final void onAdImpression() {
        this.f17495c.onAdImpression(this.f17494b);
    }

    public final void onAdLoaded() {
    }

    public final void onAdOpened() {
        this.f17495c.onAdOpened(this.f17494b);
    }

    public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        this.f17495c.zze(this.f17494b, nativeCustomTemplateAd, str);
    }

    public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
        this.f17495c.zzc(this.f17494b, nativeCustomTemplateAd);
    }

    public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
        this.f17495c.onAdLoaded(this.f17494b, new C5306a(unifiedNativeAd));
    }
}
