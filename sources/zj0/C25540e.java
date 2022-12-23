package zj0;

/* renamed from: zj0.e */
public final class C25540e implements C25539d {

    /* renamed from: d */
    public static final boolean[] f63795d = {true, true, true, false, true, false, false, false};

    /* renamed from: e */
    public static final int[] f63796e = {0, 1, 2, 2, 3, 3, 3, 3};

    /* renamed from: b */
    public int f63797b;

    /* renamed from: c */
    public int f63798c = 0;

    public C25540e(int i) {
        this.f63797b = i + 5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if ((r0 == 0 || r0 == 255) != false) goto L_0x00b1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21181a(int r13, int r14, byte[] r15) {
        /*
            r12 = this;
            int r0 = r13 + -1
            int r14 = r14 + r13
            int r14 = r14 + -5
            r1 = r13
        L_0x0006:
            r2 = 0
            r3 = 1
            if (r1 > r14) goto L_0x00bb
            byte r4 = r15[r1]
            r4 = r4 & 254(0xfe, float:3.56E-43)
            r5 = 232(0xe8, float:3.25E-43)
            if (r4 == r5) goto L_0x0014
            goto L_0x00b8
        L_0x0014:
            int r0 = r1 - r0
            r4 = r0 & -4
            r5 = 255(0xff, float:3.57E-43)
            if (r4 == 0) goto L_0x001f
            r12.f63798c = r2
            goto L_0x0047
        L_0x001f:
            int r4 = r12.f63798c
            int r0 = r0 + -1
            int r0 = r4 << r0
            r0 = r0 & 7
            r12.f63798c = r0
            if (r0 == 0) goto L_0x0047
            boolean[] r4 = f63795d
            boolean r4 = r4[r0]
            if (r4 == 0) goto L_0x00b1
            int r4 = r1 + 4
            int[] r6 = f63796e
            r0 = r6[r0]
            int r4 = r4 - r0
            byte r0 = r15[r4]
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0042
            if (r0 != r5) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            if (r0 == 0) goto L_0x0047
            goto L_0x00b1
        L_0x0047:
            int r0 = r1 + 4
            byte r4 = r15[r0]
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 == 0) goto L_0x0054
            if (r6 != r5) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r6 = 0
            goto L_0x0055
        L_0x0054:
            r6 = 1
        L_0x0055:
            if (r6 == 0) goto L_0x00b1
            int r6 = r1 + 1
            byte r7 = r15[r6]
            r7 = r7 & r5
            int r8 = r1 + 2
            byte r9 = r15[r8]
            r9 = r9 & r5
            int r9 = r9 << 8
            r7 = r7 | r9
            int r9 = r1 + 3
            byte r10 = r15[r9]
            r10 = r10 & r5
            int r10 = r10 << 16
            r7 = r7 | r10
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r4 = r4 | r7
        L_0x0071:
            int r7 = r12.f63797b
            int r7 = r7 + r1
            int r7 = r7 - r13
            int r4 = r4 - r7
            int r7 = r12.f63798c
            if (r7 != 0) goto L_0x007b
            goto L_0x0091
        L_0x007b:
            int[] r10 = f63796e
            r7 = r10[r7]
            int r7 = r7 * 8
            int r10 = 24 - r7
            int r10 = r4 >>> r10
            byte r10 = (byte) r10
            r10 = r10 & r5
            if (r10 == 0) goto L_0x008e
            if (r10 != r5) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r10 = 0
            goto L_0x008f
        L_0x008e:
            r10 = 1
        L_0x008f:
            if (r10 != 0) goto L_0x00aa
        L_0x0091:
            byte r2 = (byte) r4
            r15[r6] = r2
            int r2 = r4 >>> 8
            byte r2 = (byte) r2
            r15[r8] = r2
            int r2 = r4 >>> 16
            byte r2 = (byte) r2
            r15[r9] = r2
            int r2 = r4 >>> 24
            r2 = r2 & r3
            int r2 = r2 - r3
            int r2 = ~r2
            byte r2 = (byte) r2
            r15[r0] = r2
            r11 = r1
            r1 = r0
            r0 = r11
            goto L_0x00b8
        L_0x00aa:
            int r7 = 32 - r7
            int r7 = r3 << r7
            int r7 = r7 - r3
            r4 = r4 ^ r7
            goto L_0x0071
        L_0x00b1:
            int r0 = r12.f63798c
            int r0 = r0 << r3
            r0 = r0 | r3
            r12.f63798c = r0
            r0 = r1
        L_0x00b8:
            int r1 = r1 + r3
            goto L_0x0006
        L_0x00bb:
            int r14 = r1 - r0
            r15 = r14 & -4
            if (r15 == 0) goto L_0x00c2
            goto L_0x00c7
        L_0x00c2:
            int r15 = r12.f63798c
            int r14 = r14 - r3
            int r2 = r15 << r14
        L_0x00c7:
            r12.f63798c = r2
            int r1 = r1 - r13
            int r13 = r12.f63797b
            int r13 = r13 + r1
            r12.f63797b = r13
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zj0.C25540e.mo21181a(int, int, byte[]):int");
    }
}
