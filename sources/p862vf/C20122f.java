package p862vf;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.C14535a;
import com.google.firebase.remoteconfig.internal.C14537b;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p358af.C13436c;
import p404ce.C13794i;
import p434dd.C16545c;
import p743qd.C19107d;
import p764rd.C19254b;
import p836ud.C19885a;
import p886wf.C20297c;
import p886wf.C20302g;
import p886wf.C20303h;
import p956ze.C20839b;

@KeepForSdk
/* renamed from: vf.f */
public final class C20122f {

    /* renamed from: j */
    public static final Clock f51051j = DefaultClock.getInstance();

    /* renamed from: k */
    public static final Random f51052k = new Random();

    /* renamed from: a */
    public final HashMap f51053a;

    /* renamed from: b */
    public final Context f51054b;

    /* renamed from: c */
    public final ExecutorService f51055c;

    /* renamed from: d */
    public final C19107d f51056d;

    /* renamed from: e */
    public final C13436c f51057e;

    /* renamed from: f */
    public final C19254b f51058f;

    /* renamed from: g */
    public final C20839b<C19885a> f51059g;

    /* renamed from: h */
    public final String f51060h;

    /* renamed from: i */
    public HashMap f51061i;

    public C20122f() {
        throw null;
    }

    public C20122f(Context context, C19107d dVar, C13436c cVar, C19254b bVar, C20839b<C19885a> bVar2) {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f51053a = new HashMap();
        this.f51061i = new HashMap();
        this.f51054b = context;
        this.f51055c = newCachedThreadPool;
        this.f51056d = dVar;
        this.f51057e = cVar;
        this.f51058f = bVar;
        this.f51059g = bVar2;
        dVar.mo51535a();
        this.f51060h = dVar.f48570c.f48582b;
        Tasks.call(newCachedThreadPool, new C20121e(this, 0));
    }

