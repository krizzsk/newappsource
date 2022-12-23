package androidx.media;

import android.os.Bundle;
import android.support.p015v4.p016os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Objects;

/* renamed from: androidx.media.i */
public final class C1082i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4077b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f4078c;

    /* renamed from: d */
    public final /* synthetic */ ResultReceiver f4079d;

    /* renamed from: e */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4080e;

    public C1082i(MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.f4080e = iVar;
        this.f4077b = kVar;
        this.f4078c = bundle;
        this.f4079d = resultReceiver;
    }

    public final void run() {
        if (MediaBrowserServiceCompat.this.f4023e.getOrDefault(((MediaBrowserServiceCompat.C1072k) this.f4077b).mo4369a(), null) == null) {
            Objects.toString(this.f4078c);
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        ResultReceiver resultReceiver = this.f4079d;
        mediaBrowserServiceCompat.getClass();
        resultReceiver.mo615c(-1, (Bundle) null);
    }
}
