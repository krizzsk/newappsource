package le0;

import ne0.C24495a;
import ue0.C25030a;

/* renamed from: le0.a */
public final class C24223a implements C24224b, C24495a {

    /* renamed from: b */
    public C25030a<C24224b> f61528b;

    /* renamed from: c */
    public volatile boolean f61529c;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo60400a(le0.C24224b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            if (r8 == 0) goto L_0x0052
            boolean r0 = r7.f61529c
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            monitor-enter(r7)
            boolean r0 = r7.f61529c     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            return r1
        L_0x0011:
            ue0.a<le0.b> r0 = r7.f61528b     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x004d
            T[] r2 = r0.f63222d     // Catch:{ all -> 0x004f }
            int r3 = r0.f63219a     // Catch:{ all -> 0x004f }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x004f }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004f }
            r6 = 1
            if (r5 != 0) goto L_0x002c
            goto L_0x003c
        L_0x002c:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x0036
            r0.mo61562b(r4, r3, r2)     // Catch:{ all -> 0x004f }
            goto L_0x0047
        L_0x0036:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x004f }
            if (r5 != 0) goto L_0x003e
        L_0x003c:
            r8 = 0
            goto L_0x0048
        L_0x003e:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x0036
            r0.mo61562b(r4, r3, r2)     // Catch:{ all -> 0x004f }
        L_0x0047:
            r8 = 1
        L_0x0048:
            if (r8 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            return r6
        L_0x004d:
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            return r1
        L_0x004f:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            throw r8
        L_0x0052:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: le0.C24223a.mo60400a(le0.b):boolean");
    }

    /* renamed from: b */
    public final boolean mo60401b(C24224b bVar) {
        if (!this.f61529c) {
            synchronized (this) {
                if (!this.f61529c) {
                    C25030a<C24224b> aVar = this.f61528b;
                    if (aVar == null) {
                        aVar = new C25030a<>();
                        this.f61528b = aVar;
                    }
                    aVar.mo61561a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* renamed from: c */
    public final boolean mo60402c(C24224b bVar) {
        if (!mo60400a(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r1.f63222d;
        r3 = r1.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r5 >= r3) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r6 = r1[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if ((r6 instanceof le0.C24224b) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        ((le0.C24224b) r6).dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        com.google.android.play.core.appupdate.C14226d.m35340G0(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r2.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        if (r2.size() != 1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        throw p565io.reactivex.internal.util.ExceptionHelper.m58212a((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
        throw new p565io.reactivex.exceptions.CompositeException((java.util.List) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r8 = this;
            boolean r0 = r8.f61529c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r8)
            boolean r0 = r8.f61529c     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            return
        L_0x000c:
            r0 = 1
            r8.f61529c = r0     // Catch:{ all -> 0x0056 }
            ue0.a<le0.b> r1 = r8.f61528b     // Catch:{ all -> 0x0056 }
            r2 = 0
            r8.f61528b = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            T[] r1 = r1.f63222d
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L_0x001d:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            boolean r7 = r6 instanceof le0.C24224b
            if (r7 == 0) goto L_0x0039
            le0.b r6 = (le0.C24224b) r6     // Catch:{ all -> 0x002b }
            r6.dispose()     // Catch:{ all -> 0x002b }
            goto L_0x0039
        L_0x002b:
            r6 = move-exception
            com.google.android.play.core.appupdate.C14226d.m35340G0(r6)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r6)
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x001d
        L_0x003c:
            if (r2 == 0) goto L_0x0055
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004f
            java.lang.Object r0 = r2.get(r4)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = p565io.reactivex.internal.util.ExceptionHelper.m58212a(r0)
            throw r0
        L_0x004f:
            io.reactivex.exceptions.CompositeException r0 = new io.reactivex.exceptions.CompositeException
            r0.<init>((java.util.List) r2)
            throw r0
        L_0x0055:
            return
        L_0x0056:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: le0.C24223a.dispose():void");
    }
}
