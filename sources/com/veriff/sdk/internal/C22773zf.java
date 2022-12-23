package com.veriff.sdk.internal;

import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p358af.C13437d;

/* renamed from: com.veriff.sdk.internal.zf */
public final class C22773zf implements Closeable, Flushable {

    /* renamed from: a */
    public static final Pattern f57721a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: m */
    public static final /* synthetic */ boolean f57722m = true;

    /* renamed from: b */
    public final aas f57723b;

    /* renamed from: c */
    public final File f57724c;

    /* renamed from: d */
    public final int f57725d;

    /* renamed from: e */
    public abj f57726e;

    /* renamed from: f */
    public final LinkedHashMap<String, C22778b> f57727f = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: g */
    public int f57728g;

    /* renamed from: h */
    public boolean f57729h;

    /* renamed from: i */
    public boolean f57730i;

    /* renamed from: j */
    public boolean f57731j;

    /* renamed from: k */
    public boolean f57732k;

    /* renamed from: l */
    public boolean f57733l;

    /* renamed from: n */
    private final File f57734n;

    /* renamed from: o */
    private final File f57735o;

    /* renamed from: p */
    private final File f57736p;

    /* renamed from: q */
    private final int f57737q;

    /* renamed from: r */
    private long f57738r;

    /* renamed from: s */
    private long f57739s = 0;

    /* renamed from: t */
    private long f57740t = 0;

    /* renamed from: u */
    private final Executor f57741u;

