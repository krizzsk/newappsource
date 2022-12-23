package androidx.media;

import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.b */
public final class C1075b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4053b;

    /* renamed from: c */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4054c;

    public C1075b(MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar) {
        this.f4054c = iVar;
        this.f4053b = kVar;
    }

    public final void run() {
        MediaBrowserServiceCompat.C1059b remove = MediaBrowserServiceCompat.this.f4023e.remove(((MediaBrowserServiceCompat.C1072k) this.f4053b).mo4369a());
        if (remove != null) {
            ((MediaBrowserServiceCompat.C1072k) remove.f4030d).mo4369a().unlinkToDeath(remove, 0);
        }
    }
}
