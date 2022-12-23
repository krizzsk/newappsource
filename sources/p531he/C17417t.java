package p531he;

import android.content.Context;
import com.android.billingclient.api.C1963s;
import com.google.firebase.crashlytics.internal.common.C14450d;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p028ba.C1513g;
import p102h0.C5021e;
import p247s6.C6478c;
import p459ee.C16810a;
import p459ee.C16812c;
import p483fe.C16953a;
import p507ge.C17186b;
import p648me.C18365c;
import p743qd.C19107d;

/* renamed from: he.t */
public final class C17417t {

    /* renamed from: a */
    public final Context f44849a;

    /* renamed from: b */
    public final C17422x f44850b;

    /* renamed from: c */
    public final C6478c f44851c = new C6478c(1);

    /* renamed from: d */
    public final long f44852d = System.currentTimeMillis();

    /* renamed from: e */
    public C1963s f44853e;

    /* renamed from: f */
    public C1963s f44854f;

    /* renamed from: g */
    public C14450d f44855g;

    /* renamed from: h */
    public final C17390b0 f44856h;

    /* renamed from: i */
    public final C18365c f44857i;

    /* renamed from: j */
    public final C17186b f44858j;

    /* renamed from: k */
    public final C16953a f44859k;

    /* renamed from: l */
    public final ExecutorService f44860l;

    /* renamed from: m */
    public final C17395e f44861m;

    /* renamed from: n */
    public final C16810a f44862n;

    /* renamed from: he.t$a */
    public class C17418a implements Callable<Boolean> {
        public C17418a() {
        }

        public final Object call() throws Exception {
            try {
                C1963s sVar = C17417t.this.f44853e;
                C18365c cVar = (C18365c) sVar.f6792b;
                cVar.getClass();
                return Boolean.valueOf(new File(cVar.f46821b, (String) sVar.f6791a).delete());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    public C17417t(C19107d dVar, C17390b0 b0Var, C16812c cVar, C17422x xVar, C5021e eVar, C1513g gVar, C18365c cVar2, ExecutorService executorService) {
        this.f44850b = xVar;
        dVar.mo51535a();
        this.f44849a = dVar.f48568a;
        this.f44856h = b0Var;
        this.f44862n = cVar;
        this.f44858j = eVar;
        this.f44859k = gVar;
        this.f44860l = executorService;
        this.f44857i = cVar2;
        this.f44861m = new C17395e(executorService);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0046 A[Catch:{ Exception -> 0x0075, all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0052 A[Catch:{ Exception -> 0x0075, all -> 0x0073 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.tasks.Task m43453a(p531he.C17417t r4, p696oe.C18736f r5) {
        /*
            he.e r0 = r4.f44861m
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r0.f44808d
            java.lang.Object r0 = r0.get()
            boolean r0 = r1.equals(r0)
            java.lang.String r1 = "Not running on background worker thread as intended."
            if (r0 == 0) goto L_0x00a3
            com.android.billingclient.api.s r0 = r4.f44853e
            r0.getClass()
            java.lang.Object r2 = r0.f6792b     // Catch:{ IOException -> 0x002c }
            me.c r2 = (p648me.C18365c) r2     // Catch:{ IOException -> 0x002c }
            java.lang.Object r0 = r0.f6791a     // Catch:{ IOException -> 0x002c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x002c }
            r2.getClass()     // Catch:{ IOException -> 0x002c }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x002c }
            java.io.File r2 = r2.f46821b     // Catch:{ IOException -> 0x002c }
            r3.<init>(r2, r0)     // Catch:{ IOException -> 0x002c }
            r3.createNewFile()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            ge.b r0 = r4.f44858j     // Catch:{ Exception -> 0x0075 }
            he.q r2 = new he.q     // Catch:{ Exception -> 0x0075 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0075 }
            r0.mo20738b(r2)     // Catch:{ Exception -> 0x0075 }
            com.google.firebase.crashlytics.internal.settings.a r5 = (com.google.firebase.crashlytics.internal.settings.C14454a) r5     // Catch:{ Exception -> 0x0075 }
            java.util.concurrent.atomic.AtomicReference<oe.b> r0 = r5.f36510h     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0075 }
            oe.b r0 = (p696oe.C18730b) r0     // Catch:{ Exception -> 0x0075 }
            oe.b$a r0 = r0.f47640b     // Catch:{ Exception -> 0x0075 }
            boolean r0 = r0.f47645a     // Catch:{ Exception -> 0x0075 }
            if (r0 != 0) goto L_0x0052
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = "Collection of crash reports disabled in Crashlytics settings."
            r5.<init>(r0)     // Catch:{ Exception -> 0x0075 }
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forException(r5)     // Catch:{ Exception -> 0x0075 }
            goto L_0x009b
        L_0x0052:
            com.google.firebase.crashlytics.internal.common.d r0 = r4.f44855g     // Catch:{ Exception -> 0x0075 }
            he.e r2 = r0.f36484e     // Catch:{ Exception -> 0x0075 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0075 }
            java.lang.ThreadLocal<java.lang.Boolean> r2 = r2.f44808d     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0075 }
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0075 }
            if (r2 == 0) goto L_0x0091
            com.google.firebase.crashlytics.internal.common.e r1 = r0.f36492m     // Catch:{ Exception -> 0x0075 }
            r2 = 1
            if (r1 == 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.f36502e     // Catch:{ Exception -> 0x0075 }
            boolean r1 = r1.get()     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x0077
            r1 = 1
            goto L_0x0078
        L_0x0073:
            r5 = move-exception
            goto L_0x009f
        L_0x0075:
            r5 = move-exception
            goto L_0x0097
        L_0x0077:
            r1 = 0
        L_0x0078:
            if (r1 == 0) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r0.mo43335c(r2, r5)     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            com.google.firebase.crashlytics.internal.common.d r0 = r4.f44855g     // Catch:{ Exception -> 0x0075 }
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<oe.b>> r5 = r5.f36511i     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x0075 }
            com.google.android.gms.tasks.TaskCompletionSource r5 = (com.google.android.gms.tasks.TaskCompletionSource) r5     // Catch:{ Exception -> 0x0075 }
            com.google.android.gms.tasks.Task r5 = r5.getTask()     // Catch:{ Exception -> 0x0075 }
            com.google.android.gms.tasks.Task r5 = r0.mo43337e(r5)     // Catch:{ Exception -> 0x0075 }
            goto L_0x009b
        L_0x0091:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0075 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0075 }
            throw r5     // Catch:{ Exception -> 0x0075 }
        L_0x0097:
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forException(r5)     // Catch:{ all -> 0x0073 }
        L_0x009b:
            r4.mo49884b()
            return r5
        L_0x009f:
            r4.mo49884b()
            throw r5
        L_0x00a3:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p531he.C17417t.m43453a(he.t, oe.f):com.google.android.gms.tasks.Task");
    }

    /* renamed from: b */
    public final void mo49884b() {
        this.f44861m.mo49869a(new C17418a());
    }

    /* renamed from: c */
    public final void mo49885c(String str, String str2) {
        boolean z;
        C14450d dVar = this.f44855g;
        dVar.getClass();
        try {
            dVar.f36483d.mo50053a(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = dVar.f36480a;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    throw e;
                }
            }
        }
    }
}
