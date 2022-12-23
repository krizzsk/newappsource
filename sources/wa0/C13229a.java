package wa0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.Strategy;
import na0.C12932j;

/* renamed from: wa0.a */
public final class C13229a extends Thread {

    /* renamed from: b */
    public int f32803b;

    /* renamed from: c */
    public volatile C13230b f32804c;

    /* renamed from: d */
    public volatile C12932j f32805d;

    /* renamed from: e */
    public long f32806e;

    /* renamed from: f */
    public long f32807f;

    /* renamed from: g */
    public long f32808g;

    /* renamed from: h */
    public long f32809h;

    /* renamed from: i */
    public int f32810i;

    /* renamed from: j */
    public float f32811j;

    /* renamed from: k */
    public float f32812k;

    /* renamed from: l */
    public float f32813l;

    /* renamed from: m */
    public float f32814m;

    /* renamed from: n */
    public float f32815n;

    /* renamed from: o */
    public volatile boolean f32816o;

    /* renamed from: p */
    public volatile boolean f32817p;

    /* renamed from: q */
    public volatile boolean f32818q;

    public C13229a(C13230b bVar, C12932j jVar) {
        super("ClickThread");
        if (jVar != null) {
            this.f32804c = bVar;
            this.f32805d = jVar;
            setPriority(1);
            start();
            return;
        }
        throw new IllegalArgumentException("options may not be null");
    }

