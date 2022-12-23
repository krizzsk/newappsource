package c70;

import b00.C13559d;
import c70.C13756i;
import java.util.Collection;

/* renamed from: c70.k */
public final class C13770k extends C13559d {

    /* renamed from: e */
    public final /* synthetic */ Collection f33905e;

    /* renamed from: f */
    public final /* synthetic */ C13756i.C13766j f33906f;

    /* renamed from: g */
    public final /* synthetic */ C13756i f33907g;

    public C13770k(C13756i iVar, Collection collection, C13756i.C13766j jVar) {
        this.f33907g = iVar;
        this.f33905e = collection;
        this.f33906f = jVar;
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
    public final void mo40445a() {
        /*
            r4 = this;
            c70.i r0 = r4.f33907g
            monitor-enter(r0)
            c70.e r1 = r0.mo40679b()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0014
            monitor-enter(r0)     // Catch:{ all -> 0x0036 }
            boolean r1 = r0.f33875i     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0011:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0014:
            r1 = 0
        L_0x0015:
            monitor-exit(r0)
            if (r1 != 0) goto L_0x0019
            return
        L_0x0019:
            java.util.Collection r0 = r4.f33905e
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0035
            java.lang.Object r1 = r0.next()
            c70.i$l r1 = (c70.C13756i.C13768l) r1
            c70.i$j r2 = r4.f33906f
            c70.i r3 = r4.f33907g
            c70.i$d r3 = r3.f33868b
            r2.mo40690b(r1, r3)
            goto L_0x001f
        L_0x0035:
            return
        L_0x0036:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c70.C13770k.mo40445a():void");
    }
}
