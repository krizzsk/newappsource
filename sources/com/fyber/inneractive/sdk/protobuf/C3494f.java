package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3508i;
import com.fyber.inneractive.sdk.protobuf.C3534j0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.f */
public abstract class C3494f implements C3493e1 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.f$b */
    public static final class C3496b extends C3494f {

        /* renamed from: a */
        public final boolean f12424a;

        /* renamed from: b */
        public final byte[] f12425b;

        /* renamed from: c */
        public int f12426c;

        /* renamed from: d */
        public int f12427d;

        /* renamed from: e */
        public int f12428e;

        /* renamed from: f */
        public int f12429f;

        public C3496b(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f12424a = z;
            this.f12425b = byteBuffer.array();
            this.f12426c = byteBuffer.position() + byteBuffer.arrayOffset();
            this.f12427d = byteBuffer.limit() + byteBuffer.arrayOffset();
        }

        /* renamed from: A */
        public final int mo14871A() throws IOException {
            byte b;
            int i = this.f12426c;
            int i2 = this.f12427d;
            if (i2 != i) {
                byte[] bArr = this.f12425b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f12426c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo14873C();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw C3476a0.m8731e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f12426c = i4;
                    return b;
                }
            } else {
                throw C3476a0.m8735i();
            }
        }

        /* renamed from: B */
        public long mo14872B() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f12426c;
            int i3 = this.f12427d;
            if (i3 != i2) {
                byte[] bArr = this.f12425b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f12426c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo14873C();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw C3476a0.m8731e();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f12426c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f12426c = i;
                    return j;
                }
            } else {
                throw C3476a0.m8735i();
            }
        }

        /* renamed from: C */
        public final long mo14873C() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte v = mo14885v();
                j |= ((long) (v & Byte.MAX_VALUE)) << i;
                if ((v & 128) == 0) {
                    return j;
                }
            }
            throw C3476a0.m8731e();
        }

        /* renamed from: a */
        public String mo14874a(boolean z) throws IOException {
            mo14879c(2);
            int A = mo14871A();
            if (A == 0) {
                return "";
            }
            mo14875a(A);
            if (z) {
                byte[] bArr = this.f12425b;
                int i = this.f12426c;
                if (!C3576s1.m9505b(bArr, i, i + A)) {
                    throw C3476a0.m8729c();
                }
            }
            String str = new String(this.f12425b, this.f12426c, A, C3609z.f12640a);
            this.f12426c += A;
            return str;
        }

        /* renamed from: b */
        public <T> T mo14835b(Class<T> cls, C3562q qVar) throws IOException {
            mo14879c(2);
            return mo14880d(C3481b1.f12402c.mo14786a(cls), qVar);
        }

        /* renamed from: c */
        public final <T> T mo14878c(C3498f1<T> f1Var, C3562q qVar) throws IOException {
            int i = this.f12429f;
            this.f12429f = C3584t1.m9573a(this.f12428e >>> 3, 4);
            try {
                T a = f1Var.mo14890a();
                f1Var.mo14891a(a, this, qVar);
                f1Var.mo14898c(a);
                if (this.f12428e == this.f12429f) {
                    return a;
                }
                throw C3476a0.m8733g();
            } finally {
                this.f12429f = i;
            }
        }

        /* renamed from: d */
        public int mo14840d() throws IOException {
            mo14879c(0);
            return mo14871A();
        }

        /* renamed from: e */
        public int mo14842e() {
            return this.f12428e;
        }

        /* renamed from: f */
        public long mo14844f() throws IOException {
            mo14879c(0);
            return mo14872B();
        }

        /* renamed from: g */
        public long mo14846g() throws IOException {
            mo14879c(1);
            return mo14888y();
        }

        /* renamed from: h */
        public double mo14848h() throws IOException {
            mo14879c(1);
            return Double.longBitsToDouble(mo14888y());
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0032 A[LOOP:0: B:18:0x0032->B:21:0x003f, LOOP_START] */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo14851i() throws java.io.IOException {
            /*
                r7 = this;
                boolean r0 = r7.mo14884u()
                r1 = 0
                if (r0 != 0) goto L_0x0089
                int r0 = r7.f12428e
                int r2 = r7.f12429f
                if (r0 != r2) goto L_0x000f
                goto L_0x0089
            L_0x000f:
                int r3 = com.fyber.inneractive.sdk.protobuf.C3584t1.f12572a
                r3 = r0 & 7
                r4 = 1
                if (r3 == 0) goto L_0x005d
                if (r3 == r4) goto L_0x0057
                r1 = 2
                if (r3 == r1) goto L_0x004f
                r1 = 4
                r5 = 3
                if (r3 == r5) goto L_0x002b
                r0 = 5
                if (r3 != r0) goto L_0x0026
                r7.mo14881d((int) r1)
                return r4
            L_0x0026:
                com.fyber.inneractive.sdk.protobuf.a0$a r0 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8730d()
                throw r0
            L_0x002b:
                int r0 = r0 >>> r5
                int r0 = com.fyber.inneractive.sdk.protobuf.C3584t1.m9573a(r0, r1)
                r7.f12429f = r0
            L_0x0032:
                int r0 = r7.mo14869s()
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L_0x0041
                boolean r0 = r7.mo14851i()
                if (r0 != 0) goto L_0x0032
            L_0x0041:
                int r0 = r7.f12428e
                int r1 = r7.f12429f
                if (r0 != r1) goto L_0x004a
                r7.f12429f = r2
                return r4
            L_0x004a:
                com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8733g()
                throw r0
            L_0x004f:
                int r0 = r7.mo14871A()
                r7.mo14881d((int) r0)
                return r4
            L_0x0057:
                r0 = 8
                r7.mo14881d((int) r0)
                return r4
            L_0x005d:
                int r0 = r7.f12427d
                int r2 = r7.f12426c
                int r0 = r0 - r2
                r3 = 10
                if (r0 < r3) goto L_0x0078
                byte[] r0 = r7.f12425b
                r5 = 0
            L_0x0069:
                if (r5 >= r3) goto L_0x0078
                int r6 = r2 + 1
                byte r2 = r0[r2]
                if (r2 < 0) goto L_0x0074
                r7.f12426c = r6
                goto L_0x0080
            L_0x0074:
                int r5 = r5 + 1
                r2 = r6
                goto L_0x0069
            L_0x0078:
                if (r1 >= r3) goto L_0x0084
                byte r0 = r7.mo14885v()
                if (r0 < 0) goto L_0x0081
            L_0x0080:
                return r4
            L_0x0081:
                int r1 = r1 + 1
                goto L_0x0078
            L_0x0084:
                com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8731e()
                throw r0
            L_0x0089:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3494f.C3496b.mo14851i():boolean");
        }

        /* renamed from: j */
        public int mo14852j() throws IOException {
            mo14879c(0);
            return C3529j.m9025b(mo14871A());
        }

        /* renamed from: k */
        public float mo14854k() throws IOException {
            mo14879c(5);
            return Float.intBitsToFloat(mo14886w());
        }

        /* renamed from: l */
        public long mo14856l() throws IOException {
            mo14879c(0);
            return C3529j.m9021a(mo14872B());
        }

        /* renamed from: m */
        public int mo14858m() throws IOException {
            mo14879c(5);
            return mo14886w();
        }

        /* renamed from: n */
        public String mo14860n() throws IOException {
            return mo14874a(false);
        }

        /* renamed from: o */
        public long mo14862o() throws IOException {
            mo14879c(0);
            return mo14872B();
        }

        /* renamed from: p */
        public String mo14864p() throws IOException {
            return mo14874a(true);
        }

        /* renamed from: q */
        public int mo14866q() throws IOException {
            mo14879c(5);
            return mo14886w();
        }

        /* renamed from: r */
        public boolean mo14868r() throws IOException {
            mo14879c(0);
            if (mo14871A() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: s */
        public int mo14869s() throws IOException {
            if (mo14884u()) {
                return Integer.MAX_VALUE;
            }
            int A = mo14871A();
            this.f12428e = A;
            if (A == this.f12429f) {
                return Integer.MAX_VALUE;
            }
            int i = C3584t1.f12572a;
            return A >>> 3;
        }

        /* renamed from: t */
        public long mo14870t() throws IOException {
            mo14879c(1);
            return mo14888y();
        }

        /* renamed from: u */
        public final boolean mo14884u() {
            return this.f12426c == this.f12427d;
        }

        /* renamed from: v */
        public final byte mo14885v() throws IOException {
            int i = this.f12426c;
            if (i != this.f12427d) {
                byte[] bArr = this.f12425b;
                this.f12426c = i + 1;
                return bArr[i];
            }
            throw C3476a0.m8735i();
        }

        /* renamed from: w */
        public final int mo14886w() throws IOException {
            mo14875a(4);
            return mo14887x();
        }

        /* renamed from: x */
        public final int mo14887x() {
            int i = this.f12426c;
            byte[] bArr = this.f12425b;
            this.f12426c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: y */
        public final long mo14888y() throws IOException {
            mo14875a(8);
            return mo14889z();
        }

        /* renamed from: z */
        public final long mo14889z() {
            int i = this.f12426c;
            byte[] bArr = this.f12425b;
            this.f12426c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: e */
        public void mo14843e(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3607y) {
                C3607y yVar = (C3607y) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo14871A();
                    mo14882e(A);
                    int i6 = this.f12426c + A;
                    while (this.f12426c < i6) {
                        yVar.mo15242c(mo14887x());
                    }
                } else if (i5 == 5) {
                    do {
                        yVar.mo15242c(mo14866q());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i7 = this.f12428e;
                int i8 = C3584t1.f12572a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo14871A();
                    mo14882e(A2);
                    int i11 = this.f12426c + A2;
                    while (this.f12426c < i11) {
                        list.add(Integer.valueOf(mo14887x()));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Integer.valueOf(mo14866q()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: n */
        public void mo14861n(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3506h0) {
                C3506h0 h0Var = (C3506h0) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        h0Var.mo14915a(mo14846g());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = mo14871A();
                    mo14883f(A);
                    int i6 = this.f12426c + A;
                    while (this.f12426c < i6) {
                        h0Var.mo14915a(mo14889z());
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i7 = this.f12428e;
                int i8 = C3584t1.f12572a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Long.valueOf(mo14846g()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i9 == 2) {
                    int A2 = mo14871A();
                    mo14883f(A2);
                    int i11 = this.f12426c + A2;
                    while (this.f12426c < i11) {
                        list.add(Long.valueOf(mo14889z()));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: p */
        public void mo14865p(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3607y) {
                C3607y yVar = (C3607y) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo15242c(mo14833b());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = this.f12426c + mo14871A();
                    while (this.f12426c < A) {
                        yVar.mo15242c(mo14871A());
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i6 = this.f12428e;
                int i7 = C3584t1.f12572a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo14833b()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i8 == 2) {
                    int A2 = this.f12426c + mo14871A();
                    while (this.f12426c < A2) {
                        list.add(Integer.valueOf(mo14871A()));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: d */
        public final <T> T mo14880d(C3498f1<T> f1Var, C3562q qVar) throws IOException {
            int A = mo14871A();
            mo14875a(A);
            int i = this.f12427d;
            int i2 = this.f12426c + A;
            this.f12427d = i2;
            try {
                T a = f1Var.mo14890a();
                f1Var.mo14891a(a, this, qVar);
                f1Var.mo14898c(a);
                if (this.f12426c == i2) {
                    return a;
                }
                throw C3476a0.m8733g();
            } finally {
                this.f12427d = i;
            }
        }

        /* renamed from: f */
        public void mo14845f(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3607y) {
                C3607y yVar = (C3607y) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo14871A();
                    mo14882e(A);
                    int i6 = this.f12426c + A;
                    while (this.f12426c < i6) {
                        yVar.mo15242c(mo14887x());
                    }
                } else if (i5 == 5) {
                    do {
                        yVar.mo15242c(mo14858m());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i7 = this.f12428e;
                int i8 = C3584t1.f12572a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo14871A();
                    mo14882e(A2);
                    int i11 = this.f12426c + A2;
                    while (this.f12426c < i11) {
                        list.add(Integer.valueOf(mo14887x()));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Integer.valueOf(mo14858m()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: g */
        public void mo14847g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3506h0) {
                C3506h0 h0Var = (C3506h0) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo14915a(mo14856l());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = this.f12426c + mo14871A();
                    while (this.f12426c < A) {
                        h0Var.mo14915a(C3529j.m9021a(mo14872B()));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i6 = this.f12428e;
                int i7 = C3584t1.f12572a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo14856l()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i8 == 2) {
                    int A2 = this.f12426c + mo14871A();
                    while (this.f12426c < A2) {
                        list.add(Long.valueOf(C3529j.m9021a(mo14872B())));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: h */
        public void mo14849h(List<C3508i> list) throws IOException {
            int i;
            int i2 = this.f12428e;
            int i3 = C3584t1.f12572a;
            if ((i2 & 7) == 2) {
                do {
                    list.add(mo14827a());
                    if (!mo14884u()) {
                        i = this.f12426c;
                    } else {
                        return;
                    }
                } while (mo14871A() == this.f12428e);
                this.f12426c = i;
                return;
            }
            throw C3476a0.m8730d();
        }

        /* renamed from: j */
        public void mo14853j(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3551n) {
                C3551n nVar = (C3551n) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        nVar.mo15124a(mo14848h());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = mo14871A();
                    mo14883f(A);
                    int i6 = this.f12426c + A;
                    while (this.f12426c < i6) {
                        nVar.mo15124a(Double.longBitsToDouble(mo14889z()));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i7 = this.f12428e;
                int i8 = C3584t1.f12572a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Double.valueOf(mo14848h()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i9 == 2) {
                    int A2 = mo14871A();
                    mo14883f(A2);
                    int i11 = this.f12426c + A2;
                    while (this.f12426c < i11) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo14889z())));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: k */
        public void mo14855k(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3506h0) {
                C3506h0 h0Var = (C3506h0) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo14915a(mo14862o());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = this.f12426c + mo14871A();
                    while (this.f12426c < A) {
                        h0Var.mo14915a(mo14872B());
                    }
                    mo14877b(A);
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i6 = this.f12428e;
                int i7 = C3584t1.f12572a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo14862o()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i8 == 2) {
                    int A2 = this.f12426c + mo14871A();
                    while (this.f12426c < A2) {
                        list.add(Long.valueOf(mo14872B()));
                    }
                    mo14877b(A2);
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: l */
        public void mo14857l(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3499g) {
                C3499g gVar = (C3499g) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        gVar.mo14900a(mo14868r());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = this.f12426c + mo14871A();
                    while (this.f12426c < A) {
                        gVar.mo14900a(mo14871A() != 0);
                    }
                    mo14877b(A);
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i6 = this.f12428e;
                int i7 = C3584t1.f12572a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo14868r()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i8 == 2) {
                    int A2 = this.f12426c + mo14871A();
                    while (this.f12426c < A2) {
                        list.add(Boolean.valueOf(mo14871A() != 0));
                    }
                    mo14877b(A2);
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: m */
        public void mo14859m(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3506h0) {
                C3506h0 h0Var = (C3506h0) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 1) {
                    do {
                        h0Var.mo14915a(mo14870t());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = mo14871A();
                    mo14883f(A);
                    int i6 = this.f12426c + A;
                    while (this.f12426c < i6) {
                        h0Var.mo14915a(mo14889z());
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i7 = this.f12428e;
                int i8 = C3584t1.f12572a;
                int i9 = i7 & 7;
                if (i9 == 1) {
                    do {
                        list.add(Long.valueOf(mo14870t()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i9 == 2) {
                    int A2 = mo14871A();
                    mo14883f(A2);
                    int i11 = this.f12426c + A2;
                    while (this.f12426c < i11) {
                        list.add(Long.valueOf(mo14889z()));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: o */
        public void mo14863o(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3607y) {
                C3607y yVar = (C3607y) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo15242c(mo14840d());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = this.f12426c + mo14871A();
                    while (this.f12426c < A) {
                        yVar.mo15242c(mo14871A());
                    }
                    mo14877b(A);
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i6 = this.f12428e;
                int i7 = C3584t1.f12572a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo14840d()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i8 == 2) {
                    int A2 = this.f12426c + mo14871A();
                    while (this.f12426c < A2) {
                        list.add(Integer.valueOf(mo14871A()));
                    }
                    mo14877b(A2);
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: q */
        public void mo14867q(List<String> list) throws IOException {
            mo14876a(list, false);
        }

        /* renamed from: b */
        public <T> T mo14834b(C3498f1<T> f1Var, C3562q qVar) throws IOException {
            mo14879c(2);
            return mo14880d(f1Var, qVar);
        }

        /* renamed from: b */
        public int mo14833b() throws IOException {
            mo14879c(0);
            return mo14871A();
        }

        /* renamed from: a */
        public <T> T mo14829a(Class<T> cls, C3562q qVar) throws IOException {
            mo14879c(3);
            return mo14878c(C3481b1.f12402c.mo14786a(cls), qVar);
        }

        /* renamed from: b */
        public void mo14836b(List<String> list) throws IOException {
            mo14876a(list, true);
        }

        /* renamed from: b */
        public <T> void mo14837b(List<T> list, C3498f1<T> f1Var, C3562q qVar) throws IOException {
            int i;
            int i2 = this.f12428e;
            int i3 = C3584t1.f12572a;
            if ((i2 & 7) == 2) {
                do {
                    list.add(mo14880d(f1Var, qVar));
                    if (!mo14884u()) {
                        i = this.f12426c;
                    } else {
                        return;
                    }
                } while (mo14871A() == i2);
                this.f12426c = i;
                return;
            }
            throw C3476a0.m8730d();
        }

        /* renamed from: a */
        public <T> T mo14828a(C3498f1<T> f1Var, C3562q qVar) throws IOException {
            mo14879c(3);
            return mo14878c(f1Var, qVar);
        }

        /* renamed from: c */
        public int mo14838c() throws IOException {
            mo14879c(0);
            return mo14871A();
        }

        /* renamed from: a */
        public C3508i mo14827a() throws IOException {
            C3508i iVar;
            mo14879c(2);
            int A = mo14871A();
            if (A == 0) {
                return C3508i.f12443b;
            }
            mo14875a(A);
            if (this.f12424a) {
                byte[] bArr = this.f12425b;
                int i = this.f12426c;
                C3508i iVar2 = C3508i.f12443b;
                iVar = new C3508i.C3512d(bArr, i, A);
            } else {
                iVar = C3508i.m8971a(this.f12425b, this.f12426c, A);
            }
            this.f12426c += A;
            return iVar;
        }

        /* renamed from: c */
        public void mo14839c(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3607y) {
                C3607y yVar = (C3607y) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo15242c(mo14852j());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = this.f12426c + mo14871A();
                    while (this.f12426c < A) {
                        yVar.mo15242c(C3529j.m9025b(mo14871A()));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i6 = this.f12428e;
                int i7 = C3584t1.f12572a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo14852j()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i8 == 2) {
                    int A2 = this.f12426c + mo14871A();
                    while (this.f12426c < A2) {
                        list.add(Integer.valueOf(C3529j.m9025b(mo14871A())));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: b */
        public final void mo14877b(int i) throws IOException {
            if (this.f12426c != i) {
                throw C3476a0.m8735i();
            }
        }

        /* renamed from: d */
        public void mo14841d(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3603w) {
                C3603w wVar = (C3603w) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 2) {
                    int A = mo14871A();
                    mo14882e(A);
                    int i6 = this.f12426c + A;
                    while (this.f12426c < i6) {
                        wVar.mo15230a(Float.intBitsToFloat(mo14887x()));
                    }
                } else if (i5 == 5) {
                    do {
                        wVar.mo15230a(mo14854k());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i7 = this.f12428e;
                int i8 = C3584t1.f12572a;
                int i9 = i7 & 7;
                if (i9 == 2) {
                    int A2 = mo14871A();
                    mo14882e(A2);
                    int i11 = this.f12426c + A2;
                    while (this.f12426c < i11) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo14887x())));
                    }
                } else if (i9 == 5) {
                    do {
                        list.add(Float.valueOf(mo14854k()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: i */
        public void mo14850i(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3607y) {
                C3607y yVar = (C3607y) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        yVar.mo15242c(mo14838c());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = this.f12426c + mo14871A();
                    while (this.f12426c < A) {
                        yVar.mo15242c(mo14871A());
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i6 = this.f12428e;
                int i7 = C3584t1.f12572a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Integer.valueOf(mo14838c()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i8 == 2) {
                    int A2 = this.f12426c + mo14871A();
                    while (this.f12426c < A2) {
                        list.add(Integer.valueOf(mo14871A()));
                    }
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: a */
        public void mo14830a(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3506h0) {
                C3506h0 h0Var = (C3506h0) list;
                int i3 = this.f12428e;
                int i4 = C3584t1.f12572a;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    do {
                        h0Var.mo14915a(mo14844f());
                        if (!mo14884u()) {
                            i2 = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i2;
                } else if (i5 == 2) {
                    int A = this.f12426c + mo14871A();
                    while (this.f12426c < A) {
                        h0Var.mo14915a(mo14872B());
                    }
                    mo14877b(A);
                } else {
                    throw C3476a0.m8730d();
                }
            } else {
                int i6 = this.f12428e;
                int i7 = C3584t1.f12572a;
                int i8 = i6 & 7;
                if (i8 == 0) {
                    do {
                        list.add(Long.valueOf(mo14844f()));
                        if (!mo14884u()) {
                            i = this.f12426c;
                        } else {
                            return;
                        }
                    } while (mo14871A() == this.f12428e);
                    this.f12426c = i;
                } else if (i8 == 2) {
                    int A2 = this.f12426c + mo14871A();
                    while (this.f12426c < A2) {
                        list.add(Long.valueOf(mo14872B()));
                    }
                    mo14877b(A2);
                } else {
                    throw C3476a0.m8730d();
                }
            }
        }

        /* renamed from: e */
        public final void mo14882e(int i) throws IOException {
            mo14875a(i);
            if ((i & 3) != 0) {
                throw C3476a0.m8733g();
            }
        }

        /* renamed from: f */
        public final void mo14883f(int i) throws IOException {
            mo14875a(i);
            if ((i & 7) != 0) {
                throw C3476a0.m8733g();
            }
        }

        /* renamed from: c */
        public final void mo14879c(int i) throws IOException {
            int i2 = this.f12428e;
            int i3 = C3584t1.f12572a;
            if ((i2 & 7) != i) {
                throw C3476a0.m8730d();
            }
        }

        /* renamed from: d */
        public final void mo14881d(int i) throws IOException {
            mo14875a(i);
            this.f12426c += i;
        }

        /* renamed from: a */
        public void mo14876a(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            int i3 = this.f12428e;
            int i4 = C3584t1.f12572a;
            if ((i3 & 7) != 2) {
                throw C3476a0.m8730d();
            } else if (!(list instanceof C3497f0) || z) {
                do {
                    list.add(mo14874a(z));
                    if (!mo14884u()) {
                        i = this.f12426c;
                    } else {
                        return;
                    }
                } while (mo14871A() == this.f12428e);
                this.f12426c = i;
            } else {
                C3497f0 f0Var = (C3497f0) list;
                do {
                    f0Var.mo14821a(mo14827a());
                    if (!mo14884u()) {
                        i2 = this.f12426c;
                    } else {
                        return;
                    }
                } while (mo14871A() == this.f12428e);
                this.f12426c = i2;
            }
        }

        /* renamed from: a */
        public <T> void mo14831a(List<T> list, C3498f1<T> f1Var, C3562q qVar) throws IOException {
            int i;
            int i2 = this.f12428e;
            int i3 = C3584t1.f12572a;
            if ((i2 & 7) == 3) {
                do {
                    list.add(mo14878c(f1Var, qVar));
                    if (!mo14884u()) {
                        i = this.f12426c;
                    } else {
                        return;
                    }
                } while (mo14871A() == i2);
                this.f12426c = i;
                return;
            }
            throw C3476a0.m8730d();
        }

        /* renamed from: a */
        public <K, V> void mo14832a(Map<K, V> map, C3534j0.C3535a<K, V> aVar, C3562q qVar) throws IOException {
            mo14879c(2);
            int A = mo14871A();
            mo14875a(A);
            int i = this.f12427d;
            this.f12427d = this.f12426c + A;
            try {
                throw null;
            } catch (Throwable th) {
                this.f12427d = i;
                throw th;
            }
        }

        /* renamed from: a */
        public final void mo14875a(int i) throws IOException {
            if (i < 0 || i > this.f12427d - this.f12426c) {
                throw C3476a0.m8735i();
            }
        }
    }

    public C3494f() {
    }
}
