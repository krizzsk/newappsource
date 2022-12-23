package p766rf;

import android.content.Context;
import com.google.firebase.perf.p414v1.ApplicationProcessState;
import com.google.firebase.perf.p414v1.C14510c;
import com.google.firebase.perf.p414v1.C14520f;
import com.google.firebase.perf.p414v1.C14523g;
import com.google.firebase.perf.p414v1.C14530i;
import com.google.firebase.perf.p414v1.NetworkRequestMetric;
import com.google.firebase.perf.util.Constants$CounterNames;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p237r9.C6273f;
import p304x.C7082o;
import p358af.C13436c;
import p532hf.C17427b;
import p556if.C17592a;
import p578jf.C17823a;
import p626lf.C18200a;
import p743qd.C19107d;
import p814tf.C19670a;
import p956ze.C20839b;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: rf.d */
public final class C19260d implements C17592a.C17594b {

    /* renamed from: s */
    public static final C18200a f48933s = C18200a.m44901d();

    /* renamed from: t */
    public static final C19260d f48934t = new C19260d();

    /* renamed from: b */
    public final ConcurrentHashMap f48935b;

    /* renamed from: c */
    public final ConcurrentLinkedQueue<C19257b> f48936c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    public final AtomicBoolean f48937d = new AtomicBoolean(false);

    /* renamed from: e */
    public C19107d f48938e;

    /* renamed from: f */
    public C17427b f48939f;

    /* renamed from: g */
    public C13436c f48940g;

    /* renamed from: h */
    public C20839b<C6273f> f48941h;

    /* renamed from: i */
    public C19256a f48942i;

    /* renamed from: j */
    public ThreadPoolExecutor f48943j = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: k */
    public Context f48944k;

    /* renamed from: l */
    public C17823a f48945l;

    /* renamed from: m */
    public C19258c f48946m;

    /* renamed from: n */
    public C17592a f48947n;

    /* renamed from: o */
    public C14510c.C14512b f48948o;

    /* renamed from: p */
    public String f48949p;

    /* renamed from: q */
    public String f48950q;

    /* renamed from: r */
    public boolean f48951r = false;

