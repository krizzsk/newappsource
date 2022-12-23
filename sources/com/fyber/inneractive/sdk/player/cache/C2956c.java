package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.player.cache.c */
public final class C2956c implements Closeable {

    /* renamed from: p */
    public static final Pattern f10118p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: q */
    public static final OutputStream f10119q = new C2958b();

    /* renamed from: a */
    public final File f10120a;

    /* renamed from: b */
    public final File f10121b;

    /* renamed from: c */
    public final File f10122c;

    /* renamed from: d */
    public final File f10123d;

    /* renamed from: e */
    public final int f10124e;

    /* renamed from: f */
    public long f10125f;

    /* renamed from: g */
    public final int f10126g;

    /* renamed from: h */
    public long f10127h = 0;

    /* renamed from: i */
    public Writer f10128i;

    /* renamed from: j */
    public final LinkedHashMap<String, C2961d> f10129j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: k */
    public int f10130k;

    /* renamed from: l */
    public C2962e f10131l;

    /* renamed from: m */
    public long f10132m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f10133n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o */
    public final Callable<Void> f10134o = new C2957a();

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$a */
    public class C2957a implements Callable<Void> {
        public C2957a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call() throws java.lang.Exception {
            /*
                r3 = this;
                com.fyber.inneractive.sdk.player.cache.c r0 = com.fyber.inneractive.sdk.player.cache.C2956c.this
                monitor-enter(r0)
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C2956c.this     // Catch:{ all -> 0x0023 }
                java.io.Writer r2 = r1.f10128i     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.mo13766f()     // Catch:{ all -> 0x0023 }
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C2956c.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.mo13758b()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C2956c.this     // Catch:{ all -> 0x0023 }
                r1.mo13764e()     // Catch:{ all -> 0x0023 }
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C2956c.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f10130k = r2     // Catch:{ all -> 0x0023 }
            L_0x0020:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            L_0x0021:
                r0 = 0
                return r0
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2956c.C2957a.call():java.lang.Object");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$b */
    public class C2958b extends OutputStream {
        public void write(int i) throws IOException {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$c */
    public final class C2959c {

        /* renamed from: a */
        public final C2961d f10136a;

        /* renamed from: b */
        public final boolean[] f10137b;

        /* renamed from: c */
        public boolean f10138c;

        public C2959c(C2961d dVar) {
            boolean[] zArr;
            this.f10136a = dVar;
            if (dVar.f10143c) {
                zArr = null;
            } else {
                zArr = new boolean[C2956c.this.f10126g];
            }
            this.f10137b = zArr;
        }

        /* renamed from: com.fyber.inneractive.sdk.player.cache.c$c$a */
        public class C2960a extends FilterOutputStream {
            public C2960a(OutputStream outputStream) {
                super(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    boolean unused2 = C2959c.this.f10138c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    boolean unused2 = C2959c.this.f10138c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    boolean unused2 = C2959c.this.f10138c = true;
                }
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    boolean unused2 = C2959c.this.f10138c = true;
                }
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0022 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo13769a(int r5) throws java.io.IOException {
            /*
                r4 = this;
                if (r5 < 0) goto L_0x0042
                com.fyber.inneractive.sdk.player.cache.c r0 = com.fyber.inneractive.sdk.player.cache.C2956c.this
                int r1 = r0.f10126g
                if (r5 >= r1) goto L_0x0042
                monitor-enter(r0)
                com.fyber.inneractive.sdk.player.cache.c$d r1 = r4.f10136a     // Catch:{ all -> 0x003f }
                com.fyber.inneractive.sdk.player.cache.c$c r2 = r1.f10144d     // Catch:{ all -> 0x003f }
                if (r2 != r4) goto L_0x0039
                boolean r2 = r1.f10143c     // Catch:{ all -> 0x003f }
                if (r2 != 0) goto L_0x0018
                boolean[] r2 = r4.f10137b     // Catch:{ all -> 0x003f }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x003f }
            L_0x0018:
                java.io.File r5 = r1.mo13777b(r5)     // Catch:{ all -> 0x003f }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0022 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0022 }
                goto L_0x002e
            L_0x0022:
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C2956c.this     // Catch:{ all -> 0x003f }
                java.io.File r1 = r1.f10120a     // Catch:{ all -> 0x003f }
                r1.mkdirs()     // Catch:{ all -> 0x003f }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0035 }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0035 }
            L_0x002e:
                com.fyber.inneractive.sdk.player.cache.c$c$a r5 = new com.fyber.inneractive.sdk.player.cache.c$c$a     // Catch:{ all -> 0x003f }
                r5.<init>(r1)     // Catch:{ all -> 0x003f }
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return r5
            L_0x0035:
                java.io.OutputStream r5 = com.fyber.inneractive.sdk.player.cache.C2956c.f10119q     // Catch:{ all -> 0x003f }
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                return r5
            L_0x0039:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003f }
                r5.<init>()     // Catch:{ all -> 0x003f }
                throw r5     // Catch:{ all -> 0x003f }
            L_0x003f:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                throw r5
            L_0x0042:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected index "
                java.lang.String r2 = " to be greater than 0 and less than the maximum value count of "
                java.lang.StringBuilder r5 = p379.C25541a.m63887r(r1, r5, r2)
                com.fyber.inneractive.sdk.player.cache.c r1 = com.fyber.inneractive.sdk.player.cache.C2956c.this
                int r1 = r1.f10126g
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2956c.C2959c.mo13769a(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo13770a() throws IOException {
            C2956c.m7293a(C2956c.this, this, false);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$e */
    public interface C2962e {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$f */
    public final class C2963f implements Closeable {

        /* renamed from: a */
        public final InputStream[] f10147a;

        public C2963f(C2956c cVar, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f10147a = inputStreamArr;
        }

        public void close() {
            for (InputStream a : this.f10147a) {
                C2985m.m7338a((Closeable) a);
            }
        }
    }

    public C2956c(File file, int i, int i2, long j) {
        File file2 = file;
        this.f10120a = file2;
        this.f10124e = i;
        this.f10121b = new File(file2, DiskLruCache.JOURNAL_FILE);
        this.f10122c = new File(file2, DiskLruCache.JOURNAL_FILE_TMP);
        this.f10123d = new File(file2, "journal.bkp");
        this.f10126g = i2;
        this.f10125f = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r10.f10130k++;
        r10.f10128i.append("READ " + r11 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (mo13758b() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r10.f10133n.submit(r10.f10134o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        return new com.fyber.inneractive.sdk.player.cache.C2956c.C2963f(r10, r11, r0.f10145e, r8, r0.f10142b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.fyber.inneractive.sdk.player.cache.C2956c.C2963f mo13757b(java.lang.String r11) throws java.io.IOException {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.mo13756a()     // Catch:{ all -> 0x007e }
            r10.mo13765e(r11)     // Catch:{ all -> 0x007e }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r0 = r10.f10129j     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x007e }
            com.fyber.inneractive.sdk.player.cache.c$d r0 = (com.fyber.inneractive.sdk.player.cache.C2956c.C2961d) r0     // Catch:{ all -> 0x007e }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r10)
            return r1
        L_0x0014:
            boolean r2 = r0.f10143c     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r10)
            return r1
        L_0x001a:
            int r2 = r10.f10126g     // Catch:{ all -> 0x007e }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x007e }
            r2 = 0
            r3 = 0
        L_0x0020:
            int r4 = r10.f10126g     // Catch:{ FileNotFoundException -> 0x006e }
            if (r3 >= r4) goto L_0x0032
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006e }
            java.io.File r5 = r0.mo13775a((int) r3)     // Catch:{ FileNotFoundException -> 0x006e }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x006e }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x006e }
            int r3 = r3 + 1
            goto L_0x0020
        L_0x0032:
            int r1 = r10.f10130k     // Catch:{ all -> 0x007e }
            int r1 = r1 + 1
            r10.f10130k = r1     // Catch:{ all -> 0x007e }
            java.io.Writer r1 = r10.f10128i     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r2.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x007e }
            r2.append(r11)     // Catch:{ all -> 0x007e }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x007e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007e }
            r1.append(r2)     // Catch:{ all -> 0x007e }
            boolean r1 = r10.mo13758b()     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0060
            java.util.concurrent.ThreadPoolExecutor r1 = r10.f10133n     // Catch:{ all -> 0x007e }
            java.util.concurrent.Callable<java.lang.Void> r2 = r10.f10134o     // Catch:{ all -> 0x007e }
            r1.submit(r2)     // Catch:{ all -> 0x007e }
        L_0x0060:
            com.fyber.inneractive.sdk.player.cache.c$f r1 = new com.fyber.inneractive.sdk.player.cache.c$f     // Catch:{ all -> 0x007e }
            long r6 = r0.f10145e     // Catch:{ all -> 0x007e }
            long[] r9 = r0.f10142b     // Catch:{ all -> 0x007e }
            r3 = r1
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r8, r9)     // Catch:{ all -> 0x007e }
            monitor-exit(r10)
            return r1
        L_0x006e:
            int r11 = r10.f10126g     // Catch:{ all -> 0x007e }
            if (r2 >= r11) goto L_0x007c
            r11 = r8[r2]     // Catch:{ all -> 0x007e }
            if (r11 == 0) goto L_0x007c
            com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r11)     // Catch:{ all -> 0x007e }
            int r2 = r2 + 1
            goto L_0x006e
        L_0x007c:
            monitor-exit(r10)
            return r1
        L_0x007e:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2956c.mo13757b(java.lang.String):com.fyber.inneractive.sdk.player.cache.c$f");
    }

    /* renamed from: c */
    public final void mo13760c(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f10129j.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C2961d dVar = this.f10129j.get(str2);
            if (dVar == null) {
                dVar = new C2961d(str2);
                this.f10129j.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f10143c = true;
                dVar.f10144d = null;
                if (split.length == C2956c.this.f10126g) {
                    int i2 = 0;
                    while (i2 < split.length) {
                        try {
                            dVar.f10142b[i2] = Long.parseLong(split[i2]);
                            i2++;
                        } catch (NumberFormatException unused2) {
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
                dVar.f10144d = new C2959c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
        }
    }

    public synchronized void close() throws IOException {
        if (this.f10128i != null) {
            Iterator it = new ArrayList(this.f10129j.values()).iterator();
            while (it.hasNext()) {
                C2959c cVar = ((C2961d) it.next()).f10144d;
                if (cVar != null) {
                    cVar.mo13770a();
                }
            }
            mo13766f();
            this.f10128i.close();
            this.f10128i = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|(1:19)|(1:21)(1:22)|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f10130k = r2 - r9.f10129j.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r1.f10208e == -1) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r0 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        mo13764e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r9.f10128i = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f10121b, true), com.fyber.inneractive.sdk.player.cache.C2985m.f10210a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0090, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x0091=Splitter:B:25:0x0091, B:16:0x0062=Splitter:B:16:0x0062} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13762d() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.fyber.inneractive.sdk.player.cache.l r1 = new com.fyber.inneractive.sdk.player.cache.l
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f10121b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.fyber.inneractive.sdk.player.cache.C2985m.f10210a
            r4 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2, r4, r3)
            java.lang.String r2 = r1.mo13799b()     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = r1.mo13799b()     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = r1.mo13799b()     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = r1.mo13799b()     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = r1.mo13799b()     // Catch:{ all -> 0x00c0 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00c0 }
            if (r7 == 0) goto L_0x0091
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00c0 }
            if (r7 == 0) goto L_0x0091
            int r7 = r9.f10124e     // Catch:{ all -> 0x00c0 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00c0 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x0091
            int r4 = r9.f10126g     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00c0 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x0091
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x0091
            r0 = 0
            r2 = 0
        L_0x0058:
            java.lang.String r3 = r1.mo13799b()     // Catch:{ EOFException -> 0x0062 }
            r9.mo13760c(r3)     // Catch:{ EOFException -> 0x0062 }
            int r2 = r2 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r3 = r9.f10129j     // Catch:{ all -> 0x00c0 }
            int r3 = r3.size()     // Catch:{ all -> 0x00c0 }
            int r2 = r2 - r3
            r9.f10130k = r2     // Catch:{ all -> 0x00c0 }
            int r2 = r1.f10208e     // Catch:{ all -> 0x00c0 }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0072
            r0 = 1
        L_0x0072:
            if (r0 == 0) goto L_0x0078
            r9.mo13764e()     // Catch:{ all -> 0x00c0 }
            goto L_0x008d
        L_0x0078:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00c0 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00c0 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c0 }
            java.io.File r5 = r9.f10121b     // Catch:{ all -> 0x00c0 }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x00c0 }
            java.nio.charset.Charset r4 = com.fyber.inneractive.sdk.player.cache.C2985m.f10210a     // Catch:{ all -> 0x00c0 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00c0 }
            r0.<init>(r2)     // Catch:{ all -> 0x00c0 }
            r9.f10128i = r0     // Catch:{ all -> 0x00c0 }
        L_0x008d:
            com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r1)
            return
        L_0x0091:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r7.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00c0 }
            r7.append(r2)     // Catch:{ all -> 0x00c0 }
            r7.append(r0)     // Catch:{ all -> 0x00c0 }
            r7.append(r3)     // Catch:{ all -> 0x00c0 }
            r7.append(r0)     // Catch:{ all -> 0x00c0 }
            r7.append(r5)     // Catch:{ all -> 0x00c0 }
            r7.append(r0)     // Catch:{ all -> 0x00c0 }
            r7.append(r6)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00c0 }
            r4.<init>(r0)     // Catch:{ all -> 0x00c0 }
            throw r4     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2956c.mo13762d():void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final synchronized void mo13764e() throws IOException {
        Writer writer = this.f10128i;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10122c), C2985m.f10210a));
        try {
            bufferedWriter.write(DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write(DiskLruCache.VERSION_1);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10124e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10126g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C2961d next : this.f10129j.values()) {
                if (next.f10144d != null) {
                    bufferedWriter.write("DIRTY " + next.f10141a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f10141a + next.mo13776a() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f10121b.exists()) {
                m7295a(this.f10121b, this.f10123d, true);
            }
            m7295a(this.f10122c, this.f10121b, false);
            this.f10123d.delete();
            this.f10128i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10121b, true), C2985m.f10210a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo13766f() throws IOException {
        while (this.f10127h > this.f10125f) {
            String str = (String) this.f10129j.entrySet().iterator().next().getKey();
            C2962e eVar = this.f10131l;
            if (eVar == null) {
                mo13763d(str);
            } else if (((C2986n) eVar).mo13803a(this, str)) {
                mo13763d(str);
            } else {
                boolean z = false;
                for (String next : this.f10129j.keySet()) {
                    if (((C2986n) this.f10131l).mo13803a(this, next)) {
                        z |= mo13763d(next);
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$d */
    public final class C2961d {

        /* renamed from: a */
        public final String f10141a;

        /* renamed from: b */
        public final long[] f10142b;

        /* renamed from: c */
        public boolean f10143c;

        /* renamed from: d */
        public C2959c f10144d;

        /* renamed from: e */
        public long f10145e;

        public C2961d(String str) {
            this.f10141a = str;
            this.f10142b = new long[C2956c.this.f10126g];
        }

        /* renamed from: b */
        public File mo13777b(int i) {
            File file = C2956c.this.f10120a;
            return new File(file, this.f10141a + "." + i + ".tmp");
        }

        /* renamed from: a */
        public String mo13776a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f10142b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: a */
        public File mo13775a(int i) {
            File file = C2956c.this.f10120a;
            return new File(file, this.f10141a + "." + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7293a(com.fyber.inneractive.sdk.player.cache.C2956c r9, com.fyber.inneractive.sdk.player.cache.C2956c.C2959c r10, boolean r11) throws java.io.IOException {
        /*
            monitor-enter(r9)
            com.fyber.inneractive.sdk.player.cache.c$d r0 = r10.f10136a     // Catch:{ all -> 0x00fb }
            com.fyber.inneractive.sdk.player.cache.c$c r1 = r0.f10144d     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f10143c     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0046
            r2 = 0
        L_0x000f:
            int r3 = r9.f10126g     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f10137b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002c
            java.io.File r3 = r0.mo13777b(r2)     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x0029
            r10.mo13770a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            goto L_0x00f4
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.mo13770a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0046:
            int r10 = r9.f10126g     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x0076
            java.io.File r10 = r0.mo13777b(r1)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x0073
            java.io.File r2 = r0.mo13775a((int) r1)     // Catch:{ all -> 0x00fb }
            r10.renameTo(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f10142b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            long r5 = r2.length()     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f10142b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f10127h     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f10127h = r7     // Catch:{ all -> 0x00fb }
            goto L_0x0073
        L_0x0070:
            m7294a((java.io.File) r10)     // Catch:{ all -> 0x00fb }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.f10130k     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f10130k = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f10144d = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f10143c     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b7
            boolean unused = r0.f10143c = r1     // Catch:{ all -> 0x00fb }
            java.io.Writer r10 = r9.f10128i     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r1.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = r0.f10141a     // Catch:{ all -> 0x00fb }
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = r0.mo13776a()     // Catch:{ all -> 0x00fb }
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            r1.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fb }
            r10.write(r1)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f10132m     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f10132m = r1     // Catch:{ all -> 0x00fb }
            r0.f10145e = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00b7:
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r10 = r9.f10129j     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f10141a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            java.io.Writer r10 = r9.f10128i     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r0.f10141a     // Catch:{ all -> 0x00fb }
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.write(r11)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            java.io.Writer r10 = r9.f10128i     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f10127h     // Catch:{ all -> 0x00fb }
            long r0 = r9.f10125f     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo13758b()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f10133n     // Catch:{ all -> 0x00fb }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f10134o     // Catch:{ all -> 0x00fb }
            r10.submit(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
        L_0x00f4:
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
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2956c.m7293a(com.fyber.inneractive.sdk.player.cache.c, com.fyber.inneractive.sdk.player.cache.c$c, boolean):void");
    }

    /* renamed from: b */
    public final boolean mo13758b() {
        int i = this.f10130k;
        return i >= 2000 && i >= this.f10129j.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        return false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo13763d(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0093 }
            r2 = 0
            r1[r2] = r9     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "DiskLruCache remove %s"
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r3, r1)     // Catch:{ all -> 0x0093 }
            r8.mo13756a()     // Catch:{ all -> 0x0093 }
            r8.mo13765e(r9)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r1 = r8.f10129j     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0093 }
            com.fyber.inneractive.sdk.player.cache.c$d r1 = (com.fyber.inneractive.sdk.player.cache.C2956c.C2961d) r1     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0091
            com.fyber.inneractive.sdk.player.cache.c$c r3 = r1.f10144d     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x0021
            goto L_0x0091
        L_0x0021:
            int r3 = r8.f10126g     // Catch:{ all -> 0x0093 }
            if (r2 >= r3) goto L_0x005d
            java.io.File r3 = r1.mo13775a((int) r2)     // Catch:{ all -> 0x0093 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0093 }
            if (r4 == 0) goto L_0x004d
            boolean r4 = r3.delete()     // Catch:{ all -> 0x0093 }
            if (r4 == 0) goto L_0x0036
            goto L_0x004d
        L_0x0036:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0093 }
            r0.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0093 }
            r9.<init>(r0)     // Catch:{ all -> 0x0093 }
            throw r9     // Catch:{ all -> 0x0093 }
        L_0x004d:
            long r3 = r8.f10127h     // Catch:{ all -> 0x0093 }
            long[] r5 = r1.f10142b     // Catch:{ all -> 0x0093 }
            r6 = r5[r2]     // Catch:{ all -> 0x0093 }
            long r3 = r3 - r6
            r8.f10127h = r3     // Catch:{ all -> 0x0093 }
            r3 = 0
            r5[r2] = r3     // Catch:{ all -> 0x0093 }
            int r2 = r2 + 1
            goto L_0x0021
        L_0x005d:
            int r1 = r8.f10130k     // Catch:{ all -> 0x0093 }
            int r1 = r1 + r0
            r8.f10130k = r1     // Catch:{ all -> 0x0093 }
            java.io.Writer r1 = r8.f10128i     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r2.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            r2.append(r9)     // Catch:{ all -> 0x0093 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0093 }
            r1.append(r2)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r1 = r8.f10129j     // Catch:{ all -> 0x0093 }
            r1.remove(r9)     // Catch:{ all -> 0x0093 }
            boolean r9 = r8.mo13758b()     // Catch:{ all -> 0x0093 }
            if (r9 == 0) goto L_0x008f
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f10133n     // Catch:{ all -> 0x0093 }
            java.util.concurrent.Callable<java.lang.Void> r1 = r8.f10134o     // Catch:{ all -> 0x0093 }
            r9.submit(r1)     // Catch:{ all -> 0x0093 }
        L_0x008f:
            monitor-exit(r8)
            return r0
        L_0x0091:
            monitor-exit(r8)
            return r2
        L_0x0093:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2956c.mo13763d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public final void mo13765e(String str) {
        if (!f10118p.matcher(str).matches()) {
            throw new IllegalArgumentException(C13437d.m33706k("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    /* renamed from: a */
    public static C2956c m7292a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m7295a(file2, file3, false);
                }
            }
            C2956c cVar = new C2956c(file, i, i2, j);
            if (cVar.f10121b.exists()) {
                try {
                    cVar.mo13762d();
                    cVar.mo13759c();
                    return cVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    IAlog.m9905d("DiskLruCache delete cache", new Object[0]);
                    cVar.close();
                    C2985m.m7339a(cVar.f10120a);
                }
            }
            file.mkdirs();
            C2956c cVar2 = new C2956c(file, i, i2, j);
            cVar2.mo13764e();
            return cVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: c */
    public final void mo13759c() throws IOException {
        m7294a(this.f10122c);
        Iterator<C2961d> it = this.f10129j.values().iterator();
        while (it.hasNext()) {
            C2961d next = it.next();
            int i = 0;
            if (next.f10144d == null) {
                while (i < this.f10126g) {
                    this.f10127h += next.f10142b[i];
                    i++;
                }
            } else {
                next.f10144d = null;
                while (i < this.f10126g) {
                    m7294a(next.mo13775a(i));
                    m7294a(next.mo13777b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static void m7294a(File file) throws IOException {
        IAlog.m9905d("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static void m7295a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m7294a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public File mo13755a(String str, int i) {
        mo13756a();
        mo13765e(str);
        C2961d dVar = this.f10129j.get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.mo13775a(i);
    }

    /* renamed from: a */
    public C2959c mo13754a(String str) throws IOException {
        synchronized (this) {
            mo13756a();
            mo13765e(str);
            C2961d dVar = this.f10129j.get(str);
            if (dVar == null) {
                dVar = new C2961d(str);
                this.f10129j.put(str, dVar);
            } else if (dVar.f10144d != null) {
                return null;
            }
            C2959c cVar = new C2959c(dVar);
            dVar.f10144d = cVar;
            Writer writer = this.f10128i;
            writer.write("DIRTY " + str + 10);
            this.f10128i.flush();
            return cVar;
        }
    }

    /* renamed from: a */
    public final void mo13756a() {
        if (this.f10128i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }
}
