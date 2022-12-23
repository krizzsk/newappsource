package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import p000a.C0000a;
import p000a.C0003b;
import p241s0.C6313h;
import p253t.C6512d;
import p253t.C6519i;
import p253t.C6523l;

public abstract class CustomTabsService extends Service {

    /* renamed from: b */
    public final C6313h<IBinder, IBinder.DeathRecipient> f1677b = new C6313h<>();

    /* renamed from: c */
    public C0490a f1678c = new C0490a();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    public class C0490a extends C0003b.C0004a {
        public C0490a() {
        }

        /* renamed from: G */
        public static PendingIntent m1356G(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        /* renamed from: H */
        public final boolean mo2224H(C0000a aVar, PendingIntent pendingIntent) {
            try {
                C6519i iVar = new C6519i(this, new C6523l(aVar, pendingIntent));
                synchronized (CustomTabsService.this.f1677b) {
                    aVar.asBinder().linkToDeath(iVar, 0);
                    CustomTabsService.this.f1677b.put(aVar.asBinder(), iVar);
                }
                return CustomTabsService.this.mo2216c();
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* renamed from: f */
        public final boolean mo6f(C6512d dVar) {
            return mo2224H(dVar, (PendingIntent) null);
        }

        /* renamed from: q */
        public final boolean mo7q(long j) {
            return CustomTabsService.this.mo2222i();
        }

        /* renamed from: v */
        public final boolean mo8v(C0000a aVar, Uri uri, Bundle bundle, ArrayList arrayList) {
            CustomTabsService customTabsService = CustomTabsService.this;
            PendingIntent G = m1356G(bundle);
            if (aVar != null || G != null) {
                return customTabsService.mo2215b();
            }
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
    }

    /* renamed from: a */
    public abstract Bundle mo2214a();

    /* renamed from: b */
    public abstract boolean mo2215b();

    /* renamed from: c */
    public abstract boolean mo2216c();

    /* renamed from: d */
    public abstract int mo2217d();

    /* renamed from: e */
    public abstract boolean mo2218e();

    /* renamed from: f */
    public abstract boolean mo2219f();

    /* renamed from: g */
    public abstract boolean mo2220g();

    /* renamed from: h */
    public abstract boolean mo2221h();

    /* renamed from: i */
    public abstract boolean mo2222i();

    public final IBinder onBind(Intent intent) {
        return this.f1678c;
    }
}
