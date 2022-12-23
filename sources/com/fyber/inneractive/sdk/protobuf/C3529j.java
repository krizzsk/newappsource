package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3508i;
import com.fyber.inneractive.sdk.protobuf.C3564q0;
import com.fyber.inneractive.sdk.protobuf.C3569r1;
import com.fyber.inneractive.sdk.protobuf.C3576s1;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.protobuf.j */
public abstract class C3529j {

    /* renamed from: a */
    public int f12472a;

    /* renamed from: b */
    public int f12473b;

    /* renamed from: c */
    public int f12474c;

    /* renamed from: d */
    public C3537k f12475d;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$b */
    public static final class C3531b extends C3529j {

        /* renamed from: e */
        public final byte[] f12476e;

        /* renamed from: f */
        public final boolean f12477f;

        /* renamed from: g */
        public int f12478g;

        /* renamed from: h */
        public int f12479h;

        /* renamed from: i */
        public int f12480i;

        /* renamed from: j */
        public int f12481j;

        /* renamed from: k */
        public int f12482k;

        /* renamed from: l */
        public int f12483l = Integer.MAX_VALUE;

        public C3531b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f12476e = bArr;
            this.f12478g = i2 + i;
            this.f12480i = i;
            this.f12481j = i;
            this.f12477f = z;
        }

