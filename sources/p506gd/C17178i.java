package p506gd;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: gd.i */
public final class C17178i implements C17180k {

    /* renamed from: a */
    public final /* synthetic */ Set f44422a;

    /* renamed from: b */
    public final /* synthetic */ C17184o f44423b;

    /* renamed from: c */
    public final /* synthetic */ ZipFile f44424c;

    public C17178i(HashSet hashSet, C17184o oVar, ZipFile zipFile) {
        this.f44422a = hashSet;
        this.f44423b = oVar;
        this.f44424c = zipFile;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x006f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49765a(p506gd.C17181l r5, java.io.File r6, boolean r7) throws java.io.IOException {
        /*
            r4 = this;
            java.util.Set r0 = r4.f44422a
            r0.add(r6)
            if (r7 != 0) goto L_0x0077
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            gd.o r0 = r4.f44423b
            java.lang.String r0 = r0.mo49756b()
            r1 = 0
            r7[r1] = r0
            java.lang.String r0 = r5.f44425a
            r2 = 1
            r7[r2] = r0
            r0 = 2
            gd.o r3 = r4.f44423b
            java.io.File r3 = r3.mo49755a()
            java.lang.String r3 = r3.getAbsolutePath()
            r7[r0] = r3
            r0 = 3
            java.util.zip.ZipEntry r3 = r5.f44426b
            java.lang.String r3 = r3.getName()
            r7[r0] = r3
            r0 = 4
            java.lang.String r3 = r6.getAbsolutePath()
            r7[r0] = r3
            java.lang.String r0 = "NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'"
            java.lang.String.format(r0, r7)
            java.util.zip.ZipFile r7 = r4.f44424c
            java.util.zip.ZipEntry r5 = r5.f44426b
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            boolean r3 = r6.exists()
            if (r3 == 0) goto L_0x004b
            r6.delete()
        L_0x004b:
            java.io.InputStream r5 = r7.getInputStream(r5)
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0070 }
            r7.<init>(r6)     // Catch:{ all -> 0x0070 }
            r6.setWritable(r1, r2)     // Catch:{ all -> 0x006b }
            r6.setWritable(r1, r1)     // Catch:{ all -> 0x006b }
        L_0x005a:
            int r6 = r5.read(r0)     // Catch:{ all -> 0x006b }
            if (r6 <= 0) goto L_0x0064
            r7.write(r0, r1, r6)     // Catch:{ all -> 0x006b }
            goto L_0x005a
        L_0x0064:
            r7.close()     // Catch:{ all -> 0x0070 }
            r5.close()
            return
        L_0x006b:
            r6 = move-exception
            r7.close()     // Catch:{ all -> 0x006f }
        L_0x006f:
            throw r6     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r6 = move-exception
            if (r5 == 0) goto L_0x0076
            r5.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r6
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p506gd.C17178i.mo49765a(gd.l, java.io.File, boolean):void");
    }
}
