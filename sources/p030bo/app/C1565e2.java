package p030bo.app;

import android.app.AlarmManager;
import android.content.Context;
import androidx.appcompat.widget.C0436m1;
import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfigurationProvider;

/* renamed from: bo.app.e2 */
public final class C1565e2 {

    /* renamed from: s */
    public static final String f5638s = AppboyLogger.getBrazeLogTag(C1565e2.class);

    /* renamed from: a */
    public final C1587g4 f5639a;

    /* renamed from: b */
    public final C1709v3 f5640b;

    /* renamed from: c */
    public final C1600i0 f5641c;

    /* renamed from: d */
    public final C1712w f5642d;

    /* renamed from: e */
    public final C1642n1 f5643e;

    /* renamed from: f */
    public final C1744z3 f5644f;

    /* renamed from: g */
    public final C1582g0 f5645g;

    /* renamed from: h */
    public final C1593h1 f5646h;

    /* renamed from: i */
    public final C1729y f5647i;

    /* renamed from: k */
    public final C1735y1 f5648k;

    /* renamed from: l */
    public final C1623k6 f5649l;

    /* renamed from: m */
    public final C1558d4 f5650m;

    /* renamed from: n */
    public final C1618k1 f5651n;

    /* renamed from: o */
    public final C1686s1 f5652o;

    /* renamed from: p */
    public final C1702u3 f5653p;

    /* renamed from: q */
    public final C1716w1 f5654q;

    /* renamed from: r */
    public final C1607j f5655r;

    public C1565e2(Context context, C1705v vVar, BrazeConfigurationProvider brazeConfigurationProvider, C1600i0 i0Var, C1724x1 x1Var, C1742z1 z1Var, boolean z, boolean z2, C1556d2 d2Var) {
        C1564e1 e1Var;
        C1558d4 d4Var;
        C1650o1 o1Var;
        Context context2 = context;
        BrazeConfigurationProvider brazeConfigurationProvider2 = brazeConfigurationProvider;
        String a = vVar.mo6406a();
        String m2Var = brazeConfigurationProvider.getAppboyApiKey().toString();
        C1550c4 c4Var = new C1550c4(context2);
        C1564e1 e1Var2 = new C1564e1();
        C1593h1 h1Var = new C1593h1("user_dependency_manager_parallel_executor_identifier", e1Var2);
        this.f5646h = h1Var;
        C1592h0 h0Var = new C1592h0(h1Var, c4Var);
        this.f5641c = h0Var;
        C1558d4 d4Var2 = new C1558d4(context2, m2Var, new C1548c2(context2));
        this.f5650m = d4Var2;
        C1650o1 o1Var2 = new C1650o1(context2, h0Var, d4Var2);
        if (a.equals("")) {
            this.f5639a = new C1587g4(context2, z1Var, d4Var2, c4Var);
            this.f5640b = new C1709v3(context2);
            o1Var = o1Var2;
            d4Var = d4Var2;
            e1Var = e1Var2;
        } else {
            e1Var = e1Var2;
            C1587g4 g4Var = r1;
            o1Var = o1Var2;
            d4Var = d4Var2;
            C1587g4 g4Var2 = new C1587g4(context, a, m2Var, z1Var, d4Var2, c4Var);
            this.f5639a = g4Var;
            this.f5640b = new C1709v3(context2, a, m2Var);
        }
        C1670q1 q1Var = new C1670q1(context2, brazeConfigurationProvider2, x1Var, this.f5640b);
        this.f5654q = q1Var;
        C1607j jVar = new C1607j(context2, a, m2Var);
        this.f5655r = jVar;
        C1740z zVar = new C1740z(this.f5639a, q1Var, brazeConfigurationProvider2, jVar);
        C1686s1 s1Var = new C1686s1(new C1718w3(new C1695t3(new C1568e4(context2, a, m2Var), h1Var), h0Var));
        this.f5652o = s1Var;
        C1726x3 x3Var = new C1726x3(new C1578f4(context2, a, m2Var), h0Var);
        C1564e1 e1Var3 = e1Var;
        e1Var3.mo6028a(new C1583g1(h0Var));
        int sessionTimeoutSeconds = brazeConfigurationProvider.getSessionTimeoutSeconds();
        Context context3 = context;
        C1564e1 e1Var4 = e1Var3;
        C1686s1 s1Var2 = s1Var;
        C1592h0 h0Var2 = h0Var;
        C1660p1 p1Var = new C1660p1(context3, x3Var, h0Var, i0Var, (AlarmManager) context2.getSystemService("alarm"), sessionTimeoutSeconds, brazeConfigurationProvider.getIsSessionStartBasedTimeoutEnabled());
        C1642n1 n1Var = r1;
        C1593h1 h1Var2 = h1Var;
        C1740z zVar2 = zVar;
        C1642n1 n1Var2 = new C1642n1(context3, a, m2Var, p1Var, h0Var2, brazeConfigurationProvider, d4Var, s1Var2, a, z2, o1Var, c4Var);
        this.f5643e = n1Var;
        String str = a;
        C1744z3 z3Var = new C1744z3(context2, str, n1Var);
        this.f5644f = z3Var;
        String str2 = m2Var;
        C1702u3 u3Var = new C1702u3(context2, str, str2, n1Var);
        this.f5653p = u3Var;
        C1654o3 o3Var = new C1654o3(C1640n.m4497a(), h0Var2, i0Var, h1Var2, z3Var, d4Var, u3Var, n1Var);
        C1592h0 h0Var3 = h0Var2;
        C1729y yVar = new C1729y(context2, h0Var3, new C1722x(context2));
        this.f5647i = yVar;
        yVar.mo6463a(z2);
        C1712w wVar = new C1712w(brazeConfigurationProvider, h0Var3, o3Var, zVar2, e1Var4, z);
        this.f5642d = wVar;
        Context context4 = context;
        BrazeConfigurationProvider brazeConfigurationProvider3 = brazeConfigurationProvider;
        C1623k6 k6Var = new C1623k6(context4, n1Var, h0Var3, brazeConfigurationProvider3, str, str2);
        this.f5649l = k6Var;
        C1618k1 k1Var = new C1618k1(context4, str2, n1Var, brazeConfigurationProvider3, d4Var, h0Var3);
        this.f5651n = k1Var;
        C1642n1 n1Var3 = n1Var;
        BrazeConfigurationProvider brazeConfigurationProvider4 = brazeConfigurationProvider;
        C1634m1 m1Var = new C1634m1(context2, n1Var3, brazeConfigurationProvider4, h1Var2);
        this.f5648k = m1Var;
        C1582g0 g0Var = r1;
        C1582g0 g0Var2 = new C1582g0(context4, m1Var, wVar, n1Var3, this.f5639a, this.f5640b, d4Var, k6Var, k6Var.mo6195b(), s1Var2, k1Var, d2Var, i0Var, brazeConfigurationProvider4, u3Var);
        this.f5645g = g0Var;
    }

