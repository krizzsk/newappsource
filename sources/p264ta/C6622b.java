package p264ta;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import com.google.android.exoplayer2.Format;
import p264ta.C6619a;
import p277ub.C6774a0;
import p277ub.C6792n;
import p277ub.C6803r;
import p583jk.C17875h;

/* renamed from: ta.b */
public final class C6622b {

    /* renamed from: a */
    public static final byte[] f20493a = C6774a0.m15961u("OpusHead");

    /* renamed from: ta.b$a */
    public static final class C6623a {

        /* renamed from: a */
        public final int f20494a;

        /* renamed from: b */
        public int f20495b;

        /* renamed from: c */
        public int f20496c;

        /* renamed from: d */
        public long f20497d;

        /* renamed from: e */
        public final boolean f20498e;

        /* renamed from: f */
        public final C6803r f20499f;

        /* renamed from: g */
        public final C6803r f20500g;

        /* renamed from: h */
        public int f20501h;

        /* renamed from: i */
        public int f20502i;

        public C6623a(C6803r rVar, C6803r rVar2, boolean z) {
            this.f20500g = rVar;
            this.f20499f = rVar2;
            this.f20498e = z;
            rVar2.mo23007z(12);
            this.f20494a = rVar2.mo23000s();
            rVar.mo23007z(12);
            this.f20502i = rVar.mo23000s();
            C17875h.m44305p(rVar.mo22984c() != 1 ? false : true, "first_chunk must be 1");
            this.f20495b = -1;
        }

        /* renamed from: a */
        public final boolean mo22802a() {
            long j;
            int i;
            int i2 = this.f20495b + 1;
            this.f20495b = i2;
            if (i2 == this.f20494a) {
                return false;
            }
            if (this.f20498e) {
                j = this.f20499f.mo23001t();
            } else {
                j = this.f20499f.mo22998q();
            }
            this.f20497d = j;
            if (this.f20495b == this.f20501h) {
                this.f20496c = this.f20500g.mo23000s();
                this.f20500g.mo22981A(4);
                int i3 = this.f20502i - 1;
                this.f20502i = i3;
                if (i3 > 0) {
                    i = this.f20500g.mo23000s() - 1;
                } else {
                    i = -1;
                }
                this.f20501h = i;
            }
            return true;
        }
    }

    /* renamed from: ta.b$b */
    public interface C6624b {
        /* renamed from: a */
        int mo22803a();

        /* renamed from: b */
        int mo22804b();

        /* renamed from: c */
        int mo22805c();
    }

    /* renamed from: ta.b$c */
    public static final class C6625c implements C6624b {

        /* renamed from: a */
        public final int f20503a;

        /* renamed from: b */
        public final int f20504b;

        /* renamed from: c */
        public final C6803r f20505c;

        public C6625c(C6619a.C6621b bVar, Format format) {
            C6803r rVar = bVar.f20492b;
            this.f20505c = rVar;
            rVar.mo23007z(12);
            int s = rVar.mo23000s();
            if ("audio/raw".equals(format.f13418m)) {
                int p = C6774a0.m15956p(format.f13401B, format.f13431z);
                if (s == 0 || s % p != 0) {
                    s = p;
                }
            }
            this.f20503a = s == 0 ? -1 : s;
            this.f20504b = rVar.mo23000s();
        }

        /* renamed from: a */
        public final int mo22803a() {
            int i = this.f20503a;
            return i == -1 ? this.f20505c.mo23000s() : i;
        }

        /* renamed from: b */
        public final int mo22804b() {
            return this.f20503a;
        }

        /* renamed from: c */
        public final int mo22805c() {
            return this.f20504b;
        }
    }

    /* renamed from: ta.b$d */
    public static final class C6626d implements C6624b {

        /* renamed from: a */
        public final C6803r f20506a;

        /* renamed from: b */
        public final int f20507b;

        /* renamed from: c */
        public final int f20508c;

        /* renamed from: d */
        public int f20509d;

        /* renamed from: e */
        public int f20510e;

        public C6626d(C6619a.C6621b bVar) {
            C6803r rVar = bVar.f20492b;
            this.f20506a = rVar;
            rVar.mo23007z(12);
            this.f20508c = rVar.mo23000s() & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            this.f20507b = rVar.mo23000s();
        }

        /* renamed from: a */
        public final int mo22803a() {
            int i = this.f20508c;
            if (i == 8) {
                return this.f20506a.mo22997p();
            }
            if (i == 16) {
                return this.f20506a.mo23002u();
            }
            int i2 = this.f20509d;
            this.f20509d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f20510e & 15;
            }
            int p = this.f20506a.mo22997p();
            this.f20510e = p;
            return (p & 240) >> 4;
        }

        /* renamed from: b */
        public final int mo22804b() {
            return -1;
        }

