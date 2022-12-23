package com.moovit.offline;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.network.model.ServerId;
import g00.C17136a;
import l40.C5599a;
import l40.C5618f;
import l40.C5624j;
import p241s0.C6302b;
import p358af.C13437d;
import p435de.C16596f;
import p583jk.C17884p;
import s00.C19391d;
import u00.C19815e;

public class TripPlannerService extends Service {

    /* renamed from: b */
    public C5624j f15156b = null;

    /* renamed from: c */
    public final C6302b f15157c = new C6302b(5);

    /* renamed from: com.moovit.offline.TripPlannerService$a */
    public static final class C4261a {

        /* renamed from: a */
        public final ServerId f15158a;

        /* renamed from: b */
        public final long f15159b;

        /* renamed from: c */
        public final int f15160c;

        /* renamed from: d */
        public final int f15161d;

        /* renamed from: e */
        public final int f15162e;

        public C4261a(ServerId serverId, long j, int i, int i2) {
            int i3 = C5599a.f18332a;
            C21100e.m49373x(serverId, "metroId");
            this.f15158a = serverId;
            this.f15159b = j;
            this.f15160c = i;
            this.f15161d = i2;
            this.f15162e = i3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C4261a)) {
                return false;
            }
            C4261a aVar = (C4261a) obj;
            if (this.f15158a.equals(aVar.f15158a) && this.f15159b == aVar.f15159b && this.f15160c == aVar.f15160c && this.f15161d == aVar.f15161d && this.f15162e == aVar.f15162e) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return C17884p.m44333D(C17884p.m44335F(this.f15158a), C17884p.m44334E(this.f15159b), this.f15160c, this.f15161d, this.f15162e);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("TripPlannerKey[");
            k.append(this.f15158a);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f15159b);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f15160c);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(this.f15161d);
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            return C13437d.m33707l(k, this.f15162e, "]");
        }
    }

    /* renamed from: a */
    public final synchronized C5618f mo19771a(C5624j jVar, C19391d dVar, GtfsConfiguration gtfsConfiguration, C4261a aVar) {
        try {
            C19815e d = dVar.mo51802d();
            if (!d.mo52119k(this, gtfsConfiguration, aVar.f15160c, aVar.f15161d).isDirectory()) {
                d.mo52116h(this, gtfsConfiguration, aVar.f15160c, aVar.f15161d);
            }
        } catch (Exception e) {
            C16596f a = C16596f.m42113a();
            a.mo49363b(aVar.toString());
            a.mo49364c(new RuntimeException("Failed to load trip planner!", e));
            return null;
        }
        return new C5618f(jVar, dVar.mo51802d().mo52119k(this, gtfsConfiguration, aVar.f15160c, aVar.f15161d), aVar.f15162e);
    }

    /* renamed from: b */
    public final synchronized C5624j mo19772b(C19391d dVar) {
        try {
            if (dVar.mo51802d().mo52120l(239, this)) {
                return new C5624j(dVar.mo51802d().mo52118j(this, false));
            }
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(new RuntimeException("Failed to load trip planner shared state!", e));
        }
        return null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public final synchronized void mo19773c() {
        /*
            r3 = this;
            monitor-enter(r3)
            s0.b r0 = r3.f15157c     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0033 }
            s0.g$c r0 = (p241s0.C6307g.C6310c) r0     // Catch:{ all -> 0x0033 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0033 }
        L_0x000d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0031
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0033 }
            com.moovit.offline.TripPlannerService$a r1 = (com.moovit.offline.TripPlannerService.C4261a) r1     // Catch:{ all -> 0x0033 }
            monitor-enter(r3)     // Catch:{ all -> 0x0033 }
            s0.b r2 = r3.f15157c     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r2.remove(r1)     // Catch:{ all -> 0x002e }
            l40.f r1 = (l40.C5618f) r1     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0026
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            goto L_0x000d
        L_0x0026:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "Unsupported operation, did you compile 'tripplanner' flavor?"
            r0.<init>(r1)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r3)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.offline.TripPlannerService.mo19773c():void");
    }

    public final IBinder onBind(Intent intent) {
        return new C17136a(this);
    }

    public final void onDestroy() {
        super.onDestroy();
        mo19773c();
    }

    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        mo19773c();
    }
}
