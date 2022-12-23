package p436df;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p258t4.C6589c;
import p358af.C13443j;

/* renamed from: df.a */
public final class C16597a {

    /* renamed from: d */
    public static final long f43245d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f43246e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C13443j f43247a;

    /* renamed from: b */
    public long f43248b;

    /* renamed from: c */
    public int f43249c;

    public C16597a() {
        if (C6589c.f20408b == null) {
            Pattern pattern = C13443j.f33299c;
            C6589c.f20408b = new C6589c();
        }
        C6589c cVar = C6589c.f20408b;
        if (C13443j.f33300d == null) {
            C13443j.f33300d = new C13443j(cVar);
        }
        this.f43247a = C13443j.f33300d;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final synchronized void mo49365a(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            r1 = 1
            r2 = 200(0xc8, float:2.8E-43)
            if (r7 < r2) goto L_0x000b
            r2 = 300(0x12c, float:4.2E-43)
            if (r7 < r2) goto L_0x0016
        L_0x000b:
            r2 = 401(0x191, float:5.62E-43)
            if (r7 == r2) goto L_0x0016
            r2 = 404(0x194, float:5.66E-43)
            if (r7 != r2) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r2 = 0
            goto L_0x0017
        L_0x0016:
            r2 = 1
        L_0x0017:
            if (r2 == 0) goto L_0x0022
            monitor-enter(r6)     // Catch:{ all -> 0x0074 }
            r6.f43249c = r0     // Catch:{ all -> 0x001f }
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            monitor-exit(r6)
            return
        L_0x001f:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            throw r7     // Catch:{ all -> 0x0074 }
        L_0x0022:
            int r2 = r6.f43249c     // Catch:{ all -> 0x0074 }
            int r2 = r2 + r1
            r6.f43249c = r2     // Catch:{ all -> 0x0074 }
            monitor-enter(r6)     // Catch:{ all -> 0x0074 }
            r2 = 429(0x1ad, float:6.01E-43)
            if (r7 == r2) goto L_0x0034
            r2 = 500(0x1f4, float:7.0E-43)
            if (r7 < r2) goto L_0x0035
            r2 = 600(0x258, float:8.41E-43)
            if (r7 >= r2) goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            if (r0 != 0) goto L_0x003d
            long r0 = f43245d     // Catch:{ all -> 0x003b }
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            goto L_0x0062
        L_0x003b:
            r7 = move-exception
            goto L_0x0072
        L_0x003d:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r7 = r6.f43249c     // Catch:{ all -> 0x003b }
            double r2 = (double) r7     // Catch:{ all -> 0x003b }
            double r0 = java.lang.Math.pow(r0, r2)     // Catch:{ all -> 0x003b }
            af.j r7 = r6.f43247a     // Catch:{ all -> 0x003b }
            r7.getClass()     // Catch:{ all -> 0x003b }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x003b }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2     // Catch:{ all -> 0x003b }
            double r2 = (double) r2     // Catch:{ all -> 0x003b }
            double r0 = r0 + r2
            long r2 = f43246e     // Catch:{ all -> 0x003b }
            double r2 = (double) r2     // Catch:{ all -> 0x003b }
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x003b }
            long r0 = (long) r0
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            af.j r7 = r6.f43247a     // Catch:{ all -> 0x0074 }
            t4.c r7 = r7.f33301a     // Catch:{ all -> 0x0074 }
            r7.getClass()     // Catch:{ all -> 0x0074 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0074 }
            long r2 = r2 + r0
            r6.f43248b = r2     // Catch:{ all -> 0x0074 }
            monitor-exit(r6)
            return
        L_0x0072:
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            throw r7     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p436df.C16597a.mo49365a(int):void");
    }
}
