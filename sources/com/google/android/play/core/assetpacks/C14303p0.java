package com.google.android.play.core.assetpacks;

import androidx.appcompat.app.C0262r;
import p434dd.C16546c0;

/* renamed from: com.google.android.play.core.assetpacks.p0 */
public final class C14303p0 {

    /* renamed from: g */
    public static final C0262r f35979g = new C0262r("ExtractChunkTaskHandler");

    /* renamed from: a */
    public final byte[] f35980a = new byte[8192];

    /* renamed from: b */
    public final C14243a0 f35981b;

    /* renamed from: c */
    public final C16546c0 f35982c;

    /* renamed from: d */
    public final C16546c0 f35983d;

    /* renamed from: e */
    public final C14335x0 f35984e;

    /* renamed from: f */
    public final C14245a2 f35985f;

    public C14303p0(C14243a0 a0Var, C16546c0 c0Var, C16546c0 c0Var2, C14335x0 x0Var, C14245a2 a2Var) {
        this.f35981b = a0Var;
        this.f35982c = c0Var;
        this.f35983d = c0Var2;
        this.f35984e = x0Var;
        this.f35985f = a2Var;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:72|73|153|154|155|156) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x03d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00b2 */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0306 A[SYNTHETIC, Splitter:B:128:0x0306] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x03cb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b8 A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ee A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0239 A[Catch:{ all -> 0x01df }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:155:0x03d1=Splitter:B:155:0x03d1, B:121:0x02f6=Splitter:B:121:0x02f6} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42871a(com.google.android.play.core.assetpacks.C14299o0 r24) {
        /*
            r23 = this;
            r1 = r23
            r2 = r24
            com.google.android.play.core.assetpacks.l2 r0 = new com.google.android.play.core.assetpacks.l2
            com.google.android.play.core.assetpacks.a0 r10 = r1.f35981b
            java.lang.String r11 = r2.f35934b
            int r12 = r2.f35958c
            long r13 = r2.f35959d
            java.lang.String r15 = r2.f35961f
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            r3.<init>(r4, r5, r6, r7, r9)
            r10.getClass()
            java.io.File r3 = new java.io.File
            java.io.File r4 = new java.io.File
            java.io.File r5 = new java.io.File
            java.io.File r6 = r10.mo42788c(r12, r13, r11)
            java.lang.String r7 = "_slices"
            r5.<init>(r6, r7)
            java.lang.String r6 = "_metadata"
            r4.<init>(r5, r6)
            r3.<init>(r4, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x003c
            r3.mkdirs()
        L_0x003c:
            r10 = 2
            r12 = 1
            r13 = 3
            r14 = 0
            java.io.InputStream r3 = r2.f35967l     // Catch:{ IOException -> 0x03d2 }
            int r4 = r2.f35962g     // Catch:{ IOException -> 0x03d2 }
            r15 = 8192(0x2000, float:1.14794E-41)
            if (r4 == r12) goto L_0x004a
            r9 = r3
            goto L_0x0050
        L_0x004a:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x03d2 }
            r4.<init>(r3, r15)     // Catch:{ IOException -> 0x03d2 }
            r9 = r4
        L_0x0050:
            int r3 = r2.f35963h     // Catch:{ all -> 0x03cc }
            r16 = 0
            if (r3 <= 0) goto L_0x01b4
            com.google.android.play.core.assetpacks.h0 r3 = r0.mo42856b()     // Catch:{ all -> 0x03cc }
            int r4 = r3.f35892e     // Catch:{ all -> 0x03cc }
            int r5 = r2.f35963h     // Catch:{ all -> 0x03cc }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x0194
            int r4 = r3.f35888a     // Catch:{ all -> 0x03cc }
            if (r4 == r12) goto L_0x011d
            if (r4 == r10) goto L_0x00cb
            if (r4 != r13) goto L_0x00b3
            androidx.appcompat.app.r r4 = f35979g     // Catch:{ all -> 0x03cc }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x03cc }
            r4.mo974a(r5, r6)     // Catch:{ all -> 0x03cc }
            long r3 = r3.f35890c     // Catch:{ all -> 0x03cc }
            java.io.File r5 = r0.mo42857c()     // Catch:{ all -> 0x03cc }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x03cc }
            java.lang.String r7 = "rw"
            r6.<init>(r5, r7)     // Catch:{ all -> 0x03cc }
            r6.seek(r3)     // Catch:{ all -> 0x00ae }
        L_0x0083:
            byte[] r3 = r0.f35941a     // Catch:{ all -> 0x00ae }
            int r3 = r9.read(r3)     // Catch:{ all -> 0x00ae }
            if (r3 <= 0) goto L_0x0090
            byte[] r4 = r0.f35941a     // Catch:{ all -> 0x00ae }
            r6.write(r4, r14, r3)     // Catch:{ all -> 0x00ae }
        L_0x0090:
            if (r3 == r15) goto L_0x0083
            r6.close()     // Catch:{ all -> 0x03cc }
            int r3 = r2.f35963h     // Catch:{ all -> 0x03cc }
            int r3 = r3 + r12
            int r4 = r2.f35964i     // Catch:{ all -> 0x03cc }
            if (r3 != r4) goto L_0x009e
            r3 = 1
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            if (r3 == 0) goto L_0x00a4
            r10 = r9
            goto L_0x0186
        L_0x00a4:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.f35933a     // Catch:{ all -> 0x03cc }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x03cc }
            throw r0     // Catch:{ all -> 0x03cc }
        L_0x00ae:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            throw r0     // Catch:{ all -> 0x03cc }
        L_0x00b3:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x03cc }
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ all -> 0x03cc }
            int r3 = r3.f35888a     // Catch:{ all -> 0x03cc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x03cc }
            r4[r14] = r3     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x03cc }
            int r4 = r2.f35933a     // Catch:{ all -> 0x03cc }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x03cc }
            throw r0     // Catch:{ all -> 0x03cc }
        L_0x00cb:
            androidx.appcompat.app.r r3 = f35979g     // Catch:{ all -> 0x03cc }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x03cc }
            r3.mo974a(r4, r5)     // Catch:{ all -> 0x03cc }
            com.google.android.play.core.assetpacks.a0 r3 = r1.f35981b     // Catch:{ all -> 0x03cc }
            java.lang.String r4 = r2.f35934b     // Catch:{ all -> 0x03cc }
            int r5 = r2.f35958c     // Catch:{ all -> 0x03cc }
            long r6 = r2.f35959d     // Catch:{ all -> 0x03cc }
            java.lang.String r8 = r2.f35961f     // Catch:{ all -> 0x03cc }
            r3.getClass()     // Catch:{ all -> 0x03cc }
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x03cc }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x03cc }
            java.io.File r15 = new java.io.File     // Catch:{ all -> 0x03cc }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x03cc }
            java.io.File r3 = r3.mo42788c(r5, r6, r4)     // Catch:{ all -> 0x03cc }
            java.lang.String r4 = "_slices"
            r10.<init>(r3, r4)     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = "_metadata"
            r15.<init>(r10, r3)     // Catch:{ all -> 0x03cc }
            r11.<init>(r15, r8)     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = "checkpoint_ext.dat"
            r13.<init>(r11, r3)     // Catch:{ all -> 0x03cc }
            boolean r3 = r13.exists()     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x0113
            java.io.SequenceInputStream r3 = new java.io.SequenceInputStream     // Catch:{ all -> 0x03cc }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x03cc }
            r4.<init>(r13)     // Catch:{ all -> 0x03cc }
            r3.<init>(r4, r9)     // Catch:{ all -> 0x03cc }
            r10 = r9
            r9 = r3
            goto L_0x01b6
        L_0x0113:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x03cc }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.f35933a     // Catch:{ all -> 0x03cc }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x03cc }
            throw r0     // Catch:{ all -> 0x03cc }
        L_0x011d:
            androidx.appcompat.app.r r4 = f35979g     // Catch:{ all -> 0x03cc }
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ all -> 0x03cc }
            java.lang.String r6 = r3.f35889b     // Catch:{ all -> 0x03cc }
            r5[r14] = r6     // Catch:{ all -> 0x03cc }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.mo974a(r6, r5)     // Catch:{ all -> 0x03cc }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x03cc }
            java.lang.String r5 = r3.f35889b     // Catch:{ all -> 0x03cc }
            r4.<init>(r5)     // Catch:{ all -> 0x03cc }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x03cc }
            if (r5 == 0) goto L_0x0189
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x03cc }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x03cc }
            long r6 = r3.f35890c     // Catch:{ all -> 0x03cc }
            r5.seek(r6)     // Catch:{ all -> 0x03cc }
            long r6 = r3.f35891d     // Catch:{ all -> 0x03cc }
        L_0x0145:
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = java.lang.Math.min(r6, r10)     // Catch:{ all -> 0x03cc }
            int r3 = (int) r10     // Catch:{ all -> 0x03cc }
            byte[] r8 = r1.f35980a     // Catch:{ all -> 0x03cc }
            int r8 = r9.read(r8, r14, r3)     // Catch:{ all -> 0x03cc }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x03cc }
            if (r8 <= 0) goto L_0x015d
            byte[] r10 = r1.f35980a     // Catch:{ all -> 0x03cc }
            r5.write(r10, r14, r8)     // Catch:{ all -> 0x03cc }
        L_0x015d:
            long r10 = (long) r8     // Catch:{ all -> 0x03cc }
            long r6 = r6 - r10
            r10 = 0
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x0167
            if (r8 > 0) goto L_0x0145
        L_0x0167:
            long r10 = r5.length()     // Catch:{ all -> 0x03cc }
            r5.close()     // Catch:{ all -> 0x03cc }
            if (r8 == r3) goto L_0x01b4
            androidx.appcompat.app.r r3 = f35979g     // Catch:{ all -> 0x03cc }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x03cc }
            r3.mo974a(r5, r8)     // Catch:{ all -> 0x03cc }
            java.lang.String r13 = r4.getCanonicalPath()     // Catch:{ all -> 0x03cc }
            int r8 = r2.f35963h     // Catch:{ all -> 0x03cc }
            r3 = r0
            r4 = r10
            r10 = r9
            r9 = r13
            r3.mo42859e(r4, r6, r8, r9)     // Catch:{ all -> 0x01df }
        L_0x0186:
            r9 = r16
            goto L_0x01b6
        L_0x0189:
            r10 = r9
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.f35933a     // Catch:{ all -> 0x01df }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x01df }
            throw r0     // Catch:{ all -> 0x01df }
        L_0x0194:
            r10 = r9
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x01df }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x01df }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x01df }
            r7[r14] = r5     // Catch:{ all -> 0x01df }
            int r3 = r3.f35892e     // Catch:{ all -> 0x01df }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01df }
            r7[r12] = r3     // Catch:{ all -> 0x01df }
            java.lang.String r3 = java.lang.String.format(r4, r7)     // Catch:{ all -> 0x01df }
            int r4 = r2.f35933a     // Catch:{ all -> 0x01df }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x01df }
            throw r0     // Catch:{ all -> 0x01df }
        L_0x01b4:
            r10 = r9
            r9 = r10
        L_0x01b6:
            if (r9 == 0) goto L_0x02f6
            com.google.android.play.core.assetpacks.k0 r3 = new com.google.android.play.core.assetpacks.k0     // Catch:{ all -> 0x01df }
            r3.<init>(r9)     // Catch:{ all -> 0x01df }
            com.google.android.play.core.assetpacks.a0 r4 = r1.f35981b     // Catch:{ all -> 0x01df }
            java.lang.String r5 = r2.f35934b     // Catch:{ all -> 0x01df }
            int r6 = r2.f35958c     // Catch:{ all -> 0x01df }
            long r7 = r2.f35959d     // Catch:{ all -> 0x01df }
            java.lang.String r11 = r2.f35961f     // Catch:{ all -> 0x01df }
            r17 = r4
            r18 = r7
            r20 = r5
            r21 = r11
            r22 = r6
            java.io.File r4 = r17.mo42794k(r18, r20, r21, r22)     // Catch:{ all -> 0x01df }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x01df }
            if (r5 != 0) goto L_0x01e2
            r4.mkdirs()     // Catch:{ all -> 0x01df }
            goto L_0x01e2
        L_0x01df:
            r0 = move-exception
            goto L_0x03ce
        L_0x01e2:
            com.google.android.play.core.assetpacks.i0 r5 = r3.mo42849e()     // Catch:{ all -> 0x01df }
            boolean r6 = r5.f35901d     // Catch:{ all -> 0x01df }
            if (r6 != 0) goto L_0x0239
            boolean r6 = r3.f35932f     // Catch:{ all -> 0x01df }
            if (r6 != 0) goto L_0x0239
            int r6 = r5.mo42830a()     // Catch:{ all -> 0x01df }
            if (r6 != 0) goto L_0x01f6
            r6 = 1
            goto L_0x01f7
        L_0x01f6:
            r6 = 0
        L_0x01f7:
            if (r6 == 0) goto L_0x0231
            boolean r6 = r5.mo42882g()     // Catch:{ all -> 0x01df }
            if (r6 != 0) goto L_0x0231
            byte[] r6 = r5.f35903f     // Catch:{ all -> 0x01df }
            r0.mo42862h(r6)     // Catch:{ all -> 0x01df }
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x01df }
            java.lang.String r7 = r5.f35898a     // Catch:{ all -> 0x01df }
            r6.<init>(r4, r7)     // Catch:{ all -> 0x01df }
            java.io.File r7 = r6.getParentFile()     // Catch:{ all -> 0x01df }
            r7.mkdirs()     // Catch:{ all -> 0x01df }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x01df }
            r7.<init>(r6)     // Catch:{ all -> 0x01df }
            byte[] r6 = r1.f35980a     // Catch:{ all -> 0x01df }
            r8 = 8192(0x2000, float:1.14794E-41)
            int r6 = r3.read(r6, r14, r8)     // Catch:{ all -> 0x01df }
        L_0x021f:
            if (r6 <= 0) goto L_0x022d
            byte[] r11 = r1.f35980a     // Catch:{ all -> 0x01df }
            r7.write(r11, r14, r6)     // Catch:{ all -> 0x01df }
            byte[] r6 = r1.f35980a     // Catch:{ all -> 0x01df }
            int r6 = r3.read(r6, r14, r8)     // Catch:{ all -> 0x01df }
            goto L_0x021f
        L_0x022d:
            r7.close()     // Catch:{ all -> 0x01df }
            goto L_0x023b
        L_0x0231:
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = r5.f35903f     // Catch:{ all -> 0x01df }
            r0.mo42863i(r3, r6)     // Catch:{ all -> 0x01df }
            goto L_0x023b
        L_0x0239:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x023b:
            boolean r6 = r3.f35931e     // Catch:{ all -> 0x01df }
            if (r6 != 0) goto L_0x0243
            boolean r6 = r3.f35932f     // Catch:{ all -> 0x01df }
            if (r6 == 0) goto L_0x01e2
        L_0x0243:
            boolean r4 = r3.f35932f     // Catch:{ all -> 0x01df }
            if (r4 == 0) goto L_0x0255
            androidx.appcompat.app.r r4 = f35979g     // Catch:{ all -> 0x01df }
            java.lang.String r6 = "Writing central directory metadata."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x01df }
            r4.mo974a(r6, r7)     // Catch:{ all -> 0x01df }
            byte[] r4 = r5.f35903f     // Catch:{ all -> 0x01df }
            r0.mo42863i(r9, r4)     // Catch:{ all -> 0x01df }
        L_0x0255:
            int r4 = r2.f35963h     // Catch:{ all -> 0x01df }
            int r4 = r4 + r12
            int r6 = r2.f35964i     // Catch:{ all -> 0x01df }
            if (r4 != r6) goto L_0x025e
            r4 = 1
            goto L_0x025f
        L_0x025e:
            r4 = 0
        L_0x025f:
            if (r4 != 0) goto L_0x02f6
            boolean r4 = r5.f35901d     // Catch:{ all -> 0x01df }
            if (r4 == 0) goto L_0x0277
            androidx.appcompat.app.r r3 = f35979g     // Catch:{ all -> 0x01df }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x01df }
            r3.mo974a(r4, r6)     // Catch:{ all -> 0x01df }
            byte[] r3 = r5.f35903f     // Catch:{ all -> 0x01df }
            int r4 = r2.f35963h     // Catch:{ all -> 0x01df }
            r0.mo42860f(r4, r3)     // Catch:{ all -> 0x01df }
            goto L_0x02f6
        L_0x0277:
            boolean r4 = r3.f35932f     // Catch:{ all -> 0x01df }
            if (r4 == 0) goto L_0x028b
            androidx.appcompat.app.r r3 = f35979g     // Catch:{ all -> 0x01df }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x01df }
            r3.mo974a(r4, r5)     // Catch:{ all -> 0x01df }
            int r3 = r2.f35963h     // Catch:{ all -> 0x01df }
            r0.mo42858d(r3)     // Catch:{ all -> 0x01df }
            goto L_0x02f6
        L_0x028b:
            int r4 = r5.f35900c     // Catch:{ all -> 0x01df }
            if (r4 != 0) goto L_0x02d6
            androidx.appcompat.app.r r4 = f35979g     // Catch:{ all -> 0x01df }
            java.lang.String r6 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x01df }
            r4.mo974a(r6, r7)     // Catch:{ all -> 0x01df }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x01df }
            com.google.android.play.core.assetpacks.a0 r6 = r1.f35981b     // Catch:{ all -> 0x01df }
            java.lang.String r7 = r2.f35934b     // Catch:{ all -> 0x01df }
            int r8 = r2.f35958c     // Catch:{ all -> 0x01df }
            long r12 = r2.f35959d     // Catch:{ all -> 0x01df }
            java.lang.String r9 = r2.f35961f     // Catch:{ all -> 0x01df }
            r17 = r6
            r18 = r12
            r20 = r7
            r21 = r9
            r22 = r8
            java.io.File r6 = r17.mo42794k(r18, r20, r21, r22)     // Catch:{ all -> 0x01df }
            boolean r7 = r6.exists()     // Catch:{ all -> 0x01df }
            if (r7 != 0) goto L_0x02bb
            r6.mkdirs()     // Catch:{ all -> 0x01df }
        L_0x02bb:
            java.lang.String r7 = r5.f35898a     // Catch:{ all -> 0x01df }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x01df }
            long r5 = r5.f35899b     // Catch:{ all -> 0x01df }
            long r7 = r3.f35930d     // Catch:{ all -> 0x01df }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x01df }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x02ce
            goto L_0x02e7
        L_0x02ce:
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x01df }
            throw r0     // Catch:{ all -> 0x01df }
        L_0x02d6:
            androidx.appcompat.app.r r4 = f35979g     // Catch:{ all -> 0x01df }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x01df }
            r4.mo974a(r5, r6)     // Catch:{ all -> 0x01df }
            java.io.File r4 = r0.mo42857c()     // Catch:{ all -> 0x01df }
            long r5 = r4.length()     // Catch:{ all -> 0x01df }
        L_0x02e7:
            java.lang.String r9 = r4.getCanonicalPath()     // Catch:{ all -> 0x01df }
            long r7 = r3.f35930d     // Catch:{ all -> 0x01df }
            int r12 = r2.f35963h     // Catch:{ all -> 0x01df }
            r3 = r0
            r4 = r5
            r6 = r7
            r8 = r12
            r3.mo42859e(r4, r6, r8, r9)     // Catch:{ all -> 0x01df }
        L_0x02f6:
            r10.close()     // Catch:{ IOException -> 0x03d2 }
            int r3 = r2.f35963h
            int r4 = r3 + 1
            int r5 = r2.f35964i
            if (r4 != r5) goto L_0x0303
            r4 = 1
            goto L_0x0304
        L_0x0303:
            r4 = 0
        L_0x0304:
            if (r4 == 0) goto L_0x0326
            r0.mo42861g(r3)     // Catch:{ IOException -> 0x030a }
            goto L_0x0326
        L_0x030a:
            r0 = move-exception
            r3 = r0
            androidx.appcompat.app.r r0 = f35979g
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r3.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r0.mo975b(r5, r4)
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            int r2 = r2.f35933a
            r0.<init>(r4, r3, r2)
            throw r0
        L_0x0326:
            androidx.appcompat.app.r r0 = f35979g
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.f35963h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.f35961f
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = r2.f35934b
            r5 = 2
            r3[r5] = r4
            int r4 = r2.f35933a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.mo977d(r4, r3)
            dd.c0 r0 = r1.f35982c
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.y2 r0 = (com.google.android.play.core.assetpacks.C14341y2) r0
            int r3 = r2.f35933a
            java.lang.String r4 = r2.f35934b
            java.lang.String r5 = r2.f35961f
            int r6 = r2.f35963h
            r0.mo42876e(r3, r6, r4, r5)
            java.io.InputStream r0 = r2.f35967l     // Catch:{ IOException -> 0x0364 }
            r0.close()     // Catch:{ IOException -> 0x0364 }
            goto L_0x0380
        L_0x0364:
            androidx.appcompat.app.r r0 = f35979g
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.f35963h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.f35961f
            r5 = 1
            r4[r5] = r3
            java.lang.String r3 = r2.f35934b
            r5 = 2
            r4[r5] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.mo978e(r3, r4)
        L_0x0380:
            int r0 = r2.f35966k
            r3 = 3
            if (r0 != r3) goto L_0x03cb
            dd.c0 r0 = r1.f35983d
            java.lang.Object r0 = r0.zza()
            com.google.android.play.core.assetpacks.x r0 = (com.google.android.play.core.assetpacks.C14334x) r0
            java.lang.String r3 = r2.f35934b
            long r7 = r2.f35965j
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.x0 r6 = r1.f35984e
            monitor-enter(r6)
            int r9 = r2.f35963h     // Catch:{ all -> 0x03c8 }
            double r9 = (double) r9     // Catch:{ all -> 0x03c8 }
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 + r11
            int r11 = r2.f35964i     // Catch:{ all -> 0x03c8 }
            double r11 = (double) r11     // Catch:{ all -> 0x03c8 }
            double r9 = r9 / r11
            java.util.HashMap r11 = r6.f36118a     // Catch:{ all -> 0x03c8 }
            java.lang.Double r12 = java.lang.Double.valueOf(r9)     // Catch:{ all -> 0x03c8 }
            r11.put(r3, r12)     // Catch:{ all -> 0x03c8 }
            monitor-exit(r6)
            r11 = 1
            java.lang.String r12 = r2.f35960e
            com.google.android.play.core.assetpacks.a2 r6 = r1.f35985f
            java.lang.String r2 = r2.f35934b
            java.lang.String r13 = r6.mo42798a(r2)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.f0 r2 = com.google.android.play.core.assetpacks.AssetPackState.m35443h(r2, r3, r4, r5, r7, r9, r11, r12, r13)
            android.os.Handler r3 = r0.f36117o
            com.google.android.play.core.assetpacks.w r4 = new com.google.android.play.core.assetpacks.w
            r4.<init>(r14, r0, r2)
            r3.post(r4)
            return
        L_0x03c8:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x03cb:
            return
        L_0x03cc:
            r0 = move-exception
            r10 = r9
        L_0x03ce:
            r10.close()     // Catch:{ all -> 0x03d1 }
        L_0x03d1:
            throw r0     // Catch:{ IOException -> 0x03d2 }
        L_0x03d2:
            r0 = move-exception
            androidx.appcompat.app.r r3 = f35979g
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = r0.getMessage()
            r5[r14] = r6
            java.lang.String r6 = "IOException during extraction %s."
            r3.mo975b(r6, r5)
            com.google.android.play.core.assetpacks.zzck r3 = new com.google.android.play.core.assetpacks.zzck
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r6 = r2.f35963h
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r14] = r6
            java.lang.String r6 = r2.f35961f
            r5[r4] = r6
            java.lang.String r4 = r2.f35934b
            r6 = 2
            r5[r6] = r4
            int r4 = r2.f35933a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 3
            r5[r6] = r4
            java.lang.String r4 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r4, r5)
            int r2 = r2.f35933a
            r3.<init>(r4, r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14303p0.mo42871a(com.google.android.play.core.assetpacks.o0):void");
    }
}
