package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;

/* renamed from: androidx.media.f */
public final class C1079f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4067b;

    /* renamed from: c */
    public final /* synthetic */ int f4068c;

    /* renamed from: d */
    public final /* synthetic */ String f4069d;

    /* renamed from: e */
    public final /* synthetic */ int f4070e;

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4071f;

    public C1079f(int i, int i2, Bundle bundle, MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar, String str) {
        this.f4071f = iVar;
        this.f4067b = kVar;
        this.f4068c = i;
        this.f4069d = str;
        this.f4070e = i2;
    }

    public final void run() {
        IBinder a = ((MediaBrowserServiceCompat.C1072k) this.f4067b).mo4369a();
        MediaBrowserServiceCompat.this.f4023e.remove(a);
        Iterator<MediaBrowserServiceCompat.C1059b> it = MediaBrowserServiceCompat.this.f4022d.iterator();
        MediaBrowserServiceCompat.C1059b bVar = null;
        while (it.hasNext()) {
            MediaBrowserServiceCompat.C1059b next = it.next();
            if (next.f4029c == this.f4068c) {
                if (TextUtils.isEmpty(this.f4069d) || this.f4070e <= 0) {
                    bVar = new MediaBrowserServiceCompat.C1059b(next.f4027a, next.f4028b, next.f4029c, this.f4067b);
                }
                it.remove();
            }
        }
        if (bVar == null) {
            bVar = new MediaBrowserServiceCompat.C1059b(this.f4069d, this.f4070e, this.f4068c, this.f4067b);
        }
        MediaBrowserServiceCompat.this.f4023e.put(a, bVar);
        try {
            a.linkToDeath(bVar, 0);
        } catch (RemoteException unused) {
        }
    }
}
