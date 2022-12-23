package com.moovit.map.nutiteq;

import android.content.Context;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.map.MapImplType;
import ma0.C12906d;
import o20.C18710p;
import q00.C19047a;
import v20.C20092c;

public class NutiteqMapsFactory extends C18710p {
    /* renamed from: a */
    public final MapImplType mo48771a() {
        return MapImplType.NUTITEQ;
    }

    /* renamed from: b */
    public final void mo48772b() {
    }

    /* renamed from: c */
    public final C16285j mo48773c(MapFragment mapFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C19047a aVar) {
        return new C20092c(mapFragment, layoutInflater, viewGroup, aVar);
    }

    /* renamed from: d */
    public final void mo48824d() {
        Context context = this.f47623a;
        C12906d dVar = C12906d.f31937f;
        synchronized (dVar) {
            dVar.f31939a = 0;
            dVar.f31942d.mo40147e();
        }
        Formatter.formatShortFileSize(context, (long) 0);
    }

    /* renamed from: e */
    public final void mo48825e(Context context) {
        this.f47623a = context;
        C12906d dVar = C12906d.f31937f;
        synchronized (dVar) {
            dVar.f31939a = 0;
            dVar.f31942d.mo40147e();
        }
        Formatter.formatShortFileSize(context, (long) 0);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: f */
    public final void mo48826f() {
        /*
            r3 = this;
            r0 = 0
            r3.f47623a = r0
            ma0.d r0 = ma0.C12906d.f31937f
            monitor-enter(r0)
            int r1 = r0.f31939a     // Catch:{ all -> 0x0019 }
            monitor-enter(r0)     // Catch:{ all -> 0x0019 }
            r2 = 0
            r0.f31939a = r2     // Catch:{ all -> 0x0016 }
            ma0.d$a r2 = r0.f31942d     // Catch:{ all -> 0x0016 }
            r2.mo40147e()     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            r0.f31939a = r1     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)
            return
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.nutiteq.NutiteqMapsFactory.mo48826f():void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: g */
    public final void mo48827g() {
        /*
            r3 = this;
            ma0.d r0 = ma0.C12906d.f31937f
            monitor-enter(r0)
            int r1 = r0.f31939a     // Catch:{ all -> 0x0016 }
            monitor-enter(r0)     // Catch:{ all -> 0x0016 }
            r2 = 0
            r0.f31939a = r2     // Catch:{ all -> 0x0013 }
            ma0.d$a r2 = r0.f31942d     // Catch:{ all -> 0x0013 }
            r2.mo40147e()     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            r0.f31939a = r1     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)
            return
        L_0x0013:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.nutiteq.NutiteqMapsFactory.mo48827g():void");
    }
}
