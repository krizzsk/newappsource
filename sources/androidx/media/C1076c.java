package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;
import p229r1.C6233c;
import p583jk.C17884p;

/* renamed from: androidx.media.c */
public final class C1076c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MediaBrowserServiceCompat.C1071j f4055b;

    /* renamed from: c */
    public final /* synthetic */ String f4056c;

    /* renamed from: d */
    public final /* synthetic */ IBinder f4057d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f4058e;

    /* renamed from: f */
    public final /* synthetic */ MediaBrowserServiceCompat.C1070i f4059f;

    public C1076c(MediaBrowserServiceCompat.C1070i iVar, MediaBrowserServiceCompat.C1072k kVar, String str, IBinder iBinder, Bundle bundle) {
        this.f4059f = iVar;
        this.f4055b = kVar;
        this.f4056c = str;
        this.f4057d = iBinder;
        this.f4058e = bundle;
    }

    public final void run() {
        MediaBrowserServiceCompat.C1059b orDefault = MediaBrowserServiceCompat.this.f4023e.getOrDefault(((MediaBrowserServiceCompat.C1072k) this.f4055b).mo4369a(), null);
        if (orDefault != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            String str = this.f4056c;
            F f = this.f4057d;
            Bundle bundle = this.f4058e;
            mediaBrowserServiceCompat.getClass();
            List<C6233c> list = orDefault.f4031e.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            for (C6233c cVar : list) {
                if (f == cVar.f19679a && C17884p.m44364e(bundle, (Bundle) cVar.f19680b)) {
                    return;
                }
            }
            list.add(new C6233c(f, bundle));
            orDefault.f4031e.put(str, list);
            if (bundle == null) {
                mediaBrowserServiceCompat.mo4357b();
            } else {
                mediaBrowserServiceCompat.mo4357b();
            }
            throw new IllegalStateException(C13715c.m34245k(C13555b.m33972k("onLoadChildren must call detach() or sendResult() before returning for package="), orDefault.f4027a, " id=", str));
        }
    }
}
