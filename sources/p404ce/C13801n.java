package p404ce;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p484ff.C16985n;
import p743qd.C19104a;
import p885we.C20292b;
import p885we.C20293c;
import p885we.C20294d;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: ce.n */
public final class C13801n implements C20294d, C20293c {

    /* renamed from: a */
    public final HashMap f33970a = new HashMap();

    /* renamed from: b */
    public ArrayDeque f33971b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f33972c;

    public C13801n(Executor executor) {
        this.f33972c = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40732a(p885we.C20292b r3) {
        /*
            r2 = this;
            java.lang.Class<qd.a> r0 = p743qd.C19104a.class
            monitor-enter(r2)
            r3.getClass()     // Catch:{ all -> 0x0028 }
            java.util.HashMap r1 = r2.f33970a     // Catch:{ all -> 0x0028 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0010
            monitor-exit(r2)
            return
        L_0x0010:
            java.util.HashMap r1 = r2.f33970a     // Catch:{ all -> 0x0028 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0028 }
            j$.util.concurrent.ConcurrentHashMap r1 = (p988j$.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x0028 }
            r1.remove(r3)     // Catch:{ all -> 0x0028 }
            boolean r3 = r1.isEmpty()     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0026
            java.util.HashMap r3 = r2.f33970a     // Catch:{ all -> 0x0028 }
            r3.remove(r0)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r2)
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p404ce.C13801n.mo40732a(we.b):void");
    }

    /* renamed from: b */
    public final void mo40733b(C16985n nVar) {
        mo40734c(this.f33972c, nVar);
    }

    /* renamed from: c */
    public final synchronized void mo40734c(Executor executor, C20292b bVar) {
        Class<C19104a> cls = C19104a.class;
        synchronized (this) {
            executor.getClass();
            if (!this.f33970a.containsKey(cls)) {
                this.f33970a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f33970a.get(cls)).put(bVar, executor);
        }
    }
}
