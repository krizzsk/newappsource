package ji0;

import com.usebutton.sdk.internal.util.DiskLruCache;
import ii0.C23610d;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.nio.channels.Channel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.regex.Pattern;
import oi0.C24628a;
import p358af.C13437d;
import pi0.C24721f;
import si0.C24893c0;
import si0.C24911r;
import si0.C24915u;
import si0.C24917w;

/* renamed from: ji0.e */
public final class C23741e implements Closeable, Flushable {

    /* renamed from: v */
    public static final Pattern f59969v = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: b */
    public final C24628a f59970b;

    /* renamed from: c */
    public final File f59971c;

    /* renamed from: d */
    public final File f59972d;

    /* renamed from: e */
    public final File f59973e;

    /* renamed from: f */
    public final File f59974f;

    /* renamed from: g */
    public final int f59975g;

    /* renamed from: h */
    public long f59976h;

    /* renamed from: i */
    public final int f59977i;

    /* renamed from: j */
    public long f59978j = 0;

    /* renamed from: k */
    public C24917w f59979k;

    /* renamed from: l */
    public final LinkedHashMap<String, C23745c> f59980l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    public int f59981m;

    /* renamed from: n */
    public boolean f59982n;

    /* renamed from: o */
    public boolean f59983o;

    /* renamed from: p */
    public boolean f59984p;

    /* renamed from: q */
    public boolean f59985q;

    /* renamed from: r */
    public boolean f59986r;

    /* renamed from: s */
    public long f59987s = 0;

    /* renamed from: t */
    public final Executor f59988t;

    /* renamed from: u */
    public final C23742a f59989u = new C23742a();

