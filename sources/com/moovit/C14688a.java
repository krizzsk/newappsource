package com.moovit;

import ce0.C21100e;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Set;
import p358af.C13437d;
import p646lz.C18299a;
import p646lz.C18304b;

/* renamed from: com.moovit.a */
public final class C14688a {

    /* renamed from: a */
    public final C18299a f37344a;

    /* renamed from: b */
    public final Set<String> f37345b;

    /* renamed from: c */
    public final HashMap f37346c;

    /* renamed from: d */
    public final HashMap f37347d;

    /* renamed from: e */
    public final C14690b f37348e;

    /* renamed from: f */
    public final C14689a f37349f;

    /* renamed from: com.moovit.a$a */
    public class C14689a implements C18304b {
        public C14689a() {
        }

        /* renamed from: d */
        public final void mo44553d(Object obj, String str) {
            C14688a aVar = C14688a.this;
            aVar.f37347d.put(str, obj);
            aVar.f37348e.mo20301c(obj, str);
        }

        /* renamed from: g */
        public final void mo44554g(Object obj, String str) {
            C14688a aVar = C14688a.this;
            aVar.f37346c.put(str, obj);
            aVar.f37348e.mo20302d(obj, str);
            if (aVar.mo44593a()) {
                aVar.f37348e.mo20300a();
            }
        }
    }

    /* renamed from: com.moovit.a$b */
    public interface C14690b {
        /* renamed from: a */
        void mo20300a();

        /* renamed from: c */
        void mo20301c(Object obj, String str);

        /* renamed from: d */
        void mo20302d(Object obj, String str);
    }

    public C14688a(C18299a aVar, Set<String> set, C14690b bVar) {
        this.f37346c = new HashMap();
        this.f37347d = new HashMap();
        this.f37349f = new C14689a();
        C21100e.m49373x(aVar, "dataManager");
        this.f37344a = aVar;
        C21100e.m49373x(set, "requiredParts");
        this.f37345b = set;
        C21100e.m49373x(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f37348e = bVar;
    }

    /* renamed from: a */
    public final boolean mo44593a() {
        return this.f37346c.size() == this.f37345b.size();
    }

    /* renamed from: b */
    public final <T> T mo44594b(String str) {
        if (this.f37345b.contains(str)) {
            T t = this.f37346c.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(C13437d.m33706k("Data part ", str, " hasn't been loaded yet, or has failed to load"));
        }
        throw new IllegalStateException(C13437d.m33705j(C14688a.class, C13555b.m33973l("App data part ", str, " has not been declared as required by "), ".getRequiredAppDataParts()"));
    }

    /* renamed from: c */
    public final boolean mo44595c(String str) {
        if (this.f37345b.contains(str)) {
            return this.f37346c.containsKey(str);
        }
        throw new IllegalStateException(C13437d.m33706k("App data part ", str, " has not been declared as a required part"));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final void mo44596d() {
        /*
            r5 = this;
            lz.a r0 = r5.f37344a
            com.moovit.a$a r1 = r5.f37349f
            monitor-enter(r0)
            s0.b r2 = r0.f46667f     // Catch:{ all -> 0x002a }
            java.util.Set r2 = r2.keySet()     // Catch:{ all -> 0x002a }
            s0.g$c r2 = (p241s0.C6307g.C6310c) r2     // Catch:{ all -> 0x002a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x002a }
        L_0x0011:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x0028
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x002a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x002a }
            monitor-enter(r0)     // Catch:{ all -> 0x002a }
            com.moovit.commons.utils.collections.CollectionHashMap$LinkedListHashMap<java.lang.String, lz.b> r4 = r0.f46673l     // Catch:{ all -> 0x0025 }
            r4.mo47007p(r3, r1)     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            goto L_0x0011
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r0)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.C14688a.mo44596d():void");
    }

    /* renamed from: e */
    public final boolean mo44597e() {
        this.f37346c.clear();
        this.f37347d.clear();
        for (String next : this.f37345b) {
            Object c = this.f37344a.mo50690c(next);
            if (c != null) {
                this.f37346c.put(next, c);
            } else {
                this.f37344a.mo50698j(next, this.f37349f, true);
            }
        }
        return mo44593a();
    }

    public C14688a(Set<String> set, C14690b bVar) {
        this(MoovitApplication.f37317k.f37321e, set, bVar);
    }
}
