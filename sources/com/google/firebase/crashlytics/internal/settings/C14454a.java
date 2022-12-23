package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p069e3.C4544g;
import p208p6.C6094b;
import p258t4.C6589c;
import p531he.C17401g0;
import p531he.C17406i0;
import p531he.C17422x;
import p696oe.C18729a;
import p696oe.C18730b;
import p696oe.C18733c;
import p696oe.C18734d;
import p696oe.C18736f;
import p696oe.C18737g;

/* renamed from: com.google.firebase.crashlytics.internal.settings.a */
public final class C14454a implements C18736f {

    /* renamed from: a */
    public final Context f36503a;

    /* renamed from: b */
    public final C18737g f36504b;

    /* renamed from: c */
    public final C18734d f36505c;

    /* renamed from: d */
    public final C6589c f36506d;

    /* renamed from: e */
    public final C4544g f36507e;

    /* renamed from: f */
    public final C6094b f36508f;

    /* renamed from: g */
    public final C17422x f36509g;

    /* renamed from: h */
    public final AtomicReference<C18730b> f36510h;

    /* renamed from: i */
    public final AtomicReference<TaskCompletionSource<C18730b>> f36511i = new AtomicReference<>(new TaskCompletionSource());

    public C14454a(Context context, C18737g gVar, C6589c cVar, C18734d dVar, C4544g gVar2, C6094b bVar, C17422x xVar) {
        AtomicReference<C18730b> atomicReference = new AtomicReference<>();
        this.f36510h = atomicReference;
        this.f36503a = context;
        this.f36504b = gVar;
        this.f36506d = cVar;
        this.f36505c = dVar;
        this.f36507e = gVar2;
        this.f36508f = bVar;
        this.f36509g = xVar;
        atomicReference.set(C18729a.m45736b(cVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p696oe.C18730b mo43339a(com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r7) {
        /*
            r6 = this;
            r0 = 0
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r1 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.SKIP_CACHE_LOOKUP     // Catch:{ Exception -> 0x007d }
            boolean r1 = r1.equals(r7)     // Catch:{ Exception -> 0x007d }
            if (r1 != 0) goto L_0x007d
            e3.g r1 = r6.f36507e     // Catch:{ Exception -> 0x007d }
            r1.getClass()     // Catch:{ Exception -> 0x007d }
            java.lang.Object r1 = r1.f15660c     // Catch:{ Exception -> 0x0035, all -> 0x002f }
            java.io.File r1 = (java.io.File) r1     // Catch:{ Exception -> 0x0035, all -> 0x002f }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0035, all -> 0x002f }
            if (r2 == 0) goto L_0x0029
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0035, all -> 0x002f }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0035, all -> 0x002f }
            java.lang.String r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35973k(r2)     // Catch:{ Exception -> 0x0036, all -> 0x0027 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0036, all -> 0x0027 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0036, all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r7 = move-exception
            goto L_0x0031
        L_0x0029:
            r2 = r0
            r3 = r2
        L_0x002b:
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r2)     // Catch:{ Exception -> 0x007d }
            goto L_0x003a
        L_0x002f:
            r7 = move-exception
            r2 = r0
        L_0x0031:
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r2)     // Catch:{ Exception -> 0x007d }
            throw r7     // Catch:{ Exception -> 0x007d }
        L_0x0035:
            r2 = r0
        L_0x0036:
            com.google.firebase.crashlytics.internal.common.CommonUtils.m35963a(r2)     // Catch:{ Exception -> 0x007d }
            r3 = r0
        L_0x003a:
            if (r3 == 0) goto L_0x007d
            oe.d r1 = r6.f36505c     // Catch:{ Exception -> 0x007d }
            r1.getClass()     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = "settings_version"
            int r2 = r3.getInt(r2)     // Catch:{ Exception -> 0x007d }
            r4 = 3
            if (r2 == r4) goto L_0x0050
            oe.a r2 = new oe.a     // Catch:{ Exception -> 0x007d }
            r2.<init>()     // Catch:{ Exception -> 0x007d }
            goto L_0x0055
        L_0x0050:
            oe.h r2 = new oe.h     // Catch:{ Exception -> 0x007d }
            r2.<init>()     // Catch:{ Exception -> 0x007d }
        L_0x0055:
            t4.c r1 = r1.f47649a     // Catch:{ Exception -> 0x007d }
            oe.b r1 = r2.mo51094a(r1, r3)     // Catch:{ Exception -> 0x007d }
            if (r1 == 0) goto L_0x007d
            r3.toString()     // Catch:{ Exception -> 0x007d }
            t4.c r2 = r6.f36506d     // Catch:{ Exception -> 0x007d }
            r2.getClass()     // Catch:{ Exception -> 0x007d }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x007d }
            com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior r4 = com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION     // Catch:{ Exception -> 0x007d }
            boolean r7 = r4.equals(r7)     // Catch:{ Exception -> 0x007d }
            if (r7 != 0) goto L_0x007c
            long r4 = r1.f47641c     // Catch:{ Exception -> 0x007d }
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x0079
            r7 = 1
            goto L_0x007a
        L_0x0079:
            r7 = 0
        L_0x007a:
            if (r7 != 0) goto L_0x007d
        L_0x007c:
            r0 = r1
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.settings.C14454a.mo43339a(com.google.firebase.crashlytics.internal.settings.SettingsCacheBehavior):oe.b");
    }

    /* renamed from: b */
    public final Task mo43340b(ExecutorService executorService) {
        Task<Void> task;
        C18730b a;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.USE_CACHE;
        if ((!this.f36503a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.f36504b.f47655f)) || (a = mo43339a(settingsCacheBehavior)) == null) {
            C18730b a2 = mo43339a(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
            if (a2 != null) {
                this.f36510h.set(a2);
                this.f36511i.get().trySetResult(a2);
            }
            C17422x xVar = this.f36509g;
            Task<Void> task2 = xVar.f44876f.getTask();
            synchronized (xVar.f44872b) {
                task = xVar.f44873c.getTask();
            }
            ExecutorService executorService2 = C17406i0.f44823a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            C17401g0 g0Var = new C17401g0(taskCompletionSource);
            task2.continueWith(executorService, g0Var);
            task.continueWith(executorService, g0Var);
            return taskCompletionSource.getTask().onSuccessTask(executorService, new C18733c(this));
        }
        this.f36510h.set(a);
        this.f36511i.get().trySetResult(a);
        return Tasks.forResult(null);
    }
}
