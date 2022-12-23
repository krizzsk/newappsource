package p167m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import p081f3.C4656h;
import p143k3.C5463b;
import p165m1.C5662a;
import p218q3.C6165a;

/* renamed from: m3.e */
public final class C5673e extends C5671d<C5463b> {

    /* renamed from: j */
    public static final /* synthetic */ int f18446j = 0;

    /* renamed from: g */
    public final ConnectivityManager f18447g = ((ConnectivityManager) this.f18440b.getSystemService("connectivity"));

    /* renamed from: h */
    public C5675b f18448h;

    /* renamed from: i */
    public C5674a f18449i;

    /* renamed from: m3.e$a */
    public class C5674a extends BroadcastReceiver {
        public C5674a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C4656h c = C4656h.m11960c();
                int i = C5673e.f18446j;
                c.mo20176a(new Throwable[0]);
                C5673e eVar = C5673e.this;
                eVar.mo21520b(eVar.mo21522e());
            }
        }
    }

    /* renamed from: m3.e$b */
    public class C5675b extends ConnectivityManager.NetworkCallback {
        public C5675b() {
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C4656h c = C4656h.m11960c();
            int i = C5673e.f18446j;
            String.format("Network capabilities changed: %s", new Object[]{networkCapabilities});
            c.mo20176a(new Throwable[0]);
            C5673e eVar = C5673e.this;
            eVar.mo21520b(eVar.mo21522e());
        }

        public final void onLost(Network network) {
            C4656h c = C4656h.m11960c();
            int i = C5673e.f18446j;
            c.mo20176a(new Throwable[0]);
            C5673e eVar = C5673e.this;
            eVar.mo21520b(eVar.mo21522e());
        }
    }

    static {
        C4656h.m11961e("NetworkStateTracker");
    }

    public C5673e(Context context, C6165a aVar) {
        super(context, aVar);
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f18448h = new C5675b();
        } else {
            this.f18449i = new C5674a();
        }
    }

    /* renamed from: a */
    public final Object mo21514a() {
        return mo21522e();
    }

    /* renamed from: c */
    public final void mo21517c() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                C4656h.m11960c().mo20176a(new Throwable[0]);
                this.f18447g.registerDefaultNetworkCallback(this.f18448h);
            } catch (IllegalArgumentException | SecurityException e) {
                C4656h.m11960c().mo20177b(e);
            }
        } else {
            C4656h.m11960c().mo20176a(new Throwable[0]);
            this.f18440b.registerReceiver(this.f18449i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: d */
    public final void mo21518d() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                C4656h.m11960c().mo20176a(new Throwable[0]);
                this.f18447g.unregisterNetworkCallback(this.f18448h);
            } catch (IllegalArgumentException | SecurityException e) {
                C4656h.m11960c().mo20177b(e);
            }
        } else {
            C4656h.m11960c().mo20176a(new Throwable[0]);
            this.f18440b.unregisterReceiver(this.f18449i);
        }
    }

    /* renamed from: e */
    public final C5463b mo21522e() {
        boolean z;
        boolean z2;
        NetworkInfo activeNetworkInfo = this.f18447g.getActiveNetworkInfo();
        boolean z3 = false;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                NetworkCapabilities networkCapabilities = this.f18447g.getNetworkCapabilities(this.f18447g.getActiveNetwork());
                if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                    z2 = true;
                    boolean a = C5662a.m13932a(this.f18447g);
                    if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                        z3 = true;
                    }
                    return new C5463b(z, z2, a, z3);
                }
            } catch (SecurityException e) {
                C4656h.m11960c().mo20177b(e);
            }
        }
        z2 = false;
        boolean a2 = C5662a.m13932a(this.f18447g);
        z3 = true;
        return new C5463b(z, z2, a2, z3);
    }
}
