package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C2125f;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import com.bumptech.glide.load.data.C2144e;
import com.bumptech.glide.load.engine.C2169c;
import com.bumptech.glide.load.engine.C2172e;
import com.bumptech.glide.load.engine.C2179f;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p025b6.C1487b;
import p025b6.C1489d;
import p025b6.C1492e;
import p025b6.C1494g;
import p060d6.C4383d;
import p060d6.C4385f;
import p060d6.C4392h;
import p060d6.C4393i;
import p060d6.C4394j;
import p060d6.C4395k;
import p060d6.C4397l;
import p095g6.C4832a;
import p229r1.C6234d;
import p311x6.C7171h;
import p322y6.C7333a;
import p322y6.C7341d;
import p551hy.C17517b;
import p584jl.C17885a;

public final class DecodeJob<R> implements C2169c.C2170a, Runnable, Comparable<DecodeJob<?>>, C7333a.C7337d {

    /* renamed from: A */
    public DataSource f6980A;

    /* renamed from: B */
    public C2142d<?> f6981B;

    /* renamed from: C */
    public volatile C2169c f6982C;

    /* renamed from: D */
    public volatile boolean f6983D;

    /* renamed from: E */
    public volatile boolean f6984E;

    /* renamed from: F */
    public boolean f6985F;

    /* renamed from: b */
    public final C2171d<R> f6986b = new C2171d<>();

    /* renamed from: c */
    public final ArrayList f6987c = new ArrayList();

    /* renamed from: d */
    public final C7341d.C7342a f6988d = new C7341d.C7342a();

    /* renamed from: e */
    public final C2163e f6989e;

    /* renamed from: f */
    public final C6234d<DecodeJob<?>> f6990f;

    /* renamed from: g */
    public final C2162d<?> f6991g = new C2162d<>();

    /* renamed from: h */
    public final C2164f f6992h = new C2164f();

    /* renamed from: i */
    public C2125f f6993i;

    /* renamed from: j */
    public C1487b f6994j;

    /* renamed from: k */
    public Priority f6995k;

    /* renamed from: l */
    public C4392h f6996l;

    /* renamed from: m */
    public int f6997m;

    /* renamed from: n */
    public int f6998n;

    /* renamed from: o */
    public C4385f f6999o;

    /* renamed from: p */
    public C1492e f7000p;

    /* renamed from: q */
    public C2160b<R> f7001q;

    /* renamed from: r */
    public int f7002r;

    /* renamed from: s */
    public Stage f7003s;

    /* renamed from: t */
    public RunReason f7004t;

    /* renamed from: u */
    public boolean f7005u;

    /* renamed from: v */
    public Object f7006v;

    /* renamed from: w */
    public Thread f7007w;

    /* renamed from: x */
    public C1487b f7008x;

    /* renamed from: y */
    public C1487b f7009y;

