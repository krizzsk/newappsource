package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.p414v1.ApplicationProcessState;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p145k5.C5485d;
import p556if.C17592a;
import p556if.C17595b;
import p721pf.C18921a;

@Keep
public class SessionManager extends C17595b {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final C17592a appStateMonitor;
    private final Set<WeakReference<C18921a>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.m36081d(), C17592a.m43719a());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession2) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession2.f36652d) {
            this.gaugeManager.logGaugeMetadata(perfSession2.f36650b, ApplicationProcessState.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession2 = this.perfSession;
        if (perfSession2.f36652d) {
            this.gaugeManager.logGaugeMetadata(perfSession2.f36650b, applicationProcessState);
        }
    }

    private void startOrStopCollectingGauges(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession2 = this.perfSession;
        if (perfSession2.f36652d) {
            this.gaugeManager.startCollectingGauges(perfSession2, applicationProcessState);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        super.onUpdateAppState(applicationProcessState);
        if (!this.appStateMonitor.f45261r) {
            if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
                updatePerfSession(applicationProcessState);
            } else if (!updatePerfSessionIfExpired()) {
                startOrStopCollectingGauges(applicationProcessState);
            }
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<C18921a> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new C5485d(2, this, context, this.perfSession));
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession2) {
        this.perfSession = perfSession2;
    }

    public void unregisterForSessionUpdates(WeakReference<C18921a> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(ApplicationProcessState applicationProcessState) {
        synchronized (this.clients) {
            this.perfSession = PerfSession.m36081d();
            Iterator<WeakReference<C18921a>> it = this.clients.iterator();
            while (it.hasNext()) {
                C18921a aVar = (C18921a) it.next().get();
                if (aVar != null) {
                    aVar.mo43467b(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean updatePerfSessionIfExpired() {
        /*
            r12 = this;
            com.google.firebase.perf.session.PerfSession r0 = r12.perfSession
            r0.getClass()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            com.google.firebase.perf.util.Timer r0 = r0.f36651c
            long r2 = r0.mo43519b()
            long r0 = r1.toMinutes(r2)
            jf.a r2 = p578jf.C17823a.m44161e()
            r2.getClass()
            java.lang.Class<jf.m> r3 = p578jf.C17835m.class
            monitor-enter(r3)
            jf.m r4 = p578jf.C17835m.f45804b     // Catch:{ all -> 0x00d2 }
            if (r4 != 0) goto L_0x0026
            jf.m r4 = new jf.m     // Catch:{ all -> 0x00d2 }
            r4.<init>()     // Catch:{ all -> 0x00d2 }
            p578jf.C17835m.f45804b = r4     // Catch:{ all -> 0x00d2 }
        L_0x0026:
            jf.m r4 = p578jf.C17835m.f45804b     // Catch:{ all -> 0x00d2 }
            monitor-exit(r3)
            sf.b r3 = r2.mo50412j(r4)
            boolean r5 = r3.mo51862b()
            r6 = 0
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0055
            java.lang.Object r5 = r3.mo51861a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r10 = r5.longValue()
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            if (r5 == 0) goto L_0x0055
            java.lang.Object r2 = r3.mo51861a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00c0
        L_0x0055:
            sf.b r3 = r2.mo50414l(r4)
            boolean r5 = r3.mo51862b()
            if (r5 == 0) goto L_0x008e
            java.lang.Object r5 = r3.mo51861a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r10 = r5.longValue()
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x006f
            r5 = 1
            goto L_0x0070
        L_0x006f:
            r5 = 0
        L_0x0070:
            if (r5 == 0) goto L_0x008e
            jf.t r2 = r2.f45792c
            java.lang.String r4 = "com.google.firebase.perf.SessionsMaxDurationMinutes"
            java.lang.Object r5 = r3.mo51861a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r2.mo50419d(r5, r4)
            java.lang.Object r2 = r3.mo51861a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00c0
        L_0x008e:
            sf.b r2 = r2.mo50406c(r4)
            boolean r3 = r2.mo51862b()
            if (r3 == 0) goto L_0x00b6
            java.lang.Object r3 = r2.mo51861a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a8
            r3 = 1
            goto L_0x00a9
        L_0x00a8:
            r3 = 0
        L_0x00a9:
            if (r3 == 0) goto L_0x00b6
            java.lang.Object r2 = r2.mo51861a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00c0
        L_0x00b6:
            r2 = 240(0xf0, double:1.186E-321)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r2 = r2.longValue()
        L_0x00c0:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c6
            r0 = 1
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            if (r0 == 0) goto L_0x00d1
            if.a r0 = r12.appStateMonitor
            com.google.firebase.perf.v1.ApplicationProcessState r0 = r0.f45259p
            r12.updatePerfSession(r0)
            return r8
        L_0x00d1:
            return r9
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.SessionManager.updatePerfSessionIfExpired():boolean");
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager2, PerfSession perfSession2, C17592a aVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager2;
        this.perfSession = perfSession2;
        this.appStateMonitor = aVar;
        registerForAppState();
    }
}
