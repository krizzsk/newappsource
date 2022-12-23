package ce0;

import android.os.Handler;

/* renamed from: ce0.p */
public final class C21114p extends Handler {

    /* renamed from: a */
    public long f52966a;

    /* renamed from: b */
    public long f52967b;

    /* renamed from: c */
    public final long f52968c;

    /* renamed from: d */
    public Runnable f52969d;

    public C21114p(long j, C21122w wVar) {
        this.f52968c = j;
        this.f52969d = wVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo53316a() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f52968c     // Catch:{ all -> 0x0024 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x000b
            monitor-exit(r5)
            return
        L_0x000b:
            r0 = 0
            boolean r0 = r5.hasMessages(r0)     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            long r0 = r5.f52968c     // Catch:{ all -> 0x0024 }
            long r2 = r5.f52967b     // Catch:{ all -> 0x0024 }
            long r0 = r0 - r2
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0024 }
            r5.f52966a = r2     // Catch:{ all -> 0x0024 }
            java.lang.Runnable r2 = r5.f52969d     // Catch:{ all -> 0x0024 }
            r5.postDelayed(r2, r0)     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r5)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ce0.C21114p.mo53316a():void");
    }
}
