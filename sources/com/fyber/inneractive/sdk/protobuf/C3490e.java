package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.e */
public final class C3490e {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.e$a */
    public static final class C3491a {

        /* renamed from: a */
        public int f12419a;

        /* renamed from: b */
        public long f12420b;

        /* renamed from: c */
        public Object f12421c;

        /* renamed from: d */
        public final C3562q f12422d;

        public C3491a(C3562q qVar) {
            qVar.getClass();
            this.f12422d = qVar;
        }
    }

    /* renamed from: a */
    public static int m8753a(int i, byte[] bArr, int i2, C3491a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.f12419a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.f12419a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.f12419a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.f12419a = i9 | (b4 << 28);
            return i11;
        }
        int i12 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] < 0) {
                i11 = i13;
            } else {
                aVar.f12419a = i12;
                return i13;
            }
        }
    }

    /* renamed from: b */
    public static long m8762b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    public static int m8763c(byte[] bArr, int i, C3491a aVar) throws C3476a0 {
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a;
        if (i2 < 0) {
            throw C3476a0.m8732f();
        } else if (i2 == 0) {
            aVar.f12421c = "";
            return d;
        } else {
            aVar.f12421c = C3576s1.f12550a.mo15182a(bArr, d, i2);
            return d + i2;
        }
    }

    /* renamed from: d */
    public static int m8765d(byte[] bArr, int i, C3491a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m8753a((int) b, bArr, i2, aVar);
        }
        aVar.f12419a = b;
        return i2;
    }

    /* renamed from: e */
    public static int m8767e(byte[] bArr, int i, C3491a aVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            aVar.f12420b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        aVar.f12420b = j2;
        return i3;
    }

    /* renamed from: f */
    public static int m8769f(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3607y yVar = (C3607y) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            d = m8765d(bArr, d, aVar);
            yVar.mo15242c(C3529j.m9025b(aVar.f12419a));
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: g */
    public static int m8770g(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3506h0 h0Var = (C3506h0) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            d = m8767e(bArr, d, aVar);
            h0Var.mo14915a(C3529j.m9021a(aVar.f12420b));
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: h */
    public static int m8771h(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3607y yVar = (C3607y) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            d = m8765d(bArr, d, aVar);
            yVar.mo15242c(aVar.f12419a);
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: i */
    public static int m8772i(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3506h0 h0Var = (C3506h0) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            d = m8767e(bArr, d, aVar);
            h0Var.mo14915a(aVar.f12420b);
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: b */
    public static int m8760b(byte[] bArr, int i, C3491a aVar) throws C3476a0 {
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a;
        if (i2 < 0) {
            throw C3476a0.m8732f();
        } else if (i2 == 0) {
            aVar.f12421c = "";
            return d;
        } else {
            aVar.f12421c = new String(bArr, d, i2, C3609z.f12640a);
            return d + i2;
        }
    }

    /* renamed from: d */
    public static int m8766d(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3506h0 h0Var = (C3506h0) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            h0Var.mo14915a(m8762b(bArr, d));
            d += 8;
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: e */
    public static int m8768e(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3603w wVar = (C3603w) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            wVar.mo15230a(Float.intBitsToFloat(m8757a(bArr, d)));
            d += 4;
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: b */
    public static int m8761b(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3551n nVar = (C3551n) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            nVar.mo15124a(Double.longBitsToDouble(m8762b(bArr, d)));
            d += 8;
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: c */
    public static int m8764c(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3607y yVar = (C3607y) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            yVar.mo15242c(m8757a(bArr, d));
            d += 4;
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: a */
    public static int m8757a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: a */
    public static int m8758a(byte[] bArr, int i, C3491a aVar) throws C3476a0 {
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a;
        if (i2 < 0) {
            throw C3476a0.m8732f();
        } else if (i2 > bArr.length - d) {
            throw C3476a0.m8735i();
        } else if (i2 == 0) {
            aVar.f12421c = C3508i.f12443b;
            return d;
        } else {
            aVar.f12421c = C3508i.m8971a(bArr, d, i2);
            return d + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8756a(com.fyber.inneractive.sdk.protobuf.C3498f1 r6, byte[] r7, int r8, int r9, com.fyber.inneractive.sdk.protobuf.C3490e.C3491a r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m8753a((int) r8, (byte[]) r7, (int) r0, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r10)
            int r8 = r10.f12419a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo14890a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo14894a(r1, r2, r3, r4, r5)
            r6.mo14898c(r9)
            r10.f12421c = r9
            return r8
        L_0x0025:
            com.fyber.inneractive.sdk.protobuf.a0 r6 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8735i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3490e.m8756a(com.fyber.inneractive.sdk.protobuf.f1, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* renamed from: a */
    public static int m8755a(C3498f1 f1Var, byte[] bArr, int i, int i2, int i3, C3491a aVar) throws IOException {
        C3583t0 t0Var = (C3583t0) f1Var;
        Object a = t0Var.mo14890a();
        int a2 = t0Var.mo15188a(a, bArr, i, i2, i3, aVar);
        t0Var.mo14898c(a);
        aVar.f12421c = a;
        return a2;
    }

    /* renamed from: a */
    public static int m8752a(int i, byte[] bArr, int i2, int i3, C3609z.C3620j<?> jVar, C3491a aVar) {
        C3607y yVar = (C3607y) jVar;
        int d = m8765d(bArr, i2, aVar);
        yVar.mo15242c(aVar.f12419a);
        while (d < i3) {
            int d2 = m8765d(bArr, d, aVar);
            if (i != aVar.f12419a) {
                break;
            }
            d = m8765d(bArr, d2, aVar);
            yVar.mo15242c(aVar.f12419a);
        }
        return d;
    }

    /* renamed from: a */
    public static int m8759a(byte[] bArr, int i, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        C3499g gVar = (C3499g) jVar;
        int d = m8765d(bArr, i, aVar);
        int i2 = aVar.f12419a + d;
        while (d < i2) {
            d = m8767e(bArr, d, aVar);
            gVar.mo14900a(aVar.f12420b != 0);
        }
        if (d == i2) {
            return d;
        }
        throw C3476a0.m8735i();
    }

    /* renamed from: a */
    public static int m8754a(C3498f1<?> f1Var, int i, byte[] bArr, int i2, int i3, C3609z.C3620j<?> jVar, C3491a aVar) throws IOException {
        int a = m8756a((C3498f1) f1Var, bArr, i2, i3, aVar);
        jVar.add(aVar.f12421c);
        while (a < i3) {
            int d = m8765d(bArr, a, aVar);
            if (i != aVar.f12419a) {
                break;
            }
            a = m8756a((C3498f1) f1Var, bArr, d, i3, aVar);
            jVar.add(aVar.f12421c);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ee, code lost:
        r10 = r0;
        r0 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01fe, code lost:
        r10 = r0;
        r0 = r2 + 8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8749a(int r13, byte[] r14, int r15, int r16, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage r17, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C3468d r18, com.fyber.inneractive.sdk.protobuf.C3550m1 r19, com.fyber.inneractive.sdk.protobuf.C3490e.C3491a r20) throws java.io.IOException {
        /*
            r1 = r14
            r2 = r15
            r0 = r17
            r6 = r18
            r3 = r19
            r7 = r20
            com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r8 = r0.extensions
            int r4 = r13 >>> 3
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r5 = r6.f12376d
            boolean r9 = r5.f12371d
            r10 = 0
            r11 = 0
            r12 = 10
            if (r9 == 0) goto L_0x00fa
            boolean r9 = r5.f12372e
            if (r9 == 0) goto L_0x00fa
            com.fyber.inneractive.sdk.protobuf.t1$b r5 = r5.f12370c
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00b9;
                case 3: goto L_0x00b9;
                case 4: goto L_0x00a9;
                case 5: goto L_0x0099;
                case 6: goto L_0x0089;
                case 7: goto L_0x0077;
                case 8: goto L_0x0025;
                case 9: goto L_0x0025;
                case 10: goto L_0x0025;
                case 11: goto L_0x0025;
                case 12: goto L_0x00a9;
                case 13: goto L_0x0051;
                case 14: goto L_0x0089;
                case 15: goto L_0x0099;
                case 16: goto L_0x0041;
                case 17: goto L_0x0031;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Type cannot be packed: "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            goto L_0x00ed
        L_0x0031:
            com.fyber.inneractive.sdk.protobuf.h0 r0 = new com.fyber.inneractive.sdk.protobuf.h0
            r0.<init>()
            int r1 = m8770g(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x0041:
            com.fyber.inneractive.sdk.protobuf.y r0 = new com.fyber.inneractive.sdk.protobuf.y
            r0.<init>()
            int r1 = m8769f(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x0051:
            com.fyber.inneractive.sdk.protobuf.y r5 = new com.fyber.inneractive.sdk.protobuf.y
            r5.<init>()
            int r1 = m8771h(r14, r15, r5, r7)
            com.fyber.inneractive.sdk.protobuf.n1 r2 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r7 = com.fyber.inneractive.sdk.protobuf.C3553n1.f12524f
            if (r2 != r7) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r10 = r2
        L_0x0062:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            com.fyber.inneractive.sdk.protobuf.z$d<?> r2 = r2.f12368a
            java.lang.Object r2 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8929a((int) r4, (java.util.List<java.lang.Integer>) r5, (com.fyber.inneractive.sdk.protobuf.C3609z.C3613d<?>) r2, r10, r3)
            com.fyber.inneractive.sdk.protobuf.n1 r2 = (com.fyber.inneractive.sdk.protobuf.C3553n1) r2
            if (r2 == 0) goto L_0x0070
            r0.unknownFields = r2
        L_0x0070:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r0 = r6.f12376d
            r8.mo15218c(r0, r5)
            goto L_0x022a
        L_0x0077:
            com.fyber.inneractive.sdk.protobuf.g r0 = new com.fyber.inneractive.sdk.protobuf.g
            boolean[] r3 = new boolean[r12]
            r0.<init>(r3, r11)
            int r1 = m8759a((byte[]) r14, (int) r15, (com.fyber.inneractive.sdk.protobuf.C3609z.C3620j<?>) r0, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x0089:
            com.fyber.inneractive.sdk.protobuf.y r0 = new com.fyber.inneractive.sdk.protobuf.y
            r0.<init>()
            int r1 = m8764c(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x0099:
            com.fyber.inneractive.sdk.protobuf.h0 r0 = new com.fyber.inneractive.sdk.protobuf.h0
            r0.<init>()
            int r1 = m8766d(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x00a9:
            com.fyber.inneractive.sdk.protobuf.y r0 = new com.fyber.inneractive.sdk.protobuf.y
            r0.<init>()
            int r1 = m8771h(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x00b9:
            com.fyber.inneractive.sdk.protobuf.h0 r0 = new com.fyber.inneractive.sdk.protobuf.h0
            r0.<init>()
            int r1 = m8772i(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x00c9:
            com.fyber.inneractive.sdk.protobuf.w r0 = new com.fyber.inneractive.sdk.protobuf.w
            float[] r3 = new float[r12]
            r0.<init>(r3, r11)
            int r1 = m8768e(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x00db:
            com.fyber.inneractive.sdk.protobuf.n r0 = new com.fyber.inneractive.sdk.protobuf.n
            double[] r3 = new double[r12]
            r0.<init>(r3, r11)
            int r1 = m8761b(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            r8.mo15218c(r2, r0)
            goto L_0x022a
        L_0x00ed:
            com.fyber.inneractive.sdk.protobuf.t1$b r2 = r2.f12370c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            com.fyber.inneractive.sdk.protobuf.t1$b r5 = r5.f12370c
            com.fyber.inneractive.sdk.protobuf.t1$b r9 = com.fyber.inneractive.sdk.protobuf.C3584t1.C3586b.ENUM
            if (r5 != r9) goto L_0x0134
            int r1 = m8765d(r14, r15, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f12376d
            com.fyber.inneractive.sdk.protobuf.z$d<?> r2 = r2.f12368a
            int r5 = r7.f12419a
            com.fyber.inneractive.sdk.protobuf.z$c r2 = r2.mo15253a(r5)
            if (r2 != 0) goto L_0x012b
            com.fyber.inneractive.sdk.protobuf.n1 r2 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r5 = com.fyber.inneractive.sdk.protobuf.C3553n1.f12524f
            if (r2 != r5) goto L_0x011c
            com.fyber.inneractive.sdk.protobuf.n1 r2 = com.fyber.inneractive.sdk.protobuf.C3553n1.m9372c()
            r0.unknownFields = r2
        L_0x011c:
            int r0 = r7.f12419a
            java.lang.Class<?> r5 = com.fyber.inneractive.sdk.protobuf.C3507h1.f12439a
            if (r2 != 0) goto L_0x0126
            java.lang.Object r2 = r19.mo15105a()
        L_0x0126:
            long r5 = (long) r0
            r3.mo15116b(r2, r4, r5)
            return r1
        L_0x012b:
            int r0 = r7.f12419a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r0 = r1
            goto L_0x0201
        L_0x0134:
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x01f2;
                case 1: goto L_0x01e2;
                case 2: goto L_0x01d7;
                case 3: goto L_0x01d7;
                case 4: goto L_0x01cc;
                case 5: goto L_0x01c3;
                case 6: goto L_0x01ba;
                case 7: goto L_0x01a8;
                case 8: goto L_0x01a1;
                case 9: goto L_0x0184;
                case 10: goto L_0x016e;
                case 11: goto L_0x0166;
                case 12: goto L_0x01cc;
                case 13: goto L_0x015e;
                case 14: goto L_0x01ba;
                case 15: goto L_0x01c3;
                case 16: goto L_0x014e;
                case 17: goto L_0x013e;
                default: goto L_0x013b;
            }
        L_0x013b:
            r0 = r2
            goto L_0x0201
        L_0x013e:
            int r0 = m8767e(r14, r15, r7)
            long r1 = r7.f12420b
            long r1 = com.fyber.inneractive.sdk.protobuf.C3529j.m9021a((long) r1)
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            goto L_0x0201
        L_0x014e:
            int r0 = m8765d(r14, r15, r7)
            int r1 = r7.f12419a
            int r1 = com.fyber.inneractive.sdk.protobuf.C3529j.m9025b(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            goto L_0x0201
        L_0x015e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x0166:
            int r0 = m8758a(r14, r15, r7)
            java.lang.Object r10 = r7.f12421c
            goto L_0x0201
        L_0x016e:
            com.fyber.inneractive.sdk.protobuf.b1 r0 = com.fyber.inneractive.sdk.protobuf.C3481b1.f12402c
            com.fyber.inneractive.sdk.protobuf.q0 r3 = r6.f12375c
            java.lang.Class r3 = r3.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r0.mo14786a(r3)
            r3 = r16
            int r0 = m8756a((com.fyber.inneractive.sdk.protobuf.C3498f1) r0, (byte[]) r14, (int) r15, (int) r3, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r7)
            java.lang.Object r10 = r7.f12421c
            goto L_0x0201
        L_0x0184:
            r3 = r16
            int r0 = r4 << 3
            r4 = r0 | 4
            com.fyber.inneractive.sdk.protobuf.b1 r0 = com.fyber.inneractive.sdk.protobuf.C3481b1.f12402c
            com.fyber.inneractive.sdk.protobuf.q0 r5 = r6.f12375c
            java.lang.Class r5 = r5.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r0.mo14786a(r5)
            r1 = r14
            r2 = r15
            r5 = r20
            int r0 = m8755a((com.fyber.inneractive.sdk.protobuf.C3498f1) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r5)
            java.lang.Object r10 = r7.f12421c
            goto L_0x0201
        L_0x01a1:
            int r0 = m8760b(r14, r15, r7)
            java.lang.Object r10 = r7.f12421c
            goto L_0x0201
        L_0x01a8:
            int r0 = m8767e(r14, r15, r7)
            long r1 = r7.f12420b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x01b5
            r11 = 1
        L_0x01b5:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r11)
            goto L_0x0201
        L_0x01ba:
            int r0 = m8757a(r14, r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01ee
        L_0x01c3:
            long r0 = m8762b(r14, r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01fe
        L_0x01cc:
            int r0 = m8765d(r14, r15, r7)
            int r1 = r7.f12419a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            goto L_0x0201
        L_0x01d7:
            int r0 = m8767e(r14, r15, r7)
            long r1 = r7.f12420b
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            goto L_0x0201
        L_0x01e2:
            int r0 = m8757a(r14, r15)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x01ee:
            r10 = r0
            int r0 = r2 + 4
            goto L_0x0201
        L_0x01f2:
            long r0 = m8762b(r14, r15)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x01fe:
            r10 = r0
            int r0 = r2 + 8
        L_0x0201:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r1 = r6.f12376d
            boolean r2 = r1.f12371d
            if (r2 == 0) goto L_0x020b
            r8.mo15215a(r1, (java.lang.Object) r10)
            goto L_0x0229
        L_0x020b:
            com.fyber.inneractive.sdk.protobuf.t1$b r1 = r1.f12370c
            int r1 = r1.ordinal()
            r2 = 9
            if (r1 == r2) goto L_0x0218
            if (r1 == r12) goto L_0x0218
            goto L_0x0224
        L_0x0218:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r1 = r6.f12376d
            java.lang.Object r1 = r8.mo15214a(r1)
            if (r1 == 0) goto L_0x0224
            java.lang.Object r10 = com.fyber.inneractive.sdk.protobuf.C3609z.m9637a((java.lang.Object) r1, (java.lang.Object) r10)
        L_0x0224:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r1 = r6.f12376d
            r8.mo15218c(r1, r10)
        L_0x0229:
            r1 = r0
        L_0x022a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3490e.m8749a(int, byte[], int, int, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d, com.fyber.inneractive.sdk.protobuf.m1, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* renamed from: a */
    public static int m8751a(int i, byte[] bArr, int i2, int i3, C3553n1 n1Var, C3491a aVar) throws C3476a0 {
        int i4 = C3584t1.f12572a;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int e = m8767e(bArr, i2, aVar);
                n1Var.mo15136a(i, (Object) Long.valueOf(aVar.f12420b));
                return e;
            } else if (i5 == 1) {
                n1Var.mo15136a(i, (Object) Long.valueOf(m8762b(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int d = m8765d(bArr, i2, aVar);
                int i6 = aVar.f12419a;
                if (i6 < 0) {
                    throw C3476a0.m8732f();
                } else if (i6 <= bArr.length - d) {
                    if (i6 == 0) {
                        n1Var.mo15136a(i, (Object) C3508i.f12443b);
                    } else {
                        n1Var.mo15136a(i, (Object) C3508i.m8971a(bArr, d, i6));
                    }
                    return d + i6;
                } else {
                    throw C3476a0.m8735i();
                }
            } else if (i5 == 3) {
                C3553n1 c = C3553n1.m9372c();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int d2 = m8765d(bArr, i2, aVar);
                    int i9 = aVar.f12419a;
                    if (i9 == i7) {
                        i8 = i9;
                        i2 = d2;
                        break;
                    }
                    i8 = i9;
                    i2 = m8751a(i9, bArr, d2, i3, c, aVar);
                }
                if (i2 > i3 || i8 != i7) {
                    throw C3476a0.m8733g();
                }
                n1Var.mo15136a(i, (Object) c);
                return i2;
            } else if (i5 == 5) {
                n1Var.mo15136a(i, (Object) Integer.valueOf(m8757a(bArr, i2)));
                return i2 + 4;
            } else {
                throw C3476a0.m8728b();
            }
        } else {
            throw C3476a0.m8728b();
        }
    }

    /* renamed from: a */
    public static int m8750a(int i, byte[] bArr, int i2, int i3, C3491a aVar) throws C3476a0 {
        int i4 = C3584t1.f12572a;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                return m8767e(bArr, i2, aVar);
            }
            if (i5 == 1) {
                return i2 + 8;
            }
            if (i5 == 2) {
                return m8765d(bArr, i2, aVar) + aVar.f12419a;
            }
            if (i5 == 3) {
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (i2 < i3) {
                    i2 = m8765d(bArr, i2, aVar);
                    i7 = aVar.f12419a;
                    if (i7 == i6) {
                        break;
                    }
                    i2 = m8750a(i7, bArr, i2, i3, aVar);
                }
                if (i2 <= i3 && i7 == i6) {
                    return i2;
                }
                throw C3476a0.m8733g();
            } else if (i5 == 5) {
                return i2 + 4;
            } else {
                throw C3476a0.m8728b();
            }
        } else {
            throw C3476a0.m8728b();
        }
    }
}
