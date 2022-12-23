package p535hi;

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
import java.nio.charset.Charset;
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

/* renamed from: hi.a */
public final class C17437a implements Closeable {

    /* renamed from: p */
    public static final Pattern f44910p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: q */
    public static final C17439b f44911q = new C17439b();

    /* renamed from: b */
    public final File f44912b;

    /* renamed from: c */
    public final File f44913c;

    /* renamed from: d */
    public final File f44914d;

    /* renamed from: e */
    public final File f44915e;

    /* renamed from: f */
    public final int f44916f;

    /* renamed from: g */
    public long f44917g;

    /* renamed from: h */
    public final int f44918h;

    /* renamed from: i */
    public long f44919i = 0;

    /* renamed from: j */
    public BufferedWriter f44920j;

    /* renamed from: k */
    public final LinkedHashMap<String, C17442d> f44921k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    public int f44922l;

    /* renamed from: m */
    public long f44923m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f44924n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o */
    public final C17438a f44925o = new C17438a();

    /* renamed from: hi.a$a */
    public class C17438a implements Callable<Void> {
        public C17438a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() throws java.lang.Exception {
            /*
                r3 = this;
                hi.a r0 = p535hi.C17437a.this
                monitor-enter(r0)
                hi.a r1 = p535hi.C17437a.this     // Catch:{ all -> 0x0023 }
                java.io.BufferedWriter r2 = r1.f44920j     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.mo49903z()     // Catch:{ all -> 0x0023 }
                hi.a r1 = p535hi.C17437a.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.mo49897i()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                hi.a r1 = p535hi.C17437a.this     // Catch:{ all -> 0x0023 }
                r1.mo49901v()     // Catch:{ all -> 0x0023 }
                hi.a r1 = p535hi.C17437a.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f44922l = r2     // Catch:{ all -> 0x0023 }
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
            throw new UnsupportedOperationException("Method not decompiled: p535hi.C17437a.C17438a.call():java.lang.Object");
        }
    }

    /* renamed from: hi.a$b */
    public static class C17439b extends OutputStream {
        public final void write(int i) throws IOException {
        }
    }

    /* renamed from: hi.a$d */
    public final class C17442d {

        /* renamed from: a */
        public final String f44932a;

        /* renamed from: b */
        public final long[] f44933b;

        /* renamed from: c */
        public boolean f44934c;

        /* renamed from: d */
        public C17440c f44935d;

        public C17442d(String str) {
            this.f44932a = str;
            this.f44933b = new long[C17437a.this.f44918h];
        }

        /* renamed from: a */
        public final File mo49913a(int i) {
            File file = C17437a.this.f44912b;
            return new File(file, this.f44932a + "." + i);
        }

        /* renamed from: b */
        public final File mo49914b(int i) {
            File file = C17437a.this.f44912b;
            return new File(file, this.f44932a + "." + i + ".tmp");
        }

        /* renamed from: c */
        public final String mo49915c() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f44933b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    /* renamed from: hi.a$e */
    public final class C17443e implements Closeable {

        /* renamed from: b */
        public final InputStream[] f44937b;

        /* renamed from: c */
        public final long[] f44938c;

        public C17443e(InputStream[] inputStreamArr, long[] jArr) {
            this.f44937b = inputStreamArr;
            this.f44938c = jArr;
        }

        public final void close() {
            for (InputStream inputStream : this.f44937b) {
                Charset charset = C17446c.f44945a;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public C17437a(File file, long j) {
        File file2 = file;
        this.f44912b = file2;
        this.f44916f = 1;
        this.f44913c = new File(file2, DiskLruCache.JOURNAL_FILE);
        this.f44914d = new File(file2, DiskLruCache.JOURNAL_FILE_TMP);
        this.f44915e = new File(file2, "journal.bkp");
        this.f44918h = 1;
        this.f44917g = j;
    }

    /* renamed from: A */
    public static void m43475A(String str) {
        if (!f44910p.matcher(str).matches()) {
            throw new IllegalArgumentException(C13437d.m33706k("keys must match regex [a-z0-9_-]{1,64}: \"", str, "\""));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m43476a(p535hi.C17437a r9, p535hi.C17437a.C17440c r10, boolean r11) throws java.io.IOException {
        /*
            monitor-enter(r9)
            hi.a$d r0 = r10.f44927a     // Catch:{ all -> 0x00fb }
            hi.a$c r1 = r0.f44935d     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f44934c     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0046
            r2 = 0
        L_0x000f:
            int r3 = r9.f44918h     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f44928b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002c
            java.io.File r3 = r0.mo49914b(r2)     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x0029
            r10.mo49906a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            goto L_0x00f4
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.mo49906a()     // Catch:{ all -> 0x00fb }
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
            int r10 = r9.f44918h     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x0076
            java.io.File r10 = r0.mo49914b(r1)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x0073
            java.io.File r2 = r0.mo49913a(r1)     // Catch:{ all -> 0x00fb }
            r10.renameTo(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f44933b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            long r5 = r2.length()     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f44933b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f44919i     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f44919i = r7     // Catch:{ all -> 0x00fb }
            goto L_0x0073
        L_0x0070:
            m43477c(r10)     // Catch:{ all -> 0x00fb }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.f44922l     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f44922l = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f44935d = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f44934c     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b7
            r0.f44934c = r1     // Catch:{ all -> 0x00fb }
            java.io.BufferedWriter r10 = r9.f44920j     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r1.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = r0.f44932a     // Catch:{ all -> 0x00fb }
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = r0.mo49915c()     // Catch:{ all -> 0x00fb }
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            r1.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fb }
            r10.write(r1)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f44923m     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r10 = r10 + r1
            r9.f44923m = r10     // Catch:{ all -> 0x00fb }
            r0.getClass()     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00b7:
            java.util.LinkedHashMap<java.lang.String, hi.a$d> r10 = r9.f44921k     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f44932a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            java.io.BufferedWriter r10 = r9.f44920j     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r0.f44932a     // Catch:{ all -> 0x00fb }
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.write(r11)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            java.io.BufferedWriter r10 = r9.f44920j     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f44919i     // Catch:{ all -> 0x00fb }
            long r0 = r9.f44917g     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo49897i()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f44924n     // Catch:{ all -> 0x00fb }
            hi.a$a r11 = r9.f44925o     // Catch:{ all -> 0x00fb }
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
        throw new UnsupportedOperationException("Method not decompiled: p535hi.C17437a.m43476a(hi.a, hi.a$c, boolean):void");
    }

    /* renamed from: c */
    public static void m43477c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: j */
    public static C17437a m43478j(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m43479x(file2, file3, false);
                }
            }
            C17437a aVar = new C17437a(file, j);
            if (aVar.f44913c.exists()) {
                try {
                    aVar.mo49899r();
                    aVar.mo49898q();
                    aVar.f44920j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f44913c, true), C17446c.f44945a));
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.close();
                    C17446c.m43496a(aVar.f44912b);
                }
            }
            file.mkdirs();
            C17437a aVar2 = new C17437a(file, j);
            aVar2.mo49901v();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: x */
    public static void m43479x(File file, File file2, boolean z) throws IOException {
        if (z) {
            m43477c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f44920j != null) {
            Iterator it = new ArrayList(this.f44921k.values()).iterator();
            while (it.hasNext()) {
                C17440c cVar = ((C17442d) it.next()).f44935d;
                if (cVar != null) {
                    cVar.mo49906a();
                }
            }
            mo49903z();
            this.f44920j.close();
            this.f44920j = null;
        }
    }

    /* renamed from: e */
    public final C17440c mo49895e(String str) throws IOException {
        C17440c cVar;
        synchronized (this) {
            if (this.f44920j != null) {
                m43475A(str);
                C17442d dVar = this.f44921k.get(str);
                cVar = null;
                if (dVar == null) {
                    dVar = new C17442d(str);
                    this.f44921k.put(str, dVar);
                } else if (dVar.f44935d != null) {
                }
                cVar = new C17440c(dVar);
                dVar.f44935d = cVar;
                BufferedWriter bufferedWriter = this.f44920j;
                bufferedWriter.write("DIRTY " + str + 10);
                this.f44920j.flush();
            } else {
                throw new IllegalStateException("cache is closed");
            }
        }
        return cVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:34|(3:35|36|52)|37|30|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.f44922l++;
        r7.f44920j.append("READ " + r8 + 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (mo49897i() == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f44924n.submit(r7.f44925o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        return new p535hi.C17437a.C17443e(r2, r0.f44933b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007d, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006a */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072 A[Catch:{ RuntimeException -> 0x007a, Exception -> 0x0077 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p535hi.C17437a.C17443e mo49896f(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            java.io.BufferedWriter r0 = r7.f44920j     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x0080
            m43475A(r8)     // Catch:{ all -> 0x007e }
            java.util.LinkedHashMap<java.lang.String, hi.a$d> r0 = r7.f44921k     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x007e }
            hi.a$d r0 = (p535hi.C17437a.C17442d) r0     // Catch:{ all -> 0x007e }
            r1 = 0
            if (r0 != 0) goto L_0x0015
            monitor-exit(r7)
            return r1
        L_0x0015:
            boolean r2 = r0.f44934c     // Catch:{ all -> 0x007e }
            if (r2 != 0) goto L_0x001b
            monitor-exit(r7)
            return r1
        L_0x001b:
            int r2 = r7.f44918h     // Catch:{ all -> 0x007e }
            java.io.InputStream[] r2 = new java.io.InputStream[r2]     // Catch:{ all -> 0x007e }
            r3 = 0
            r4 = 0
        L_0x0021:
            int r5 = r7.f44918h     // Catch:{ FileNotFoundException -> 0x006a }
            if (r4 >= r5) goto L_0x0033
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006a }
            java.io.File r6 = r0.mo49913a(r4)     // Catch:{ FileNotFoundException -> 0x006a }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x006a }
            r2[r4] = r5     // Catch:{ FileNotFoundException -> 0x006a }
            int r4 = r4 + 1
            goto L_0x0021
        L_0x0033:
            int r1 = r7.f44922l     // Catch:{ all -> 0x007e }
            int r1 = r1 + 1
            r7.f44922l = r1     // Catch:{ all -> 0x007e }
            java.io.BufferedWriter r1 = r7.f44920j     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r3.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "READ "
            r3.append(r4)     // Catch:{ all -> 0x007e }
            r3.append(r8)     // Catch:{ all -> 0x007e }
            r8 = 10
            r3.append(r8)     // Catch:{ all -> 0x007e }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x007e }
            r1.append(r8)     // Catch:{ all -> 0x007e }
            boolean r8 = r7.mo49897i()     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x0061
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f44924n     // Catch:{ all -> 0x007e }
            hi.a$a r1 = r7.f44925o     // Catch:{ all -> 0x007e }
            r8.submit(r1)     // Catch:{ all -> 0x007e }
        L_0x0061:
            hi.a$e r8 = new hi.a$e     // Catch:{ all -> 0x007e }
            long[] r0 = r0.f44933b     // Catch:{ all -> 0x007e }
            r8.<init>(r2, r0)     // Catch:{ all -> 0x007e }
            monitor-exit(r7)
            return r8
        L_0x006a:
            int r8 = r7.f44918h     // Catch:{ all -> 0x007e }
            if (r3 >= r8) goto L_0x007c
            r8 = r2[r3]     // Catch:{ all -> 0x007e }
            if (r8 == 0) goto L_0x007c
            java.nio.charset.Charset r0 = p535hi.C17446c.f44945a     // Catch:{ all -> 0x007e }
            r8.close()     // Catch:{ RuntimeException -> 0x007a, Exception -> 0x0077 }
        L_0x0077:
            int r3 = r3 + 1
            goto L_0x006a
        L_0x007a:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r7)
            return r1
        L_0x007e:
            r8 = move-exception
            goto L_0x0088
        L_0x0080:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "cache is closed"
            r8.<init>(r0)     // Catch:{ all -> 0x007e }
            throw r8     // Catch:{ all -> 0x007e }
        L_0x0088:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p535hi.C17437a.mo49896f(java.lang.String):hi.a$e");
    }

    /* renamed from: i */
    public final boolean mo49897i() {
        int i = this.f44922l;
        return i >= 2000 && i >= this.f44921k.size();
    }

    /* renamed from: q */
    public final void mo49898q() throws IOException {
        m43477c(this.f44914d);
        Iterator<C17442d> it = this.f44921k.values().iterator();
        while (it.hasNext()) {
            C17442d next = it.next();
            int i = 0;
            if (next.f44935d == null) {
                while (i < this.f44918h) {
                    this.f44919i += next.f44933b[i];
                    i++;
                }
            } else {
                next.f44935d = null;
                while (i < this.f44918h) {
                    m43477c(next.mo49913a(i));
                    m43477c(next.mo49914b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|(3:18|19|33)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f44922l = r0 - r9.f44921k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x006e=Splitter:B:23:0x006e, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49899r() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            hi.b r1 = new hi.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f44913c
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p535hi.C17446c.f44945a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo49918e()     // Catch:{ all -> 0x009c }
            java.lang.String r3 = r1.mo49918e()     // Catch:{ all -> 0x009c }
            java.lang.String r4 = r1.mo49918e()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r1.mo49918e()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = r1.mo49918e()     // Catch:{ all -> 0x009c }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x009c }
            if (r7 == 0) goto L_0x006e
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x009c }
            if (r7 == 0) goto L_0x006e
            int r7 = r9.f44916f     // Catch:{ all -> 0x009c }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x009c }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x006e
            int r4 = r9.f44918h     // Catch:{ all -> 0x009c }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x009c }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x006e
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x006e
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo49918e()     // Catch:{ EOFException -> 0x005f }
            r9.mo49900t(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, hi.a$d> r2 = r9.f44921k     // Catch:{ all -> 0x009c }
            int r2 = r2.size()     // Catch:{ all -> 0x009c }
            int r0 = r0 - r2
            r9.f44922l = r0     // Catch:{ all -> 0x009c }
            r1.close()     // Catch:{ RuntimeException -> 0x006c, Exception -> 0x006b }
        L_0x006b:
            return
        L_0x006c:
            r0 = move-exception
            throw r0
        L_0x006e:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x009c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r7.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x009c }
            r7.append(r2)     // Catch:{ all -> 0x009c }
            r7.append(r0)     // Catch:{ all -> 0x009c }
            r7.append(r3)     // Catch:{ all -> 0x009c }
            r7.append(r0)     // Catch:{ all -> 0x009c }
            r7.append(r5)     // Catch:{ all -> 0x009c }
            r7.append(r0)     // Catch:{ all -> 0x009c }
            r7.append(r6)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x009c }
            r4.<init>(r0)     // Catch:{ all -> 0x009c }
            throw r4     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            r1.close()     // Catch:{ RuntimeException -> 0x00a1, Exception -> 0x00a0 }
        L_0x00a0:
            throw r0
        L_0x00a1:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p535hi.C17437a.mo49899r():void");
    }

    /* renamed from: t */
    public final void mo49900t(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f44921k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C17442d dVar = this.f44921k.get(str2);
            if (dVar == null) {
                dVar = new C17442d(str2);
                this.f44921k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f44934c = true;
                dVar.f44935d = null;
                if (split.length == C17437a.this.f44918h) {
                    int i2 = 0;
                    while (i2 < split.length) {
                        try {
                            dVar.f44933b[i2] = Long.parseLong(split[i2]);
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
                dVar.f44935d = new C17440c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: v */
    public final synchronized void mo49901v() throws IOException {
        BufferedWriter bufferedWriter = this.f44920j;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f44914d), C17446c.f44945a));
        try {
            bufferedWriter2.write(DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write(DiskLruCache.VERSION_1);
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f44916f));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f44918h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (C17442d next : this.f44921k.values()) {
                if (next.f44935d != null) {
                    bufferedWriter2.write("DIRTY " + next.f44932a + 10);
                } else {
                    bufferedWriter2.write("CLEAN " + next.f44932a + next.mo49915c() + 10);
                }
            }
            bufferedWriter2.close();
            if (this.f44913c.exists()) {
                m43479x(this.f44913c, this.f44915e, true);
            }
            m43479x(this.f44914d, this.f44913c, false);
            this.f44915e.delete();
            this.f44920j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f44913c, true), C17446c.f44945a));
        } catch (Throwable th) {
            bufferedWriter2.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        return;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo49902w(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            java.io.BufferedWriter r0 = r7.f44920j     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x008d
            m43475A(r8)     // Catch:{ all -> 0x008b }
            java.util.LinkedHashMap<java.lang.String, hi.a$d> r0 = r7.f44921k     // Catch:{ all -> 0x008b }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008b }
            hi.a$d r0 = (p535hi.C17437a.C17442d) r0     // Catch:{ all -> 0x008b }
            r1 = 0
            if (r0 == 0) goto L_0x0089
            hi.a$c r2 = r0.f44935d     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0018
            goto L_0x0089
        L_0x0018:
            int r2 = r7.f44918h     // Catch:{ all -> 0x008b }
            if (r1 >= r2) goto L_0x0054
            java.io.File r2 = r0.mo49913a(r1)     // Catch:{ all -> 0x008b }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x0044
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x002d
            goto L_0x0044
        L_0x002d:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r0.<init>()     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008b }
            r0.append(r2)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008b }
            r8.<init>(r0)     // Catch:{ all -> 0x008b }
            throw r8     // Catch:{ all -> 0x008b }
        L_0x0044:
            long r2 = r7.f44919i     // Catch:{ all -> 0x008b }
            long[] r4 = r0.f44933b     // Catch:{ all -> 0x008b }
            r5 = r4[r1]     // Catch:{ all -> 0x008b }
            long r2 = r2 - r5
            r7.f44919i = r2     // Catch:{ all -> 0x008b }
            r2 = 0
            r4[r1] = r2     // Catch:{ all -> 0x008b }
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0054:
            int r0 = r7.f44922l     // Catch:{ all -> 0x008b }
            int r0 = r0 + 1
            r7.f44922l = r0     // Catch:{ all -> 0x008b }
            java.io.BufferedWriter r0 = r7.f44920j     // Catch:{ all -> 0x008b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r1.<init>()     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "REMOVE "
            r1.append(r2)     // Catch:{ all -> 0x008b }
            r1.append(r8)     // Catch:{ all -> 0x008b }
            r2 = 10
            r1.append(r2)     // Catch:{ all -> 0x008b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008b }
            r0.append(r1)     // Catch:{ all -> 0x008b }
            java.util.LinkedHashMap<java.lang.String, hi.a$d> r0 = r7.f44921k     // Catch:{ all -> 0x008b }
            r0.remove(r8)     // Catch:{ all -> 0x008b }
            boolean r8 = r7.mo49897i()     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x0087
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f44924n     // Catch:{ all -> 0x008b }
            hi.a$a r0 = r7.f44925o     // Catch:{ all -> 0x008b }
            r8.submit(r0)     // Catch:{ all -> 0x008b }
        L_0x0087:
            monitor-exit(r7)
            return
        L_0x0089:
            monitor-exit(r7)
            return
        L_0x008b:
            r8 = move-exception
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "cache is closed"
            r8.<init>(r0)     // Catch:{ all -> 0x008b }
            throw r8     // Catch:{ all -> 0x008b }
        L_0x0095:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p535hi.C17437a.mo49902w(java.lang.String):void");
    }

    /* renamed from: z */
    public final void mo49903z() throws IOException {
        while (this.f44919i > this.f44917g) {
            mo49902w((String) this.f44921k.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: hi.a$c */
    public final class C17440c {

        /* renamed from: a */
        public final C17442d f44927a;

        /* renamed from: b */
        public final boolean[] f44928b;

        /* renamed from: c */
        public boolean f44929c;

        public C17440c(C17442d dVar) {
            boolean[] zArr;
            this.f44927a = dVar;
            if (dVar.f44934c) {
                zArr = null;
            } else {
                zArr = new boolean[C17437a.this.f44918h];
            }
            this.f44928b = zArr;
        }

        /* renamed from: a */
        public final void mo49906a() throws IOException {
            C17437a.m43476a(C17437a.this, this, false);
        }

        /* renamed from: b */
        public final void mo49907b() throws IOException {
            if (this.f44929c) {
                C17437a.m43476a(C17437a.this, this, false);
                C17437a.this.mo49902w(this.f44927a.f44932a);
                return;
            }
            C17437a.m43476a(C17437a.this, this, true);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001c */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream mo49908c(int r5) throws java.io.IOException {
            /*
                r4 = this;
                hi.a r0 = p535hi.C17437a.this
                monitor-enter(r0)
                hi.a$d r1 = r4.f44927a     // Catch:{ all -> 0x0039 }
                hi.a$c r2 = r1.f44935d     // Catch:{ all -> 0x0039 }
                if (r2 != r4) goto L_0x0033
                boolean r2 = r1.f44934c     // Catch:{ all -> 0x0039 }
                if (r2 != 0) goto L_0x0012
                boolean[] r2 = r4.f44928b     // Catch:{ all -> 0x0039 }
                r3 = 1
                r2[r5] = r3     // Catch:{ all -> 0x0039 }
            L_0x0012:
                java.io.File r5 = r1.mo49914b(r5)     // Catch:{ all -> 0x0039 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x001c }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x001c }
                goto L_0x0028
            L_0x001c:
                hi.a r1 = p535hi.C17437a.this     // Catch:{ all -> 0x0039 }
                java.io.File r1 = r1.f44912b     // Catch:{ all -> 0x0039 }
                r1.mkdirs()     // Catch:{ all -> 0x0039 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002f }
                r1.<init>(r5)     // Catch:{ FileNotFoundException -> 0x002f }
            L_0x0028:
                hi.a$c$a r5 = new hi.a$c$a     // Catch:{ all -> 0x0039 }
                r5.<init>(r1)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                return r5
            L_0x002f:
                hi.a$b r5 = p535hi.C17437a.f44911q     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                return r5
            L_0x0033:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0039 }
                r5.<init>()     // Catch:{ all -> 0x0039 }
                throw r5     // Catch:{ all -> 0x0039 }
            L_0x0039:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0039 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p535hi.C17437a.C17440c.mo49908c(int):java.io.OutputStream");
        }

        /* renamed from: hi.a$c$a */
        public class C17441a extends FilterOutputStream {
            public C17441a(FileOutputStream fileOutputStream) {
                super(fileOutputStream);
            }

            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C17440c.this.f44929c = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C17440c.this.f44929c = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C17440c.this.f44929c = true;
                }
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C17440c.this.f44929c = true;
                }
            }
        }
    }
}