    /* renamed from: a */
    public final void mo40095a() {
        int i;
        int i2;
        if (this.f32805d != null) {
            long currentTimeMillis = System.currentTimeMillis();
            int i3 = 400;
            int i4 = -1;
            if (this.f32805d.f32043j) {
                i = 400;
            } else {
                i = -1;
            }
            this.f32806e = currentTimeMillis + ((long) i);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!this.f32805d.f32043j) {
                i3 = -1;
            }
            this.f32807f = currentTimeMillis2 + ((long) i3);
            long currentTimeMillis3 = System.currentTimeMillis();
            if (this.f32805d.f32043j) {
                i2 = 100;
            } else {
                i2 = -1;
            }
            long j = currentTimeMillis3 + ((long) i2);
            this.f32808g = j;
            if (this.f32805d.f32043j) {
                i4 = Strategy.TTL_SECONDS_DEFAULT;
            }
            this.f32809h = j + ((long) i4);
            this.f32803b = 1;
            this.f32810i = 0;
            this.f32813l = BitmapDescriptorFactory.HUE_RED;
            this.f32816o = false;
            this.f32817p = false;
            this.f32818q = true;
            synchronized (this) {
                notify();
            }
        }
    }

    /* renamed from: b */
    public final void mo40096b(float f, float f2) {
        if (!this.f32816o) {
            float abs = Math.abs(f - this.f32811j) + this.f32813l;
            this.f32813l = abs;
            float abs2 = Math.abs(f2 - this.f32812k) + abs;
            this.f32813l = abs2;
            this.f32811j = f;
            this.f32812k = f2;
            int i = this.f32803b;
            if (i == 1) {
                if (abs2 >= 80.0f) {
                    this.f32816o = true;
                    this.f32817p = true;
                }
            } else if (i == 3 && abs2 >= 60.0f && this.f32810i == 2) {
                this.f32816o = true;
                this.f32817p = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo40097c() {
        int i = this.f32810i - 1;
        this.f32810i = i;
        int i2 = this.f32803b;
        if (i2 == 1) {
            this.f32803b = 2;
        } else if (i2 != 3) {
        } else {
            if (i == 0) {
                this.f32816o = true;
            } else if (i == 1) {
                this.f32811j = this.f32814m;
                this.f32812k = this.f32815n;
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r11 = this;
        L_0x0000:
            boolean r0 = r11.f32818q
            if (r0 != 0) goto L_0x001e
            monitor-enter(r11)
            wa0.b r0 = r11.f32804c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            return
        L_0x000b:
            r11.wait()     // Catch:{ InterruptedException -> 0x000f }
            goto L_0x0013
        L_0x000f:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x001b }
        L_0x0013:
            wa0.b r0 = r11.f32804c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            boolean r0 = r11.f32816o
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x006d
            long r4 = java.lang.System.currentTimeMillis()
            monitor-enter(r11)
            wa0.b r0 = r11.f32804c     // Catch:{ all -> 0x006a }
            monitor-exit(r11)     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0030
            return
        L_0x0030:
            int r6 = r11.f32803b
            if (r6 == r3) goto L_0x0059
            if (r6 == r2) goto L_0x0049
            if (r6 == r1) goto L_0x0039
            goto L_0x0063
        L_0x0039:
            monitor-enter(r0)
            long r1 = r11.f32809h     // Catch:{ all -> 0x0046 }
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 < 0) goto L_0x0044
            r11.f32816o = r3     // Catch:{ all -> 0x0046 }
            r11.f32817p = r3     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x0063
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r1
        L_0x0049:
            monitor-enter(r0)
            long r1 = r11.f32807f     // Catch:{ all -> 0x0056 }
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 < 0) goto L_0x0054
            r11.f32816o = r3     // Catch:{ all -> 0x0056 }
            r11.f32817p = r3     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0063
        L_0x0056:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r1
        L_0x0059:
            monitor-enter(r0)
            long r1 = r11.f32806e     // Catch:{ all -> 0x0067 }
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 < 0) goto L_0x0062
            r11.f32816o = r3     // Catch:{ all -> 0x0067 }
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
        L_0x0063:
            java.lang.Thread.yield()
            goto L_0x001e
        L_0x0067:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r1
        L_0x006a:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x006a }
            throw r0
        L_0x006d:
            monitor-enter(r11)
            wa0.b r0 = r11.f32804c     // Catch:{ all -> 0x0178 }
            monitor-exit(r11)     // Catch:{ all -> 0x0178 }
            if (r0 != 0) goto L_0x0074
            return
        L_0x0074:
            int r4 = r11.f32803b
            r5 = 0
            if (r4 == r3) goto L_0x0110
            if (r4 == r2) goto L_0x00da
            if (r4 == r1) goto L_0x007e
            goto L_0x0000
        L_0x007e:
            monitor-enter(r11)
            monitor-enter(r0)     // Catch:{ all -> 0x00d7 }
            boolean r1 = r11.f32817p     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00a3
            int r1 = r11.f32810i     // Catch:{ all -> 0x00d4 }
            if (r1 != r3) goto L_0x0090
            float r1 = r11.f32811j     // Catch:{ all -> 0x00d4 }
            float r2 = r11.f32812k     // Catch:{ all -> 0x00d4 }
            r0.mo40109k(r1, r2)     // Catch:{ all -> 0x00d4 }
            goto L_0x009d
        L_0x0090:
            if (r1 < r2) goto L_0x009d
            float r1 = r11.f32811j     // Catch:{ all -> 0x00d4 }
            float r2 = r11.f32812k     // Catch:{ all -> 0x00d4 }
            float r3 = r11.f32814m     // Catch:{ all -> 0x00d4 }
            float r4 = r11.f32815n     // Catch:{ all -> 0x00d4 }
            r0.mo40101c(r1, r2, r3, r4)     // Catch:{ all -> 0x00d4 }
        L_0x009d:
            r11.f32818q = r5     // Catch:{ all -> 0x00d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r11)
            goto L_0x0000
        L_0x00a3:
            monitor-enter(r0)     // Catch:{ all -> 0x00d4 }
            na0.j r1 = r0.f32822d     // Catch:{ all -> 0x00c0 }
            boolean r1 = r1.f32049p     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x00c2
            na0.j r1 = r0.f32822d     // Catch:{ all -> 0x00c0 }
            boolean r1 = r1.f32041h     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x00c2
            sa0.f r1 = r0.f32820b     // Catch:{ all -> 0x00c0 }
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            sa0.e r1 = (sa0.C13096e) r1     // Catch:{ all -> 0x00c0 }
            float r4 = r1.f32473y     // Catch:{ all -> 0x00c0 }
            float r4 = r4 + r2
            r2 = 300(0x12c, float:4.2E-43)
            r6 = 0
            r1.mo39986t(r4, r2, r6)     // Catch:{ all -> 0x00c0 }
            goto L_0x00c2
        L_0x00c0:
            r1 = move-exception
            goto L_0x00d2
        L_0x00c2:
            sa0.f r1 = r0.f32820b     // Catch:{ all -> 0x00c0 }
            sa0.e r1 = (sa0.C13096e) r1     // Catch:{ all -> 0x00c0 }
            r1.f32426N = r3     // Catch:{ all -> 0x00c0 }
            r1.mo39976m()     // Catch:{ all -> 0x00c0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            r11.f32818q = r5     // Catch:{ all -> 0x00d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r11)
            goto L_0x0000
        L_0x00d2:
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            throw r1     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            throw r1     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x00da:
            monitor-enter(r0)
            boolean r1 = r11.f32817p     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x0101
            float r1 = r11.f32811j     // Catch:{ all -> 0x010d }
            float r2 = r11.f32812k     // Catch:{ all -> 0x010d }
            monitor-enter(r0)     // Catch:{ all -> 0x010d }
            sa0.f r4 = r0.f32820b     // Catch:{ all -> 0x00fe }
            sa0.e r4 = (sa0.C13096e) r4     // Catch:{ all -> 0x00fe }
            na0.h r6 = r4.f32427O     // Catch:{ all -> 0x00fe }
            double r7 = (double) r1     // Catch:{ all -> 0x00fe }
            float r1 = r4.f32431S     // Catch:{ all -> 0x00fe }
            float r1 = r1 - r2
            double r1 = (double) r1     // Catch:{ all -> 0x00fe }
            r6.f32028a = r7     // Catch:{ all -> 0x00fe }
            r6.f32029b = r1     // Catch:{ all -> 0x00fe }
            r4.f32419J = r3     // Catch:{ all -> 0x00fe }
            r4.mo39976m()     // Catch:{ all -> 0x00fe }
            monitor-exit(r0)     // Catch:{ all -> 0x010d }
            r11.f32818q = r5     // Catch:{ all -> 0x010d }
            monitor-exit(r0)     // Catch:{ all -> 0x010d }
            goto L_0x0000
        L_0x00fe:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010d }
            throw r1     // Catch:{ all -> 0x010d }
        L_0x0101:
            float r1 = r11.f32811j     // Catch:{ all -> 0x010d }
            float r2 = r11.f32812k     // Catch:{ all -> 0x010d }
            r0.mo40100b(r1, r2)     // Catch:{ all -> 0x010d }
            r11.f32818q = r5     // Catch:{ all -> 0x010d }
            monitor-exit(r0)     // Catch:{ all -> 0x010d }
            goto L_0x0000
        L_0x010d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010d }
            throw r1
        L_0x0110:
            monitor-enter(r0)
            na0.j r1 = r11.f32805d     // Catch:{ all -> 0x0175 }
            boolean r1 = r1.f32043j     // Catch:{ all -> 0x0175 }
            if (r1 != 0) goto L_0x0140
            float r1 = r11.f32811j     // Catch:{ all -> 0x0175 }
            float r2 = r11.f32812k     // Catch:{ all -> 0x0175 }
            r0.mo40109k(r1, r2)     // Catch:{ all -> 0x0175 }
            float r1 = r11.f32811j     // Catch:{ all -> 0x0175 }
            float r2 = r11.f32812k     // Catch:{ all -> 0x0175 }
            monitor-enter(r0)     // Catch:{ all -> 0x0175 }
            sa0.f r4 = r0.f32820b     // Catch:{ all -> 0x013d }
            sa0.e r4 = (sa0.C13096e) r4     // Catch:{ all -> 0x013d }
            na0.h r6 = r4.f32427O     // Catch:{ all -> 0x013d }
            double r7 = (double) r1     // Catch:{ all -> 0x013d }
            float r1 = r4.f32431S     // Catch:{ all -> 0x013d }
            float r1 = r1 - r2
            double r1 = (double) r1     // Catch:{ all -> 0x013d }
            r6.f32028a = r7     // Catch:{ all -> 0x013d }
            r6.f32029b = r1     // Catch:{ all -> 0x013d }
            r4.f32419J = r3     // Catch:{ all -> 0x013d }
            r4.mo39976m()     // Catch:{ all -> 0x013d }
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            r11.f32818q = r5     // Catch:{ all -> 0x0175 }
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0000
        L_0x013d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            throw r1     // Catch:{ all -> 0x0175 }
        L_0x0140:
            boolean r1 = r11.f32817p     // Catch:{ all -> 0x0175 }
            if (r1 == 0) goto L_0x0150
            float r1 = r11.f32811j     // Catch:{ all -> 0x0175 }
            float r2 = r11.f32812k     // Catch:{ all -> 0x0175 }
            r0.mo40109k(r1, r2)     // Catch:{ all -> 0x0175 }
            r11.f32818q = r5     // Catch:{ all -> 0x0175 }
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0000
        L_0x0150:
            float r1 = r11.f32811j     // Catch:{ all -> 0x0175 }
            float r2 = r11.f32812k     // Catch:{ all -> 0x0175 }
            monitor-enter(r0)     // Catch:{ all -> 0x0175 }
            sa0.f r4 = r0.f32820b     // Catch:{ all -> 0x0172 }
            sa0.e r4 = (sa0.C13096e) r4     // Catch:{ all -> 0x0172 }
            na0.h r6 = r4.f32427O     // Catch:{ all -> 0x0172 }
            double r7 = (double) r1     // Catch:{ all -> 0x0172 }
            float r9 = r4.f32431S     // Catch:{ all -> 0x0172 }
            float r9 = r9 - r2
            double r9 = (double) r9     // Catch:{ all -> 0x0172 }
            r6.f32028a = r7     // Catch:{ all -> 0x0172 }
            r6.f32029b = r9     // Catch:{ all -> 0x0172 }
            r4.f32421K = r3     // Catch:{ all -> 0x0172 }
            r4.mo39976m()     // Catch:{ all -> 0x0172 }
            r0.mo40109k(r1, r2)     // Catch:{ all -> 0x0172 }
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            r11.f32818q = r5     // Catch:{ all -> 0x0175 }
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            goto L_0x0000
        L_0x0172:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            throw r1     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            throw r1
        L_0x0178:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0178 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wa0.C13229a.run():void");
    }
}
