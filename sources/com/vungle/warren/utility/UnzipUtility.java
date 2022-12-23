package com.vungle.warren.utility;

import ce0.C21105j;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class UnzipUtility {

    public static class ZipSecurityException extends IOException {
        public ZipSecurityException() {
            super("File is outside extraction target directory.");
        }
    }

    /* renamed from: a */
    public static void m57274a(InputStream inputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        C21105j.m49397b(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            } catch (Throwable th) {
                th = th;
                C21105j.m49396a(inputStream);
                C21105j.m49396a(bufferedOutputStream2);
                C21105j.m49396a(fileOutputStream);
                throw th;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        bufferedOutputStream.write(bArr, 0, read);
                    } else {
                        C21105j.m49396a(inputStream);
                        C21105j.m49396a(bufferedOutputStream);
                        C21105j.m49396a(fileOutputStream);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                C21105j.m49396a(inputStream);
                C21105j.m49396a(bufferedOutputStream2);
                C21105j.m49396a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            C21105j.m49396a(inputStream);
            C21105j.m49396a(bufferedOutputStream2);
            C21105j.m49396a(fileOutputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6 A[SYNTHETIC, Splitter:B:34:0x00a6] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m57275b(java.lang.String r6, java.lang.String r7, com.vungle.warren.C23097c.C23102e r8) throws java.io.IOException {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00b2
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r6 = r0.exists()
            if (r6 == 0) goto L_0x00aa
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r1 = r6.exists()
            if (r1 != 0) goto L_0x001f
            r6.mkdir()
        L_0x001f:
            r6 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ all -> 0x00a3 }
            r2.<init>(r0)     // Catch:{ all -> 0x00a3 }
            java.util.Enumeration r6 = r2.entries()     // Catch:{ all -> 0x009f }
        L_0x002e:
            boolean r0 = r6.hasMoreElements()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r6.nextElement()     // Catch:{ all -> 0x009f }
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch:{ all -> 0x009f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r3.<init>()     // Catch:{ all -> 0x009f }
            r3.append(r7)     // Catch:{ all -> 0x009f }
            java.lang.String r4 = java.io.File.separator     // Catch:{ all -> 0x009f }
            r3.append(r4)     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r0.getName()     // Catch:{ all -> 0x009f }
            r3.append(r4)     // Catch:{ all -> 0x009f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009f }
            boolean r4 = r8.mo58120a(r3)     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x002e
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x009f }
            r4.<init>(r3)     // Catch:{ all -> 0x009f }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x009f }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x009f }
            r5.<init>(r7)     // Catch:{ all -> 0x009f }
            java.lang.String r5 = r5.getCanonicalPath()     // Catch:{ all -> 0x009f }
            boolean r4 = r4.startsWith(r5)     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x0095
            boolean r4 = r0.isDirectory()     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x0085
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x009f }
            r0.<init>(r3)     // Catch:{ all -> 0x009f }
            boolean r3 = r0.exists()     // Catch:{ all -> 0x009f }
            if (r3 != 0) goto L_0x002e
            r0.mkdir()     // Catch:{ all -> 0x009f }
            goto L_0x002e
        L_0x0085:
            java.io.InputStream r0 = r2.getInputStream(r0)     // Catch:{ all -> 0x009f }
            m57274a(r0, r3)     // Catch:{ all -> 0x009f }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x009f }
            r0.<init>(r3)     // Catch:{ all -> 0x009f }
            r1.add(r0)     // Catch:{ all -> 0x009f }
            goto L_0x002e
        L_0x0095:
            com.vungle.warren.utility.UnzipUtility$ZipSecurityException r6 = new com.vungle.warren.utility.UnzipUtility$ZipSecurityException     // Catch:{ all -> 0x009f }
            r6.<init>()     // Catch:{ all -> 0x009f }
            throw r6     // Catch:{ all -> 0x009f }
        L_0x009b:
            r2.close()     // Catch:{ IOException -> 0x009e }
        L_0x009e:
            return r1
        L_0x009f:
            r6 = move-exception
            r7 = r6
            r6 = r2
            goto L_0x00a4
        L_0x00a3:
            r7 = move-exception
        L_0x00a4:
            if (r6 == 0) goto L_0x00a9
            r6.close()     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            throw r7
        L_0x00aa:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "File does not exist"
            r6.<init>(r7)
            throw r6
        L_0x00b2:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Path is empty"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.utility.UnzipUtility.m57275b(java.lang.String, java.lang.String, com.vungle.warren.c$e):java.util.ArrayList");
    }
}
