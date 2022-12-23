package com.google.firebase.installations;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.local.C14462a;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.C14468c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import p145k5.C5490i;
import p258t4.C6589c;
import p304x.C7029b1;
import p358af.C13435b;
import p358af.C13436c;
import p358af.C13438e;
import p358af.C13439f;
import p358af.C13441h;
import p358af.C13442i;
import p358af.C13443j;
import p404ce.C13802o;
import p405cf.C13808a;
import p743qd.C19107d;
import p909xe.C20469f;
import p956ze.C20839b;

/* renamed from: com.google.firebase.installations.a */
public final class C14459a implements C13436c {

    /* renamed from: m */
    public static final Object f36530m = new Object();

    /* renamed from: n */
    public static final C14460a f36531n = new C14460a();

    /* renamed from: a */
    public final C19107d f36532a;

    /* renamed from: b */
    public final C14468c f36533b;

    /* renamed from: c */
    public final PersistedInstallation f36534c;

    /* renamed from: d */
    public final C13443j f36535d;

    /* renamed from: e */
    public final C13802o<C13808a> f36536e;

    /* renamed from: f */
    public final C13441h f36537f;

    /* renamed from: g */
    public final Object f36538g;

    /* renamed from: h */
    public final ExecutorService f36539h;

    /* renamed from: i */
    public final ThreadPoolExecutor f36540i;

    /* renamed from: j */
    public String f36541j;

    /* renamed from: k */
    public HashSet f36542k;

    /* renamed from: l */
    public final ArrayList f36543l;

