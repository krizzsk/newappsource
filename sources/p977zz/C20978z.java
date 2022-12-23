package p977zz;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import p090g1.C4732a;

/* renamed from: zz.z */
public final class C20978z {
    /* renamed from: a */
    public static File m49125a(Context context) throws IOException {
        File file;
        File[] externalCacheDirs = C4732a.getExternalCacheDirs(context);
        if (externalCacheDirs.length > 0) {
            file = externalCacheDirs[0];
        } else {
            file = context.getCacheDir();
        }
        File file2 = new File(file, "images");
        if (file2.isDirectory() || file2.mkdirs()) {
            return File.createTempFile("image_tmp", ".jpg", file2);
        }
        throw new IOException(C16530d.m42013f("Unable to create dir: ", file2));
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m49126b(android.net.Uri r7, java.io.File r8) throws java.io.IOException {
        /*
            ce0.C21100e.m49355o()
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0066 }
            r1.<init>(r7)     // Catch:{ all -> 0x0066 }
            java.net.URLConnection r7 = r1.openConnection()     // Catch:{ all -> 0x0066 }
            java.lang.Object r7 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r7)     // Catch:{ all -> 0x0066 }
            java.net.URLConnection r7 = (java.net.URLConnection) r7     // Catch:{ all -> 0x0066 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x0066 }
            boolean r1 = r8.isFile()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 == 0) goto L_0x0026
            long r4 = r8.lastModified()     // Catch:{ all -> 0x0062 }
            goto L_0x0027
        L_0x0026:
            r4 = r2
        L_0x0027:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            r7.setIfModifiedSince(r4)     // Catch:{ all -> 0x0062 }
        L_0x002e:
            int r1 = r7.getResponseCode()     // Catch:{ all -> 0x0062 }
            r2 = 304(0x130, float:4.26E-43)
            if (r1 != r2) goto L_0x003b
            r8 = 0
        L_0x0037:
            r7.disconnect()
            return r8
        L_0x003b:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0062 }
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ all -> 0x0062 }
            r1.<init>(r2)     // Catch:{ all -> 0x0062 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x005c }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x005c }
            r3.<init>(r8)     // Catch:{ all -> 0x005c }
            r2.<init>(r3)     // Catch:{ all -> 0x005c }
            p786rz.C19387a.m46671c(r1, r2)     // Catch:{ all -> 0x0059 }
            r8 = 1
            p786rz.C19387a.m46677i(r1)
            p786rz.C19387a.m46677i(r2)
            goto L_0x0037
        L_0x0059:
            r8 = move-exception
            r0 = r2
            goto L_0x005d
        L_0x005c:
            r8 = move-exception
        L_0x005d:
            r6 = r1
            r1 = r7
            r7 = r0
            r0 = r6
            goto L_0x006a
        L_0x0062:
            r8 = move-exception
            r1 = r7
            r7 = r0
            goto L_0x006a
        L_0x0066:
            r7 = move-exception
            r8 = r7
            r7 = r0
            r1 = r7
        L_0x006a:
            p786rz.C19387a.m46677i(r0)
            p786rz.C19387a.m46677i(r7)
            if (r1 == 0) goto L_0x0075
            r1.disconnect()
        L_0x0075:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p977zz.C20978z.m49126b(android.net.Uri, java.io.File):boolean");
    }

    /* renamed from: c */
    public static Uri m49127c(Context context, File file) {
        return FileProvider.m2326a(context, context.getPackageName() + ".fileprovider").mo3423a(file);
    }

    /* renamed from: d */
    public static long m49128d(File file) {
        long j = 0;
        if (!file.exists()) {
            return 0;
        }
        if (file.isFile()) {
            return file.length();
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0;
            }
            for (File d : listFiles) {
                j += m49128d(d);
            }
        }
        return j;
    }
}
