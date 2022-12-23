package com.google.android.play.core.assetpacks;

import androidx.appcompat.app.C0262r;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import p356ad.C13413b;

/* renamed from: com.google.android.play.core.assetpacks.a2 */
public final class C14245a2 {

    /* renamed from: d */
    public static final C0262r f35796d = new C0262r("PackMetadataManager");

    /* renamed from: a */
    public final C14243a0 f35797a;

    /* renamed from: b */
    public final C14253c2 f35798b;

    /* renamed from: c */
    public final C13413b f35799c;

    public C14245a2(C14243a0 a0Var, C14253c2 c2Var, C13413b bVar) {
        this.f35797a = a0Var;
        this.f35798b = c2Var;
        this.f35799c = bVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0068 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo42798a(java.lang.String r9) {
        /*
            r8 = this;
            ad.b r0 = r8.f35799c
            boolean r0 = r0.mo40276a()
            if (r0 == 0) goto L_0x0074
            com.google.android.play.core.assetpacks.a0 r0 = r8.f35797a
            r0.getClass()
            r1 = 0
            r2 = 1
            java.lang.String r0 = r0.mo42796m(r9)     // Catch:{ IOException -> 0x0017 }
            if (r0 == 0) goto L_0x0018
            r0 = 1
            goto L_0x0019
        L_0x0017:
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 != 0) goto L_0x001c
            goto L_0x0074
        L_0x001c:
            com.google.android.play.core.assetpacks.c2 r0 = r8.f35798b
            int r0 = r0.mo42806a()
            com.google.android.play.core.assetpacks.a0 r3 = r8.f35797a
            long r4 = r3.mo42792i(r9)
            java.io.File r6 = new java.io.File
            java.io.File r7 = new java.io.File
            java.io.File r3 = r3.mo42793j(r0, r4, r9)
            java.lang.String r4 = "_metadata"
            r7.<init>(r3, r4)
            java.lang.String r3 = "properties.dat"
            r6.<init>(r7, r3)
            boolean r3 = r6.exists()     // Catch:{ IOException -> 0x0069 }
            if (r3 != 0) goto L_0x0045
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0063
        L_0x0045:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0069 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0069 }
            java.util.Properties r4 = new java.util.Properties     // Catch:{ all -> 0x0064 }
            r4.<init>()     // Catch:{ all -> 0x0064 }
            r4.load(r3)     // Catch:{ all -> 0x0064 }
            r3.close()     // Catch:{ IOException -> 0x0069 }
            java.lang.String r3 = "moduleVersionTag"
            java.lang.String r3 = r4.getProperty(r3)     // Catch:{ IOException -> 0x0069 }
            if (r3 != 0) goto L_0x0062
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0069 }
            goto L_0x0063
        L_0x0062:
            r9 = r3
        L_0x0063:
            return r9
        L_0x0064:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0068 }
        L_0x0068:
            throw r0     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            androidx.appcompat.app.r r0 = f35796d
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            java.lang.String r9 = "Failed to read pack version tag for pack %s"
            r0.mo975b(r9, r2)
        L_0x0074:
            java.lang.String r9 = ""
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14245a2.mo42798a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final void mo42799b(long j, String str, String str2, int i) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        C14243a0 a0Var = this.f35797a;
        a0Var.getClass();
        File file = new File(new File(a0Var.mo42793j(i, j, str), "_metadata"), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
