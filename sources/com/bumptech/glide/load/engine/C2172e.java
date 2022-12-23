package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C2125f;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2166a;
import com.bumptech.glide.load.engine.C2185g;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.request.SingleRequest;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;
import mf0.C24361g;
import mf0.C24368m;
import p025b6.C1487b;
import p025b6.C1492e;
import p060d6.C4385f;
import p060d6.C4391g;
import p060d6.C4392h;
import p060d6.C4397l;
import p060d6.C4399n;
import p084f6.C4687a;
import p084f6.C4692c;
import p084f6.C4694d;
import p084f6.C4695e;
import p084f6.C4697g;
import p084f6.C4698h;
import p095g6.C4832a;
import p260t6.C6603h;
import p311x6.C7163b;
import p311x6.C7171h;
import p311x6.C7172i;
import p322y6.C7333a;
import p551hy.C17517b;

/* renamed from: com.bumptech.glide.load.engine.e */
public final class C2172e implements C4391g, C4698h.C4699a, C2185g.C2186a {

    /* renamed from: i */
    public static final boolean f7060i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C17517b f7061a;

    /* renamed from: b */
    public final C24368m f7062b;

    /* renamed from: c */
    public final C4698h f7063c;

    /* renamed from: d */
    public final C2175b f7064d;

    /* renamed from: e */
    public final C4399n f7065e;

    /* renamed from: f */
    public final C2177c f7066f;

    /* renamed from: g */
    public final C2173a f7067g;

    /* renamed from: h */
    public final C2166a f7068h;

    /* renamed from: com.bumptech.glide.load.engine.e$a */
    public static class C2173a {

        /* renamed from: a */
        public final DecodeJob.C2163e f7069a;

        /* renamed from: b */
        public final C7333a.C7336c f7070b = C7333a.m16961a(150, new C2174a());

        /* renamed from: c */
        public int f7071c;

        /* renamed from: com.bumptech.glide.load.engine.e$a$a */
        public class C2174a implements C7333a.C7335b<DecodeJob<?>> {
            public C2174a() {
            }

            public final Object create() {
                C2173a aVar = C2173a.this;
                return new DecodeJob(aVar.f7069a, aVar.f7070b);
            }
        }

