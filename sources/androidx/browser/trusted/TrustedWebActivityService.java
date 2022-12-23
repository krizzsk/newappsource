package androidx.browser.trusted;

import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import p018b.C1423b;
import p266u.C6673b;

public abstract class TrustedWebActivityService extends Service {

    /* renamed from: b */
    public NotificationManager f1681b;

    /* renamed from: c */
    public int f1682c = -1;

    /* renamed from: d */
    public final C0492a f1683d = new C0492a();

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    public class C0492a extends C1423b {
        public C0492a() {
        }

        /* renamed from: G */
        public final void mo2232G() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            if (trustedWebActivityService.f1682c == -1) {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.mo2227c().load();
                TrustedWebActivityService.this.getPackageManager();
            }
            if (TrustedWebActivityService.this.f1682c != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }
    }

    /* renamed from: a */
    public static String m1361a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    /* renamed from: b */
    public final void mo2226b() {
        if (this.f1681b == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    /* renamed from: c */
    public abstract C6673b mo2227c();

    /* renamed from: d */
    public final int mo2228d() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), RecyclerView.C1119a0.FLAG_IGNORE).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f1683d;
    }

    public final void onCreate() {
        super.onCreate();
        this.f1681b = (NotificationManager) getSystemService("notification");
    }

    public final boolean onUnbind(Intent intent) {
        this.f1682c = -1;
        return super.onUnbind(intent);
    }
}
