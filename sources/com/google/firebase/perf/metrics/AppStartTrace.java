package com.google.firebase.perf.metrics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p258t4.C6587a;
import p766rf.C19260d;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m */
    public static final long f36620m = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: n */
    public static volatile AppStartTrace f36621n;

    /* renamed from: o */
    public static ExecutorService f36622o;

    /* renamed from: b */
    public boolean f36623b = false;

    /* renamed from: c */
    public final C19260d f36624c;

    /* renamed from: d */
    public final C6587a f36625d;

    /* renamed from: e */
    public Context f36626e;

    /* renamed from: f */
    public boolean f36627f = false;

    /* renamed from: g */
    public Timer f36628g = null;

    /* renamed from: h */
    public Timer f36629h = null;

    /* renamed from: i */
    public Timer f36630i = null;

    /* renamed from: j */
    public Timer f36631j = null;

    /* renamed from: k */
    public PerfSession f36632k;

    /* renamed from: l */
    public boolean f36633l = false;

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$a */
    public static class C14478a implements Runnable {

        /* renamed from: b */
        public final AppStartTrace f36634b;

        public C14478a(AppStartTrace appStartTrace) {
            this.f36634b = appStartTrace;
        }

        public final void run() {
            AppStartTrace appStartTrace = this.f36634b;
            if (appStartTrace.f36629h == null) {
                appStartTrace.f36633l = true;
            }
        }
    }

    public AppStartTrace(C19260d dVar, C6587a aVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f36624c = dVar;
        this.f36625d = aVar;
        f36622o = threadPoolExecutor;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f36633l     // Catch:{ all -> 0x0032 }
            if (r5 != 0) goto L_0x0030
            com.google.firebase.perf.util.Timer r5 = r3.f36629h     // Catch:{ all -> 0x0032 }
            if (r5 == 0) goto L_0x000a
            goto L_0x0030
        L_0x000a:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0032 }
            r5.<init>(r4)     // Catch:{ all -> 0x0032 }
            t4.a r4 = r3.f36625d     // Catch:{ all -> 0x0032 }
            r4.getClass()     // Catch:{ all -> 0x0032 }
            com.google.firebase.perf.util.Timer r4 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x0032 }
            r4.<init>()     // Catch:{ all -> 0x0032 }
            r3.f36629h = r4     // Catch:{ all -> 0x0032 }
            com.google.firebase.perf.util.Timer r4 = com.google.firebase.perf.provider.FirebasePerfProvider.getAppStartTime()     // Catch:{ all -> 0x0032 }
            com.google.firebase.perf.util.Timer r5 = r3.f36629h     // Catch:{ all -> 0x0032 }
            long r4 = r4.mo43520c(r5)     // Catch:{ all -> 0x0032 }
            long r0 = f36620m     // Catch:{ all -> 0x0032 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x002e
            r4 = 1
            r3.f36627f = r4     // Catch:{ all -> 0x0032 }
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            monitor-exit(r3)
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void onActivityResumed(android.app.Activity r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f36633l     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            com.google.firebase.perf.util.Timer r0 = r2.f36631j     // Catch:{ all -> 0x006a }
            if (r0 != 0) goto L_0x0068
            boolean r0 = r2.f36627f     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x000e
            goto L_0x0068
        L_0x000e:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x006a }
            r0.<init>(r3)     // Catch:{ all -> 0x006a }
            t4.a r0 = r2.f36625d     // Catch:{ all -> 0x006a }
            r0.getClass()     // Catch:{ all -> 0x006a }
            com.google.firebase.perf.util.Timer r0 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x006a }
            r0.<init>()     // Catch:{ all -> 0x006a }
            r2.f36631j = r0     // Catch:{ all -> 0x006a }
            com.google.firebase.perf.util.Timer r0 = com.google.firebase.perf.provider.FirebasePerfProvider.getAppStartTime()     // Catch:{ all -> 0x006a }
            r2.f36628g = r0     // Catch:{ all -> 0x006a }
            com.google.firebase.perf.session.SessionManager r0 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x006a }
            com.google.firebase.perf.session.PerfSession r0 = r0.perfSession()     // Catch:{ all -> 0x006a }
            r2.f36632k = r0     // Catch:{ all -> 0x006a }
            lf.a r0 = p626lf.C18200a.m44901d()     // Catch:{ all -> 0x006a }
            r3.getClass()     // Catch:{ all -> 0x006a }
            com.google.firebase.perf.util.Timer r3 = r2.f36628g     // Catch:{ all -> 0x006a }
            com.google.firebase.perf.util.Timer r1 = r2.f36631j     // Catch:{ all -> 0x006a }
            r3.mo43520c(r1)     // Catch:{ all -> 0x006a }
            r0.mo50610a()     // Catch:{ all -> 0x006a }
            java.util.concurrent.ExecutorService r3 = f36622o     // Catch:{ all -> 0x006a }
            androidx.activity.g r0 = new androidx.activity.g     // Catch:{ all -> 0x006a }
            r1 = 9
            r0.<init>(r2, r1)     // Catch:{ all -> 0x006a }
            r3.execute(r0)     // Catch:{ all -> 0x006a }
            boolean r3 = r2.f36623b     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x0066
            monitor-enter(r2)     // Catch:{ all -> 0x006a }
            boolean r3 = r2.f36623b     // Catch:{ all -> 0x0063 }
            if (r3 != 0) goto L_0x0057
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            goto L_0x0066
        L_0x0057:
            android.content.Context r3 = r2.f36626e     // Catch:{ all -> 0x0063 }
            android.app.Application r3 = (android.app.Application) r3     // Catch:{ all -> 0x0063 }
            r3.unregisterActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0063 }
            r3 = 0
            r2.f36623b = r3     // Catch:{ all -> 0x0063 }
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            goto L_0x0066
        L_0x0063:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r3     // Catch:{ all -> 0x006a }
        L_0x0066:
            monitor-exit(r2)
            return
        L_0x0068:
            monitor-exit(r2)
            return
        L_0x006a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.f36633l     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001c
            com.google.firebase.perf.util.Timer r1 = r0.f36630i     // Catch:{ all -> 0x001e }
            if (r1 != 0) goto L_0x001c
            boolean r1 = r0.f36627f     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x000e
            goto L_0x001c
        L_0x000e:
            t4.a r1 = r0.f36625d     // Catch:{ all -> 0x001e }
            r1.getClass()     // Catch:{ all -> 0x001e }
            com.google.firebase.perf.util.Timer r1 = new com.google.firebase.perf.util.Timer     // Catch:{ all -> 0x001e }
            r1.<init>()     // Catch:{ all -> 0x001e }
            r0.f36630i = r1     // Catch:{ all -> 0x001e }
            monitor-exit(r0)
            return
        L_0x001c:
            monitor-exit(r0)
            return
        L_0x001e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public final synchronized void onActivityStopped(Activity activity) {
    }
}
