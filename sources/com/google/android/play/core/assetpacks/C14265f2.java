package com.google.android.play.core.assetpacks;

import androidx.appcompat.app.C0262r;
import p434dd.C16546c0;

/* renamed from: com.google.android.play.core.assetpacks.f2 */
public final class C14265f2 {

    /* renamed from: c */
    public static final C0262r f35865c = new C0262r("PatchSliceTaskHandler");

    /* renamed from: a */
    public final C14243a0 f35866a;

    /* renamed from: b */
    public final C16546c0 f35867b;

    public C14265f2(C14243a0 a0Var, C16546c0 c0Var) {
        this.f35866a = a0Var;
        this.f35867b = c0Var;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42817a(com.google.android.play.core.assetpacks.C14261e2 r15) {
        /*
            r14 = this;
            com.google.android.play.core.assetpacks.a0 r0 = r14.f35866a
            java.lang.String r1 = r15.f35934b
            int r2 = r15.f35840c
            long r3 = r15.f35841d
            java.io.File r0 = r0.mo42793j(r2, r3, r1)
            com.google.android.play.core.assetpacks.a0 r1 = r14.f35866a
            java.lang.String r2 = r15.f35934b
            int r3 = r15.f35840c
            long r4 = r15.f35841d
            java.lang.String r6 = r15.f35845h
            java.io.File r7 = new java.io.File
            r1.getClass()
            java.io.File r8 = new java.io.File
            java.io.File r1 = r1.mo42793j(r3, r4, r2)
            java.lang.String r2 = "_metadata"
            r8.<init>(r1, r2)
            r7.<init>(r8, r6)
            r1 = 2
            r2 = 1
            r3 = 0
            java.io.InputStream r4 = r15.f35847j     // Catch:{ IOException -> 0x00b6 }
            int r5 = r15.f35844g     // Catch:{ IOException -> 0x00b6 }
            if (r5 == r1) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x00b6 }
            r6 = 8192(0x2000, float:1.14794E-41)
            r5.<init>(r4, r6)     // Catch:{ IOException -> 0x00b6 }
            r4 = r5
        L_0x003b:
            com.google.android.play.core.assetpacks.d0 r5 = new com.google.android.play.core.assetpacks.d0     // Catch:{ all -> 0x00b1 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x00b1 }
            com.google.android.play.core.assetpacks.a0 r8 = r14.f35866a     // Catch:{ all -> 0x00b1 }
            java.lang.String r11 = r15.f35934b     // Catch:{ all -> 0x00b1 }
            int r13 = r15.f35842e     // Catch:{ all -> 0x00b1 }
            long r9 = r15.f35843f     // Catch:{ all -> 0x00b1 }
            java.lang.String r12 = r15.f35845h     // Catch:{ all -> 0x00b1 }
            java.io.File r0 = r8.mo42794k(r9, r11, r12, r13)     // Catch:{ all -> 0x00b1 }
            boolean r6 = r0.exists()     // Catch:{ all -> 0x00b1 }
            if (r6 != 0) goto L_0x0057
            r0.mkdirs()     // Catch:{ all -> 0x00b1 }
        L_0x0057:
            com.google.android.play.core.assetpacks.l2 r13 = new com.google.android.play.core.assetpacks.l2     // Catch:{ all -> 0x00b1 }
            com.google.android.play.core.assetpacks.a0 r7 = r14.f35866a     // Catch:{ all -> 0x00b1 }
            java.lang.String r8 = r15.f35934b     // Catch:{ all -> 0x00b1 }
            int r9 = r15.f35842e     // Catch:{ all -> 0x00b1 }
            long r10 = r15.f35843f     // Catch:{ all -> 0x00b1 }
            java.lang.String r12 = r15.f35845h     // Catch:{ all -> 0x00b1 }
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x00b1 }
            com.google.android.play.core.assetpacks.w0 r6 = new com.google.android.play.core.assetpacks.w0     // Catch:{ all -> 0x00b1 }
            r6.<init>(r0, r13)     // Catch:{ all -> 0x00b1 }
            long r7 = r15.f35846i     // Catch:{ all -> 0x00b1 }
            p434dd.C16590z.m42107b(r5, r4, r6, r7)     // Catch:{ all -> 0x00b1 }
            r13.mo42861g(r3)     // Catch:{ all -> 0x00b1 }
            r4.close()     // Catch:{ IOException -> 0x00b6 }
            androidx.appcompat.app.r r0 = f35865c
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f35845h
            r4[r3] = r5
            java.lang.String r5 = r15.f35934b
            r4[r2] = r5
            java.lang.String r5 = "Patching and extraction finished for slice %s of pack %s."
            r0.mo977d(r5, r4)
            dd.c0 r0 = r14.f35867b
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.y2 r0 = (com.google.android.play.core.assetpacks.C14341y2) r0
            int r4 = r15.f35933a
            java.lang.String r5 = r15.f35934b
            java.lang.String r6 = r15.f35845h
            r0.mo42876e(r4, r3, r5, r6)
            java.io.InputStream r0 = r15.f35847j     // Catch:{ IOException -> 0x009f }
            r0.close()     // Catch:{ IOException -> 0x009f }
            return
        L_0x009f:
            androidx.appcompat.app.r r0 = f35865c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r15.f35845h
            r1[r3] = r4
            java.lang.String r15 = r15.f35934b
            r1[r2] = r15
            java.lang.String r15 = "Could not close file for slice %s of pack %s."
            r0.mo978e(r15, r1)
            return
        L_0x00b1:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            throw r0     // Catch:{ IOException -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            androidx.appcompat.app.r r4 = f35865c
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r0.getMessage()
            r5[r3] = r6
            java.lang.String r6 = "IOException during patching %s."
            r4.mo975b(r6, r5)
            com.google.android.play.core.assetpacks.zzck r4 = new com.google.android.play.core.assetpacks.zzck
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f35845h
            r1[r3] = r5
            java.lang.String r3 = r15.f35934b
            r1[r2] = r3
            java.lang.String r2 = "Error patching slice %s of pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r15 = r15.f35933a
            r4.<init>(r1, r0, r15)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14265f2.mo42817a(com.google.android.play.core.assetpacks.e2):void");
    }
}
