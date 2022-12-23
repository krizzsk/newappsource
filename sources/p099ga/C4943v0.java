package p099ga;

import android.os.Looper;
import com.google.android.exoplayer2.ExoPlaybackException;
import p277ub.C6773a;
import p277ub.C6809w;
import p583jk.C17875h;

/* renamed from: ga.v0 */
public final class C4943v0 {

    /* renamed from: a */
    public final C4945b f16714a;

    /* renamed from: b */
    public final C4944a f16715b;

    /* renamed from: c */
    public final C6773a f16716c;

    /* renamed from: d */
    public int f16717d;

    /* renamed from: e */
    public Object f16718e;

    /* renamed from: f */
    public Looper f16719f;

    /* renamed from: g */
    public boolean f16720g;

    /* renamed from: h */
    public boolean f16721h;

    /* renamed from: i */
    public boolean f16722i;

    /* renamed from: ga.v0$a */
    public interface C4944a {
    }

    /* renamed from: ga.v0$b */
    public interface C4945b {
        /* renamed from: j */
        void mo15819j(int i, Object obj) throws ExoPlaybackException;
    }

    public C4943v0(C4887g0 g0Var, C4945b bVar, C4879e1 e1Var, int i, C6773a aVar, Looper looper) {
        this.f16715b = g0Var;
        this.f16714a = bVar;
        this.f16719f = looper;
        this.f16716c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e A[SYNTHETIC, Splitter:B:16:0x003e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20611a(long r7) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f16720g     // Catch:{ all -> 0x0046 }
            p583jk.C17875h.m44304o(r0)     // Catch:{ all -> 0x0046 }
            android.os.Looper r0 = r6.f16719f     // Catch:{ all -> 0x0046 }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x0046 }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0046 }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            p583jk.C17875h.m44304o(r0)     // Catch:{ all -> 0x0046 }
            ub.a r0 = r6.f16716c     // Catch:{ all -> 0x0046 }
            long r0 = r0.elapsedRealtime()     // Catch:{ all -> 0x0046 }
            long r0 = r0 + r7
        L_0x001f:
            boolean r2 = r6.f16722i     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x003a
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x003a
            ub.a r2 = r6.f16716c     // Catch:{ all -> 0x0046 }
            r2.mo22944c()     // Catch:{ all -> 0x0046 }
            r6.wait(r7)     // Catch:{ all -> 0x0046 }
            ub.a r7 = r6.f16716c     // Catch:{ all -> 0x0046 }
            long r7 = r7.elapsedRealtime()     // Catch:{ all -> 0x0046 }
            long r7 = r0 - r7
            goto L_0x001f
        L_0x003a:
            if (r2 == 0) goto L_0x003e
            monitor-exit(r6)
            return
        L_0x003e:
            java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0046 }
            java.lang.String r8 = "Message delivery timed out."
            r7.<init>(r8)     // Catch:{ all -> 0x0046 }
            throw r7     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4943v0.mo20611a(long):void");
    }

    /* renamed from: b */
    public final synchronized void mo20612b(boolean z) {
        this.f16721h = z | this.f16721h;
        this.f16722i = true;
        notifyAll();
    }

    /* renamed from: c */
    public final void mo20613c() {
        C17875h.m44304o(!this.f16720g);
        this.f16720g = true;
        C4887g0 g0Var = (C4887g0) this.f16715b;
        synchronized (g0Var) {
            if (!g0Var.f16486z) {
                if (g0Var.f16469i.isAlive()) {
                    ((C6809w) g0Var.f16468h).mo23021a(14, this).mo23023a();
                    return;
                }
            }
            mo20612b(false);
        }
    }
}
