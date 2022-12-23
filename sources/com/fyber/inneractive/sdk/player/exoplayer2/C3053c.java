package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3328b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3358k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3396n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.c */
public final class C3053c {

    /* renamed from: a */
    public final C3358k f10509a;

    /* renamed from: b */
    public final long f10510b;

    /* renamed from: c */
    public final long f10511c;

    /* renamed from: d */
    public final long f10512d;

    /* renamed from: e */
    public final long f10513e;

    /* renamed from: f */
    public int f10514f;

    /* renamed from: g */
    public boolean f10515g;

    public C3053c(C3358k kVar, int i, int i2, long j, long j2) {
        this(kVar, i, i2, j, j2, (C3396n) null);
    }

    /* renamed from: a */
    public C3328b mo14050a() {
        return this.f10509a;
    }

    public C3053c(C3358k kVar, int i, int i2, long j, long j2, C3396n nVar) {
        this.f10509a = kVar;
        this.f10510b = ((long) i) * 1000;
        this.f10511c = ((long) i2) * 1000;
        this.f10512d = j * 1000;
        this.f10513e = j2 * 1000;
    }

    /* renamed from: a */
    public boolean mo14052a(long j) {
        char c;
        int i;
        boolean z = false;
        if (j > this.f10511c) {
            c = 0;
        } else {
            c = j < this.f10510b ? (char) 2 : 1;
        }
        C3358k kVar = this.f10509a;
        synchronized (kVar) {
            i = kVar.f12016f * kVar.f12012b;
        }
        boolean z2 = i >= this.f10514f;
        boolean z3 = this.f10515g;
        if (c == 2 || (c == 1 && z3 && !z2)) {
            z = true;
        }
        this.f10515g = z;
        return z;
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
    /* renamed from: a */
    public final void mo14051a(boolean r3) {
        /*
            r2 = this;
            r0 = 0
            r2.f10514f = r0
            r2.f10515g = r0
            if (r3 == 0) goto L_0x0027
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r3 = r2.f10509a
            monitor-enter(r3)
            boolean r1 = r3.f12011a     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0022
            monitor-enter(r3)     // Catch:{ all -> 0x0024 }
            int r1 = r3.f12015e     // Catch:{ all -> 0x001f }
            if (r1 <= 0) goto L_0x0015
            r1 = 1
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r3.f12015e = r0     // Catch:{ all -> 0x001f }
            if (r1 == 0) goto L_0x001d
            r3.mo14506b()     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0022
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r3)
            goto L_0x0027
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C3053c.mo14051a(boolean):void");
    }
}
