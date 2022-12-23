package p849uq;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.app.ads.loaders.LoadAdException;

/* renamed from: uq.d */
public final class C19980d extends AppOpenAd.AppOpenAdLoadCallback {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f50818b;

    public C19980d(String str, TaskCompletionSource taskCompletionSource) {
        this.f50818b = taskCompletionSource;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        loadAdError.getMessage();
        this.f50818b.trySetException(new LoadAdException(loadAdError));
    }

    public final void onAdLoaded(Object obj) {
        this.f50818b.trySetResult((AppOpenAd) obj);
    }
}
