package p648me;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: me.c */
public final class C18365c {

    /* renamed from: a */
    public final File f46820a;

    /* renamed from: b */
    public final File f46821b;

    /* renamed from: c */
    public final File f46822c;

    /* renamed from: d */
    public final File f46823d;

    /* renamed from: e */
    public final File f46824e;

    /* renamed from: f */
    public final File f46825f;

    public C18365c(Context context) {
        boolean z;
        String str;
        File filesDir = context.getFilesDir();
        this.f46820a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder k = C13555b.m33972k(".com.google.firebase.crashlytics.files.v2");
            k.append(File.pathSeparator);
            k.append(Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_"));
            str = k.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        m45217b(file);
        this.f46821b = file;
        File file2 = new File(file, "open-sessions");
        m45217b(file2);
        this.f46822c = file2;
        File file3 = new File(file, "reports");
        m45217b(file3);
        this.f46823d = file3;
        File file4 = new File(file, "priority-reports");
        m45217b(file4);
        this.f46824e = file4;
        File file5 = new File(file, "native-reports");
        m45217b(file5);
        this.f46825f = file5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m45217b(java.io.File r2) {
        /*
            java.lang.Class<me.c> r0 = p648me.C18365c.class
            monitor-enter(r0)
            boolean r1 = r2.exists()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0017
            boolean r1 = r2.isDirectory()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return
        L_0x0011:
            r2.toString()     // Catch:{ all -> 0x0022 }
            r2.delete()     // Catch:{ all -> 0x0022 }
        L_0x0017:
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x0020
            r2.toString()     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)
            return
        L_0x0022:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p648me.C18365c.m45217b(java.io.File):void");
    }

    /* renamed from: c */
    public static boolean m45218c(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File c : listFiles) {
                m45218c(c);
            }
        }
        return file.delete();
    }

    /* renamed from: d */
    public static <T> List<T> m45219d(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* renamed from: a */
    public final File mo50830a(String str, String str2) {
        File file = new File(this.f46822c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
