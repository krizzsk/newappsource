package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.g */
public final class C1080g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4072b;

    /* renamed from: c */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4073c;

    public C1080g(MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar) {
        this.f4073c = iVar;
        this.f4072b = kVar;
    }

    public final void run() {
        IBinder a = ((MediaBrowserServiceCompat.C1072k) this.f4072b).mo4369a();
        MediaBrowserServiceCompat.C1059b remove = MediaBrowserServiceCompat.this.f4023e.remove(a);
        if (remove != null) {
            a.unlinkToDeath(remove, 0);
        }
    }
}
