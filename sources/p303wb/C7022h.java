package p303wb;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.text.TextUtils;
import ce0.C21100e;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p277ub.C6811x;
import p290vb.C6941g;

/* renamed from: wb.h */
public final class C7022h implements C6941g, C7012a {

    /* renamed from: b */
    public final AtomicBoolean f21855b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f21856c = new AtomicBoolean(true);

    /* renamed from: d */
    public final C7019f f21857d = new C7019f();

    /* renamed from: e */
    public final C7014c f21858e = new C7014c();

    /* renamed from: f */
    public final C6811x f21859f = new C6811x();

    /* renamed from: g */
    public final C6811x f21860g = new C6811x();

    /* renamed from: h */
    public final float[] f21861h = new float[16];

    /* renamed from: i */
    public final float[] f21862i = new float[16];

    /* renamed from: j */
    public int f21863j;

    /* renamed from: k */
    public SurfaceTexture f21864k;

    /* renamed from: l */
    public volatile int f21865l = 0;

    /* renamed from: m */
    public int f21866m = -1;

    /* renamed from: n */
    public byte[] f21867n;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20428a(long r33, long r35, com.google.android.exoplayer2.Format r37, android.media.MediaFormat r38) {
        /*
            r32 = this;
            r0 = r32
            r1 = r35
            r3 = r37
            ub.x r4 = r0.f21859f
            java.lang.Long r5 = java.lang.Long.valueOf(r33)
            r4.mo23024a(r1, r5)
            byte[] r4 = r3.f13428w
            int r3 = r3.f13429x
            byte[] r5 = r0.f21867n
            int r6 = r0.f21866m
            r0.f21867n = r4
            r4 = -1
            if (r3 != r4) goto L_0x001e
            int r3 = r0.f21865l
        L_0x001e:
            r0.f21866m = r3
            if (r6 != r3) goto L_0x002c
            byte[] r3 = r0.f21867n
            boolean r3 = java.util.Arrays.equals(r5, r3)
            if (r3 == 0) goto L_0x002c
            goto L_0x01f4
        L_0x002c:
            byte[] r3 = r0.f21867n
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x00b1
            int r8 = r0.f21866m
            ub.r r9 = new ub.r
            r9.<init>((byte[]) r3)
            r3 = 4
            r9.mo22981A(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r3 = r9.mo22984c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r9.mo23007z(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r10 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r3 != r10) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 == 0) goto L_0x0081
            r3 = 8
            r9.mo22981A(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r3 = r9.f21039b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r10 = r9.f21040c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
        L_0x0059:
            if (r3 >= r10) goto L_0x0087
            int r11 = r9.mo22984c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r11 = r11 + r3
            if (r11 <= r3) goto L_0x0087
            if (r11 <= r10) goto L_0x0065
            goto L_0x0087
        L_0x0065:
            int r3 = r9.mo22984c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r12 = 2037673328(0x79746d70, float:7.9321256E34)
            if (r3 == r12) goto L_0x0079
            r12 = 1836279920(0x6d736870, float:4.7081947E27)
            if (r3 != r12) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r9.mo23007z(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r3 = r11
            goto L_0x0059
        L_0x0079:
            r9.mo23006y(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            java.util.ArrayList r3 = p303wb.C7018e.m16511a(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            goto L_0x0088
        L_0x0081:
            java.util.ArrayList r3 = p303wb.C7018e.m16511a(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            goto L_0x0088
        L_0x0086:
        L_0x0087:
            r3 = r4
        L_0x0088:
            if (r3 != 0) goto L_0x008b
            goto L_0x00b1
        L_0x008b:
            int r9 = r3.size()
            if (r9 == r7) goto L_0x00a6
            if (r9 == r5) goto L_0x0094
            goto L_0x00b1
        L_0x0094:
            wb.d r4 = new wb.d
            java.lang.Object r9 = r3.get(r6)
            wb.d$a r9 = (p303wb.C7015d.C7016a) r9
            java.lang.Object r3 = r3.get(r7)
            wb.d$a r3 = (p303wb.C7015d.C7016a) r3
            r4.<init>(r9, r3, r8)
            goto L_0x00b1
        L_0x00a6:
            wb.d r4 = new wb.d
            java.lang.Object r3 = r3.get(r6)
            wb.d$a r3 = (p303wb.C7015d.C7016a) r3
            r4.<init>(r3, r3, r8)
        L_0x00b1:
            if (r4 == 0) goto L_0x00bb
            boolean r3 = p303wb.C7019f.m16512a(r4)
            if (r3 == 0) goto L_0x00bb
            goto L_0x01ed
        L_0x00bb:
            int r3 = r0.f21866m
            r4 = 1127481344(0x43340000, float:180.0)
            double r8 = (double) r4
            double r8 = java.lang.Math.toRadians(r8)
            float r4 = (float) r8
            r8 = 1135869952(0x43b40000, float:360.0)
            double r8 = (double) r8
            double r8 = java.lang.Math.toRadians(r8)
            float r8 = (float) r8
            r9 = 36
            float r10 = (float) r9
            float r10 = r4 / r10
            r11 = 72
            float r12 = (float) r11
            float r12 = r8 / r12
            r13 = 15984(0x3e70, float:2.2398E-41)
            float[] r13 = new float[r13]
            r14 = 10656(0x29a0, float:1.4932E-41)
            float[] r14 = new float[r14]
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x00e4:
            if (r15 >= r9) goto L_0x01d4
            float r9 = (float) r15
            float r9 = r9 * r10
            r18 = 1073741824(0x40000000, float:2.0)
            float r19 = r4 / r18
            float r9 = r9 - r19
            int r6 = r15 + 1
            float r7 = (float) r6
            float r7 = r7 * r10
            float r7 = r7 - r19
            r11 = 0
        L_0x00f7:
            r5 = 73
            if (r11 >= r5) goto L_0x01c3
            r20 = r6
            r5 = 0
            r6 = 2
        L_0x00ff:
            if (r5 >= r6) goto L_0x01a7
            if (r5 != 0) goto L_0x0107
            r21 = r7
            r6 = r9
            goto L_0x010a
        L_0x0107:
            r6 = r7
            r21 = r6
        L_0x010a:
            float r7 = (float) r11
            float r7 = r7 * r12
            r22 = 1078530011(0x40490fdb, float:3.1415927)
            float r22 = r7 + r22
            float r23 = r8 / r18
            r24 = r9
            float r9 = r22 - r23
            int r22 = r16 + 1
            r23 = r12
            r12 = 1112014848(0x42480000, float:50.0)
            double r1 = (double) r12
            r25 = r11
            double r11 = (double) r9
            double r26 = java.lang.Math.sin(r11)
            double r26 = r26 * r1
            r9 = r3
            r28 = r4
            double r3 = (double) r6
            double r29 = java.lang.Math.cos(r3)
            r31 = r9
            r6 = r10
            double r9 = r29 * r26
            float r9 = (float) r9
            float r9 = -r9
            r13[r16] = r9
            int r9 = r22 + 1
            double r26 = java.lang.Math.sin(r3)
            r10 = r5
            r29 = r6
            double r5 = r26 * r1
            float r5 = (float) r5
            r13[r22] = r5
            int r5 = r9 + 1
            double r11 = java.lang.Math.cos(r11)
            double r11 = r11 * r1
            double r1 = java.lang.Math.cos(r3)
            double r1 = r1 * r11
            float r1 = (float) r1
            r13[r9] = r1
            int r1 = r17 + 1
            float r7 = r7 / r8
            r14[r17] = r7
            int r2 = r1 + 1
            int r3 = r15 + r10
            float r3 = (float) r3
            float r3 = r3 * r29
            float r3 = r3 / r28
            r14[r1] = r3
            if (r25 != 0) goto L_0x0173
            if (r10 == 0) goto L_0x016d
            goto L_0x0173
        L_0x016d:
            r4 = r10
            r1 = r25
            r3 = 72
            goto L_0x017d
        L_0x0173:
            r1 = r25
            r3 = 72
            r4 = r10
            if (r1 != r3) goto L_0x018e
            r6 = 1
            if (r4 != r6) goto L_0x018e
        L_0x017d:
            int r6 = r5 + -3
            r7 = 3
            java.lang.System.arraycopy(r13, r6, r13, r5, r7)
            int r5 = r5 + 3
            int r6 = r2 + -2
            r7 = 2
            java.lang.System.arraycopy(r14, r6, r14, r2, r7)
            int r2 = r2 + 2
            goto L_0x018f
        L_0x018e:
            r7 = 2
        L_0x018f:
            r17 = r2
            r16 = r5
            int r5 = r4 + 1
            r11 = r1
            r7 = r21
            r12 = r23
            r9 = r24
            r4 = r28
            r10 = r29
            r3 = r31
            r6 = 2
            r1 = r35
            goto L_0x00ff
        L_0x01a7:
            r31 = r3
            r28 = r4
            r21 = r7
            r24 = r9
            r29 = r10
            r1 = r11
            r23 = r12
            r3 = 72
            r7 = 2
            int r11 = r1 + 1
            r1 = r35
            r6 = r20
            r7 = r21
            r3 = r31
            goto L_0x00f7
        L_0x01c3:
            r31 = r3
            r20 = r6
            r1 = r35
            r15 = r20
            r5 = 2
            r6 = 0
            r7 = 1
            r9 = 36
            r11 = 72
            goto L_0x00e4
        L_0x01d4:
            r31 = r3
            wb.d$b r1 = new wb.d$b
            r2 = 0
            r3 = 1
            r1.<init>(r2, r13, r14, r3)
            wb.d r4 = new wb.d
            wb.d$a r5 = new wb.d$a
            wb.d$b[] r3 = new p303wb.C7015d.C7017b[r3]
            r3[r2] = r1
            r5.<init>(r3)
            r1 = r31
            r4.<init>(r5, r5, r1)
        L_0x01ed:
            ub.x r1 = r0.f21860g
            r2 = r35
            r1.mo23024a(r2, r4)
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p303wb.C7022h.mo20428a(long, long, com.google.android.exoplayer2.Format, android.media.MediaFormat):void");
    }

    /* renamed from: b */
    public final void mo20429b(long j, float[] fArr) {
        this.f21858e.f21826c.mo23024a(j, fArr);
    }

    /* renamed from: c */
    public final void mo20430c() {
        this.f21859f.mo23025b();
        C7014c cVar = this.f21858e;
        cVar.f21826c.mo23025b();
        cVar.f21827d = false;
        this.f21856c.set(true);
    }

    /* renamed from: d */
    public final SurfaceTexture mo23263d() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C21100e.m49353n();
        C7019f fVar = this.f21857d;
        fVar.getClass();
        int C = C21100e.m49300C(TextUtils.join("\n", C7019f.f21837i), TextUtils.join("\n", C7019f.f21838j));
        fVar.f21844c = C;
        fVar.f21845d = GLES20.glGetUniformLocation(C, "uMvpMatrix");
        fVar.f21846e = GLES20.glGetUniformLocation(fVar.f21844c, "uTexMatrix");
        fVar.f21847f = GLES20.glGetAttribLocation(fVar.f21844c, "aPosition");
        fVar.f21848g = GLES20.glGetAttribLocation(fVar.f21844c, "aTexCoords");
        fVar.f21849h = GLES20.glGetUniformLocation(fVar.f21844c, "uTexture");
        C21100e.m49353n();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        C21100e.m49353n();
        this.f21863j = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f21863j);
        this.f21864k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C7021g(this));
        return this.f21864k;
    }
}
