package com.facebook.internal;

import com.facebook.LoggingBehavior;
import java.util.HashMap;
import mf0.C24362h;
import p009a8.C0115o;

/* renamed from: com.facebook.internal.x */
public final class C2436x {

    /* renamed from: d */
    public static final C2437a f8729d = new C2437a();

    /* renamed from: e */
    public static final HashMap<String, String> f8730e = new HashMap<>();

    /* renamed from: a */
    public final LoggingBehavior f8731a;

    /* renamed from: b */
    public final String f8732b = C24362h.m61216k("Request", "FacebookSDK.");

    /* renamed from: c */
    public StringBuilder f8733c = new StringBuilder();

    /* renamed from: com.facebook.internal.x$a */
    public static final class C2437a {
        /* renamed from: a */
        public static void m6389a(LoggingBehavior loggingBehavior, String str, String str2) {
            C24362h.m61211f(loggingBehavior, "behavior");
            C24362h.m61211f(str, "tag");
            C24362h.m61211f(str2, "string");
            m6391c(loggingBehavior, str, str2);
        }

        /* renamed from: b */
        public static void m6390b(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
            C24362h.m61211f(loggingBehavior, "behavior");
            C24362h.m61211f(str, "tag");
            C0115o.m218i(loggingBehavior);
        }

        /* renamed from: c */
        public static void m6391c(LoggingBehavior loggingBehavior, String str, String str2) {
            C24362h.m61211f(loggingBehavior, "behavior");
            C24362h.m61211f(str, "tag");
            C24362h.m61211f(str2, "string");
            C0115o.m218i(loggingBehavior);
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
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: d */
        public final synchronized void mo12597d(java.lang.String r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.lang.String r0 = "accessToken"
                mf0.C24362h.m61211f(r3, r0)     // Catch:{ all -> 0x001b }
                a8.o r0 = p009a8.C0115o.f331a     // Catch:{ all -> 0x001b }
                com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.INCLUDE_ACCESS_TOKENS     // Catch:{ all -> 0x001b }
                p009a8.C0115o.m218i(r0)     // Catch:{ all -> 0x001b }
                java.lang.String r0 = "ACCESS_TOKEN_REMOVED"
                monitor-enter(r2)     // Catch:{ all -> 0x001b }
                java.util.HashMap<java.lang.String, java.lang.String> r1 = com.facebook.internal.C2436x.f8730e     // Catch:{ all -> 0x0018 }
                r1.put(r3, r0)     // Catch:{ all -> 0x0018 }
                monitor-exit(r2)     // Catch:{ all -> 0x001b }
                monitor-exit(r2)
                return
            L_0x0018:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x001b }
                throw r3     // Catch:{ all -> 0x001b }
            L_0x001b:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2436x.C2437a.mo12597d(java.lang.String):void");
        }
    }

    public C2436x(LoggingBehavior loggingBehavior) {
        C24362h.m61211f(loggingBehavior, "behavior");
        this.f8731a = loggingBehavior;
        C2400g0.m6341f("Request", "tag");
    }

    /* renamed from: a */
    public final void mo12594a(Object obj, String str) {
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        C24362h.m61211f(obj, "value");
        mo12596c();
    }

    /* renamed from: b */
    public final void mo12595b() {
        String sb = this.f8733c.toString();
        C24362h.m61210e(sb, "contents.toString()");
        C2437a.m6391c(this.f8731a, this.f8732b, sb);
        this.f8733c = new StringBuilder();
    }

    /* renamed from: c */
    public final void mo12596c() {
        C0115o oVar = C0115o.f331a;
        C0115o.m218i(this.f8731a);
    }
}
