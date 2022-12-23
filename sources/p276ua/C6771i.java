package p276ua;

import com.appboy.support.ValidationUtils;
import java.util.Arrays;
import p173ma.C5757x;
import p277ub.C6803r;
import p583jk.C17875h;

/* renamed from: ua.i */
public final class C6771i extends C6768h {

    /* renamed from: n */
    public C6772a f20949n;

    /* renamed from: o */
    public int f20950o;

    /* renamed from: p */
    public boolean f20951p;

    /* renamed from: q */
    public C5757x.C5760c f20952q;

    /* renamed from: r */
    public C5757x.C5758a f20953r;

    /* renamed from: ua.i$a */
    public static final class C6772a {

        /* renamed from: a */
        public final C5757x.C5760c f20954a;

        /* renamed from: b */
        public final byte[] f20955b;

        /* renamed from: c */
        public final C5757x.C5759b[] f20956c;

        /* renamed from: d */
        public final int f20957d;

        public C6772a(C5757x.C5760c cVar, byte[] bArr, C5757x.C5759b[] bVarArr, int i) {
            this.f20954a = cVar;
            this.f20955b = bArr;
            this.f20956c = bVarArr;
            this.f20957d = i;
        }
    }

    /* renamed from: a */
    public final void mo22941a(long j) {
        boolean z;
        this.f20940g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20951p = z;
        C5757x.C5760c cVar = this.f20952q;
        if (cVar != null) {
            i = cVar.f18646e;
        }
        this.f20950o = i;
    }