    /* renamed from: ji0.e$a */
    public class C23742a implements Runnable {
        public C23742a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r1 = r6.f59990b;
            r1.f59986r = true;
            r1.f59979k = new si0.C24917w(new si0.C24897e());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                ji0.e r0 = ji0.C23741e.this
                monitor-enter(r0)
                ji0.e r1 = ji0.C23741e.this     // Catch:{ all -> 0x0041 }
                boolean r2 = r1.f59983o     // Catch:{ all -> 0x0041 }
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L_0x000d
                r2 = 1
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                boolean r5 = r1.f59984p     // Catch:{ all -> 0x0041 }
                r2 = r2 | r5
                if (r2 == 0) goto L_0x0015
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                return
            L_0x0015:
                r1.mo58989z()     // Catch:{ IOException -> 0x0019 }
                goto L_0x001d
            L_0x0019:
                ji0.e r1 = ji0.C23741e.this     // Catch:{ all -> 0x0041 }
                r1.f59985q = r3     // Catch:{ all -> 0x0041 }
            L_0x001d:
                ji0.e r1 = ji0.C23741e.this     // Catch:{ IOException -> 0x002f }
                boolean r1 = r1.mo58982q()     // Catch:{ IOException -> 0x002f }
                if (r1 == 0) goto L_0x003f
                ji0.e r1 = ji0.C23741e.this     // Catch:{ IOException -> 0x002f }
                r1.mo58987x()     // Catch:{ IOException -> 0x002f }
                ji0.e r1 = ji0.C23741e.this     // Catch:{ IOException -> 0x002f }
                r1.f59981m = r4     // Catch:{ IOException -> 0x002f }
                goto L_0x003f
            L_0x002f:
                ji0.e r1 = ji0.C23741e.this     // Catch:{ all -> 0x0041 }
                r1.f59986r = r3     // Catch:{ all -> 0x0041 }
                si0.e r2 = new si0.e     // Catch:{ all -> 0x0041 }
                r2.<init>()     // Catch:{ all -> 0x0041 }
                si0.w r3 = new si0.w     // Catch:{ all -> 0x0041 }
                r3.<init>(r2)     // Catch:{ all -> 0x0041 }
                r1.f59979k = r3     // Catch:{ all -> 0x0041 }
            L_0x003f:
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                return
            L_0x0041:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ji0.C23741e.C23742a.run():void");
        }
    }

    /* renamed from: ji0.e$b */
    public final class C23743b {

        /* renamed from: a */
        public final C23745c f59991a;

        /* renamed from: b */
        public final boolean[] f59992b;

        /* renamed from: c */
        public boolean f59993c;

        /* renamed from: ji0.e$b$a */
        public class C23744a extends C23748g {
            public C23744a(C24915u uVar) {
                super(uVar);
            }

            /* renamed from: e */
            public final void mo58995e() {
                synchronized (C23741e.this) {
                    C23743b.this.mo58993c();
                }
            }
        }

        public C23743b(C23745c cVar) {
            boolean[] zArr;
            this.f59991a = cVar;
            if (cVar.f60000e) {
                zArr = null;
            } else {
                zArr = new boolean[C23741e.this.f59977i];
            }
            this.f59992b = zArr;
        }

        /* renamed from: a */
        public final void mo58991a() throws IOException {
            synchronized (C23741e.this) {
                if (!this.f59993c) {
                    if (this.f59991a.f60001f == this) {
                        C23741e.this.mo58977f(this, false);
                    }
                    this.f59993c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: b */
        public final void mo58992b() throws IOException {
            synchronized (C23741e.this) {
                if (!this.f59993c) {
                    if (this.f59991a.f60001f == this) {
                        C23741e.this.mo58977f(this, true);
                    }
                    this.f59993c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: c */
        public final void mo58993c() {
            if (this.f59991a.f60001f == this) {
                int i = 0;
                while (true) {
                    C23741e eVar = C23741e.this;
                    if (i < eVar.f59977i) {
                        try {
                            ((C24628a.C24629a) eVar.f59970b).mo60856a(this.f59991a.f59999d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f59991a.f60001f = null;
                        return;
                    }
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.getParentFile().mkdirs();
            r2 = si0.C24912s.f62972a;
            r5 = si0.C24911r.m62550f(new java.io.FileOutputStream(r5, false));
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final si0.C24887a0 mo58994d(int r5) {
            /*
                r4 = this;
                ji0.e r0 = ji0.C23741e.this
                monitor-enter(r0)
                boolean r1 = r4.f59993c     // Catch:{ all -> 0x0062 }
                if (r1 != 0) goto L_0x005c
                ji0.e$c r1 = r4.f59991a     // Catch:{ all -> 0x0062 }
                ji0.e$b r2 = r1.f60001f     // Catch:{ all -> 0x0062 }
                if (r2 == r4) goto L_0x0014
                si0.e r5 = new si0.e     // Catch:{ all -> 0x0062 }
                r5.<init>()     // Catch:{ all -> 0x0062 }
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                return r5
            L_0x0014:
                boolean r2 = r1.f60000e     // Catch:{ all -> 0x0062 }
                if (r2 != 0) goto L_0x001d
                boolean[] r2 = r4.f59992b     // Catch:{ all -> 0x0062 }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x0062 }
            L_0x001d:
                java.io.File[] r1 = r1.f59999d     // Catch:{ all -> 0x0062 }
                r5 = r1[r5]     // Catch:{ all -> 0x0062 }
                ji0.e r1 = ji0.C23741e.this     // Catch:{ FileNotFoundException -> 0x0055 }
                oi0.a r1 = r1.f59970b     // Catch:{ FileNotFoundException -> 0x0055 }
                oi0.a$a r1 = (oi0.C24628a.C24629a) r1     // Catch:{ FileNotFoundException -> 0x0055 }
                r1.getClass()     // Catch:{ FileNotFoundException -> 0x0055 }
                r1 = 0
                java.util.logging.Logger r2 = si0.C24912s.f62972a     // Catch:{ FileNotFoundException -> 0x003c }
                java.lang.String r2 = "$this$sink"
                mf0.C24362h.m61211f(r5, r2)     // Catch:{ FileNotFoundException -> 0x003c }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003c }
                r2.<init>(r5, r1)     // Catch:{ FileNotFoundException -> 0x003c }
                si0.u r5 = si0.C24911r.m62550f(r2)     // Catch:{ FileNotFoundException -> 0x003c }
                goto L_0x004e
            L_0x003c:
                java.io.File r2 = r5.getParentFile()     // Catch:{ FileNotFoundException -> 0x0055 }
                r2.mkdirs()     // Catch:{ FileNotFoundException -> 0x0055 }
                java.util.logging.Logger r2 = si0.C24912s.f62972a     // Catch:{ FileNotFoundException -> 0x0055 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0055 }
                r2.<init>(r5, r1)     // Catch:{ FileNotFoundException -> 0x0055 }
                si0.u r5 = si0.C24911r.m62550f(r2)     // Catch:{ FileNotFoundException -> 0x0055 }
            L_0x004e:
                ji0.e$b$a r1 = new ji0.e$b$a     // Catch:{ all -> 0x0062 }
                r1.<init>(r5)     // Catch:{ all -> 0x0062 }
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                return r1
            L_0x0055:
                si0.e r5 = new si0.e     // Catch:{ all -> 0x0062 }
                r5.<init>()     // Catch:{ all -> 0x0062 }
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                return r5
            L_0x005c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0062 }
                r5.<init>()     // Catch:{ all -> 0x0062 }
                throw r5     // Catch:{ all -> 0x0062 }
            L_0x0062:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0062 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ji0.C23741e.C23743b.mo58994d(int):si0.a0");
        }
    }

    /* renamed from: ji0.e$c */
    public final class C23745c {

        /* renamed from: a */
        public final String f59996a;

        /* renamed from: b */
        public final long[] f59997b;

        /* renamed from: c */
        public final File[] f59998c;

        /* renamed from: d */
        public final File[] f59999d;

        /* renamed from: e */
        public boolean f60000e;

        /* renamed from: f */
        public C23743b f60001f;

        /* renamed from: g */
        public long f60002g;

        public C23745c(String str) {
            this.f59996a = str;
            int i = C23741e.this.f59977i;
            this.f59997b = new long[i];
            this.f59998c = new File[i];
            this.f59999d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C23741e.this.f59977i; i2++) {
                sb.append(i2);
                this.f59998c[i2] = new File(C23741e.this.f59971c, sb.toString());
                sb.append(".tmp");
                this.f59999d[i2] = new File(C23741e.this.f59971c, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final C23746d mo58996a() {
            C24893c0 c0Var;
            if (Thread.holdsLock(C23741e.this)) {
                C24893c0[] c0VarArr = new C24893c0[C23741e.this.f59977i];
                this.f59997b.clone();
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        C23741e eVar = C23741e.this;
                        if (i2 >= eVar.f59977i) {
                            return new C23746d(this.f59996a, this.f60002g, c0VarArr);
                        }
                        C24628a aVar = eVar.f59970b;
                        File file = this.f59998c[i2];
                        ((C24628a.C24629a) aVar).getClass();
                        c0VarArr[i2] = C24911r.m62552h(file);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            C23741e eVar2 = C23741e.this;
                            if (i >= eVar2.f59977i || (c0Var = c0VarArr[i]) == null) {
                                try {
                                    eVar2.mo58988y(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            } else {
                                C23610d.m57796d(c0Var);
                                i++;
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: ji0.e$d */
    public final class C23746d implements Closeable {

        /* renamed from: b */
        public final String f60004b;

        /* renamed from: c */
        public final long f60005c;

        /* renamed from: d */
        public final C24893c0[] f60006d;

        public C23746d(String str, long j, C24893c0[] c0VarArr) {
            this.f60004b = str;
            this.f60005c = j;
            this.f60006d = c0VarArr;
        }

        public final void close() {
            for (C24893c0 d : this.f60006d) {
                C23610d.m57796d(d);
            }
        }
    }

    static {
        Class<C23741e> cls = C23741e.class;
    }

    public C23741e(File file, ThreadPoolExecutor threadPoolExecutor) {
        C24628a.C24629a aVar = C24628a.f62316a;
        this.f59970b = aVar;
        this.f59971c = file;
        this.f59975g = 201105;
        this.f59972d = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f59973e = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.f59974f = new File(file, "journal.bkp");
        this.f59977i = 2;
        this.f59976h = 20971520;
        this.f59988t = threadPoolExecutor;
    }

    /* renamed from: A */
    public static void m58307A(String str) {
        if (!f59969v.matcher(str).matches()) {
            throw new IllegalArgumentException(C13437d.m33706k("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m58308a(Throwable th, Channel channel) {
        if (th != null) {
            try {
                channel.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            channel.close();
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f59983o) {
            if (!this.f59984p) {
                for (C23745c cVar : (C23745c[]) this.f59980l.values().toArray(new C23745c[this.f59980l.size()])) {
                    C23743b bVar = cVar.f60001f;
                    if (bVar != null) {
                        bVar.mo58991a();
                    }
                }
                mo58989z();
                this.f59979k.close();
                this.f59979k = null;
                this.f59984p = true;
                return;
            }
        }
        this.f59984p = true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public final synchronized void mo58976e() {
        /*
            r2 = this;
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0011 }
            boolean r0 = r2.f59984p     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0011 }
            java.lang.String r1 = "cache is closed"
            r0.<init>(r1)     // Catch:{ all -> 0x0011 }
            throw r0     // Catch:{ all -> 0x0011 }
        L_0x0011:
            r0 = move-exception
            goto L_0x0016
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            throw r0     // Catch:{ all -> 0x0011 }
        L_0x0016:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C23741e.mo58976e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0113, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58977f(ji0.C23741e.C23743b r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            ji0.e$c r0 = r9.f59991a     // Catch:{ all -> 0x011a }
            ji0.e$b r1 = r0.f60001f     // Catch:{ all -> 0x011a }
            if (r1 != r9) goto L_0x0114
            r1 = 0
            if (r10 == 0) goto L_0x004c
            boolean r2 = r0.f60000e     // Catch:{ all -> 0x011a }
            if (r2 != 0) goto L_0x004c
            r2 = 0
        L_0x000f:
            int r3 = r8.f59977i     // Catch:{ all -> 0x011a }
            if (r2 >= r3) goto L_0x004c
            boolean[] r3 = r9.f59992b     // Catch:{ all -> 0x011a }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x011a }
            if (r3 == 0) goto L_0x0032
            oi0.a r3 = r8.f59970b     // Catch:{ all -> 0x011a }
            java.io.File[] r4 = r0.f59999d     // Catch:{ all -> 0x011a }
            r4 = r4[r2]     // Catch:{ all -> 0x011a }
            oi0.a$a r3 = (oi0.C24628a.C24629a) r3     // Catch:{ all -> 0x011a }
            r3.getClass()     // Catch:{ all -> 0x011a }
            boolean r3 = r4.exists()     // Catch:{ all -> 0x011a }
            if (r3 != 0) goto L_0x002f
            r9.mo58991a()     // Catch:{ all -> 0x011a }
            monitor-exit(r8)
            return
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0032:
            r9.mo58991a()     // Catch:{ all -> 0x011a }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x011a }
            r10.<init>()     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x011a }
            r10.append(r2)     // Catch:{ all -> 0x011a }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x011a }
            r9.<init>(r10)     // Catch:{ all -> 0x011a }
            throw r9     // Catch:{ all -> 0x011a }
        L_0x004c:
            r9 = 0
        L_0x004d:
            int r2 = r8.f59977i     // Catch:{ all -> 0x011a }
            if (r9 >= r2) goto L_0x0093
            java.io.File[] r2 = r0.f59999d     // Catch:{ all -> 0x011a }
            r2 = r2[r9]     // Catch:{ all -> 0x011a }
            if (r10 == 0) goto L_0x0089
            oi0.a r3 = r8.f59970b     // Catch:{ all -> 0x011a }
            oi0.a$a r3 = (oi0.C24628a.C24629a) r3     // Catch:{ all -> 0x011a }
            r3.getClass()     // Catch:{ all -> 0x011a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x011a }
            if (r3 == 0) goto L_0x0090
            java.io.File[] r3 = r0.f59998c     // Catch:{ all -> 0x011a }
            r3 = r3[r9]     // Catch:{ all -> 0x011a }
            oi0.a r4 = r8.f59970b     // Catch:{ all -> 0x011a }
            oi0.a$a r4 = (oi0.C24628a.C24629a) r4     // Catch:{ all -> 0x011a }
            r4.mo60858c(r2, r3)     // Catch:{ all -> 0x011a }
            long[] r2 = r0.f59997b     // Catch:{ all -> 0x011a }
            r4 = r2[r9]     // Catch:{ all -> 0x011a }
            oi0.a r2 = r8.f59970b     // Catch:{ all -> 0x011a }
            oi0.a$a r2 = (oi0.C24628a.C24629a) r2     // Catch:{ all -> 0x011a }
            r2.getClass()     // Catch:{ all -> 0x011a }
            long r2 = r3.length()     // Catch:{ all -> 0x011a }
            long[] r6 = r0.f59997b     // Catch:{ all -> 0x011a }
            r6[r9] = r2     // Catch:{ all -> 0x011a }
            long r6 = r8.f59978j     // Catch:{ all -> 0x011a }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.f59978j = r6     // Catch:{ all -> 0x011a }
            goto L_0x0090
        L_0x0089:
            oi0.a r3 = r8.f59970b     // Catch:{ all -> 0x011a }
            oi0.a$a r3 = (oi0.C24628a.C24629a) r3     // Catch:{ all -> 0x011a }
            r3.mo60856a(r2)     // Catch:{ all -> 0x011a }
        L_0x0090:
            int r9 = r9 + 1
            goto L_0x004d
        L_0x0093:
            int r9 = r8.f59981m     // Catch:{ all -> 0x011a }
            r2 = 1
            int r9 = r9 + r2
            r8.f59981m = r9     // Catch:{ all -> 0x011a }
            r9 = 0
            r0.f60001f = r9     // Catch:{ all -> 0x011a }
            boolean r9 = r0.f60000e     // Catch:{ all -> 0x011a }
            r9 = r9 | r10
            r3 = 10
            r4 = 32
            if (r9 == 0) goto L_0x00db
            r0.f60000e = r2     // Catch:{ all -> 0x011a }
            si0.w r9 = r8.f59979k     // Catch:{ all -> 0x011a }
            java.lang.String r2 = "CLEAN"
            r9.mo61387Q(r2)     // Catch:{ all -> 0x011a }
            r9.writeByte(r4)     // Catch:{ all -> 0x011a }
            si0.w r9 = r8.f59979k     // Catch:{ all -> 0x011a }
            java.lang.String r2 = r0.f59996a     // Catch:{ all -> 0x011a }
            r9.mo61387Q(r2)     // Catch:{ all -> 0x011a }
            si0.w r9 = r8.f59979k     // Catch:{ all -> 0x011a }
            long[] r2 = r0.f59997b     // Catch:{ all -> 0x011a }
            int r5 = r2.length     // Catch:{ all -> 0x011a }
        L_0x00bd:
            if (r1 >= r5) goto L_0x00ca
            r6 = r2[r1]     // Catch:{ all -> 0x011a }
            r9.writeByte(r4)     // Catch:{ all -> 0x011a }
            r9.mo61386O0(r6)     // Catch:{ all -> 0x011a }
            int r1 = r1 + 1
            goto L_0x00bd
        L_0x00ca:
            si0.w r9 = r8.f59979k     // Catch:{ all -> 0x011a }
            r9.writeByte(r3)     // Catch:{ all -> 0x011a }
            if (r10 == 0) goto L_0x00f8
            long r9 = r8.f59987s     // Catch:{ all -> 0x011a }
            r1 = 1
            long r1 = r1 + r9
            r8.f59987s = r1     // Catch:{ all -> 0x011a }
            r0.f60002g = r9     // Catch:{ all -> 0x011a }
            goto L_0x00f8
        L_0x00db:
            java.util.LinkedHashMap<java.lang.String, ji0.e$c> r9 = r8.f59980l     // Catch:{ all -> 0x011a }
            java.lang.String r10 = r0.f59996a     // Catch:{ all -> 0x011a }
            r9.remove(r10)     // Catch:{ all -> 0x011a }
            si0.w r9 = r8.f59979k     // Catch:{ all -> 0x011a }
            java.lang.String r10 = "REMOVE"
            r9.mo61387Q(r10)     // Catch:{ all -> 0x011a }
            r9.writeByte(r4)     // Catch:{ all -> 0x011a }
            si0.w r9 = r8.f59979k     // Catch:{ all -> 0x011a }
            java.lang.String r10 = r0.f59996a     // Catch:{ all -> 0x011a }
            r9.mo61387Q(r10)     // Catch:{ all -> 0x011a }
            si0.w r9 = r8.f59979k     // Catch:{ all -> 0x011a }
            r9.writeByte(r3)     // Catch:{ all -> 0x011a }
        L_0x00f8:
            si0.w r9 = r8.f59979k     // Catch:{ all -> 0x011a }
            r9.flush()     // Catch:{ all -> 0x011a }
            long r9 = r8.f59978j     // Catch:{ all -> 0x011a }
            long r0 = r8.f59976h     // Catch:{ all -> 0x011a }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x010b
            boolean r9 = r8.mo58982q()     // Catch:{ all -> 0x011a }
            if (r9 == 0) goto L_0x0112
        L_0x010b:
            java.util.concurrent.Executor r9 = r8.f59988t     // Catch:{ all -> 0x011a }
            ji0.e$a r10 = r8.f59989u     // Catch:{ all -> 0x011a }
            r9.execute(r10)     // Catch:{ all -> 0x011a }
        L_0x0112:
            monitor-exit(r8)
            return
        L_0x0114:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011a }
            r9.<init>()     // Catch:{ all -> 0x011a }
            throw r9     // Catch:{ all -> 0x011a }
        L_0x011a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C23741e.mo58977f(ji0.e$b, boolean):void");
    }

    public final synchronized void flush() throws IOException {
        if (this.f59983o) {
            mo58976e();
            mo58989z();
            this.f59979k.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized ji0.C23741e.C23743b mo58979g(long r6, java.lang.String r8) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo58981i()     // Catch:{ all -> 0x0071 }
            r5.mo58976e()     // Catch:{ all -> 0x0071 }
            m58307A(r8)     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, ji0.e$c> r0 = r5.f59980l     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0071 }
            ji0.e$c r0 = (ji0.C23741e.C23745c) r0     // Catch:{ all -> 0x0071 }
            r1 = -1
            r3 = 0
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f60002g     // Catch:{ all -> 0x0071 }
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            ji0.e$b r6 = r0.f60001f     // Catch:{ all -> 0x0071 }
            if (r6 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r6 = r5.f59985q     // Catch:{ all -> 0x0071 }
            if (r6 != 0) goto L_0x0068
            boolean r6 = r5.f59986r     // Catch:{ all -> 0x0071 }
            if (r6 == 0) goto L_0x0034
            goto L_0x0068
        L_0x0034:
            si0.w r6 = r5.f59979k     // Catch:{ all -> 0x0071 }
            java.lang.String r7 = "DIRTY"
            r6.mo61387Q(r7)     // Catch:{ all -> 0x0071 }
            r7 = 32
            r6.writeByte(r7)     // Catch:{ all -> 0x0071 }
            r6.mo61387Q(r8)     // Catch:{ all -> 0x0071 }
            r7 = 10
            r6.writeByte(r7)     // Catch:{ all -> 0x0071 }
            si0.w r6 = r5.f59979k     // Catch:{ all -> 0x0071 }
            r6.flush()     // Catch:{ all -> 0x0071 }
            boolean r6 = r5.f59982n     // Catch:{ all -> 0x0071 }
            if (r6 == 0) goto L_0x0053
            monitor-exit(r5)
            return r3
        L_0x0053:
            if (r0 != 0) goto L_0x005f
            ji0.e$c r0 = new ji0.e$c     // Catch:{ all -> 0x0071 }
            r0.<init>(r8)     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, ji0.e$c> r6 = r5.f59980l     // Catch:{ all -> 0x0071 }
            r6.put(r8, r0)     // Catch:{ all -> 0x0071 }
        L_0x005f:
            ji0.e$b r6 = new ji0.e$b     // Catch:{ all -> 0x0071 }
            r6.<init>(r0)     // Catch:{ all -> 0x0071 }
            r0.f60001f = r6     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)
            return r6
        L_0x0068:
            java.util.concurrent.Executor r6 = r5.f59988t     // Catch:{ all -> 0x0071 }
            ji0.e$a r7 = r5.f59989u     // Catch:{ all -> 0x0071 }
            r6.execute(r7)     // Catch:{ all -> 0x0071 }
            monitor-exit(r5)
            return r3
        L_0x0071:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C23741e.mo58979g(long, java.lang.String):ji0.e$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized ji0.C23741e.C23746d mo58980h(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo58981i()     // Catch:{ all -> 0x004d }
            r3.mo58976e()     // Catch:{ all -> 0x004d }
            m58307A(r4)     // Catch:{ all -> 0x004d }
            java.util.LinkedHashMap<java.lang.String, ji0.e$c> r0 = r3.f59980l     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004d }
            ji0.e$c r0 = (ji0.C23741e.C23745c) r0     // Catch:{ all -> 0x004d }
            r1 = 0
            if (r0 == 0) goto L_0x004b
            boolean r2 = r0.f60000e     // Catch:{ all -> 0x004d }
            if (r2 != 0) goto L_0x001a
            goto L_0x004b
        L_0x001a:
            ji0.e$d r0 = r0.mo58996a()     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f59981m     // Catch:{ all -> 0x004d }
            int r1 = r1 + 1
            r3.f59981m = r1     // Catch:{ all -> 0x004d }
            si0.w r1 = r3.f59979k     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "READ"
            r1.mo61387Q(r2)     // Catch:{ all -> 0x004d }
            r2 = 32
            r1.writeByte(r2)     // Catch:{ all -> 0x004d }
            r1.mo61387Q(r4)     // Catch:{ all -> 0x004d }
            r4 = 10
            r1.writeByte(r4)     // Catch:{ all -> 0x004d }
            boolean r4 = r3.mo58982q()     // Catch:{ all -> 0x004d }
            if (r4 == 0) goto L_0x0049
            java.util.concurrent.Executor r4 = r3.f59988t     // Catch:{ all -> 0x004d }
            ji0.e$a r1 = r3.f59989u     // Catch:{ all -> 0x004d }
            r4.execute(r1)     // Catch:{ all -> 0x004d }
        L_0x0049:
            monitor-exit(r3)
            return r0
        L_0x004b:
            monitor-exit(r3)
            return r1
        L_0x004d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C23741e.mo58980h(java.lang.String):ji0.e$d");
    }

    /* renamed from: i */
    public final synchronized void mo58981i() throws IOException {
        if (!this.f59983o) {
            C24628a aVar = this.f59970b;
            File file = this.f59974f;
            ((C24628a.C24629a) aVar).getClass();
            if (file.exists()) {
                C24628a aVar2 = this.f59970b;
                File file2 = this.f59972d;
                ((C24628a.C24629a) aVar2).getClass();
                if (file2.exists()) {
                    ((C24628a.C24629a) this.f59970b).mo60856a(this.f59974f);
                } else {
                    ((C24628a.C24629a) this.f59970b).mo60858c(this.f59974f, this.f59972d);
                }
            }
            C24628a aVar3 = this.f59970b;
            File file3 = this.f59972d;
            ((C24628a.C24629a) aVar3).getClass();
            if (file3.exists()) {
                try {
                    mo58985v();
                    mo58984t();
                    this.f59983o = true;
                    return;
                } catch (IOException e) {
                    C24721f fVar = C24721f.f62584a;
                    fVar.mo61202m(5, "DiskLruCache " + this.f59971c + " is corrupt: " + e.getMessage() + ", removing", e);
                    close();
                    ((C24628a.C24629a) this.f59970b).mo60857b(this.f59971c);
                    this.f59984p = false;
                } catch (Throwable th) {
                    this.f59984p = false;
                    throw th;
                }
            }
            mo58987x();
            this.f59983o = true;
        }
    }

    /* renamed from: q */
    public final boolean mo58982q() {
        int i = this.f59981m;
        if (i < 2000 || i < this.f59980l.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final C24917w mo58983r() throws FileNotFoundException {
        C24915u uVar;
        C24628a aVar = this.f59970b;
        File file = this.f59972d;
        ((C24628a.C24629a) aVar).getClass();
        try {
            uVar = C24911r.m62545a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            uVar = C24911r.m62545a(file);
        }
        return new C24917w(new C23747f(this, uVar));
    }

    /* renamed from: t */
    public final void mo58984t() throws IOException {
        ((C24628a.C24629a) this.f59970b).mo60856a(this.f59973e);
        Iterator<C23745c> it = this.f59980l.values().iterator();
        while (it.hasNext()) {
            C23745c next = it.next();
            int i = 0;
            if (next.f60001f == null) {
                while (i < this.f59977i) {
                    this.f59978j += next.f59997b[i];
                    i++;
                }
            } else {
                next.f60001f = null;
                while (i < this.f59977i) {
                    ((C24628a.C24629a) this.f59970b).mo60856a(next.f59998c[i]);
                    ((C24628a.C24629a) this.f59970b).mo60856a(next.f59999d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f59981m = r0 - r9.f59980l.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r1.mo61415l1() == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        mo58987x();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        r9.f59979k = mo58983r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        m58308a((java.lang.Throwable) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        m58308a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0062=Splitter:B:16:0x0062, B:24:0x0082=Splitter:B:24:0x0082} */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58985v() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            oi0.a r1 = r9.f59970b
            java.io.File r2 = r9.f59972d
            oi0.a$a r1 = (oi0.C24628a.C24629a) r1
            r1.getClass()
            si0.q r1 = si0.C24911r.m62552h(r2)
            si0.x r1 = si0.C24911r.m62547c(r1)
            java.lang.String r2 = r1.mo61440z0()     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = r1.mo61440z0()     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = r1.mo61440z0()     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = r1.mo61440z0()     // Catch:{ all -> 0x0080 }
            java.lang.String r6 = r1.mo61440z0()     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0080 }
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0080 }
            if (r7 == 0) goto L_0x0082
            int r7 = r9.f59975g     // Catch:{ all -> 0x0080 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0080 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0082
            int r4 = r9.f59977i     // Catch:{ all -> 0x0080 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0080 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0082
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x0082
            r0 = 0
        L_0x0058:
            java.lang.String r2 = r1.mo61440z0()     // Catch:{ EOFException -> 0x0062 }
            r9.mo58986w(r2)     // Catch:{ EOFException -> 0x0062 }
            int r0 = r0 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap<java.lang.String, ji0.e$c> r2 = r9.f59980l     // Catch:{ all -> 0x0080 }
            int r2 = r2.size()     // Catch:{ all -> 0x0080 }
            int r0 = r0 - r2
            r9.f59981m = r0     // Catch:{ all -> 0x0080 }
            boolean r0 = r1.mo61415l1()     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0075
            r9.mo58987x()     // Catch:{ all -> 0x0080 }
            goto L_0x007b
        L_0x0075:
            si0.w r0 = r9.mo58983r()     // Catch:{ all -> 0x0080 }
            r9.f59979k = r0     // Catch:{ all -> 0x0080 }
        L_0x007b:
            r0 = 0
            m58308a(r0, r1)
            return
        L_0x0080:
            r0 = move-exception
            goto L_0x00b0
        L_0x0082:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r7.<init>()     // Catch:{ all -> 0x0080 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x0080 }
            r7.append(r2)     // Catch:{ all -> 0x0080 }
            r7.append(r0)     // Catch:{ all -> 0x0080 }
            r7.append(r3)     // Catch:{ all -> 0x0080 }
            r7.append(r0)     // Catch:{ all -> 0x0080 }
            r7.append(r5)     // Catch:{ all -> 0x0080 }
            r7.append(r0)     // Catch:{ all -> 0x0080 }
            r7.append(r6)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0080 }
            r4.<init>(r0)     // Catch:{ all -> 0x0080 }
            throw r4     // Catch:{ all -> 0x0080 }
        L_0x00b0:
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r2 = move-exception
            m58308a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C23741e.mo58985v():void");
    }

    /* renamed from: w */
    public final void mo58986w(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f59980l.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C23745c cVar = this.f59980l.get(str2);
            if (cVar == null) {
                cVar = new C23745c(str2);
                this.f59980l.put(str2, cVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                cVar.f60000e = true;
                cVar.f60001f = null;
                if (split.length == C23741e.this.f59977i) {
                    int i2 = 0;
                    while (i2 < split.length) {
                        try {
                            cVar.f59997b[i2] = Long.parseLong(split[i2]);
                            i2++;
                        } catch (NumberFormatException unused) {
                            StringBuilder k = C13555b.m33972k("unexpected journal line: ");
                            k.append(Arrays.toString(split));
                            throw new IOException(k.toString());
                        }
                    }
                    return;
                }
                StringBuilder k2 = C13555b.m33972k("unexpected journal line: ");
                k2.append(Arrays.toString(split));
                throw new IOException(k2.toString());
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f60001f = new C23743b(cVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.getParentFile().mkdirs();
        r2 = si0.C24912s.f62972a;
        r1 = si0.C24911r.m62550f(new java.io.FileOutputStream(r1, false));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0023 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo58987x() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            si0.w r0 = r11.f59979k     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00f6 }
        L_0x0008:
            oi0.a r0 = r11.f59970b     // Catch:{ all -> 0x00f6 }
            java.io.File r1 = r11.f59973e     // Catch:{ all -> 0x00f6 }
            oi0.a$a r0 = (oi0.C24628a.C24629a) r0     // Catch:{ all -> 0x00f6 }
            r0.getClass()     // Catch:{ all -> 0x00f6 }
            r0 = 0
            java.util.logging.Logger r2 = si0.C24912s.f62972a     // Catch:{ FileNotFoundException -> 0x0023 }
            java.lang.String r2 = "$this$sink"
            mf0.C24362h.m61211f(r1, r2)     // Catch:{ FileNotFoundException -> 0x0023 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0023 }
            r2.<init>(r1, r0)     // Catch:{ FileNotFoundException -> 0x0023 }
            si0.u r1 = si0.C24911r.m62550f(r2)     // Catch:{ FileNotFoundException -> 0x0023 }
            goto L_0x0035
        L_0x0023:
            java.io.File r2 = r1.getParentFile()     // Catch:{ all -> 0x00f6 }
            r2.mkdirs()     // Catch:{ all -> 0x00f6 }
            java.util.logging.Logger r2 = si0.C24912s.f62972a     // Catch:{ all -> 0x00f6 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f6 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x00f6 }
            si0.u r1 = si0.C24911r.m62550f(r2)     // Catch:{ all -> 0x00f6 }
        L_0x0035:
            si0.w r2 = new si0.w     // Catch:{ all -> 0x00f6 }
            r2.<init>(r1)     // Catch:{ all -> 0x00f6 }
            r1 = 0
            java.lang.String r3 = "libcore.io.DiskLruCache"
            r2.mo61387Q(r3)     // Catch:{ all -> 0x008f }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "1"
            r2.mo61387Q(r4)     // Catch:{ all -> 0x008f }
            r2.writeByte(r3)     // Catch:{ all -> 0x008f }
            int r4 = r11.f59975g     // Catch:{ all -> 0x008f }
            long r4 = (long) r4     // Catch:{ all -> 0x008f }
            r2.mo61386O0(r4)     // Catch:{ all -> 0x008f }
            r2.writeByte(r3)     // Catch:{ all -> 0x008f }
            int r4 = r11.f59977i     // Catch:{ all -> 0x008f }
            long r4 = (long) r4     // Catch:{ all -> 0x008f }
            r2.mo61386O0(r4)     // Catch:{ all -> 0x008f }
            r2.writeByte(r3)     // Catch:{ all -> 0x008f }
            r2.writeByte(r3)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, ji0.e$c> r4 = r11.f59980l     // Catch:{ all -> 0x008f }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x008f }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x008f }
        L_0x006c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x008f }
            ji0.e$c r5 = (ji0.C23741e.C23745c) r5     // Catch:{ all -> 0x008f }
            ji0.e$b r6 = r5.f60001f     // Catch:{ all -> 0x008f }
            r7 = 32
            if (r6 == 0) goto L_0x0091
            java.lang.String r6 = "DIRTY"
            r2.mo61387Q(r6)     // Catch:{ all -> 0x008f }
            r2.writeByte(r7)     // Catch:{ all -> 0x008f }
            java.lang.String r5 = r5.f59996a     // Catch:{ all -> 0x008f }
            r2.mo61387Q(r5)     // Catch:{ all -> 0x008f }
            r2.writeByte(r3)     // Catch:{ all -> 0x008f }
            goto L_0x006c
        L_0x008f:
            r0 = move-exception
            goto L_0x00f0
        L_0x0091:
            java.lang.String r6 = "CLEAN"
            r2.mo61387Q(r6)     // Catch:{ all -> 0x008f }
            r2.writeByte(r7)     // Catch:{ all -> 0x008f }
            java.lang.String r6 = r5.f59996a     // Catch:{ all -> 0x008f }
            r2.mo61387Q(r6)     // Catch:{ all -> 0x008f }
            long[] r5 = r5.f59997b     // Catch:{ all -> 0x008f }
            int r6 = r5.length     // Catch:{ all -> 0x008f }
            r8 = 0
        L_0x00a2:
            if (r8 >= r6) goto L_0x00af
            r9 = r5[r8]     // Catch:{ all -> 0x008f }
            r2.writeByte(r7)     // Catch:{ all -> 0x008f }
            r2.mo61386O0(r9)     // Catch:{ all -> 0x008f }
            int r8 = r8 + 1
            goto L_0x00a2
        L_0x00af:
            r2.writeByte(r3)     // Catch:{ all -> 0x008f }
            goto L_0x006c
        L_0x00b3:
            m58308a(r1, r2)     // Catch:{ all -> 0x00f6 }
            oi0.a r1 = r11.f59970b     // Catch:{ all -> 0x00f6 }
            java.io.File r2 = r11.f59972d     // Catch:{ all -> 0x00f6 }
            oi0.a$a r1 = (oi0.C24628a.C24629a) r1     // Catch:{ all -> 0x00f6 }
            r1.getClass()     // Catch:{ all -> 0x00f6 }
            boolean r1 = r2.exists()     // Catch:{ all -> 0x00f6 }
            if (r1 == 0) goto L_0x00d0
            oi0.a r1 = r11.f59970b     // Catch:{ all -> 0x00f6 }
            java.io.File r2 = r11.f59972d     // Catch:{ all -> 0x00f6 }
            java.io.File r3 = r11.f59974f     // Catch:{ all -> 0x00f6 }
            oi0.a$a r1 = (oi0.C24628a.C24629a) r1     // Catch:{ all -> 0x00f6 }
            r1.mo60858c(r2, r3)     // Catch:{ all -> 0x00f6 }
        L_0x00d0:
            oi0.a r1 = r11.f59970b     // Catch:{ all -> 0x00f6 }
            java.io.File r2 = r11.f59973e     // Catch:{ all -> 0x00f6 }
            java.io.File r3 = r11.f59972d     // Catch:{ all -> 0x00f6 }
            oi0.a$a r1 = (oi0.C24628a.C24629a) r1     // Catch:{ all -> 0x00f6 }
            r1.mo60858c(r2, r3)     // Catch:{ all -> 0x00f6 }
            oi0.a r1 = r11.f59970b     // Catch:{ all -> 0x00f6 }
            java.io.File r2 = r11.f59974f     // Catch:{ all -> 0x00f6 }
            oi0.a$a r1 = (oi0.C24628a.C24629a) r1     // Catch:{ all -> 0x00f6 }
            r1.mo60856a(r2)     // Catch:{ all -> 0x00f6 }
            si0.w r1 = r11.mo58983r()     // Catch:{ all -> 0x00f6 }
            r11.f59979k = r1     // Catch:{ all -> 0x00f6 }
            r11.f59982n = r0     // Catch:{ all -> 0x00f6 }
            r11.f59986r = r0     // Catch:{ all -> 0x00f6 }
            monitor-exit(r11)
            return
        L_0x00f0:
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r1 = move-exception
            m58308a(r0, r2)     // Catch:{ all -> 0x00f6 }
            throw r1     // Catch:{ all -> 0x00f6 }
        L_0x00f6:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ji0.C23741e.mo58987x():void");
    }

    /* renamed from: y */
    public final void mo58988y(C23745c cVar) throws IOException {
        C23743b bVar = cVar.f60001f;
        if (bVar != null) {
            bVar.mo58993c();
        }
        for (int i = 0; i < this.f59977i; i++) {
            ((C24628a.C24629a) this.f59970b).mo60856a(cVar.f59998c[i]);
            long j = this.f59978j;
            long[] jArr = cVar.f59997b;
            this.f59978j = j - jArr[i];
            jArr[i] = 0;
        }
        this.f59981m++;
        C24917w wVar = this.f59979k;
        wVar.mo61387Q("REMOVE");
        wVar.writeByte(32);
        wVar.mo61387Q(cVar.f59996a);
        wVar.writeByte(10);
        this.f59980l.remove(cVar.f59996a);
        if (mo58982q()) {
            this.f59988t.execute(this.f59989u);
        }
    }

    /* renamed from: z */
    public final void mo58989z() throws IOException {
        while (this.f59978j > this.f59976h) {
            mo58988y(this.f59980l.values().iterator().next());
        }
        this.f59985q = false;
    }
}
