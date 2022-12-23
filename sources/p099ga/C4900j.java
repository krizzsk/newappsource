package p099ga;

import com.appboy.models.InAppMessageBase;
import p265tb.C6658j;
import p583jk.C17875h;

/* renamed from: ga.j */
public final class C4900j {

    /* renamed from: a */
    public final C6658j f16527a;

    /* renamed from: b */
    public final long f16528b;

    /* renamed from: c */
    public final long f16529c;

    /* renamed from: d */
    public final long f16530d = C4883f.m12376a((long) 2500);

    /* renamed from: e */
    public final long f16531e = C4883f.m12376a((long) InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS);

    /* renamed from: f */
    public final int f16532f = -1;

    /* renamed from: g */
    public final long f16533g = C4883f.m12376a((long) 0);

    /* renamed from: h */
    public int f16534h = 13107200;

    /* renamed from: i */
    public boolean f16535i;

    public C4900j() {
        C6658j jVar = new C6658j();
        m12447a(2500, 0, "bufferForPlaybackMs", "0");
        m12447a(InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m12447a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m12447a(50000, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m12447a(50000, 50000, "maxBufferMs", "minBufferMs");
        m12447a(0, 0, "backBufferDurationMs", "0");
        this.f16527a = jVar;
        long j = (long) 50000;
        this.f16528b = C4883f.m12376a(j);
        this.f16529c = C4883f.m12376a(j);
    }

    /* renamed from: a */
    public static void m12447a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        C17875h.m44302l(z, sb.toString());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public final void mo20538b(boolean r3) {
        /*
            r2 = this;
            int r0 = r2.f16532f
            r1 = -1
            if (r0 != r1) goto L_0x0007
            r0 = 13107200(0xc80000, float:1.8367099E-38)
        L_0x0007:
            r2.f16534h = r0
            r0 = 0
            r2.f16535i = r0
            if (r3 == 0) goto L_0x002e
            tb.j r3 = r2.f16527a
            monitor-enter(r3)
            boolean r1 = r3.f20678a     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            monitor-enter(r3)     // Catch:{ all -> 0x002b }
            int r1 = r3.f20681d     // Catch:{ all -> 0x0026 }
            if (r1 <= 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            r3.f20681d = r0     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0024
            r3.mo22832b()     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r3)
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4900j.mo20538b(boolean):void");
    }
}
