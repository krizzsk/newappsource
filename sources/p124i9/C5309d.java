package p124i9;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* renamed from: i9.d */
public final class C5309d extends FullScreenContentCallback {
    @VisibleForTesting

    /* renamed from: b */
    public final AbstractAdViewAdapter f17492b;
    @VisibleForTesting

    /* renamed from: c */
    public final MediationInterstitialListener f17493c;

    public C5309d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f17492b = abstractAdViewAdapter;
        this.f17493c = mediationInterstitialListener;
    }

    public final void onAdDismissedFullScreenContent() {
        this.f17493c.onAdClosed(this.f17492b);
    }

    public final void onAdShowedFullScreenContent() {
        this.f17493c.onAdOpened(this.f17492b);
    }
}
