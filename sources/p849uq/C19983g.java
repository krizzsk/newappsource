package p849uq;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.MoovitApplication;
import p921xq.C20554a;
import p921xq.C20557c;

/* renamed from: uq.g */
public final class C19983g extends C19979c<InterstitialAd, C20557c> {
    /* renamed from: a */
    public final C20554a mo52269a(boolean z, String str, String str2, String str3, String str4, Object obj) {
        return new C20557c(z, str, str2, str3, str4, (InterstitialAd) obj);
    }

    /* renamed from: b */
    public final Task mo52270b(MoovitApplication moovitApplication, String str, AdManagerAdRequest adManagerAdRequest, CancellationToken cancellationToken) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        InterstitialAd.load(moovitApplication, str, adManagerAdRequest, new C19982f(str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
