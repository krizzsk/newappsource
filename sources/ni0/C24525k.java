package ni0;

import com.facebook.appevents.C2349o;
import ii0.C23608b;
import ni0.C24510d;

/* renamed from: ni0.k */
public final class C24525k extends C23608b {

    /* renamed from: c */
    public final /* synthetic */ boolean f62101c = false;

    /* renamed from: d */
    public final /* synthetic */ C2349o f62102d;

    /* renamed from: e */
    public final /* synthetic */ C24510d.C24518g f62103e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24525k(C24510d.C24518g gVar, Object[] objArr, C2349o oVar) {
        super("OkHttp %s ACK Settings", objArr);
        this.f62103e = gVar;
        this.f62102d = oVar;
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58724a() {
        /*
            r14 = this;
            ni0.d$g r0 = r14.f62103e
            boolean r1 = r14.f62101c
            com.facebook.appevents.o r2 = r14.f62102d
            ni0.d r3 = ni0.C24510d.this
            ni0.p r3 = r3.f62063v
            monitor-enter(r3)
            ni0.d r4 = ni0.C24510d.this     // Catch:{ all -> 0x00c8 }
            monitor-enter(r4)     // Catch:{ all -> 0x00c8 }
            ni0.d r5 = ni0.C24510d.this     // Catch:{ all -> 0x004b }
            com.facebook.appevents.o r5 = r5.f62061t     // Catch:{ all -> 0x004b }
            int r5 = r5.mo12501a()     // Catch:{ all -> 0x004b }
            r6 = 0
            if (r1 == 0) goto L_0x0026
            ni0.d r1 = ni0.C24510d.this     // Catch:{ all -> 0x004b }
            com.facebook.appevents.o r1 = r1.f62061t     // Catch:{ all -> 0x004b }
            r1.f8561a = r6     // Catch:{ all -> 0x004b }
            java.io.Serializable r1 = r1.f8562b     // Catch:{ all -> 0x004b }
            int[] r1 = (int[]) r1     // Catch:{ all -> 0x004b }
            java.util.Arrays.fill(r1, r6)     // Catch:{ all -> 0x004b }
        L_0x0026:
            ni0.d r1 = ni0.C24510d.this     // Catch:{ all -> 0x004b }
            com.facebook.appevents.o r1 = r1.f62061t     // Catch:{ all -> 0x004b }
            r1.getClass()     // Catch:{ all -> 0x004b }
            r7 = 0
        L_0x002e:
            r8 = 10
            r9 = 1
            if (r7 >= r8) goto L_0x004e
            int r8 = r9 << r7
            int r10 = r2.f8561a     // Catch:{ all -> 0x004b }
            r8 = r8 & r10
            if (r8 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r9 = 0
        L_0x003c:
            if (r9 != 0) goto L_0x003f
            goto L_0x0048
        L_0x003f:
            java.io.Serializable r8 = r2.f8562b     // Catch:{ all -> 0x004b }
            int[] r8 = (int[]) r8     // Catch:{ all -> 0x004b }
            r8 = r8[r7]     // Catch:{ all -> 0x004b }
            r1.mo12502b(r7, r8)     // Catch:{ all -> 0x004b }
        L_0x0048:
            int r7 = r7 + 1
            goto L_0x002e
        L_0x004b:
            r0 = move-exception
            goto L_0x00c6
        L_0x004e:
            ni0.d r1 = ni0.C24510d.this     // Catch:{ all -> 0x004b }
            com.facebook.appevents.o r1 = r1.f62061t     // Catch:{ all -> 0x004b }
            int r1 = r1.mo12501a()     // Catch:{ all -> 0x004b }
            r2 = -1
            r7 = 0
            r10 = 0
            if (r1 == r2) goto L_0x0084
            if (r1 == r5) goto L_0x0084
            int r1 = r1 - r5
            long r1 = (long) r1     // Catch:{ all -> 0x004b }
            ni0.d r5 = ni0.C24510d.this     // Catch:{ all -> 0x004b }
            java.util.LinkedHashMap r5 = r5.f62045d     // Catch:{ all -> 0x004b }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x004b }
            if (r5 != 0) goto L_0x0085
            ni0.d r5 = ni0.C24510d.this     // Catch:{ all -> 0x004b }
            java.util.LinkedHashMap r5 = r5.f62045d     // Catch:{ all -> 0x004b }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x004b }
            ni0.d r7 = ni0.C24510d.this     // Catch:{ all -> 0x004b }
            java.util.LinkedHashMap r7 = r7.f62045d     // Catch:{ all -> 0x004b }
            int r7 = r7.size()     // Catch:{ all -> 0x004b }
            ni0.o[] r7 = new ni0.C24531o[r7]     // Catch:{ all -> 0x004b }
            java.lang.Object[] r5 = r5.toArray(r7)     // Catch:{ all -> 0x004b }
            r7 = r5
            ni0.o[] r7 = (ni0.C24531o[]) r7     // Catch:{ all -> 0x004b }
            goto L_0x0085
        L_0x0084:
            r1 = r10
        L_0x0085:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            ni0.d r4 = ni0.C24510d.this     // Catch:{ IOException -> 0x0090 }
            ni0.p r5 = r4.f62063v     // Catch:{ IOException -> 0x0090 }
            com.facebook.appevents.o r4 = r4.f62061t     // Catch:{ IOException -> 0x0090 }
            r5.mo60789a(r4)     // Catch:{ IOException -> 0x0090 }
            goto L_0x0096
        L_0x0090:
            r4 = move-exception
            ni0.d r5 = ni0.C24510d.this     // Catch:{ all -> 0x00c8 }
            r5.mo60759c(r4)     // Catch:{ all -> 0x00c8 }
        L_0x0096:
            monitor-exit(r3)     // Catch:{ all -> 0x00c8 }
            if (r7 == 0) goto L_0x00b3
            int r3 = r7.length
            r4 = 0
        L_0x009b:
            if (r4 >= r3) goto L_0x00b3
            r5 = r7[r4]
            monitor-enter(r5)
            long r12 = r5.f62125b     // Catch:{ all -> 0x00b0 }
            long r12 = r12 + r1
            r5.f62125b = r12     // Catch:{ all -> 0x00b0 }
            int r8 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ac
            r5.notifyAll()     // Catch:{ all -> 0x00b0 }
        L_0x00ac:
            monitor-exit(r5)     // Catch:{ all -> 0x00b0 }
            int r4 = r4 + 1
            goto L_0x009b
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b0 }
            throw r0
        L_0x00b3:
            java.util.concurrent.ThreadPoolExecutor r1 = ni0.C24510d.f62042y
            ni0.l r2 = new ni0.l
            java.lang.Object[] r3 = new java.lang.Object[r9]
            ni0.d r4 = ni0.C24510d.this
            java.lang.String r4 = r4.f62046e
            r3[r6] = r4
            r2.<init>(r0, r3)
            r1.execute(r2)
            return
        L_0x00c6:
            monitor-exit(r4)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ni0.C24525k.mo58724a():void");
    }
}
