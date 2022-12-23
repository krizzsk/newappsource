package f10;

import android.content.Context;
import android.content.SharedPreferences;
import com.moovit.gcm.topic.GcmTopicManager;
import f00.C16919g;
import java.util.Collections;
import p824tp.C19722a0;
import y90.C13272f;

/* renamed from: f10.f */
public final class C16935f {

    /* renamed from: a */
    public static final C16919g.C16928i f43949a = new C16919g.C16928i("regId", (String) null);

    /* renamed from: b */
    public static final C16919g.C16928i f43950b = new C16919g.C16928i("gcmNotificationId", (String) null);

    /* renamed from: c */
    public static final C16919g.C16929j f43951c = new C16919g.C16929j("gcmSubscribedTopics", Collections.emptySet());

    /* renamed from: d */
    public static final C16919g.C16920a f43952d = new C16919g.C16920a("user_metro_topic_enabled", true);

    /* renamed from: e */
    public static final C16919g.C16920a f43953e = new C16919g.C16920a("gcm_registration_token_refresh_required", true);

    /* renamed from: a */
    public static synchronized SharedPreferences m42758a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (C16935f.class) {
            sharedPreferences = context.getSharedPreferences("GcmPrefs", 0);
        }
        return sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized String m42759b(Context context) {
        String e;
        synchronized (C16935f.class) {
            e = f43949a.mo19759a(m42758a(context));
        }
        return e;
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
    /* renamed from: c */
    public static synchronized boolean m42760c(android.content.Context r3) {
        /*
            java.lang.Class<f10.f> r0 = f10.C16935f.class
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0023 }
            f00.g$a r1 = f43953e     // Catch:{ all -> 0x0020 }
            android.content.SharedPreferences r2 = m42758a(r3)     // Catch:{ all -> 0x0020 }
            java.lang.Boolean r1 = r1.mo19759a(r2)     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x001d
            java.lang.String r3 = m42759b(r3)     // Catch:{ all -> 0x0023 }
            if (r3 == 0) goto L_0x001d
            r3 = 1
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            monitor-exit(r0)
            return r3
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r3     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f10.C16935f.m42760c(android.content.Context):boolean");
    }

    /* renamed from: d */
    public static synchronized void m42761d(Context context, String str) {
        synchronized (C16935f.class) {
            f43950b.mo49545d(m42758a(context), str);
        }
    }

    /* renamed from: e */
    public static synchronized void m42762e(Context context, String str) {
        synchronized (C16935f.class) {
            f43949a.mo49545d(m42758a(context), str);
        }
    }

    /* renamed from: f */
    public static synchronized void m42763f(Context context, boolean z) {
        synchronized (C16935f.class) {
            f43953e.mo49545d(m42758a(context), Boolean.valueOf(z));
        }
    }

    /* renamed from: g */
    public static synchronized void m42764g(Context context, boolean z, C19722a0 a0Var) {
        synchronized (C16935f.class) {
            SharedPreferences a = m42758a(context);
            C16919g.C16920a aVar = f43952d;
            if (aVar.mo19759a(a).booleanValue() != z) {
                aVar.mo49545d(a, Boolean.valueOf(z));
                String str = GcmTopicManager.f41617b;
                C13272f fVar = a0Var.f50160a;
                GcmTopicManager.m40721a(context, fVar.f32927c, fVar.f32926b);
            }
        }
    }
}
