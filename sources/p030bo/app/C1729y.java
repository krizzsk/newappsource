package p030bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import com.appboy.support.AppboyLogger;
import com.appboy.support.HandlerUtils;
import com.braze.Braze;
import java.util.concurrent.TimeUnit;
import p244s3.C6426a;
import p244s3.C6427b;
import p244s3.C6429d;
import p244s3.C6436k;
import p244s3.C6450y;
import p304x.C7116x;

/* renamed from: bo.app.y */
public class C1729y {

    /* renamed from: o */
    public static final String f6084o = AppboyLogger.getBrazeLogTag(C1729y.class);

    /* renamed from: a */
    public final Context f6085a;

    /* renamed from: b */
    public final C1722x f6086b;

    /* renamed from: c */
    public BroadcastReceiver f6087c;

    /* renamed from: d */
    public ConnectivityManager.NetworkCallback f6088d;

    /* renamed from: e */
    public final Handler f6089e;

    /* renamed from: f */
    public final Runnable f6090f;

    /* renamed from: g */
    public final C1681r3 f6091g = new C1681r3((int) TimeUnit.MINUTES.toMillis(5));

    /* renamed from: h */
    public C1572f0 f6092h = C1572f0.NO_SESSION;

    /* renamed from: i */
    public long f6093i = -1;

    /* renamed from: j */
    public boolean f6094j;

    /* renamed from: k */
    public volatile boolean f6095k = false;

    /* renamed from: l */
    public ConnectivityManager f6096l;

    /* renamed from: m */
    public C1563e0 f6097m = C1563e0.NONE;

    /* renamed from: n */
    public int f6098n = 0;

    /* renamed from: bo.app.y$a */
    public class C1730a extends ConnectivityManager.NetworkCallback {
        public C1730a() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            C1729y.this.mo6460a(networkCapabilities);
        }

