package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p015v4.p016os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.e */
public final class C1078e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4064b;

    /* renamed from: c */
    public final /* synthetic */ ResultReceiver f4065c;

    /* renamed from: d */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4066d;

    public C1078e(MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar, String str, ResultReceiver resultReceiver) {
        this.f4066d = iVar;
        this.f4064b = kVar;
        this.f4065c = resultReceiver;
    }

    public final void run() {
        if (MediaBrowserServiceCompat.this.f4023e.getOrDefault(((MediaBrowserServiceCompat.C1072k) this.f4064b).mo4369a(), null) != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ResultReceiver resultReceiver = this.f4065c;
            mediaBrowserServiceCompat.getClass();
            if (true && true) {
                resultReceiver.mo615c(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", (Parcelable) null);
            resultReceiver.mo615c(0, bundle);
        }
    }
}
