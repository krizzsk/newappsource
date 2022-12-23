package p849uq;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.app.ads.loaders.LoadAdException;

/* renamed from: uq.f */
public final class C19982f extends InterstitialAdLoadCallback {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f50819b;

    public C19982f(String str, TaskCompletionSource taskCompletionSource) {
        this.f50819b = taskCompletionSource;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        loadAdError.getMessage();
        this.f50819b.trySetException(new LoadAdException(loadAdError));
    }

    public final void onAdLoaded(Object obj) {
        this.f50819b.trySetResult((InterstitialAd) obj);
    }
}
