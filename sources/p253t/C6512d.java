package p253t;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import p000a.C0000a;
import p258t4.C6587a;

/* renamed from: t.d */
public final class C6512d extends C0000a.C0001a {

    /* renamed from: c */
    public Handler f20308c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final /* synthetic */ C6587a f20309d = null;

    /* renamed from: t.d$a */
    public class C6513a implements Runnable {
        public C6513a(Bundle bundle) {
        }

        public final void run() {
            C6512d.this.f20309d.mo22703v();
            throw null;
        }
    }

    /* renamed from: E */
    public final void mo1E(Bundle bundle) throws RemoteException {
        if (this.f20309d != null) {
            this.f20308c.post(new C6513a(bundle));
        }
    }

    /* renamed from: n */
    public final void mo2n(Bundle bundle, String str) throws RemoteException {
        if (this.f20309d != null) {
            this.f20308c.post(new C6514e(this, str, bundle));
        }
    }
}
