package p484ff;

import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* renamed from: ff.j0 */
public final class C16980j0 {

    /* renamed from: a */
    public static final long f44078a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f44079b = new Object();

    /* renamed from: c */
    public static WakeLock f44080c;

    /* renamed from: a */
    public static void m42818a(Intent intent) {
        synchronized (f44079b) {
            if (f44080c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                f44080c.release();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return r4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName m42819b(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f44079b
            monitor-enter(r0)
            com.google.android.gms.stats.WakeLock r1 = f44080c     // Catch:{ all -> 0x0034 }
            r2 = 1
            if (r1 != 0) goto L_0x0014
            com.google.android.gms.stats.WakeLock r1 = new com.google.android.gms.stats.WakeLock     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0034 }
            f44080c = r1     // Catch:{ all -> 0x0034 }
            r1.setReferenceCounted(r2)     // Catch:{ all -> 0x0034 }
        L_0x0014:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch:{ all -> 0x0034 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0029
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r4
        L_0x0029:
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.stats.WakeLock r5 = f44080c     // Catch:{ all -> 0x0034 }
            long r1 = f44078a     // Catch:{ all -> 0x0034 }
            r5.acquire(r1)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r4
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p484ff.C16980j0.m42819b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
