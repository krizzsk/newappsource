package p976zy;

import com.google.firebase.auth.FirebaseUser;
import java.util.concurrent.Callable;

/* renamed from: zy.a */
public final class C20920a implements Callable<FirebaseUser> {

    /* renamed from: b */
    public static final Object f52669b = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r8 = this;
            java.lang.Object r0 = f52669b
            monitor-enter(r0)
            com.google.firebase.auth.FirebaseAuth r1 = com.google.firebase.auth.FirebaseAuth.getInstance()     // Catch:{ all -> 0x0072 }
            com.google.firebase.auth.FirebaseUser r2 = r1.f36386f     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x0071
        L_0x000e:
            com.moovit.MoovitApplication<?, ?, ?> r2 = com.moovit.MoovitApplication.f37317k     // Catch:{ all -> 0x0072 }
            r3 = 0
            if (r2 != 0) goto L_0x0014
            goto L_0x0031
        L_0x0014:
            c70.e r4 = r2.mo44560l()     // Catch:{ all -> 0x0072 }
            tp.a0 r5 = r4.f33853b     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            boolean r4 = com.moovit.appdata.UserContextLoader.m40004l(r2)     // Catch:{ all -> 0x0072 }
            if (r4 != 0) goto L_0x0024
            goto L_0x0031
        L_0x0024:
            lz.a r4 = r2.f37321e     // Catch:{ all -> 0x0072 }
            r5 = 0
            java.lang.String r6 = "USER_CONTEXT"
            java.lang.Object r4 = r4.mo50695h(r6, r5)     // Catch:{ all -> 0x0072 }
            tp.a0 r4 = (p824tp.C19722a0) r4     // Catch:{ all -> 0x0072 }
            if (r4 != 0) goto L_0x0033
        L_0x0031:
            r4 = r3
            goto L_0x0039
        L_0x0033:
            c70.e r5 = new c70.e     // Catch:{ all -> 0x0072 }
            r5.<init>(r2, r4, r3)     // Catch:{ all -> 0x0072 }
            r4 = r5
        L_0x0039:
            if (r4 != 0) goto L_0x003d
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x004d
        L_0x003d:
            zy.e r2 = new zy.e     // Catch:{ all -> 0x0072 }
            r2.<init>(r4)     // Catch:{ all -> 0x0072 }
            wz.g r2 = r2.mo52626J()     // Catch:{ all -> 0x0072 }
            zy.f r2 = (p976zy.C20925f) r2     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = r2.f52675m     // Catch:{ all -> 0x0072 }
            if (r2 != 0) goto L_0x004f
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
        L_0x004d:
            r2 = r3
            goto L_0x0071
        L_0x004f:
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x0072 }
            com.google.android.gms.internal.firebase-auth-api.zzwa r4 = r1.f36385e     // Catch:{ all -> 0x0072 }
            qd.d r5 = r1.f36381a     // Catch:{ all -> 0x0072 }
            java.lang.String r6 = r1.f36389i     // Catch:{ all -> 0x0072 }
            ae.r r7 = new ae.r     // Catch:{ all -> 0x0072 }
            r7.<init>(r1)     // Catch:{ all -> 0x0072 }
            com.google.android.gms.tasks.Task r1 = r4.zzz(r5, r2, r6, r7)     // Catch:{ all -> 0x0072 }
            java.lang.Object r1 = com.google.android.gms.tasks.Tasks.await(r1)     // Catch:{ all -> 0x0072 }
            com.google.firebase.auth.AuthResult r1 = (com.google.firebase.auth.AuthResult) r1     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x006f
            com.google.firebase.auth.internal.zzx r1 = r1.mo43267F0()     // Catch:{ all -> 0x0072 }
            r2 = r1
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
        L_0x0071:
            return r2
        L_0x0072:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p976zy.C20920a.call():java.lang.Object");
    }
}
