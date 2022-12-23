package com.moovit.car.operators;

import p241s0.C6313h;
import p358af.C13437d;

/* renamed from: com.moovit.car.operators.a */
public final class C15684a {

    /* renamed from: b */
    public static C15684a f40835b;

    /* renamed from: a */
    public C6313h<String, CarOperator> f40836a = new C6313h<>();

    public C15684a() {
        CarOperator[] carOperatorArr = {new C15685b()};
        for (int i = 0; i < 1; i++) {
            CarOperator carOperator = carOperatorArr[i];
            this.f40836a.put(carOperator.mo46800a().getId(), carOperator);
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
    public static synchronized com.moovit.car.operators.C15684a m40087a() {
        /*
            java.lang.Class<com.moovit.car.operators.a> r0 = com.moovit.car.operators.C15684a.class
            monitor-enter(r0)
            com.moovit.car.operators.a r1 = f40835b     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            com.moovit.car.operators.a r1 = f40835b     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            com.moovit.car.operators.a r1 = new com.moovit.car.operators.a     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            f40835b = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0018:
            com.moovit.car.operators.a r1 = f40835b     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.car.operators.C15684a.m40087a():com.moovit.car.operators.a");
    }

    /* renamed from: b */
    public final CarOperator mo46806b(String str) {
        CarOperator orDefault = this.f40836a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        throw new IllegalArgumentException(C13437d.m33706k("car operator: ", str, " does not exist, have you forgotten to initialize it?"));
    }
}
