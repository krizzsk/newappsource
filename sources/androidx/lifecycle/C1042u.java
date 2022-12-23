package androidx.lifecycle;

import android.content.Context;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C2353q;
import com.facebook.appevents.PersistedEvents;
import com.facebook.internal.C2376b;
import hi0.C23539f0;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mf0.C24362h;
import p009a8.C0115o;
import p023b4.C1471b;
import p043ch.qos.logback.core.spi.FilterReply;
import p119i4.C5277a;
import p296w4.C6983a;
import p363ak.C13477c;
import p363ak.C13478d;
import p364al.C13487h;
import p364al.C13488i;
import p411cm.C13845c;
import p725pj.C18926a;
import p819tk.C19690g;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.lifecycle.u */
public final class C1042u implements C13845c {

    /* renamed from: a */
    public Object f3985a;

    public /* synthetic */ C1042u(Object obj) {
        this.f3985a = obj;
    }

    /* renamed from: a */
    public final void mo4326a(C19690g gVar) {
        ((C13488i) this.f3985a).mo40393a(new C13487h(gVar, (C18926a) null));
    }

    /* renamed from: b */
    public final void mo4327b(C13477c cVar) {
        C13487h hVar;
        C13488i iVar = (C13488i) this.f3985a;
        if (C13477c.f33352f.equals(cVar.f48170b)) {
            hVar = new C13487h(null, new C13478d(cVar, C13478d.f33357i, "HTTPS certificate validation failure"));
        } else {
            hVar = new C13487h(null, new C13478d(cVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        iVar.mo40393a(hVar);
    }

    /* renamed from: c */
    public final synchronized void mo4328c(PersistedEvents persistedEvents) {
        for (Map.Entry next : persistedEvents.mo12459b()) {
            C2353q g = mo4332g((AccessTokenAppIdPair) next.getKey());
            if (g != null) {
                for (AppEvent a : (List) next.getValue()) {
                    g.mo12510a(a);
                }
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo4329d(C23539f0 f0Var) {
        ((Set) this.f3985a).remove(f0Var);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public final synchronized int mo4330e() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Object r0 = r5.f3985a     // Catch:{ all -> 0x0039 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0039 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
            r1 = 0
            r2 = 0
        L_0x000f:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0039 }
            com.facebook.appevents.q r3 = (com.facebook.appevents.C2353q) r3     // Catch:{ all -> 0x0039 }
            monitor-enter(r3)     // Catch:{ all -> 0x0039 }
            boolean r4 = p262t8.C6606a.m15601b(r3)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x0024
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            goto L_0x0031
        L_0x0024:
            java.util.ArrayList r4 = r3.f8570c     // Catch:{ all -> 0x002c }
            int r4 = r4.size()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            goto L_0x0032
        L_0x002c:
            r4 = move-exception
            p262t8.C6606a.m15600a(r3, r4)     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
        L_0x0031:
            r4 = 0
        L_0x0032:
            int r2 = r2 + r4
            goto L_0x000f
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r5)
            return r2
        L_0x0039:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1042u.mo4330e():int");
    }

    /* renamed from: f */
    public final FilterReply mo4331f(C1471b bVar) {
        C6983a aVar = (C6983a) this.f3985a;
        aVar.mo23229i();
        for (C5277a m : (C5277a[]) aVar.f21750d) {
            FilterReply m2 = m.mo21079m();
            if (m2 == FilterReply.DENY || m2 == FilterReply.ACCEPT) {
                return m2;
            }
        }
        return FilterReply.NEUTRAL;
    }

    /* renamed from: g */
    public final synchronized C2353q mo4332g(AccessTokenAppIdPair accessTokenAppIdPair) {
        C2353q qVar = (C2353q) ((HashMap) this.f3985a).get(accessTokenAppIdPair);
        if (qVar == null) {
            Context a = C0115o.m210a();
            C2376b bVar = C2376b.f8604f;
            C2376b a2 = C2376b.C2377a.m6272a(a);
            if (a2 != null) {
                qVar = new C2353q(a2, AppEventsLogger.C2315a.m6184a(a));
            }
        }
        if (qVar == null) {
            return null;
        }
        ((HashMap) this.f3985a).put(accessTokenAppIdPair, qVar);
        return qVar;
    }

    /* renamed from: h */
    public final synchronized Set mo4333h() {
        Set keySet;
        keySet = ((HashMap) this.f3985a).keySet();
        C24362h.m61210e(keySet, "stateMap.keys");
        return keySet;
    }

    public C1042u(int i) {
        if (i == 2) {
            this.f3985a = new C6983a(new C5277a[0]);
        } else if (i == 3) {
            this.f3985a = new HashMap();
        } else if (i == 9) {
        } else {
            if (i == 11) {
                this.f3985a = new LinkedHashSet();
            } else if (i != 12) {
                this.f3985a = new HashMap();
            } else {
                this.f3985a = new ConcurrentHashMap();
            }
        }
    }
}
