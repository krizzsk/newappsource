package com.moovit.app.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* renamed from: com.moovit.app.ads.b */
public class C14734b extends AdListener {

    /* renamed from: b */
    public AdListener f37500b;

    public final void onAdClicked() {
        super.onAdClicked();
        AdListener adListener = this.f37500b;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    public final void onAdClosed() {
        super.onAdClosed();
        AdListener adListener = this.f37500b;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    public void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        AdListener adListener = this.f37500b;
        if (adListener != null) {
            adListener.onAdFailedToLoad(loadAdError);
        }
    }

    public final void onAdImpression() {
        super.onAdImpression();
        AdListener adListener = this.f37500b;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    public final void onAdLoaded() {
        super.onAdLoaded();
        AdListener adListener = this.f37500b;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    public final void onAdOpened() {
        super.onAdOpened();
        AdListener adListener = this.f37500b;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }
}