    /* access modifiers changed from: private */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: p */
    public /* synthetic */ void m4119p() {
        /*
            r3 = this;
            bo.app.g4 r0 = r3.f5639a     // Catch:{ Exception -> 0x0048 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0048 }
            bo.app.g4 r1 = r3.f5639a     // Catch:{ all -> 0x0045 }
            boolean r1 = r1.mo6371b()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = f5638s     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "User cache was locked, waiting."
            com.appboy.support.AppboyLogger.m5453i(r1, r2)     // Catch:{ all -> 0x0045 }
            bo.app.g4 r2 = r3.f5639a     // Catch:{ InterruptedException -> 0x001c }
            r2.wait()     // Catch:{ InterruptedException -> 0x001c }
            java.lang.String r2 = "User cache notified. Continuing UserDependencyManager shutdown"
            com.appboy.support.AppboyLogger.m5448d(r1, r2)     // Catch:{ InterruptedException -> 0x001c }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            bo.app.v3 r0 = r3.f5640b     // Catch:{ Exception -> 0x0048 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x0048 }
            bo.app.v3 r1 = r3.f5640b     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.mo6371b()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = f5638s     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "Device cache was locked, waiting."
            com.appboy.support.AppboyLogger.m5453i(r1, r2)     // Catch:{ all -> 0x0042 }
            bo.app.v3 r2 = r3.f5640b     // Catch:{ InterruptedException -> 0x0039 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0039 }
            java.lang.String r2 = "Device cache notified. Continuing UserDependencyManager shutdown"
            com.appboy.support.AppboyLogger.m5448d(r1, r2)     // Catch:{ InterruptedException -> 0x0039 }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            bo.app.w r0 = r3.f5642d     // Catch:{ Exception -> 0x0048 }
            bo.app.i0 r1 = r3.f5641c     // Catch:{ Exception -> 0x0048 }
            r0.mo6422a((p030bo.app.C1600i0) r1)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0050
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r1     // Catch:{ Exception -> 0x0048 }
        L_0x0045:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r1     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            java.lang.String r1 = f5638s
            java.lang.String r2 = "Exception while shutting down dispatch manager. Continuing."
            com.appboy.support.AppboyLogger.m5460w(r1, r2, r0)
        L_0x0050:
            bo.app.y r0 = r3.f5647i     // Catch:{ Exception -> 0x0056 }
            r0.mo6469g()     // Catch:{ Exception -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r0 = move-exception
            java.lang.String r1 = f5638s
            java.lang.String r2 = "Exception while un-registering data refresh broadcast receivers. Continuing."
            com.appboy.support.AppboyLogger.m5460w(r1, r2, r0)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1565e2.m4119p():void");
    }

    /* renamed from: a */
    public C1712w mo6030a() {
        return this.f5642d;
    }

    /* renamed from: b */
    public C1735y1 mo6031b() {
        return this.f5648k;
    }

    /* renamed from: c */
    public C1642n1 mo6032c() {
        return this.f5643e;
    }

    /* renamed from: d */
    public C1702u3 mo6033d() {
        return this.f5653p;
    }

    /* renamed from: e */
    public C1729y mo6034e() {
        return this.f5647i;
    }

    /* renamed from: f */
    public C1716w1 mo6035f() {
        return this.f5654q;
    }

    /* renamed from: g */
    public C1582g0 mo6036g() {
        return this.f5645g;
    }

    /* renamed from: h */
    public C1600i0 mo6037h() {
        return this.f5641c;
    }

    /* renamed from: i */
    public C1686s1 mo6038i() {
        return this.f5652o;
    }

    /* renamed from: j */
    public C1744z3 mo6039j() {
        return this.f5644f;
    }

    /* renamed from: k */
    public C1618k1 mo6040k() {
        return this.f5651n;
    }

    /* renamed from: l */
    public C1607j mo6041l() {
        return this.f5655r;
    }

    /* renamed from: m */
    public C1558d4 mo6042m() {
        return this.f5650m;
    }

    /* renamed from: n */
    public C1623k6 mo6043n() {
        return this.f5649l;
    }

    /* renamed from: o */
    public C1587g4 mo6044o() {
        return this.f5639a;
    }

    /* renamed from: q */
    public void mo6045q() {
        this.f5646h.execute(new C0436m1(this, 6));
    }
}
