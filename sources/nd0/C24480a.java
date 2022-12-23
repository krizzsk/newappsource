package nd0;

import ce0.C21105j;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.LineNumberReader;

/* renamed from: nd0.a */
public class C24480a {

    /* renamed from: a */
    public File f61955a;

    /* renamed from: b */
    public String f61956b = "log_";

    /* renamed from: c */
    public String f61957c = "_pending";

    /* renamed from: nd0.a$a */
    public class C24481a implements FilenameFilter {

        /* renamed from: a */
        public final /* synthetic */ String f61958a;

        public C24481a(String str) {
            this.f61958a = str;
        }

        public final boolean accept(File file, String str) {
            return str.endsWith(this.f61958a);
        }
    }

    /* renamed from: nd0.a$b */
    public interface C24482b {
        /* renamed from: a */
        void mo60732a();

        /* renamed from: b */
        void mo60733b(File file, int i);
    }

    public C24480a(File file) {
        if (file != null) {
            File b = m61581b(file, "sdk_logs", true);
            this.f61955a = (b == null || !b.exists()) ? null : b;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:12|11|14|15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0026 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m61580a(java.io.File r4, java.lang.String r5, nd0.C24480a.C24482b r6) {
        /*
            r0 = 0
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0026 }
            r2 = 1
            r1.<init>(r4, r2)     // Catch:{ IOException -> 0x0026 }
            int r0 = m61582d(r4)     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            if (r0 <= 0) goto L_0x0012
            java.lang.String r3 = "\n"
            r1.append(r3)     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
        L_0x0012:
            r1.append(r5)     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            r1.flush()     // Catch:{ IOException -> 0x0022, all -> 0x0020 }
            ce0.C21105j.m49396a(r1)
            int r0 = r0 + r2
            r6.mo60733b(r4, r0)
            return r2
        L_0x0020:
            r4 = move-exception
            goto L_0x002f
        L_0x0022:
            r0 = r1
            goto L_0x0026
        L_0x0024:
            r4 = move-exception
            goto L_0x002e
        L_0x0026:
            r6.mo60732a()     // Catch:{ all -> 0x0024 }
            r4 = 0
            ce0.C21105j.m49396a(r0)
            return r4
        L_0x002e:
            r1 = r0
        L_0x002f:
            ce0.C21105j.m49396a(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nd0.C24480a.m61580a(java.io.File, java.lang.String, nd0.a$b):boolean");
    }

    /* renamed from: b */
    public static File m61581b(File file, String str, boolean z) {
        boolean z2;
        File file2 = new File(file, str);
        if (file2.exists()) {
            z2 = true;
        } else if (!z) {
            try {
                z2 = file2.createNewFile();
            } catch (IOException unused) {
                file2.getName();
                z2 = false;
            }
        } else {
            z2 = file2.mkdir();
        }
        if (z2) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    public static int m61582d(File file) {
        if (file == null) {
            return 0;
        }
        LineNumberReader lineNumberReader = null;
        try {
            LineNumberReader lineNumberReader2 = new LineNumberReader(new FileReader(file.getAbsolutePath()));
            while (lineNumberReader2.readLine() != null) {
                try {
                } catch (Exception unused) {
                    lineNumberReader = lineNumberReader2;
                    C21105j.m49396a(lineNumberReader);
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    lineNumberReader = lineNumberReader2;
                    C21105j.m49396a(lineNumberReader);
                    throw th;
                }
            }
            int lineNumber = lineNumberReader2.getLineNumber();
            C21105j.m49396a(lineNumberReader2);
            return lineNumber;
        } catch (Exception unused2) {
            C21105j.m49396a(lineNumberReader);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            C21105j.m49396a(lineNumberReader);
            throw th;
        }
    }

    /* renamed from: c */
    public final File[] mo60729c(String str) {
        boolean z;
        File file = this.f61955a;
        if (file == null || !file.exists()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return this.f61955a.listFiles(new C24481a(str));
    }

    /* renamed from: e */
    public final boolean mo60730e(File file, String str) {
        if (!file.exists() || !file.isFile()) {
            return false;
        }
        File file2 = new File(this.f61955a, str);
        if (file2.exists()) {
            return false;
        }
        return file.renameTo(file2);
    }
}
