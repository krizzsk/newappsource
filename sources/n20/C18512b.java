package n20;

import com.moovit.commons.utils.DataUnit;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import p081f3.C4648b;
import p081f3.C4665k;

/* renamed from: n20.b */
public final class C18512b implements C18322a {

    /* renamed from: a */
    public static final long f47137a;

    /* renamed from: b */
    public static final long f47138b;

    static {
        DataUnit dataUnit = DataUnit.MiB;
        f47137a = (long) dataUnit.toBytes(128.0d);
        f47138b = (long) dataUnit.toBytes(512.0d);
    }

    /* renamed from: a */
    public final String mo50104a() {
        return "gtfs_graph_build";
    }

    /* renamed from: b */
    public final C4665k mo50105b() {
        TimeUnit timeUnit = TimeUnit.HOURS;
        C4665k.C4666a b = C16530d.m42009b(this, 12, timeUnit, 10, timeUnit);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15888d = true;
        aVar.f15886b = true;
        aVar.f15885a = true;
        return (C4665k) ((C4665k.C4666a) b.mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0141 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.ListenableWorker.C1379a mo50106c(android.content.Context r21) throws java.lang.Exception {
        /*
            r20 = this;
            r0 = r21
            com.moovit.MoovitApplication<?, ?, ?> r1 = com.moovit.MoovitApplication.f37317k
            lz.a r1 = r1.f37321e
            java.lang.String r2 = "GTFS_CONFIGURATION"
            r3 = 1
            java.lang.Object r1 = r1.mo50695h(r2, r3)
            com.moovit.offline.GtfsConfiguration r1 = (com.moovit.offline.GtfsConfiguration) r1
            if (r1 != 0) goto L_0x0017
            androidx.work.ListenableWorker$a$b r0 = new androidx.work.ListenableWorker$a$b
            r0.<init>()
            return r0
        L_0x0017:
            boolean r2 = r1.mo19763c()
            if (r2 != 0) goto L_0x0023
            androidx.work.ListenableWorker$a$c r0 = new androidx.work.ListenableWorker$a$c
            r0.<init>()
            return r0
        L_0x0023:
            com.moovit.MoovitApplication<?, ?, ?> r2 = com.moovit.MoovitApplication.f37317k
            lz.a r2 = r2.f37321e
            java.lang.String r4 = "METRO_CONTEXT"
            java.lang.Object r2 = r2.mo50695h(r4, r3)
            tp.f r2 = (p824tp.C19728f) r2
            if (r2 != 0) goto L_0x0037
            androidx.work.ListenableWorker$a$b r0 = new androidx.work.ListenableWorker$a$b
            r0.<init>()
            return r0
        L_0x0037:
            tp.i r4 = p824tp.C19731i.m47197a(r21)
            r4.getClass()
            g30.h r5 = r2.f50165a
            s00.d r4 = r4.mo52085c(r5)
            u00.e r5 = r4.mo51802d()
            r6 = 239(0xef, float:3.35E-43)
            boolean r6 = r5.mo52120l(r6, r0)
            r7 = 0
            if (r6 != 0) goto L_0x0053
            goto L_0x014d
        L_0x0053:
            g30.h r2 = r2.f50165a
            java.util.TimeZone r2 = r2.f16131f
            long r8 = java.lang.System.currentTimeMillis()
            java.text.SimpleDateFormat r6 = com.moovit.util.time.C7925b.f23934a
            int r2 = r2.getOffset(r8)
            long r10 = (long) r2
            long r8 = r8 + r10
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r8 / r10
            int r2 = (int) r8
            int r6 = r1.f15148c
            int r6 = r6 + r2
            int r8 = r1.f15149d
            int r8 = r8 / 2
            ce0.C21100e.m49355o()
            java.lang.Object r9 = r5.f50355b
            monitor-enter(r9)
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x015e }
            java.io.File r11 = r5.mo52117i(r0)     // Catch:{ all -> 0x015e }
            java.lang.String r12 = "graph"
            r10.<init>(r11, r12)     // Catch:{ all -> 0x015e }
            u00.e$c r11 = new u00.e$c     // Catch:{ all -> 0x015e }
            r11.<init>(r1)     // Catch:{ all -> 0x015e }
            java.io.File[] r10 = r10.listFiles(r11)     // Catch:{ all -> 0x015e }
            r5.mo52107d()     // Catch:{ all -> 0x015e }
            r5.mo52109f()     // Catch:{ all -> 0x015e }
            java.util.Arrays.toString(r10)     // Catch:{ all -> 0x015e }
            if (r10 == 0) goto L_0x00ac
            int r11 = r10.length     // Catch:{ all -> 0x015e }
            if (r11 != 0) goto L_0x0098
            goto L_0x00ac
        L_0x0098:
            int r11 = r10.length     // Catch:{ all -> 0x015e }
            r12 = 0
            r13 = 1
        L_0x009b:
            if (r12 >= r11) goto L_0x00aa
            r14 = r10[r12]     // Catch:{ all -> 0x015e }
            boolean r15 = p786rz.C19387a.m46676h(r14)     // Catch:{ all -> 0x015e }
            r14.getAbsolutePath()     // Catch:{ all -> 0x015e }
            r13 = r13 & r15
            int r12 = r12 + 1
            goto L_0x009b
        L_0x00aa:
            monitor-exit(r9)     // Catch:{ all -> 0x015e }
            goto L_0x00ae
        L_0x00ac:
            monitor-exit(r9)     // Catch:{ all -> 0x015e }
            r13 = 1
        L_0x00ae:
            ce0.C21100e.m49355o()
            java.lang.Object r10 = r5.f50355b
            monitor-enter(r10)
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x015b }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x015b }
            java.io.File r12 = r5.mo52117i(r0)     // Catch:{ all -> 0x015b }
            java.lang.String r14 = "graph"
            r11.<init>(r12, r14)     // Catch:{ all -> 0x015b }
            int r12 = r1.f15149d     // Catch:{ all -> 0x015b }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x015b }
            r9.<init>(r11, r12)     // Catch:{ all -> 0x015b }
            u00.e$b r11 = new u00.e$b     // Catch:{ all -> 0x015b }
            r11.<init>(r2)     // Catch:{ all -> 0x015b }
            java.io.File[] r9 = r9.listFiles(r11)     // Catch:{ all -> 0x015b }
            r5.mo52107d()     // Catch:{ all -> 0x015b }
            r5.mo52109f()     // Catch:{ all -> 0x015b }
            java.util.Arrays.toString(r9)     // Catch:{ all -> 0x015b }
            if (r9 == 0) goto L_0x00f7
            int r11 = r9.length     // Catch:{ all -> 0x015b }
            if (r11 != 0) goto L_0x00e2
            goto L_0x00f7
        L_0x00e2:
            int r11 = r9.length     // Catch:{ all -> 0x015b }
            r12 = 0
            r14 = 1
        L_0x00e5:
            if (r12 >= r11) goto L_0x00f5
            r15 = r9[r12]     // Catch:{ all -> 0x015b }
            boolean r16 = p786rz.C19387a.m46676h(r15)     // Catch:{ all -> 0x015b }
            r15.getAbsolutePath()     // Catch:{ all -> 0x015b }
            r14 = r14 & r16
            int r12 = r12 + 1
            goto L_0x00e5
        L_0x00f5:
            monitor-exit(r10)     // Catch:{ all -> 0x015b }
            goto L_0x00f9
        L_0x00f7:
            monitor-exit(r10)     // Catch:{ all -> 0x015b }
            r14 = 1
        L_0x00f9:
            r9 = r2
        L_0x00fa:
            if (r9 >= r6) goto L_0x0146
            r10 = 0
        L_0x00fd:
            r11 = 24
            if (r10 >= r11) goto L_0x0143
            java.io.File r11 = r5.mo52119k(r0, r1, r9, r10)
            boolean r11 = r11.isDirectory()
            if (r11 == 0) goto L_0x010c
            goto L_0x0137
        L_0x010c:
            if (r9 >= r2) goto L_0x010f
            goto L_0x0137
        L_0x010f:
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.io.File r15 = r5.mo52117i(r0)     // Catch:{ all -> 0x0125 }
            long r15 = r15.getUsableSpace()     // Catch:{ all -> 0x0125 }
            r17 = 0
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 > 0) goto L_0x0123
            goto L_0x0126
        L_0x0123:
            r11 = r15
            goto L_0x0126
        L_0x0125:
        L_0x0126:
            if (r2 != r9) goto L_0x012f
            long r15 = f47137a
            int r17 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r17 >= 0) goto L_0x0137
            goto L_0x0135
        L_0x012f:
            long r15 = f47138b
            int r17 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r17 >= 0) goto L_0x0137
        L_0x0135:
            r11 = 1
            goto L_0x0138
        L_0x0137:
            r11 = 0
        L_0x0138:
            if (r11 == 0) goto L_0x0141
            u00.e r11 = r4.mo51802d()
            r11.mo52116h(r0, r1, r9, r10)
        L_0x0141:
            int r10 = r10 + r8
            goto L_0x00fd
        L_0x0143:
            int r9 = r9 + 1
            goto L_0x00fa
        L_0x0146:
            if (r13 == 0) goto L_0x014b
            if (r14 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r3 = 0
        L_0x014c:
            r7 = r3
        L_0x014d:
            if (r7 == 0) goto L_0x0155
            androidx.work.ListenableWorker$a$c r0 = new androidx.work.ListenableWorker$a$c
            r0.<init>()
            goto L_0x015a
        L_0x0155:
            androidx.work.ListenableWorker$a$a r0 = new androidx.work.ListenableWorker$a$a
            r0.<init>()
        L_0x015a:
            return r0
        L_0x015b:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x015b }
            throw r0
        L_0x015e:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x015e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n20.C18512b.mo50106c(android.content.Context):androidx.work.ListenableWorker$a");
    }
}
