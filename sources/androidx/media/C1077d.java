package androidx.media;

import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.Iterator;
import java.util.List;
import p229r1.C6233c;

/* renamed from: androidx.media.d */
public final class C1077d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4060b;

    /* renamed from: c */
    public final /* synthetic */ String f4061c;

    /* renamed from: d */
    public final /* synthetic */ IBinder f4062d;

    /* renamed from: e */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4063e;

    public C1077d(MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar, String str, IBinder iBinder) {
        this.f4063e = iVar;
        this.f4060b = kVar;
        this.f4061c = str;
        this.f4062d = iBinder;
    }

    public final void run() {
        MediaBrowserServiceCompat.C1059b orDefault = MediaBrowserServiceCompat.this.f4023e.getOrDefault(((MediaBrowserServiceCompat.C1072k) this.f4060b).mo4369a(), null);
        if (orDefault != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            String str = this.f4061c;
            F f = this.f4062d;
            mediaBrowserServiceCompat.getClass();
            if (f == null) {
                orDefault.f4031e.remove(str);
                return;
            }
            List list = orDefault.f4031e.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (f == ((C6233c) it.next()).f19679a) {
                        it.remove();
                    }
                }
                if (list.size() == 0) {
                    orDefault.f4031e.remove(str);
                }
            }
        }
    }
}