    public C19260d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f48935b = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: a */
    public static String m46512a(C19670a aVar) {
        long j;
        String str;
        if (aVar.mo43563i()) {
            C14530i k = aVar.mo43564k();
            long H = k.mo43574H();
            return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{k.mo43575I(), new DecimalFormat("#.####").format(((double) H) / 1000.0d)});
        } else if (aVar.mo43561g()) {
            NetworkRequestMetric h = aVar.mo43562h();
            if (h.mo43544X()) {
                j = h.mo43535O();
            } else {
                j = 0;
            }
            if (h.mo43540T()) {
                str = String.valueOf(h.mo43530J());
            } else {
                str = "UNKNOWN";
            }
            return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{h.mo43537Q(), str, new DecimalFormat("#.####").format(((double) j) / 1000.0d)});
        } else if (!aVar.mo43560f()) {
            return "log";
        } else {
            C14520f l = aVar.mo43565l();
            return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(l.mo43556B()), Integer.valueOf(l.mo43559y()), Integer.valueOf(l.mo43558x())});
        }
    }

    /* renamed from: b */
    public final void mo51680b(C14523g gVar) {
        if (gVar.mo43563i()) {
            this.f48947n.mo50054b(Constants$CounterNames.TRACE_EVENT_RATE_LIMITED.toString());
        } else if (gVar.mo43561g()) {
            this.f48947n.mo50054b(Constants$CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: com.google.protobuf.GeneratedMessageLite$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: com.google.firebase.perf.v1.c$b} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0301, code lost:
        if (p766rf.C19258c.m46510a(r13.mo43564k().mo43576J()) == false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x035e, code lost:
        if (p578jf.C17823a.m44165q(r7) != false) goto L_0x03c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03e0, code lost:
        if (p766rf.C19258c.m46510a(r13.mo43564k().mo43576J()) == false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0480, code lost:
        if (p766rf.C19258c.m46510a(r13.mo43562h().mo43531K()) == false) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0482, code lost:
        r14 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x025d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51681c(com.google.firebase.perf.p414v1.C14523g.C14525b r13, com.google.firebase.perf.p414v1.ApplicationProcessState r14) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.f48937d
            boolean r0 = r0.get()
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x00af
            j$.util.concurrent.ConcurrentHashMap r0 = r12.f48935b
            java.lang.String r6 = "KEY_AVAILABLE_TRACES_FOR_CACHING"
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            j$.util.concurrent.ConcurrentHashMap r7 = r12.f48935b
            java.lang.String r8 = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"
            java.lang.Object r7 = r7.get(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            j$.util.concurrent.ConcurrentHashMap r9 = r12.f48935b
            java.lang.String r10 = "KEY_AVAILABLE_GAUGES_FOR_CACHING"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r11 = r13.mo43563i()
            if (r11 == 0) goto L_0x004a
            if (r0 <= 0) goto L_0x004a
            j$.util.concurrent.ConcurrentHashMap r1 = r12.f48935b
            int r0 = r0 - r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r6, r0)
            goto L_0x006f
        L_0x004a:
            boolean r6 = r13.mo43561g()
            if (r6 == 0) goto L_0x005d
            if (r7 <= 0) goto L_0x005d
            j$.util.concurrent.ConcurrentHashMap r0 = r12.f48935b
            int r7 = r7 - r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.put(r8, r1)
            goto L_0x006f
        L_0x005d:
            boolean r6 = r13.mo43560f()
            if (r6 == 0) goto L_0x0071
            if (r9 <= 0) goto L_0x0071
            j$.util.concurrent.ConcurrentHashMap r0 = r12.f48935b
            int r9 = r9 - r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0.put(r10, r1)
        L_0x006f:
            r0 = 1
            goto L_0x0093
        L_0x0071:
            lf.a r6 = f48933s
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r8 = m46512a(r13)
            r3[r4] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r3[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3[r1] = r0
            java.lang.String r0 = "%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d)."
            r6.mo50611b(r0, r3)
            r0 = 0
        L_0x0093:
            if (r0 == 0) goto L_0x00ae
            lf.a r0 = f48933s
            java.lang.String r1 = "Transport is not initialized yet, %s will be queued for to be dispatched later"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = m46512a(r13)
            r2[r4] = r3
            r0.mo50611b(r1, r2)
            java.util.concurrent.ConcurrentLinkedQueue<rf.b> r0 = r12.f48936c
            rf.b r1 = new rf.b
            r1.<init>(r13, r14)
            r0.add(r1)
        L_0x00ae:
            return
        L_0x00af:
            jf.a r0 = r12.f48945l
            boolean r0 = r0.mo50415p()
            if (r0 == 0) goto L_0x0126
            com.google.firebase.perf.v1.c$b r0 = r12.f48948o
            MessageType r0 = r0.f36809c
            com.google.firebase.perf.v1.c r0 = (com.google.firebase.perf.p414v1.C14510c) r0
            boolean r0 = r0.mo43550B()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r12.f48951r
            if (r0 != 0) goto L_0x00c8
            goto L_0x0126
        L_0x00c8:
            r0 = 0
            af.c r6 = r12.f48940g     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            com.google.android.gms.tasks.Task r6 = r6.getId()     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            r7 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6, r7, r9)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00ed, TimeoutException -> 0x00dc }
            r0 = r6
            goto L_0x010e
        L_0x00dc:
            r6 = move-exception
            lf.a r7 = f48933s
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r6 = r6.getMessage()
            r8[r4] = r6
            java.lang.String r6 = "Task to retrieve Installation Id is timed out: %s"
            r7.mo50612c(r6, r8)
            goto L_0x010e
        L_0x00ed:
            r6 = move-exception
            lf.a r7 = f48933s
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r6 = r6.getMessage()
            r8[r4] = r6
            java.lang.String r6 = "Task to retrieve Installation Id is interrupted: %s"
            r7.mo50612c(r6, r8)
            goto L_0x010e
        L_0x00fe:
            r6 = move-exception
            lf.a r7 = f48933s
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r6 = r6.getMessage()
            r8[r4] = r6
            java.lang.String r6 = "Unable to retrieve Installation Id: %s"
            r7.mo50612c(r6, r8)
        L_0x010e:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x0121
            com.google.firebase.perf.v1.c$b r6 = r12.f48948o
            r6.mo43956p()
            MessageType r6 = r6.f36809c
            com.google.firebase.perf.v1.c r6 = (com.google.firebase.perf.p414v1.C14510c) r6
            com.google.firebase.perf.p414v1.C14510c.m36149w(r6, r0)
            goto L_0x0126
        L_0x0121:
            lf.a r0 = f48933s
            r0.mo50614f()
        L_0x0126:
            com.google.firebase.perf.v1.c$b r0 = r12.f48948o
            r0.mo43956p()
            MessageType r6 = r0.f36809c
            com.google.firebase.perf.v1.c r6 = (com.google.firebase.perf.p414v1.C14510c) r6
            com.google.firebase.perf.p414v1.C14510c.m36147u(r6, r14)
            boolean r14 = r13.mo43563i()
            if (r14 != 0) goto L_0x013e
            boolean r14 = r13.mo43561g()
            if (r14 == 0) goto L_0x018a
        L_0x013e:
            MessageType r14 = r0.f36808b
            r14.getClass()
            com.google.protobuf.GeneratedMessageLite$MethodToInvoke r6 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER
            java.lang.Object r14 = r14.mo43546n(r6)
            com.google.protobuf.GeneratedMessageLite$a r14 = (com.google.protobuf.GeneratedMessageLite.C14572a) r14
            com.google.protobuf.GeneratedMessageLite r0 = r0.mo43955o()
            r14.mo43956p()
            MessageType r6 = r14.f36809c
            com.google.protobuf.GeneratedMessageLite.C14572a.m36511q(r6, r0)
            r0 = r14
            com.google.firebase.perf.v1.c$b r0 = (com.google.firebase.perf.p414v1.C14510c.C14512b) r0
            hf.b r14 = r12.f48939f
            if (r14 != 0) goto L_0x016c
            java.util.concurrent.atomic.AtomicBoolean r14 = r12.f48937d
            boolean r14 = r14.get()
            if (r14 == 0) goto L_0x016c
            hf.b r14 = p532hf.C17427b.m43467a()
            r12.f48939f = r14
        L_0x016c:
            hf.b r14 = r12.f48939f
            if (r14 == 0) goto L_0x0178
            java.util.HashMap r6 = new java.util.HashMap
            j$.util.concurrent.ConcurrentHashMap r14 = r14.f44886a
            r6.<init>(r14)
            goto L_0x017c
        L_0x0178:
            java.util.Map r6 = java.util.Collections.emptyMap()
        L_0x017c:
            r0.mo43956p()
            MessageType r14 = r0.f36809c
            com.google.firebase.perf.v1.c r14 = (com.google.firebase.perf.p414v1.C14510c) r14
            com.google.protobuf.MapFieldLite r14 = com.google.firebase.perf.p414v1.C14510c.m36148v(r14)
            r14.putAll(r6)
        L_0x018a:
            r13.mo43956p()
            MessageType r14 = r13.f36809c
            com.google.firebase.perf.v1.g r14 = (com.google.firebase.perf.p414v1.C14523g) r14
            com.google.protobuf.GeneratedMessageLite r0 = r0.mo43954m()
            com.google.firebase.perf.v1.c r0 = (com.google.firebase.perf.p414v1.C14510c) r0
            com.google.firebase.perf.p414v1.C14523g.m36187t(r14, r0)
            com.google.protobuf.GeneratedMessageLite r13 = r13.mo43954m()
            com.google.firebase.perf.v1.g r13 = (com.google.firebase.perf.p414v1.C14523g) r13
            jf.a r14 = r12.f48945l
            boolean r14 = r14.mo50415p()
            if (r14 != 0) goto L_0x01b9
            lf.a r14 = f48933s
            java.lang.String r0 = "Performance collection is not enabled, dropping %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = m46512a(r13)
            r6[r4] = r7
            r14.mo50613e(r0, r6)
            goto L_0x0519
        L_0x01b9:
            com.google.firebase.perf.v1.c r14 = r13.mo43566x()
            boolean r14 = r14.mo43550B()
            if (r14 != 0) goto L_0x01d4
            lf.a r14 = f48933s
            java.lang.String r0 = "App Instance ID is null or empty, dropping %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = m46512a(r13)
            r6[r4] = r7
            r14.mo50615g(r0, r6)
            goto L_0x0519
        L_0x01d4:
            android.content.Context r14 = r12.f48944k
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r6 = r13.mo43563i()
            if (r6 == 0) goto L_0x01ed
            nf.d r6 = new nf.d
            com.google.firebase.perf.v1.i r7 = r13.mo43564k()
            r6.<init>(r7)
            r0.add(r6)
        L_0x01ed:
            boolean r6 = r13.mo43561g()
            if (r6 == 0) goto L_0x01ff
            nf.c r6 = new nf.c
            com.google.firebase.perf.v1.NetworkRequestMetric r7 = r13.mo43562h()
            r6.<init>(r7, r14)
            r0.add(r6)
        L_0x01ff:
            boolean r14 = r13.mo43567y()
            if (r14 == 0) goto L_0x0211
            nf.a r14 = new nf.a
            com.google.firebase.perf.v1.c r6 = r13.mo43566x()
            r14.<init>(r6)
            r0.add(r14)
        L_0x0211:
            boolean r14 = r13.mo43560f()
            if (r14 == 0) goto L_0x0223
            nf.b r14 = new nf.b
            com.google.firebase.perf.v1.f r6 = r13.mo43565l()
            r14.<init>(r6)
            r0.add(r14)
        L_0x0223:
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto L_0x0231
            lf.a r14 = p626lf.C18200a.m44901d()
            r14.mo50610a()
            goto L_0x0247
        L_0x0231:
            java.util.Iterator r14 = r0.iterator()
        L_0x0235:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0249
            java.lang.Object r0 = r14.next()
            nf.e r0 = (p673nf.C18547e) r0
            boolean r0 = r0.mo50952a()
            if (r0 != 0) goto L_0x0235
        L_0x0247:
            r14 = 0
            goto L_0x024a
        L_0x0249:
            r14 = 1
        L_0x024a:
            if (r14 != 0) goto L_0x025d
            lf.a r14 = f48933s
            java.lang.String r0 = "Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values."
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = m46512a(r13)
            r6[r4] = r7
            r14.mo50615g(r0, r6)
            goto L_0x0519
        L_0x025d:
            rf.c r14 = r12.f48946m
            r14.getClass()
            boolean r0 = r13.mo43563i()
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            if (r0 == 0) goto L_0x0308
            jf.a r0 = r14.f48915a
            r0.getClass()
            java.lang.Class<jf.s> r7 = p578jf.C17841s.class
            monitor-enter(r7)
            jf.s r8 = p578jf.C17841s.f45810b     // Catch:{ all -> 0x0305 }
            if (r8 != 0) goto L_0x0281
            jf.s r8 = new jf.s     // Catch:{ all -> 0x0305 }
            r8.<init>()     // Catch:{ all -> 0x0305 }
            p578jf.C17841s.f45810b = r8     // Catch:{ all -> 0x0305 }
        L_0x0281:
            jf.s r8 = p578jf.C17841s.f45810b     // Catch:{ all -> 0x0305 }
            monitor-exit(r7)
            com.google.firebase.perf.config.RemoteConfigManager r7 = r0.f45790a
            r8.getClass()
            java.lang.String r9 = "fpr_vc_trace_sampling_rate"
            sf.b r7 = r7.getFloat(r9)
            boolean r9 = r7.mo51862b()
            if (r9 == 0) goto L_0x02c1
            java.lang.Object r9 = r7.mo51861a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            boolean r9 = p578jf.C17823a.m44165q(r9)
            if (r9 == 0) goto L_0x02c1
            jf.t r0 = r0.f45792c
            java.lang.String r8 = "com.google.firebase.perf.TraceSamplingRate"
            java.lang.Object r9 = r7.mo51861a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r0.mo50418c(r9, r8)
            java.lang.Object r0 = r7.mo51861a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x02ea
        L_0x02c1:
            sf.b r0 = r0.mo50405b(r8)
            boolean r7 = r0.mo51862b()
            if (r7 == 0) goto L_0x02e6
            java.lang.Object r7 = r0.mo51861a()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            boolean r7 = p578jf.C17823a.m44165q(r7)
            if (r7 == 0) goto L_0x02e6
            java.lang.Object r0 = r0.mo51861a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x02ea
        L_0x02e6:
            float r0 = r6.floatValue()
        L_0x02ea:
            float r7 = r14.f48916b
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f2
            r0 = 1
            goto L_0x02f3
        L_0x02f2:
            r0 = 0
        L_0x02f3:
            if (r0 != 0) goto L_0x0308
            com.google.firebase.perf.v1.i r0 = r13.mo43564k()
            com.google.protobuf.k$e r0 = r0.mo43576J()
            boolean r0 = p766rf.C19258c.m46510a(r0)
            if (r0 != 0) goto L_0x0308
            goto L_0x0482
        L_0x0305:
            r13 = move-exception
            monitor-exit(r7)
            throw r13
        L_0x0308:
            boolean r0 = r13.mo43563i()
            if (r0 == 0) goto L_0x032a
            com.google.firebase.perf.v1.i r0 = r13.mo43564k()
            java.lang.String r0 = r0.mo43575I()
            java.lang.String r7 = "_st_"
            boolean r0 = r0.startsWith(r7)
            if (r0 == 0) goto L_0x032a
            com.google.firebase.perf.v1.i r0 = r13.mo43564k()
            boolean r0 = r0.mo43570C()
            if (r0 == 0) goto L_0x032a
            r0 = 1
            goto L_0x032b
        L_0x032a:
            r0 = 0
        L_0x032b:
            if (r0 == 0) goto L_0x03e7
            jf.a r0 = r14.f48915a
            r0.getClass()
            java.lang.Class<jf.d> r7 = p578jf.C17826d.class
            monitor-enter(r7)
            jf.d r8 = p578jf.C17826d.f45795b     // Catch:{ all -> 0x03e4 }
            if (r8 != 0) goto L_0x0340
            jf.d r8 = new jf.d     // Catch:{ all -> 0x03e4 }
            r8.<init>()     // Catch:{ all -> 0x03e4 }
            p578jf.C17826d.f45795b = r8     // Catch:{ all -> 0x03e4 }
        L_0x0340:
            jf.d r8 = p578jf.C17826d.f45795b     // Catch:{ all -> 0x03e4 }
            monitor-exit(r7)
            sf.b r7 = r0.mo50411i(r8)
            boolean r9 = r7.mo51862b()
            if (r9 == 0) goto L_0x0361
            java.lang.Object r7 = r7.mo51861a()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r9 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r9
            boolean r9 = p578jf.C17823a.m44165q(r7)
            if (r9 == 0) goto L_0x0361
            goto L_0x03c9
        L_0x0361:
            com.google.firebase.perf.config.RemoteConfigManager r7 = r0.f45790a
            java.lang.String r9 = "fpr_vc_fragment_sampling_rate"
            sf.b r7 = r7.getFloat(r9)
            boolean r9 = r7.mo51862b()
            if (r9 == 0) goto L_0x039b
            java.lang.Object r9 = r7.mo51861a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            boolean r9 = p578jf.C17823a.m44165q(r9)
            if (r9 == 0) goto L_0x039b
            jf.t r0 = r0.f45792c
            java.lang.String r8 = "com.google.firebase.perf.FragmentSamplingRate"
            java.lang.Object r9 = r7.mo51861a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r0.mo50418c(r9, r8)
            java.lang.Object r0 = r7.mo51861a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r7 = r0.floatValue()
            goto L_0x03c9
        L_0x039b:
            sf.b r0 = r0.mo50405b(r8)
            boolean r7 = r0.mo51862b()
            if (r7 == 0) goto L_0x03c0
            java.lang.Object r7 = r0.mo51861a()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            boolean r7 = p578jf.C17823a.m44165q(r7)
            if (r7 == 0) goto L_0x03c0
            java.lang.Object r0 = r0.mo51861a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r7 = r0.floatValue()
            goto L_0x03c9
        L_0x03c0:
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r7 = r0.floatValue()
        L_0x03c9:
            float r0 = r14.f48917c
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x03d1
            r0 = 1
            goto L_0x03d2
        L_0x03d1:
            r0 = 0
        L_0x03d2:
            if (r0 != 0) goto L_0x03e7
            com.google.firebase.perf.v1.i r0 = r13.mo43564k()
            com.google.protobuf.k$e r0 = r0.mo43576J()
            boolean r0 = p766rf.C19258c.m46510a(r0)
            if (r0 != 0) goto L_0x03e7
            goto L_0x0482
        L_0x03e4:
            r13 = move-exception
            monitor-exit(r7)
            throw r13
        L_0x03e7:
            boolean r0 = r13.mo43561g()
            if (r0 == 0) goto L_0x0487
            jf.a r0 = r14.f48915a
            r0.getClass()
            java.lang.Class<jf.g> r7 = p578jf.C17829g.class
            monitor-enter(r7)
            jf.g r8 = p578jf.C17829g.f45798b     // Catch:{ all -> 0x0484 }
            if (r8 != 0) goto L_0x0400
            jf.g r8 = new jf.g     // Catch:{ all -> 0x0484 }
            r8.<init>()     // Catch:{ all -> 0x0484 }
            p578jf.C17829g.f45798b = r8     // Catch:{ all -> 0x0484 }
        L_0x0400:
            jf.g r8 = p578jf.C17829g.f45798b     // Catch:{ all -> 0x0484 }
            monitor-exit(r7)
            com.google.firebase.perf.config.RemoteConfigManager r7 = r0.f45790a
            r8.getClass()
            java.lang.String r9 = "fpr_vc_network_request_sampling_rate"
            sf.b r7 = r7.getFloat(r9)
            boolean r9 = r7.mo51862b()
            if (r9 == 0) goto L_0x0440
            java.lang.Object r9 = r7.mo51861a()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            boolean r9 = p578jf.C17823a.m44165q(r9)
            if (r9 == 0) goto L_0x0440
            jf.t r0 = r0.f45792c
            java.lang.String r6 = "com.google.firebase.perf.NetworkRequestSamplingRate"
            java.lang.Object r8 = r7.mo51861a()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r0.mo50418c(r8, r6)
            java.lang.Object r0 = r7.mo51861a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x0469
        L_0x0440:
            sf.b r0 = r0.mo50405b(r8)
            boolean r7 = r0.mo51862b()
            if (r7 == 0) goto L_0x0465
            java.lang.Object r7 = r0.mo51861a()
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            boolean r7 = p578jf.C17823a.m44165q(r7)
            if (r7 == 0) goto L_0x0465
            java.lang.Object r0 = r0.mo51861a()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L_0x0469
        L_0x0465:
            float r0 = r6.floatValue()
        L_0x0469:
            float r14 = r14.f48916b
            int r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r14 >= 0) goto L_0x0471
            r14 = 1
            goto L_0x0472
        L_0x0471:
            r14 = 0
        L_0x0472:
            if (r14 != 0) goto L_0x0487
            com.google.firebase.perf.v1.NetworkRequestMetric r14 = r13.mo43562h()
            com.google.protobuf.k$e r14 = r14.mo43531K()
            boolean r14 = p766rf.C19258c.m46510a(r14)
            if (r14 != 0) goto L_0x0487
        L_0x0482:
            r14 = 0
            goto L_0x0488
        L_0x0484:
            r13 = move-exception
            monitor-exit(r7)
            throw r13
        L_0x0487:
            r14 = 1
        L_0x0488:
            if (r14 != 0) goto L_0x049e
            r12.mo51680b(r13)
            lf.a r14 = f48933s
            java.lang.String r0 = "Event dropped due to device sampling - %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = m46512a(r13)
            r6[r4] = r7
            r14.mo50613e(r0, r6)
            goto L_0x0519
        L_0x049e:
            rf.c r14 = r12.f48946m
            r14.getClass()
            boolean r0 = r13.mo43563i()
            if (r0 == 0) goto L_0x04dc
            com.google.firebase.perf.v1.i r0 = r13.mo43564k()
            java.lang.String r0 = r0.mo43575I()
            com.google.firebase.perf.util.Constants$TraceNames r6 = com.google.firebase.perf.util.Constants$TraceNames.FOREGROUND_TRACE_NAME
            java.lang.String r6 = r6.toString()
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x04d1
            com.google.firebase.perf.v1.i r0 = r13.mo43564k()
            java.lang.String r0 = r0.mo43575I()
            com.google.firebase.perf.util.Constants$TraceNames r6 = com.google.firebase.perf.util.Constants$TraceNames.BACKGROUND_TRACE_NAME
            java.lang.String r6 = r6.toString()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x04dc
        L_0x04d1:
            com.google.firebase.perf.v1.i r0 = r13.mo43564k()
            int r0 = r0.mo43571D()
            if (r0 <= 0) goto L_0x04dc
            goto L_0x04e2
        L_0x04dc:
            boolean r0 = r13.mo43560f()
            if (r0 == 0) goto L_0x04e4
        L_0x04e2:
            r0 = 0
            goto L_0x04e5
        L_0x04e4:
            r0 = 1
        L_0x04e5:
            if (r0 != 0) goto L_0x04e9
            r14 = 0
            goto L_0x0505
        L_0x04e9:
            boolean r0 = r13.mo43561g()
            if (r0 == 0) goto L_0x04f6
            rf.c$a r14 = r14.f48919e
            boolean r14 = r14.mo51679a()
            goto L_0x0502
        L_0x04f6:
            boolean r0 = r13.mo43563i()
            if (r0 == 0) goto L_0x0504
            rf.c$a r14 = r14.f48918d
            boolean r14 = r14.mo51679a()
        L_0x0502:
            r14 = r14 ^ r5
            goto L_0x0505
        L_0x0504:
            r14 = 1
        L_0x0505:
            if (r14 == 0) goto L_0x051b
            r12.mo51680b(r13)
            lf.a r14 = f48933s
            java.lang.String r0 = "Rate limited (per device) - %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = m46512a(r13)
            r6[r4] = r7
            r14.mo50613e(r0, r6)
        L_0x0519:
            r14 = 0
            goto L_0x051c
        L_0x051b:
            r14 = 1
        L_0x051c:
            if (r14 == 0) goto L_0x05d4
            boolean r14 = r13.mo43563i()
            if (r14 == 0) goto L_0x057b
            lf.a r14 = f48933s
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r6 = m46512a(r13)
            r0[r4] = r6
            com.google.firebase.perf.v1.i r6 = r13.mo43564k()
            java.lang.String r6 = r6.mo43575I()
            java.lang.String r7 = "_st_"
            boolean r7 = r6.startsWith(r7)
            java.lang.String r8 = "android-ide"
            java.lang.String r9 = "perf-android-sdk"
            if (r7 == 0) goto L_0x055b
            java.lang.String r7 = r12.f48950q
            java.lang.String r10 = r12.f48949p
            java.lang.String r7 = p583jk.C17884p.m44331B(r7, r10)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r7
            r3[r5] = r6
            r3[r2] = r9
            r3[r1] = r8
            java.lang.String r1 = "%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            goto L_0x0573
        L_0x055b:
            java.lang.String r7 = r12.f48950q
            java.lang.String r10 = r12.f48949p
            java.lang.String r7 = p583jk.C17884p.m44331B(r7, r10)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r7
            r3[r5] = r6
            r3[r2] = r9
            r3[r1] = r8
            java.lang.String r1 = "%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s"
            java.lang.String r1 = java.lang.String.format(r1, r3)
        L_0x0573:
            r0[r5] = r1
            java.lang.String r1 = "Logging %s. In a minute, visit the Firebase console to view your data: %s"
            r14.mo50613e(r1, r0)
            goto L_0x058a
        L_0x057b:
            lf.a r14 = f48933s
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = m46512a(r13)
            r0[r4] = r1
            java.lang.String r1 = "Logging %s"
            r14.mo50613e(r1, r0)
        L_0x058a:
            rf.a r14 = r12.f48942i
            r9.e<com.google.firebase.perf.v1.g> r0 = r14.f48912c
            if (r0 != 0) goto L_0x05b6
            ze.b<r9.f> r0 = r14.f48911b
            java.lang.Object r0 = r0.get()
            r9.f r0 = (p237r9.C6273f) r0
            if (r0 == 0) goto L_0x05b1
            java.lang.String r1 = r14.f48910a
            r9.b r2 = new r9.b
            java.lang.String r3 = "proto"
            r2.<init>(r3)
            i0.c r3 = new i0.c
            r6 = 11
            r3.<init>(r6)
            u9.u r0 = r0.mo22261a(r1, r2, r3)
            r14.f48912c = r0
            goto L_0x05b6
        L_0x05b1:
            lf.a r0 = p766rf.C19256a.f48909d
            r0.mo50614f()
        L_0x05b6:
            r9.e<com.google.firebase.perf.v1.g> r14 = r14.f48912c
            if (r14 == 0) goto L_0x05bb
            r4 = 1
        L_0x05bb:
            if (r4 != 0) goto L_0x05c3
            lf.a r13 = p766rf.C19256a.f48909d
            r13.mo50614f()
            goto L_0x05cd
        L_0x05c3:
            r9.a r0 = new r9.a
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.DEFAULT
            r0.<init>(r13, r1)
            r14.mo22259a(r0)
        L_0x05cd:
            com.google.firebase.perf.session.SessionManager r13 = com.google.firebase.perf.session.SessionManager.getInstance()
            r13.updatePerfSessionIfExpired()
        L_0x05d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p766rf.C19260d.mo51681c(com.google.firebase.perf.v1.g$b, com.google.firebase.perf.v1.ApplicationProcessState):void");
    }

    public final void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        boolean z;
        if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
            z = true;
        } else {
            z = false;
        }
        this.f48951r = z;
        if (this.f48937d.get()) {
            this.f48943j.execute(new C7082o(this, 9));
        }
    }
}
