package p849uq;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.MoovitApplication;
import p921xq.C20554a;
import p921xq.C20556b;

/* renamed from: uq.e */
public final class C19981e extends C19979c<AppOpenAd, C20556b> {
    /* renamed from: a */
    public final C20554a mo52269a(boolean z, String str, String str2, String str3, String str4, Object obj) {
        return new C20556b(z, str, str2, str3, str4, (AppOpenAd) obj);
    }

    /* renamed from: b */
    public final Task mo52270b(MoovitApplication moovitApplication, String str, AdManagerAdRequest adManagerAdRequest, CancellationToken cancellationToken) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        AppOpenAd.load((Context) moovitApplication, str, (AdRequest) adManagerAdRequest, 1, (AppOpenAd.AppOpenAdLoadCallback) new C19980d(str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
