package p302wa;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6774a0;
import p277ub.C6803r;

/* renamed from: wa.a */
public final class C7004a implements C5735h {

    /* renamed from: a */
    public C5737j f21779a;

    /* renamed from: b */
    public C5754v f21780b;

    /* renamed from: c */
    public C7006b f21781c;

    /* renamed from: d */
    public int f21782d = -1;

    /* renamed from: e */
    public long f21783e = -1;

    /* renamed from: wa.a$a */
    public static final class C7005a implements C7006b {

        /* renamed from: m */
        public static final int[] f21784m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f21785n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final C5737j f21786a;

        /* renamed from: b */
        public final C5754v f21787b;

        /* renamed from: c */
        public final C7008b f21788c;

        /* renamed from: d */
        public final int f21789d;

        /* renamed from: e */
        public final byte[] f21790e;

        /* renamed from: f */
        public final C6803r f21791f;

        /* renamed from: g */
        public final int f21792g;

        /* renamed from: h */
        public final Format f21793h;

        /* renamed from: i */
        public int f21794i;

        /* renamed from: j */
        public long f21795j;

        /* renamed from: k */
        public int f21796k;

        /* renamed from: l */
        public long f21797l;

        public C7005a(C5737j jVar, C5754v vVar, C7008b bVar) throws ParserException {
            this.f21786a = jVar;
            this.f21787b = vVar;
            this.f21788c = bVar;
            int max = Math.max(1, bVar.f21808c / 10);
            this.f21792g = max;
            byte[] bArr = bVar.f21811f;
            int length = bArr.length;
            byte b = bArr[0];
            byte b2 = bArr[1];
            byte b3 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
            this.f21789d = b3;
            int i = bVar.f21807b;
            int i2 = bVar.f21809d;
            int i3 = (((i2 - (i * 4)) * 8) / (bVar.f21810e * i)) + 1;
            if (b3 == i3) {
                int i4 = C6774a0.f20959a;
                int i5 = ((max + b3) - 1) / b3;
                this.f21790e = new byte[(i2 * i5)];
                this.f21791f = new C6803r(b3 * 2 * i * i5);
                int i6 = bVar.f21808c;
                int i7 = ((bVar.f21809d * i6) * 8) / b3;
                Format.C3872b bVar2 = new Format.C3872b();
                bVar2.f13446k = "audio/raw";
                bVar2.f13441f = i7;
                bVar2.f13442g = i7;
                bVar2.f13447l = max * 2 * i;
                bVar2.f13459x = bVar.f21807b;
                bVar2.f13460y = i6;
                bVar2.f13461z = 2;
                this.f21793h = new Format(bVar2);
                return;
            }
            throw new ParserException(C13715c.m34243i(56, "Expected frames per block: ", i3, "; got: ", b3));
        }

