package com.vungle.warren;

import ce0.C21087a;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import od0.C24573q;
import p359ag.C13450g;
import p359ag.C13452i;
import p626lf.C18201b;

/* renamed from: com.vungle.warren.n1 */
public final class C23181n1 {

    /* renamed from: o */
    public static C23181n1 f58840o;

    /* renamed from: p */
    public static long f58841p;

    /* renamed from: a */
    public C18201b f58842a;

    /* renamed from: b */
    public ExecutorService f58843b;

    /* renamed from: c */
    public boolean f58844c = false;

    /* renamed from: d */
    public long f58845d;

    /* renamed from: e */
    public C23183b f58846e;

    /* renamed from: f */
    public final List<C24573q> f58847f = Collections.synchronizedList(new ArrayList());

    /* renamed from: g */
    public final ArrayList f58848g = new ArrayList();

    /* renamed from: h */
    public final HashMap f58849h = new HashMap();

    /* renamed from: i */
    public VungleApiClient f58850i;

    /* renamed from: j */
    public int f58851j = 40;

    /* renamed from: k */
    public AtomicInteger f58852k = new AtomicInteger();

    /* renamed from: l */
    public int f58853l;

    /* renamed from: m */
    public C23192a f58854m;

    /* renamed from: n */
    public C23182a f58855n = new C23182a();

    /* renamed from: com.vungle.warren.n1$a */
    public class C23182a extends C21087a.C21093f {

        /* renamed from: a */
        public long f58856a;

        public C23182a() {
        }

        /* renamed from: c */
        public final void mo53289c() {
            if (this.f58856a > 0) {
                C23181n1.this.f58842a.getClass();
                long currentTimeMillis = System.currentTimeMillis() - this.f58856a;
                C23181n1 n1Var = C23181n1.this;
                long j = n1Var.f58845d;
                if (j > -1 && currentTimeMillis > 0 && currentTimeMillis >= j * 1000 && n1Var.f58846e != null) {
                    Vungle._instance.hbpOrdinalViewCount.set(0);
                }
                C23181n1 n1Var2 = C23181n1.this;
                C13452i iVar = new C13452i();
                SessionEvent sessionEvent = SessionEvent.APP_FOREGROUND;
                iVar.mo40349F("event", sessionEvent.toString());
                n1Var2.mo58250d(new C24573q(sessionEvent, iVar));
            }
        }

        /* renamed from: d */
        public final void mo53288d() {
            C23181n1 n1Var = C23181n1.this;
            C13452i iVar = new C13452i();
            SessionEvent sessionEvent = SessionEvent.APP_BACKGROUND;
            iVar.mo40349F("event", sessionEvent.toString());
            n1Var.mo58250d(new C24573q(sessionEvent, iVar));
            C23181n1.this.f58842a.getClass();
            this.f58856a = System.currentTimeMillis();
        }
    }

    /* renamed from: com.vungle.warren.n1$b */
    public interface C23183b {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m57207a(com.vungle.warren.C23181n1 r4, java.util.List r5) throws com.vungle.warren.persistence.DatabaseHelper.DBException {
        /*
            monitor-enter(r4)
            boolean r0 = r4.f58844c     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x007d
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x000d
            goto L_0x007d
        L_0x000d:
            ag.d r0 = new ag.d     // Catch:{ all -> 0x007f }
            r0.<init>()     // Catch:{ all -> 0x007f }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x007f }
        L_0x0016:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x007f }
            od0.q r2 = (od0.C24573q) r2     // Catch:{ all -> 0x007f }
            com.google.gson.Gson r3 = od0.C24573q.f62300d     // Catch:{ all -> 0x007f }
            ag.i r2 = r2.f62303c     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r3.toJson((p359ag.C13450g) r2)     // Catch:{ all -> 0x007f }
            ag.g r2 = p359ag.C13453j.m33762b(r2)     // Catch:{ all -> 0x007f }
            boolean r3 = r2 instanceof p359ag.C13452i     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0016
            ag.i r2 = r2.mo40342u()     // Catch:{ all -> 0x007f }
            r0.mo40327C(r2)     // Catch:{ all -> 0x007f }
            goto L_0x0016
        L_0x003a:
            com.vungle.warren.VungleApiClient r1 = r4.f58850i     // Catch:{ IOException -> 0x0071 }
            qd0.d r0 = r1.mo58085n(r0)     // Catch:{ IOException -> 0x0071 }
            qd0.e r0 = r0.mo61216a()     // Catch:{ IOException -> 0x0071 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0071 }
        L_0x0048:
            boolean r1 = r5.hasNext()     // Catch:{ IOException -> 0x0071 }
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r5.next()     // Catch:{ IOException -> 0x0071 }
            od0.q r1 = (od0.C24573q) r1     // Catch:{ IOException -> 0x0071 }
            boolean r2 = r0.mo61217a()     // Catch:{ IOException -> 0x0071 }
            if (r2 != 0) goto L_0x006b
            int r2 = r1.f62302b     // Catch:{ IOException -> 0x0071 }
            int r3 = r4.f58851j     // Catch:{ IOException -> 0x0071 }
            if (r2 < r3) goto L_0x0061
            goto L_0x006b
        L_0x0061:
            int r2 = r2 + 1
            r1.f62302b = r2     // Catch:{ IOException -> 0x0071 }
            com.vungle.warren.persistence.a r2 = r4.f58854m     // Catch:{ IOException -> 0x0071 }
            r2.mo58288w(r1)     // Catch:{ IOException -> 0x0071 }
            goto L_0x0048
        L_0x006b:
            com.vungle.warren.persistence.a r2 = r4.f58854m     // Catch:{ IOException -> 0x0071 }
            r2.mo58271f(r1)     // Catch:{ IOException -> 0x0071 }
            goto L_0x0048
        L_0x0071:
            r5 = move-exception
            r5.getLocalizedMessage()     // Catch:{ all -> 0x007f }
        L_0x0075:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f58852k     // Catch:{ all -> 0x007f }
            r0 = 0
            r5.set(r0)     // Catch:{ all -> 0x007f }
            monitor-exit(r4)
            goto L_0x007e
        L_0x007d:
            monitor-exit(r4)
        L_0x007e:
            return
        L_0x007f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C23181n1.m57207a(com.vungle.warren.n1, java.util.List):void");
    }

    /* renamed from: b */
    public static C23181n1 m57208b() {
        if (f58840o == null) {
            f58840o = new C23181n1();
        }
        return f58840o;
    }