    @KeepForSdk
    /* renamed from: a */
    public final synchronized C20118b mo52366a(String str) {
        C20297c c;
        C20297c c2;
        C20297c c3;
        C14537b bVar;
        C20302g gVar;
        C16545c cVar;
        c = mo52368c(str, "fetch");
        c2 = mo52368c(str, "activate");
        c3 = mo52368c(str, "defaults");
        bVar = new C14537b(this.f51054b.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", this.f51060h, str, "settings"}), 0));
        gVar = new C20302g(this.f51055c, c2, c3);
        C19107d dVar = this.f51056d;
        C20839b<C19885a> bVar2 = this.f51059g;
        dVar.mo51535a();
        if (!dVar.f48569b.equals("[DEFAULT]") || !str.equals("firebase")) {
            cVar = null;
        } else {
            cVar = new C16545c(bVar2);
        }
        if (cVar != null) {
            C20120d dVar2 = new C20120d(cVar);
            synchronized (gVar.f51482a) {
                gVar.f51482a.add(dVar2);
            }
        }
        return mo52367b(this.f51056d, str, this.f51057e, this.f51058f, this.f51055c, c, c2, c3, mo52369d(str, c, bVar), gVar, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p862vf.C20118b mo52367b(p743qd.C19107d r14, java.lang.String r15, p358af.C13436c r16, p764rd.C19254b r17, java.util.concurrent.ExecutorService r18, p886wf.C20297c r19, p886wf.C20297c r20, p886wf.C20297c r21, com.google.firebase.remoteconfig.internal.C14535a r22, p886wf.C20302g r23, com.google.firebase.remoteconfig.internal.C14537b r24) {
        /*
            r13 = this;
            r1 = r13
            r0 = r15
            monitor-enter(r13)
            java.util.HashMap r2 = r1.f51053a     // Catch:{ all -> 0x0059 }
            boolean r2 = r2.containsKey(r15)     // Catch:{ all -> 0x0059 }
            if (r2 != 0) goto L_0x004f
            vf.b r2 = new vf.b     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = "firebase"
            boolean r3 = r15.equals(r3)     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0025
            r14.mo51535a()     // Catch:{ all -> 0x0059 }
            r3 = r14
            java.lang.String r3 = r3.f48569b     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "[DEFAULT]"
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0059 }
            if (r3 == 0) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 == 0) goto L_0x002b
            r5 = r17
            goto L_0x002d
        L_0x002b:
            r3 = 0
            r5 = r3
        L_0x002d:
            r3 = r2
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0059 }
            r20.mo52465c()     // Catch:{ all -> 0x0059 }
            r21.mo52465c()     // Catch:{ all -> 0x0059 }
            r19.mo52465c()     // Catch:{ all -> 0x0059 }
            java.util.HashMap r3 = r1.f51053a     // Catch:{ all -> 0x0059 }
            r3.put(r15, r2)     // Catch:{ all -> 0x0059 }
        L_0x004f:
            java.util.HashMap r2 = r1.f51053a     // Catch:{ all -> 0x0059 }
            java.lang.Object r0 = r2.get(r15)     // Catch:{ all -> 0x0059 }
            vf.b r0 = (p862vf.C20118b) r0     // Catch:{ all -> 0x0059 }
            monitor-exit(r13)
            return r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p862vf.C20122f.mo52367b(qd.d, java.lang.String, af.c, rd.b, java.util.concurrent.ExecutorService, wf.c, wf.c, wf.c, com.google.firebase.remoteconfig.internal.a, wf.g, com.google.firebase.remoteconfig.internal.b):vf.b");
    }

    /* renamed from: c */
    public final C20297c mo52368c(String str, String str2) {
        C20303h hVar;
        C20297c cVar;
        String format = String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f51060h, str, str2});
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Context context = this.f51054b;
        HashMap hashMap = C20303h.f51486c;
        synchronized (C20303h.class) {
            HashMap hashMap2 = C20303h.f51486c;
            if (!hashMap2.containsKey(format)) {
                hashMap2.put(format, new C20303h(context, format));
            }
            hVar = (C20303h) hashMap2.get(format);
        }
        HashMap hashMap3 = C20297c.f51462d;
        synchronized (C20297c.class) {
            String str3 = hVar.f51488b;
            HashMap hashMap4 = C20297c.f51462d;
            if (!hashMap4.containsKey(str3)) {
                hashMap4.put(str3, new C20297c(newCachedThreadPool, hVar));
            }
            cVar = (C20297c) hashMap4.get(str3);
        }
        return cVar;
    }

    /* renamed from: d */
    public final synchronized C14535a mo52369d(String str, C20297c cVar, C14537b bVar) {
        C20839b bVar2;
        C14535a aVar;
        C14537b bVar3 = bVar;
        synchronized (this) {
            C13436c cVar2 = this.f51057e;
            C19107d dVar = this.f51056d;
            dVar.mo51535a();
            if (dVar.f48569b.equals("[DEFAULT]")) {
                bVar2 = this.f51059g;
            } else {
                bVar2 = new C13794i(1);
            }
            C20839b bVar4 = bVar2;
            ExecutorService executorService = this.f51055c;
            Clock clock = f51051j;
            Random random = f51052k;
            C19107d dVar2 = this.f51056d;
            dVar2.mo51535a();
            String str2 = dVar2.f48570c.f48581a;
            C19107d dVar3 = this.f51056d;
            dVar3.mo51535a();
            Clock clock2 = clock;
            Random random2 = random;
            C20297c cVar3 = cVar;
            aVar = new C14535a(cVar2, bVar4, executorService, clock2, random2, cVar3, new ConfigFetchHttpClient(this.f51054b, dVar3.f48570c.f48582b, str2, str, bVar3.f36700a.getLong("fetch_timeout_in_seconds", 60), bVar3.f36700a.getLong("fetch_timeout_in_seconds", 60)), bVar, this.f51061i);
        }
        return aVar;
    }
}