    /* renamed from: z */
    public Object f7010z;

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    public static /* synthetic */ class C2159a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7011a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7012b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f7013c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.bumptech.glide.load.EncodeStrategy[] r0 = com.bumptech.glide.load.EncodeStrategy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7013c = r0
                r1 = 1
                com.bumptech.glide.load.EncodeStrategy r2 = com.bumptech.glide.load.EncodeStrategy.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7013c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.load.EncodeStrategy r3 = com.bumptech.glide.load.EncodeStrategy.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.bumptech.glide.load.engine.DecodeJob$Stage[] r2 = com.bumptech.glide.load.engine.DecodeJob.Stage.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7012b = r2
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f7012b     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f7012b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f7012b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f7012b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bumptech.glide.load.engine.DecodeJob$Stage r4 = com.bumptech.glide.load.engine.DecodeJob.Stage.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                com.bumptech.glide.load.engine.DecodeJob$RunReason[] r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f7011a = r3
                com.bumptech.glide.load.engine.DecodeJob$RunReason r4 = com.bumptech.glide.load.engine.DecodeJob.RunReason.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f7011a     // Catch:{ NoSuchFieldError -> 0x0074 }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r3 = com.bumptech.glide.load.engine.DecodeJob.RunReason.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f7011a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.bumptech.glide.load.engine.DecodeJob$RunReason r1 = com.bumptech.glide.load.engine.DecodeJob.RunReason.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.C2159a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    public interface C2160b<R> {
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    public final class C2161c<Z> {

        /* renamed from: a */
        public final DataSource f7014a;

        public C2161c(DataSource dataSource) {
            this.f7014a = dataSource;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    public static class C2162d<Z> {

        /* renamed from: a */
        public C1487b f7016a;

        /* renamed from: b */
        public C1494g<Z> f7017b;

        /* renamed from: c */
        public C4395k<Z> f7018c;
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    public interface C2163e {
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$f */
    public static class C2164f {

        /* renamed from: a */
        public boolean f7019a;

        /* renamed from: b */
        public boolean f7020b;

        /* renamed from: c */
        public boolean f7021c;

        /* renamed from: a */
        public final boolean mo10939a() {
            return (this.f7021c || this.f7020b) && this.f7019a;
        }
    }

    public DecodeJob(C2163e eVar, C7333a.C7336c cVar) {
        this.f6989e = eVar;
        this.f6990f = cVar;
    }

    /* renamed from: a */
    public final void mo10922a(C1487b bVar, Object obj, C2142d<?> dVar, DataSource dataSource, C1487b bVar2) {
        C4832a aVar;
        this.f7008x = bVar;
        this.f7010z = obj;
        this.f6981B = dVar;
        this.f6980A = dataSource;
        this.f7009y = bVar2;
        boolean z = false;
        if (bVar != this.f6986b.mo10955a().get(0)) {
            z = true;
        }
        this.f6985F = z;
        if (Thread.currentThread() != this.f7007w) {
            this.f7004t = RunReason.DECODE_DATA;
            C2179f fVar = (C2179f) this.f7001q;
            if (fVar.f7100o) {
                aVar = fVar.f7095j;
            } else if (fVar.f7101p) {
                aVar = fVar.f7096k;
            } else {
                aVar = fVar.f7094i;
            }
            aVar.execute(this);
            return;
        }
        mo10929h();
    }

    /* renamed from: b */
    public final void mo10923b(C1487b bVar, Exception exc, C2142d<?> dVar, DataSource dataSource) {
        C4832a aVar;
        dVar.mo6608b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.mo10941f(bVar, dataSource, dVar.mo6607a());
        this.f6987c.add(glideException);
        if (Thread.currentThread() != this.f7007w) {
            this.f7004t = RunReason.SWITCH_TO_SOURCE_SERVICE;
            C2179f fVar = (C2179f) this.f7001q;
            if (fVar.f7100o) {
                aVar = fVar.f7095j;
            } else if (fVar.f7101p) {
                aVar = fVar.f7096k;
            } else {
                aVar = fVar.f7094i;
            }
            aVar.execute(this);
            return;
        }
        mo10935n();
    }

    /* renamed from: c */
    public final <Data> C4397l<R> mo10924c(C2142d<?> dVar, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dVar.mo6608b();
            return null;
        }
        try {
            int i = C7171h.f22255a;
            SystemClock.elapsedRealtimeNanos();
            C4397l<R> d = mo10926d(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                d.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.f6996l);
                Thread.currentThread().getName();
            }
            return d;
        } finally {
            dVar.mo6608b();
        }
    }

    public final int compareTo(Object obj) {
        DecodeJob decodeJob = (DecodeJob) obj;
        int ordinal = this.f6995k.ordinal() - decodeJob.f6995k.ordinal();
        if (ordinal == 0) {
            return this.f7002r - decodeJob.f7002r;
        }
        return ordinal;
    }

    /* renamed from: d */
    public final <Data> C4397l<R> mo10926d(Data data, DataSource dataSource) throws GlideException {
        boolean z;
        C4394j<Data, ?, R> c = this.f6986b.mo10957c(data.getClass());
        C1492e eVar = this.f7000p;
        if (Build.VERSION.SDK_INT >= 26) {
            if (dataSource == DataSource.RESOURCE_DISK_CACHE || this.f6986b.f7059r) {
                z = true;
            } else {
                z = false;
            }
            C1489d dVar = C2205a.f7172i;
            Boolean bool = (Boolean) eVar.mo5848c(dVar);
            if (bool == null || (bool.booleanValue() && !z)) {
                eVar = new C1492e();
                eVar.f5396b.mo22418i(this.f7000p.f5396b);
                eVar.f5396b.put(dVar, Boolean.valueOf(z));
            }
        }
        C1492e eVar2 = eVar;
        C2144e f = this.f6993i.f6909b.mo10832f(data);
        try {
            return c.mo19908a(this.f6997m, this.f6998n, eVar2, f, new C2161c(dataSource));
        } finally {
            f.mo10899b();
        }
    }

    /* renamed from: f */
    public final C7341d.C7342a mo10927f() {
        return this.f6988d;
    }

    /* renamed from: g */
    public final void mo10928g() {
        C4832a aVar;
        this.f7004t = RunReason.SWITCH_TO_SOURCE_SERVICE;
        C2179f fVar = (C2179f) this.f7001q;
        if (fVar.f7100o) {
            aVar = fVar.f7095j;
        } else if (fVar.f7101p) {
            aVar = fVar.f7096k;
        } else {
            aVar = fVar.f7094i;
        }
        aVar.execute(this);
    }

    /* renamed from: h */
    public final void mo10929h() {
        C4397l<R> lVar;
        boolean z;
        C2162d<?> dVar;
        boolean a;
        if (Log.isLoggable("DecodeJob", 2)) {
            Objects.toString(this.f7010z);
            Objects.toString(this.f7008x);
            Objects.toString(this.f6981B);
            int i = C7171h.f22255a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.f6996l);
            Thread.currentThread().getName();
        }
        C4395k kVar = null;
        try {
            lVar = mo10924c(this.f6981B, this.f7010z, this.f6980A);
        } catch (GlideException e) {
            e.mo10941f(this.f7009y, this.f6980A, (Class<?>) null);
            this.f6987c.add(e);
            lVar = null;
        }
        if (lVar != null) {
            DataSource dataSource = this.f6980A;
            boolean z2 = this.f6985F;
            if (lVar instanceof C4393i) {
                ((C4393i) lVar).initialize();
            }
            boolean z3 = false;
            if (this.f6991g.f7018c != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                kVar = (C4395k) C4395k.f15437f.mo22237b();
                C17885a.m44458r(kVar);
                kVar.f15441e = false;
                kVar.f15440d = true;
                kVar.f15439c = lVar;
                lVar = kVar;
            }
            mo10932k(lVar, dataSource, z2);
            this.f7003s = Stage.ENCODE;
            try {
                dVar = this.f6991g;
                if (dVar.f7018c != null) {
                    z3 = true;
                }
                if (z3) {
                    C2163e eVar = this.f6989e;
                    C1492e eVar2 = this.f7000p;
                    dVar.getClass();
                    ((C2172e.C2177c) eVar).mo10966a().mo20209e(dVar.f7016a, new C4383d(dVar.f7017b, dVar.f7018c, eVar2));
                    dVar.f7018c.mo19910c();
                }
                if (kVar != null) {
                    kVar.mo19910c();
                }
                C2164f fVar = this.f6992h;
                synchronized (fVar) {
                    fVar.f7020b = true;
                    a = fVar.mo10939a();
                }
                if (a) {
                    mo10934m();
                }
            } catch (Throwable th) {
                if (kVar != null) {
                    kVar.mo19910c();
                }
                throw th;
            }
        } else {
            mo10935n();
        }
    }

    /* renamed from: i */
    public final C2169c mo10930i() {
        int i = C2159a.f7012b[this.f7003s.ordinal()];
        if (i == 1) {
            return new C2187h(this.f6986b, this);
        }
        if (i == 2) {
            C2171d<R> dVar = this.f6986b;
            return new C2168b(dVar.mo10955a(), dVar, this);
        } else if (i == 3) {
            return new C2188i(this.f6986b, this);
        } else {
            if (i == 4) {
                return null;
            }
            StringBuilder k = C13555b.m33972k("Unrecognized stage: ");
            k.append(this.f7003s);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: j */
    public final Stage mo10931j(Stage stage) {
        int i = C2159a.f7012b[stage.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return Stage.FINISHED;
                }
                if (i != 5) {
                    throw new IllegalArgumentException("Unrecognized stage: " + stage);
                } else if (this.f6999o.mo19903b()) {
                    return Stage.RESOURCE_CACHE;
                } else {
                    return mo10931j(Stage.RESOURCE_CACHE);
                }
            } else if (this.f7005u) {
                return Stage.FINISHED;
            } else {
                return Stage.SOURCE;
            }
        } else if (this.f6999o.mo19902a()) {
            return Stage.DATA_CACHE;
        } else {
            return mo10931j(Stage.DATA_CACHE);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        r1 = (com.bumptech.glide.load.engine.C2172e) r0.f7092g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r9 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r9.f7119b == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r1.f7068h.mo10951a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        r9 = r1.f7061a;
        r9.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r0.f7102q == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r9 = r9.f45096d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r9 = r9.f45095c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r9 = (java.util.Map) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r0.equals(r9.get(r8)) == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r9.remove(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        r8 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r8.hasNext() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        r9 = (com.bumptech.glide.load.engine.C2179f.C2183d) r8.next();
        r9.f7117b.execute(new com.bumptech.glide.load.engine.C2179f.C2181b(r0, r9.f7116a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r0.mo10969c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10932k(p060d6.C4397l<R> r8, com.bumptech.glide.load.DataSource r9, boolean r10) {
        /*
            r7 = this;
            r7.mo10937p()
            com.bumptech.glide.load.engine.DecodeJob$b<R> r0 = r7.f7001q
            com.bumptech.glide.load.engine.f r0 = (com.bumptech.glide.load.engine.C2179f) r0
            monitor-enter(r0)
            r0.f7103r = r8     // Catch:{ all -> 0x00c9 }
            r0.f7104s = r9     // Catch:{ all -> 0x00c9 }
            r0.f7111z = r10     // Catch:{ all -> 0x00c9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            monitor-enter(r0)
            y6.d$a r8 = r0.f7088c     // Catch:{ all -> 0x00c6 }
            r8.mo23560a()     // Catch:{ all -> 0x00c6 }
            boolean r8 = r0.f7110y     // Catch:{ all -> 0x00c6 }
            if (r8 == 0) goto L_0x0024
            d6.l<?> r8 = r0.f7103r     // Catch:{ all -> 0x00c6 }
            r8.mo10979a()     // Catch:{ all -> 0x00c6 }
            r0.mo10972g()     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00b2
        L_0x0024:
            com.bumptech.glide.load.engine.f$e r8 = r0.f7087b     // Catch:{ all -> 0x00c6 }
            java.util.List<com.bumptech.glide.load.engine.f$d> r8 = r8.f7118b     // Catch:{ all -> 0x00c6 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00be
            boolean r8 = r0.f7105t     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x00b6
            com.bumptech.glide.load.engine.f$c r8 = r0.f7091f     // Catch:{ all -> 0x00c6 }
            d6.l<?> r2 = r0.f7103r     // Catch:{ all -> 0x00c6 }
            boolean r3 = r0.f7099n     // Catch:{ all -> 0x00c6 }
            b6.b r5 = r0.f7098m     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.g$a r6 = r0.f7089d     // Catch:{ all -> 0x00c6 }
            r8.getClass()     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.g r8 = new com.bumptech.glide.load.engine.g     // Catch:{ all -> 0x00c6 }
            r4 = 1
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c6 }
            r0.f7108w = r8     // Catch:{ all -> 0x00c6 }
            r8 = 1
            r0.f7105t = r8     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.f$e r9 = r0.f7087b     // Catch:{ all -> 0x00c6 }
            r9.getClass()     // Catch:{ all -> 0x00c6 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            java.util.List<com.bumptech.glide.load.engine.f$d> r9 = r9.f7118b     // Catch:{ all -> 0x00c6 }
            r10.<init>(r9)     // Catch:{ all -> 0x00c6 }
            int r9 = r10.size()     // Catch:{ all -> 0x00c6 }
            int r9 = r9 + r8
            r0.mo10970d(r9)     // Catch:{ all -> 0x00c6 }
            b6.b r8 = r0.f7098m     // Catch:{ all -> 0x00c6 }
            com.bumptech.glide.load.engine.g<?> r9 = r0.f7108w     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            d6.g r1 = r0.f7092g
            com.bumptech.glide.load.engine.e r1 = (com.bumptech.glide.load.engine.C2172e) r1
            monitor-enter(r1)
            if (r9 == 0) goto L_0x0074
            boolean r2 = r9.f7119b     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0074
            com.bumptech.glide.load.engine.a r2 = r1.f7068h     // Catch:{ all -> 0x00b3 }
            r2.mo10951a(r8, r9)     // Catch:{ all -> 0x00b3 }
        L_0x0074:
            hy.b r9 = r1.f7061a     // Catch:{ all -> 0x00b3 }
            r9.getClass()     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.f7102q     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0080
            java.lang.Object r9 = r9.f45096d     // Catch:{ all -> 0x00b3 }
            goto L_0x0082
        L_0x0080:
            java.lang.Object r9 = r9.f45095c     // Catch:{ all -> 0x00b3 }
        L_0x0082:
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r9.get(r8)     // Catch:{ all -> 0x00b3 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0091
            r9.remove(r8)     // Catch:{ all -> 0x00b3 }
        L_0x0091:
            monitor-exit(r1)
            java.util.Iterator r8 = r10.iterator()
        L_0x0096:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r8.next()
            com.bumptech.glide.load.engine.f$d r9 = (com.bumptech.glide.load.engine.C2179f.C2183d) r9
            java.util.concurrent.Executor r10 = r9.f7117b
            com.bumptech.glide.load.engine.f$b r1 = new com.bumptech.glide.load.engine.f$b
            t6.h r9 = r9.f7116a
            r1.<init>(r9)
            r10.execute(r1)
            goto L_0x0096
        L_0x00af:
            r0.mo10969c()
        L_0x00b2:
            return
        L_0x00b3:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L_0x00b6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Already have resource"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00be:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.String r9 = "Received a resource without any callbacks to notify"
            r8.<init>(r9)     // Catch:{ all -> 0x00c6 }
            throw r8     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r8
        L_0x00c9:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c9 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.mo10932k(d6.l, com.bumptech.glide.load.DataSource, boolean):void");
    }

    /* renamed from: l */
    public final void mo10933l() {
        boolean a;
        Object obj;
        mo10937p();
        GlideException glideException = new GlideException("Failed to load resource", (List<Throwable>) new ArrayList(this.f6987c));
        C2179f fVar = (C2179f) this.f7001q;
        synchronized (fVar) {
            fVar.f7106u = glideException;
        }
        synchronized (fVar) {
            fVar.f7088c.mo23560a();
            if (fVar.f7110y) {
                fVar.mo10972g();
            } else if (fVar.f7087b.f7118b.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!fVar.f7107v) {
                fVar.f7107v = true;
                C1487b bVar = fVar.f7098m;
                C2179f.C2184e eVar = fVar.f7087b;
                eVar.getClass();
                ArrayList<C2179f.C2183d> arrayList = new ArrayList<>(eVar.f7118b);
                fVar.mo10970d(arrayList.size() + 1);
                C2172e eVar2 = (C2172e) fVar.f7092g;
                synchronized (eVar2) {
                    C17517b bVar2 = eVar2.f7061a;
                    bVar2.getClass();
                    if (fVar.f7102q) {
                        obj = bVar2.f45096d;
                    } else {
                        obj = bVar2.f45095c;
                    }
                    Map map = (Map) obj;
                    if (fVar.equals(map.get(bVar))) {
                        map.remove(bVar);
                    }
                }
                for (C2179f.C2183d dVar : arrayList) {
                    dVar.f7117b.execute(new C2179f.C2180a(dVar.f7116a));
                }
                fVar.mo10969c();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        C2164f fVar2 = this.f6992h;
        synchronized (fVar2) {
            fVar2.f7021c = true;
            a = fVar2.mo10939a();
        }
        if (a) {
            mo10934m();
        }
    }

    /* renamed from: m */
    public final void mo10934m() {
        C2164f fVar = this.f6992h;
        synchronized (fVar) {
            fVar.f7020b = false;
            fVar.f7019a = false;
            fVar.f7021c = false;
        }
        C2162d<?> dVar = this.f6991g;
        dVar.f7016a = null;
        dVar.f7017b = null;
        dVar.f7018c = null;
        C2171d<R> dVar2 = this.f6986b;
        dVar2.f7044c = null;
        dVar2.f7045d = null;
        dVar2.f7055n = null;
        dVar2.f7048g = null;
        dVar2.f7052k = null;
        dVar2.f7050i = null;
        dVar2.f7056o = null;
        dVar2.f7051j = null;
        dVar2.f7057p = null;
        dVar2.f7042a.clear();
        dVar2.f7053l = false;
        dVar2.f7043b.clear();
        dVar2.f7054m = false;
        this.f6983D = false;
        this.f6993i = null;
        this.f6994j = null;
        this.f7000p = null;
        this.f6995k = null;
        this.f6996l = null;
        this.f7001q = null;
        this.f7003s = null;
        this.f6982C = null;
        this.f7007w = null;
        this.f7008x = null;
        this.f7010z = null;
        this.f6980A = null;
        this.f6981B = null;
        this.f6984E = false;
        this.f7006v = null;
        this.f6987c.clear();
        this.f6990f.mo22236a(this);
    }

    /* renamed from: n */
    public final void mo10935n() {
        this.f7007w = Thread.currentThread();
        int i = C7171h.f22255a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.f6984E && this.f6982C != null && !(z = this.f6982C.mo10954d())) {
            this.f7003s = mo10931j(this.f7003s);
            this.f6982C = mo10930i();
            if (this.f7003s == Stage.SOURCE) {
                mo10928g();
                return;
            }
        }
        if ((this.f7003s == Stage.FINISHED || this.f6984E) && !z) {
            mo10933l();
        }
    }

    /* renamed from: o */
    public final void mo10936o() {
        int i = C2159a.f7011a[this.f7004t.ordinal()];
        if (i == 1) {
            this.f7003s = mo10931j(Stage.INITIALIZE);
            this.f6982C = mo10930i();
            mo10935n();
        } else if (i == 2) {
            mo10935n();
        } else if (i == 3) {
            mo10929h();
        } else {
            StringBuilder k = C13555b.m33972k("Unrecognized run reason: ");
            k.append(this.f7004t);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: p */
    public final void mo10937p() {
        Throwable th;
        this.f6988d.mo23560a();
        if (this.f6983D) {
            if (this.f6987c.isEmpty()) {
                th = null;
            } else {
                ArrayList arrayList = this.f6987c;
                th = (Throwable) arrayList.get(arrayList.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f6983D = true;
    }

    public final void run() {
        C2142d<?> dVar = this.f6981B;
        try {
            if (this.f6984E) {
                mo10933l();
                if (dVar != null) {
                    dVar.mo6608b();
                    return;
                }
                return;
            }
            mo10936o();
            if (dVar != null) {
                dVar.mo6608b();
            }
        } catch (CallbackException e) {
            throw e;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo6608b();
            }
            throw th;
        }
    }
}
