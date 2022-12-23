package androidx.camera.core;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p054d0.C4323z;
import p066e0.C4462z;
import p102h0.C5018c;

/* renamed from: androidx.camera.core.k */
public final class C0609k extends C0608j {

    /* renamed from: v */
    public final Executor f2102v;

    /* renamed from: w */
    public final Object f2103w = new Object();

    /* renamed from: x */
    public C0627p f2104x;

    /* renamed from: y */
    public C0611b f2105y;

    /* renamed from: androidx.camera.core.k$a */
    public class C0610a implements C5018c<Void> {

        /* renamed from: a */
        public final /* synthetic */ C0611b f2106a;

        public C0610a(C0611b bVar) {
            this.f2106a = bVar;
        }

        public final void onFailure(Throwable th) {
            this.f2106a.close();
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* renamed from: androidx.camera.core.k$b */
    public static class C0611b extends C0554h {

        /* renamed from: d */
        public final WeakReference<C0609k> f2107d;

        public C0611b(C0627p pVar, C0609k kVar) {
            super(pVar);
            this.f2107d = new WeakReference<>(kVar);
            mo2436a(new C4323z(this));
        }
    }

    public C0609k(Executor executor) {
        this.f2102v = executor;
    }

    /* renamed from: a */
    public final C0627p mo2536a(C4462z zVar) {
        return zVar.acquireLatestImage();
    }

    /* renamed from: d */
    public final void mo2539d() {
        synchronized (this.f2103w) {
            C0627p pVar = this.f2104x;
            if (pVar != null) {
                pVar.close();
                this.f2104x = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2541f(androidx.camera.core.C0627p r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2103w
            monitor-enter(r0)
            boolean r1 = r6.f2101t     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x000c
            r7.close()     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x000c:
            androidx.camera.core.k$b r1 = r6.f2105y     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0035
            d0.g0 r1 = r7.getImageInfo()     // Catch:{ all -> 0x004e }
            long r1 = r1.getTimestamp()     // Catch:{ all -> 0x004e }
            androidx.camera.core.k$b r3 = r6.f2105y     // Catch:{ all -> 0x004e }
            d0.g0 r3 = r3.getImageInfo()     // Catch:{ all -> 0x004e }
            long r3 = r3.getTimestamp()     // Catch:{ all -> 0x004e }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x002a
            r7.close()     // Catch:{ all -> 0x004e }
            goto L_0x0033
        L_0x002a:
            androidx.camera.core.p r1 = r6.f2104x     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ all -> 0x004e }
        L_0x0031:
            r6.f2104x = r7     // Catch:{ all -> 0x004e }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x0035:
            androidx.camera.core.k$b r1 = new androidx.camera.core.k$b     // Catch:{ all -> 0x004e }
            r1.<init>(r7, r6)     // Catch:{ all -> 0x004e }
            r6.f2105y = r1     // Catch:{ all -> 0x004e }
            od.c r7 = r6.mo2537b(r1)     // Catch:{ all -> 0x004e }
            androidx.camera.core.k$a r2 = new androidx.camera.core.k$a     // Catch:{ all -> 0x004e }
            r2.<init>(r1)     // Catch:{ all -> 0x004e }
            g0.a r1 = com.google.android.play.core.appupdate.C14226d.m35352s0()     // Catch:{ all -> 0x004e }
            p102h0.C5023g.m12853a(r7, r2, r1)     // Catch:{ all -> 0x004e }
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            return
        L_0x004e:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C0609k.mo2541f(androidx.camera.core.p):void");
    }
}
