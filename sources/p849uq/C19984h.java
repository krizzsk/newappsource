package p849uq;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.app.ads.C14734b;
import com.moovit.app.ads.loaders.LoadAdException;

/* renamed from: uq.h */
public final class C19984h extends C14734b {

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f50820c;

    public C19984h(String str, TaskCompletionSource taskCompletionSource) {
        this.f50820c = taskCompletionSource;
    }

    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        loadAdError.getMessage();
        this.f50820c.trySetException(new LoadAdException(loadAdError));
    }
}