    /* renamed from: c */
    public final synchronized boolean mo58249c(C24573q qVar) {
        SessionEvent sessionEvent = SessionEvent.INIT;
        SessionEvent sessionEvent2 = qVar.f62301a;
        if (sessionEvent == sessionEvent2) {
            this.f58853l++;
            return false;
        } else if (SessionEvent.INIT_END == sessionEvent2) {
            int i = this.f58853l;
            if (i <= 0) {
                return true;
            }
            this.f58853l = i - 1;
            return false;
        } else if (SessionEvent.LOAD_AD == sessionEvent2) {
            this.f58848g.add(qVar.mo60845a(SessionAttribute.PLACEMENT_ID));
            return false;
        } else if (SessionEvent.LOAD_AD_END == sessionEvent2) {
            ArrayList arrayList = this.f58848g;
            SessionAttribute sessionAttribute = SessionAttribute.PLACEMENT_ID;
            if (!arrayList.contains(qVar.mo60845a(sessionAttribute))) {
                return true;
            }
            this.f58848g.remove(qVar.mo60845a(sessionAttribute));
            return false;
        } else if (SessionEvent.ADS_CACHED != sessionEvent2) {
            return false;
        } else {
            SessionAttribute sessionAttribute2 = SessionAttribute.VIDEO_CACHED;
            if (qVar.mo60845a(sessionAttribute2) == null) {
                this.f58849h.put(qVar.mo60845a(SessionAttribute.URL), qVar);
                return true;
            }
            HashMap hashMap = this.f58849h;
            SessionAttribute sessionAttribute3 = SessionAttribute.URL;
            C24573q qVar2 = (C24573q) hashMap.get(qVar.mo60845a(sessionAttribute3));
            if (qVar2 != null) {
                this.f58849h.remove(qVar.mo60845a(sessionAttribute3));
                C13450g remove = qVar.f62303c.f33306b.remove(sessionAttribute3.toString());
                SessionAttribute sessionAttribute4 = SessionAttribute.EVENT_ID;
                qVar.f62303c.mo40349F(sessionAttribute4.toString(), qVar2.mo60845a(sessionAttribute4));
                return false;
            }
            return !qVar.mo60845a(sessionAttribute2).equals("none");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final synchronized void mo58250d(od0.C24573q r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L_0x0005
            monitor-exit(r2)
            return
        L_0x0005:
            boolean r0 = r2.f58844c     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x0010
            java.util.List<od0.q> r0 = r2.f58847f     // Catch:{ all -> 0x002c }
            r0.add(r3)     // Catch:{ all -> 0x002c }
            monitor-exit(r2)
            return
        L_0x0010:
            boolean r0 = r2.mo58249c(r3)     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x002a
            monitor-enter(r2)     // Catch:{ all -> 0x002c }
            java.util.concurrent.ExecutorService r0 = r2.f58843b     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x001d
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x001d:
            com.vungle.warren.m1 r1 = new com.vungle.warren.m1     // Catch:{ all -> 0x0027 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
            r0.submit(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            goto L_0x002a
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r3     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r2)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C23181n1.mo58250d(od0.q):void");
    }
}
