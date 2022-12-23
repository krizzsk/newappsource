package p333z5;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: z5.a */
public final class C7479a implements Closeable {

    /* renamed from: b */
    public final File f22934b;

    /* renamed from: c */
    public final File f22935c;

    /* renamed from: d */
    public final File f22936d;

    /* renamed from: e */
    public final File f22937e;

    /* renamed from: f */
    public final int f22938f;

    /* renamed from: g */
    public long f22939g;

    /* renamed from: h */
    public final int f22940h;

    /* renamed from: i */
    public long f22941i = 0;

    /* renamed from: j */
    public BufferedWriter f22942j;

    /* renamed from: k */
    public final LinkedHashMap<String, C7483d> f22943k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    public int f22944l;

    /* renamed from: m */
    public long f22945m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f22946n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C7481b());

    /* renamed from: o */
    public final C7480a f22947o = new C7480a();

    /* renamed from: z5.a$a */
    public class C7480a implements Callable<Void> {
        public C7480a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() throws java.lang.Exception {
            /*
                r3 = this;
                z5.a r0 = p333z5.C7479a.this
                monitor-enter(r0)
                z5.a r1 = p333z5.C7479a.this     // Catch:{ all -> 0x0023 }
                java.io.BufferedWriter r2 = r1.f22942j     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.mo23752x()     // Catch:{ all -> 0x0023 }
                z5.a r1 = p333z5.C7479a.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.mo23747i()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                z5.a r1 = p333z5.C7479a.this     // Catch:{ all -> 0x0023 }
                r1.mo23751v()     // Catch:{ all -> 0x0023 }
                z5.a r1 = p333z5.C7479a.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.f22944l = r2     // Catch:{ all -> 0x0023 }
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
            throw new UnsupportedOperationException("Method not decompiled: p333z5.C7479a.C7480a.call():java.lang.Object");
        }
    }

    /* renamed from: z5.a$b */
    public static final class C7481b implements ThreadFactory {
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* renamed from: z5.a$c */
    public final class C7482c {

        /* renamed from: a */
        public final C7483d f22949a;

        /* renamed from: b */
        public final boolean[] f22950b;

        /* renamed from: c */
        public boolean f22951c;

        public C7482c(C7483d dVar) {
            boolean[] zArr;
            this.f22949a = dVar;
            if (dVar.f22957e) {
                zArr = null;
            } else {
                zArr = new boolean[C7479a.this.f22940h];
            }
            this.f22950b = zArr;
        }

        /* renamed from: a */
        public final void mo23755a() throws IOException {
            C7479a.m17173a(C7479a.this, this, false);
        }

        /* renamed from: b */
        public final File mo23756b() throws IOException {
            File file;
            synchronized (C7479a.this) {
                C7483d dVar = this.f22949a;
                if (dVar.f22958f == this) {
                    if (!dVar.f22957e) {
                        this.f22950b[0] = true;
                    }
                    file = dVar.f22956d[0];
                    C7479a.this.f22934b.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* renamed from: z5.a$d */
    public final class C7483d {

        /* renamed from: a */
        public final String f22953a;

        /* renamed from: b */
        public final long[] f22954b;

        /* renamed from: c */
        public File[] f22955c;

        /* renamed from: d */
        public File[] f22956d;

        /* renamed from: e */
        public boolean f22957e;

        /* renamed from: f */
        public C7482c f22958f;

        public C7483d(String str) {
            this.f22953a = str;
            int i = C7479a.this.f22940h;
            this.f22954b = new long[i];
            this.f22955c = new File[i];
            this.f22956d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C7479a.this.f22940h; i2++) {
                sb.append(i2);
                this.f22955c[i2] = new File(C7479a.this.f22934b, sb.toString());
                sb.append(".tmp");
                this.f22956d[i2] = new File(C7479a.this.f22934b, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public final String mo23757a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f22954b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }
    }

    /* renamed from: z5.a$e */
    public final class C7484e {

        /* renamed from: a */
        public final File[] f22960a;

        public C7484e(File[] fileArr) {
            this.f22960a = fileArr;
        }
    }

    public C7479a(File file, long j) {
        File file2 = file;
        this.f22934b = file2;
        this.f22938f = 1;
        this.f22935c = new File(file2, DiskLruCache.JOURNAL_FILE);
        this.f22936d = new File(file2, DiskLruCache.JOURNAL_FILE_TMP);
        this.f22937e = new File(file2, "journal.bkp");
        this.f22940h = 1;
        this.f22939g = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m17173a(p333z5.C7479a r9, p333z5.C7479a.C7482c r10, boolean r11) throws java.io.IOException {
        /*
            monitor-enter(r9)
            z5.a$d r0 = r10.f22949a     // Catch:{ all -> 0x00f9 }
            z5.a$c r1 = r0.f22958f     // Catch:{ all -> 0x00f9 }
            if (r1 != r10) goto L_0x00f3
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f22957e     // Catch:{ all -> 0x00f9 }
            if (r2 != 0) goto L_0x0046
            r2 = 0
        L_0x000f:
            int r3 = r9.f22940h     // Catch:{ all -> 0x00f9 }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f22950b     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x002c
            java.io.File[] r3 = r0.f22956d     // Catch:{ all -> 0x00f9 }
            r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f9 }
            if (r3 != 0) goto L_0x0029
            r10.mo23755a()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r9)
            goto L_0x00f2
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.mo23755a()     // Catch:{ all -> 0x00f9 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r11.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00f9 }
            r11.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f9 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x0046:
            int r10 = r9.f22940h     // Catch:{ all -> 0x00f9 }
            if (r1 >= r10) goto L_0x0076
            java.io.File[] r10 = r0.f22956d     // Catch:{ all -> 0x00f9 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x0073
            java.io.File[] r2 = r0.f22955c     // Catch:{ all -> 0x00f9 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f9 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f22954b     // Catch:{ all -> 0x00f9 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f9 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f22954b     // Catch:{ all -> 0x00f9 }
            r10[r1] = r5     // Catch:{ all -> 0x00f9 }
            long r7 = r9.f22941i     // Catch:{ all -> 0x00f9 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f22941i = r7     // Catch:{ all -> 0x00f9 }
            goto L_0x0073
        L_0x0070:
            m17175e(r10)     // Catch:{ all -> 0x00f9 }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.f22944l     // Catch:{ all -> 0x00f9 }
            r1 = 1
            int r10 = r10 + r1
            r9.f22944l = r10     // Catch:{ all -> 0x00f9 }
            r10 = 0
            r0.f22958f = r10     // Catch:{ all -> 0x00f9 }
            boolean r10 = r0.f22957e     // Catch:{ all -> 0x00f9 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b8
            r0.f22957e = r1     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            r10.append(r3)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.f22953a     // Catch:{ all -> 0x00f9 }
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.mo23757a()     // Catch:{ all -> 0x00f9 }
            r10.append(r1)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            r10.append(r2)     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x00d7
            long r10 = r9.f22945m     // Catch:{ all -> 0x00f9 }
            r1 = 1
            long r10 = r10 + r1
            r9.f22945m = r10     // Catch:{ all -> 0x00f9 }
            r0.getClass()     // Catch:{ all -> 0x00f9 }
            goto L_0x00d7
        L_0x00b8:
            java.util.LinkedHashMap<java.lang.String, z5.a$d> r10 = r9.f22943k     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f22953a     // Catch:{ all -> 0x00f9 }
            r10.remove(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            r10.append(r3)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f22953a     // Catch:{ all -> 0x00f9 }
            r10.append(r11)     // Catch:{ all -> 0x00f9 }
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            r10.append(r2)     // Catch:{ all -> 0x00f9 }
        L_0x00d7:
            java.io.BufferedWriter r10 = r9.f22942j     // Catch:{ all -> 0x00f9 }
            m17176g(r10)     // Catch:{ all -> 0x00f9 }
            long r10 = r9.f22941i     // Catch:{ all -> 0x00f9 }
            long r0 = r9.f22939g     // Catch:{ all -> 0x00f9 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ea
            boolean r10 = r9.mo23747i()     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x00f1
        L_0x00ea:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f22946n     // Catch:{ all -> 0x00f9 }
            z5.a$a r11 = r9.f22947o     // Catch:{ all -> 0x00f9 }
            r10.submit(r11)     // Catch:{ all -> 0x00f9 }
        L_0x00f1:
            monitor-exit(r9)
        L_0x00f2:
            return
        L_0x00f3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            r10.<init>()     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p333z5.C7479a.m17173a(z5.a, z5.a$c, boolean):void");
    }

    @TargetApi(26)
    /* renamed from: c */
    public static void m17174c(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: e */
    public static void m17175e(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    /* renamed from: g */
    public static void m17176g(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: j */
    public static C7479a m17177j(File file, long j) throws IOException {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m17178w(file2, file3, false);
                }
            }
            C7479a aVar = new C7479a(file, j);
            if (aVar.f22935c.exists()) {
                try {
                    aVar.mo23749r();
                    aVar.mo23748q();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.close();
                    C7487c.m17191a(aVar.f22934b);
                }
            }
            file.mkdirs();
            C7479a aVar2 = new C7479a(file, j);
            aVar2.mo23751v();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: w */
    public static void m17178w(File file, File file2, boolean z) throws IOException {
        if (z) {
            m17175e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f22942j != null) {
            Iterator it = new ArrayList(this.f22943k.values()).iterator();
            while (it.hasNext()) {
                C7482c cVar = ((C7483d) it.next()).f22958f;
                if (cVar != null) {
                    cVar.mo23755a();
                }
            }
            mo23752x();
            m17174c(this.f22942j);
            this.f22942j = null;
        }
    }

    /* renamed from: f */
    public final C7482c mo23745f(String str) throws IOException {
        C7482c cVar;
        synchronized (this) {
            if (this.f22942j != null) {
                C7483d dVar = this.f22943k.get(str);
                cVar = null;
                if (dVar == null) {
                    dVar = new C7483d(str);
                    this.f22943k.put(str, dVar);
                } else if (dVar.f22958f != null) {
                }
                cVar = new C7482c(dVar);
                dVar.f22958f = cVar;
                this.f22942j.append("DIRTY");
                this.f22942j.append(' ');
                this.f22942j.append(str);
                this.f22942j.append(10);
                m17176g(this.f22942j);
            } else {
                throw new IllegalStateException("cache is closed");
            }
        }
        return cVar;
    }

    /* renamed from: h */
    public final synchronized C7484e mo23746h(String str) throws IOException {
        if (this.f22942j != null) {
            C7483d dVar = this.f22943k.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.f22957e) {
                return null;
            }
            for (File exists : dVar.f22955c) {
                if (!exists.exists()) {
                    return null;
                }
            }
            this.f22944l++;
            this.f22942j.append("READ");
            this.f22942j.append(' ');
            this.f22942j.append(str);
            this.f22942j.append(10);
            if (mo23747i()) {
                this.f22946n.submit(this.f22947o);
            }
            return new C7484e(dVar.f22955c);
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: i */
    public final boolean mo23747i() {
        int i = this.f22944l;
        if (i < 2000 || i < this.f22943k.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final void mo23748q() throws IOException {
        m17175e(this.f22936d);
        Iterator<C7483d> it = this.f22943k.values().iterator();
        while (it.hasNext()) {
            C7483d next = it.next();
            int i = 0;
            if (next.f22958f == null) {
                while (i < this.f22940h) {
                    this.f22941i += next.f22954b[i];
                    i++;
                }
            } else {
                next.f22958f = null;
                while (i < this.f22940h) {
                    m17175e(next.f22955c[i]);
                    m17175e(next.f22956d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f22944l = r2 - r9.f22943k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f22965f == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        mo23751v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f22942j = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f22935c, true), p333z5.C7487c.f22967a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:29:0x0093=Splitter:B:29:0x0093} */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23749r() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            z5.b r1 = new z5.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f22935c
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p333z5.C7487c.f22967a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo23759e()     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r1.mo23759e()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r1.mo23759e()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r1.mo23759e()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r1.mo23759e()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            int r7 = r9.f22938f     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0091 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            int r4 = r9.f22940h     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0091 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            r0 = 0
            r2 = 0
        L_0x0056:
            java.lang.String r3 = r1.mo23759e()     // Catch:{ EOFException -> 0x0060 }
            r9.mo23750t(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, z5.a$d> r3 = r9.f22943k     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r2 = r2 - r3
            r9.f22944l = r2     // Catch:{ all -> 0x0091 }
            int r2 = r1.f22965f     // Catch:{ all -> 0x0091 }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = 1
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.mo23751v()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            java.io.File r5 = r9.f22935c     // Catch:{ all -> 0x0091 }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = p333z5.C7487c.f22967a     // Catch:{ all -> 0x0091 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r2)     // Catch:{ all -> 0x0091 }
            r9.f22942j = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = move-exception
            goto L_0x00c2
        L_0x0093:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x0091 }
            r7.append(r2)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r3)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r5)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0091 }
            r4.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r4     // Catch:{ all -> 0x0091 }
        L_0x00c2:
            r1.close()     // Catch:{ RuntimeException -> 0x00c6, Exception -> 0x00c5 }
        L_0x00c5:
            throw r0
        L_0x00c6:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p333z5.C7479a.mo23749r():void");
    }

    /* renamed from: t */
    public final void mo23750t(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f22943k.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C7483d dVar = this.f22943k.get(str2);
            if (dVar == null) {
                dVar = new C7483d(str2);
                this.f22943k.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f22957e = true;
                dVar.f22958f = null;
                if (split.length == C7479a.this.f22940h) {
                    int i2 = 0;
                    while (i2 < split.length) {
                        try {
                            dVar.f22954b[i2] = Long.parseLong(split[i2]);
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
                dVar.f22958f = new C7482c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(C25541a.m63881k("unexpected journal line: ", str));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: v */
    public final synchronized void mo23751v() throws IOException {
        BufferedWriter bufferedWriter = this.f22942j;
        if (bufferedWriter != null) {
            m17174c(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f22936d), C7487c.f22967a));
        try {
            bufferedWriter2.write(DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write(DiskLruCache.VERSION_1);
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f22938f));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f22940h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (C7483d next : this.f22943k.values()) {
                if (next.f22958f != null) {
                    bufferedWriter2.write("DIRTY " + next.f22953a + 10);
                } else {
                    bufferedWriter2.write("CLEAN " + next.f22953a + next.mo23757a() + 10);
                }
            }
            m17174c(bufferedWriter2);
            if (this.f22935c.exists()) {
                m17178w(this.f22935c, this.f22937e, true);
            }
            m17178w(this.f22936d, this.f22935c, false);
            this.f22937e.delete();
            this.f22942j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f22935c, true), C7487c.f22967a));
        } catch (Throwable th) {
            m17174c(bufferedWriter2);
            throw th;
        }
    }

    /* renamed from: x */
    public final void mo23752x() throws IOException {
        while (this.f22941i > this.f22939g) {
            String str = (String) this.f22943k.entrySet().iterator().next().getKey();
            synchronized (this) {
                if (this.f22942j != null) {
                    C7483d dVar = this.f22943k.get(str);
                    if (dVar != null) {
                        if (dVar.f22958f == null) {
                            for (int i = 0; i < this.f22940h; i++) {
                                File file = dVar.f22955c[i];
                                if (file.exists()) {
                                    if (!file.delete()) {
                                        throw new IOException("failed to delete " + file);
                                    }
                                }
                                long j = this.f22941i;
                                long[] jArr = dVar.f22954b;
                                this.f22941i = j - jArr[i];
                                jArr[i] = 0;
                            }
                            this.f22944l++;
                            this.f22942j.append("REMOVE");
                            this.f22942j.append(' ');
                            this.f22942j.append(str);
                            this.f22942j.append(10);
                            this.f22943k.remove(str);
                            if (mo23747i()) {
                                this.f22946n.submit(this.f22947o);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("cache is closed");
                }
            }
        }
    }
}
