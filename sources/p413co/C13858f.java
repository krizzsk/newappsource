package p413co;

import p583jk.C17873f;

/* renamed from: co.f */
public final class C13858f implements C13871q {

    /* renamed from: a */
    public final C17873f f34092a;

    public C13858f(C17873f fVar) {
        this.f34092a = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p413co.C13872r mo40801a(java.lang.String r6, byte[] r7) {
        /*
            r5 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r6 = r0.isFile()
            r1 = 0
            if (r6 == 0) goto L_0x001b
            co.r r6 = new co.r
            dk.a r7 = new dk.a
            java.lang.Integer r0 = p441dk.C16672a.f43401W
            java.lang.String r2 = "Unzip failed due to specifying an unzip path that is a file not a directory."
            r7.<init>((java.lang.Integer) r0, (java.lang.String) r2)
            r6.<init>(r1, r7)
            return r6
        L_0x001b:
            kf0.C23775c.m58350Q0(r0)
            r0.mkdirs()
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r7)
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x00aa }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00aa }
            r2.<init>(r6)     // Catch:{ IOException -> 0x00aa }
            r7.<init>(r2)     // Catch:{ IOException -> 0x00aa }
        L_0x0030:
            java.util.zip.ZipEntry r6 = r7.getNextEntry()     // Catch:{ all -> 0x009e }
            if (r6 == 0) goto L_0x0095
            java.lang.String r2 = r6.getName()     // Catch:{ all -> 0x009e }
            boolean r6 = r6.isDirectory()     // Catch:{ all -> 0x009e }
            if (r6 != 0) goto L_0x0091
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x009e }
            r6.<init>(r0, r2)     // Catch:{ all -> 0x009e }
            java.lang.String r2 = r6.getCanonicalPath()     // Catch:{ all -> 0x009e }
            java.lang.String r3 = r0.getCanonicalPath()     // Catch:{ all -> 0x009e }
            boolean r2 = r2.startsWith(r3)     // Catch:{ all -> 0x009e }
            if (r2 != 0) goto L_0x0065
            co.r r6 = new co.r     // Catch:{ all -> 0x009e }
            dk.a r0 = new dk.a     // Catch:{ all -> 0x009e }
            java.lang.Integer r2 = p441dk.C16672a.f43400V     // Catch:{ all -> 0x009e }
            java.lang.String r3 = "Unzip failed due to security exception."
            r0.<init>((java.lang.Integer) r2, (java.lang.String) r3)     // Catch:{ all -> 0x009e }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x009e }
            r7.close()     // Catch:{ IOException -> 0x00aa }
            return r6
        L_0x0065:
            java.io.File r2 = r6.getParentFile()     // Catch:{ all -> 0x009e }
            r2.mkdirs()     // Catch:{ all -> 0x009e }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x009e }
            r2.<init>(r6)     // Catch:{ all -> 0x009e }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0085 }
        L_0x0075:
            int r3 = r7.read(r6)     // Catch:{ all -> 0x0085 }
            r4 = -1
            if (r3 == r4) goto L_0x0081
            r4 = 0
            r2.write(r6, r4, r3)     // Catch:{ all -> 0x0085 }
            goto L_0x0075
        L_0x0081:
            r2.close()     // Catch:{ all -> 0x009e }
            goto L_0x0091
        L_0x0085:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x008c }
            goto L_0x0090
        L_0x008c:
            r2 = move-exception
            r6.addSuppressed(r2)     // Catch:{ all -> 0x009e }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x009e }
        L_0x0091:
            r7.closeEntry()     // Catch:{ all -> 0x009e }
            goto L_0x0030
        L_0x0095:
            r7.close()     // Catch:{ IOException -> 0x00aa }
            co.r r6 = new co.r
            r6.<init>(r1, r1)
            return r6
        L_0x009e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r7 = move-exception
            r6.addSuppressed(r7)     // Catch:{ IOException -> 0x00aa }
        L_0x00a9:
            throw r0     // Catch:{ IOException -> 0x00aa }
        L_0x00aa:
            r6 = move-exception
            co.r r7 = new co.r
            dk.a r0 = new dk.a
            java.lang.Integer r2 = p441dk.C16672a.f43399U
            jk.f r3 = r5.f34092a
            r3.getClass()
            pj.a r6 = p583jk.C17873f.m44275b(r6)
            java.lang.String r3 = "Unzip failed with error: "
            r0.<init>(r6, r2, r3)
            r7.<init>(r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p413co.C13858f.mo40801a(java.lang.String, byte[]):co.r");
    }
}
