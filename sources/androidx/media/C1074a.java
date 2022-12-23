package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;

/* renamed from: androidx.media.a */
public final class C1074a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4048b;

    /* renamed from: c */
    public final /* synthetic */ String f4049c;

    /* renamed from: d */
    public final /* synthetic */ int f4050d;

    /* renamed from: e */
    public final /* synthetic */ int f4051e;

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4052f;

    public C1074a(int i, int i2, Bundle bundle, MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar, String str) {
        this.f4052f = iVar;
        this.f4048b = kVar;
        this.f4049c = str;
        this.f4050d = i;
        this.f4051e = i2;
    }

    public final void run() {
        IBinder a = ((MediaBrowserServiceCompat.C1072k) this.f4048b).mo4369a();
        MediaBrowserServiceCompat.this.f4023e.remove(a);
        MediaBrowserServiceCompat.C1059b bVar = new MediaBrowserServiceCompat.C1059b(this.f4049c, this.f4050d, this.f4051e, this.f4048b);
        MediaBrowserServiceCompat.this.getClass();
        bVar.f4032f = MediaBrowserServiceCompat.this.mo4356a();
        MediaBrowserServiceCompat.this.getClass();
        if (bVar.f4032f == null) {
            Class<C1074a> cls = C1074a.class;
            try {
                MediaBrowserServiceCompat.C1072k kVar = (MediaBrowserServiceCompat.C1072k) this.f4048b;
                kVar.getClass();
                Message obtain = Message.obtain();
                obtain.what = 2;
                obtain.arg1 = 2;
                obtain.setData((Bundle) null);
                kVar.f4046a.send(obtain);
            } catch (RemoteException unused) {
            }
        } else {
            try {
                MediaBrowserServiceCompat.this.f4023e.put(a, bVar);
                a.linkToDeath(bVar, 0);
                MediaBrowserServiceCompat.this.getClass();
            } catch (RemoteException unused2) {
                MediaBrowserServiceCompat.this.f4023e.remove(a);
            }
        }
    }
}