        /* renamed from: a */
        public final void mo23257a(int i, long j) {
            this.f21786a.mo20707k(new C7011d(this.f21788c, this.f21789d, (long) i, j));
            this.f21787b.mo20632c(this.f21793h);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x004b A[EDGE_INSN: B:40:0x004b->B:11:0x004b ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x002d  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo23258b(p173ma.C5732e r21, long r22) throws java.io.IOException {
            /*
                r20 = this;
                r0 = r20
                int r1 = r0.f21792g
                int r2 = r0.f21796k
                wa.b r3 = r0.f21788c
                int r4 = r3.f21807b
                int r4 = r4 * 2
                int r2 = r2 / r4
                int r1 = r1 - r2
                int r2 = r0.f21789d
                int r4 = p277ub.C6774a0.f20959a
                int r1 = r1 + r2
                r4 = -1
                int r1 = r1 + r4
                int r1 = r1 / r2
                int r2 = r3.f21809d
                int r1 = r1 * r2
                r2 = 0
                int r7 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
                r2 = r22
                r9 = r0
                if (r7 != 0) goto L_0x0027
                r7 = r1
                r1 = r21
                goto L_0x0043
            L_0x0027:
                r7 = r1
                r8 = 0
                r1 = r21
            L_0x002b:
                if (r8 != 0) goto L_0x004b
                int r10 = r9.f21794i
                if (r10 >= r7) goto L_0x004b
                int r10 = r7 - r10
                long r10 = (long) r10
                long r10 = java.lang.Math.min(r10, r2)
                int r11 = (int) r10
                byte[] r10 = r9.f21790e
                int r12 = r9.f21794i
                int r10 = r1.read(r10, r12, r11)
                if (r10 != r4) goto L_0x0045
            L_0x0043:
                r8 = 1
                goto L_0x002b
            L_0x0045:
                int r11 = r9.f21794i
                int r11 = r11 + r10
                r9.f21794i = r11
                goto L_0x002b
            L_0x004b:
                int r1 = r9.f21794i
                wa.b r2 = r9.f21788c
                int r2 = r2.f21809d
                int r1 = r1 / r2
                if (r1 <= 0) goto L_0x0159
                byte[] r2 = r9.f21790e
                ub.r r3 = r9.f21791f
                r4 = 0
            L_0x0059:
                if (r4 >= r1) goto L_0x011f
                r7 = 0
            L_0x005c:
                wa.b r10 = r9.f21788c
                int r11 = r10.f21807b
                if (r7 >= r11) goto L_0x0115
                byte[] r12 = r3.f21038a
                int r10 = r10.f21809d
                int r13 = r4 * r10
                int r14 = r7 * 4
                int r14 = r14 + r13
                int r13 = r11 * 4
                int r13 = r13 + r14
                int r10 = r10 / r11
                int r10 = r10 + -4
                int r15 = r14 + 1
                byte r15 = r2[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 8
                byte r5 = r2[r14]
                r5 = r5 & 255(0xff, float:3.57E-43)
                r5 = r5 | r15
                short r5 = (short) r5
                int r14 = r14 + 2
                byte r14 = r2[r14]
                r14 = r14 & 255(0xff, float:3.57E-43)
                r15 = 88
                int r14 = java.lang.Math.min(r14, r15)
                int[] r16 = f21785n
                r16 = r16[r14]
                int r15 = r9.f21789d
                int r15 = r15 * r4
                int r15 = r15 * r11
                int r15 = r15 + r7
                int r15 = r15 * 2
                r6 = r5 & 255(0xff, float:3.57E-43)
                byte r6 = (byte) r6
                r12[r15] = r6
                int r6 = r15 + 1
                int r0 = r5 >> 8
                byte r0 = (byte) r0
                r12[r6] = r0
                r0 = 0
            L_0x00a5:
                int r6 = r10 * 2
                if (r0 >= r6) goto L_0x010b
                int r6 = r0 / 8
                int r18 = r0 / 2
                int r18 = r18 % 4
                int r6 = r6 * r11
                int r6 = r6 * 4
                int r6 = r6 + r13
                int r6 = r6 + r18
                byte r6 = r2[r6]
                r6 = r6 & 255(0xff, float:3.57E-43)
                int r18 = r0 % 2
                if (r18 != 0) goto L_0x00c1
                r6 = r6 & 15
                goto L_0x00c3
            L_0x00c1:
                int r6 = r6 >> 4
            L_0x00c3:
                r18 = r6 & 7
                int r18 = r18 * 2
                r17 = 1
                int r18 = r18 + 1
                int r18 = r18 * r16
                r16 = r2
                int r2 = r18 >> 3
                r18 = r6 & 8
                if (r18 == 0) goto L_0x00d6
                int r2 = -r2
            L_0x00d6:
                int r5 = r5 + r2
                r2 = -32768(0xffffffffffff8000, float:NaN)
                r22 = r10
                r10 = 32767(0x7fff, float:4.5916E-41)
                int r5 = p277ub.C6774a0.m15947g(r5, r2, r10)
                int r2 = r11 * 2
                int r15 = r15 + r2
                r2 = r5 & 255(0xff, float:3.57E-43)
                byte r2 = (byte) r2
                r12[r15] = r2
                int r2 = r15 + 1
                int r10 = r5 >> 8
                byte r10 = (byte) r10
                r12[r2] = r10
                int[] r2 = f21784m
                r2 = r2[r6]
                int r14 = r14 + r2
                int[] r2 = f21785n
                r6 = 88
                r10 = 0
                int r14 = p277ub.C6774a0.m15947g(r14, r10, r6)
                r2 = r2[r14]
                int r0 = r0 + 1
                r10 = r22
                r19 = r16
                r16 = r2
                r2 = r19
                goto L_0x00a5
            L_0x010b:
                r16 = r2
                r17 = 1
                int r7 = r7 + 1
                r0 = r20
                goto L_0x005c
            L_0x0115:
                r16 = r2
                r17 = 1
                int r4 = r4 + 1
                r0 = r20
                goto L_0x0059
            L_0x011f:
                int r0 = r9.f21789d
                int r0 = r0 * r1
                wa.b r2 = r9.f21788c
                int r2 = r2.f21807b
                int r0 = r0 * 2
                int r0 = r0 * r2
                r2 = 0
                r3.mo23007z(r2)
                r3.mo23006y(r0)
                int r0 = r9.f21794i
                wa.b r2 = r9.f21788c
                int r2 = r2.f21809d
                int r1 = r1 * r2
                int r0 = r0 - r1
                r9.f21794i = r0
                ub.r r0 = r9.f21791f
                int r1 = r0.f21040c
                ma.v r2 = r9.f21787b
                r2.mo20631b(r1, r0)
                int r0 = r9.f21796k
                int r0 = r0 + r1
                r9.f21796k = r0
                wa.b r1 = r9.f21788c
                int r1 = r1.f21807b
                int r1 = r1 * 2
                int r0 = r0 / r1
                int r1 = r9.f21792g
                if (r0 < r1) goto L_0x0159
                r9.mo23260d(r1)
            L_0x0159:
                if (r8 == 0) goto L_0x0169
                int r0 = r9.f21796k
                wa.b r1 = r9.f21788c
                int r1 = r1.f21807b
                int r1 = r1 * 2
                int r0 = r0 / r1
                if (r0 <= 0) goto L_0x0169
                r9.mo23260d(r0)
            L_0x0169:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p302wa.C7004a.C7005a.mo23258b(ma.e, long):boolean");
        }

        /* renamed from: c */
        public final void mo23259c(long j) {
            this.f21794i = 0;
            this.f21795j = j;
            this.f21796k = 0;
            this.f21797l = 0;
        }

        /* renamed from: d */
        public final void mo23260d(int i) {
            long A = this.f21795j + C6774a0.m15939A(this.f21797l, 1000000, (long) this.f21788c.f21808c);
            int i2 = i * 2 * this.f21788c.f21807b;
            this.f21787b.mo20633d(A, 1, i2, this.f21796k - i2, (C5754v.C5755a) null);
            this.f21797l += (long) i;
            this.f21796k -= i2;
        }
    }

    /* renamed from: wa.a$b */
    public interface C7006b {
        /* renamed from: a */
        void mo23257a(int i, long j) throws ParserException;

        /* renamed from: b */
        boolean mo23258b(C5732e eVar, long j) throws IOException;

        /* renamed from: c */
        void mo23259c(long j);
    }

    /* renamed from: wa.a$c */
    public static final class C7007c implements C7006b {

        /* renamed from: a */
        public final C5737j f21798a;

        /* renamed from: b */
        public final C5754v f21799b;

        /* renamed from: c */
        public final C7008b f21800c;

        /* renamed from: d */
        public final Format f21801d;

        /* renamed from: e */
        public final int f21802e;

        /* renamed from: f */
        public long f21803f;

        /* renamed from: g */
        public int f21804g;

        /* renamed from: h */
        public long f21805h;

        public C7007c(C5737j jVar, C5754v vVar, C7008b bVar, String str, int i) throws ParserException {
            this.f21798a = jVar;
            this.f21799b = vVar;
            this.f21800c = bVar;
            int i2 = (bVar.f21807b * bVar.f21810e) / 8;
            if (bVar.f21809d == i2) {
                int i3 = bVar.f21808c * i2;
                int i4 = i3 * 8;
                int max = Math.max(i2, i3 / 10);
                this.f21802e = max;
                Format.C3872b bVar2 = new Format.C3872b();
                bVar2.f13446k = str;
                bVar2.f13441f = i4;
                bVar2.f13442g = i4;
                bVar2.f13447l = max;
                bVar2.f13459x = bVar.f21807b;
                bVar2.f13460y = bVar.f21808c;
                bVar2.f13461z = i;
                this.f21801d = new Format(bVar2);
                return;
            }
            throw new ParserException(C13715c.m34243i(50, "Expected block size: ", i2, "; got: ", bVar.f21809d));
        }

        /* renamed from: a */
        public final void mo23257a(int i, long j) {
            this.f21798a.mo20707k(new C7011d(this.f21800c, 1, (long) i, j));
            this.f21799b.mo20632c(this.f21801d);
        }

        /* renamed from: b */
        public final boolean mo23258b(C5732e eVar, long j) throws IOException {
            int i;
            int i2;
            int i3;
            long j2 = j;
            while (true) {
                i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i <= 0 || (i2 = this.f21804g) >= (i3 = this.f21802e)) {
                    C7008b bVar = this.f21800c;
                    int i4 = bVar.f21809d;
                    int i5 = this.f21804g / i4;
                } else {
                    int a = this.f21799b.mo20630a(eVar, (int) Math.min((long) (i3 - i2), j2), true);
                    if (a == -1) {
                        j2 = 0;
                    } else {
                        this.f21804g += a;
                        j2 -= (long) a;
                    }
                }
            }
            C7008b bVar2 = this.f21800c;
            int i42 = bVar2.f21809d;
            int i52 = this.f21804g / i42;
            if (i52 > 0) {
                int i6 = i52 * i42;
                int i7 = this.f21804g - i6;
                this.f21799b.mo20633d(this.f21803f + C6774a0.m15939A(this.f21805h, 1000000, (long) bVar2.f21808c), 1, i6, i7, (C5754v.C5755a) null);
                this.f21805h += (long) i52;
                this.f21804g = i7;
            }
            if (i <= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final void mo23259c(long j) {
            this.f21803f = j;
            this.f21804g = 0;
            this.f21805h = 0;
        }
    }

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        C7006b bVar = this.f21781c;
        if (bVar != null) {
            bVar.mo23259c(j2);
        }
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        return C7009c.m16495a((C5732e) iVar) != null;
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f21779a = jVar;
        this.f21780b = jVar.mo20709p(0, 1);
        jVar.mo20708n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r14, p173ma.C5749s r15) throws java.io.IOException {
        /*
            r13 = this;
            ma.v r15 = r13.f21780b
            p583jk.C17875h.m44306q(r15)
            int r15 = p277ub.C6774a0.f20959a
            wa.a$b r15 = r13.f21781c
            r0 = 0
            r1 = 1
            if (r15 != 0) goto L_0x0094
            r15 = r14
            ma.e r15 = (p173ma.C5732e) r15
            wa.b r5 = p302wa.C7009c.m16495a(r15)
            if (r5 == 0) goto L_0x008c
            int r15 = r5.f21806a
            r2 = 17
            if (r15 != r2) goto L_0x0029
            wa.a$a r15 = new wa.a$a
            ma.j r2 = r13.f21779a
            ma.v r3 = r13.f21780b
            r15.<init>(r2, r3, r5)
            r13.f21781c = r15
            goto L_0x0094
        L_0x0029:
            r2 = 6
            if (r15 != r2) goto L_0x003c
            wa.a$c r15 = new wa.a$c
            ma.j r3 = r13.f21779a
            ma.v r4 = r13.f21780b
            r7 = -1
            java.lang.String r6 = "audio/g711-alaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f21781c = r15
            goto L_0x0094
        L_0x003c:
            r2 = 7
            if (r15 != r2) goto L_0x004f
            wa.a$c r15 = new wa.a$c
            ma.j r3 = r13.f21779a
            ma.v r4 = r13.f21780b
            r7 = -1
            java.lang.String r6 = "audio/g711-mlaw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f21781c = r15
            goto L_0x0094
        L_0x004f:
            int r2 = r5.f21810e
            if (r15 == r1) goto L_0x0066
            r3 = 3
            if (r15 == r3) goto L_0x005e
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r15 == r3) goto L_0x0066
            r15 = 0
            r7 = 0
            goto L_0x006b
        L_0x005e:
            r15 = 32
            if (r2 != r15) goto L_0x0064
            r15 = 4
            goto L_0x006a
        L_0x0064:
            r15 = 0
            goto L_0x006a
        L_0x0066:
            int r15 = p277ub.C6774a0.m15955o(r2)
        L_0x006a:
            r7 = r15
        L_0x006b:
            if (r7 == 0) goto L_0x007c
            wa.a$c r15 = new wa.a$c
            ma.j r3 = r13.f21779a
            ma.v r4 = r13.f21780b
            java.lang.String r6 = "audio/raw"
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7)
            r13.f21781c = r15
            goto L_0x0094
        L_0x007c:
            com.google.android.exoplayer2.ParserException r14 = new com.google.android.exoplayer2.ParserException
            int r15 = r5.f21806a
            r0 = 40
            java.lang.String r1 = "Unsupported WAV format type: "
            java.lang.String r15 = p379.C13715c.m34241g(r0, r1, r15)
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x008c:
            com.google.android.exoplayer2.ParserException r14 = new com.google.android.exoplayer2.ParserException
            java.lang.String r15 = "Unsupported or unrecognized wav header."
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x0094:
            int r15 = r13.f21782d
            r2 = -1
            r4 = -1
            if (r15 != r4) goto L_0x0119
            r15 = r14
            ma.e r15 = (p173ma.C5732e) r15
            r15.f18593f = r0
            ub.r r4 = new ub.r
            r5 = 8
            r4.<init>((int) r5)
            wa.c$a r6 = p302wa.C7009c.C7010a.m16496a(r15, r4)
        L_0x00ab:
            int r7 = r6.f21812a
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            if (r7 == r8) goto L_0x00de
            r8 = 1380533830(0x52494646, float:2.16116855E11)
            r9 = 8
            long r11 = r6.f21813b
            long r11 = r11 + r9
            if (r7 != r8) goto L_0x00be
            r11 = 12
        L_0x00be:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x00ce
            int r6 = (int) r11
            r15.mo21582i(r6)
            wa.c$a r6 = p302wa.C7009c.C7010a.m16496a(r15, r4)
            goto L_0x00ab
        L_0x00ce:
            com.google.android.exoplayer2.ParserException r14 = new com.google.android.exoplayer2.ParserException
            int r15 = r6.f21812a
            r0 = 51
            java.lang.String r1 = "Chunk is too large (~2GB+) to skip; id: "
            java.lang.String r15 = p379.C13715c.m34241g(r0, r1, r15)
            r14.<init>((java.lang.String) r15)
            throw r14
        L_0x00de:
            r15.mo21582i(r5)
            long r4 = r15.f18591d
            long r6 = r6.f21813b
            long r6 = r6 + r4
            long r8 = r15.f18590c
            int r15 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x00f1
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x00f1
            r6 = r8
        L_0x00f1:
            java.lang.Long r15 = java.lang.Long.valueOf(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            android.util.Pair r15 = android.util.Pair.create(r15, r4)
            java.lang.Object r4 = r15.first
            java.lang.Long r4 = (java.lang.Long) r4
            int r4 = r4.intValue()
            r13.f21782d = r4
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r4 = r15.longValue()
            r13.f21783e = r4
            wa.a$b r15 = r13.f21781c
            int r6 = r13.f21782d
            r15.mo23257a(r6, r4)
            goto L_0x0127
        L_0x0119:
            r4 = r14
            ma.e r4 = (p173ma.C5732e) r4
            long r5 = r4.f18591d
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0127
            r4.mo21582i(r15)
        L_0x0127:
            long r4 = r13.f21783e
            int r15 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r15 == 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r1 = 0
        L_0x012f:
            p583jk.C17875h.m44304o(r1)
            long r1 = r13.f21783e
            ma.e r14 = (p173ma.C5732e) r14
            long r3 = r14.f18591d
            long r1 = r1 - r3
            wa.a$b r15 = r13.f21781c
            boolean r14 = r15.mo23258b(r14, r1)
            if (r14 == 0) goto L_0x0142
            r0 = -1
        L_0x0142:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p302wa.C7004a.mo21595h(ma.i, ma.s):int");
    }

    public final void release() {
    }
}
