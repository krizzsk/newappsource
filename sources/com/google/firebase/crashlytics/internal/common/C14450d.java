package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.android.billingclient.api.C1963s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p373au.C13533e;
import p459ee.C16810a;
import p483fe.C16953a;
import p531he.C17387a;
import p531he.C17390b0;
import p531he.C17395e;
import p531he.C17397e0;
import p531he.C17400g;
import p531he.C17402h;
import p531he.C17405i;
import p531he.C17406i0;
import p531he.C17409l;
import p531he.C17413p;
import p531he.C17422x;
import p555ie.C17580c;
import p555ie.C17590i;
import p648me.C18364b;
import p648me.C18365c;
import p696oe.C18730b;

/* renamed from: com.google.firebase.crashlytics.internal.common.d */
public final class C14450d {

    /* renamed from: q */
    public static final C17405i f36479q = new C17405i();

    /* renamed from: a */
    public final Context f36480a;

    /* renamed from: b */
    public final C17422x f36481b;

    /* renamed from: c */
    public final C1963s f36482c;

    /* renamed from: d */
    public final C17590i f36483d;

    /* renamed from: e */
    public final C17395e f36484e;

    /* renamed from: f */
    public final C17390b0 f36485f;

    /* renamed from: g */
    public final C18365c f36486g;

    /* renamed from: h */
    public final C17387a f36487h;

    /* renamed from: i */
    public final C17580c f36488i;

    /* renamed from: j */
    public final C16810a f36489j;

    /* renamed from: k */
    public final C16953a f36490k;

    /* renamed from: l */
    public final C17397e0 f36491l;

    /* renamed from: m */
    public C14452e f36492m;

    /* renamed from: n */
    public final TaskCompletionSource<Boolean> f36493n = new TaskCompletionSource<>();

    /* renamed from: o */
    public final TaskCompletionSource<Boolean> f36494o = new TaskCompletionSource<>();

    /* renamed from: p */
    public final TaskCompletionSource<Void> f36495p = new TaskCompletionSource<>();

    /* renamed from: com.google.firebase.crashlytics.internal.common.d$a */
    public class C14451a implements SuccessContinuation<Boolean, Void> {

        /* renamed from: b */
        public final /* synthetic */ Task f36496b;

        public C14451a(Task task) {
            this.f36496b = task;
        }

        public final Task then(Object obj) throws Exception {
            Task<TContinuationResult> continueWithTask;
            C17395e eVar = C14450d.this.f36484e;
            C14449c cVar = new C14449c(this, (Boolean) obj);
            synchronized (eVar.f44807c) {
                continueWithTask = eVar.f44806b.continueWithTask(eVar.f44805a, new C17400g(cVar));
                eVar.f44806b = continueWithTask.continueWith(eVar.f44805a, new C17402h());
            }
            return continueWithTask;
        }
    }