    /* renamed from: com.google.firebase.installations.a$a */
    public class C14460a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f36544b = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f36544b.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.a$b */
    public static /* synthetic */ class C14461b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36545a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f36546b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36546b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.f36565OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f36546b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f36546b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f36545a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.f36564OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f36545a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C14459a.C14461b.<clinit>():void");
        }
    }

    public C14459a() {
        throw null;
    }

    public C14459a(C19107d dVar, C20839b<C20469f> bVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C14460a aVar = f36531n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, aVar);
        dVar.mo51535a();
        C14468c cVar = new C14468c(dVar.f48568a, bVar);
        PersistedInstallation persistedInstallation = new PersistedInstallation(dVar);
        if (C6589c.f20408b == null) {
            C6589c.f20408b = new C6589c();
        }
        C6589c cVar2 = C6589c.f20408b;
        if (C13443j.f33300d == null) {
            C13443j.f33300d = new C13443j(cVar2);
        }
        C13443j jVar = C13443j.f33300d;
        C13802o<C13808a> oVar = new C13802o<>(new C13435b(dVar));
        C13441h hVar = new C13441h();
        this.f36538g = new Object();
        this.f36542k = new HashSet();
        this.f36543l = new ArrayList();
        this.f36532a = dVar;
        this.f36533b = cVar;
        this.f36534c = persistedInstallation;
        this.f36535d = jVar;
        this.f36536e = oVar;
        this.f36537f = hVar;
        this.f36539h = threadPoolExecutor;
        this.f36540i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f A[SYNTHETIC, Splitter:B:15:0x003f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43365a(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = f36530m
            monitor-enter(r0)
            qd.d r1 = r6.f36532a     // Catch:{ all -> 0x0067 }
            r1.mo51535a()     // Catch:{ all -> 0x0067 }
            android.content.Context r1 = r1.f48568a     // Catch:{ all -> 0x0067 }
            dd.c r1 = p434dd.C16545c.m42048a(r1)     // Catch:{ all -> 0x0067 }
            com.google.firebase.installations.local.PersistedInstallation r2 = r6.f36534c     // Catch:{ all -> 0x0060 }
            com.google.firebase.installations.local.a r2 = r2.mo43375c()     // Catch:{ all -> 0x0060 }
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = r2.f36550c     // Catch:{ all -> 0x0060 }
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED     // Catch:{ all -> 0x0060 }
            if (r3 == r4) goto L_0x0021
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r4 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION     // Catch:{ all -> 0x0060 }
            if (r3 != r4) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r3 = 0
            goto L_0x0022
        L_0x0021:
            r3 = 1
        L_0x0022:
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r6.mo43368d(r2)     // Catch:{ all -> 0x0060 }
            com.google.firebase.installations.local.PersistedInstallation r4 = r6.f36534c     // Catch:{ all -> 0x0060 }
            com.google.firebase.installations.local.a$a r5 = new com.google.firebase.installations.local.a$a     // Catch:{ all -> 0x0060 }
            r5.<init>(r2)     // Catch:{ all -> 0x0060 }
            r5.f36556a = r3     // Catch:{ all -> 0x0060 }
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r2 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.UNREGISTERED     // Catch:{ all -> 0x0060 }
            r5.mo43388b(r2)     // Catch:{ all -> 0x0060 }
            com.google.firebase.installations.local.a r2 = r5.mo43387a()     // Catch:{ all -> 0x0060 }
            r4.mo43374b(r2)     // Catch:{ all -> 0x0060 }
        L_0x003d:
            if (r1 == 0) goto L_0x0042
            r1.mo49324b()     // Catch:{ all -> 0x0067 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            if (r7 == 0) goto L_0x0051
            com.google.firebase.installations.local.a$a r0 = new com.google.firebase.installations.local.a$a
            r0.<init>(r2)
            r1 = 0
            r0.f36558c = r1
            com.google.firebase.installations.local.a r2 = r0.mo43387a()
        L_0x0051:
            r6.mo43371g(r2)
            java.util.concurrent.ThreadPoolExecutor r0 = r6.f36540i
            c0.a r1 = new c0.a
            r2 = 2
            r1.<init>(r2, r6, r7)
            r0.execute(r1)
            return
        L_0x0060:
            r7 = move-exception
            if (r1 == 0) goto L_0x0066
            r1.mo49324b()     // Catch:{ all -> 0x0067 }
        L_0x0066:
            throw r7     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C14459a.mo43365a(boolean):void");
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b1, code lost:
        r12.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b7, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b0 A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:16:0x005f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.installations.local.C14462a mo43366b(com.google.firebase.installations.local.C14462a r20) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            com.google.firebase.installations.remote.c r2 = r1.f36533b
            qd.d r3 = r1.f36532a
            r3.mo51535a()
            qd.f r3 = r3.f48570c
            java.lang.String r3 = r3.f48581a
            java.lang.String r4 = r0.f36549b
            qd.d r5 = r1.f36532a
            r5.mo51535a()
            qd.f r5 = r5.f48570c
            java.lang.String r5 = r5.f48587g
            java.lang.String r6 = r0.f36552e
            df.a r7 = r2.f36578c
            monitor-enter(r7)
            int r8 = r7.f43249c     // Catch:{ all -> 0x01d7 }
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x0039
            af.j r8 = r7.f43247a     // Catch:{ all -> 0x01d7 }
            t4.c r8 = r8.f33301a     // Catch:{ all -> 0x01d7 }
            r8.getClass()     // Catch:{ all -> 0x01d7 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01d7 }
            long r13 = r7.f43248b     // Catch:{ all -> 0x01d7 }
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r8 = 0
            goto L_0x003a
        L_0x0039:
            r8 = 1
        L_0x003a:
            monitor-exit(r7)
            java.lang.String r7 = "Firebase Installations Service is unavailable. Please try again later."
            if (r8 == 0) goto L_0x01cf
            r8 = 2
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r5
            r11[r10] = r4
            java.lang.String r4 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r4 = java.lang.String.format(r4, r11)
            java.net.URL r4 = com.google.firebase.installations.remote.C14468c.m36040a(r4)
            r11 = 0
        L_0x0051:
            if (r11 > r10) goto L_0x01c7
            r12 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r12)
            java.net.HttpURLConnection r12 = r2.mo43403c(r4, r3)
            java.lang.String r13 = "POST"
            r12.setRequestMethod(r13)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            java.lang.String r13 = "Authorization"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            r14.<init>()     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            java.lang.String r15 = "FIS_v2 "
            r14.append(r15)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            r14.append(r6)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            java.lang.String r14 = r14.toString()     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            r12.addRequestProperty(r13, r14)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            r12.setDoOutput(r10)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            com.google.firebase.installations.remote.C14468c.m36046h(r12)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            int r13 = r12.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            df.a r14 = r2.f36578c     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            r14.mo49365a(r13)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            r14 = 200(0xc8, float:2.8E-43)
            if (r13 < r14) goto L_0x0091
            r14 = 300(0x12c, float:4.2E-43)
            if (r13 >= r14) goto L_0x0091
            r14 = 1
            goto L_0x0092
        L_0x0091:
            r14 = 0
        L_0x0092:
            r15 = 0
            if (r14 == 0) goto L_0x009b
            com.google.firebase.installations.remote.b r2 = com.google.firebase.installations.remote.C14468c.m36044f(r12)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            goto L_0x011f
        L_0x009b:
            com.google.firebase.installations.remote.C14468c.m36041b(r12, r15, r3, r5)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            r14 = 401(0x191, float:5.62E-43)
            r16 = 0
            if (r13 == r14) goto L_0x0100
            r14 = 404(0x194, float:5.66E-43)
            if (r13 != r14) goto L_0x00a9
            goto L_0x0100
        L_0x00a9:
            r14 = 429(0x1ad, float:6.01E-43)
            if (r13 == r14) goto L_0x00f4
            r14 = 500(0x1f4, float:7.0E-43)
            if (r13 < r14) goto L_0x00b7
            r14 = 600(0x258, float:8.41E-43)
            if (r13 >= r14) goto L_0x00b7
            goto L_0x01b8
        L_0x00b7:
            java.lang.Long r13 = java.lang.Long.valueOf(r16)     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            com.google.firebase.installations.remote.TokenResult$ResponseCode r14 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            if (r13 != 0) goto L_0x00c2
            java.lang.String r16 = " tokenExpirationTimestamp"
            goto L_0x00c4
        L_0x00c2:
            java.lang.String r16 = ""
        L_0x00c4:
            r17 = r16
            boolean r16 = r17.isEmpty()     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            if (r16 == 0) goto L_0x00d9
            com.google.firebase.installations.remote.b r9 = new com.google.firebase.installations.remote.b     // Catch:{ IOException | AssertionError -> 0x01b8, all -> 0x01b0 }
            r18 = r11
            long r10 = r13.longValue()     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            r9.<init>(r15, r10, r14)     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            r2 = r9
            goto L_0x011f
        L_0x00d9:
            r18 = r11
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            r10.<init>()     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            java.lang.String r11 = "Missing required properties:"
            r10.append(r11)     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            r11 = r17
            r10.append(r11)     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            r9.<init>(r10)     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            throw r9     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
        L_0x00f4:
            r18 = r11
            com.google.firebase.installations.FirebaseInstallationsException r9 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            java.lang.String r10 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r11 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            r9.<init>(r10, r11)     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            throw r9     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
        L_0x0100:
            r18 = r11
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            com.google.firebase.installations.remote.TokenResult$ResponseCode r10 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            if (r9 != 0) goto L_0x010d
            java.lang.String r11 = " tokenExpirationTimestamp"
            goto L_0x010f
        L_0x010d:
            java.lang.String r11 = ""
        L_0x010f:
            boolean r13 = r11.isEmpty()     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            if (r13 == 0) goto L_0x0198
            com.google.firebase.installations.remote.b r11 = new com.google.firebase.installations.remote.b     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            long r13 = r9.longValue()     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            r11.<init>(r15, r13, r10)     // Catch:{ IOException | AssertionError -> 0x01ba, all -> 0x01b0 }
            r2 = r11
        L_0x011f:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int[] r3 = com.google.firebase.installations.C14459a.C14461b.f36546b
            com.google.firebase.installations.remote.TokenResult$ResponseCode r4 = r2.f36573c
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r9 = 1
            if (r3 == r9) goto L_0x0168
            if (r3 == r8) goto L_0x0156
            r2 = 3
            if (r3 != r2) goto L_0x014e
            monitor-enter(r19)
            r1.f36541j = r15     // Catch:{ all -> 0x014a }
            monitor-exit(r19)
            com.google.firebase.installations.local.a$a r2 = new com.google.firebase.installations.local.a$a
            r2.<init>(r0)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.NOT_GENERATED
            r2.mo43388b(r0)
            com.google.firebase.installations.local.a r0 = r2.mo43387a()
            return r0
        L_0x014a:
            r0 = move-exception
            r2 = r0
            monitor-exit(r19)
            throw r2
        L_0x014e:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r7, r2)
            throw r0
        L_0x0156:
            com.google.firebase.installations.local.a$a r0 = r20.mo43384h()
            java.lang.String r2 = "BAD CONFIG"
            r0.f36562g = r2
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r2 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR
            r0.mo43388b(r2)
            com.google.firebase.installations.local.a r0 = r0.mo43387a()
            return r0
        L_0x0168:
            java.lang.String r3 = r2.f36571a
            long r4 = r2.f36572b
            af.j r2 = r1.f36535d
            r2.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            t4.c r2 = r2.f33301a
            r2.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r6 = r6.toSeconds(r7)
            com.google.firebase.installations.local.a$a r2 = new com.google.firebase.installations.local.a$a
            r2.<init>(r0)
            r2.f36558c = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.f36560e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r2.f36561f = r0
            com.google.firebase.installations.local.a r0 = r2.mo43387a()
            return r0
        L_0x0198:
            r9 = 1
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x01bb, all -> 0x01b0 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException | AssertionError -> 0x01bb, all -> 0x01b0 }
            r13.<init>()     // Catch:{ IOException | AssertionError -> 0x01bb, all -> 0x01b0 }
            java.lang.String r14 = "Missing required properties:"
            r13.append(r14)     // Catch:{ IOException | AssertionError -> 0x01bb, all -> 0x01b0 }
            r13.append(r11)     // Catch:{ IOException | AssertionError -> 0x01bb, all -> 0x01b0 }
            java.lang.String r11 = r13.toString()     // Catch:{ IOException | AssertionError -> 0x01bb, all -> 0x01b0 }
            r10.<init>(r11)     // Catch:{ IOException | AssertionError -> 0x01bb, all -> 0x01b0 }
            throw r10     // Catch:{ IOException | AssertionError -> 0x01bb, all -> 0x01b0 }
        L_0x01b0:
            r0 = move-exception
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01b8:
            r18 = r11
        L_0x01ba:
            r9 = 1
        L_0x01bb:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r11 = r18 + 1
            r9 = 0
            r10 = 1
            goto L_0x0051
        L_0x01c7:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r7, r2)
            throw r0
        L_0x01cf:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r7, r2)
            throw r0
        L_0x01d7:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C14459a.mo43366b(com.google.firebase.installations.local.a):com.google.firebase.installations.local.a");
    }

    /* renamed from: c */
    public final void mo43367c() {
        C19107d dVar = this.f36532a;
        dVar.mo51535a();
        Preconditions.checkNotEmpty(dVar.f48570c.f48582b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C19107d dVar2 = this.f36532a;
        dVar2.mo51535a();
        Preconditions.checkNotEmpty(dVar2.f48570c.f48587g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C19107d dVar3 = this.f36532a;
        dVar3.mo51535a();
        Preconditions.checkNotEmpty(dVar3.f48570c.f48581a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C19107d dVar4 = this.f36532a;
        dVar4.mo51535a();
        String str = dVar4.f48570c.f48582b;
        Pattern pattern = C13443j.f33299c;
        Preconditions.checkArgument(str.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C19107d dVar5 = this.f36532a;
        dVar5.mo51535a();
        Preconditions.checkArgument(C13443j.f33299c.matcher(dVar5.f48570c.f48581a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f48569b) != false) goto L_0x001e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo43368d(com.google.firebase.installations.local.C14462a r6) {
        /*
            r5 = this;
            qd.d r0 = r5.f36532a
            r0.mo51535a()
            java.lang.String r0 = r0.f48569b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            qd.d r0 = r5.f36532a
            r0.mo51535a()
            java.lang.String r0 = r0.f48569b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
        L_0x001e:
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r6 = r6.f36550c
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            if (r6 != r0) goto L_0x0026
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 != 0) goto L_0x0033
        L_0x0029:
            af.h r6 = r5.f36537f
            r6.getClass()
            java.lang.String r6 = p358af.C13441h.m33720a()
            return r6
        L_0x0033:
            ce.o<cf.a> r6 = r5.f36536e
            java.lang.Object r6 = r6.get()
            cf.a r6 = (p405cf.C13808a) r6
            android.content.SharedPreferences r0 = r6.f33991a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f33991a     // Catch:{ all -> 0x0067 }
            monitor-enter(r1)     // Catch:{ all -> 0x0067 }
            android.content.SharedPreferences r2 = r6.f33991a     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x0064 }
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            if (r2 == 0) goto L_0x004f
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            goto L_0x0054
        L_0x004f:
            java.lang.String r2 = r6.mo40736a()     // Catch:{ all -> 0x0067 }
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
        L_0x0054:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0063
            af.h r6 = r5.f36537f
            r6.getClass()
            java.lang.String r2 = p358af.C13441h.m33720a()
        L_0x0063:
            return r2
        L_0x0064:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0064 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0067 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C14459a.mo43368d(com.google.firebase.installations.local.a):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r9.startsWith("{") == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = new org.json.JSONObject(r9).getString(com.google.firebase.messaging.FirebaseMessagingService.EXTRA_TOKEN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0063 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.installations.local.C14462a mo43369e(com.google.firebase.installations.local.C14462a r23) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = r0.f36549b
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x006d
            int r2 = r2.length()
            r5 = 11
            if (r2 != r5) goto L_0x006d
            ce.o<cf.a> r2 = r1.f36536e
            java.lang.Object r2 = r2.get()
            cf.a r2 = (p405cf.C13808a) r2
            android.content.SharedPreferences r5 = r2.f33991a
            monitor-enter(r5)
            java.lang.String[] r6 = p405cf.C13808a.f33990c     // Catch:{ all -> 0x006a }
            r7 = 4
            r8 = 0
        L_0x0021:
            if (r8 >= r7) goto L_0x0068
            r9 = r6[r8]     // Catch:{ all -> 0x006a }
            java.lang.String r10 = r2.f33992b     // Catch:{ all -> 0x006a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r11.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r12 = "|T|"
            r11.append(r12)     // Catch:{ all -> 0x006a }
            r11.append(r10)     // Catch:{ all -> 0x006a }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x006a }
            r11.append(r9)     // Catch:{ all -> 0x006a }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x006a }
            android.content.SharedPreferences r10 = r2.f33991a     // Catch:{ all -> 0x006a }
            java.lang.String r9 = r10.getString(r9, r3)     // Catch:{ all -> 0x006a }
            if (r9 == 0) goto L_0x0065
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x006a }
            if (r10 != 0) goto L_0x0065
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x006a }
            if (r2 == 0) goto L_0x0062
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0063 }
            r2.<init>(r9)     // Catch:{ JSONException -> 0x0063 }
            java.lang.String r6 = "token"
            java.lang.String r3 = r2.getString(r6)     // Catch:{ JSONException -> 0x0063 }
            goto L_0x0063
        L_0x0062:
            r3 = r9
        L_0x0063:
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            goto L_0x006d
        L_0x0065:
            int r8 = r8 + 1
            goto L_0x0021
        L_0x0068:
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            goto L_0x006d
        L_0x006a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x006a }
            throw r0
        L_0x006d:
            com.google.firebase.installations.remote.c r2 = r1.f36533b
            qd.d r5 = r1.f36532a
            r5.mo51535a()
            qd.f r5 = r5.f48570c
            java.lang.String r5 = r5.f48581a
            java.lang.String r6 = r0.f36549b
            qd.d r7 = r1.f36532a
            r7.mo51535a()
            qd.f r7 = r7.f48570c
            java.lang.String r7 = r7.f48587g
            qd.d r8 = r1.f36532a
            r8.mo51535a()
            qd.f r8 = r8.f48570c
            java.lang.String r8 = r8.f48582b
            df.a r9 = r2.f36578c
            monitor-enter(r9)
            int r10 = r9.f43249c     // Catch:{ all -> 0x01c2 }
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            af.j r10 = r9.f43247a     // Catch:{ all -> 0x01c2 }
            t4.c r10 = r10.f33301a     // Catch:{ all -> 0x01c2 }
            r10.getClass()     // Catch:{ all -> 0x01c2 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01c2 }
            long r14 = r9.f43248b     // Catch:{ all -> 0x01c2 }
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r10 = 0
            goto L_0x00a9
        L_0x00a8:
            r10 = 1
        L_0x00a9:
            monitor-exit(r9)
            java.lang.String r9 = "Firebase Installations Service is unavailable. Please try again later."
            if (r10 == 0) goto L_0x01ba
            java.lang.Object[] r10 = new java.lang.Object[r11]
            r10[r4] = r7
            java.lang.String r12 = "projects/%s/installations"
            java.lang.String r10 = java.lang.String.format(r12, r10)
            java.net.URL r10 = com.google.firebase.installations.remote.C14468c.m36040a(r10)
            r12 = 0
        L_0x00bd:
            if (r12 > r11) goto L_0x01b2
            r13 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r13)
            java.net.HttpURLConnection r13 = r2.mo43403c(r10, r5)
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            r13.setDoOutput(r11)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            if (r3 == 0) goto L_0x00d8
            java.lang.String r14 = "x-goog-fis-android-iid-migration-auth"
            r13.addRequestProperty(r14, r3)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
        L_0x00d8:
            com.google.firebase.installations.remote.C14468c.m36045g(r13, r6, r8)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            int r14 = r13.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            df.a r15 = r2.f36578c     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            r15.mo49365a(r14)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            r15 = 200(0xc8, float:2.8E-43)
            if (r14 < r15) goto L_0x00ee
            r15 = 300(0x12c, float:4.2E-43)
            if (r14 >= r15) goto L_0x00ee
            r15 = 1
            goto L_0x00ef
        L_0x00ee:
            r15 = 0
        L_0x00ef:
            if (r15 == 0) goto L_0x00fc
            com.google.firebase.installations.remote.a r2 = com.google.firebase.installations.remote.C14468c.m36043e(r13)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0125
        L_0x00fc:
            com.google.firebase.installations.remote.C14468c.m36041b(r13, r8, r5, r7)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            r15 = 429(0x1ad, float:6.01E-43)
            if (r14 == r15) goto L_0x0195
            r15 = 500(0x1f4, float:7.0E-43)
            if (r14 < r15) goto L_0x010d
            r15 = 600(0x258, float:8.41E-43)
            if (r14 >= r15) goto L_0x010d
            goto L_0x01a7
        L_0x010d:
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r21 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            com.google.firebase.installations.remote.a r14 = new com.google.firebase.installations.remote.a     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            r16 = r14
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r14
        L_0x0125:
            int[] r3 = com.google.firebase.installations.C14459a.C14461b.f36545a
            com.google.firebase.installations.remote.InstallationResponse$ResponseCode r4 = r2.f36570e
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r11) goto L_0x0150
            r2 = 2
            if (r3 != r2) goto L_0x0146
            com.google.firebase.installations.local.a$a r0 = r23.mo43384h()
            java.lang.String r2 = "BAD CONFIG"
            r0.f36562g = r2
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r2 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTER_ERROR
            r0.mo43388b(r2)
            com.google.firebase.installations.local.a r0 = r0.mo43387a()
            return r0
        L_0x0146:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r3 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r2, r3)
            throw r0
        L_0x0150:
            java.lang.String r3 = r2.f36567b
            java.lang.String r4 = r2.f36568c
            af.j r5 = r1.f36535d
            r5.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            t4.c r5 = r5.f33301a
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r6.toSeconds(r7)
            com.google.firebase.installations.remote.TokenResult r7 = r2.f36569d
            java.lang.String r7 = r7.mo43395b()
            com.google.firebase.installations.remote.TokenResult r2 = r2.f36569d
            long r8 = r2.mo43396c()
            com.google.firebase.installations.local.a$a r2 = new com.google.firebase.installations.local.a$a
            r2.<init>(r0)
            r2.f36556a = r3
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r0 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.REGISTERED
            r2.mo43388b(r0)
            r2.f36558c = r7
            r2.f36559d = r4
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2.f36560e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.f36561f = r0
            com.google.firebase.installations.local.a r0 = r2.mo43387a()
            return r0
        L_0x0195:
            com.google.firebase.installations.FirebaseInstallationsException r14 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            com.google.firebase.installations.FirebaseInstallationsException$Status r4 = com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            r14.<init>(r15, r4)     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
            throw r14     // Catch:{ IOException | AssertionError -> 0x01a7, all -> 0x019f }
        L_0x019f:
            r0 = move-exception
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01a7:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r12 = r12 + 1
            r4 = 0
            goto L_0x00bd
        L_0x01b2:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r9, r2)
            throw r0
        L_0x01ba:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r2 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            r0.<init>(r9, r2)
            throw r0
        L_0x01c2:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C14459a.mo43369e(com.google.firebase.installations.local.a):com.google.firebase.installations.local.a");
    }

    /* renamed from: f */
    public final void mo43370f(Exception exc) {
        synchronized (this.f36538g) {
            Iterator it = this.f36543l.iterator();
            while (it.hasNext()) {
                if (((C13442i) it.next()).mo40318b(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo43371g(C14462a aVar) {
        synchronized (this.f36538g) {
            Iterator it = this.f36543l.iterator();
            while (it.hasNext()) {
                if (((C13442i) it.next()).mo40317a(aVar)) {
                    it.remove();
                }
            }
        }
    }

    public final Task<String> getId() {
        String str;
        mo43367c();
        synchronized (this) {
            str = this.f36541j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C13439f fVar = new C13439f(taskCompletionSource);
        synchronized (this.f36538g) {
            this.f36543l.add(fVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f36539h.execute(new C7029b1(this, 5));
        return task;
    }

    public final Task getToken() {
        mo43367c();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C13438e eVar = new C13438e(this.f36535d, taskCompletionSource);
        synchronized (this.f36538g) {
            this.f36543l.add(eVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f36539h.execute(new C5490i(1, this, false));
        return task;
    }
}