        /* renamed from: A */
        public long mo15014A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo15017w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C3476a0.m8731e();
        }

        /* renamed from: B */
        public final void mo15015B() {
            int i = this.f12478g + this.f12479h;
            this.f12478g = i;
            int i2 = i - this.f12481j;
            int i3 = this.f12483l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f12479h = i4;
                this.f12478g = i - i4;
                return;
            }
            this.f12479h = 0;
        }

        /* renamed from: a */
        public void mo14987a(int i) throws C3476a0 {
            if (this.f12482k != i) {
                throw C3476a0.m8727a();
            }
        }

        /* renamed from: b */
        public int mo14990b() {
            return this.f12480i - this.f12481j;
        }

        /* renamed from: c */
        public void mo14991c(int i) {
            this.f12483l = i;
            mo15015B();
        }

        /* renamed from: d */
        public boolean mo14994d() throws IOException {
            return mo15020z() != 0;
        }

        /* renamed from: e */
        public boolean mo14996e(int i) throws IOException {
            int t;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f12478g - this.f12480i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f12476e;
                        int i5 = this.f12480i;
                        this.f12480i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw C3476a0.m8731e();
                }
                while (i4 < 10) {
                    if (mo15017w() < 0) {
                        i4++;
                    }
                }
                throw C3476a0.m8731e();
                return true;
            } else if (i3 == 1) {
                mo15016f(8);
                return true;
            } else if (i3 == 2) {
                mo15016f(mo15004m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo15011t();
                    if (t == 0 || !mo14996e(t)) {
                        mo14987a(C3584t1.m9573a(i >>> 3, 4));
                    }
                    t = mo15011t();
                    break;
                } while (!mo14996e(t));
                mo14987a(C3584t1.m9573a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo15016f(4);
                    return true;
                }
                throw C3476a0.m8730d();
            }
        }

        /* renamed from: f */
        public double mo14997f() throws IOException {
            return Double.longBitsToDouble(mo15019y());
        }

        /* renamed from: g */
        public int mo14998g() throws IOException {
            return mo15004m();
        }

        /* renamed from: h */
        public int mo14999h() throws IOException {
            return mo15018x();
        }

        /* renamed from: i */
        public long mo15000i() throws IOException {
            return mo15019y();
        }

        /* renamed from: j */
        public float mo15001j() throws IOException {
            return Float.intBitsToFloat(mo15018x());
        }

        /* renamed from: k */
        public int mo15002k() throws IOException {
            return mo15004m();
        }

        /* renamed from: l */
        public long mo15003l() throws IOException {
            return mo15020z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo15004m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f12480i
                int r1 = r5.f12478g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f12476e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f12480i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo15014A()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f12480i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3529j.C3531b.mo15004m():int");
        }

        /* renamed from: n */
        public int mo15005n() throws IOException {
            return mo15018x();
        }

        /* renamed from: o */
        public long mo15006o() throws IOException {
            return mo15019y();
        }

        /* renamed from: p */
        public int mo15007p() throws IOException {
            return C3529j.m9025b(mo15004m());
        }

        /* renamed from: q */
        public long mo15008q() throws IOException {
            return C3529j.m9021a(mo15020z());
        }

        /* renamed from: r */
        public String mo15009r() throws IOException {
            int m = mo15004m();
            if (m > 0) {
                int i = this.f12478g;
                int i2 = this.f12480i;
                if (m <= i - i2) {
                    String str = new String(this.f12476e, i2, m, C3609z.f12640a);
                    this.f12480i += m;
                    return str;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m < 0) {
                throw C3476a0.m8732f();
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: s */
        public String mo15010s() throws IOException {
            int m = mo15004m();
            if (m > 0) {
                int i = this.f12478g;
                int i2 = this.f12480i;
                if (m <= i - i2) {
                    String a = C3576s1.f12550a.mo15182a(this.f12476e, i2, m);
                    this.f12480i += m;
                    return a;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m <= 0) {
                throw C3476a0.m8732f();
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: t */
        public int mo15011t() throws IOException {
            if (mo14992c()) {
                this.f12482k = 0;
                return 0;
            }
            int m = mo15004m();
            this.f12482k = m;
            int i = C3584t1.f12572a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C3476a0.m8728b();
        }

        /* renamed from: u */
        public int mo15012u() throws IOException {
            return mo15004m();
        }

        /* renamed from: v */
        public long mo15013v() throws IOException {
            return mo15020z();
        }

        /* renamed from: w */
        public byte mo15017w() throws IOException {
            int i = this.f12480i;
            if (i != this.f12478g) {
                byte[] bArr = this.f12476e;
                this.f12480i = i + 1;
                return bArr[i];
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: x */
        public int mo15018x() throws IOException {
            int i = this.f12480i;
            if (this.f12478g - i >= 4) {
                byte[] bArr = this.f12476e;
                this.f12480i = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: y */
        public long mo15019y() throws IOException {
            int i = this.f12480i;
            if (this.f12478g - i >= 8) {
                byte[] bArr = this.f12476e;
                this.f12480i = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C3476a0.m8735i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo15020z() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f12480i
                int r1 = r11.f12478g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f12476e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f12480i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo15014A()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f12480i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3529j.C3531b.mo15020z():long");
        }

        /* renamed from: d */
        public int mo14993d(int i) throws C3476a0 {
            if (i >= 0) {
                int b = mo14990b() + i;
                int i2 = this.f12483l;
                if (b <= i2) {
                    this.f12483l = b;
                    mo15015B();
                    return i2;
                }
                throw C3476a0.m8735i();
            }
            throw C3476a0.m8732f();
        }

        /* renamed from: f */
        public void mo15016f(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f12478g;
                int i3 = this.f12480i;
                if (i <= i2 - i3) {
                    this.f12480i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C3476a0.m8732f();
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: a */
        public void mo14988a(int i, C3564q0.C3565a aVar, C3562q qVar) throws IOException {
            int i2 = this.f12472a;
            if (i2 < this.f12473b) {
                this.f12472a = i2 + 1;
                ((GeneratedMessageLite.C3465a) aVar).mo14757a((C3529j) this, qVar);
                mo14987a(C3584t1.m9573a(i, 4));
                this.f12472a--;
                return;
            }
            throw C3476a0.m8734h();
        }

        /* renamed from: c */
        public boolean mo14992c() throws IOException {
            return this.f12480i == this.f12478g;
        }

        /* renamed from: a */
        public void mo14989a(C3564q0.C3565a aVar, C3562q qVar) throws IOException {
            int m = mo15004m();
            if (this.f12472a < this.f12473b) {
                int d = mo14993d(m);
                this.f12472a++;
                ((GeneratedMessageLite.C3465a) aVar).mo14757a((C3529j) this, qVar);
                mo14987a(0);
                this.f12472a--;
                this.f12483l = d;
                mo15015B();
                return;
            }
            throw C3476a0.m8734h();
        }

        /* renamed from: e */
        public C3508i mo14995e() throws IOException {
            byte[] bArr;
            int m = mo15004m();
            if (m > 0) {
                int i = this.f12478g;
                int i2 = this.f12480i;
                if (m <= i - i2) {
                    C3508i a = C3508i.m8971a(this.f12476e, i2, m);
                    this.f12480i += m;
                    return a;
                }
            }
            if (m == 0) {
                return C3508i.f12443b;
            }
            if (m > 0) {
                int i3 = this.f12478g;
                int i4 = this.f12480i;
                if (m <= i3 - i4) {
                    int i5 = m + i4;
                    this.f12480i = i5;
                    bArr = Arrays.copyOfRange(this.f12476e, i4, i5);
                    C3508i iVar = C3508i.f12443b;
                    return new C3508i.C3516h(bArr);
                }
            }
            if (m > 0) {
                throw C3476a0.m8735i();
            } else if (m == 0) {
                bArr = C3609z.f12641b;
                C3508i iVar2 = C3508i.f12443b;
                return new C3508i.C3516h(bArr);
            } else {
                throw C3476a0.m8732f();
            }
        }

        /* renamed from: a */
        public int mo14986a() {
            int i = this.f12483l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo14990b();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$c */
    public static final class C3532c extends C3529j {

        /* renamed from: e */
        public final InputStream f12484e;

        /* renamed from: f */
        public final byte[] f12485f;

        /* renamed from: g */
        public int f12486g;

        /* renamed from: h */
        public int f12487h;

        /* renamed from: i */
        public int f12488i;

        /* renamed from: j */
        public int f12489j;

        /* renamed from: k */
        public int f12490k;

        /* renamed from: l */
        public int f12491l = Integer.MAX_VALUE;

        public C3532c(InputStream inputStream, int i) {
            super();
            C3609z.m9638a(inputStream, "input");
            this.f12484e = inputStream;
            this.f12485f = new byte[i];
            this.f12486g = 0;
            this.f12488i = 0;
            this.f12490k = 0;
        }

        /* renamed from: A */
        public long mo15021A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo15029w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C3476a0.m8731e();
        }

        /* renamed from: B */
        public final void mo15022B() {
            int i = this.f12486g + this.f12487h;
            this.f12486g = i;
            int i2 = this.f12490k + i;
            int i3 = this.f12491l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f12487h = i4;
                this.f12486g = i - i4;
                return;
            }
            this.f12487h = 0;
        }

        /* renamed from: a */
        public void mo14987a(int i) throws C3476a0 {
            if (this.f12489j != i) {
                throw C3476a0.m8727a();
            }
        }

        /* renamed from: b */
        public int mo14990b() {
            return this.f12490k + this.f12488i;
        }

        /* renamed from: c */
        public void mo14991c(int i) {
            this.f12491l = i;
            mo15022B();
        }

        /* renamed from: d */
        public boolean mo14994d() throws IOException {
            return mo15032z() != 0;
        }

        /* renamed from: e */
        public boolean mo14996e(int i) throws IOException {
            int t;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (this.f12486g - this.f12488i >= 10) {
                    while (i4 < 10) {
                        byte[] bArr = this.f12485f;
                        int i5 = this.f12488i;
                        this.f12488i = i5 + 1;
                        if (bArr[i5] < 0) {
                            i4++;
                        }
                    }
                    throw C3476a0.m8731e();
                }
                while (i4 < 10) {
                    if (mo15029w() < 0) {
                        i4++;
                    }
                }
                throw C3476a0.m8731e();
                return true;
            } else if (i3 == 1) {
                mo15027i(8);
                return true;
            } else if (i3 == 2) {
                mo15027i(mo15004m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo15011t();
                    if (t == 0 || !mo14996e(t)) {
                        mo14987a(C3584t1.m9573a(i >>> 3, 4));
                    }
                    t = mo15011t();
                    break;
                } while (!mo14996e(t));
                mo14987a(C3584t1.m9573a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo15027i(4);
                    return true;
                }
                throw C3476a0.m8730d();
            }
        }

        /* renamed from: f */
        public double mo14997f() throws IOException {
            return Double.longBitsToDouble(mo15031y());
        }

        /* renamed from: g */
        public int mo14998g() throws IOException {
            return mo15004m();
        }

        /* renamed from: h */
        public int mo14999h() throws IOException {
            return mo15030x();
        }

        /* renamed from: i */
        public long mo15000i() throws IOException {
            return mo15031y();
        }

        /* renamed from: j */
        public float mo15001j() throws IOException {
            return Float.intBitsToFloat(mo15030x());
        }

        /* renamed from: k */
        public int mo15002k() throws IOException {
            return mo15004m();
        }

        /* renamed from: l */
        public long mo15003l() throws IOException {
            return mo15032z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo15004m() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f12488i
                int r1 = r5.f12486g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f12485f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f12488i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo15021A()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f12488i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3529j.C3532c.mo15004m():int");
        }

        /* renamed from: n */
        public int mo15005n() throws IOException {
            return mo15030x();
        }

        /* renamed from: o */
        public long mo15006o() throws IOException {
            return mo15031y();
        }

        /* renamed from: p */
        public int mo15007p() throws IOException {
            return C3529j.m9025b(mo15004m());
        }

        /* renamed from: q */
        public long mo15008q() throws IOException {
            return C3529j.m9021a(mo15032z());
        }

        /* renamed from: r */
        public String mo15009r() throws IOException {
            int m = mo15004m();
            if (m > 0) {
                int i = this.f12486g;
                int i2 = this.f12488i;
                if (m <= i - i2) {
                    String str = new String(this.f12485f, i2, m, C3609z.f12640a);
                    this.f12488i += m;
                    return str;
                }
            }
            if (m == 0) {
                return "";
            }
            if (m > this.f12486g) {
                return new String(mo15023a(m, false), C3609z.f12640a);
            }
            mo15026h(m);
            String str2 = new String(this.f12485f, this.f12488i, m, C3609z.f12640a);
            this.f12488i += m;
            return str2;
        }

        /* renamed from: s */
        public String mo15010s() throws IOException {
            byte[] bArr;
            int m = mo15004m();
            int i = this.f12488i;
            int i2 = this.f12486g;
            if (m <= i2 - i && m > 0) {
                bArr = this.f12485f;
                this.f12488i = i + m;
            } else if (m == 0) {
                return "";
            } else {
                if (m <= i2) {
                    mo15026h(m);
                    bArr = this.f12485f;
                    this.f12488i = m + 0;
                } else {
                    bArr = mo15023a(m, false);
                }
                i = 0;
            }
            return C3576s1.f12550a.mo15182a(bArr, i, m);
        }

        /* renamed from: t */
        public int mo15011t() throws IOException {
            if (mo14992c()) {
                this.f12489j = 0;
                return 0;
            }
            int m = mo15004m();
            this.f12489j = m;
            int i = C3584t1.f12572a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C3476a0.m8728b();
        }

        /* renamed from: u */
        public int mo15012u() throws IOException {
            return mo15004m();
        }

        /* renamed from: v */
        public long mo15013v() throws IOException {
            return mo15032z();
        }

        /* renamed from: w */
        public byte mo15029w() throws IOException {
            if (this.f12488i == this.f12486g) {
                mo15026h(1);
            }
            byte[] bArr = this.f12485f;
            int i = this.f12488i;
            this.f12488i = i + 1;
            return bArr[i];
        }

        /* renamed from: x */
        public int mo15030x() throws IOException {
            int i = this.f12488i;
            if (this.f12486g - i < 4) {
                mo15026h(4);
                i = this.f12488i;
            }
            byte[] bArr = this.f12485f;
            this.f12488i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: y */
        public long mo15031y() throws IOException {
            int i = this.f12488i;
            if (this.f12486g - i < 8) {
                mo15026h(8);
                i = this.f12488i;
            }
            byte[] bArr = this.f12485f;
            this.f12488i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo15032z() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f12488i
                int r1 = r11.f12486g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f12485f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f12488i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo15021A()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f12488i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3529j.C3532c.mo15032z():long");
        }

        /* renamed from: d */
        public int mo14993d(int i) throws C3476a0 {
            if (i >= 0) {
                int i2 = this.f12490k + this.f12488i + i;
                int i3 = this.f12491l;
                if (i2 <= i3) {
                    this.f12491l = i2;
                    mo15022B();
                    return i3;
                }
                throw C3476a0.m8735i();
            }
            throw C3476a0.m8732f();
        }

        /* renamed from: f */
        public final byte[] mo15024f(int i) throws IOException {
            if (i == 0) {
                return C3609z.f12641b;
            }
            if (i >= 0) {
                int i2 = this.f12490k;
                int i3 = this.f12488i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f12474c <= 0) {
                    int i5 = this.f12491l;
                    if (i4 <= i5) {
                        int i6 = this.f12486g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f12484e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f12485f, this.f12488i, bArr, 0, i6);
                        this.f12490k += this.f12486g;
                        this.f12488i = 0;
                        this.f12486g = 0;
                        while (i6 < i) {
                            int read = this.f12484e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f12490k += read;
                                i6 += read;
                            } else {
                                throw C3476a0.m8735i();
                            }
                        }
                        return bArr;
                    }
                    mo15027i((i5 - i2) - i3);
                    throw C3476a0.m8735i();
                }
                throw new C3476a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C3476a0.m8732f();
        }

        /* renamed from: g */
        public final List<byte[]> mo15025g(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f12484e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f12490k += read;
                        i2 += read;
                    } else {
                        throw C3476a0.m8735i();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: h */
        public final void mo15026h(int i) throws IOException {
            if (mo15028j(i)) {
                return;
            }
            if (i > (this.f12474c - this.f12490k) - this.f12488i) {
                throw new C3476a0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C3476a0.m8735i();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
            throw new java.lang.IllegalStateException(r8.f12484e.getClass() + "#skip returned invalid result: " + r1 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo15027i(int r9) throws java.io.IOException {
            /*
                r8 = this;
                int r0 = r8.f12486g
                int r1 = r8.f12488i
                int r0 = r0 - r1
                if (r9 > r0) goto L_0x000e
                if (r9 < 0) goto L_0x000e
                int r1 = r1 + r9
                r8.f12488i = r1
                goto L_0x0090
            L_0x000e:
                if (r9 < 0) goto L_0x009b
                int r2 = r8.f12490k
                int r3 = r2 + r1
                int r4 = r3 + r9
                int r5 = r8.f12491l
                if (r4 > r5) goto L_0x0091
                r8.f12490k = r3
                r1 = 0
                r8.f12486g = r1
                r8.f12488i = r1
            L_0x0021:
                if (r0 >= r9) goto L_0x006b
                int r1 = r9 - r0
                java.io.InputStream r2 = r8.f12484e     // Catch:{ all -> 0x0061 }
                long r3 = (long) r1     // Catch:{ all -> 0x0061 }
                long r1 = r2.skip(r3)     // Catch:{ all -> 0x0061 }
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x003c
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 > 0) goto L_0x003c
                if (r7 != 0) goto L_0x0039
                goto L_0x006b
            L_0x0039:
                int r2 = (int) r1     // Catch:{ all -> 0x0061 }
                int r0 = r0 + r2
                goto L_0x0021
            L_0x003c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0061 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
                r3.<init>()     // Catch:{ all -> 0x0061 }
                java.io.InputStream r4 = r8.f12484e     // Catch:{ all -> 0x0061 }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x0061 }
                r3.append(r4)     // Catch:{ all -> 0x0061 }
                java.lang.String r4 = "#skip returned invalid result: "
                r3.append(r4)     // Catch:{ all -> 0x0061 }
                r3.append(r1)     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = "\nThe InputStream implementation is buggy."
                r3.append(r1)     // Catch:{ all -> 0x0061 }
                java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0061 }
                r9.<init>(r1)     // Catch:{ all -> 0x0061 }
                throw r9     // Catch:{ all -> 0x0061 }
            L_0x0061:
                r9 = move-exception
                int r1 = r8.f12490k
                int r1 = r1 + r0
                r8.f12490k = r1
                r8.mo15022B()
                throw r9
            L_0x006b:
                int r1 = r8.f12490k
                int r1 = r1 + r0
                r8.f12490k = r1
                r8.mo15022B()
                if (r0 >= r9) goto L_0x0090
                int r0 = r8.f12486g
                int r1 = r8.f12488i
                int r1 = r0 - r1
                r8.f12488i = r0
                r0 = 1
                r8.mo15026h(r0)
            L_0x0081:
                int r2 = r9 - r1
                int r3 = r8.f12486g
                if (r2 <= r3) goto L_0x008e
                int r1 = r1 + r3
                r8.f12488i = r3
                r8.mo15026h(r0)
                goto L_0x0081
            L_0x008e:
                r8.f12488i = r2
            L_0x0090:
                return
            L_0x0091:
                int r5 = r5 - r2
                int r5 = r5 - r1
                r8.mo15027i(r5)
                com.fyber.inneractive.sdk.protobuf.a0 r9 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8735i()
                throw r9
            L_0x009b:
                com.fyber.inneractive.sdk.protobuf.a0 r9 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8732f()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3529j.C3532c.mo15027i(int):void");
        }

        /* renamed from: j */
        public final boolean mo15028j(int i) throws IOException {
            int i2 = this.f12488i;
            int i3 = i2 + i;
            int i4 = this.f12486g;
            if (i3 > i4) {
                int i5 = this.f12474c;
                int i6 = this.f12490k;
                if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f12491l) {
                    return false;
                }
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f12485f;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f12490k += i2;
                    this.f12486g -= i2;
                    this.f12488i = 0;
                }
                InputStream inputStream = this.f12484e;
                byte[] bArr2 = this.f12485f;
                int i7 = this.f12486g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f12474c - this.f12490k) - i7));
                if (read == 0 || read < -1 || read > this.f12485f.length) {
                    throw new IllegalStateException(this.f12484e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f12486g += read;
                    mo15022B();
                    if (this.f12486g >= i) {
                        return true;
                    }
                    return mo15028j(i);
                }
            } else {
                throw new IllegalStateException(C25541a.m63878h("refillBuffer() called when ", i, " bytes were already available in buffer"));
            }
        }

        /* renamed from: a */
        public void mo14988a(int i, C3564q0.C3565a aVar, C3562q qVar) throws IOException {
            int i2 = this.f12472a;
            if (i2 < this.f12473b) {
                this.f12472a = i2 + 1;
                ((GeneratedMessageLite.C3465a) aVar).mo14757a((C3529j) this, qVar);
                mo14987a(C3584t1.m9573a(i, 4));
                this.f12472a--;
                return;
            }
            throw C3476a0.m8734h();
        }

        /* renamed from: c */
        public boolean mo14992c() throws IOException {
            return this.f12488i == this.f12486g && !mo15028j(1);
        }

        /* renamed from: a */
        public void mo14989a(C3564q0.C3565a aVar, C3562q qVar) throws IOException {
            int m = mo15004m();
            if (this.f12472a < this.f12473b) {
                int d = mo14993d(m);
                this.f12472a++;
                ((GeneratedMessageLite.C3465a) aVar).mo14757a((C3529j) this, qVar);
                mo14987a(0);
                this.f12472a--;
                this.f12491l = d;
                mo15022B();
                return;
            }
            throw C3476a0.m8734h();
        }

        /* renamed from: e */
        public C3508i mo14995e() throws IOException {
            int m = mo15004m();
            int i = this.f12486g;
            int i2 = this.f12488i;
            if (m <= i - i2 && m > 0) {
                C3508i a = C3508i.m8971a(this.f12485f, i2, m);
                this.f12488i += m;
                return a;
            } else if (m == 0) {
                return C3508i.f12443b;
            } else {
                byte[] f = mo15024f(m);
                if (f != null) {
                    return C3508i.m8971a(f, 0, f.length);
                }
                int i3 = this.f12488i;
                int i4 = this.f12486g;
                int i5 = i4 - i3;
                this.f12490k += i4;
                this.f12488i = 0;
                this.f12486g = 0;
                List<byte[]> g = mo15025g(m - i5);
                byte[] bArr = new byte[m];
                System.arraycopy(this.f12485f, i3, bArr, 0, i5);
                Iterator it = ((ArrayList) g).iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    i5 += bArr2.length;
                }
                C3508i iVar = C3508i.f12443b;
                return new C3508i.C3516h(bArr);
            }
        }

        /* renamed from: a */
        public int mo14986a() {
            int i = this.f12491l;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.f12490k + this.f12488i);
        }

        /* renamed from: a */
        public final byte[] mo15023a(int i, boolean z) throws IOException {
            byte[] f = mo15024f(i);
            if (f != null) {
                return z ? (byte[]) f.clone() : f;
            }
            int i2 = this.f12488i;
            int i3 = this.f12486g;
            int i4 = i3 - i2;
            this.f12490k += i3;
            this.f12488i = 0;
            this.f12486g = 0;
            List<byte[]> g = mo15025g(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f12485f, i2, bArr, 0, i4);
            Iterator it = ((ArrayList) g).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.j$d */
    public static final class C3533d extends C3529j {

        /* renamed from: e */
        public final ByteBuffer f12492e;

        /* renamed from: f */
        public final boolean f12493f;

        /* renamed from: g */
        public final long f12494g;

        /* renamed from: h */
        public long f12495h;

        /* renamed from: i */
        public long f12496i;

        /* renamed from: j */
        public long f12497j;

        /* renamed from: k */
        public int f12498k;

        /* renamed from: l */
        public int f12499l;

        /* renamed from: m */
        public int f12500m = Integer.MAX_VALUE;

        public C3533d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f12492e = byteBuffer;
            long a = C3569r1.m9419a(byteBuffer);
            this.f12494g = a;
            this.f12495h = ((long) byteBuffer.limit()) + a;
            long position = a + ((long) byteBuffer.position());
            this.f12496i = position;
            this.f12497j = position;
            this.f12493f = z;
        }

        /* renamed from: A */
        public long mo15033A() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte w = mo15038w();
                j |= ((long) (w & Byte.MAX_VALUE)) << i;
                if ((w & 128) == 0) {
                    return j;
                }
            }
            throw C3476a0.m8731e();
        }

        /* renamed from: B */
        public final void mo15034B() {
            long j = this.f12495h + ((long) this.f12498k);
            this.f12495h = j;
            int i = (int) (j - this.f12497j);
            int i2 = this.f12500m;
            if (i > i2) {
                int i3 = i - i2;
                this.f12498k = i3;
                this.f12495h = j - ((long) i3);
                return;
            }
            this.f12498k = 0;
        }

        /* renamed from: C */
        public final int mo15035C() {
            return (int) (this.f12495h - this.f12496i);
        }

        /* renamed from: a */
        public void mo14987a(int i) throws C3476a0 {
            if (this.f12499l != i) {
                throw C3476a0.m8727a();
            }
        }

        /* renamed from: b */
        public int mo14990b() {
            return (int) (this.f12496i - this.f12497j);
        }

        /* renamed from: c */
        public void mo14991c(int i) {
            this.f12500m = i;
            mo15034B();
        }

        /* renamed from: d */
        public boolean mo14994d() throws IOException {
            return mo15041z() != 0;
        }

        /* renamed from: e */
        public boolean mo14996e(int i) throws IOException {
            int t;
            int i2 = C3584t1.f12572a;
            int i3 = i & 7;
            int i4 = 0;
            if (i3 == 0) {
                if (mo15035C() >= 10) {
                    while (i4 < 10) {
                        long j = this.f12496i;
                        this.f12496i = 1 + j;
                        if (C3569r1.f12543e.mo15167a(j) < 0) {
                            i4++;
                        }
                    }
                    throw C3476a0.m8731e();
                }
                while (i4 < 10) {
                    if (mo15038w() < 0) {
                        i4++;
                    }
                }
                throw C3476a0.m8731e();
                return true;
            } else if (i3 == 1) {
                mo15037f(8);
                return true;
            } else if (i3 == 2) {
                mo15037f(mo15004m());
                return true;
            } else if (i3 == 3) {
                do {
                    t = mo15011t();
                    if (t == 0 || !mo14996e(t)) {
                        mo14987a(C3584t1.m9573a(i >>> 3, 4));
                    }
                    t = mo15011t();
                    break;
                } while (!mo14996e(t));
                mo14987a(C3584t1.m9573a(i >>> 3, 4));
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo15037f(4);
                    return true;
                }
                throw C3476a0.m8730d();
            }
        }

        /* renamed from: f */
        public double mo14997f() throws IOException {
            return Double.longBitsToDouble(mo15040y());
        }

        /* renamed from: g */
        public int mo14998g() throws IOException {
            return mo15004m();
        }

        /* renamed from: h */
        public int mo14999h() throws IOException {
            return mo15039x();
        }

        /* renamed from: i */
        public long mo15000i() throws IOException {
            return mo15040y();
        }

        /* renamed from: j */
        public float mo15001j() throws IOException {
            return Float.intBitsToFloat(mo15039x());
        }

        /* renamed from: k */
        public int mo15002k() throws IOException {
            return mo15004m();
        }

        /* renamed from: l */
        public long mo15003l() throws IOException {
            return mo15041z();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
            if (r6.mo15167a(r4) < 0) goto L_0x0087;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo15004m() throws java.io.IOException {
            /*
                r11 = this;
                long r0 = r11.f12496i
                long r2 = r11.f12495h
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x0087
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
                byte r0 = r6.mo15167a(r0)
                if (r0 < 0) goto L_0x0019
                r11.f12496i = r4
                return r0
            L_0x0019:
                long r7 = r11.f12495h
                long r7 = r7 - r4
                r9 = 9
                int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r1 >= 0) goto L_0x0023
                goto L_0x0087
            L_0x0023:
                long r7 = r4 + r2
                byte r1 = r6.mo15167a(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0031
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008d
            L_0x0031:
                long r4 = r7 + r2
                byte r1 = r6.mo15167a(r7)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0040
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003e:
                r7 = r4
                goto L_0x008d
            L_0x0040:
                long r7 = r4 + r2
                byte r1 = r6.mo15167a(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x0050
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008d
            L_0x0050:
                long r4 = r7 + r2
                byte r1 = r6.mo15167a(r7)
                int r7 = r1 << 28
                r0 = r0 ^ r7
                r7 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r7
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo15167a(r4)
                if (r1 >= 0) goto L_0x008d
                long r4 = r7 + r2
                byte r1 = r6.mo15167a(r7)
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo15167a(r4)
                if (r1 >= 0) goto L_0x008d
                long r4 = r7 + r2
                byte r1 = r6.mo15167a(r7)
                if (r1 >= 0) goto L_0x003e
                long r7 = r4 + r2
                byte r1 = r6.mo15167a(r4)
                if (r1 >= 0) goto L_0x008d
            L_0x0087:
                long r0 = r11.mo15033A()
                int r1 = (int) r0
                return r1
            L_0x008d:
                r11.f12496i = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3529j.C3533d.mo15004m():int");
        }

        /* renamed from: n */
        public int mo15005n() throws IOException {
            return mo15039x();
        }

        /* renamed from: o */
        public long mo15006o() throws IOException {
            return mo15040y();
        }

        /* renamed from: p */
        public int mo15007p() throws IOException {
            return C3529j.m9025b(mo15004m());
        }

        /* renamed from: q */
        public long mo15008q() throws IOException {
            return C3529j.m9021a(mo15041z());
        }

        /* renamed from: r */
        public String mo15009r() throws IOException {
            int m = mo15004m();
            if (m > 0 && m <= mo15035C()) {
                byte[] bArr = new byte[m];
                long j = (long) m;
                C3569r1.f12543e.mo15168a(this.f12496i, bArr, 0, j);
                String str = new String(bArr, C3609z.f12640a);
                this.f12496i += j;
                return str;
            } else if (m == 0) {
                return "";
            } else {
                if (m < 0) {
                    throw C3476a0.m8732f();
                }
                throw C3476a0.m8735i();
            }
        }

        /* renamed from: s */
        public String mo15010s() throws IOException {
            String str;
            int m = mo15004m();
            if (m > 0 && m <= mo15035C()) {
                int b = mo15036b(this.f12496i);
                ByteBuffer byteBuffer = this.f12492e;
                C3576s1.C3578b bVar = C3576s1.f12550a;
                bVar.getClass();
                if (byteBuffer.hasArray()) {
                    str = bVar.mo15182a(byteBuffer.array(), byteBuffer.arrayOffset() + b, m);
                } else if (byteBuffer.isDirect()) {
                    str = bVar.mo15183b(byteBuffer, b, m);
                } else {
                    str = bVar.mo15181a(byteBuffer, b, m);
                }
                this.f12496i += (long) m;
                return str;
            } else if (m == 0) {
                return "";
            } else {
                if (m <= 0) {
                    throw C3476a0.m8732f();
                }
                throw C3476a0.m8735i();
            }
        }

        /* renamed from: t */
        public int mo15011t() throws IOException {
            if (mo14992c()) {
                this.f12499l = 0;
                return 0;
            }
            int m = mo15004m();
            this.f12499l = m;
            int i = C3584t1.f12572a;
            if ((m >>> 3) != 0) {
                return m;
            }
            throw C3476a0.m8728b();
        }

        /* renamed from: u */
        public int mo15012u() throws IOException {
            return mo15004m();
        }

        /* renamed from: v */
        public long mo15013v() throws IOException {
            return mo15041z();
        }

        /* renamed from: w */
        public byte mo15038w() throws IOException {
            long j = this.f12496i;
            if (j != this.f12495h) {
                this.f12496i = 1 + j;
                return C3569r1.f12543e.mo15167a(j);
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: x */
        public int mo15039x() throws IOException {
            long j = this.f12496i;
            if (this.f12495h - j >= 4) {
                this.f12496i = 4 + j;
                C3569r1.C3573d dVar = C3569r1.f12543e;
                return ((dVar.mo15167a(j + 3) & 255) << 24) | (dVar.mo15167a(j) & 255) | ((dVar.mo15167a(1 + j) & 255) << 8) | ((dVar.mo15167a(2 + j) & 255) << 16);
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: y */
        public long mo15040y() throws IOException {
            long j = this.f12496i;
            if (this.f12495h - j >= 8) {
                this.f12496i = 8 + j;
                C3569r1.C3573d dVar = C3569r1.f12543e;
                return ((((long) dVar.mo15167a(j + 7)) & 255) << 56) | (((long) dVar.mo15167a(j)) & 255) | ((((long) dVar.mo15167a(1 + j)) & 255) << 8) | ((((long) dVar.mo15167a(2 + j)) & 255) << 16) | ((((long) dVar.mo15167a(3 + j)) & 255) << 24) | ((((long) dVar.mo15167a(4 + j)) & 255) << 32) | ((((long) dVar.mo15167a(5 + j)) & 255) << 40) | ((((long) dVar.mo15167a(6 + j)) & 255) << 48);
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: z */
        public long mo15041z() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f12496i;
            if (this.f12495h != j4) {
                long j5 = j4 + 1;
                C3569r1.C3573d dVar = C3569r1.f12543e;
                byte a = dVar.mo15167a(j4);
                if (a >= 0) {
                    this.f12496i = j5;
                    return (long) a;
                } else if (this.f12495h - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte a2 = a ^ (dVar.mo15167a(j5) << 7);
                    if (a2 < 0) {
                        b = a2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte a3 = a2 ^ (dVar.mo15167a(j6) << 14);
                        if (a3 >= 0) {
                            j = (long) (a3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte a4 = a3 ^ (dVar.mo15167a(j7) << 21);
                            if (a4 < 0) {
                                b = a4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long a5 = ((long) a4) ^ (((long) dVar.mo15167a(j6)) << 28);
                                if (a5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long a6 = a5 ^ (((long) dVar.mo15167a(j7)) << 35);
                                    if (a6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        a5 = a6 ^ (((long) dVar.mo15167a(j8)) << 42);
                                        if (a5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            a6 = a5 ^ (((long) dVar.mo15167a(j7)) << 49);
                                            if (a6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (a6 ^ (((long) dVar.mo15167a(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) dVar.mo15167a(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f12496i = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = a6 ^ j2;
                                    j6 = j8;
                                    this.f12496i = j6;
                                    return j;
                                }
                                j = a5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f12496i = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f12496i = j6;
                    return j;
                }
            }
            return mo15033A();
        }

        /* renamed from: b */
        public final int mo15036b(long j) {
            return (int) (j - this.f12494g);
        }

        /* renamed from: d */
        public int mo14993d(int i) throws C3476a0 {
            if (i >= 0) {
                int b = mo14990b() + i;
                int i2 = this.f12500m;
                if (b <= i2) {
                    this.f12500m = b;
                    mo15034B();
                    return i2;
                }
                throw C3476a0.m8735i();
            }
            throw C3476a0.m8732f();
        }

        /* renamed from: f */
        public void mo15037f(int i) throws IOException {
            if (i >= 0 && i <= mo15035C()) {
                this.f12496i += (long) i;
            } else if (i < 0) {
                throw C3476a0.m8732f();
            } else {
                throw C3476a0.m8735i();
            }
        }

        /* renamed from: a */
        public void mo14988a(int i, C3564q0.C3565a aVar, C3562q qVar) throws IOException {
            int i2 = this.f12472a;
            if (i2 < this.f12473b) {
                this.f12472a = i2 + 1;
                ((GeneratedMessageLite.C3465a) aVar).mo14757a((C3529j) this, qVar);
                mo14987a(C3584t1.m9573a(i, 4));
                this.f12472a--;
                return;
            }
            throw C3476a0.m8734h();
        }

        /* renamed from: c */
        public boolean mo14992c() throws IOException {
            return this.f12496i == this.f12495h;
        }

        /* renamed from: a */
        public void mo14989a(C3564q0.C3565a aVar, C3562q qVar) throws IOException {
            int m = mo15004m();
            if (this.f12472a < this.f12473b) {
                int d = mo14993d(m);
                this.f12472a++;
                ((GeneratedMessageLite.C3465a) aVar).mo14757a((C3529j) this, qVar);
                mo14987a(0);
                this.f12472a--;
                this.f12500m = d;
                mo15034B();
                return;
            }
            throw C3476a0.m8734h();
        }

        /* renamed from: e */
        public C3508i mo14995e() throws IOException {
            int m = mo15004m();
            if (m > 0 && m <= mo15035C()) {
                byte[] bArr = new byte[m];
                long j = (long) m;
                C3569r1.f12543e.mo15168a(this.f12496i, bArr, 0, j);
                this.f12496i += j;
                C3508i iVar = C3508i.f12443b;
                return new C3508i.C3516h(bArr);
            } else if (m == 0) {
                return C3508i.f12443b;
            } else {
                if (m < 0) {
                    throw C3476a0.m8732f();
                }
                throw C3476a0.m8735i();
            }
        }

        /* renamed from: a */
        public int mo14986a() {
            int i = this.f12500m;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - mo14990b();
        }
    }

    /* renamed from: a */
    public static long m9021a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: a */
    public static C3529j m9022a(InputStream inputStream) {
        if (inputStream != null) {
            return new C3532c(inputStream, 4096);
        }
        byte[] bArr = C3609z.f12641b;
        return m9024a(bArr, 0, bArr.length, false);
    }

    /* renamed from: b */
    public static int m9025b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo14986a();

    /* renamed from: a */
    public abstract void mo14987a(int i) throws C3476a0;

    /* renamed from: a */
    public abstract void mo14988a(int i, C3564q0.C3565a aVar, C3562q qVar) throws IOException;

    /* renamed from: a */
    public abstract void mo14989a(C3564q0.C3565a aVar, C3562q qVar) throws IOException;

    /* renamed from: b */
    public abstract int mo14990b();

    /* renamed from: c */
    public abstract void mo14991c(int i);

    /* renamed from: c */
    public abstract boolean mo14992c() throws IOException;

    /* renamed from: d */
    public abstract int mo14993d(int i) throws C3476a0;

    /* renamed from: d */
    public abstract boolean mo14994d() throws IOException;

    /* renamed from: e */
    public abstract C3508i mo14995e() throws IOException;

    /* renamed from: e */
    public abstract boolean mo14996e(int i) throws IOException;

    /* renamed from: f */
    public abstract double mo14997f() throws IOException;

    /* renamed from: g */
    public abstract int mo14998g() throws IOException;

    /* renamed from: h */
    public abstract int mo14999h() throws IOException;

    /* renamed from: i */
    public abstract long mo15000i() throws IOException;

    /* renamed from: j */
    public abstract float mo15001j() throws IOException;

    /* renamed from: k */
    public abstract int mo15002k() throws IOException;

    /* renamed from: l */
    public abstract long mo15003l() throws IOException;

    /* renamed from: m */
    public abstract int mo15004m() throws IOException;

    /* renamed from: n */
    public abstract int mo15005n() throws IOException;

    /* renamed from: o */
    public abstract long mo15006o() throws IOException;

    /* renamed from: p */
    public abstract int mo15007p() throws IOException;

    /* renamed from: q */
    public abstract long mo15008q() throws IOException;

    /* renamed from: r */
    public abstract String mo15009r() throws IOException;

    /* renamed from: s */
    public abstract String mo15010s() throws IOException;

    /* renamed from: t */
    public abstract int mo15011t() throws IOException;

    /* renamed from: u */
    public abstract int mo15012u() throws IOException;

    /* renamed from: v */
    public abstract long mo15013v() throws IOException;

    public C3529j() {
        this.f12473b = 100;
        this.f12474c = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static C3529j m9024a(byte[] bArr, int i, int i2, boolean z) {
        C3531b bVar = new C3531b(bArr, i, i2, z);
        try {
            bVar.mo14993d(i2);
            return bVar;
        } catch (C3476a0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static C3529j m9023a(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m9024a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z);
        } else if (byteBuffer.isDirect() && C3569r1.f12544f) {
            return new C3533d(byteBuffer, z);
        } else {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            return m9024a(bArr, 0, remaining, true);
        }
    }
}