    public C14450d(Context context, C17395e eVar, C17390b0 b0Var, C17422x xVar, C18365c cVar, C1963s sVar, C17387a aVar, C17590i iVar, C17580c cVar2, C17397e0 e0Var, C16810a aVar2, C16953a aVar3) {
        new AtomicBoolean(false);
        this.f36480a = context;
        this.f36484e = eVar;
        this.f36485f = b0Var;
        this.f36481b = xVar;
        this.f36486g = cVar;
        this.f36482c = sVar;
        this.f36487h = aVar;
        this.f36483d = iVar;
        this.f36488i = cVar2;
        this.f36489j = aVar2;
        this.f36490k = aVar3;
        this.f36491l = e0Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:29|30|31|32|33|34|35|36|37|38|39|40|69) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0220 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m35975a(com.google.firebase.crashlytics.internal.common.C14450d r29, java.lang.String r30) {
        /*
            r0 = r29
            r7 = r30
            r29.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r8 = r1 / r3
            java.util.Locale r10 = java.util.Locale.US
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.String r11 = "18.2.13"
            r1[r2] = r11
            java.lang.String r2 = "Crashlytics Android SDK/%s"
            java.lang.String r3 = java.lang.String.format(r10, r2, r1)
            he.b0 r1 = r0.f36485f
            he.a r2 = r0.f36487h
            java.lang.String r13 = r1.f44798c
            java.lang.String r14 = r2.f44788e
            java.lang.String r15 = r2.f44789f
            java.lang.String r16 = r1.mo49864c()
            java.lang.String r1 = r2.f44786c
            com.google.firebase.crashlytics.internal.common.DeliveryMechanism r1 = com.google.firebase.crashlytics.internal.common.DeliveryMechanism.determineFrom(r1)
            int r17 = r1.getId()
            ee.d r1 = r2.f44790g
            je.x r2 = new je.x
            r12 = r2
            r18 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.String r12 = android.os.Build.VERSION.RELEASE
            java.lang.String r13 = android.os.Build.VERSION.CODENAME
            boolean r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35972j()
            je.z r4 = new je.z
            r4.<init>(r12, r13, r1)
            android.os.StatFs r1 = new android.os.StatFs
            java.io.File r5 = android.os.Environment.getDataDirectory()
            java.lang.String r5 = r5.getPath()
            r1.<init>(r5)
            int r5 = r1.getBlockCount()
            long r5 = (long) r5
            int r1 = r1.getBlockSize()
            long r14 = (long) r1
            long r22 = r5 * r14
            com.google.firebase.crashlytics.internal.common.CommonUtils$Architecture r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.Architecture.getValue()
            int r17 = r1.ordinal()
            java.lang.String r14 = android.os.Build.MODEL
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r19 = r1.availableProcessors()
            long r20 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35969g()
            boolean r24 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35971i()
            int r25 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35966d()
            java.lang.String r15 = android.os.Build.MANUFACTURER
            java.lang.String r6 = android.os.Build.PRODUCT
            je.y r1 = new je.y
            r16 = r1
            r18 = r14
            r26 = r15
            r27 = r6
            r16.<init>(r17, r18, r19, r20, r22, r24, r25, r26, r27)
            ee.a r5 = r0.f36489j
            r16 = r6
            je.w r6 = new je.w
            r6.<init>(r2, r4, r1)
            r1 = r5
            r2 = r30
            r4 = r8
            r28 = r16
            r1.mo49485c(r2, r3, r4, r6)
            ie.c r1 = r0.f36488i
            r1.mo50035a(r7)
            he.e0 r0 = r0.f36491l
            he.v r1 = r0.f44810a
            r1.getClass()
            java.nio.charset.Charset r2 = p577je.C17746a0.f45593a
            je.b$a r2 = new je.b$a
            r2.<init>()
            r2.f45602a = r11
            he.a r3 = r1.f44869c
            java.lang.String r3 = r3.f44784a
            if (r3 == 0) goto L_0x0298
            r2.f45603b = r3
            he.b0 r3 = r1.f44868b
            java.lang.String r3 = r3.mo49864c()
            if (r3 == 0) goto L_0x0290
            r2.f45605d = r3
            he.a r3 = r1.f44869c
            java.lang.String r4 = r3.f44788e
            if (r4 == 0) goto L_0x0288
            r2.f45606e = r4
            java.lang.String r3 = r3.f44789f
            if (r3 == 0) goto L_0x0280
            r2.f45607f = r3
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f45604c = r3
            je.g$a r3 = new je.g$a
            r3.<init>()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.f45648e = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r3.f45646c = r4
            java.lang.String r4 = "Null identifier"
            if (r7 == 0) goto L_0x027a
            r3.f45645b = r7
            java.lang.String r5 = p531he.C17420v.f44866f
            if (r5 == 0) goto L_0x0272
            r3.f45644a = r5
            he.b0 r5 = r1.f44868b
            java.lang.String r6 = r5.f44798c
            if (r6 == 0) goto L_0x026c
            he.a r4 = r1.f44869c
            java.lang.String r7 = r4.f44788e
            if (r7 == 0) goto L_0x0264
            java.lang.String r4 = r4.f44789f
            java.lang.String r20 = r5.mo49864c()
            he.a r5 = r1.f44869c
            ee.d r5 = r5.f44790g
            ee.d$a r8 = r5.f43776b
            if (r8 != 0) goto L_0x0120
            ee.d$a r8 = new ee.d$a
            r8.<init>(r5)
            r5.f43776b = r8
        L_0x0120:
            ee.d$a r5 = r5.f43776b
            java.lang.String r5 = r5.f43777a
            he.a r1 = r1.f44869c
            ee.d r1 = r1.f44790g
            ee.d$a r8 = r1.f43776b
            if (r8 != 0) goto L_0x0133
            ee.d$a r8 = new ee.d$a
            r8.<init>(r1)
            r1.f43776b = r8
        L_0x0133:
            ee.d$a r1 = r1.f43776b
            java.lang.String r1 = r1.f43778b
            java.lang.String r8 = ""
            je.h r9 = new je.h
            r16 = r9
            r17 = r6
            r18 = r7
            r19 = r4
            r21 = r5
            r22 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r3.f45649f = r9
            je.u$a r1 = new je.u$a
            r1.<init>()
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.f45762a = r4
            r1.f45763b = r12
            r1.f45764c = r13
            boolean r4 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35972j()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.f45765d = r4
            je.u r1 = r1.mo50388a()
            r3.f45651h = r1
            android.os.StatFs r1 = new android.os.StatFs
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            r1.<init>(r4)
            java.lang.String r4 = android.os.Build.CPU_ABI
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 7
            if (r5 == 0) goto L_0x0183
            goto L_0x0196
        L_0x0183:
            java.util.HashMap r5 = p531he.C17420v.f44865e
            java.lang.String r4 = r4.toLowerCase(r10)
            java.lang.Object r4 = r5.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x0192
            goto L_0x0196
        L_0x0192:
            int r6 = r4.intValue()
        L_0x0196:
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()
            int r4 = r4.availableProcessors()
            long r9 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35969g()
            int r5 = r1.getBlockCount()
            long r11 = (long) r5
            int r1 = r1.getBlockSize()
            r29 = r8
            long r7 = (long) r1
            long r11 = r11 * r7
            boolean r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35971i()
            int r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35966d()
            je.j$a r7 = new je.j$a
            r7.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.f45671a = r6
            r7.f45672b = r14
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.f45673c = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r7.f45674d = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            r7.f45675e = r4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.f45676f = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r7.f45677g = r1
            r7.f45678h = r15
            r1 = r28
            r7.f45679i = r1
            je.j r1 = r7.mo50346a()
            r3.f45652i = r1
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.f45654k = r1
            je.g r1 = r3.mo50336a()
            r2.f45608g = r1
            je.b r1 = r2.mo50273a()
            me.b r0 = r0.f44811b
            r0.getClass()
            je.a0$e r2 = r1.f45600h
            if (r2 != 0) goto L_0x020a
            goto L_0x0263
        L_0x020a:
            java.lang.String r3 = r2.mo50199g()
            ke.a r4 = p648me.C18364b.f46814f     // Catch:{ IOException -> 0x0263 }
            r4.getClass()     // Catch:{ IOException -> 0x0263 }
            ue.d r4 = p601ke.C18028a.f46139a     // Catch:{ IOException -> 0x0263 }
            r4.getClass()     // Catch:{ IOException -> 0x0263 }
            java.io.StringWriter r5 = new java.io.StringWriter     // Catch:{ IOException -> 0x0263 }
            r5.<init>()     // Catch:{ IOException -> 0x0263 }
            r4.mo52175a(r5, r1)     // Catch:{ IOException -> 0x0220 }
        L_0x0220:
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x0263 }
            me.c r4 = r0.f46818b     // Catch:{ IOException -> 0x0263 }
            java.lang.String r5 = "report"
            java.io.File r4 = r4.mo50830a(r3, r5)     // Catch:{ IOException -> 0x0263 }
            p648me.C18364b.m45214e(r4, r1)     // Catch:{ IOException -> 0x0263 }
            me.c r0 = r0.f46818b     // Catch:{ IOException -> 0x0263 }
            java.lang.String r1 = "start-time"
            java.io.File r0 = r0.mo50830a(r3, r1)     // Catch:{ IOException -> 0x0263 }
            long r1 = r2.mo50201i()     // Catch:{ IOException -> 0x0263 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0263 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0263 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0263 }
            java.nio.charset.Charset r5 = p648me.C18364b.f46812d     // Catch:{ IOException -> 0x0263 }
            r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0263 }
            r4 = r29
            r3.write(r4)     // Catch:{ all -> 0x0257 }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r4
            r0.setLastModified(r1)     // Catch:{ all -> 0x0257 }
            r3.close()     // Catch:{ IOException -> 0x0263 }
            goto L_0x0263
        L_0x0257:
            r0 = move-exception
            r1 = r0
            r3.close()     // Catch:{ all -> 0x025d }
            goto L_0x0262
        L_0x025d:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x0263 }
        L_0x0262:
            throw r1     // Catch:{ IOException -> 0x0263 }
        L_0x0263:
            return
        L_0x0264:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null version"
            r0.<init>(r1)
            throw r0
        L_0x026c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0272:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null generator"
            r0.<init>(r1)
            throw r0
        L_0x027a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0280:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null displayVersion"
            r0.<init>(r1)
            throw r0
        L_0x0288:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null buildVersion"
            r0.<init>(r1)
            throw r0
        L_0x0290:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null installationUuid"
            r0.<init>(r1)
            throw r0
        L_0x0298:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null gmpAppId"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C14450d.m35975a(com.google.firebase.crashlytics.internal.common.d, java.lang.String):void");
    }

    /* renamed from: b */
    public static Task m35976b(C14450d dVar) {
        boolean z;
        Task task;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        C18365c cVar = dVar.f36486g;
        for (File file : C18365c.m45219d(cVar.f46821b.listFiles(f36479q))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    task = Tasks.forResult(null);
                } else {
                    task = Tasks.call(new ScheduledThreadPoolExecutor(1), new C17413p(dVar, parseLong));
                }
                arrayList.add(task);
            } catch (NumberFormatException unused2) {
                file.getName();
            }
            file.delete();
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:(1:95)(1:96)|97|98|99|100|101|119) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0279 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43335c(boolean r13, p696oe.C18736f r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            he.e0 r1 = r12.f36491l
            me.b r1 = r1.f44811b
            r1.getClass()
            java.util.TreeSet r2 = new java.util.TreeSet
            me.c r1 = r1.f46818b
            java.io.File r1 = r1.f46822c
            java.lang.String[] r1 = r1.list()
            java.util.List r1 = p648me.C18365c.m45219d(r1)
            r2.<init>(r1)
            java.util.NavigableSet r1 = r2.descendingSet()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r13) goto L_0x0028
            return
        L_0x0028:
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            com.google.firebase.crashlytics.internal.settings.a r14 = (com.google.firebase.crashlytics.internal.settings.C14454a) r14
            java.util.concurrent.atomic.AtomicReference<oe.b> r14 = r14.f36510h
            java.lang.Object r14 = r14.get()
            oe.b r14 = (p696oe.C18730b) r14
            oe.b$a r14 = r14.f47640b
            boolean r14 = r14.f47646b
            r2 = 0
            r3 = 0
            r4 = 1
            if (r14 == 0) goto L_0x00a0
            int r14 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r14 < r5) goto L_0x00a0
            android.content.Context r14 = r12.f36480a
            java.lang.String r5 = "activity"
            java.lang.Object r14 = r14.getSystemService(r5)
            android.app.ActivityManager r14 = (android.app.ActivityManager) r14
            java.util.List r14 = r14.getHistoricalProcessExitReasons((java.lang.String) null, 0, 0)
            int r5 = r14.size()
            if (r5 == 0) goto L_0x00a0
            ie.c r5 = new ie.c
            me.c r6 = r12.f36486g
            r5.<init>(r6, r1)
            me.c r6 = r12.f36486g
            he.e r7 = r12.f36484e
            ie.e r8 = new ie.e
            r8.<init>(r6)
            ie.i r9 = new ie.i
            r9.<init>(r1, r6, r7)
            ie.i$a r6 = r9.f45236d
            java.util.concurrent.atomic.AtomicMarkableReference<ie.b> r6 = r6.f45239a
            java.lang.Object r6 = r6.getReference()
            ie.b r6 = (p555ie.C17579b) r6
            java.util.Map r7 = r8.mo50036b(r1, r3)
            r6.mo50034c(r7)
            ie.i$a r6 = r9.f45237e
            java.util.concurrent.atomic.AtomicMarkableReference<ie.b> r6 = r6.f45239a
            java.lang.Object r6 = r6.getReference()
            ie.b r6 = (p555ie.C17579b) r6
            java.util.Map r7 = r8.mo50036b(r1, r4)
            r6.mo50034c(r7)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r6 = r9.f45238f
            java.lang.String r7 = r8.mo50037c(r1)
            r6.set(r7, r3)
            he.e0 r6 = r12.f36491l
            r6.mo49872e(r1, r14, r5, r9)
        L_0x00a0:
            ee.a r14 = r12.f36489j
            boolean r14 = r14.mo49486d(r1)
            if (r14 == 0) goto L_0x00b1
            ee.a r14 = r12.f36489j
            ee.e r14 = r14.mo49483a(r1)
            r14.getClass()
        L_0x00b1:
            if (r13 == 0) goto L_0x00ba
            java.lang.Object r13 = r0.get(r3)
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
        L_0x00ba:
            he.e0 r13 = r12.f36491l
            long r0 = java.lang.System.currentTimeMillis()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            me.b r13 = r13.f44811b
            me.c r14 = r13.f46818b
            r14.getClass()
            java.io.File r5 = new java.io.File
            java.io.File r6 = r14.f46820a
            java.lang.String r7 = ".com.google.firebase.crashlytics"
            r5.<init>(r6, r7)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x00e2
            boolean r6 = p648me.C18365c.m45218c(r5)
            if (r6 == 0) goto L_0x00e2
            r5.getPath()
        L_0x00e2:
            java.io.File r5 = new java.io.File
            java.io.File r6 = r14.f46820a
            java.lang.String r7 = ".com.google.firebase.crashlytics-ndk"
            r5.<init>(r6, r7)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x00fa
            boolean r6 = p648me.C18365c.m45218c(r5)
            if (r6 == 0) goto L_0x00fa
            r5.getPath()
        L_0x00fa:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto L_0x0102
            r5 = 1
            goto L_0x0103
        L_0x0102:
            r5 = 0
        L_0x0103:
            if (r5 == 0) goto L_0x011d
            java.io.File r5 = new java.io.File
            java.io.File r14 = r14.f46820a
            java.lang.String r6 = ".com.google.firebase.crashlytics.files.v1"
            r5.<init>(r14, r6)
            boolean r14 = r5.exists()
            if (r14 == 0) goto L_0x011d
            boolean r14 = p648me.C18365c.m45218c(r5)
            if (r14 == 0) goto L_0x011d
            r5.getPath()
        L_0x011d:
            java.util.TreeSet r14 = new java.util.TreeSet
            me.c r5 = r13.f46818b
            java.io.File r5 = r5.f46822c
            java.lang.String[] r5 = r5.list()
            java.util.List r5 = p648me.C18365c.m45219d(r5)
            r14.<init>(r5)
            java.util.NavigableSet r14 = r14.descendingSet()
            if (r2 == 0) goto L_0x0137
            r14.remove(r2)
        L_0x0137:
            int r2 = r14.size()
            r5 = 8
            if (r2 > r5) goto L_0x0140
            goto L_0x015f
        L_0x0140:
            int r2 = r14.size()
            if (r2 <= r5) goto L_0x015f
            java.lang.Object r2 = r14.last()
            java.lang.String r2 = (java.lang.String) r2
            me.c r6 = r13.f46818b
            r6.getClass()
            java.io.File r7 = new java.io.File
            java.io.File r6 = r6.f46822c
            r7.<init>(r6, r2)
            p648me.C18365c.m45218c(r7)
            r14.remove(r2)
            goto L_0x0140
        L_0x015f:
            java.util.Iterator r14 = r14.iterator()
        L_0x0163:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x029d
            java.lang.Object r2 = r14.next()
            java.lang.String r2 = (java.lang.String) r2
            me.c r5 = r13.f46818b
            me.a r6 = p648me.C18364b.f46816h
            r5.getClass()
            java.io.File r7 = new java.io.File
            java.io.File r5 = r5.f46822c
            r7.<init>(r5, r2)
            r7.mkdirs()
            java.io.File[] r5 = r7.listFiles(r6)
            java.util.List r5 = p648me.C18365c.m45219d(r5)
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0190
            goto L_0x028c
        L_0x0190:
            java.util.Collections.sort(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x019c:
            r7 = 0
        L_0x019d:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01f8
            java.lang.Object r8 = r5.next()
            java.io.File r8 = (java.io.File) r8
            ke.a r9 = p648me.C18364b.f46814f     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r10 = p648me.C18364b.m45213d(r8)     // Catch:{ IOException -> 0x01f4 }
            r9.getClass()     // Catch:{ IOException -> 0x01f4 }
            android.util.JsonReader r9 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x01ed }
            java.io.StringReader r11 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x01ed }
            r11.<init>(r10)     // Catch:{ IllegalStateException -> 0x01ed }
            r9.<init>(r11)     // Catch:{ IllegalStateException -> 0x01ed }
            je.k r10 = p601ke.C18028a.m44704d(r9)     // Catch:{ all -> 0x01e3 }
            r9.close()     // Catch:{ IllegalStateException -> 0x01ed }
            r6.add(r10)     // Catch:{ IOException -> 0x01f4 }
            if (r7 != 0) goto L_0x01e1
            java.lang.String r9 = r8.getName()     // Catch:{ IOException -> 0x01f4 }
            java.lang.String r10 = "event"
            boolean r10 = r9.startsWith(r10)     // Catch:{ IOException -> 0x01f4 }
            if (r10 == 0) goto L_0x01de
            java.lang.String r10 = "_"
            boolean r7 = r9.endsWith(r10)     // Catch:{ IOException -> 0x01f4 }
            if (r7 == 0) goto L_0x01de
            r7 = 1
            goto L_0x01df
        L_0x01de:
            r7 = 0
        L_0x01df:
            if (r7 == 0) goto L_0x019c
        L_0x01e1:
            r7 = 1
            goto L_0x019d
        L_0x01e3:
            r10 = move-exception
            r9.close()     // Catch:{ all -> 0x01e8 }
            goto L_0x01ec
        L_0x01e8:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch:{ IllegalStateException -> 0x01ed }
        L_0x01ec:
            throw r10     // Catch:{ IllegalStateException -> 0x01ed }
        L_0x01ed:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException     // Catch:{ IOException -> 0x01f4 }
            r10.<init>(r9)     // Catch:{ IOException -> 0x01f4 }
            throw r10     // Catch:{ IOException -> 0x01f4 }
        L_0x01f4:
            java.util.Objects.toString(r8)
            goto L_0x019d
        L_0x01f8:
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L_0x0200
            goto L_0x028c
        L_0x0200:
            me.c r5 = r13.f46818b
            ie.e r8 = new ie.e
            r8.<init>(r5)
            java.lang.String r5 = r8.mo50037c(r2)
            me.c r8 = r13.f46818b
            java.lang.String r9 = "report"
            java.io.File r8 = r8.mo50830a(r2, r9)
            ke.a r9 = p648me.C18364b.f46814f     // Catch:{ IOException -> 0x0289 }
            java.lang.String r10 = p648me.C18364b.m45213d(r8)     // Catch:{ IOException -> 0x0289 }
            r9.getClass()     // Catch:{ IOException -> 0x0289 }
            je.b r9 = p601ke.C18028a.m44707g(r10)     // Catch:{ IOException -> 0x0289 }
            je.b r5 = r9.mo50178i(r5, r0, r7)     // Catch:{ IOException -> 0x0289 }
            je.b0 r9 = new je.b0     // Catch:{ IOException -> 0x0289 }
            r9.<init>(r6)     // Catch:{ IOException -> 0x0289 }
            je.a0$e r6 = r5.f45600h     // Catch:{ IOException -> 0x0289 }
            if (r6 == 0) goto L_0x0281
            je.b$a r6 = new je.b$a     // Catch:{ IOException -> 0x0289 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0289 }
            je.a0$e r5 = r5.f45600h     // Catch:{ IOException -> 0x0289 }
            je.g$a r5 = r5.mo50204l()     // Catch:{ IOException -> 0x0289 }
            r5.f45653j = r9     // Catch:{ IOException -> 0x0289 }
            je.g r5 = r5.mo50336a()     // Catch:{ IOException -> 0x0289 }
            r6.f45608g = r5     // Catch:{ IOException -> 0x0289 }
            je.b r5 = r6.mo50273a()     // Catch:{ IOException -> 0x0289 }
            je.a0$e r6 = r5.f45600h     // Catch:{ IOException -> 0x0289 }
            if (r6 != 0) goto L_0x0249
            goto L_0x028c
        L_0x0249:
            if (r7 == 0) goto L_0x025c
            me.c r7 = r13.f46818b     // Catch:{ IOException -> 0x0289 }
            java.lang.String r6 = r6.mo50199g()     // Catch:{ IOException -> 0x0289 }
            r7.getClass()     // Catch:{ IOException -> 0x0289 }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0289 }
            java.io.File r7 = r7.f46824e     // Catch:{ IOException -> 0x0289 }
            r9.<init>(r7, r6)     // Catch:{ IOException -> 0x0289 }
            goto L_0x026c
        L_0x025c:
            me.c r7 = r13.f46818b     // Catch:{ IOException -> 0x0289 }
            java.lang.String r6 = r6.mo50199g()     // Catch:{ IOException -> 0x0289 }
            r7.getClass()     // Catch:{ IOException -> 0x0289 }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0289 }
            java.io.File r7 = r7.f46823d     // Catch:{ IOException -> 0x0289 }
            r9.<init>(r7, r6)     // Catch:{ IOException -> 0x0289 }
        L_0x026c:
            ue.d r6 = p601ke.C18028a.f46139a     // Catch:{ IOException -> 0x0289 }
            r6.getClass()     // Catch:{ IOException -> 0x0289 }
            java.io.StringWriter r7 = new java.io.StringWriter     // Catch:{ IOException -> 0x0289 }
            r7.<init>()     // Catch:{ IOException -> 0x0289 }
            r6.mo52175a(r7, r5)     // Catch:{ IOException -> 0x0279 }
        L_0x0279:
            java.lang.String r5 = r7.toString()     // Catch:{ IOException -> 0x0289 }
            p648me.C18364b.m45214e(r9, r5)     // Catch:{ IOException -> 0x0289 }
            goto L_0x028c
        L_0x0281:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0289 }
            java.lang.String r6 = "Reports without sessions cannot have events added to them."
            r5.<init>(r6)     // Catch:{ IOException -> 0x0289 }
            throw r5     // Catch:{ IOException -> 0x0289 }
        L_0x0289:
            java.util.Objects.toString(r8)
        L_0x028c:
            me.c r5 = r13.f46818b
            r5.getClass()
            java.io.File r6 = new java.io.File
            java.io.File r5 = r5.f46822c
            r6.<init>(r5, r2)
            p648me.C18365c.m45218c(r6)
            goto L_0x0163
        L_0x029d:
            oe.f r14 = r13.f46819c
            com.google.firebase.crashlytics.internal.settings.a r14 = (com.google.firebase.crashlytics.internal.settings.C14454a) r14
            java.util.concurrent.atomic.AtomicReference<oe.b> r14 = r14.f36510h
            java.lang.Object r14 = r14.get()
            oe.b r14 = (p696oe.C18730b) r14
            oe.b$b r14 = r14.f47639a
            r14.getClass()
            java.util.ArrayList r13 = r13.mo50828b()
            int r14 = r13.size()
            r0 = 4
            if (r14 > r0) goto L_0x02ba
            goto L_0x02d2
        L_0x02ba:
            java.util.List r13 = r13.subList(r0, r14)
            java.util.Iterator r13 = r13.iterator()
        L_0x02c2:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x02d2
            java.lang.Object r14 = r13.next()
            java.io.File r14 = (java.io.File) r14
            r14.delete()
            goto L_0x02c2
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C14450d.mo43335c(boolean, oe.f):void");
    }

    /* renamed from: d */
    public final String mo43336d() {
        C18364b bVar = this.f36491l.f44811b;
        bVar.getClass();
        NavigableSet descendingSet = new TreeSet(C18365c.m45219d(bVar.f46818b.f46822c.list())).descendingSet();
        if (!descendingSet.isEmpty()) {
            return (String) descendingSet.first();
        }
        return null;
    }

    /* renamed from: e */
    public final Task<Void> mo43337e(Task<C18730b> task) {
        boolean z;
        Task task2;
        Task<Void> task3;
        C18364b bVar = this.f36491l.f44811b;
        if (!C18365c.m45219d(bVar.f46818b.f46823d.listFiles()).isEmpty() || !C18365c.m45219d(bVar.f46818b.f46824e.listFiles()).isEmpty() || !C18365c.m45219d(bVar.f46818b.f46825f.listFiles()).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f36493n.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        if (this.f36481b.mo49890a()) {
            this.f36493n.trySetResult(Boolean.FALSE);
            task2 = Tasks.forResult(Boolean.TRUE);
        } else {
            this.f36493n.trySetResult(Boolean.TRUE);
            C17422x xVar = this.f36481b;
            synchronized (xVar.f44872b) {
                task3 = xVar.f44873c.getTask();
            }
            Task<TContinuationResult> onSuccessTask = task3.onSuccessTask(new C17409l());
            Task<Boolean> task4 = this.f36494o.getTask();
            ExecutorService executorService = C17406i0.f44823a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            C13533e eVar = new C13533e(taskCompletionSource, 0);
            onSuccessTask.continueWith(eVar);
            task4.continueWith(eVar);
            task2 = taskCompletionSource.getTask();
        }
        return task2.onSuccessTask(new C14451a(task));
    }
}
