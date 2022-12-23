package androidx.media;

import android.os.Bundle;
import android.support.p015v4.p016os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.h */
public final class C1081h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4074b;

    /* renamed from: c */
    public final /* synthetic */ ResultReceiver f4075c;

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4076d;

    public C1081h(MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f4076d = iVar;
        this.f4074b = kVar;
        this.f4075c = resultReceiver;
    }

    public final void run() {
        if (MediaBrowserServiceCompat.this.f4023e.getOrDefault(((MediaBrowserServiceCompat.C1072k) this.f4074b).mo4369a(), null) != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ResultReceiver resultReceiver = this.f4075c;
            mediaBrowserServiceCompat.getClass();
            resultReceiver.mo615c(-1, (Bundle) null);
        }
    }
}