    /* renamed from: v */
    private final Runnable f57742v = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r1 = r6.f57743a;
            r1.f57733l = true;
            r1.f57726e = com.veriff.sdk.internal.abr.m50507a(com.veriff.sdk.internal.abr.m50509a());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                com.veriff.sdk.internal.zf r0 = com.veriff.sdk.internal.C22773zf.this
                monitor-enter(r0)
                com.veriff.sdk.internal.zf r1 = com.veriff.sdk.internal.C22773zf.this     // Catch:{ all -> 0x003f }
                boolean r2 = r1.f57730i     // Catch:{ all -> 0x003f }
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x000d
                r2 = 1
                goto L_0x000e
            L_0x000d:
                r2 = 0
            L_0x000e:
                boolean r5 = r1.f57731j     // Catch:{ all -> 0x003f }
                r2 = r2 | r5
                if (r2 == 0) goto L_0x0015
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return
            L_0x0015:
                r1.mo57472e()     // Catch:{ IOException -> 0x0019 }
                goto L_0x001d
            L_0x0019:
                com.veriff.sdk.internal.zf r1 = com.veriff.sdk.internal.C22773zf.this     // Catch:{ all -> 0x003f }
                r1.f57732k = r4     // Catch:{ all -> 0x003f }
            L_0x001d:
                com.veriff.sdk.internal.zf r1 = com.veriff.sdk.internal.C22773zf.this     // Catch:{ IOException -> 0x002f }
                boolean r1 = r1.mo57468c()     // Catch:{ IOException -> 0x002f }
                if (r1 == 0) goto L_0x003d
                com.veriff.sdk.internal.zf r1 = com.veriff.sdk.internal.C22773zf.this     // Catch:{ IOException -> 0x002f }
                r1.mo57467b()     // Catch:{ IOException -> 0x002f }
                com.veriff.sdk.internal.zf r1 = com.veriff.sdk.internal.C22773zf.this     // Catch:{ IOException -> 0x002f }
                r1.f57728g = r3     // Catch:{ IOException -> 0x002f }
                goto L_0x003d
            L_0x002f:
                com.veriff.sdk.internal.zf r1 = com.veriff.sdk.internal.C22773zf.this     // Catch:{ all -> 0x003f }
                r1.f57733l = r4     // Catch:{ all -> 0x003f }
                com.veriff.sdk.internal.abz r2 = com.veriff.sdk.internal.abr.m50509a()     // Catch:{ all -> 0x003f }
                com.veriff.sdk.internal.abj r2 = com.veriff.sdk.internal.abr.m50507a((com.veriff.sdk.internal.abz) r2)     // Catch:{ all -> 0x003f }
                r1.f57726e = r2     // Catch:{ all -> 0x003f }
            L_0x003d:
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return
            L_0x003f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22773zf.C227741.run():void");
        }
    };

    /* renamed from: com.veriff.sdk.internal.zf$c */
    public final class C22779c implements Closeable {

        /* renamed from: b */
        private final String f57760b;

        /* renamed from: c */
        private final long f57761c;

        /* renamed from: d */
        private final aca[] f57762d;

        public C22779c(String str, long j, aca[] acaArr, long[] jArr) {
            this.f57760b = str;
            this.f57761c = j;
            this.f57762d = acaArr;
        }

        /* renamed from: a */
        public C22776a mo57485a() throws IOException {
            return C22773zf.this.mo57461a(this.f57760b, this.f57761c);
        }

        public void close() {
            for (aca a : this.f57762d) {
                C22766za.m55834a((Closeable) a);
            }
        }

        /* renamed from: a */
        public aca mo57484a(int i) {
            return this.f57762d[i];
        }
    }

    static {
        Class<C22773zf> cls = C22773zf.class;
    }

    public C22773zf(aas aas, File file, int i, int i2, long j, Executor executor) {
        this.f57723b = aas;
        this.f57724c = file;
        this.f57737q = i;
        this.f57734n = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f57735o = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.f57736p = new File(file, "journal.bkp");
        this.f57725d = i2;
        this.f57738r = j;
        this.f57741u = executor;
    }

    /* renamed from: d */
    private void m55873d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f57727f.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C22778b bVar = this.f57727f.get(str2);
            if (bVar == null) {
                bVar = new C22778b(str2);
                this.f57727f.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f57755e = true;
                bVar.f57756f = null;
                bVar.mo57483a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f57756f = new C22776a(bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f57728g = r0 - r9.f57727f.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.mo53890f() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo57467b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f57726e = m55876h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        m55872a((java.lang.Throwable) null, (java.lang.AutoCloseable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (r1 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        m55872a(r0, (java.lang.AutoCloseable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x007b=Splitter:B:23:0x007b, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m55875g() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.veriff.sdk.internal.aas r1 = r9.f57723b
            java.io.File r2 = r9.f57734n
            com.veriff.sdk.internal.aca r1 = r1.mo53788a(r2)
            com.veriff.sdk.internal.abk r1 = com.veriff.sdk.internal.abr.m50508a((com.veriff.sdk.internal.aca) r1)
            java.lang.String r2 = r1.mo53916s()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = r1.mo53916s()     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r1.mo53916s()     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = r1.mo53916s()     // Catch:{ all -> 0x00a9 }
            java.lang.String r6 = r1.mo53916s()     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x007b
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00a9 }
            if (r7 == 0) goto L_0x007b
            int r7 = r9.f57737q     // Catch:{ all -> 0x00a9 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00a9 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x007b
            int r4 = r9.f57725d     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00a9 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x007b
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.mo53916s()     // Catch:{ EOFException -> 0x005d }
            r9.m55873d(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, com.veriff.sdk.internal.zf$b> r2 = r9.f57727f     // Catch:{ all -> 0x00a9 }
            int r2 = r2.size()     // Catch:{ all -> 0x00a9 }
            int r0 = r0 - r2
            r9.f57728g = r0     // Catch:{ all -> 0x00a9 }
            boolean r0 = r1.mo53890f()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x0070
            r9.mo57467b()     // Catch:{ all -> 0x00a9 }
            goto L_0x0076
        L_0x0070:
            com.veriff.sdk.internal.abj r0 = r9.m55876h()     // Catch:{ all -> 0x00a9 }
            r9.f57726e = r0     // Catch:{ all -> 0x00a9 }
        L_0x0076:
            r0 = 0
            m55872a((java.lang.Throwable) r0, (java.lang.AutoCloseable) r1)
            return
        L_0x007b:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00a9 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r7.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00a9 }
            r7.append(r2)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            r7.append(r3)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            r7.append(r5)     // Catch:{ all -> 0x00a9 }
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            r7.append(r6)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00a9 }
            r4.<init>(r0)     // Catch:{ all -> 0x00a9 }
            throw r4     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r2 = move-exception
            if (r1 == 0) goto L_0x00b1
            m55872a((java.lang.Throwable) r0, (java.lang.AutoCloseable) r1)
        L_0x00b1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22773zf.m55875g():void");
    }

    /* renamed from: h */
    private abj m55876h() throws FileNotFoundException {
        return abr.m50507a((abz) new C22780zg(this.f57723b.mo53791c(this.f57734n)) {

            /* renamed from: a */
            public static final /* synthetic */ boolean f57744a = true;

            static {
                Class<C22773zf> cls = C22773zf.class;
            }

            /* renamed from: a */
            public void mo57476a(IOException iOException) {
                if (f57744a || Thread.holdsLock(C22773zf.this)) {
                    C22773zf.this.f57729h = true;
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    /* renamed from: i */
    private void m55877i() throws IOException {
        this.f57723b.mo53792d(this.f57735o);
        Iterator<C22778b> it = this.f57727f.values().iterator();
        while (it.hasNext()) {
            C22778b next = it.next();
            int i = 0;
            if (next.f57756f == null) {
                while (i < this.f57725d) {
                    this.f57739s += next.f57752b[i];
                    i++;
                }
            } else {
                next.f57756f = null;
                while (i < this.f57725d) {
                    this.f57723b.mo53792d(next.f57753c[i]);
                    this.f57723b.mo53792d(next.f57754d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: j */
    private synchronized void m55878j() {
        if (mo57471d()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo57463a() throws IOException {
        if (!f57722m) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!this.f57730i) {
            if (this.f57723b.mo53793e(this.f57736p)) {
                if (this.f57723b.mo53793e(this.f57734n)) {
                    this.f57723b.mo53792d(this.f57736p);
                } else {
                    this.f57723b.mo53789a(this.f57736p, this.f57734n);
                }
            }
            if (this.f57723b.mo53793e(this.f57734n)) {
                try {
                    m55875g();
                    m55877i();
                    this.f57730i = true;
                    return;
                } catch (IOException e) {
                    aay e2 = aay.m50281e();
                    e2.mo53800a(5, "DiskLruCache " + this.f57724c + " is corrupt: " + e.getMessage() + ", removing", (Throwable) e);
                    mo57473f();
                    this.f57731j = false;
                } catch (Throwable th) {
                    this.f57731j = false;
                    throw th;
                }
            }
            mo57467b();
            this.f57730i = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b9, code lost:
        if (r0 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        m55872a(r1, (java.lang.AutoCloseable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo57467b() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.veriff.sdk.internal.abj r0 = r7.f57726e     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00bf }
        L_0x0008:
            com.veriff.sdk.internal.aas r0 = r7.f57723b     // Catch:{ all -> 0x00bf }
            java.io.File r1 = r7.f57735o     // Catch:{ all -> 0x00bf }
            com.veriff.sdk.internal.abz r0 = r0.mo53790b(r1)     // Catch:{ all -> 0x00bf }
            com.veriff.sdk.internal.abj r0 = com.veriff.sdk.internal.abr.m50507a((com.veriff.sdk.internal.abz) r0)     // Catch:{ all -> 0x00bf }
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            com.veriff.sdk.internal.abj r2 = r0.mo53870b(r2)     // Catch:{ all -> 0x00b6 }
            r3 = 10
            r2.mo53899i(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = "1"
            com.veriff.sdk.internal.abj r2 = r0.mo53870b(r2)     // Catch:{ all -> 0x00b6 }
            r2.mo53899i(r3)     // Catch:{ all -> 0x00b6 }
            int r2 = r7.f57737q     // Catch:{ all -> 0x00b6 }
            long r4 = (long) r2     // Catch:{ all -> 0x00b6 }
            com.veriff.sdk.internal.abj r2 = r0.mo53908m(r4)     // Catch:{ all -> 0x00b6 }
            r2.mo53899i(r3)     // Catch:{ all -> 0x00b6 }
            int r2 = r7.f57725d     // Catch:{ all -> 0x00b6 }
            long r4 = (long) r2     // Catch:{ all -> 0x00b6 }
            com.veriff.sdk.internal.abj r2 = r0.mo53908m(r4)     // Catch:{ all -> 0x00b6 }
            r2.mo53899i(r3)     // Catch:{ all -> 0x00b6 }
            r0.mo53899i(r3)     // Catch:{ all -> 0x00b6 }
            java.util.LinkedHashMap<java.lang.String, com.veriff.sdk.internal.zf$b> r2 = r7.f57727f     // Catch:{ all -> 0x00b6 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00b6 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00b6 }
        L_0x004a:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r4 == 0) goto L_0x0083
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00b6 }
            com.veriff.sdk.internal.zf$b r4 = (com.veriff.sdk.internal.C22773zf.C22778b) r4     // Catch:{ all -> 0x00b6 }
            com.veriff.sdk.internal.zf$a r5 = r4.f57756f     // Catch:{ all -> 0x00b6 }
            r6 = 32
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = "DIRTY"
            com.veriff.sdk.internal.abj r5 = r0.mo53870b(r5)     // Catch:{ all -> 0x00b6 }
            r5.mo53899i(r6)     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = r4.f57751a     // Catch:{ all -> 0x00b6 }
            r0.mo53870b(r4)     // Catch:{ all -> 0x00b6 }
            r0.mo53899i(r3)     // Catch:{ all -> 0x00b6 }
            goto L_0x004a
        L_0x006e:
            java.lang.String r5 = "CLEAN"
            com.veriff.sdk.internal.abj r5 = r0.mo53870b(r5)     // Catch:{ all -> 0x00b6 }
            r5.mo53899i(r6)     // Catch:{ all -> 0x00b6 }
            java.lang.String r5 = r4.f57751a     // Catch:{ all -> 0x00b6 }
            r0.mo53870b(r5)     // Catch:{ all -> 0x00b6 }
            r4.mo57482a((com.veriff.sdk.internal.abj) r0)     // Catch:{ all -> 0x00b6 }
            r0.mo53899i(r3)     // Catch:{ all -> 0x00b6 }
            goto L_0x004a
        L_0x0083:
            m55872a((java.lang.Throwable) r1, (java.lang.AutoCloseable) r0)     // Catch:{ all -> 0x00bf }
            com.veriff.sdk.internal.aas r0 = r7.f57723b     // Catch:{ all -> 0x00bf }
            java.io.File r1 = r7.f57734n     // Catch:{ all -> 0x00bf }
            boolean r0 = r0.mo53793e(r1)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0099
            com.veriff.sdk.internal.aas r0 = r7.f57723b     // Catch:{ all -> 0x00bf }
            java.io.File r1 = r7.f57734n     // Catch:{ all -> 0x00bf }
            java.io.File r2 = r7.f57736p     // Catch:{ all -> 0x00bf }
            r0.mo53789a(r1, r2)     // Catch:{ all -> 0x00bf }
        L_0x0099:
            com.veriff.sdk.internal.aas r0 = r7.f57723b     // Catch:{ all -> 0x00bf }
            java.io.File r1 = r7.f57735o     // Catch:{ all -> 0x00bf }
            java.io.File r2 = r7.f57734n     // Catch:{ all -> 0x00bf }
            r0.mo53789a(r1, r2)     // Catch:{ all -> 0x00bf }
            com.veriff.sdk.internal.aas r0 = r7.f57723b     // Catch:{ all -> 0x00bf }
            java.io.File r1 = r7.f57736p     // Catch:{ all -> 0x00bf }
            r0.mo53792d(r1)     // Catch:{ all -> 0x00bf }
            com.veriff.sdk.internal.abj r0 = r7.m55876h()     // Catch:{ all -> 0x00bf }
            r7.f57726e = r0     // Catch:{ all -> 0x00bf }
            r0 = 0
            r7.f57729h = r0     // Catch:{ all -> 0x00bf }
            r7.f57733l = r0     // Catch:{ all -> 0x00bf }
            monitor-exit(r7)
            return
        L_0x00b6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r2 = move-exception
            if (r0 == 0) goto L_0x00be
            m55872a((java.lang.Throwable) r1, (java.lang.AutoCloseable) r0)     // Catch:{ all -> 0x00bf }
        L_0x00be:
            throw r2     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22773zf.mo57467b():void");
    }

    /* renamed from: c */
    public boolean mo57468c() {
        int i = this.f57728g;
        return i >= 2000 && i >= this.f57727f.size();
    }

    public synchronized void close() throws IOException {
        if (this.f57730i) {
            if (!this.f57731j) {
                for (C22778b bVar : (C22778b[]) this.f57727f.values().toArray(new C22778b[this.f57727f.size()])) {
                    C22776a aVar = bVar.f57756f;
                    if (aVar != null) {
                        aVar.mo57480c();
                    }
                }
                mo57472e();
                this.f57726e.close();
                this.f57726e = null;
                this.f57731j = true;
                return;
            }
        }
        this.f57731j = true;
    }

    /* renamed from: e */
    public void mo57472e() throws IOException {
        while (this.f57739s > this.f57738r) {
            mo57465a(this.f57727f.values().iterator().next());
        }
        this.f57732k = false;
    }

    /* renamed from: f */
    public void mo57473f() throws IOException {
        close();
        this.f57723b.mo53795g(this.f57724c);
    }

    public synchronized void flush() throws IOException {
        if (this.f57730i) {
            m55878j();
            mo57472e();
            this.f57726e.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo57469c(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.mo57463a()     // Catch:{ all -> 0x0029 }
            r6.m55878j()     // Catch:{ all -> 0x0029 }
            r6.m55874e(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, com.veriff.sdk.internal.zf$b> r0 = r6.f57727f     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            com.veriff.sdk.internal.zf$b r7 = (com.veriff.sdk.internal.C22773zf.C22778b) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.mo57465a((com.veriff.sdk.internal.C22773zf.C22778b) r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.f57739s     // Catch:{ all -> 0x0029 }
            long r3 = r6.f57738r     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.f57732k = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22773zf.mo57469c(java.lang.String):boolean");
    }

    /* renamed from: com.veriff.sdk.internal.zf$a */
    public final class C22776a {

        /* renamed from: a */
        public final C22778b f57746a;

        /* renamed from: b */
        public final boolean[] f57747b;

        /* renamed from: d */
        private boolean f57749d;

        public C22776a(C22778b bVar) {
            boolean[] zArr;
            this.f57746a = bVar;
            if (bVar.f57755e) {
                zArr = null;
            } else {
                zArr = new boolean[C22773zf.this.f57725d];
            }
            this.f57747b = zArr;
        }

        /* renamed from: a */
        public void mo57478a() {
            if (this.f57746a.f57756f == this) {
                int i = 0;
                while (true) {
                    C22773zf zfVar = C22773zf.this;
                    if (i < zfVar.f57725d) {
                        try {
                            zfVar.f57723b.mo53792d(this.f57746a.f57754d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f57746a.f57756f = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo57479b() throws IOException {
            synchronized (C22773zf.this) {
                if (!this.f57749d) {
                    if (this.f57746a.f57756f == this) {
                        C22773zf.this.mo57464a(this, true);
                    }
                    this.f57749d = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: c */
        public void mo57480c() throws IOException {
            synchronized (C22773zf.this) {
                if (!this.f57749d) {
                    if (this.f57746a.f57756f == this) {
                        C22773zf.this.mo57464a(this, false);
                    }
                    this.f57749d = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: a */
        public abz mo57477a(int i) {
            synchronized (C22773zf.this) {
                if (!this.f57749d) {
                    C22778b bVar = this.f57746a;
                    if (bVar.f57756f != this) {
                        abz a = abr.m50509a();
                        return a;
                    }
                    if (!bVar.f57755e) {
                        this.f57747b[i] = true;
                    }
                    try {
                        C227771 r1 = new C22780zg(C22773zf.this.f57723b.mo53790b(bVar.f57754d[i])) {
                            /* renamed from: a */
                            public void mo57476a(IOException iOException) {
                                synchronized (C22773zf.this) {
                                    C22776a.this.mo57478a();
                                }
                            }
                        };
                        return r1;
                    } catch (FileNotFoundException unused) {
                        return abr.m50509a();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.zf$b */
    public final class C22778b {

        /* renamed from: a */
        public final String f57751a;

        /* renamed from: b */
        public final long[] f57752b;

        /* renamed from: c */
        public final File[] f57753c;

        /* renamed from: d */
        public final File[] f57754d;

        /* renamed from: e */
        public boolean f57755e;

        /* renamed from: f */
        public C22776a f57756f;

        /* renamed from: g */
        public long f57757g;

        public C22778b(String str) {
            this.f57751a = str;
            int i = C22773zf.this.f57725d;
            this.f57752b = new long[i];
            this.f57753c = new File[i];
            this.f57754d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C22773zf.this.f57725d; i2++) {
                sb.append(i2);
                this.f57753c[i2] = new File(C22773zf.this.f57724c, sb.toString());
                sb.append(".tmp");
                this.f57754d[i2] = new File(C22773zf.this.f57724c, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: b */
        private IOException m55897b(String[] strArr) throws IOException {
            StringBuilder k = C13555b.m33972k("unexpected journal line: ");
            k.append(Arrays.toString(strArr));
            throw new IOException(k.toString());
        }

        /* renamed from: a */
        public void mo57483a(String[] strArr) throws IOException {
            if (strArr.length == C22773zf.this.f57725d) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f57752b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m55897b(strArr);
                    }
                }
                return;
            }
            throw m55897b(strArr);
        }

        /* renamed from: a */
        public void mo57482a(abj abj) throws IOException {
            for (long m : this.f57752b) {
                abj.mo53899i(32).mo53908m(m);
            }
        }

        /* renamed from: a */
        public C22779c mo57481a() {
            aca aca;
            if (Thread.holdsLock(C22773zf.this)) {
                aca[] acaArr = new aca[C22773zf.this.f57725d];
                long[] jArr = (long[]) this.f57752b.clone();
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        C22773zf zfVar = C22773zf.this;
                        if (i2 >= zfVar.f57725d) {
                            return new C22779c(this.f57751a, this.f57757g, acaArr, jArr);
                        }
                        acaArr[i2] = zfVar.f57723b.mo53788a(this.f57753c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            C22773zf zfVar2 = C22773zf.this;
                            if (i >= zfVar2.f57725d || (aca = acaArr[i]) == null) {
                                try {
                                    zfVar2.mo57465a(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            } else {
                                C22766za.m55834a((Closeable) aca);
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

    /* renamed from: e */
    private void m55874e(String str) {
        if (!f57721a.matcher(str).matches()) {
            throw new IllegalArgumentException(C13437d.m33706k("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    /* renamed from: a */
    public static C22773zf m55871a(aas aas, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C22773zf(aas, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C22766za.m55831a("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m55872a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.veriff.sdk.internal.C22773zf.C22779c mo57462a(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo57463a()     // Catch:{ all -> 0x0050 }
            r3.m55878j()     // Catch:{ all -> 0x0050 }
            r3.m55874e(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, com.veriff.sdk.internal.zf$b> r0 = r3.f57727f     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            com.veriff.sdk.internal.zf$b r0 = (com.veriff.sdk.internal.C22773zf.C22778b) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f57755e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            com.veriff.sdk.internal.zf$c r0 = r0.mo57481a()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f57728g     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f57728g = r1     // Catch:{ all -> 0x0050 }
            com.veriff.sdk.internal.abj r1 = r3.f57726e     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            com.veriff.sdk.internal.abj r1 = r1.mo53870b(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            com.veriff.sdk.internal.abj r1 = r1.mo53899i(r2)     // Catch:{ all -> 0x0050 }
            com.veriff.sdk.internal.abj r4 = r1.mo53870b(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.mo53899i(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo57468c()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f57741u     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f57742v     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22773zf.mo57462a(java.lang.String):com.veriff.sdk.internal.zf$c");
    }

    /* renamed from: b */
    public C22776a mo57466b(String str) throws IOException {
        return mo57461a(str, -1);
    }

    /* renamed from: d */
    public synchronized boolean mo57471d() {
        return this.f57731j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.veriff.sdk.internal.C22773zf.C22776a mo57461a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo57463a()     // Catch:{ all -> 0x0074 }
            r5.m55878j()     // Catch:{ all -> 0x0074 }
            r5.m55874e(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, com.veriff.sdk.internal.zf$b> r0 = r5.f57727f     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            com.veriff.sdk.internal.zf$b r0 = (com.veriff.sdk.internal.C22773zf.C22778b) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f57757g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            com.veriff.sdk.internal.zf$a r7 = r0.f57756f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f57732k     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f57733l     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            com.veriff.sdk.internal.abj r7 = r5.f57726e     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            com.veriff.sdk.internal.abj r7 = r7.mo53870b(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            com.veriff.sdk.internal.abj r7 = r7.mo53899i(r8)     // Catch:{ all -> 0x0074 }
            com.veriff.sdk.internal.abj r7 = r7.mo53870b(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.mo53899i(r8)     // Catch:{ all -> 0x0074 }
            com.veriff.sdk.internal.abj r7 = r5.f57726e     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f57729h     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            com.veriff.sdk.internal.zf$b r0 = new com.veriff.sdk.internal.zf$b     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, com.veriff.sdk.internal.zf$b> r7 = r5.f57727f     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            com.veriff.sdk.internal.zf$a r6 = new com.veriff.sdk.internal.zf$a     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f57756f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f57741u     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f57742v     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22773zf.mo57461a(java.lang.String, long):com.veriff.sdk.internal.zf$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo57464a(com.veriff.sdk.internal.C22773zf.C22776a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.veriff.sdk.internal.zf$b r0 = r10.f57746a     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.zf$a r1 = r0.f57756f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f57755e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f57725d     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f57747b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            com.veriff.sdk.internal.aas r3 = r9.f57723b     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.f57754d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.mo53793e(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.mo57480c()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.mo57480c()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0047:
            int r10 = r9.f57725d     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f57754d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            com.veriff.sdk.internal.aas r2 = r9.f57723b     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.mo53793e(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.f57753c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.aas r3 = r9.f57723b     // Catch:{ all -> 0x00fb }
            r3.mo53789a(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f57752b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.aas r10 = r9.f57723b     // Catch:{ all -> 0x00fb }
            long r5 = r10.mo53794f(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f57752b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f57739s     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f57739s = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            com.veriff.sdk.internal.aas r2 = r9.f57723b     // Catch:{ all -> 0x00fb }
            r2.mo53792d(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.f57728g     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f57728g = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f57756f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f57755e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.f57755e = r1     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.abj r10 = r9.f57726e     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            com.veriff.sdk.internal.abj r10 = r10.mo53870b(r1)     // Catch:{ all -> 0x00fb }
            r10.mo53899i(r3)     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.abj r10 = r9.f57726e     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.f57751a     // Catch:{ all -> 0x00fb }
            r10.mo53870b(r1)     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.abj r10 = r9.f57726e     // Catch:{ all -> 0x00fb }
            r0.mo57482a((com.veriff.sdk.internal.abj) r10)     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.abj r10 = r9.f57726e     // Catch:{ all -> 0x00fb }
            r10.mo53899i(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f57740t     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f57740t = r1     // Catch:{ all -> 0x00fb }
            r0.f57757g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, com.veriff.sdk.internal.zf$b> r10 = r9.f57727f     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f57751a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.abj r10 = r9.f57726e     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            com.veriff.sdk.internal.abj r10 = r10.mo53870b(r11)     // Catch:{ all -> 0x00fb }
            r10.mo53899i(r3)     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.abj r10 = r9.f57726e     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f57751a     // Catch:{ all -> 0x00fb }
            r10.mo53870b(r11)     // Catch:{ all -> 0x00fb }
            com.veriff.sdk.internal.abj r10 = r9.f57726e     // Catch:{ all -> 0x00fb }
            r10.mo53899i(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            com.veriff.sdk.internal.abj r10 = r9.f57726e     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f57739s     // Catch:{ all -> 0x00fb }
            long r0 = r9.f57738r     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo57468c()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.f57741u     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.f57742v     // Catch:{ all -> 0x00fb }
            r10.execute(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22773zf.mo57464a(com.veriff.sdk.internal.zf$a, boolean):void");
    }

    /* renamed from: a */
    public boolean mo57465a(C22778b bVar) throws IOException {
        C22776a aVar = bVar.f57756f;
        if (aVar != null) {
            aVar.mo57478a();
        }
        for (int i = 0; i < this.f57725d; i++) {
            this.f57723b.mo53792d(bVar.f57753c[i]);
            long j = this.f57739s;
            long[] jArr = bVar.f57752b;
            this.f57739s = j - jArr[i];
            jArr[i] = 0;
        }
        this.f57728g++;
        this.f57726e.mo53870b("REMOVE").mo53899i(32).mo53870b(bVar.f57751a).mo53899i(10);
        this.f57727f.remove(bVar.f57751a);
        if (mo57468c()) {
            this.f57741u.execute(this.f57742v);
        }
        return true;
    }
}
