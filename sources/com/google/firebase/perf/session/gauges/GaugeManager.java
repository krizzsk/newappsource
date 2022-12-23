package com.google.firebase.perf.session.gauges;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.C0510d;
import com.google.firebase.perf.p414v1.ApplicationProcessState;
import com.google.firebase.perf.p414v1.C14517e;
import com.google.firebase.perf.p414v1.C14520f;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p039c7.C1801d;
import p304x.C7041e;
import p304x.C7109v;
import p404ce.C13802o;
import p404ce.C13804q;
import p578jf.C17823a;
import p578jf.C17833k;
import p578jf.C17834l;
import p578jf.C17836n;
import p578jf.C17837o;
import p626lf.C18200a;
import p744qf.C19114a;
import p744qf.C19115b;
import p744qf.C19116c;
import p744qf.C19117d;
import p744qf.C19118e;
import p766rf.C19260d;
import p790sf.C19454b;
import p790sf.C19458e;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final C18200a logger = C18200a.m44901d();
    private ApplicationProcessState applicationProcessState;
    private final C17823a configResolver;
    private final C13802o<C19114a> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C13802o<ScheduledExecutorService> gaugeManagerExecutor;
    private C19117d gaugeMetadataManager;
    private final C13802o<C19118e> memoryGaugeCollector;
    private String sessionId;
    private final C19260d transportManager;

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$a */
    public static /* synthetic */ class C14482a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36653a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.perf.v1.ApplicationProcessState[] r0 = com.google.firebase.perf.p414v1.ApplicationProcessState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36653a = r0
                com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.p414v1.ApplicationProcessState.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36653a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.perf.v1.ApplicationProcessState r1 = com.google.firebase.perf.p414v1.ApplicationProcessState.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.gauges.GaugeManager.C14482a.<clinit>():void");
        }
    }

    private GaugeManager() {
        this(new C13802o(new C13804q(1)), C19260d.f48934t, C17823a.m44161e(), (C19117d) null, new C13802o(new C19115b()), new C13802o(new C19116c()));
    }

    private static void collectGaugeMetricOnce(C19114a aVar, C19118e eVar, Timer timer) {
        synchronized (aVar) {
            try {
                aVar.f48591b.schedule(new C7041e(13, aVar, timer), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C18200a aVar2 = C19114a.f48588g;
                e.getMessage();
                aVar2.mo50614f();
            }
        }
        synchronized (eVar) {
            try {
                eVar.f48602a.schedule(new C7109v(10, eVar, timer), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                C18200a aVar3 = C19118e.f48601f;
                e2.getMessage();
                aVar3.mo50614f();
            }
        }
        return;
    }

    private long getCpuGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState2) {
        long j;
        C17833k kVar;
        C17834l lVar;
        int i = C14482a.f36653a[applicationProcessState2.ordinal()];
        boolean z = true;
        if (i == 1) {
            C17823a aVar = this.configResolver;
            aVar.getClass();
            synchronized (C17833k.class) {
                if (C17833k.f45802b == null) {
                    C17833k.f45802b = new C17833k();
                }
                kVar = C17833k.f45802b;
            }
            C19454b<Long> j2 = aVar.mo50412j(kVar);
            if (!j2.mo51862b() || !C17823a.m44164o(j2.mo51861a().longValue())) {
                C19454b<Long> l = aVar.mo50414l(kVar);
                if (!l.mo51862b() || !C17823a.m44164o(l.mo51861a().longValue())) {
                    C19454b<Long> c = aVar.mo50406c(kVar);
                    if (!c.mo51862b() || !C17823a.m44164o(c.mo51861a().longValue())) {
                        Long l2 = 0L;
                        j = l2.longValue();
                    } else {
                        j = c.mo51861a().longValue();
                    }
                } else {
                    aVar.f45792c.mo50419d(l.mo51861a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    j = l.mo51861a().longValue();
                }
            } else {
                j = j2.mo51861a().longValue();
            }
        } else if (i != 2) {
            j = -1;
        } else {
            C17823a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (C17834l.class) {
                if (C17834l.f45803b == null) {
                    C17834l.f45803b = new C17834l();
                }
                lVar = C17834l.f45803b;
            }
            C19454b<Long> j3 = aVar2.mo50412j(lVar);
            if (!j3.mo51862b() || !C17823a.m44164o(j3.mo51861a().longValue())) {
                C19454b<Long> l3 = aVar2.mo50414l(lVar);
                if (!l3.mo51862b() || !C17823a.m44164o(l3.mo51861a().longValue())) {
                    C19454b<Long> c2 = aVar2.mo50406c(lVar);
                    if (!c2.mo51862b() || !C17823a.m44164o(c2.mo51861a().longValue())) {
                        Long l4 = 100L;
                        j = l4.longValue();
                    } else {
                        j = c2.mo51861a().longValue();
                    }
                } else {
                    aVar2.f45792c.mo50419d(l3.mo51861a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    j = l3.mo51861a().longValue();
                }
            } else {
                j = j3.mo51861a().longValue();
            }
        }
        C18200a aVar3 = C19114a.f48588g;
        if (j > 0) {
            z = false;
        }
        if (z) {
            return -1;
        }
        return j;
    }

    private C14517e getGaugeMetadata() {
        C14517e.C14519b z = C14517e.m36170z();
        String str = this.gaugeMetadataManager.f48599d;
        z.mo43956p();
        C14517e.m36165t((C14517e) z.f36809c, str);
        C19117d dVar = this.gaugeMetadataManager;
        dVar.getClass();
        StorageUnit storageUnit = StorageUnit.BYTES;
        int b = C19458e.m46856b(storageUnit.toKilobytes(dVar.f48598c.totalMem));
        z.mo43956p();
        C14517e.m36168w((C14517e) z.f36809c, b);
        C19117d dVar2 = this.gaugeMetadataManager;
        dVar2.getClass();
        int b2 = C19458e.m46856b(storageUnit.toKilobytes(dVar2.f48596a.maxMemory()));
        z.mo43956p();
        C14517e.m36166u((C14517e) z.f36809c, b2);
        C19117d dVar3 = this.gaugeMetadataManager;
        dVar3.getClass();
        int b3 = C19458e.m46856b(StorageUnit.MEGABYTES.toKilobytes((long) dVar3.f48597b.getMemoryClass()));
        z.mo43956p();
        C14517e.m36167v((C14517e) z.f36809c, b3);
        return (C14517e) z.mo43954m();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(ApplicationProcessState applicationProcessState2) {
        long j;
        C17836n nVar;
        C17837o oVar;
        int i = C14482a.f36653a[applicationProcessState2.ordinal()];
        boolean z = true;
        if (i == 1) {
            C17823a aVar = this.configResolver;
            aVar.getClass();
            synchronized (C17836n.class) {
                if (C17836n.f45805b == null) {
                    C17836n.f45805b = new C17836n();
                }
                nVar = C17836n.f45805b;
            }
            C19454b<Long> j2 = aVar.mo50412j(nVar);
            if (!j2.mo51862b() || !C17823a.m44164o(j2.mo51861a().longValue())) {
                C19454b<Long> l = aVar.mo50414l(nVar);
                if (!l.mo51862b() || !C17823a.m44164o(l.mo51861a().longValue())) {
                    C19454b<Long> c = aVar.mo50406c(nVar);
                    if (!c.mo51862b() || !C17823a.m44164o(c.mo51861a().longValue())) {
                        Long l2 = 0L;
                        j = l2.longValue();
                    } else {
                        j = c.mo51861a().longValue();
                    }
                } else {
                    aVar.f45792c.mo50419d(l.mo51861a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    j = l.mo51861a().longValue();
                }
            } else {
                j = j2.mo51861a().longValue();
            }
        } else if (i != 2) {
            j = -1;
        } else {
            C17823a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (C17837o.class) {
                if (C17837o.f45806b == null) {
                    C17837o.f45806b = new C17837o();
                }
                oVar = C17837o.f45806b;
            }
            C19454b<Long> j3 = aVar2.mo50412j(oVar);
            if (!j3.mo51862b() || !C17823a.m44164o(j3.mo51861a().longValue())) {
                C19454b<Long> l3 = aVar2.mo50414l(oVar);
                if (!l3.mo51862b() || !C17823a.m44164o(l3.mo51861a().longValue())) {
                    C19454b<Long> c2 = aVar2.mo50406c(oVar);
                    if (!c2.mo51862b() || !C17823a.m44164o(c2.mo51861a().longValue())) {
                        Long l4 = 100L;
                        j = l4.longValue();
                    } else {
                        j = c2.mo51861a().longValue();
                    }
                } else {
                    aVar2.f45792c.mo50419d(l3.mo51861a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    j = l3.mo51861a().longValue();
                }
            } else {
                j = j3.mo51861a().longValue();
            }
        }
        C18200a aVar3 = C19118e.f48601f;
        if (j > 0) {
            z = false;
        }
        if (z) {
            return -1;
        }
        return j;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C19114a lambda$new$1() {
        return new C19114a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C19118e lambda$new$2() {
        return new C19118e();
    }

    private boolean startCollectingCpuMetrics(long j, Timer timer) {
        boolean z;
        if (j == -1) {
            logger.mo50610a();
            return false;
        }
        C19114a aVar = this.cpuGaugeCollector.get();
        long j2 = aVar.f48593d;
        if (!(j2 == -1 || j2 == 0)) {
            if (j <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ScheduledFuture scheduledFuture = aVar.f48594e;
                if (scheduledFuture == null) {
                    aVar.mo51549a(j, timer);
                } else if (aVar.f48595f != j) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        aVar.f48594e = null;
                        aVar.f48595f = -1;
                    }
                    aVar.mo51549a(j, timer);
                }
            }
        }
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, Timer timer) {
        boolean z;
        if (j == -1) {
            logger.mo50610a();
            return false;
        }
        C19118e eVar = this.memoryGaugeCollector.get();
        C18200a aVar = C19118e.f48601f;
        if (j <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar.getClass();
        } else {
            ScheduledFuture scheduledFuture = eVar.f48605d;
            if (scheduledFuture == null) {
                eVar.mo51551a(j, timer);
            } else if (eVar.f48606e != j) {
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    eVar.f48605d = null;
                    eVar.f48606e = -1;
                }
                eVar.mo51551a(j, timer);
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$4(String str, ApplicationProcessState applicationProcessState2) {
        C14520f.C14522b D = C14520f.m36173D();
        while (!this.cpuGaugeCollector.get().f48590a.isEmpty()) {
            D.mo43956p();
            C14520f.m36178w((C14520f) D.f36809c, this.cpuGaugeCollector.get().f48590a.poll());
        }
        while (!this.memoryGaugeCollector.get().f48603b.isEmpty()) {
            D.mo43956p();
            C14520f.m36176u((C14520f) D.f36809c, this.memoryGaugeCollector.get().f48603b.poll());
        }
        D.mo43956p();
        C14520f.m36175t((C14520f) D.f36809c, str);
        C19260d dVar = this.transportManager;
        dVar.f48943j.execute(new C0510d(3, dVar, (C14520f) D.mo43954m(), applicationProcessState2));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C19117d(context);
    }

    public boolean logGaugeMetadata(String str, ApplicationProcessState applicationProcessState2) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        C14520f.C14522b D = C14520f.m36173D();
        D.mo43956p();
        C14520f.m36175t((C14520f) D.f36809c, str);
        C14517e gaugeMetadata = getGaugeMetadata();
        D.mo43956p();
        C14520f.m36177v((C14520f) D.f36809c, gaugeMetadata);
        C19260d dVar = this.transportManager;
        dVar.f48943j.execute(new C0510d(3, dVar, (C14520f) D.mo43954m(), applicationProcessState2));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, ApplicationProcessState applicationProcessState2) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(applicationProcessState2, perfSession.f36651c);
        if (startCollectingGauges == -1) {
            logger.mo50614f();
            return;
        }
        String str = perfSession.f36650b;
        this.sessionId = str;
        this.applicationProcessState = applicationProcessState2;
        try {
            long j = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new C0510d(2, this, str, applicationProcessState2), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C18200a aVar = logger;
            e.getMessage();
            aVar.mo50614f();
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            ApplicationProcessState applicationProcessState2 = this.applicationProcessState;
            C19114a aVar = this.cpuGaugeCollector.get();
            ScheduledFuture scheduledFuture = aVar.f48594e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                aVar.f48594e = null;
                aVar.f48595f = -1;
            }
            C19118e eVar = this.memoryGaugeCollector.get();
            ScheduledFuture scheduledFuture2 = eVar.f48605d;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                eVar.f48605d = null;
                eVar.f48606e = -1;
            }
            ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture3 != null) {
                scheduledFuture3.cancel(false);
            }
            this.gaugeManagerExecutor.get().schedule(new C1801d(3, this, str, applicationProcessState2), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    public GaugeManager(C13802o<ScheduledExecutorService> oVar, C19260d dVar, C17823a aVar, C19117d dVar2, C13802o<C19114a> oVar2, C13802o<C19118e> oVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = oVar;
        this.transportManager = dVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = dVar2;
        this.cpuGaugeCollector = oVar2;
        this.memoryGaugeCollector = oVar3;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    private long startCollectingGauges(ApplicationProcessState applicationProcessState2, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(applicationProcessState2);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(applicationProcessState2);
        if (!startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs;
        }
        if (cpuGaugeCollectionFrequencyMs == -1) {
            return memoryGaugeCollectionFrequencyMs;
        }
        return Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
    }
}
