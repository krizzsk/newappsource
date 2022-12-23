package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p358af.C13437d;

/* renamed from: bo.app.c */
public final class C1540c {

    /* renamed from: o */
    public static final Pattern f5551o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: p */
    public static final String f5552p = AppboyLogger.getBrazeLogTag(C1540c.class);

    /* renamed from: q */
    public static final OutputStream f5553q = new C1542b();

    /* renamed from: a */
    public final File f5554a;

    /* renamed from: b */
    public final File f5555b;

    /* renamed from: c */
    public final File f5556c;

    /* renamed from: d */
    public final File f5557d;

    /* renamed from: e */
    public final int f5558e;

    /* renamed from: f */
    public long f5559f;

    /* renamed from: g */
    public final int f5560g;

    /* renamed from: h */
    public long f5561h = 0;

    /* renamed from: i */
    public Writer f5562i;

    /* renamed from: j */
    public final LinkedHashMap<String, C1553d> f5563j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: k */
    public int f5564k;

    /* renamed from: l */
    public long f5565l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f5566m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n */
    public final Callable<Void> f5567n = new C1541a();

    /* renamed from: bo.app.c$a */
    public class C1541a implements Callable<Void> {
        public C1541a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                bo.app.c r0 = p030bo.app.C1540c.this
                monitor-enter(r0)
                bo.app.c r1 = p030bo.app.C1540c.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f5562i     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                bo.app.c r1 = p030bo.app.C1540c.this     // Catch:{ all -> 0x0028 }
                r1.mo5941i()     // Catch:{ all -> 0x0028 }
                bo.app.c r1 = p030bo.app.C1540c.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.mo5937e()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                bo.app.c r1 = p030bo.app.C1540c.this     // Catch:{ all -> 0x0028 }
                r1.mo5940h()     // Catch:{ all -> 0x0028 }
                bo.app.c r1 = p030bo.app.C1540c.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f5564k = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1540c.C1541a.call():java.lang.Void");
        }
    }

    /* renamed from: bo.app.c$b */
    public static class C1542b extends OutputStream {
        public void write(int i) {
        }
    }

    /* renamed from: bo.app.c$c */
    public final class C1543c {

        /* renamed from: a */
        public final C1553d f5569a;

        /* renamed from: b */
        public final boolean[] f5570b;

        /* renamed from: c */
        public boolean f5571c;

        /* renamed from: bo.app.c$c$a */
        public class C1544a extends FilterOutputStream {
            public /* synthetic */ C1544a(C1543c cVar, OutputStream outputStream, C1541a aVar) {
                this(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = C1543c.this.f5571c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = C1543c.this.f5571c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = C1543c.this.f5571c = true;
                }
            }

            public C1544a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = C1543c.this.f5571c = true;
                }
            }
        }

        public /* synthetic */ C1543c(C1540c cVar, C1553d dVar, C1541a aVar) {
            this(dVar);
        }

        public C1543c(C1553d dVar) {
            this.f5569a = dVar;
            this.f5570b = dVar.f5587c ? null : new boolean[C1540c.this.f5560g];
        }

        /* renamed from: b */
        public void mo5947b() {
            if (this.f5571c) {
                C1540c.this.mo5929a(this, false);
                C1540c.this.mo5935d(this.f5569a.f5585a);
                return;
            }
            C1540c.this.mo5929a(this, true);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0026 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo5945a(int r5) {
            /*
                r4 = this;
                if (r5 < 0) goto L_0x004b
                bo.app.c r0 = p030bo.app.C1540c.this
                int r0 = r0.f5560g
                if (r5 >= r0) goto L_0x004b
                bo.app.c r0 = p030bo.app.C1540c.this
                monitor-enter(r0)
                bo.app.d r1 = r4.f5569a     // Catch:{ all -> 0x0048 }
                bo.app.c$c r2 = r1.f5588d     // Catch:{ all -> 0x0048 }
                if (r2 != r4) goto L_0x0042
                boolean r2 = r1.f5587c     // Catch:{ all -> 0x0048 }
                if (r2 != 0) goto L_0x001c
                boolean[] r2 = r4.f5570b     // Catch:{ all -> 0x0048 }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x0048 }
            L_0x001c:
                java.io.File r5 = r1.mo5962b((int) r5)     // Catch:{ all -> 0x0048 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0026 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0026 }
                goto L_0x0034
            L_0x0026:
                bo.app.c r1 = p030bo.app.C1540c.this     // Catch:{ all -> 0x0048 }
                java.io.File r1 = r1.f5554a     // Catch:{ all -> 0x0048 }
                r1.mkdirs()     // Catch:{ all -> 0x0048 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003c }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x003c }
            L_0x0034:
                bo.app.c$c$a r5 = new bo.app.c$c$a     // Catch:{ all -> 0x0048 }
                r2 = 0
                r5.<init>(r4, r1, r2)     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return r5
            L_0x003c:
                java.io.OutputStream r5 = p030bo.app.C1540c.f5553q     // Catch:{ all -> 0x0048 }
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                return r5
            L_0x0042:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
                r5.<init>()     // Catch:{ all -> 0x0048 }
                throw r5     // Catch:{ all -> 0x0048 }
            L_0x0048:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0048 }
                throw r5
            L_0x004b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected index "
                java.lang.String r2 = " to be greater than 0 and less than the maximum value count of "
                java.lang.StringBuilder r5 = p379.C25541a.m63887r(r1, r5, r2)
                bo.app.c r1 = p030bo.app.C1540c.this
                int r1 = r1.f5560g
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1540c.C1543c.mo5945a(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo5946a() {
            C1540c.this.mo5929a(this, false);
        }
    }

    /* renamed from: bo.app.c$d */
    public final class C1545d implements Closeable {

        /* renamed from: a */
        public final InputStream[] f5574a;

        public /* synthetic */ C1545d(C1540c cVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, C1541a aVar) {
            this(cVar, str, j, inputStreamArr, jArr);
        }

        /* renamed from: a */
        public InputStream mo5952a(int i) {
            return this.f5574a[i];
        }

        public void close() {
            for (InputStream a : this.f5574a) {
                C1571f.m4151a((Closeable) a);
            }
        }

        public C1545d(C1540c cVar, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f5574a = inputStreamArr;
        }
    }

    public C1540c(File file, int i, int i2, long j) {
        File file2 = file;
        this.f5554a = file2;
        this.f5558e = i;
        this.f5555b = new File(file2, DiskLruCache.JOURNAL_FILE);
        this.f5556c = new File(file2, DiskLruCache.JOURNAL_FILE_TMP);
        this.f5557d = new File(file2, "journal.bkp");
        this.f5560g = i2;
        this.f5559f = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f5564k = r0 - r9.f5563j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo6024b() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        mo5940h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f5562i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f5555b, true), p030bo.app.C1571f.f5674a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5939g() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            bo.app.e r1 = new bo.app.e
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f5555b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p030bo.app.C1571f.f5674a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo6025c()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = r1.mo6025c()     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r1.mo6025c()     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r1.mo6025c()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = r1.mo6025c()     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00bb }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00bb }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f5558e     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00bb }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f5560g     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00bb }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00bb }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo6025c()     // Catch:{ EOFException -> 0x005f }
            r9.mo5933c((java.lang.String) r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, bo.app.d> r2 = r9.f5563j     // Catch:{ all -> 0x00bb }
            int r2 = r2.size()     // Catch:{ all -> 0x00bb }
            int r0 = r0 - r2
            r9.f5564k = r0     // Catch:{ all -> 0x00bb }
            boolean r0 = r1.mo6024b()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0072
            r9.mo5940h()     // Catch:{ all -> 0x00bb }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bb }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bb }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bb }
            java.io.File r4 = r9.f5555b     // Catch:{ all -> 0x00bb }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00bb }
            java.nio.charset.Charset r4 = p030bo.app.C1571f.f5674a     // Catch:{ all -> 0x00bb }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bb }
            r0.<init>(r2)     // Catch:{ all -> 0x00bb }
            r9.f5562i = r0     // Catch:{ all -> 0x00bb }
        L_0x0088:
            p030bo.app.C1571f.m4151a((java.io.Closeable) r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r7.<init>()     // Catch:{ all -> 0x00bb }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00bb }
            r7.append(r2)     // Catch:{ all -> 0x00bb }
            r7.append(r0)     // Catch:{ all -> 0x00bb }
            r7.append(r3)     // Catch:{ all -> 0x00bb }
            r7.append(r0)     // Catch:{ all -> 0x00bb }
            r7.append(r5)     // Catch:{ all -> 0x00bb }
            r7.append(r0)     // Catch:{ all -> 0x00bb }
            r7.append(r6)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00bb }
            r4.<init>(r0)     // Catch:{ all -> 0x00bb }
            throw r4     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            p030bo.app.C1571f.m4151a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1540c.mo5939g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e9, code lost:
        throw r2;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo5940h() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.f5562i     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0008
            r0.close()     // Catch:{ all -> 0x00ea }
        L_0x0008:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ea }
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ea }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ea }
            java.io.File r3 = r6.f5556c     // Catch:{ all -> 0x00ea }
            r2.<init>(r3)     // Catch:{ all -> 0x00ea }
            java.nio.charset.Charset r3 = p030bo.app.C1571f.f5674a     // Catch:{ all -> 0x00ea }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x00ea }
            r0.<init>(r1)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x00de }
            int r1 = r6.f5558e     // Catch:{ all -> 0x00de }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x00de }
            r0.write(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x00de }
            int r1 = r6.f5560g     // Catch:{ all -> 0x00de }
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x00de }
            r0.write(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch:{ all -> 0x00de }
            java.util.LinkedHashMap<java.lang.String, bo.app.d> r1 = r6.f5563j     // Catch:{ all -> 0x00de }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00de }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00de }
        L_0x005a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00de }
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00de }
            bo.app.d r2 = (p030bo.app.C1553d) r2     // Catch:{ all -> 0x00de }
            bo.app.c$c r3 = r2.f5588d     // Catch:{ all -> 0x00de }
            r4 = 10
            if (r3 == 0) goto L_0x0086
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r3.<init>()     // Catch:{ all -> 0x00de }
            java.lang.String r5 = "DIRTY "
            r3.append(r5)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = r2.f5585a     // Catch:{ all -> 0x00de }
            r3.append(r2)     // Catch:{ all -> 0x00de }
            r3.append(r4)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00de }
            r0.write(r2)     // Catch:{ all -> 0x00de }
            goto L_0x005a
        L_0x0086:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00de }
            r3.<init>()     // Catch:{ all -> 0x00de }
            java.lang.String r5 = "CLEAN "
            r3.append(r5)     // Catch:{ all -> 0x00de }
            java.lang.String r5 = r2.f5585a     // Catch:{ all -> 0x00de }
            r3.append(r5)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = r2.mo5961a()     // Catch:{ all -> 0x00de }
            r3.append(r2)     // Catch:{ all -> 0x00de }
            r3.append(r4)     // Catch:{ all -> 0x00de }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00de }
            r0.write(r2)     // Catch:{ all -> 0x00de }
            goto L_0x005a
        L_0x00a7:
            r0.close()     // Catch:{ all -> 0x00ea }
            java.io.File r0 = r6.f5555b     // Catch:{ all -> 0x00ea }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00ea }
            r1 = 1
            if (r0 == 0) goto L_0x00ba
            java.io.File r0 = r6.f5555b     // Catch:{ all -> 0x00ea }
            java.io.File r2 = r6.f5557d     // Catch:{ all -> 0x00ea }
            m4010a((java.io.File) r0, (java.io.File) r2, (boolean) r1)     // Catch:{ all -> 0x00ea }
        L_0x00ba:
            java.io.File r0 = r6.f5556c     // Catch:{ all -> 0x00ea }
            java.io.File r2 = r6.f5555b     // Catch:{ all -> 0x00ea }
            r3 = 0
            m4010a((java.io.File) r0, (java.io.File) r2, (boolean) r3)     // Catch:{ all -> 0x00ea }
            java.io.File r0 = r6.f5557d     // Catch:{ all -> 0x00ea }
            r0.delete()     // Catch:{ all -> 0x00ea }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ea }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ea }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ea }
            java.io.File r4 = r6.f5555b     // Catch:{ all -> 0x00ea }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00ea }
            java.nio.charset.Charset r1 = p030bo.app.C1571f.f5674a     // Catch:{ all -> 0x00ea }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00ea }
            r0.<init>(r2)     // Catch:{ all -> 0x00ea }
            r6.f5562i = r0     // Catch:{ all -> 0x00ea }
            monitor-exit(r6)
            return
        L_0x00de:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ea }
        L_0x00e9:
            throw r2     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1540c.mo5940h():void");
    }

    /* renamed from: i */
    public final void mo5941i() {
        while (this.f5561h > this.f5559f) {
            mo5935d((String) this.f5563j.entrySet().iterator().next().getKey());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f5564k++;
        r11.f5562i.append("READ " + r12 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (mo5937e() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r11.f5566m.submit(r11.f5567n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        return new p030bo.app.C1540c.C1545d(r11, r12, r0.f5589e, r8, r0.f5586b, (p030bo.app.C1540c.C1541a) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p030bo.app.C1540c.C1545d mo5930b(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.mo5931b()     // Catch:{ all -> 0x007f }
            r11.mo5936e((java.lang.String) r12)     // Catch:{ all -> 0x007f }
            java.util.LinkedHashMap<java.lang.String, bo.app.d> r0 = r11.f5563j     // Catch:{ all -> 0x007f }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x007f }
            bo.app.d r0 = (p030bo.app.C1553d) r0     // Catch:{ all -> 0x007f }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f5587c     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r11)
            return r1
        L_0x001a:
            int r2 = r11.f5560g     // Catch:{ all -> 0x007f }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x007f }
            r2 = 0
            r3 = 0
        L_0x0020:
            int r4 = r11.f5560g     // Catch:{ FileNotFoundException -> 0x006f }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006f }
            java.io.File r5 = r0.mo5959a((int) r3)     // Catch:{ FileNotFoundException -> 0x006f }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006f }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006f }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r11.f5564k     // Catch:{ all -> 0x007f }
            int r1 = r1 + 1
            r11.f5564k = r1     // Catch:{ all -> 0x007f }
            java.io.Writer r1 = r11.f5562i     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007f }
            r2.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x007f }
            r2.append(r12)     // Catch:{ all -> 0x007f }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x007f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007f }
            r1.append(r2)     // Catch:{ all -> 0x007f }
            boolean r1 = r11.mo5937e()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r1 = r11.f5566m     // Catch:{ all -> 0x007f }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f5567n     // Catch:{ all -> 0x007f }
            r1.submit(r2)     // Catch:{ all -> 0x007f }
        L_0x0060:
            bo.app.c$d r1 = new bo.app.c$d     // Catch:{ all -> 0x007f }
            long r6 = r0.f5589e     // Catch:{ all -> 0x007f }
            long[] r9 = r0.f5586b     // Catch:{ all -> 0x007f }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x007f }
            monitor-exit(r11)
            return r1
        L_0x006f:
            int r12 = r11.f5560g     // Catch:{ all -> 0x007f }
            if (r2 >= r12) goto L_0x007d
            r12 = r8[r2]     // Catch:{ all -> 0x007f }
            if (r12 == 0) goto L_0x007d
            p030bo.app.C1571f.m4151a((java.io.Closeable) r12)     // Catch:{ all -> 0x007f }
            int r2 = r2 + 1
            goto L_0x006f
        L_0x007d:
            monitor-exit(r11)
            return r1
        L_0x007f:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1540c.mo5930b(java.lang.String):bo.app.c$d");
    }

    /* renamed from: c */
    public final void mo5933c(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f5563j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1553d dVar = this.f5563j.get(str2);
            if (dVar == null) {
                dVar = new C1553d(str2, this.f5560g, this.f5554a);
                this.f5563j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f5587c = true;
                dVar.f5588d = null;
                dVar.mo5963b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f5588d = new C1543c(this, dVar, (C1541a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo5935d(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.mo5931b()     // Catch:{ all -> 0x008a }
            r7.mo5936e((java.lang.String) r8)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, bo.app.d> r0 = r7.f5563j     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            bo.app.d r0 = (p030bo.app.C1553d) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            bo.app.c$c r2 = r0.f5588d     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0017
            goto L_0x0088
        L_0x0017:
            int r2 = r7.f5560g     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0053
            java.io.File r2 = r0.mo5959a((int) r1)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r0.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x0043:
            long r2 = r7.f5561h     // Catch:{ all -> 0x008a }
            long[] r4 = r0.f5586b     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            long r2 = r2 - r5
            r7.f5561h = r2     // Catch:{ all -> 0x008a }
            r2 = 0
            r4[r1] = r2     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0053:
            int r0 = r7.f5564k     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.f5564k = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.f5562i     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r2.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x008a }
            r2.append(r8)     // Catch:{ all -> 0x008a }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, bo.app.d> r0 = r7.f5563j     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.mo5937e()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f5566m     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f5567n     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r7)
            return r1
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1540c.mo5935d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public final boolean mo5937e() {
        int i = this.f5564k;
        return i >= 2000 && i >= this.f5563j.size();
    }

    /* renamed from: f */
    public final void mo5938f() {
        m4009a(this.f5556c);
        Iterator<C1553d> it = this.f5563j.values().iterator();
        while (it.hasNext()) {
            C1553d next = it.next();
            int i = 0;
            if (next.f5588d == null) {
                while (i < this.f5560g) {
                    this.f5561h += next.f5586b[i];
                    i++;
                }
            } else {
                next.f5588d = null;
                while (i < this.f5560g) {
                    m4009a(next.mo5959a(i));
                    m4009a(next.mo5962b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public final void mo5936e(String str) {
        if (!f5551o.matcher(str).matches()) {
            throw new IllegalArgumentException(C13437d.m33706k("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    /* renamed from: a */
    public static C1540c m4005a(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m4010a(file2, file3, false);
                }
            }
            C1540c cVar = new C1540c(file, i, i2, j);
            if (cVar.f5555b.exists()) {
                try {
                    cVar.mo5939g();
                    cVar.mo5938f();
                    return cVar;
                } catch (IOException e) {
                    String str = f5552p;
                    AppboyLogger.m5459w(str, "DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    cVar.mo5934d();
                }
            }
            file.mkdirs();
            C1540c cVar2 = new C1540c(file, i, i2, j);
            cVar2.mo5940h();
            return cVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: b */
    public final void mo5931b() {
        if (this.f5562i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    public void mo5934d() {
        mo5932c();
        C1571f.m4152a(this.f5554a);
    }

    /* renamed from: a */
    public static void m4009a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static void m4010a(File file, File file2, boolean z) {
        if (z) {
            m4009a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public C1543c mo5927a(String str) {
        return mo5928a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p030bo.app.C1540c.C1543c mo5928a(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo5931b()     // Catch:{ all -> 0x0060 }
            r5.mo5936e((java.lang.String) r6)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap<java.lang.String, bo.app.d> r0 = r5.f5563j     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0060 }
            bo.app.d r0 = (p030bo.app.C1553d) r0     // Catch:{ all -> 0x0060 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0020
            if (r0 == 0) goto L_0x001e
            long r1 = r0.f5589e     // Catch:{ all -> 0x0060 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0020
        L_0x001e:
            monitor-exit(r5)
            return r3
        L_0x0020:
            if (r0 != 0) goto L_0x0031
            bo.app.d r0 = new bo.app.d     // Catch:{ all -> 0x0060 }
            int r7 = r5.f5560g     // Catch:{ all -> 0x0060 }
            java.io.File r8 = r5.f5554a     // Catch:{ all -> 0x0060 }
            r0.<init>(r6, r7, r8)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap<java.lang.String, bo.app.d> r7 = r5.f5563j     // Catch:{ all -> 0x0060 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0037
        L_0x0031:
            bo.app.c$c r7 = r0.f5588d     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r3
        L_0x0037:
            bo.app.c$c r7 = new bo.app.c$c     // Catch:{ all -> 0x0060 }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x0060 }
            r0.f5588d = r7     // Catch:{ all -> 0x0060 }
            java.io.Writer r8 = r5.f5562i     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0060 }
            r0.append(r6)     // Catch:{ all -> 0x0060 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0060 }
            r8.write(r6)     // Catch:{ all -> 0x0060 }
            java.io.Writer r6 = r5.f5562i     // Catch:{ all -> 0x0060 }
            r6.flush()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return r7
        L_0x0060:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1540c.mo5928a(java.lang.String, long):bo.app.c$c");
    }

    /* renamed from: c */
    public synchronized void mo5932c() {
        if (this.f5562i != null) {
            Iterator it = new ArrayList(this.f5563j.values()).iterator();
            while (it.hasNext()) {
                C1543c cVar = ((C1553d) it.next()).f5588d;
                if (cVar != null) {
                    cVar.mo5946a();
                }
            }
            mo5941i();
            this.f5562i.close();
            this.f5562i = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f6, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo5929a(p030bo.app.C1540c.C1543c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            bo.app.d r0 = r10.f5569a     // Catch:{ all -> 0x00fd }
            bo.app.c$c r1 = r0.f5588d     // Catch:{ all -> 0x00fd }
            if (r1 != r10) goto L_0x00f7
            r1 = 0
            if (r11 == 0) goto L_0x0049
            boolean r2 = r0.f5587c     // Catch:{ all -> 0x00fd }
            if (r2 != 0) goto L_0x0049
            r2 = 0
        L_0x0011:
            int r3 = r9.f5560g     // Catch:{ all -> 0x00fd }
            if (r2 >= r3) goto L_0x0049
            boolean[] r3 = r10.f5570b     // Catch:{ all -> 0x00fd }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fd }
            if (r3 == 0) goto L_0x002f
            java.io.File r3 = r0.mo5962b((int) r2)     // Catch:{ all -> 0x00fd }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fd }
            if (r3 != 0) goto L_0x002c
            r10.mo5946a()     // Catch:{ all -> 0x00fd }
            monitor-exit(r9)
            return
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x002f:
            r10.mo5946a()     // Catch:{ all -> 0x00fd }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.<init>(r11)     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x0049:
            int r10 = r9.f5560g     // Catch:{ all -> 0x00fd }
            if (r1 >= r10) goto L_0x0079
            java.io.File r10 = r0.mo5962b((int) r1)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x0073
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00fd }
            if (r2 == 0) goto L_0x0076
            java.io.File r2 = r0.mo5959a((int) r1)     // Catch:{ all -> 0x00fd }
            r10.renameTo(r2)     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.f5586b     // Catch:{ all -> 0x00fd }
            r3 = r10[r1]     // Catch:{ all -> 0x00fd }
            long r5 = r2.length()     // Catch:{ all -> 0x00fd }
            long[] r10 = r0.f5586b     // Catch:{ all -> 0x00fd }
            r10[r1] = r5     // Catch:{ all -> 0x00fd }
            long r7 = r9.f5561h     // Catch:{ all -> 0x00fd }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f5561h = r7     // Catch:{ all -> 0x00fd }
            goto L_0x0076
        L_0x0073:
            m4009a((java.io.File) r10)     // Catch:{ all -> 0x00fd }
        L_0x0076:
            int r1 = r1 + 1
            goto L_0x0049
        L_0x0079:
            int r10 = r9.f5564k     // Catch:{ all -> 0x00fd }
            r1 = 1
            int r10 = r10 + r1
            r9.f5564k = r10     // Catch:{ all -> 0x00fd }
            r10 = 0
            r0.f5588d = r10     // Catch:{ all -> 0x00fd }
            boolean r10 = r0.f5587c     // Catch:{ all -> 0x00fd }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b9
            r0.f5587c = r1     // Catch:{ all -> 0x00fd }
            java.io.Writer r10 = r9.f5562i     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r1.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r0.f5585a     // Catch:{ all -> 0x00fd }
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r0.mo5961a()     // Catch:{ all -> 0x00fd }
            r1.append(r3)     // Catch:{ all -> 0x00fd }
            r1.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fd }
            r10.write(r1)     // Catch:{ all -> 0x00fd }
            if (r11 == 0) goto L_0x00db
            long r10 = r9.f5565l     // Catch:{ all -> 0x00fd }
            r1 = 1
            long r1 = r1 + r10
            r9.f5565l = r1     // Catch:{ all -> 0x00fd }
            r0.f5589e = r10     // Catch:{ all -> 0x00fd }
            goto L_0x00db
        L_0x00b9:
            java.util.LinkedHashMap<java.lang.String, bo.app.d> r10 = r9.f5563j     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r0.f5585a     // Catch:{ all -> 0x00fd }
            r10.remove(r11)     // Catch:{ all -> 0x00fd }
            java.io.Writer r10 = r9.f5562i     // Catch:{ all -> 0x00fd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r11.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r0.f5585a     // Catch:{ all -> 0x00fd }
            r11.append(r0)     // Catch:{ all -> 0x00fd }
            r11.append(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fd }
            r10.write(r11)     // Catch:{ all -> 0x00fd }
        L_0x00db:
            java.io.Writer r10 = r9.f5562i     // Catch:{ all -> 0x00fd }
            r10.flush()     // Catch:{ all -> 0x00fd }
            long r10 = r9.f5561h     // Catch:{ all -> 0x00fd }
            long r0 = r9.f5559f     // Catch:{ all -> 0x00fd }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ee
            boolean r10 = r9.mo5937e()     // Catch:{ all -> 0x00fd }
            if (r10 == 0) goto L_0x00f5
        L_0x00ee:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f5566m     // Catch:{ all -> 0x00fd }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f5567n     // Catch:{ all -> 0x00fd }
            r10.submit(r11)     // Catch:{ all -> 0x00fd }
        L_0x00f5:
            monitor-exit(r9)
            return
        L_0x00f7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fd }
            r10.<init>()     // Catch:{ all -> 0x00fd }
            throw r10     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1540c.mo5929a(bo.app.c$c, boolean):void");
    }
}