    /* renamed from: b */
    public final long mo22934b(C6803r rVar) {
        int i;
        int i2 = 0;
        byte b = rVar.f21038a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        C6772a aVar = this.f20949n;
        C17875h.m44306q(aVar);
        if (!aVar.f20956c[(b >> 1) & (ValidationUtils.APPBOY_STRING_MAX_LENGTH >>> (8 - aVar.f20957d))].f18641a) {
            i = aVar.f20954a.f18646e;
        } else {
            i = aVar.f20954a.f18647f;
        }
        if (this.f20951p) {
            i2 = (this.f20950o + i) / 4;
        }
        long j = (long) i2;
        byte[] bArr = rVar.f21038a;
        int length = bArr.length;
        int i3 = rVar.f21040c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            rVar.mo23005x(copyOf.length, copyOf);
        } else {
            rVar.mo23006y(i3);
        }
        byte[] bArr2 = rVar.f21038a;
        int i4 = rVar.f21040c;
        bArr2[i4 - 4] = (byte) ((int) (j & 255));
        bArr2[i4 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr2[i4 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr2[i4 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f20951p = true;
        this.f20950o = i;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x037c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x037e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo22935c(p277ub.C6803r r18, long r19, p276ua.C6768h.C6769a r21) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r21
            ua.i$a r3 = r0.f20949n
            r4 = 0
            if (r3 == 0) goto L_0x0011
            com.google.android.exoplayer2.Format r1 = r2.f20947a
            r1.getClass()
            return r4
        L_0x0011:
            ma.x$c r3 = r0.f20952q
            r5 = 1
            if (r3 != 0) goto L_0x0068
            p173ma.C5757x.m14169b(r5, r1, r4)
            r18.mo22989h()
            int r7 = r18.mo22997p()
            int r8 = r18.mo22989h()
            int r3 = r18.mo22986e()
            if (r3 > 0) goto L_0x002d
            r3 = -1
            r9 = -1
            goto L_0x002e
        L_0x002d:
            r9 = r3
        L_0x002e:
            int r3 = r18.mo22986e()
            if (r3 > 0) goto L_0x0037
            r3 = -1
            r10 = -1
            goto L_0x0038
        L_0x0037:
            r10 = r3
        L_0x0038:
            r18.mo22986e()
            int r3 = r18.mo22997p()
            r4 = r3 & 15
            double r4 = (double) r4
            r11 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = java.lang.Math.pow(r11, r4)
            int r4 = (int) r4
            r3 = r3 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >> 4
            double r5 = (double) r3
            double r5 = java.lang.Math.pow(r11, r5)
            int r12 = (int) r5
            r18.mo22997p()
            byte[] r3 = r1.f21038a
            int r1 = r1.f21040c
            byte[] r13 = java.util.Arrays.copyOf(r3, r1)
            ma.x$c r1 = new ma.x$c
            r6 = r1
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.f20952q = r1
            goto L_0x0072
        L_0x0068:
            ma.x$a r6 = r0.f20953r
            if (r6 != 0) goto L_0x0075
            ma.x$a r1 = p173ma.C5757x.m14168a(r1, r5, r5)
            r0.f20953r = r1
        L_0x0072:
            r1 = 0
            goto L_0x0378
        L_0x0075:
            int r6 = r1.f21040c
            byte[] r7 = new byte[r6]
            byte[] r8 = r1.f21038a
            java.lang.System.arraycopy(r8, r4, r7, r4, r6)
            int r6 = r3.f18642a
            r8 = 5
            p173ma.C5757x.m14169b(r8, r1, r4)
            int r4 = r18.mo22997p()
            int r4 = r4 + r5
            ma.w r5 = new ma.w
            byte[] r9 = r1.f21038a
            r5.<init>(r9)
            int r1 = r1.f21039b
            int r1 = r1 * 8
            r5.mo21614e(r1)
            r1 = 0
        L_0x0098:
            r9 = 16
            r10 = 24
            if (r1 >= r4) goto L_0x017e
            int r11 = r5.mo21613d(r10)
            r12 = 5653314(0x564342, float:7.92198E-39)
            if (r11 != r12) goto L_0x0169
            int r9 = r5.mo21613d(r9)
            int r10 = r5.mo21613d(r10)
            long[] r11 = new long[r10]
            boolean r12 = r5.mo21612c()
            if (r12 != 0) goto L_0x00e3
            boolean r12 = r5.mo21612c()
            r15 = 0
        L_0x00bc:
            if (r15 >= r10) goto L_0x0112
            if (r12 == 0) goto L_0x00d5
            boolean r16 = r5.mo21612c()
            if (r16 == 0) goto L_0x00d0
            int r16 = r5.mo21613d(r8)
            int r13 = r16 + 1
            long r13 = (long) r13
            r11[r15] = r13
            goto L_0x00e0
        L_0x00d0:
            r13 = 0
            r11[r15] = r13
            goto L_0x00e0
        L_0x00d5:
            r13 = 0
            int r16 = r5.mo21613d(r8)
            int r13 = r16 + 1
            long r13 = (long) r13
            r11[r15] = r13
        L_0x00e0:
            int r15 = r15 + 1
            goto L_0x00bc
        L_0x00e3:
            int r8 = r5.mo21613d(r8)
            int r8 = r8 + 1
            r12 = 0
        L_0x00ea:
            if (r12 >= r10) goto L_0x0112
            int r13 = r10 - r12
            r14 = 0
        L_0x00ef:
            if (r13 <= 0) goto L_0x00f6
            int r14 = r14 + 1
            int r13 = r13 >>> 1
            goto L_0x00ef
        L_0x00f6:
            int r13 = r5.mo21613d(r14)
            r14 = 0
        L_0x00fb:
            if (r14 >= r13) goto L_0x010b
            if (r12 >= r10) goto L_0x010b
            r15 = r3
            long r2 = (long) r8
            r11[r12] = r2
            int r12 = r12 + 1
            int r14 = r14 + 1
            r2 = r21
            r3 = r15
            goto L_0x00fb
        L_0x010b:
            r15 = r3
            int r8 = r8 + 1
            r2 = r21
            r3 = r15
            goto L_0x00ea
        L_0x0112:
            r15 = r3
            r2 = 4
            int r3 = r5.mo21613d(r2)
            r8 = 2
            if (r3 > r8) goto L_0x015b
            r11 = 1
            if (r3 == r11) goto L_0x0120
            if (r3 != r8) goto L_0x0153
        L_0x0120:
            r8 = 32
            r5.mo21614e(r8)
            r5.mo21614e(r8)
            int r2 = r5.mo21613d(r2)
            int r2 = r2 + r11
            r5.mo21614e(r11)
            if (r3 != r11) goto L_0x0148
            if (r9 == 0) goto L_0x0145
            long r10 = (long) r10
            long r8 = (long) r9
            double r10 = (double) r10
            double r8 = (double) r8
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 / r8
            double r8 = java.lang.Math.pow(r10, r12)
            double r8 = java.lang.Math.floor(r8)
            long r13 = (long) r8
            goto L_0x014c
        L_0x0145:
            r13 = 0
            goto L_0x014c
        L_0x0148:
            long r10 = (long) r10
            long r8 = (long) r9
            long r13 = r10 * r8
        L_0x014c:
            long r2 = (long) r2
            long r2 = r2 * r13
            int r3 = (int) r2
            r5.mo21614e(r3)
        L_0x0153:
            int r1 = r1 + 1
            r8 = 5
            r2 = r21
            r3 = r15
            goto L_0x0098
        L_0x015b:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 53
            java.lang.String r4 = "lookup type greater than 2 not decodable: "
            java.lang.String r2 = p379.C13715c.m34241g(r2, r4, r3)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0169:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            int r2 = r5.f18637b
            int r2 = r2 * 8
            int r3 = r5.f18638c
            int r2 = r2 + r3
            r3 = 66
            java.lang.String r4 = "expected code book to start with [0x56, 0x43, 0x42] at "
            java.lang.String r2 = p379.C13715c.m34241g(r3, r4, r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x017e:
            r15 = r3
            r1 = 6
            int r2 = r5.mo21613d(r1)
            int r2 = r2 + 1
            r3 = 0
        L_0x0187:
            if (r3 >= r2) goto L_0x019a
            int r4 = r5.mo21613d(r9)
            if (r4 != 0) goto L_0x0192
            int r3 = r3 + 1
            goto L_0x0187
        L_0x0192:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x019a:
            int r2 = r5.mo21613d(r1)
            r3 = 1
            int r2 = r2 + r3
            r4 = 0
        L_0x01a1:
            r8 = 3
            if (r4 >= r2) goto L_0x024f
            int r1 = r5.mo21613d(r9)
            if (r1 == 0) goto L_0x0221
            if (r1 != r3) goto L_0x0213
            r1 = 5
            int r1 = r5.mo21613d(r1)
            int[] r3 = new int[r1]
            r10 = 0
            r11 = -1
        L_0x01b5:
            if (r10 >= r1) goto L_0x01c4
            r12 = 4
            int r12 = r5.mo21613d(r12)
            r3[r10] = r12
            if (r12 <= r11) goto L_0x01c1
            r11 = r12
        L_0x01c1:
            int r10 = r10 + 1
            goto L_0x01b5
        L_0x01c4:
            int r11 = r11 + 1
            int[] r10 = new int[r11]
            r12 = 0
        L_0x01c9:
            if (r12 >= r11) goto L_0x01f5
            int r8 = r5.mo21613d(r8)
            r13 = 1
            int r8 = r8 + 1
            r10[r12] = r8
            r8 = 2
            int r8 = r5.mo21613d(r8)
            r14 = 8
            if (r8 <= 0) goto L_0x01e0
            r5.mo21614e(r14)
        L_0x01e0:
            r16 = 0
            r9 = 0
        L_0x01e3:
            int r13 = r13 << r8
            if (r9 >= r13) goto L_0x01ef
            r5.mo21614e(r14)
            int r9 = r9 + 1
            r14 = 8
            r13 = 1
            goto L_0x01e3
        L_0x01ef:
            int r12 = r12 + 1
            r8 = 3
            r9 = 16
            goto L_0x01c9
        L_0x01f5:
            r8 = 2
            r5.mo21614e(r8)
            r8 = 4
            int r8 = r5.mo21613d(r8)
            r9 = 0
            r11 = 0
            r12 = 0
        L_0x0201:
            if (r9 >= r1) goto L_0x0247
            r13 = r3[r9]
            r13 = r10[r13]
            int r11 = r11 + r13
        L_0x0208:
            if (r12 >= r11) goto L_0x0210
            r5.mo21614e(r8)
            int r12 = r12 + 1
            goto L_0x0208
        L_0x0210:
            int r9 = r9 + 1
            goto L_0x0201
        L_0x0213:
            com.google.android.exoplayer2.ParserException r2 = new com.google.android.exoplayer2.ParserException
            r3 = 52
            java.lang.String r4 = "floor type greater than 1 not decodable: "
            java.lang.String r1 = p379.C13715c.m34241g(r3, r4, r1)
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x0221:
            r1 = 8
            r5.mo21614e(r1)
            r3 = 16
            r5.mo21614e(r3)
            r5.mo21614e(r3)
            r3 = 6
            r5.mo21614e(r3)
            r5.mo21614e(r1)
            r3 = 4
            int r3 = r5.mo21613d(r3)
            int r3 = r3 + 1
            r8 = 0
        L_0x023d:
            if (r8 >= r3) goto L_0x0247
            r5.mo21614e(r1)
            int r8 = r8 + 1
            r1 = 8
            goto L_0x023d
        L_0x0247:
            int r4 = r4 + 1
            r1 = 6
            r3 = 1
            r9 = 16
            goto L_0x01a1
        L_0x024f:
            int r2 = r5.mo21613d(r1)
            r3 = 1
            int r2 = r2 + r3
            r4 = 0
        L_0x0256:
            if (r4 >= r2) goto L_0x02bc
            r8 = 16
            int r9 = r5.mo21613d(r8)
            r8 = 2
            if (r9 > r8) goto L_0x02b4
            r8 = 24
            r5.mo21614e(r8)
            r5.mo21614e(r8)
            r5.mo21614e(r8)
            int r1 = r5.mo21613d(r1)
            int r1 = r1 + r3
            r3 = 8
            r5.mo21614e(r3)
            int[] r8 = new int[r1]
            r9 = 0
        L_0x0279:
            if (r9 >= r1) goto L_0x0295
            r10 = 3
            int r10 = r5.mo21613d(r10)
            boolean r11 = r5.mo21612c()
            if (r11 == 0) goto L_0x028c
            r11 = 5
            int r11 = r5.mo21613d(r11)
            goto L_0x028d
        L_0x028c:
            r11 = 0
        L_0x028d:
            int r11 = r11 * 8
            int r11 = r11 + r10
            r8[r9] = r11
            int r9 = r9 + 1
            goto L_0x0279
        L_0x0295:
            r9 = 0
        L_0x0296:
            if (r9 >= r1) goto L_0x02af
            r10 = 0
        L_0x0299:
            if (r10 >= r3) goto L_0x02aa
            r11 = r8[r9]
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 & r12
            if (r11 == 0) goto L_0x02a5
            r5.mo21614e(r3)
        L_0x02a5:
            int r10 = r10 + 1
            r3 = 8
            goto L_0x0299
        L_0x02aa:
            int r9 = r9 + 1
            r3 = 8
            goto L_0x0296
        L_0x02af:
            int r4 = r4 + 1
            r1 = 6
            r3 = 1
            goto L_0x0256
        L_0x02b4:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "residueType greater than 2 is not decodable"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02bc:
            int r1 = r5.mo21613d(r1)
            int r1 = r1 + 1
            r2 = 0
        L_0x02c3:
            if (r2 >= r1) goto L_0x033b
            r3 = 16
            int r4 = r5.mo21613d(r3)
            if (r4 == 0) goto L_0x02ce
            goto L_0x032f
        L_0x02ce:
            boolean r3 = r5.mo21612c()
            if (r3 == 0) goto L_0x02dc
            r3 = 4
            int r3 = r5.mo21613d(r3)
            int r3 = r3 + 1
            goto L_0x02dd
        L_0x02dc:
            r3 = 1
        L_0x02dd:
            boolean r4 = r5.mo21612c()
            if (r4 == 0) goto L_0x030a
            r4 = 8
            int r4 = r5.mo21613d(r4)
            int r4 = r4 + 1
            r8 = 0
        L_0x02ec:
            if (r8 >= r4) goto L_0x030a
            int r9 = r6 + -1
            r10 = 0
            r11 = r9
        L_0x02f2:
            if (r11 <= 0) goto L_0x02f9
            int r10 = r10 + 1
            int r11 = r11 >>> 1
            goto L_0x02f2
        L_0x02f9:
            r5.mo21614e(r10)
            r10 = 0
        L_0x02fd:
            if (r9 <= 0) goto L_0x0304
            int r10 = r10 + 1
            int r9 = r9 >>> 1
            goto L_0x02fd
        L_0x0304:
            r5.mo21614e(r10)
            int r8 = r8 + 1
            goto L_0x02ec
        L_0x030a:
            r4 = 2
            int r4 = r5.mo21613d(r4)
            if (r4 != 0) goto L_0x0332
            r4 = 1
            if (r3 <= r4) goto L_0x031e
            r4 = 0
        L_0x0315:
            r8 = 4
            if (r4 >= r6) goto L_0x031e
            r5.mo21614e(r8)
            int r4 = r4 + 1
            goto L_0x0315
        L_0x031e:
            r4 = 0
        L_0x031f:
            if (r4 >= r3) goto L_0x032f
            r8 = 8
            r5.mo21614e(r8)
            r5.mo21614e(r8)
            r5.mo21614e(r8)
            int r4 = r4 + 1
            goto L_0x031f
        L_0x032f:
            int r2 = r2 + 1
            goto L_0x02c3
        L_0x0332:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "to reserved bits must be zero after mapping coupling steps"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x033b:
            r1 = 6
            int r1 = r5.mo21613d(r1)
            int r1 = r1 + 1
            ma.x$b[] r2 = new p173ma.C5757x.C5759b[r1]
            r3 = 0
        L_0x0345:
            if (r3 >= r1) goto L_0x0362
            boolean r4 = r5.mo21612c()
            r6 = 16
            r5.mo21613d(r6)
            r5.mo21613d(r6)
            r8 = 8
            r5.mo21613d(r8)
            ma.x$b r8 = new ma.x$b
            r8.<init>(r4)
            r2[r3] = r8
            int r3 = r3 + 1
            goto L_0x0345
        L_0x0362:
            boolean r3 = r5.mo21612c()
            if (r3 == 0) goto L_0x03b5
            int r1 = r1 + -1
            r3 = 0
        L_0x036b:
            if (r1 <= 0) goto L_0x0372
            int r3 = r3 + 1
            int r1 = r1 >>> 1
            goto L_0x036b
        L_0x0372:
            ua.i$a r1 = new ua.i$a
            r4 = r15
            r1.<init>(r4, r7, r2, r3)
        L_0x0378:
            r0.f20949n = r1
            if (r1 != 0) goto L_0x037e
            r1 = 1
            return r1
        L_0x037e:
            ma.x$c r2 = r1.f20954a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte[] r4 = r2.f18648g
            r3.add(r4)
            byte[] r1 = r1.f20955b
            r3.add(r1)
            com.google.android.exoplayer2.Format$b r1 = new com.google.android.exoplayer2.Format$b
            r1.<init>()
            java.lang.String r4 = "audio/vorbis"
            r1.f13446k = r4
            int r4 = r2.f18645d
            r1.f13441f = r4
            int r4 = r2.f18644c
            r1.f13442g = r4
            int r4 = r2.f18642a
            r1.f13459x = r4
            int r2 = r2.f18643b
            r1.f13460y = r2
            r1.f13448m = r3
            com.google.android.exoplayer2.Format r2 = new com.google.android.exoplayer2.Format
            r2.<init>((com.google.android.exoplayer2.Format.C3872b) r1)
            r1 = r21
            r1.f20947a = r2
            r1 = 1
            return r1
        L_0x03b5:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p276ua.C6771i.mo22935c(ub.r, long, ua.h$a):boolean");
    }

    /* renamed from: d */
    public final void mo22936d(boolean z) {
        super.mo22936d(z);
        if (z) {
            this.f20949n = null;
            this.f20952q = null;
            this.f20953r = null;
        }
        this.f20950o = 0;
        this.f20951p = false;
    }
}