        /* renamed from: c */
        public final int mo22805c() {
            return this.f20507b;
        }
    }

    /* renamed from: a */
    public static Pair m15662a(int i, C6803r rVar) {
        rVar.mo23007z(i + 8 + 4);
        rVar.mo22981A(1);
        m15663b(rVar);
        rVar.mo22981A(2);
        int p = rVar.mo22997p();
        if ((p & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
            rVar.mo22981A(2);
        }
        if ((p & 64) != 0) {
            rVar.mo22981A(rVar.mo23002u());
        }
        if ((p & 32) != 0) {
            rVar.mo22981A(2);
        }
        rVar.mo22981A(1);
        m15663b(rVar);
        String d = C6792n.m15991d(rVar.mo22997p());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return Pair.create(d, (Object) null);
        }
        rVar.mo22981A(12);
        rVar.mo22981A(1);
        int b = m15663b(rVar);
        byte[] bArr = new byte[b];
        rVar.mo22983b(0, b, bArr);
        return Pair.create(d, bArr);
    }

    /* renamed from: b */
    public static int m15663b(C6803r rVar) {
        int p = rVar.mo22997p();
        int i = p & 127;
        while ((p & RecyclerView.C1119a0.FLAG_IGNORE) == 128) {
            p = rVar.mo22997p();
            i = (i << 7) | (p & 127);
        }
        return i;
    }

    /* renamed from: c */
    public static Pair<Integer, C6642m> m15664c(C6803r rVar, int i, int i2) {
        boolean z;
        Pair<Integer, C6642m> pair;
        boolean z2;
        Integer num;
        C6642m mVar;
        int i3;
        int i4;
        boolean z3;
        byte[] bArr;
        C6803r rVar2 = rVar;
        int i5 = rVar2.f21039b;
        while (i5 - i < i2) {
            rVar2.mo23007z(i5);
            int c = rVar.mo22984c();
            if (c > 0) {
                z = true;
            } else {
                z = false;
            }
            C17875h.m44305p(z, "childAtomSize should be positive");
            if (rVar.mo22984c() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < c) {
                    rVar2.mo23007z(i6);
                    int c2 = rVar.mo22984c();
                    int c3 = rVar.mo22984c();
                    if (c3 == 1718775137) {
                        num2 = Integer.valueOf(rVar.mo22984c());
                    } else if (c3 == 1935894637) {
                        rVar2.mo22981A(4);
                        str = rVar2.mo22994m(4);
                    } else if (c3 == 1935894633) {
                        i7 = i6;
                        i8 = c2;
                    }
                    i6 += c2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C17875h.m44307r(num2, "frma atom is mandatory");
                    if (i7 != -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C17875h.m44305p(z2, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            mVar = null;
                            break;
                        }
                        rVar2.mo23007z(i9);
                        int c4 = rVar.mo22984c();
                        if (rVar.mo22984c() == 1952804451) {
                            int c5 = (rVar.mo22984c() >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                            rVar2.mo22981A(1);
                            if (c5 == 0) {
                                rVar2.mo22981A(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int p = rVar.mo22997p();
                                i4 = p & 15;
                                i3 = (p & 240) >> 4;
                            }
                            if (rVar.mo22997p() == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            int p2 = rVar.mo22997p();
                            byte[] bArr2 = new byte[16];
                            rVar2.mo22983b(0, 16, bArr2);
                            if (!z3 || p2 != 0) {
                                bArr = null;
                            } else {
                                int p3 = rVar.mo22997p();
                                byte[] bArr3 = new byte[p3];
                                rVar2.mo22983b(0, p3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            mVar = new C6642m(z3, str, p2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i9 += c4;
                        }
                    }
                    C17875h.m44307r(mVar, "tenc atom is mandatory");
                    pair = Pair.create(num, mVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i5 += c;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0197  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p264ta.C6644o m15665d(p264ta.C6641l r38, p264ta.C6619a.C6620a r39, p173ma.C5746p r40) throws com.google.android.exoplayer2.ParserException {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            ta.a$b r3 = r0.mo22801c(r3)
            if (r3 == 0) goto L_0x0017
            ta.b$c r4 = new ta.b$c
            com.google.android.exoplayer2.Format r5 = r1.f20608f
            r4.<init>(r3, r5)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            ta.a$b r3 = r0.mo22801c(r3)
            if (r3 == 0) goto L_0x0519
            ta.b$d r4 = new ta.b$d
            r4.<init>(r3)
        L_0x0025:
            int r3 = r4.mo22805c()
            r5 = 0
            if (r3 != 0) goto L_0x0043
            ta.o r9 = new ta.o
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = 0
            r0 = r9
            r1 = r38
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0043:
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            ta.a$b r6 = r0.mo22801c(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0059
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            ta.a$b r6 = r0.mo22801c(r6)
            r6.getClass()
            r8 = 1
            goto L_0x005a
        L_0x0059:
            r8 = 0
        L_0x005a:
            ub.r r6 = r6.f20492b
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            ta.a$b r9 = r0.mo22801c(r9)
            r9.getClass()
            ub.r r9 = r9.f20492b
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            ta.a$b r10 = r0.mo22801c(r10)
            r10.getClass()
            ub.r r10 = r10.f20492b
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            ta.a$b r11 = r0.mo22801c(r11)
            if (r11 == 0) goto L_0x0080
            ub.r r11 = r11.f20492b
            goto L_0x0081
        L_0x0080:
            r11 = 0
        L_0x0081:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            ta.a$b r0 = r0.mo22801c(r13)
            if (r0 == 0) goto L_0x008d
            ub.r r0 = r0.f20492b
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            ta.b$a r13 = new ta.b$a
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo23007z(r6)
            int r8 = r10.mo23000s()
            int r8 = r8 - r7
            int r9 = r10.mo23000s()
            int r14 = r10.mo23000s()
            if (r0 == 0) goto L_0x00af
            r0.mo23007z(r6)
            int r15 = r0.mo23000s()
            goto L_0x00b0
        L_0x00af:
            r15 = 0
        L_0x00b0:
            r12 = -1
            if (r11 == 0) goto L_0x00c6
            r11.mo23007z(r6)
            int r6 = r11.mo23000s()
            if (r6 <= 0) goto L_0x00c3
            int r16 = r11.mo23000s()
            int r16 = r16 + -1
            goto L_0x00cd
        L_0x00c3:
            r16 = 0
            goto L_0x00c9
        L_0x00c6:
            r16 = r11
            r6 = 0
        L_0x00c9:
            r11 = r16
            r16 = -1
        L_0x00cd:
            int r5 = r4.mo22804b()
            com.google.android.exoplayer2.Format r7 = r1.f20608f
            java.lang.String r7 = r7.f13418m
            if (r5 == r12) goto L_0x00fa
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x00ef
            java.lang.String r12 = "audio/g711-mlaw"
            boolean r12 = r12.equals(r7)
            if (r12 != 0) goto L_0x00ef
            java.lang.String r12 = "audio/g711-alaw"
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L_0x00fa
        L_0x00ef:
            if (r8 != 0) goto L_0x00fa
            if (r15 != 0) goto L_0x00fa
            if (r6 != 0) goto L_0x00fa
            r12 = r8
            r19 = r9
            r7 = 1
            goto L_0x00fe
        L_0x00fa:
            r12 = r8
            r19 = r9
            r7 = 0
        L_0x00fe:
            if (r7 == 0) goto L_0x0197
            int r0 = r13.f20494a
            long[] r4 = new long[r0]
            int[] r6 = new int[r0]
        L_0x0106:
            boolean r7 = r13.mo22802a()
            if (r7 == 0) goto L_0x0117
            int r7 = r13.f20495b
            long r10 = r13.f20497d
            r4[r7] = r10
            int r10 = r13.f20496c
            r6[r7] = r10
            goto L_0x0106
        L_0x0117:
            long r10 = (long) r14
            r7 = 8192(0x2000, float:1.14794E-41)
            int r7 = r7 / r5
            r12 = 0
            r13 = 0
        L_0x011d:
            if (r12 >= r0) goto L_0x012b
            r14 = r6[r12]
            int r15 = p277ub.C6774a0.f20959a
            int r14 = r14 + r7
            r15 = -1
            int r14 = r14 + r15
            int r14 = r14 / r7
            int r13 = r13 + r14
            int r12 = r12 + 1
            goto L_0x011d
        L_0x012b:
            long[] r12 = new long[r13]
            int[] r14 = new int[r13]
            long[] r15 = new long[r13]
            int[] r13 = new int[r13]
            r8 = 0
            r9 = 0
            r16 = 0
            r19 = 0
        L_0x0139:
            if (r8 >= r0) goto L_0x018a
            r21 = r6[r8]
            r22 = r4[r8]
            r36 = r19
            r19 = r0
            r0 = r16
            r16 = r36
            r37 = r21
            r21 = r4
            r4 = r37
        L_0x014d:
            if (r4 <= 0) goto L_0x0179
            int r24 = java.lang.Math.min(r7, r4)
            r12[r16] = r22
            r39 = r6
            int r6 = r5 * r24
            r14[r16] = r6
            int r0 = java.lang.Math.max(r0, r6)
            r25 = r5
            long r5 = (long) r9
            long r5 = r5 * r10
            r15[r16] = r5
            r5 = 1
            r13[r16] = r5
            r5 = r14[r16]
            long r5 = (long) r5
            long r22 = r22 + r5
            int r9 = r9 + r24
            int r4 = r4 - r24
            int r16 = r16 + 1
            r6 = r39
            r5 = r25
            goto L_0x014d
        L_0x0179:
            r25 = r5
            r39 = r6
            int r8 = r8 + 1
            r4 = r21
            r36 = r16
            r16 = r0
            r0 = r19
            r19 = r36
            goto L_0x0139
        L_0x018a:
            long r4 = (long) r9
            long r10 = r10 * r4
            r0 = r3
            r2 = r12
            r6 = r13
            r3 = r14
            r5 = r15
            r4 = r16
        L_0x0194:
            r13 = r10
            goto L_0x02b3
        L_0x0197:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r8 = new long[r3]
            int[] r9 = new int[r3]
            r39 = r15
            r15 = r16
            r1 = 0
            r2 = 0
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
        L_0x01af:
            if (r2 >= r3) goto L_0x026f
            r27 = r23
            r23 = 1
        L_0x01b5:
            if (r16 != 0) goto L_0x01d2
            boolean r23 = r13.mo22802a()
            if (r23 == 0) goto L_0x01d2
            r24 = r14
            r29 = r15
            long r14 = r13.f20497d
            r30 = r3
            int r3 = r13.f20496c
            r16 = r3
            r27 = r14
            r14 = r24
            r15 = r29
            r3 = r30
            goto L_0x01b5
        L_0x01d2:
            r30 = r3
            r24 = r14
            r29 = r15
            if (r23 != 0) goto L_0x01ed
            long[] r5 = java.util.Arrays.copyOf(r5, r2)
            int[] r7 = java.util.Arrays.copyOf(r7, r2)
            long[] r8 = java.util.Arrays.copyOf(r8, r2)
            int[] r9 = java.util.Arrays.copyOf(r9, r2)
            r3 = r2
            goto L_0x0273
        L_0x01ed:
            r15 = r39
            if (r0 == 0) goto L_0x0202
        L_0x01f1:
            if (r22 != 0) goto L_0x0200
            if (r15 <= 0) goto L_0x0200
            int r22 = r0.mo23000s()
            int r21 = r0.mo22984c()
            int r15 = r15 + -1
            goto L_0x01f1
        L_0x0200:
            int r22 = r22 + -1
        L_0x0202:
            r3 = r21
            r5[r2] = r27
            int r14 = r4.mo22803a()
            r7[r2] = r14
            if (r14 <= r1) goto L_0x0213
            r23 = r5
            r1 = r14
            r14 = r4
            goto L_0x0216
        L_0x0213:
            r14 = r4
            r23 = r5
        L_0x0216:
            long r4 = (long) r3
            long r4 = r25 + r4
            r8[r2] = r4
            if (r11 != 0) goto L_0x021f
            r4 = 1
            goto L_0x0220
        L_0x021f:
            r4 = 0
        L_0x0220:
            r9[r2] = r4
            r4 = r29
            if (r2 != r4) goto L_0x0235
            r5 = 1
            r9[r2] = r5
            int r6 = r6 + -1
            if (r6 <= 0) goto L_0x0235
            r11.getClass()
            int r4 = r11.mo23000s()
            int r4 = r4 - r5
        L_0x0235:
            r21 = r3
            r39 = r4
            r5 = r24
            long r3 = (long) r5
            long r25 = r25 + r3
            int r19 = r19 + -1
            if (r19 != 0) goto L_0x0251
            if (r12 <= 0) goto L_0x0251
            int r3 = r10.mo23000s()
            int r4 = r10.mo22984c()
            int r12 = r12 + -1
            r19 = r3
            goto L_0x0252
        L_0x0251:
            r4 = r5
        L_0x0252:
            r3 = r7[r2]
            r5 = r4
            long r3 = (long) r3
            long r3 = r27 + r3
            int r16 = r16 + -1
            int r2 = r2 + 1
            r36 = r15
            r15 = r39
            r39 = r36
            r37 = r14
            r14 = r5
            r5 = r23
            r23 = r3
            r4 = r37
            r3 = r30
            goto L_0x01af
        L_0x026f:
            r30 = r3
            r23 = r5
        L_0x0273:
            r2 = r21
            long r10 = (long) r2
            long r10 = r25 + r10
            if (r0 == 0) goto L_0x028c
            r15 = r39
        L_0x027c:
            if (r15 <= 0) goto L_0x028c
            int r2 = r0.mo23000s()
            if (r2 == 0) goto L_0x0286
            r0 = 0
            goto L_0x028d
        L_0x0286:
            r0.mo22984c()
            int r15 = r15 + -1
            goto L_0x027c
        L_0x028c:
            r0 = 1
        L_0x028d:
            if (r6 != 0) goto L_0x0299
            if (r19 != 0) goto L_0x0299
            if (r16 != 0) goto L_0x0299
            if (r12 != 0) goto L_0x0299
            if (r22 != 0) goto L_0x0299
            if (r0 != 0) goto L_0x02ab
        L_0x0299:
            if (r0 != 0) goto L_0x029e
            java.lang.String r0 = ", ctts invalid"
            goto L_0x02a0
        L_0x029e:
            java.lang.String r0 = ""
        L_0x02a0:
            int r0 = r0.length()
            int r0 = r0 + 262
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
        L_0x02ab:
            r4 = r1
            r0 = r3
            r2 = r5
            r3 = r7
            r5 = r8
            r6 = r9
            goto L_0x0194
        L_0x02b3:
            r9 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r38
            long r11 = r1.f20605c
            r7 = r13
            long r7 = p277ub.C6774a0.m15939A(r7, r9, r11)
            long[] r9 = r1.f20610h
            if (r9 != 0) goto L_0x02d1
            long r9 = r1.f20605c
            p277ub.C6774a0.m15940B(r5, r9)
            ta.o r9 = new ta.o
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02d1:
            int r7 = r9.length
            r8 = 1
            if (r7 != r8) goto L_0x037e
            int r7 = r1.f20604b
            if (r7 != r8) goto L_0x037e
            int r7 = r5.length
            r8 = 2
            if (r7 < r8) goto L_0x037e
            long[] r7 = r1.f20611i
            r7.getClass()
            r8 = 0
            r9 = r7[r8]
            long[] r7 = r1.f20610h
            r21 = r7[r8]
            long r11 = r1.f20605c
            r15 = r9
            long r8 = r1.f20606d
            r23 = r11
            r25 = r8
            long r7 = p277ub.C6774a0.m15939A(r21, r23, r25)
            long r7 = r7 + r15
            int r9 = r5.length
            r10 = 1
            int r9 = r9 - r10
            r10 = 4
            r11 = 0
            int r12 = p277ub.C6774a0.m15947g(r10, r11, r9)
            r19 = r0
            int r0 = r5.length
            int r0 = r0 - r10
            int r0 = p277ub.C6774a0.m15947g(r0, r11, r9)
            r9 = r5[r11]
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 > 0) goto L_0x0320
            r11 = r5[r12]
            int r21 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r21 >= 0) goto L_0x0320
            r11 = r5[r0]
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0320
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x0320
            r0 = 1
            goto L_0x0321
        L_0x0320:
            r0 = 0
        L_0x0321:
            if (r0 == 0) goto L_0x0380
            long r21 = r13 - r7
            long r23 = r15 - r9
            com.google.android.exoplayer2.Format r0 = r1.f20608f
            int r0 = r0.f13400A
            long r7 = (long) r0
            long r9 = r1.f20605c
            r25 = r7
            r27 = r9
            long r7 = p277ub.C6774a0.m15939A(r23, r25, r27)
            com.google.android.exoplayer2.Format r0 = r1.f20608f
            int r0 = r0.f13400A
            long r9 = (long) r0
            long r11 = r1.f20605c
            r23 = r9
            r25 = r11
            long r9 = p277ub.C6774a0.m15939A(r21, r23, r25)
            r11 = 0
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x034f
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x0380
        L_0x034f:
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0380
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0380
            int r0 = (int) r7
            r7 = r40
            r7.f18617a = r0
            int r0 = (int) r9
            r7.f18618b = r0
            long r7 = r1.f20605c
            p277ub.C6774a0.m15940B(r5, r7)
            long[] r0 = r1.f20610h
            r7 = 0
            r8 = r0[r7]
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r1.f20606d
            long r7 = p277ub.C6774a0.m15939A(r8, r10, r12)
            ta.o r9 = new ta.o
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x037e:
            r19 = r0
        L_0x0380:
            long[] r0 = r1.f20610h
            int r7 = r0.length
            r8 = 1
            if (r7 != r8) goto L_0x03c3
            r7 = 0
            r8 = r0[r7]
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x03c4
            long[] r0 = r1.f20611i
            r0.getClass()
            r8 = r0[r7]
        L_0x0396:
            int r0 = r5.length
            if (r7 >= r0) goto L_0x03ad
            r10 = r5[r7]
            long r15 = r10 - r8
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r1.f20605c
            r19 = r10
            long r10 = p277ub.C6774a0.m15939A(r15, r17, r19)
            r5[r7] = r10
            int r7 = r7 + 1
            goto L_0x0396
        L_0x03ad:
            long r15 = r13 - r8
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r1.f20605c
            r19 = r7
            long r7 = p277ub.C6774a0.m15939A(r15, r17, r19)
            ta.o r9 = new ta.o
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03c3:
            r7 = 0
        L_0x03c4:
            int r8 = r1.f20604b
            r9 = 1
            if (r8 != r9) goto L_0x03cb
            r8 = 1
            goto L_0x03cc
        L_0x03cb:
            r8 = 0
        L_0x03cc:
            int r9 = r0.length
            int[] r9 = new int[r9]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r10 = r1.f20611i
            r10.getClass()
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x03db:
            long[] r15 = r1.f20610h
            int r7 = r15.length
            if (r11 >= r7) goto L_0x043e
            r39 = r3
            r7 = r4
            r3 = r10[r11]
            r21 = -1
            int r16 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r16 == 0) goto L_0x042d
            r21 = r15[r11]
            r16 = r14
            long r14 = r1.f20605c
            r40 = r12
            r27 = r13
            long r12 = r1.f20606d
            r23 = r14
            r25 = r12
            long r12 = p277ub.C6774a0.m15939A(r21, r23, r25)
            r14 = 1
            int r15 = p277ub.C6774a0.m15945e(r5, r3, r14)
            r9[r11] = r15
            long r3 = r3 + r12
            int r3 = p277ub.C6774a0.m15942b(r5, r3, r8)
            r0[r11] = r3
        L_0x040d:
            r3 = r9[r11]
            r4 = r0[r11]
            if (r3 >= r4) goto L_0x041d
            r12 = r6[r3]
            r12 = r12 & r14
            if (r12 != 0) goto L_0x041d
            int r3 = r3 + 1
            r9[r11] = r3
            goto L_0x040d
        L_0x041d:
            int r12 = r4 - r3
            int r12 = r12 + r27
            r13 = r16
            if (r13 == r3) goto L_0x0427
            r3 = 1
            goto L_0x0428
        L_0x0427:
            r3 = 0
        L_0x0428:
            r3 = r40 | r3
            r13 = r12
            r12 = r3
            goto L_0x0436
        L_0x042d:
            r40 = r12
            r27 = r13
            r13 = r14
            r14 = 1
            r4 = r13
            r13 = r27
        L_0x0436:
            int r11 = r11 + 1
            r3 = r39
            r14 = r4
            r4 = r7
            r7 = 0
            goto L_0x03db
        L_0x043e:
            r39 = r3
            r7 = r4
            r40 = r12
            r3 = r19
            r14 = 1
            if (r13 == r3) goto L_0x0449
            goto L_0x044a
        L_0x0449:
            r14 = 0
        L_0x044a:
            r3 = r40 | r14
            if (r3 == 0) goto L_0x0451
            long[] r4 = new long[r13]
            goto L_0x0452
        L_0x0451:
            r4 = r2
        L_0x0452:
            if (r3 == 0) goto L_0x0457
            int[] r8 = new int[r13]
            goto L_0x0459
        L_0x0457:
            r8 = r39
        L_0x0459:
            if (r3 == 0) goto L_0x045c
            r7 = 0
        L_0x045c:
            if (r3 == 0) goto L_0x0461
            int[] r10 = new int[r13]
            goto L_0x0462
        L_0x0461:
            r10 = r6
        L_0x0462:
            long[] r11 = new long[r13]
            r12 = 0
            r13 = 0
            r21 = 0
        L_0x0468:
            long[] r14 = r1.f20610h
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04fa
            long[] r14 = r1.f20611i
            r23 = r14[r12]
            r14 = r9[r12]
            r15 = r0[r12]
            if (r3 == 0) goto L_0x0489
            r25 = r0
            int r0 = r15 - r14
            java.lang.System.arraycopy(r2, r14, r4, r13, r0)
            r26 = r2
            r2 = r39
            java.lang.System.arraycopy(r2, r14, r8, r13, r0)
            java.lang.System.arraycopy(r6, r14, r10, r13, r0)
            goto L_0x048f
        L_0x0489:
            r25 = r0
            r26 = r2
            r2 = r39
        L_0x048f:
            r0 = r14
        L_0x0490:
            if (r0 >= r15) goto L_0x04d8
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r27 = r9
            r28 = r10
            long r9 = r1.f20606d
            r29 = r15
            r14 = r21
            r18 = r9
            long r9 = p277ub.C6774a0.m15939A(r14, r16, r18)
            r14 = r5[r0]
            long r14 = r14 - r23
            r16 = r5
            r39 = r6
            r5 = 0
            long r30 = java.lang.Math.max(r5, r14)
            r32 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r1.f20605c
            r34 = r14
            long r14 = p277ub.C6774a0.m15939A(r30, r32, r34)
            long r9 = r9 + r14
            r11[r13] = r9
            if (r3 == 0) goto L_0x04c9
            r9 = r8[r13]
            if (r9 <= r7) goto L_0x04c9
            r7 = r2[r0]
        L_0x04c9:
            int r13 = r13 + 1
            int r0 = r0 + 1
            r6 = r39
            r5 = r16
            r9 = r27
            r10 = r28
            r15 = r29
            goto L_0x0490
        L_0x04d8:
            r16 = r5
            r39 = r6
            r27 = r9
            r28 = r10
            r5 = 0
            long[] r0 = r1.f20610h
            r9 = r0[r12]
            long r21 = r21 + r9
            int r12 = r12 + 1
            r6 = r39
            r39 = r2
            r5 = r16
            r0 = r25
            r2 = r26
            r9 = r27
            r10 = r28
            goto L_0x0468
        L_0x04fa:
            r28 = r10
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r1.f20606d
            r14 = r21
            r18 = r2
            long r9 = p277ub.C6774a0.m15939A(r14, r16, r18)
            ta.o r12 = new ta.o
            r0 = r12
            r1 = r38
            r2 = r4
            r3 = r8
            r4 = r7
            r5 = r11
            r6 = r28
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r12
        L_0x0519:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264ta.C6622b.m15665d(ta.l, ta.a$a, ma.p):ta.o");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v9, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v2, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v8, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v9, resolved type: com.google.common.collect.ImmutableList} */
    /* JADX WARNING: type inference failed for: r1v42, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r7v32, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r7v42, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r12v63, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r6v55, types: [byte[], java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x07e8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0a75  */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0af9  */
    /* JADX WARNING: Removed duplicated region for block: B:545:0x0b01  */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0b2e  */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x0b33  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0204  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m15666e(p264ta.C6619a.C6620a r54, p173ma.C5746p r55, long r56, com.google.android.exoplayer2.drm.DrmInitData r58, boolean r59, boolean r60, p624ld.C18188c r61) throws com.google.android.exoplayer2.ParserException {
        /*
            r0 = r54
            r1 = r58
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 0
        L_0x000a:
            java.util.ArrayList r5 = r0.f20491d
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0b64
            java.util.ArrayList r5 = r0.f20491d
            java.lang.Object r5 = r5.get(r4)
            ta.a$a r5 = (p264ta.C6619a.C6620a) r5
            int r6 = r5.f20488a
            r7 = 1953653099(0x7472616b, float:7.681346E31)
            if (r6 == r7) goto L_0x0029
            r3 = r55
            r0 = r61
            r31 = r4
            goto L_0x0b5c
        L_0x0029:
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            ta.a$b r6 = r0.mo22801c(r6)
            r6.getClass()
            r7 = 1835297121(0x6d646961, float:4.4181236E27)
            ta.a$a r8 = r5.mo22800b(r7)
            r8.getClass()
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            ta.a$b r9 = r8.mo22801c(r9)
            r9.getClass()
            ub.r r9 = r9.f20492b
            r10 = 16
            r9.mo23007z(r10)
            int r9 = r9.mo22984c()
            r11 = 1936684398(0x736f756e, float:1.8971874E31)
            r14 = -1
            if (r9 != r11) goto L_0x005a
            r9 = 1
            goto L_0x0080
        L_0x005a:
            r11 = 1986618469(0x76696465, float:1.1834389E33)
            if (r9 != r11) goto L_0x0061
            r9 = 2
            goto L_0x0080
        L_0x0061:
            r11 = 1952807028(0x74657874, float:7.272211E31)
            if (r9 == r11) goto L_0x007f
            r11 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r9 == r11) goto L_0x007f
            r11 = 1937072756(0x73756274, float:1.944137E31)
            if (r9 == r11) goto L_0x007f
            r11 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r9 != r11) goto L_0x0076
            goto L_0x007f
        L_0x0076:
            r11 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 != r11) goto L_0x007d
            r9 = 5
            goto L_0x0080
        L_0x007d:
            r9 = -1
            goto L_0x0080
        L_0x007f:
            r9 = 3
        L_0x0080:
            if (r9 != r14) goto L_0x0088
            r32 = r2
            r31 = r4
            goto L_0x0aff
        L_0x0088:
            r15 = 1953196132(0x746b6864, float:7.46037E31)
            ta.a$b r15 = r5.mo22801c(r15)
            r15.getClass()
            ub.r r15 = r15.f20492b
            r7 = 8
            r15.mo23007z(r7)
            int r20 = r15.mo22984c()
            int r3 = r20 >> 24
            r3 = r3 & 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L_0x00a6
            r13 = 8
            goto L_0x00a8
        L_0x00a6:
            r13 = 16
        L_0x00a8:
            r15.mo22981A(r13)
            int r13 = r15.mo22984c()
            r11 = 4
            r15.mo22981A(r11)
            int r12 = r15.f21039b
            if (r3 != 0) goto L_0x00b8
            r7 = 4
        L_0x00b8:
            r11 = 0
        L_0x00b9:
            if (r11 >= r7) goto L_0x00ca
            byte[] r10 = r15.f21038a
            int r24 = r12 + r11
            byte r10 = r10[r24]
            if (r10 == r14) goto L_0x00c5
            r10 = 0
            goto L_0x00cb
        L_0x00c5:
            int r11 = r11 + 1
            r10 = 16
            goto L_0x00b9
        L_0x00ca:
            r10 = 1
        L_0x00cb:
            r24 = 0
            if (r10 == 0) goto L_0x00d3
            r15.mo22981A(r7)
            goto L_0x00e2
        L_0x00d3:
            if (r3 != 0) goto L_0x00da
            long r26 = r15.mo22998q()
            goto L_0x00de
        L_0x00da:
            long r26 = r15.mo23001t()
        L_0x00de:
            int r3 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r3 != 0) goto L_0x00ea
        L_0x00e2:
            r3 = 16
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00ec
        L_0x00ea:
            r3 = 16
        L_0x00ec:
            r15.mo22981A(r3)
            int r3 = r15.mo22984c()
            int r7 = r15.mo22984c()
            r10 = 4
            r15.mo22981A(r10)
            int r10 = r15.mo22984c()
            int r15 = r15.mo22984c()
            r14 = 65536(0x10000, float:9.18355E-41)
            r11 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x0112
            if (r7 != r14) goto L_0x0112
            if (r10 != r11) goto L_0x0112
            if (r15 != 0) goto L_0x0112
            r3 = 90
            goto L_0x0129
        L_0x0112:
            if (r3 != 0) goto L_0x011d
            if (r7 != r11) goto L_0x011d
            if (r10 != r14) goto L_0x011d
            if (r15 != 0) goto L_0x011d
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x0129
        L_0x011d:
            if (r3 != r11) goto L_0x0128
            if (r7 != 0) goto L_0x0128
            if (r10 != 0) goto L_0x0128
            if (r15 != r11) goto L_0x0128
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x0129
        L_0x0128:
            r3 = 0
        L_0x0129:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r56 > r10 ? 1 : (r56 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0135
            r31 = r26
            goto L_0x0137
        L_0x0135:
            r31 = r56
        L_0x0137:
            ub.r r6 = r6.f20492b
            r7 = 8
            r6.mo23007z(r7)
            int r7 = r6.mo22984c()
            int r7 = r7 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r7 != 0) goto L_0x014b
            r7 = 8
            goto L_0x014d
        L_0x014b:
            r7 = 16
        L_0x014d:
            r6.mo22981A(r7)
            long r6 = r6.mo22998q()
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r31 > r10 ? 1 : (r31 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x015e
            goto L_0x0167
        L_0x015e:
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r35 = r6
            long r10 = p277ub.C6774a0.m15939A(r31, r33, r35)
        L_0x0167:
            r12 = 1835626086(0x6d696e66, float:4.515217E27)
            ta.a$a r14 = r8.mo22800b(r12)
            r14.getClass()
            r12 = 1937007212(0x7374626c, float:1.9362132E31)
            ta.a$a r14 = r14.mo22800b(r12)
            r14.getClass()
            r12 = 1835296868(0x6d646864, float:4.418049E27)
            ta.a$b r8 = r8.mo22801c(r12)
            r8.getClass()
            ub.r r8 = r8.f20492b
            r12 = 8
            r8.mo23007z(r12)
            int r12 = r8.mo22984c()
            int r12 = r12 >> 24
            r12 = r12 & 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x0199
            r15 = 8
            goto L_0x019b
        L_0x0199:
            r15 = 16
        L_0x019b:
            r8.mo22981A(r15)
            long r26 = r8.mo22998q()
            if (r12 != 0) goto L_0x01a6
            r12 = 4
            goto L_0x01a8
        L_0x01a6:
            r12 = 8
        L_0x01a8:
            r8.mo22981A(r12)
            int r8 = r8.mo23002u()
            int r12 = r8 >> 10
            r12 = r12 & 31
            int r12 = r12 + 96
            char r12 = (char) r12
            int r15 = r8 >> 5
            r15 = r15 & 31
            int r15 = r15 + 96
            char r15 = (char) r15
            r8 = r8 & 31
            int r8 = r8 + 96
            char r8 = (char) r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r31 = r4
            r4 = 3
            r0.<init>(r4)
            r0.append(r12)
            r0.append(r15)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.Long r4 = java.lang.Long.valueOf(r26)
            android.util.Pair r0 = android.util.Pair.create(r4, r0)
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            ta.a$b r4 = r14.mo22801c(r4)
            r4.getClass()
            ub.r r4 = r4.f20492b
            java.lang.Object r8 = r0.second
            java.lang.String r8 = (java.lang.String) r8
            r12 = 12
            r4.mo23007z(r12)
            int r12 = r4.mo22984c()
            ta.m[] r14 = new p264ta.C6642m[r12]
            r32 = r2
            r2 = 0
            r15 = 0
            r26 = 0
            r29 = 0
        L_0x0202:
            if (r2 >= r12) goto L_0x0a65
            r27 = r12
            int r12 = r4.f21039b
            r33 = r10
            int r10 = r4.mo22984c()
            r35 = r6
            if (r10 <= 0) goto L_0x0214
            r11 = 1
            goto L_0x0215
        L_0x0214:
            r11 = 0
        L_0x0215:
            java.lang.String r6 = "childAtomSize should be positive"
            p583jk.C17875h.m44305p(r11, r6)
            int r7 = r4.mo22984c()
            r11 = 1635148593(0x61766331, float:2.840654E20)
            r30 = r9
            if (r7 == r11) goto L_0x081b
            r11 = 1635148595(0x61766333, float:2.8406544E20)
            if (r7 == r11) goto L_0x081b
            r11 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 == r11) goto L_0x081b
            r11 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r7 == r11) goto L_0x081b
            r11 = 1836070006(0x6d703476, float:4.646239E27)
            if (r7 == r11) goto L_0x081b
            r11 = 1752589105(0x68766331, float:4.6541277E24)
            if (r7 == r11) goto L_0x081b
            r11 = 1751479857(0x68657631, float:4.3344087E24)
            if (r7 == r11) goto L_0x081b
            r11 = 1932670515(0x73323633, float:1.4119387E31)
            if (r7 == r11) goto L_0x081b
            r11 = 1211250227(0x48323633, float:182488.8)
            if (r7 == r11) goto L_0x081b
            r11 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 == r11) goto L_0x081b
            r11 = 1987063865(0x76703039, float:1.2178997E33)
            if (r7 == r11) goto L_0x081b
            r11 = 1635135537(0x61763031, float:2.8383572E20)
            if (r7 == r11) goto L_0x081b
            r11 = 1685479798(0x64766176, float:1.8179687E22)
            if (r7 == r11) goto L_0x081b
            r11 = 1685479729(0x64766131, float:1.817961E22)
            if (r7 == r11) goto L_0x081b
            r11 = 1685481573(0x64766865, float:1.8181686E22)
            if (r7 == r11) goto L_0x081b
            r11 = 1685481521(0x64766831, float:1.8181627E22)
            if (r7 != r11) goto L_0x0272
            goto L_0x081b
        L_0x0272:
            r11 = 1836069985(0x6d703461, float:4.6462328E27)
            r9 = 1701733217(0x656e6361, float:7.0359778E22)
            r39 = r0
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 == r11) goto L_0x03c6
            if (r7 == r9) goto L_0x03c6
            r9 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r7 == r9) goto L_0x03c6
            r9 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 == r9) goto L_0x03c6
            r9 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 == r9) goto L_0x03c6
            r9 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 == r9) goto L_0x03c6
            r9 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 == r9) goto L_0x03c6
            r9 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r9) goto L_0x03c6
            r9 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 == r9) goto L_0x03c6
            r9 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 == r9) goto L_0x03c6
            r9 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 == r9) goto L_0x03c6
            r9 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r9) goto L_0x03c6
            r9 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 == r9) goto L_0x03c6
            r9 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 == r9) goto L_0x03c6
            r9 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r9) goto L_0x03c6
            r9 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 == r9) goto L_0x03c6
            r9 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 == r9) goto L_0x03c6
            r9 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 == r9) goto L_0x03c6
            if (r7 == r0) goto L_0x03c6
            r9 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 == r9) goto L_0x03c6
            r9 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 == r9) goto L_0x03c6
            r9 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 == r9) goto L_0x03c6
            r9 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 != r9) goto L_0x02e9
            goto L_0x03c6
        L_0x02e9:
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r7 == r0) goto L_0x0348
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 == r0) goto L_0x0348
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 == r0) goto L_0x0348
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 == r0) goto L_0x0348
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 != r0) goto L_0x0303
            goto L_0x0348
        L_0x0303:
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r7 != r0) goto L_0x032e
            int r0 = r12 + 8
            r6 = 8
            int r0 = r0 + r6
            r4.mo23007z(r0)
            r0 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r7 != r0) goto L_0x0344
            r4.mo22992k()
            java.lang.String r0 = r4.mo22992k()
            if (r0 == 0) goto L_0x0344
            com.google.android.exoplayer2.Format$b r6 = new com.google.android.exoplayer2.Format$b
            r6.<init>()
            r6.mo15807b(r13)
            r6.f13446k = r0
            com.google.android.exoplayer2.Format r15 = new com.google.android.exoplayer2.Format
            r15.<init>((com.google.android.exoplayer2.Format.C3872b) r6)
            goto L_0x0344
        L_0x032e:
            r0 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r7 != r0) goto L_0x0344
            com.google.android.exoplayer2.Format$b r0 = new com.google.android.exoplayer2.Format$b
            r0.<init>()
            r0.mo15807b(r13)
            java.lang.String r6 = "application/x-camera-motion"
            r0.f13446k = r6
            com.google.android.exoplayer2.Format r15 = new com.google.android.exoplayer2.Format
            r15.<init>((com.google.android.exoplayer2.Format.C3872b) r0)
        L_0x0344:
            r11 = r2
            r9 = r3
            goto L_0x03af
        L_0x0348:
            int r0 = r12 + 8
            r6 = 8
            int r0 = r0 + r6
            r4.mo23007z(r0)
            r37 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = 1414810956(0x54544d4c, float:3.64731957E12)
            java.lang.String r6 = "application/ttml+xml"
            if (r7 != r0) goto L_0x035d
            goto L_0x0386
        L_0x035d:
            r0 = 1954034535(0x74783367, float:7.865797E31)
            if (r7 != r0) goto L_0x0377
            int r0 = r10 + -8
            int r0 = r0 + -8
            byte[] r6 = new byte[r0]
            r7 = 0
            r4.mo22983b(r7, r0, r6)
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m35688E(r6)
            java.lang.String r6 = "application/x-quicktime-tx3g"
            r11 = r2
            r9 = r3
            r2 = r37
            goto L_0x039a
        L_0x0377:
            r0 = 2004251764(0x77767474, float:4.998699E33)
            if (r7 != r0) goto L_0x037f
            java.lang.String r6 = "application/x-mp4-vtt"
            goto L_0x0386
        L_0x037f:
            r0 = 1937010800(0x73747070, float:1.9366469E31)
            if (r7 != r0) goto L_0x038c
            r37 = r24
        L_0x0386:
            r11 = r2
            r9 = r3
            r2 = r37
            r0 = 0
            goto L_0x039a
        L_0x038c:
            r0 = 1664495672(0x63363038, float:3.360782E21)
            if (r7 != r0) goto L_0x03c0
            java.lang.String r6 = "application/x-mp4-cea-608"
            r11 = r2
            r9 = r3
            r2 = r37
            r0 = 0
            r26 = 1
        L_0x039a:
            com.google.android.exoplayer2.Format$b r7 = new com.google.android.exoplayer2.Format$b
            r7.<init>()
            r7.mo15807b(r13)
            r7.f13446k = r6
            r7.f13438c = r8
            r7.f13450o = r2
            r7.f13448m = r0
            com.google.android.exoplayer2.Format r15 = new com.google.android.exoplayer2.Format
            r15.<init>((com.google.android.exoplayer2.Format.C3872b) r7)
        L_0x03af:
            r41 = r5
            r45 = r9
            r48 = r10
            r44 = r11
            r49 = r12
            r46 = r14
            r0 = -1
            r12 = 0
            r14 = 4
            goto L_0x0810
        L_0x03c0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x03c6:
            r11 = r2
            r9 = r3
            int r2 = r12 + 8
            r3 = 8
            int r2 = r2 + r3
            r4.mo23007z(r2)
            r2 = 6
            if (r60 == 0) goto L_0x03dd
            int r21 = r4.mo23002u()
            r4.mo22981A(r2)
            r3 = r21
            goto L_0x03e1
        L_0x03dd:
            r4.mo22981A(r3)
            r3 = 0
        L_0x03e1:
            if (r3 == 0) goto L_0x0406
            r0 = 1
            if (r3 != r0) goto L_0x03e7
            goto L_0x0406
        L_0x03e7:
            r0 = 2
            if (r3 != r0) goto L_0x03af
            r0 = 16
            r4.mo22981A(r0)
            long r40 = r4.mo22991j()
            double r40 = java.lang.Double.longBitsToDouble(r40)
            long r2 = java.lang.Math.round(r40)
            int r3 = (int) r2
            int r2 = r4.mo23000s()
            r0 = 20
            r4.mo22981A(r0)
            goto L_0x0438
        L_0x0406:
            int r2 = r4.mo23002u()
            r0 = 6
            r4.mo22981A(r0)
            byte[] r0 = r4.f21038a
            r41 = r2
            int r2 = r4.f21039b
            int r42 = r2 + 1
            byte r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r21 = 8
            int r2 = r2 << 8
            int r43 = r42 + 1
            byte r0 = r0[r42]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r2
            r42 = r0
            r2 = 2
            int r0 = r43 + 2
            r4.f21039b = r0
            r0 = 1
            if (r3 != r0) goto L_0x0434
            r0 = 16
            r4.mo22981A(r0)
        L_0x0434:
            r2 = r41
            r3 = r42
        L_0x0438:
            int r0 = r4.f21039b
            r41 = r2
            r2 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r7 != r2) goto L_0x046f
            android.util.Pair r2 = m15664c(r4, r12, r10)
            if (r2 == 0) goto L_0x0468
            java.lang.Object r7 = r2.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r1 != 0) goto L_0x0455
            r42 = r3
            r3 = 0
            goto L_0x0461
        L_0x0455:
            r42 = r3
            java.lang.Object r3 = r2.second
            ta.m r3 = (p264ta.C6642m) r3
            java.lang.String r3 = r3.f20615b
            com.google.android.exoplayer2.drm.DrmInitData r3 = r1.mo15979b(r3)
        L_0x0461:
            java.lang.Object r2 = r2.second
            ta.m r2 = (p264ta.C6642m) r2
            r14[r11] = r2
            goto L_0x046b
        L_0x0468:
            r42 = r3
            r3 = r1
        L_0x046b:
            r4.mo23007z(r0)
            goto L_0x0472
        L_0x046f:
            r42 = r3
            r3 = r1
        L_0x0472:
            java.lang.String r2 = "audio/ac4"
            java.lang.String r43 = "audio/eac3"
            r44 = r0
            java.lang.String r0 = "audio/ac3"
            r45 = r9
            r9 = 1633889587(0x61632d33, float:2.6191674E20)
            java.lang.String r46 = "audio/raw"
            if (r7 != r9) goto L_0x0487
            r46 = r0
            goto L_0x052b
        L_0x0487:
            r9 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r7 != r9) goto L_0x0490
            r46 = r43
            goto L_0x052b
        L_0x0490:
            r9 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r7 != r9) goto L_0x0499
            r46 = r2
            goto L_0x052b
        L_0x0499:
            r9 = 1685353315(0x64747363, float:1.803728E22)
            if (r7 != r9) goto L_0x04a2
            java.lang.String r7 = "audio/vnd.dts"
            goto L_0x0529
        L_0x04a2:
            r9 = 1685353320(0x64747368, float:1.8037286E22)
            if (r7 == r9) goto L_0x0527
            r9 = 1685353324(0x6474736c, float:1.803729E22)
            if (r7 != r9) goto L_0x04ae
            goto L_0x0527
        L_0x04ae:
            r9 = 1685353317(0x64747365, float:1.8037282E22)
            if (r7 != r9) goto L_0x04b7
            java.lang.String r7 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0529
        L_0x04b7:
            r9 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r7 != r9) goto L_0x04c0
            java.lang.String r7 = "audio/3gpp"
            goto L_0x0529
        L_0x04c0:
            r9 = 1935767394(0x73617762, float:1.7863284E31)
            if (r7 != r9) goto L_0x04c9
            java.lang.String r7 = "audio/amr-wb"
            goto L_0x0529
        L_0x04c9:
            r9 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r7 == r9) goto L_0x0525
            r9 = 1936684916(0x736f7774, float:1.89725E31)
            if (r7 != r9) goto L_0x04d4
            goto L_0x0525
        L_0x04d4:
            r9 = 1953984371(0x74776f73, float:7.841539E31)
            if (r7 != r9) goto L_0x04dc
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x052c
        L_0x04dc:
            r9 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r7 == r9) goto L_0x0522
            r9 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r7 != r9) goto L_0x04e7
            goto L_0x0522
        L_0x04e7:
            r9 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r7 != r9) goto L_0x04ef
            java.lang.String r7 = "audio/mha1"
            goto L_0x0529
        L_0x04ef:
            r9 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r7 != r9) goto L_0x04f7
            java.lang.String r7 = "audio/mhm1"
            goto L_0x0529
        L_0x04f7:
            r9 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r7 != r9) goto L_0x04ff
            java.lang.String r7 = "audio/alac"
            goto L_0x0529
        L_0x04ff:
            r9 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r7 != r9) goto L_0x0507
            java.lang.String r7 = "audio/g711-alaw"
            goto L_0x0529
        L_0x0507:
            r9 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r7 != r9) goto L_0x050f
            java.lang.String r7 = "audio/g711-mlaw"
            goto L_0x0529
        L_0x050f:
            r9 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r7 != r9) goto L_0x0517
            java.lang.String r7 = "audio/opus"
            goto L_0x0529
        L_0x0517:
            r9 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r7 != r9) goto L_0x051f
            java.lang.String r7 = "audio/flac"
            goto L_0x0529
        L_0x051f:
            r46 = 0
            goto L_0x052b
        L_0x0522:
            java.lang.String r7 = "audio/mpeg"
            goto L_0x0529
        L_0x0525:
            r7 = 2
            goto L_0x052c
        L_0x0527:
            java.lang.String r7 = "audio/vnd.dts.hd"
        L_0x0529:
            r46 = r7
        L_0x052b:
            r7 = -1
        L_0x052c:
            r9 = r44
            r47 = 0
            r44 = r11
            r11 = r46
            r46 = r14
            r14 = 0
            r53 = r41
            r41 = r5
            r5 = r42
            r42 = r15
            r15 = r53
        L_0x0541:
            int r1 = r9 - r12
            if (r1 >= r10) goto L_0x07db
            r4.mo23007z(r9)
            int r1 = r4.mo22984c()
            r48 = r10
            if (r1 <= 0) goto L_0x0552
            r10 = 1
            goto L_0x0553
        L_0x0552:
            r10 = 0
        L_0x0553:
            p583jk.C17875h.m44305p(r10, r6)
            int r10 = r4.mo22984c()
            r49 = r12
            r12 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r10 != r12) goto L_0x057b
            int r10 = r1 + -13
            byte[] r12 = new byte[r10]
            r50 = r7
            int r7 = r9 + 13
            r4.mo23007z(r7)
            r7 = 0
            r4.mo22983b(r7, r10, r12)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m35688E(r12)
            r52 = r0
            r51 = r14
            r12 = 5
            goto L_0x06de
        L_0x057b:
            r50 = r7
            r7 = 1702061171(0x65736473, float:7.183675E22)
            if (r10 == r7) goto L_0x0763
            if (r60 == 0) goto L_0x0595
            r7 = 2002876005(0x77617665, float:4.5729223E33)
            if (r10 != r7) goto L_0x0595
            r52 = r0
            r51 = r14
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r7 = 1702061171(0x65736473, float:7.183675E22)
            goto L_0x076a
        L_0x0595:
            r7 = 1684103987(0x64616333, float:1.6630662E22)
            if (r10 != r7) goto L_0x05e3
            int r7 = r9 + 8
            r4.mo23007z(r7)
            java.lang.String r7 = java.lang.Integer.toString(r13)
            int r10 = r4.mo22997p()
            r10 = r10 & 192(0xc0, float:2.69E-43)
            r12 = 6
            int r10 = r10 >> r12
            int[] r40 = p125ia.C5313b.f17502b
            r10 = r40[r10]
            int r40 = r4.mo22997p()
            int[] r42 = p125ia.C5313b.f17504d
            r51 = r40 & 56
            r20 = 3
            int r51 = r51 >> 3
            r42 = r42[r51]
            r22 = 4
            r40 = r40 & 4
            if (r40 == 0) goto L_0x05c5
            int r42 = r42 + 1
        L_0x05c5:
            r51 = r14
            r12 = r42
            com.google.android.exoplayer2.Format$b r14 = new com.google.android.exoplayer2.Format$b
            r14.<init>()
            r14.f13436a = r7
            r14.f13446k = r0
            r14.f13459x = r12
            r14.f13460y = r10
            r14.f13449n = r3
            r14.f13438c = r8
            com.google.android.exoplayer2.Format r7 = new com.google.android.exoplayer2.Format
            r7.<init>((com.google.android.exoplayer2.Format.C3872b) r14)
            r52 = r0
            goto L_0x065b
        L_0x05e3:
            r51 = r14
            r7 = 1684366131(0x64656333, float:1.692581E22)
            if (r10 != r7) goto L_0x065f
            int r7 = r9 + 8
            r4.mo23007z(r7)
            java.lang.String r7 = java.lang.Integer.toString(r13)
            r10 = 2
            r4.mo22981A(r10)
            int r10 = r4.mo22997p()
            r10 = r10 & 192(0xc0, float:2.69E-43)
            r12 = 6
            int r10 = r10 >> r12
            int[] r14 = p125ia.C5313b.f17502b
            r10 = r14[r10]
            int r14 = r4.mo22997p()
            int[] r40 = p125ia.C5313b.f17504d
            r42 = r14 & 14
            r19 = 1
            int r42 = r42 >> 1
            r40 = r40[r42]
            r14 = r14 & 1
            if (r14 == 0) goto L_0x0617
            int r40 = r40 + 1
        L_0x0617:
            int r14 = r4.mo22997p()
            r14 = r14 & 30
            int r14 = r14 >> 1
            if (r14 <= 0) goto L_0x062d
            int r14 = r4.mo22997p()
            r18 = 2
            r14 = r14 & 2
            if (r14 == 0) goto L_0x062d
            int r40 = r40 + 2
        L_0x062d:
            r14 = r40
            int r12 = r4.f21040c
            r52 = r0
            int r0 = r4.f21039b
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x0643
            int r0 = r4.mo22997p()
            r12 = 1
            r0 = r0 & r12
            if (r0 == 0) goto L_0x0643
            java.lang.String r0 = "audio/eac3-joc"
            goto L_0x0645
        L_0x0643:
            r0 = r43
        L_0x0645:
            com.google.android.exoplayer2.Format$b r12 = new com.google.android.exoplayer2.Format$b
            r12.<init>()
            r12.f13436a = r7
            r12.f13446k = r0
            r12.f13459x = r14
            r12.f13460y = r10
            r12.f13449n = r3
            r12.f13438c = r8
            com.google.android.exoplayer2.Format r7 = new com.google.android.exoplayer2.Format
            r7.<init>((com.google.android.exoplayer2.Format.C3872b) r12)
        L_0x065b:
            r42 = r7
            r12 = 5
            goto L_0x06bc
        L_0x065f:
            r52 = r0
            r0 = 1684103988(0x64616334, float:1.6630663E22)
            if (r10 != r0) goto L_0x069c
            int r0 = r9 + 8
            r4.mo23007z(r0)
            java.lang.String r0 = java.lang.Integer.toString(r13)
            r7 = 1
            r4.mo22981A(r7)
            int r10 = r4.mo22997p()
            r10 = r10 & 32
            r12 = 5
            int r10 = r10 >> r12
            if (r10 != r7) goto L_0x0681
            r7 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0684
        L_0x0681:
            r7 = 44100(0xac44, float:6.1797E-41)
        L_0x0684:
            com.google.android.exoplayer2.Format$b r10 = new com.google.android.exoplayer2.Format$b
            r10.<init>()
            r10.f13436a = r0
            r10.f13446k = r2
            r0 = 2
            r10.f13459x = r0
            r10.f13460y = r7
            r10.f13449n = r3
            r10.f13438c = r8
            com.google.android.exoplayer2.Format r0 = new com.google.android.exoplayer2.Format
            r0.<init>((com.google.android.exoplayer2.Format.C3872b) r10)
            goto L_0x06ba
        L_0x069c:
            r12 = 5
            r0 = 1684305011(0x64647473, float:1.6856995E22)
            if (r10 != r0) goto L_0x06c2
            com.google.android.exoplayer2.Format$b r0 = new com.google.android.exoplayer2.Format$b
            r0.<init>()
            r0.mo15807b(r13)
            r0.f13446k = r11
            r0.f13459x = r15
            r0.f13460y = r5
            r0.f13449n = r3
            r0.f13438c = r8
            com.google.android.exoplayer2.Format r7 = new com.google.android.exoplayer2.Format
            r7.<init>((com.google.android.exoplayer2.Format.C3872b) r0)
            r0 = r7
        L_0x06ba:
            r42 = r0
        L_0x06bc:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 4
            goto L_0x075f
        L_0x06c2:
            r0 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r10 != r0) goto L_0x06e0
            int r0 = r1 + -8
            byte[] r7 = f20493a
            int r10 = r7.length
            int r10 = r10 + r0
            byte[] r10 = java.util.Arrays.copyOf(r7, r10)
            int r14 = r9 + 8
            r4.mo23007z(r14)
            int r7 = r7.length
            r4.mo22983b(r7, r0, r10)
            java.util.ArrayList r7 = ce0.C21100e.m49348k(r10)
        L_0x06de:
            r14 = 4
            goto L_0x070c
        L_0x06e0:
            r0 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r10 != r0) goto L_0x0712
            int r0 = r1 + -12
            int r7 = r0 + 4
            byte[] r7 = new byte[r7]
            r10 = 102(0x66, float:1.43E-43)
            r14 = 0
            r7[r14] = r10
            r10 = 76
            r14 = 1
            r7[r14] = r10
            r10 = 97
            r14 = 2
            r7[r14] = r10
            r10 = 67
            r14 = 3
            r7[r14] = r10
            int r10 = r9 + 12
            r4.mo23007z(r10)
            r14 = 4
            r4.mo22983b(r14, r0, r7)
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m35688E(r7)
        L_0x070c:
            r47 = r7
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x075f
        L_0x0712:
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 4
            if (r10 != r0) goto L_0x075f
            int r5 = r1 + -12
            byte[] r7 = new byte[r5]
            int r10 = r9 + 12
            r4.mo23007z(r10)
            r10 = 0
            r4.mo22983b(r10, r5, r7)
            ub.r r5 = new ub.r
            r5.<init>((byte[]) r7)
            r10 = 9
            r5.mo23007z(r10)
            int r10 = r5.mo22997p()
            r15 = 20
            r5.mo23007z(r15)
            int r5 = r5.mo23000s()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r5 = android.util.Pair.create(r5, r10)
            java.lang.Object r10 = r5.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r5 = r5.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r15 = r5.intValue()
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.m35688E(r7)
            r47 = r5
            r5 = r10
        L_0x075f:
            r0 = -1
        L_0x0760:
            r12 = 0
            goto L_0x07ce
        L_0x0763:
            r52 = r0
            r51 = r14
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
        L_0x076a:
            r12 = 5
            r14 = 4
            if (r10 != r7) goto L_0x0770
            r7 = r9
            goto L_0x0796
        L_0x0770:
            int r7 = r4.f21039b
        L_0x0772:
            int r10 = r7 - r9
            if (r10 >= r1) goto L_0x0795
            r4.mo23007z(r7)
            int r10 = r4.mo22984c()
            if (r10 <= 0) goto L_0x0781
            r0 = 1
            goto L_0x0782
        L_0x0781:
            r0 = 0
        L_0x0782:
            p583jk.C17875h.m44305p(r0, r6)
            int r0 = r4.mo22984c()
            r12 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r12) goto L_0x078f
            goto L_0x0796
        L_0x078f:
            int r7 = r7 + r10
            r0 = 1634492771(0x616c6163, float:2.7252807E20)
            r12 = 5
            goto L_0x0772
        L_0x0795:
            r7 = -1
        L_0x0796:
            r0 = -1
            if (r7 == r0) goto L_0x0760
            android.util.Pair r7 = m15662a(r7, r4)
            java.lang.Object r10 = r7.first
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r7.second
            byte[] r7 = (byte[]) r7
            if (r7 == 0) goto L_0x07cc
            java.lang.String r11 = "audio/mp4a-latm"
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x07c4
            ub.q r5 = new ub.q
            int r11 = r7.length
            r5.<init>(r7, r11)
            r12 = 0
            ia.a$a r5 = p125ia.C5311a.m13352c(r5, r12)
            int r11 = r5.f17498a
            int r15 = r5.f17499b
            java.lang.String r5 = r5.f17500c
            r51 = r5
            r5 = r11
            goto L_0x07c5
        L_0x07c4:
            r12 = 0
        L_0x07c5:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.m35688E(r7)
            r47 = r7
            goto L_0x07cd
        L_0x07cc:
            r12 = 0
        L_0x07cd:
            r11 = r10
        L_0x07ce:
            int r9 = r9 + r1
            r10 = r48
            r12 = r49
            r7 = r50
            r14 = r51
            r0 = r52
            goto L_0x0541
        L_0x07db:
            r50 = r7
            r48 = r10
            r49 = r12
            r51 = r14
            r0 = -1
            r12 = 0
            r14 = 4
            if (r42 != 0) goto L_0x080e
            if (r11 == 0) goto L_0x080e
            com.google.android.exoplayer2.Format$b r1 = new com.google.android.exoplayer2.Format$b
            r1.<init>()
            r1.mo15807b(r13)
            r1.f13446k = r11
            r2 = r51
            r1.f13443h = r2
            r1.f13459x = r15
            r1.f13460y = r5
            r7 = r50
            r1.f13461z = r7
            r2 = r47
            r1.f13448m = r2
            r1.f13449n = r3
            r1.f13438c = r8
            com.google.android.exoplayer2.Format r15 = new com.google.android.exoplayer2.Format
            r15.<init>((com.google.android.exoplayer2.Format.C3872b) r1)
            goto L_0x0810
        L_0x080e:
            r15 = r42
        L_0x0810:
            r40 = r8
            r3 = r45
            r10 = r48
            r9 = r49
            r6 = 3
            goto L_0x0a4b
        L_0x081b:
            r39 = r0
            r44 = r2
            r45 = r3
            r41 = r5
            r48 = r10
            r49 = r12
            r46 = r14
            r0 = -1
            r12 = 0
            r14 = 4
            int r1 = r49 + 8
            r2 = 8
            int r1 = r1 + r2
            r4.mo23007z(r1)
            r1 = 16
            r4.mo22981A(r1)
            int r2 = r4.mo23002u()
            int r3 = r4.mo23002u()
            r5 = 50
            r4.mo22981A(r5)
            int r5 = r4.f21039b
            r9 = 1701733238(0x656e6376, float:7.035987E22)
            if (r7 != r9) goto L_0x087d
            r10 = r48
            r9 = r49
            android.util.Pair r11 = m15664c(r4, r9, r10)
            if (r11 == 0) goto L_0x0876
            java.lang.Object r7 = r11.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0 = r58
            if (r0 != 0) goto L_0x0865
            r1 = 0
            goto L_0x086f
        L_0x0865:
            java.lang.Object r1 = r11.second
            ta.m r1 = (p264ta.C6642m) r1
            java.lang.String r1 = r1.f20615b
            com.google.android.exoplayer2.drm.DrmInitData r1 = r0.mo15979b(r1)
        L_0x086f:
            java.lang.Object r11 = r11.second
            ta.m r11 = (p264ta.C6642m) r11
            r46[r44] = r11
            goto L_0x0879
        L_0x0876:
            r0 = r58
            r1 = r0
        L_0x0879:
            r4.mo23007z(r5)
            goto L_0x0884
        L_0x087d:
            r0 = r58
            r10 = r48
            r9 = r49
            r1 = r0
        L_0x0884:
            java.lang.String r11 = "video/3gpp"
            r12 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r7 != r12) goto L_0x0890
            java.lang.String r12 = "video/mpeg"
            goto L_0x0898
        L_0x0890:
            r12 = 1211250227(0x48323633, float:182488.8)
            if (r7 != r12) goto L_0x0897
            r12 = r11
            goto L_0x0898
        L_0x0897:
            r12 = 0
        L_0x0898:
            r22 = 1065353216(0x3f800000, float:1.0)
            r47 = r1
            r40 = r8
            r42 = r11
            r43 = r15
            r37 = r29
            r0 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r11 = 0
            r14 = -1
            r15 = 0
            r29 = 0
        L_0x08ac:
            int r1 = r5 - r9
            if (r1 >= r10) goto L_0x0a12
            r4.mo23007z(r5)
            int r1 = r4.f21039b
            r48 = r8
            int r8 = r4.mo22984c()
            r49 = r14
            if (r8 != 0) goto L_0x08c6
            int r14 = r4.f21039b
            int r14 = r14 - r9
            if (r14 != r10) goto L_0x08c6
            goto L_0x0a16
        L_0x08c6:
            if (r8 <= 0) goto L_0x08ca
            r14 = 1
            goto L_0x08cb
        L_0x08ca:
            r14 = 0
        L_0x08cb:
            p583jk.C17875h.m44305p(r14, r6)
            int r14 = r4.mo22984c()
            r50 = r6
            r6 = 1635148611(0x61766343, float:2.8406573E20)
            if (r14 != r6) goto L_0x08f8
            if (r12 != 0) goto L_0x08dd
            r6 = 1
            goto L_0x08de
        L_0x08dd:
            r6 = 0
        L_0x08de:
            p583jk.C17875h.m44304o(r6)
            int r1 = r1 + 8
            r4.mo23007z(r1)
            vb.a r1 = p290vb.C6932a.m16352a(r4)
            java.util.List<byte[]> r6 = r1.f21599a
            int r11 = r1.f21600b
            if (r29 != 0) goto L_0x08f2
            float r0 = r1.f21603e
        L_0x08f2:
            java.lang.String r1 = r1.f21604f
            java.lang.String r12 = "video/avc"
            goto L_0x0917
        L_0x08f8:
            r6 = 1752589123(0x68766343, float:4.6541328E24)
            if (r14 != r6) goto L_0x091e
            if (r12 != 0) goto L_0x0901
            r6 = 1
            goto L_0x0902
        L_0x0901:
            r6 = 0
        L_0x0902:
            p583jk.C17875h.m44304o(r6)
            int r1 = r1 + 8
            r4.mo23007z(r1)
            vb.c r1 = p290vb.C6935c.m16357a(r4)
            java.util.List<byte[]> r6 = r1.f21618a
            int r11 = r1.f21619b
            java.lang.String r1 = r1.f21620c
            java.lang.String r12 = "video/hevc"
        L_0x0917:
            r37 = r11
            r48 = r6
            r6 = 3
            goto L_0x0a08
        L_0x091e:
            r6 = 1685480259(0x64766343, float:1.8180206E22)
            if (r14 == r6) goto L_0x09fb
            r6 = 1685485123(0x64767643, float:1.8185683E22)
            if (r14 != r6) goto L_0x092a
            goto L_0x09fb
        L_0x092a:
            r6 = 1987076931(0x76706343, float:1.21891066E33)
            if (r14 != r6) goto L_0x0944
            if (r12 != 0) goto L_0x0933
            r1 = 1
            goto L_0x0934
        L_0x0933:
            r1 = 0
        L_0x0934:
            p583jk.C17875h.m44304o(r1)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r7 != r1) goto L_0x0940
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x0954
        L_0x0940:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x0954
        L_0x0944:
            r6 = 1635135811(0x61763143, float:2.8384055E20)
            if (r14 != r6) goto L_0x0959
            if (r12 != 0) goto L_0x094d
            r1 = 1
            goto L_0x094e
        L_0x094d:
            r1 = 0
        L_0x094e:
            p583jk.C17875h.m44304o(r1)
            java.lang.String r1 = "video/av01"
        L_0x0954:
            r12 = r1
            r6 = 1702061171(0x65736473, float:7.183675E22)
            goto L_0x0968
        L_0x0959:
            r6 = 1681012275(0x64323633, float:1.3149704E22)
            if (r14 != r6) goto L_0x096b
            if (r12 != 0) goto L_0x0962
            r1 = 1
            goto L_0x0963
        L_0x0962:
            r1 = 0
        L_0x0963:
            p583jk.C17875h.m44304o(r1)
            r12 = r42
        L_0x0968:
            r6 = 3
            goto L_0x0a09
        L_0x096b:
            r6 = 1702061171(0x65736473, float:7.183675E22)
            if (r14 != r6) goto L_0x098d
            if (r12 != 0) goto L_0x0974
            r12 = 1
            goto L_0x0975
        L_0x0974:
            r12 = 0
        L_0x0975:
            p583jk.C17875h.m44304o(r12)
            android.util.Pair r1 = m15662a(r1, r4)
            java.lang.Object r12 = r1.first
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.second
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0968
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.m35688E(r1)
            r48 = r1
            goto L_0x0968
        L_0x098d:
            r6 = 1885434736(0x70617370, float:2.7909473E29)
            if (r14 != r6) goto L_0x09a9
            int r1 = r1 + 8
            r4.mo23007z(r1)
            int r0 = r4.mo23000s()
            int r1 = r4.mo23000s()
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            r14 = r49
            r6 = 3
            r29 = 1
            goto L_0x0a0b
        L_0x09a9:
            r6 = 1937126244(0x73763364, float:1.9506033E31)
            if (r14 != r6) goto L_0x09d5
            int r6 = r1 + 8
        L_0x09b0:
            int r14 = r6 - r1
            if (r14 >= r8) goto L_0x09d2
            r4.mo23007z(r6)
            int r14 = r4.mo22984c()
            int r15 = r4.mo22984c()
            r51 = r1
            r1 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r15 != r1) goto L_0x09ce
            byte[] r1 = r4.f21038a
            int r14 = r14 + r6
            byte[] r15 = java.util.Arrays.copyOfRange(r1, r6, r14)
            goto L_0x0968
        L_0x09ce:
            int r6 = r6 + r14
            r1 = r51
            goto L_0x09b0
        L_0x09d2:
            r6 = 3
            r15 = 0
            goto L_0x0a09
        L_0x09d5:
            r1 = 1936995172(0x73743364, float:1.9347576E31)
            if (r14 != r1) goto L_0x0968
            int r1 = r4.mo22997p()
            r6 = 3
            r4.mo22981A(r6)
            if (r1 != 0) goto L_0x0a09
            int r1 = r4.mo22997p()
            if (r1 == 0) goto L_0x09f9
            r14 = 1
            if (r1 == r14) goto L_0x09f7
            r14 = 2
            if (r1 == r14) goto L_0x09f5
            if (r1 == r6) goto L_0x09f3
            goto L_0x0a09
        L_0x09f3:
            r14 = 3
            goto L_0x0a0b
        L_0x09f5:
            r14 = 2
            goto L_0x0a0b
        L_0x09f7:
            r14 = 1
            goto L_0x0a0b
        L_0x09f9:
            r14 = 0
            goto L_0x0a0b
        L_0x09fb:
            r6 = 3
            b0.b r1 = p019b0.C1425b.m3809e(r4)
            if (r1 == 0) goto L_0x0a09
            java.lang.String r1 = r1.f5271b
            java.lang.String r11 = "video/dolby-vision"
            r12 = r11
        L_0x0a08:
            r11 = r1
        L_0x0a09:
            r14 = r49
        L_0x0a0b:
            int r5 = r5 + r8
            r8 = r48
            r6 = r50
            goto L_0x08ac
        L_0x0a12:
            r48 = r8
            r49 = r14
        L_0x0a16:
            r6 = 3
            if (r12 != 0) goto L_0x0a20
            r29 = r37
            r15 = r43
            r3 = r45
            goto L_0x0a4b
        L_0x0a20:
            com.google.android.exoplayer2.Format$b r1 = new com.google.android.exoplayer2.Format$b
            r1.<init>()
            r1.mo15807b(r13)
            r1.f13446k = r12
            r1.f13443h = r11
            r1.f13451p = r2
            r1.f13452q = r3
            r1.f13455t = r0
            r3 = r45
            r1.f13454s = r3
            r1.f13456u = r15
            r14 = r49
            r1.f13457v = r14
            r0 = r48
            r1.f13448m = r0
            r0 = r47
            r1.f13449n = r0
            com.google.android.exoplayer2.Format r15 = new com.google.android.exoplayer2.Format
            r15.<init>((com.google.android.exoplayer2.Format.C3872b) r1)
            r29 = r37
        L_0x0a4b:
            int r10 = r10 + r9
            r4.mo23007z(r10)
            int r2 = r44 + 1
            r1 = r58
            r12 = r27
            r9 = r30
            r10 = r33
            r6 = r35
            r0 = r39
            r8 = r40
            r5 = r41
            r14 = r46
            goto L_0x0202
        L_0x0a65:
            r39 = r0
            r41 = r5
            r35 = r6
            r30 = r9
            r33 = r10
            r46 = r14
            r43 = r15
            if (r59 != 0) goto L_0x0af9
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r5 = r41
            ta.a$a r0 = r5.mo22800b(r0)
            if (r0 == 0) goto L_0x0afb
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            ta.a$b r0 = r0.mo22801c(r1)
            if (r0 != 0) goto L_0x0a8b
            r0 = 0
            goto L_0x0aee
        L_0x0a8b:
            ub.r r0 = r0.f20492b
            r1 = 8
            r0.mo23007z(r1)
            int r1 = r0.mo22984c()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0.mo23000s()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r7 = 0
        L_0x0aa3:
            if (r7 >= r2) goto L_0x0aea
            r6 = 1
            if (r1 != r6) goto L_0x0aad
            long r8 = r0.mo23001t()
            goto L_0x0ab1
        L_0x0aad:
            long r8 = r0.mo22998q()
        L_0x0ab1:
            r3[r7] = r8
            if (r1 != r6) goto L_0x0aba
            long r8 = r0.mo22991j()
            goto L_0x0abf
        L_0x0aba:
            int r6 = r0.mo22984c()
            long r8 = (long) r6
        L_0x0abf:
            r4[r7] = r8
            byte[] r6 = r0.f21038a
            int r8 = r0.f21039b
            int r9 = r8 + 1
            byte r8 = r6[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r10 = 8
            int r8 = r8 << r10
            int r11 = r9 + 1
            r0.f21039b = r11
            byte r6 = r6[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r8
            short r6 = (short) r6
            r8 = 1
            if (r6 != r8) goto L_0x0ae2
            r6 = 2
            r0.mo22981A(r6)
            int r7 = r7 + 1
            goto L_0x0aa3
        L_0x0ae2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0aea:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
        L_0x0aee:
            if (r0 == 0) goto L_0x0afb
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            goto L_0x0afd
        L_0x0af9:
            r5 = r41
        L_0x0afb:
            r0 = 0
            r1 = 0
        L_0x0afd:
            if (r43 != 0) goto L_0x0b01
        L_0x0aff:
            r11 = 0
            goto L_0x0b24
        L_0x0b01:
            ta.l r11 = new ta.l
            r2 = r39
            java.lang.Object r2 = r2.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r19 = r2.longValue()
            r16 = r11
            r17 = r13
            r18 = r30
            r21 = r35
            r23 = r33
            r25 = r43
            r27 = r46
            r28 = r29
            r29 = r1
            r30 = r0
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
        L_0x0b24:
            r0 = r61
            java.lang.Object r1 = r0.apply(r11)
            ta.l r1 = (p264ta.C6641l) r1
            if (r1 != 0) goto L_0x0b33
            r3 = r55
            r2 = r32
            goto L_0x0b5c
        L_0x0b33:
            r2 = 1835297121(0x6d646961, float:4.4181236E27)
            ta.a$a r2 = r5.mo22800b(r2)
            r2.getClass()
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            ta.a$a r2 = r2.mo22800b(r3)
            r2.getClass()
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            ta.a$a r2 = r2.mo22800b(r3)
            r2.getClass()
            r3 = r55
            ta.o r1 = m15665d(r1, r2, r3)
            r2 = r32
            r2.add(r1)
        L_0x0b5c:
            int r4 = r31 + 1
            r0 = r54
            r1 = r58
            goto L_0x000a
        L_0x0b64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p264ta.C6622b.m15666e(ta.a$a, ma.p, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean, ld.c):java.util.ArrayList");
    }
}
