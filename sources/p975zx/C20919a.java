package p975zx;

import android.content.SharedPreferences;
import ce0.C21100e;
import f00.C16919g;

/* renamed from: zx.a */
public final class C20919a {

    /* renamed from: b */
    public static C16919g.C16928i f52665b = new C16919g.C16928i("access_token", "");

    /* renamed from: c */
    public static C16919g.C16920a f52666c = new C16919g.C16920a("is_new", true);

    /* renamed from: d */
    public static C20919a f52667d;

    /* renamed from: a */
    public final SharedPreferences f52668a;

    public C20919a(SharedPreferences sharedPreferences) {
        C21100e.m49373x(sharedPreferences, "prefs");
        this.f52668a = sharedPreferences;
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
    public static synchronized p975zx.C20919a m49002a(android.content.Context r4) {
        /*
            java.lang.Class<zx.a> r0 = p975zx.C20919a.class
            monitor-enter(r0)
            zx.a r1 = f52667d     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x001f
            monitor-enter(r0)     // Catch:{ all -> 0x0023 }
            zx.a r1 = f52667d     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            zx.a r1 = new zx.a     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "com.moovit.useraccount.manager.connect.AccessTokenStore"
            r3 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r2, r3)     // Catch:{ all -> 0x001c }
            r1.<init>(r4)     // Catch:{ all -> 0x001c }
            f52667d = r1     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            goto L_0x001f
        L_0x001c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r4     // Catch:{ all -> 0x0023 }
        L_0x001f:
            zx.a r4 = f52667d     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)
            return r4
        L_0x0023:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p975zx.C20919a.m49002a(android.content.Context):zx.a");
    }
}