        public C2173a(C2177c cVar) {
            this.f7069a = cVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.e$b */
    public static class C2175b {

        /* renamed from: a */
        public final C4832a f7073a;

        /* renamed from: b */
        public final C4832a f7074b;

        /* renamed from: c */
        public final C4832a f7075c;

        /* renamed from: d */
        public final C4832a f7076d;

        /* renamed from: e */
        public final C4391g f7077e;

        /* renamed from: f */
        public final C2185g.C2186a f7078f;

        /* renamed from: g */
        public final C7333a.C7336c f7079g = C7333a.m16961a(150, new C2176a());

        /* renamed from: com.bumptech.glide.load.engine.e$b$a */
        public class C2176a implements C7333a.C7335b<C2179f<?>> {
            public C2176a() {
            }

            public final Object create() {
                C2175b bVar = C2175b.this;
                return new C2179f(bVar.f7073a, bVar.f7074b, bVar.f7075c, bVar.f7076d, bVar.f7077e, bVar.f7078f, bVar.f7079g);
            }
        }

        public C2175b(C4832a aVar, C4832a aVar2, C4832a aVar3, C4832a aVar4, C4391g gVar, C2185g.C2186a aVar5) {
            this.f7073a = aVar;
            this.f7074b = aVar2;
            this.f7075c = aVar3;
            this.f7076d = aVar4;
            this.f7077e = gVar;
            this.f7078f = aVar5;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.e$c */
    public static class C2177c implements DecodeJob.C2163e {

        /* renamed from: a */
        public final C4687a.C4688a f7081a;

        /* renamed from: b */
        public volatile C4687a f7082b;

        public C2177c(C4687a.C4688a aVar) {
            this.f7081a = aVar;
        }

        /* renamed from: a */
        public final C4687a mo10966a() {
            if (this.f7082b == null) {
                synchronized (this) {
                    if (this.f7082b == null) {
                        C4692c cVar = (C4692c) this.f7081a;
                        C4695e eVar = (C4695e) cVar.f15960b;
                        File cacheDir = eVar.f15966a.getCacheDir();
                        C4694d dVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (eVar.f15967b != null) {
                            cacheDir = new File(cacheDir, eVar.f15967b);
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                dVar = new C4694d(cacheDir, cVar.f15959a);
                            }
                        }
                        this.f7082b = dVar;
                    }
                    if (this.f7082b == null) {
                        this.f7082b = new C24361g();
                    }
                }
            }
            return this.f7082b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.e$d */
    public class C2178d {

        /* renamed from: a */
        public final C2179f<?> f7083a;

        /* renamed from: b */
        public final C6603h f7084b;

        public C2178d(C6603h hVar, C2179f<?> fVar) {
            this.f7084b = hVar;
            this.f7083a = fVar;
        }
    }

    public C2172e(C4698h hVar, C4687a.C4688a aVar, C4832a aVar2, C4832a aVar3, C4832a aVar4, C4832a aVar5) {
        this.f7063c = hVar;
        C2177c cVar = new C2177c(aVar);
        this.f7066f = cVar;
        C2166a aVar6 = new C2166a();
        this.f7068h = aVar6;
        synchronized (this) {
            synchronized (aVar6) {
                aVar6.f7029e = this;
            }
        }
        this.f7062b = new C24368m();
        this.f7061a = new C17517b();
        this.f7064d = new C2175b(aVar2, aVar3, aVar4, aVar5, this, this);
        this.f7067g = new C2173a(cVar);
        this.f7065e = new C4399n();
        ((C4697g) hVar).f15968d = this;
    }

    /* renamed from: d */
    public static void m5660d(C4397l lVar) {
        if (lVar instanceof C2185g) {
            ((C2185g) lVar).mo10982d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    public final void mo10961a(C1487b bVar, C2185g<?> gVar) {
        C2166a aVar = this.f7068h;
        synchronized (aVar) {
            C2166a.C2167a aVar2 = (C2166a.C2167a) aVar.f7027c.remove(bVar);
            if (aVar2 != null) {
                aVar2.f7032c = null;
                aVar2.clear();
            }
        }
        if (gVar.f7119b) {
            C4397l lVar = (C4397l) ((C4697g) this.f7063c).mo23472d(bVar, gVar);
        } else {
            this.f7065e.mo19912a(gVar, false);
        }
    }

    /* renamed from: b */
    public final C2178d mo10962b(C2125f fVar, Object obj, C1487b bVar, int i, int i2, Class cls, Class cls2, Priority priority, C4385f fVar2, C7163b bVar2, boolean z, boolean z2, C1492e eVar, boolean z3, boolean z4, boolean z5, boolean z6, C6603h hVar, Executor executor) {
        long j;
        if (f7060i) {
            int i3 = C7171h.f22255a;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        long j2 = j;
        this.f7062b.getClass();
        C4392h hVar2 = new C4392h(obj, bVar, i, i2, bVar2, cls, cls2, eVar);
        synchronized (this) {
            try {
                C2185g<?> c = mo10963c(hVar2, z3, j2);
                if (c == null) {
                    C2178d e = mo10964e(fVar, obj, bVar, i, i2, cls, cls2, priority, fVar2, bVar2, z, z2, eVar, z3, z4, z5, z6, hVar, executor, hVar2, j2);
                    return e;
                }
                ((SingleRequest) hVar).mo11037l(c, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public final C2185g<?> mo10963c(C4392h hVar, boolean z, long j) {
        C2185g<?> gVar;
        Y y;
        C2185g<?> gVar2;
        if (!z) {
            return null;
        }
        C2166a aVar = this.f7068h;
        synchronized (aVar) {
            C2166a.C2167a aVar2 = (C2166a.C2167a) aVar.f7027c.get(hVar);
            if (aVar2 == null) {
                gVar = null;
            } else {
                gVar = (C2185g) aVar2.get();
                if (gVar == null) {
                    aVar.mo10952b(aVar2);
                }
            }
        }
        if (gVar != null) {
            gVar.mo10981c();
        }
        if (gVar != null) {
            if (f7060i) {
                int i = C7171h.f22255a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(hVar);
            }
            return gVar;
        }
        C4697g gVar3 = (C4697g) this.f7063c;
        synchronized (gVar3) {
            C7172i.C7173a aVar3 = (C7172i.C7173a) gVar3.f22256a.remove(hVar);
            if (aVar3 == null) {
                y = null;
            } else {
                gVar3.f22258c -= (long) aVar3.f22260b;
                y = aVar3.f22259a;
            }
        }
        C4397l lVar = (C4397l) y;
        if (lVar == null) {
            gVar2 = null;
        } else if (lVar instanceof C2185g) {
            gVar2 = (C2185g) lVar;
        } else {
            gVar2 = new C2185g<>(lVar, true, true, hVar, this);
        }
        if (gVar2 != null) {
            gVar2.mo10981c();
            this.f7068h.mo10951a(hVar, gVar2);
        }
        if (gVar2 == null) {
            return null;
        }
        if (f7060i) {
            int i2 = C7171h.f22255a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(hVar);
        }
        return gVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.engine.C2172e.C2178d mo10964e(com.bumptech.glide.C2125f r17, java.lang.Object r18, p025b6.C1487b r19, int r20, int r21, java.lang.Class r22, java.lang.Class r23, com.bumptech.glide.Priority r24, p060d6.C4385f r25, p311x6.C7163b r26, boolean r27, boolean r28, p025b6.C1492e r29, boolean r30, boolean r31, boolean r32, boolean r33, p260t6.C6603h r34, java.util.concurrent.Executor r35, p060d6.C4392h r36, long r37) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r29
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            hy.b r13 = r1.f7061a
            if (r9 == 0) goto L_0x0021
            java.lang.Object r13 = r13.f45096d
            goto L_0x0023
        L_0x0021:
            java.lang.Object r13 = r13.f45095c
        L_0x0023:
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r13 = r13.get(r12)
            com.bumptech.glide.load.engine.f r13 = (com.bumptech.glide.load.engine.C2179f) r13
            if (r13 == 0) goto L_0x0042
            r13.mo10967a(r10, r11)
            boolean r0 = f7060i
            if (r0 == 0) goto L_0x003c
            int r0 = p311x6.C7171h.f22255a
            android.os.SystemClock.elapsedRealtimeNanos()
            java.util.Objects.toString(r36)
        L_0x003c:
            com.bumptech.glide.load.engine.e$d r0 = new com.bumptech.glide.load.engine.e$d
            r0.<init>(r10, r13)
            return r0
        L_0x0042:
            com.bumptech.glide.load.engine.e$b r13 = r1.f7064d
            y6.a$c r13 = r13.f7079g
            java.lang.Object r13 = r13.mo22237b()
            com.bumptech.glide.load.engine.f r13 = (com.bumptech.glide.load.engine.C2179f) r13
            p584jl.C17885a.m44458r(r13)
            monitor-enter(r13)
            r13.f7098m = r12     // Catch:{ all -> 0x0119 }
            r14 = r30
            r13.f7099n = r14     // Catch:{ all -> 0x0119 }
            r14 = r31
            r13.f7100o = r14     // Catch:{ all -> 0x0119 }
            r14 = r32
            r13.f7101p = r14     // Catch:{ all -> 0x0119 }
            r13.f7102q = r9     // Catch:{ all -> 0x0119 }
            monitor-exit(r13)
            com.bumptech.glide.load.engine.e$a r14 = r1.f7067g
            y6.a$c r15 = r14.f7070b
            java.lang.Object r15 = r15.mo22237b()
            com.bumptech.glide.load.engine.DecodeJob r15 = (com.bumptech.glide.load.engine.DecodeJob) r15
            p584jl.C17885a.m44458r(r15)
            int r10 = r14.f7071c
            int r11 = r10 + 1
            r14.f7071c = r11
            com.bumptech.glide.load.engine.d<R> r11 = r15.f6986b
            com.bumptech.glide.load.engine.DecodeJob$e r14 = r15.f6989e
            r11.f7044c = r0
            r11.f7045d = r2
            r11.f7055n = r3
            r11.f7046e = r4
            r11.f7047f = r5
            r11.f7057p = r7
            r1 = r22
            r11.f7048g = r1
            r11.f7049h = r14
            r1 = r23
            r11.f7052k = r1
            r11.f7056o = r6
            r11.f7050i = r8
            r1 = r26
            r11.f7051j = r1
            r1 = r27
            r11.f7058q = r1
            r1 = r28
            r11.f7059r = r1
            r15.f6993i = r0
            r15.f6994j = r3
            r15.f6995k = r6
            r15.f6996l = r12
            r15.f6997m = r4
            r15.f6998n = r5
            r15.f6999o = r7
            r15.f7005u = r9
            r15.f7000p = r8
            r15.f7001q = r13
            r15.f7002r = r10
            com.bumptech.glide.load.engine.DecodeJob$RunReason r0 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE
            r15.f7004t = r0
            r15.f7006v = r2
            r1 = r16
            hy.b r0 = r1.f7061a
            r0.getClass()
            boolean r2 = r13.f7102q
            if (r2 == 0) goto L_0x00c8
            java.lang.Object r0 = r0.f45096d
            goto L_0x00ca
        L_0x00c8:
            java.lang.Object r0 = r0.f45095c
        L_0x00ca:
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r12, r13)
            r0 = r34
            r2 = r35
            r13.mo10967a(r0, r2)
            monitor-enter(r13)
            r13.f7109x = r15     // Catch:{ all -> 0x0116 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch:{ all -> 0x0116 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r2 = r15.mo10931j(r2)     // Catch:{ all -> 0x0116 }
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch:{ all -> 0x0116 }
            if (r2 == r3) goto L_0x00ea
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch:{ all -> 0x0116 }
            if (r2 != r3) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r2 = 0
            goto L_0x00eb
        L_0x00ea:
            r2 = 1
        L_0x00eb:
            if (r2 == 0) goto L_0x00f0
            g6.a r2 = r13.f7093h     // Catch:{ all -> 0x0116 }
            goto L_0x0100
        L_0x00f0:
            boolean r2 = r13.f7100o     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x00f7
            g6.a r2 = r13.f7095j     // Catch:{ all -> 0x0116 }
            goto L_0x0100
        L_0x00f7:
            boolean r2 = r13.f7101p     // Catch:{ all -> 0x0116 }
            if (r2 == 0) goto L_0x00fe
            g6.a r2 = r13.f7096k     // Catch:{ all -> 0x0116 }
            goto L_0x0100
        L_0x00fe:
            g6.a r2 = r13.f7094i     // Catch:{ all -> 0x0116 }
        L_0x0100:
            r2.execute(r15)     // Catch:{ all -> 0x0116 }
            monitor-exit(r13)
            boolean r2 = f7060i
            if (r2 == 0) goto L_0x0110
            int r2 = p311x6.C7171h.f22255a
            android.os.SystemClock.elapsedRealtimeNanos()
            java.util.Objects.toString(r36)
        L_0x0110:
            com.bumptech.glide.load.engine.e$d r2 = new com.bumptech.glide.load.engine.e$d
            r2.<init>(r0, r13)
            return r2
        L_0x0116:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0119:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2172e.mo10964e(com.bumptech.glide.f, java.lang.Object, b6.b, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.Priority, d6.f, x6.b, boolean, boolean, b6.e, boolean, boolean, boolean, boolean, t6.h, java.util.concurrent.Executor, d6.h, long):com.bumptech.glide.load.engine.e$d");
    }
}