        public void onLost(Network network) {
            super.onLost(network);
            Network f = C1729y.this.f6096l.getActiveNetwork();
            C1729y yVar = C1729y.this;
            yVar.mo6460a(yVar.f6096l.getNetworkCapabilities(f));
        }
    }

    /* renamed from: bo.app.y$b */
    public class C1731b extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C1600i0 f6100a;

        public C1731b(C1600i0 i0Var) {
            this.f6100a = i0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m4937a(Intent intent, C1600i0 i0Var, BroadcastReceiver.PendingResult pendingResult) {
            try {
                C1729y yVar = C1729y.this;
                C1563e0 unused = yVar.f6097m = C1596h4.m4299a(intent, yVar.f6096l);
                C1729y.this.mo6466d();
            } catch (Exception e) {
                AppboyLogger.m5452e(C1729y.f6084o, "Failed to process connectivity event.", e);
                C1729y.this.mo6462a(i0Var, (Throwable) e);
            }
            pendingResult.finish();
        }

        public void onReceive(Context context, Intent intent) {
            Intent intent2 = intent;
            new Thread(new C7116x(this, intent2, this.f6100a, goAsync(), 2)).start();
        }
    }

    /* renamed from: bo.app.y$c */
    public class C1732c implements Runnable {
        public C1732c() {
        }

        public void run() {
            String a = C1729y.f6084o;
            StringBuilder k = C13555b.m33972k("Requesting immediate data flush. Current data flush interval: ");
            k.append(C1729y.this.f6093i);
            k.append(" ms");
            AppboyLogger.m5457v(a, k.toString());
            Braze.getInstance(C1729y.this.f6085a).requestImmediateDataFlush();
            if (C1729y.this.f6093i > 0) {
                C1729y.this.f6089e.postDelayed(this, C1729y.this.f6093i);
                return;
            }
            String a2 = C1729y.f6084o;
            StringBuilder k2 = C13555b.m33972k("Data flush interval is ");
            k2.append(C1729y.this.f6093i);
            k2.append(" . Not scheduling a proceeding data flush.");
            AppboyLogger.m5448d(a2, k2.toString());
        }
    }

    /* renamed from: bo.app.y$d */
    public static /* synthetic */ class C1733d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6103a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                bo.app.e0[] r0 = p030bo.app.C1563e0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6103a = r0
                bo.app.e0 r1 = p030bo.app.C1563e0.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6103a     // Catch:{ NoSuchFieldError -> 0x001d }
                bo.app.e0 r1 = p030bo.app.C1563e0.BAD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6103a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bo.app.e0 r1 = p030bo.app.C1563e0.GREAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6103a     // Catch:{ NoSuchFieldError -> 0x0033 }
                bo.app.e0 r1 = p030bo.app.C1563e0.GOOD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1729y.C1733d.<clinit>():void");
        }
    }

    public C1729y(Context context, C1600i0 i0Var, C1722x xVar) {
        this.f6085a = context;
        this.f6086b = xVar;
        this.f6089e = HandlerUtils.createHandler();
        this.f6090f = mo6465c();
        this.f6096l = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6088d = new C1730a();
        } else {
            this.f6087c = new C1731b(i0Var);
        }
        mo6461a(i0Var);
    }

    /* renamed from: e */
    public void mo6467e() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6096l.registerDefaultNetworkCallback(this.f6088d);
            mo6460a(this.f6096l.getNetworkCapabilities(this.f6096l.getActiveNetwork()));
            return;
        }
        this.f6085a.registerReceiver(this.f6087c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: f */
    public synchronized boolean mo6468f() {
        if (this.f6095k) {
            AppboyLogger.m5448d(f6084o, "The data sync policy is already running. Ignoring request.");
            return false;
        }
        AppboyLogger.m5448d(f6084o, "Data sync started");
        mo6467e();
        mo6459a(this.f6093i);
        this.f6095k = true;
        return true;
    }

    /* renamed from: g */
    public synchronized boolean mo6469g() {
        if (!this.f6095k) {
            AppboyLogger.m5448d(f6084o, "The data sync policy is not running. Ignoring request.");
            return false;
        }
        AppboyLogger.m5448d(f6084o, "Data sync stopped");
        mo6464b();
        mo6470h();
        this.f6095k = false;
        return true;
    }

    /* renamed from: h */
    public void mo6470h() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f6096l.unregisterNetworkCallback(this.f6088d);
            } else {
                this.f6085a.unregisterReceiver(this.f6087c);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(f6084o, "Failed to unregister Connectivity callback", e);
        }
    }

    /* renamed from: b */
    public final void mo6464b() {
        this.f6089e.removeCallbacks(this.f6090f);
    }

    /* renamed from: c */
    public final Runnable mo6465c() {
        return new C1732c();
    }

    /* renamed from: d */
    public void mo6466d() {
        long j = this.f6093i;
        if (this.f6092h == C1572f0.NO_SESSION || this.f6094j || this.f6098n >= 50) {
            this.f6093i = -1;
        } else {
            int i = C1733d.f6103a[this.f6097m.ordinal()];
            if (i == 1) {
                this.f6093i = -1;
            } else if (i == 2) {
                this.f6093i = this.f6086b.mo6446a();
            } else if (i != 3) {
                this.f6093i = this.f6086b.mo6447b();
            } else {
                this.f6093i = this.f6086b.mo6448c();
            }
        }
        if (j != this.f6093i) {
            String str = f6084o;
            StringBuilder g = C16759e.m42351g("Data flush interval has changed from ", j, " ms to ");
            g.append(this.f6093i);
            g.append(" ms after connectivity state change to: ");
            g.append(this.f6097m);
            g.append(" and session state: ");
            g.append(this.f6092h);
            AppboyLogger.m5448d(str, g.toString());
            mo6459a(this.f6093i);
        }
    }

    /* renamed from: a */
    public synchronized void mo6463a(boolean z) {
        this.f6094j = z;
        mo6466d();
        if (z) {
            mo6469g();
        } else {
            mo6468f();
        }
    }

    /* renamed from: a */
    public final void mo6462a(C1600i0 i0Var, Throwable th) {
        try {
            i0Var.mo6134a(th, Throwable.class);
        } catch (Exception e) {
            AppboyLogger.m5452e(f6084o, "Failed to log throwable.", e);
        }
    }

    /* renamed from: a */
    public final void mo6459a(long j) {
        mo6464b();
        if (this.f6093i > 0) {
            String str = f6084o;
            AppboyLogger.m5448d(str, "Posting new sync runnable with delay " + j + " ms");
            this.f6089e.removeCallbacks(this.f6090f);
            this.f6089e.postDelayed(this.f6090f, j + this.f6093i);
        }
    }

    /* renamed from: a */
    public final void mo6460a(NetworkCapabilities networkCapabilities) {
        this.f6097m = C1596h4.m4300a(networkCapabilities);
        String str = f6084o;
        StringBuilder k = C13555b.m33972k("Capability change event mapped to network level: ");
        k.append(this.f6097m);
        k.append(" on capabilities: ");
        k.append(networkCapabilities);
        AppboyLogger.m5457v(str, k.toString());
        mo6466d();
    }

    /* renamed from: a */
    public void mo6461a(C1600i0 i0Var) {
        i0Var.mo6137b(new C6436k(this, 1), C1692t0.class);
        i0Var.mo6137b(new C6427b(this, 1), C1699u0.class);
        i0Var.mo6137b(new C6426a(this, 2), C1649o0.class);
        i0Var.mo6137b(new C6450y(this, 0), C1659p0.class);
        i0Var.mo6137b(new C6429d(this, 2), C1521a.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4913a(C1692t0 t0Var) {
        this.f6092h = C1572f0.OPEN_SESSION;
        this.f6098n = 0;
        mo6466d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4914a(C1699u0 u0Var) {
        this.f6092h = C1572f0.NO_SESSION;
        mo6466d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4911a(C1649o0 o0Var) {
        AppboyLogger.m5448d(f6084o, "Received network error event. Backing off.");
        long j = this.f6093i;
        mo6459a(j + ((long) this.f6091g.mo6347a((int) j)));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4912a(C1659p0 p0Var) {
        if (this.f6091g.mo6348b()) {
            this.f6091g.mo6349c();
            String str = f6084o;
            StringBuilder k = C13555b.m33972k("Received successful request flush. Default flush interval reset to ");
            k.append(this.f6093i);
            AppboyLogger.m5448d(str, k.toString());
            mo6459a(this.f6093i);
        }
        this.f6098n = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4910a(C1521a aVar) {
        if (aVar.mo5861a() instanceof C1591h) {
            this.f6098n++;
            mo6466d();
        }
    }
}
