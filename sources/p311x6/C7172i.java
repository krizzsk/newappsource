package p311x6;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: x6.i */
public class C7172i<T, Y> {

    /* renamed from: a */
    public final LinkedHashMap f22256a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public long f22257b;

    /* renamed from: c */
    public long f22258c;

    /* renamed from: x6.i$a */
    public static final class C7173a<Y> {

        /* renamed from: a */
        public final Y f22259a;

        /* renamed from: b */
        public final int f22260b;

        public C7173a(Y y, int i) {
            this.f22259a = y;
            this.f22260b = i;
        }
    }

    public C7172i(long j) {
        this.f22257b = j;
    }

    /* renamed from: a */
    public final synchronized Y mo23471a(T t) {
        Y y;
        C7173a aVar = (C7173a) this.f22256a.get(t);
        if (aVar != null) {
            y = aVar.f22259a;
        } else {
            y = null;
        }
        return y;
    }

    /* renamed from: b */
    public int mo20213b(Y y) {
        return 1;
    }

    /* renamed from: c */
    public void mo20214c(T t, Y y) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        return r5;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized Y mo23472d(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo20213b(r9)     // Catch:{ all -> 0x004c }
            long r1 = (long) r0     // Catch:{ all -> 0x004c }
            long r3 = r7.f22257b     // Catch:{ all -> 0x004c }
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0012
            r7.mo20214c(r8, r9)     // Catch:{ all -> 0x004c }
            monitor-exit(r7)
            return r5
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r3 = r7.f22258c     // Catch:{ all -> 0x004c }
            long r3 = r3 + r1
            r7.f22258c = r3     // Catch:{ all -> 0x004c }
        L_0x0019:
            java.util.LinkedHashMap r1 = r7.f22256a     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x001f
            r2 = r5
            goto L_0x0024
        L_0x001f:
            x6.i$a r2 = new x6.i$a     // Catch:{ all -> 0x004c }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004c }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004c }
            x6.i$a r0 = (p311x6.C7172i.C7173a) r0     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f22258c     // Catch:{ all -> 0x004c }
            int r3 = r0.f22260b     // Catch:{ all -> 0x004c }
            long r3 = (long) r3     // Catch:{ all -> 0x004c }
            long r1 = r1 - r3
            r7.f22258c = r1     // Catch:{ all -> 0x004c }
            Y r1 = r0.f22259a     // Catch:{ all -> 0x004c }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004c }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f22259a     // Catch:{ all -> 0x004c }
            r7.mo20214c(r8, r9)     // Catch:{ all -> 0x004c }
        L_0x0041:
            long r8 = r7.f22257b     // Catch:{ all -> 0x004c }
            r7.mo23473e(r8)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x004a
            Y r5 = r0.f22259a     // Catch:{ all -> 0x004c }
        L_0x004a:
            monitor-exit(r7)
            return r5
        L_0x004c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p311x6.C7172i.mo23472d(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public final synchronized void mo23473e(long j) {
        while (this.f22258c > j) {
            Iterator it = this.f22256a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C7173a aVar = (C7173a) entry.getValue();
            this.f22258c -= (long) aVar.f22260b;
            Object key = entry.getKey();
            it.remove();
            mo20214c(key, aVar.f22259a);
        }
    }
}
