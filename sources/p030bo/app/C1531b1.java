package p030bo.app;

import com.appboy.support.AppboyLogger;

/* renamed from: bo.app.b1 */
public class C1531b1 {

    /* renamed from: e */
    public static final String f5523e = AppboyLogger.getBrazeLogTag(C1531b1.class);

    /* renamed from: a */
    public final C1534c f5524a;

    /* renamed from: b */
    public C1594h2 f5525b;

    /* renamed from: c */
    public C1627l2 f5526c;

    /* renamed from: d */
    public C1620k3 f5527d;

    /* renamed from: bo.app.b1$a */
    public static /* synthetic */ class C1532a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5528a;

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
                f5528a = r0
                bo.app.b1$c r1 = p030bo.app.C1531b1.C1534c.ADD_PENDING_BRAZE_EVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5528a     // Catch:{ NoSuchFieldError -> 0x001d }
                bo.app.b1$c r1 = p030bo.app.C1531b1.C1534c.ADD_BRAZE_EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5528a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bo.app.b1$c r1 = p030bo.app.C1531b1.C1534c.FLUSH_PENDING_BRAZE_EVENTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5528a     // Catch:{ NoSuchFieldError -> 0x0033 }
                bo.app.b1$c r1 = p030bo.app.C1531b1.C1534c.ADD_REQUEST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1531b1.C1532a.<clinit>():void");
        }
    }

    /* renamed from: bo.app.b1$b */
    public static class C1533b {

        /* renamed from: a */
        public final C1534c f5529a;

        /* renamed from: b */
        public C1594h2 f5530b;

        /* renamed from: c */
        public C1627l2 f5531c;

        /* renamed from: d */
        public C1620k3 f5532d;

        public C1533b(C1534c cVar) {
            this.f5529a = cVar;
        }

        /* renamed from: a */
        public C1533b mo5908a(C1594h2 h2Var) {
            this.f5530b = h2Var;
            return this;
        }

        /* renamed from: a */
        public C1533b mo5910a(C1627l2 l2Var) {
            this.f5531c = l2Var;
            return this;
        }

        /* renamed from: a */
        public C1533b mo5909a(C1620k3 k3Var) {
            this.f5532d = k3Var;
            return this;
        }

        /* renamed from: a */
        public C1531b1 mo5911a() {
            return new C1531b1(this.f5529a, this.f5530b, this.f5531c, this.f5532d, (C1532a) null);
        }
    }

    /* renamed from: bo.app.b1$c */
    public enum C1534c {
        ADD_PENDING_BRAZE_EVENT,
        ADD_BRAZE_EVENT,
        FLUSH_PENDING_BRAZE_EVENTS,
        ADD_REQUEST
    }

    public /* synthetic */ C1531b1(C1534c cVar, C1594h2 h2Var, C1627l2 l2Var, C1620k3 k3Var, C1532a aVar) {
        this(cVar, h2Var, l2Var, k3Var);
    }

    public C1531b1(C1534c cVar, C1594h2 h2Var, C1627l2 l2Var, C1620k3 k3Var) {
        this.f5524a = cVar;
        this.f5525b = h2Var;
        this.f5526c = l2Var;
        this.f5527d = k3Var;
        if (cVar != null) {
            int i = C1532a.f5528a[cVar.ordinal()];
            if (i == 1 || i == 2) {
                if (this.f5525b == null) {
                    throw new IllegalStateException("This command type requires an IAppboyEvent present: " + cVar);
                }
            } else if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("Unexpected command type: " + cVar);
                } else if (this.f5527d == null) {
                    throw new IllegalStateException("This command type requires an IBrazeRequest present: " + cVar);
                }
            } else if (this.f5526c == null) {
                String str = f5523e;
                AppboyLogger.m5448d(str, "This command type should have a session ID present: " + cVar);
            }
        } else {
            throw new IllegalStateException("No command type provided");
        }
    }
}
