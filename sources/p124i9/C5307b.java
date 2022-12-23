package p124i9;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: i9.b */
public final class C5307b extends AdListener implements AppEventListener, zza {
    @VisibleForTesting

    /* renamed from: b */
    public final AbstractAdViewAdapter f17488b;
    @VisibleForTesting

    /* renamed from: c */
    public final MediationBannerListener f17489c;

    public C5307b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f17488b = abstractAdViewAdapter;
        this.f17489c = mediationBannerListener;
    }

    public final void onAdClicked() {
        this.f17489c.onAdClicked(this.f17488b);
    }

    public final void onAdClosed() {
        this.f17489c.onAdClosed(this.f17488b);
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f17489c.onAdFailedToLoad((MediationBannerAdapter) this.f17488b, (AdError) loadAdError);
    }

    public final void onAdLoaded() {
        this.f17489c.onAdLoaded(this.f17488b);
    }

    public final void onAdOpened() {
        this.f17489c.onAdOpened(this.f17488b);
    }

    public final void onAppEvent(String str, String str2) {
        this.f17489c.zzd(this.f17488b, str, str2);
    }
}
