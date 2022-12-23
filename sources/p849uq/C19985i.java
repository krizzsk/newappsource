package p849uq;

import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.C14766z;
import com.moovit.commons.utils.C15780a;
import p041ca.C1825k;
import p921xq.C20554a;
import p921xq.C20558d;

/* renamed from: uq.i */
public final class C19985i extends C19979c<C14766z, C20558d> {
    /* renamed from: a */
    public final C20554a mo52269a(boolean z, String str, String str2, String str3, String str4, Object obj) {
        return new C20558d(z, str, str2, str3, str4, (C14766z) obj);
    }

    /* renamed from: b */
    public final Task mo52270b(MoovitApplication moovitApplication, String str, AdManagerAdRequest adManagerAdRequest, CancellationToken cancellationToken) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        C19984h hVar = new C19984h(str, taskCompletionSource);
        new AdLoader.Builder(moovitApplication, str).forNativeAd(new C1825k(str, taskCompletionSource, hVar)).withAdListener(hVar).withNativeAdOptions(new NativeAdOptions.Builder().setAdChoicesPlacement(C15780a.m40268a(moovitApplication) ^ true ? 1 : 0).build()).build().loadAd((AdRequest) adManagerAdRequest);
        return taskCompletionSource.getTask();
    }
}
