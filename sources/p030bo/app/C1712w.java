package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.concurrent.ThreadFactory;
import p244s3.C6449x;

/* renamed from: bo.app.w */
public class C1712w implements C1522a0 {

    /* renamed from: j */
    public static final String f6041j = AppboyLogger.getBrazeLogTag(C1712w.class);

    /* renamed from: a */
    public final BrazeConfigurationProvider f6042a;

    /* renamed from: b */
    public final C1636m3 f6043b;

    /* renamed from: c */
    public final C1740z f6044c;

    /* renamed from: d */
    public final Object f6045d = new Object();

    /* renamed from: e */
    public final C1595h3 f6046e;

    /* renamed from: f */
    public volatile boolean f6047f = false;

    /* renamed from: g */
    public volatile Thread f6048g;

    /* renamed from: h */
    public volatile boolean f6049h = true;

    /* renamed from: i */
    public boolean f6050i;

    /* renamed from: bo.app.w$a */
    public static /* synthetic */ class C1713a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6051a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                bo.app.b1$c[] r0 = p030bo.app.C1531b1.C1534c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6051a = r0
                bo.app.b1$c r1 = p030bo.app.C1531b1.C1534c.ADD_PENDING_BRAZE_EVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6051a     // Catch:{ NoSuchFieldError -> 0x001d }
                bo.app.b1$c r1 = p030bo.app.C1531b1.C1534c.ADD_BRAZE_EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6051a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bo.app.b1$c r1 = p030bo.app.C1531b1.C1534c.FLUSH_PENDING_BRAZE_EVENTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6051a     // Catch:{ NoSuchFieldError -> 0x0033 }
                bo.app.b1$c r1 = p030bo.app.C1531b1.C1534c.ADD_REQUEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1712w.C1713a.<clinit>():void");
        }
    }

    /* renamed from: bo.app.w$b */
    public class C1714b implements Runnable {
        public C1714b() {
        }

        public void run() {
            while (C1712w.this.f6049h) {
                try {
                    C1712w.this.mo6424a(C1712w.this.f6044c.mo6495e());
                } catch (InterruptedException e) {
                    String a = C1712w.f6041j;
                    StringBuilder k = C13555b.m33972k("Automatic thread interrupted! This is usually the result of calling changeUser(). [");
                    k.append(e.toString());
                    k.append("]");
                    AppboyLogger.m5459w(a, k.toString());
                }
            }
        }

        public /* synthetic */ C1714b(C1712w wVar, C1713a aVar) {
            this();
        }
    }

    public C1712w(BrazeConfigurationProvider brazeConfigurationProvider, C1600i0 i0Var, C1636m3 m3Var, C1740z zVar, ThreadFactory threadFactory, boolean z) {
        this.f6042a = brazeConfigurationProvider;
        this.f6043b = m3Var;
        this.f6044c = zVar;
        this.f6048g = threadFactory.newThread(new C1714b(this, (C1713a) null));
        this.f6046e = new C1595h3(i0Var);
        this.f6050i = z;
        i0Var.mo6137b(new C6449x(this, i0Var), C1531b1.class);
    }

    /* renamed from: c */
    public void mo6429c() {
        synchronized (this.f6045d) {
            if (this.f6047f) {
                AppboyLogger.m5448d(f6041j, "Automatic request execution start was previously requested, continuing without action.");
                return;
            }
            if (this.f6048g != null) {
                this.f6048g.start();
            }
            this.f6047f = true;
        }
    }

    /* renamed from: b */
    public void mo6427b(C1594h2 h2Var) {
        this.f6044c.mo6491b(h2Var);
    }

    /* renamed from: b */
    public final C1586g3 mo6426b() {
        return new C1586g3(this.f6042a.getBaseUrlForRequests());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m4841a(C1600i0 i0Var, C1531b1 b1Var) {
        int i = C1713a.f6051a[b1Var.f5524a.ordinal()];
        if (i == 1) {
            mo6427b(b1Var.f5525b);
        } else if (i == 2) {
            mo5862a(b1Var.f5525b);
        } else if (i == 3) {
            mo6425a(b1Var.f5526c);
        } else if (i == 4) {
            mo6423a(i0Var, b1Var.f5527d);
        } else {
            StringBuilder k = C13555b.m33972k("Unexpected value: ");
            k.append(b1Var.f5524a);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: b */
    public final void mo6428b(C1620k3 k3Var) {
        if (k3Var.mo5997j() || this.f6050i) {
            this.f6046e.mo6148b(k3Var);
        } else {
            this.f6043b.mo6148b(k3Var);
        }
    }

    /* renamed from: a */
    public void mo5862a(C1594h2 h2Var) {
        this.f6044c.mo5862a(h2Var);
    }

    /* renamed from: a */
    public void mo6423a(C1600i0 i0Var, C1620k3 k3Var) {
        this.f6044c.mo6487a(i0Var, k3Var);
    }

    /* renamed from: a */
    public void mo6425a(C1627l2 l2Var) {
        this.f6044c.mo6489a(l2Var);
    }

    /* renamed from: a */
    public void mo6422a(C1600i0 i0Var) {
        synchronized (this.f6045d) {
            this.f6049h = false;
            this.f6048g.interrupt();
            this.f6048g = null;
        }
        if (!this.f6044c.mo6492b()) {
            this.f6044c.mo6487a(i0Var, mo6426b());
        }
        C1620k3 d = this.f6044c.mo6494d();
        if (d != null) {
            mo6428b(d);
        }
        i0Var.mo6131a();
    }

    /* renamed from: a */
    public final void mo6424a(C1620k3 k3Var) {
        if (k3Var.mo5997j() || this.f6050i) {
            this.f6046e.mo6147a(k3Var);
        } else {
            this.f6043b.mo6147a(k3Var);
        }
    }
}
