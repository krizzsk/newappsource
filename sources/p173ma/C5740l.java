package p173ma;

import p277ub.C6803r;

/* renamed from: ma.l */
public final class C5740l {

    /* renamed from: ma.l$a */
    public static final class C5741a {

        /* renamed from: a */
        public long f18599a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009b, code lost:
        if (r7 == r1.f18607f) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a8, code lost:
        if ((r17.mo22997p() * 1000) == r3) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b7, code lost:
        if (r4 == r3) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m14135a(p277ub.C6803r r17, p173ma.C5744o r18, int r19, p173ma.C5740l.C5741a r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r0.f21039b
            long r3 = r17.mo22998q()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0017
            return r9
        L_0x0017:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0021
            r5 = 1
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            r4 = 7
            if (r6 > r4) goto L_0x004f
            int r4 = r1.f18608g
            int r4 = r4 - r10
            if (r6 != r4) goto L_0x005a
            goto L_0x0058
        L_0x004f:
            r4 = 10
            if (r6 > r4) goto L_0x005a
            int r4 = r1.f18608g
            r6 = 2
            if (r4 != r6) goto L_0x005a
        L_0x0058:
            r4 = 1
            goto L_0x005b
        L_0x005a:
            r4 = 0
        L_0x005b:
            if (r4 == 0) goto L_0x00e0
            if (r8 != 0) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            int r4 = r1.f18610i
            if (r8 != r4) goto L_0x0066
        L_0x0064:
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x00e0
            if (r3 != 0) goto L_0x00e0
            long r3 = r17.mo23003v()     // Catch:{ NumberFormatException -> 0x007d }
            if (r5 == 0) goto L_0x0072
            goto L_0x0077
        L_0x0072:
            int r5 = r1.f18603b
            long r5 = (long) r5
            long r3 = r3 * r5
        L_0x0077:
            r5 = r20
            r5.f18599a = r3
            r3 = 1
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            if (r3 == 0) goto L_0x00e0
            int r3 = m14136b(r12, r0)
            r4 = -1
            if (r3 == r4) goto L_0x008d
            int r4 = r1.f18603b
            if (r3 > r4) goto L_0x008d
            r3 = 1
            goto L_0x008e
        L_0x008d:
            r3 = 0
        L_0x008e:
            if (r3 == 0) goto L_0x00e0
            int r3 = r1.f18606e
            if (r7 != 0) goto L_0x0095
            goto L_0x00b9
        L_0x0095:
            r4 = 11
            if (r7 > r4) goto L_0x009e
            int r1 = r1.f18607f
            if (r7 != r1) goto L_0x00bb
            goto L_0x00b9
        L_0x009e:
            r1 = 12
            if (r7 != r1) goto L_0x00ab
            int r1 = r17.mo22997p()
            int r1 = r1 * 1000
            if (r1 != r3) goto L_0x00bb
            goto L_0x00b9
        L_0x00ab:
            r1 = 14
            if (r7 > r1) goto L_0x00bb
            int r4 = r17.mo23002u()
            if (r7 != r1) goto L_0x00b7
            int r4 = r4 * 10
        L_0x00b7:
            if (r4 != r3) goto L_0x00bb
        L_0x00b9:
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            if (r1 == 0) goto L_0x00e0
            int r1 = r17.mo22997p()
            int r3 = r0.f21039b
            byte[] r0 = r0.f21038a
            int r3 = r3 - r10
            r4 = 0
        L_0x00c8:
            if (r2 >= r3) goto L_0x00d6
            int[] r5 = p277ub.C6774a0.f20969k
            byte r6 = r0[r2]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r6
            r4 = r5[r4]
            int r2 = r2 + 1
            goto L_0x00c8
        L_0x00d6:
            int r0 = p277ub.C6774a0.f20959a
            if (r1 != r4) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            if (r0 == 0) goto L_0x00e0
            r9 = 1
        L_0x00e0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p173ma.C5740l.m14135a(ub.r, ma.o, int, ma.l$a):boolean");
    }

    /* renamed from: b */
    public static int m14136b(int i, C6803r rVar) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return rVar.mo22997p() + 1;
            case 7:
                return rVar.mo23002u() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
