package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import java.io.IOException;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a */
public final class C3126a implements C3128b {

    /* renamed from: a */
    public final byte[] f10824a = new byte[8];

    /* renamed from: b */
    public final Stack<C3127a> f10825b = new Stack<>();

    /* renamed from: c */
    public final C3135f f10826c = new C3135f();

    /* renamed from: d */
    public C3129c f10827d;

    /* renamed from: e */
    public int f10828e;

    /* renamed from: f */
    public int f10829f;

    /* renamed from: g */
    public long f10830g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a */
    public static final class C3127a {

        /* renamed from: a */
        public final int f10831a;

        /* renamed from: b */
        public final long f10832b;

        public C3127a(int i, long j) {
            this.f10831a = i;
            this.f10832b = j;
        }
    }

    /* renamed from: a */
    public void mo14188a(C3129c cVar) {
        this.f10827d = cVar;
    }

    /* renamed from: b */
    public final long mo14190b(C3087g gVar, int i) throws IOException, InterruptedException {
        ((C3072b) gVar).mo14087b(this.f10824a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f10824a[i2] & 255));
        }
        return j;
    }

    /* renamed from: c */
    public final String mo14191c(C3087g gVar, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        ((C3072b) gVar).mo14087b(bArr, 0, i, false);
        return new String(bArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v116, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r3v30, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r3v32 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0474, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04be, code lost:
        r5 = r4;
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0566, code lost:
        r4 = r2;
        r2 = null;
        r5 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x05c5, code lost:
        r13 = r4;
        r16 = r5;
        r19 = -1;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x061f, code lost:
        if (r2.mo14554i() == r6.getLeastSignificantBits()) goto L_0x0621;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0633, code lost:
        r2 = null;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0636, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x064e, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x064f, code lost:
        r19 = r2;
        r13 = r4;
        r2 = r5;
        r16 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0656, code lost:
        r4 = r3.f10900M | 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x065c, code lost:
        if (r3.f10899L == false) goto L_0x0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x065e, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0660, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0661, code lost:
        r4 = r4 | r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0666, code lost:
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8521d(r13) == false) goto L_0x0689;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0668, code lost:
        r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8178a(java.lang.Integer.toString(r11), r13, (java.lang.String) null, -1, r16, r3.f10894G, r3.f10896I, r19, r2, r3.f10912i, (int) r4, r3.f10901N);
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x068d, code lost:
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8522e(r13) == false) goto L_0x07ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0691, code lost:
        if (r3.f10917n != 0) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0693, code lost:
        r4 = r3.f10915l;
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0696, code lost:
        if (r4 != -1) goto L_0x069a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0698, code lost:
        r4 = r3.f10913j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x069a, code lost:
        r3.f10915l = r4;
        r4 = r3.f10916m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x069e, code lost:
        if (r4 != -1) goto L_0x06a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x06a0, code lost:
        r4 = r3.f10914k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x06a2, code lost:
        r3.f10916m = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x06a5, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06a6, code lost:
        r4 = r3.f10915l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x06aa, code lost:
        if (r4 == r5) goto L_0x06be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x06ac, code lost:
        r8 = r3.f10916m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x06ae, code lost:
        if (r8 == r5) goto L_0x06be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x06b0, code lost:
        r22 = ((float) (r3.f10914k * r4)) / ((float) (r3.f10913j * r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x06be, code lost:
        r22 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x06c4, code lost:
        if (r3.f10920q == false) goto L_0x0791;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x06ca, code lost:
        if (r3.f10926w == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x06d0, code lost:
        if (r3.f10927x == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x06d6, code lost:
        if (r3.f10928y == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x06dc, code lost:
        if (r3.f10929z == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x06e2, code lost:
        if (r3.f10888A == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x06e8, code lost:
        if (r3.f10889B == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x06ee, code lost:
        if (r3.f10890C == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x06f4, code lost:
        if (r3.f10891D == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x06fa, code lost:
        if (r3.f10892E == -1.0f) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0700, code lost:
        if (r3.f10893F != -1.0f) goto L_0x0704;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0704, code lost:
        r4 = new byte[25];
        r5 = java.nio.ByteBuffer.wrap(r4);
        r5.put((byte) 0);
        r5.putShort((short) ((int) ((r3.f10926w * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r3.f10927x * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r3.f10928y * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r3.f10929z * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r3.f10888A * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r3.f10889B * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r3.f10890C * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) ((r3.f10891D * 50000.0f) + 0.5f)));
        r5.putShort((short) ((int) (r3.f10892E + 0.5f)));
        r5.putShort((short) ((int) (r3.f10893F + 0.5f)));
        r5.putShort((short) r3.f10924u);
        r5.putShort((short) r3.f10925v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0782, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0783, code lost:
        r25 = new com.fyber.inneractive.sdk.player.exoplayer2.video.C3418b(r3.f10921r, r3.f10923t, r3.f10922s, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0791, code lost:
        r25 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0794, code lost:
        r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8176a(java.lang.Integer.toString(r11), r13, (java.lang.String) null, -1, r16, r3.f10913j, r3.f10914k, -1.0f, r2, -1, r22, r3.f10918o, r3.f10919p, r25, r3.f10912i);
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07c0, code lost:
        if ("application/x-subrip".equals(r13) == false) goto L_0x07d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07c2, code lost:
        r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8180a(java.lang.Integer.toString(r11), r13, (java.lang.String) null, -1, (int) r4, r3.f10901N, r3.f10912i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x07dd, code lost:
        if ("application/vobsub".equals(r13) != false) goto L_0x07f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x07e5, code lost:
        if ("application/pgs".equals(r13) != false) goto L_0x07f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x07ed, code lost:
        if ("application/dvbsubs".equals(r13) == false) goto L_0x07f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x07f7, code lost:
        throw new com.fyber.inneractive.sdk.player.exoplayer2.C3230l("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x07f8, code lost:
        r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8182a(java.lang.Integer.toString(r11), r13, (java.lang.String) null, -1, r2, r3.f10901N, r3.f10912i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x080c, code lost:
        r4 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x080d, code lost:
        r4 = r7.mo14122a(r3.f10905b, r4);
        r3.f10902O = r4;
        r4.mo14098a(r2);
        r2 = r1.f10863c;
        r3 = r1.f10880t;
        r2.put(r3.f10905b, r3);
        r12 = null;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r5v1, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14189a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r29) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            java.lang.String r2 = "Error parsing vorbis codec private"
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r3 = r0.f10827d
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x000e
            r3 = 1
            goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r3)
        L_0x0012:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a> r3 = r0.f10825b
            boolean r3 = r3.isEmpty()
            r6 = -1
            r8 = 4
            r9 = 3
            r10 = -1
            if (r3 != 0) goto L_0x0849
            r3 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r3
            long r11 = r3.f10548c
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a> r3 = r0.f10825b
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3126a.C3127a) r3
            long r13 = r3.f10832b
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x0849
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r1 = r0.f10827d
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a> r3 = r0.f10825b
            java.lang.Object r3 = r3.pop()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3126a.C3127a) r3
            int r3 = r3.f10831a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3132b) r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.this
            r1.getClass()
            r11 = 160(0xa0, float:2.24E-43)
            if (r3 == r11) goto L_0x0825
            r11 = 174(0xae, float:2.44E-43)
            r12 = 0
            if (r3 == r11) goto L_0x017e
            r2 = 19899(0x4dbb, float:2.7884E-41)
            r8 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r3 == r2) goto L_0x0166
            r2 = 25152(0x6240, float:3.5245E-41)
            if (r3 == r2) goto L_0x013d
            r2 = 28032(0x6d80, float:3.9281E-41)
            if (r3 == r2) goto L_0x0129
            r2 = 357149030(0x1549a966, float:4.072526E-26)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == r2) goto L_0x0110
            r2 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r3 == r2) goto L_0x00f9
            if (r3 == r8) goto L_0x0070
            goto L_0x0847
        L_0x0070:
            boolean r2 = r1.f10881u
            if (r2 != 0) goto L_0x0847
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r2 = r1.f10860Y
            long r13 = r1.f10876p
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00e7
            long r6 = r1.f10879s
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x00e7
            com.fyber.inneractive.sdk.player.exoplayer2.util.f r3 = r1.f10837B
            if (r3 == 0) goto L_0x00e7
            int r3 = r3.f12098a
            if (r3 == 0) goto L_0x00e7
            com.fyber.inneractive.sdk.player.exoplayer2.util.f r6 = r1.f10838C
            if (r6 == 0) goto L_0x00e7
            int r6 = r6.f12098a
            if (r6 == r3) goto L_0x0093
            goto L_0x00e7
        L_0x0093:
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            long[] r8 = new long[r3]
            long[] r9 = new long[r3]
            r10 = 0
        L_0x009c:
            if (r10 >= r3) goto L_0x00b4
            com.fyber.inneractive.sdk.player.exoplayer2.util.f r11 = r1.f10837B
            long r13 = r11.mo14530a((int) r10)
            r9[r10] = r13
            long r13 = r1.f10876p
            com.fyber.inneractive.sdk.player.exoplayer2.util.f r11 = r1.f10838C
            long r15 = r11.mo14530a((int) r10)
            long r15 = r15 + r13
            r7[r10] = r15
            int r10 = r10 + 1
            goto L_0x009c
        L_0x00b4:
            int r10 = r3 + -1
            if (r4 >= r10) goto L_0x00cb
            int r10 = r4 + 1
            r13 = r7[r10]
            r15 = r7[r4]
            long r13 = r13 - r15
            int r11 = (int) r13
            r6[r4] = r11
            r13 = r9[r10]
            r15 = r9[r4]
            long r13 = r13 - r15
            r8[r4] = r13
            r4 = r10
            goto L_0x00b4
        L_0x00cb:
            long r3 = r1.f10876p
            long r13 = r1.f10875o
            long r3 = r3 + r13
            r13 = r7[r10]
            long r3 = r3 - r13
            int r4 = (int) r3
            r6[r10] = r4
            long r3 = r1.f10879s
            r13 = r9[r10]
            long r3 = r3 - r13
            r8[r10] = r3
            r1.f10837B = r12
            r1.f10838C = r12
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a
            r3.<init>(r6, r7, r8, r9)
            goto L_0x00f2
        L_0x00e7:
            r1.f10837B = r12
            r1.f10838C = r12
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a
            long r6 = r1.f10879s
            r3.<init>(r6)
        L_0x00f2:
            r2.mo14123a(r3)
            r1.f10881u = r5
            goto L_0x0847
        L_0x00f9:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c> r2 = r1.f10863c
            int r2 = r2.size()
            if (r2 == 0) goto L_0x0108
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r1.f10860Y
            r1.mo14124c()
            goto L_0x0847
        L_0x0108:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "No valid tracks were found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0110:
            long r2 = r1.f10877q
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x011b
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r1.f10877q = r2
        L_0x011b:
            long r2 = r1.f10878r
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0847
            long r2 = r1.mo14193a((long) r2)
            r1.f10879s = r2
            goto L_0x0847
        L_0x0129:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r1 = r1.f10880t
            boolean r2 = r1.f10908e
            if (r2 == 0) goto L_0x0847
            byte[] r1 = r1.f10909f
            if (r1 != 0) goto L_0x0135
            goto L_0x0847
        L_0x0135:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Combining encryption and compression is not supported"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x013d:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r1 = r1.f10880t
            boolean r2 = r1.f10908e
            if (r2 == 0) goto L_0x0847
            byte[] r2 = r1.f10910g
            if (r2 == 0) goto L_0x015e
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r6 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a.C3061b[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b
            java.util.UUID r8 = com.fyber.inneractive.sdk.player.exoplayer2.C3052b.f10508b
            java.lang.String r9 = "video/webm"
            r7.<init>(r8, r9, r2, r4)
            r6[r4] = r7
            r3.<init>(r5, r6)
            r1.f10912i = r3
            goto L_0x0847
        L_0x015e:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0166:
            int r2 = r1.f10882v
            if (r2 == r10) goto L_0x0176
            long r3 = r1.f10883w
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0176
            if (r2 != r8) goto L_0x0847
            r1.f10885y = r3
            goto L_0x0847
        L_0x0176:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x017e:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r3 = r1.f10880t
            java.lang.String r3 = r3.f10904a
            java.lang.String r6 = "V_VP8"
            boolean r7 = r6.equals(r3)
            java.lang.String r10 = "V_VP9"
            if (r7 != 0) goto L_0x0265
            boolean r7 = r10.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "V_MPEG2"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "V_MPEG4/ISO/SP"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "V_MPEG4/ISO/ASP"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "V_MPEG4/ISO/AP"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "V_MPEG4/ISO/AVC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "V_MPEGH/ISO/HEVC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "V_MS/VFW/FOURCC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "V_THEORA"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_OPUS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_VORBIS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_AAC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_MPEG/L2"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_MPEG/L3"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_AC3"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_EAC3"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_TRUEHD"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_DTS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_DTS/EXPRESS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_DTS/LOSSLESS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_FLAC"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_MS/ACM"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "A_PCM/INT/LIT"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "S_TEXT/UTF8"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "S_VOBSUB"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "S_HDMV/PGS"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0265
            java.lang.String r7 = "S_DVBSUB"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0263
            goto L_0x0265
        L_0x0263:
            r3 = 0
            goto L_0x0266
        L_0x0265:
            r3 = 1
        L_0x0266:
            if (r3 == 0) goto L_0x0822
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r3 = r1.f10880t
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r7 = r1.f10860Y
            int r11 = r3.f10905b
            java.lang.String r12 = r3.f10904a
            r12.getClass()
            int r13 = r12.hashCode()
            r15 = 16
            switch(r13) {
                case -2095576542: goto L_0x03df;
                case -2095575984: goto L_0x03d4;
                case -1985379776: goto L_0x03c9;
                case -1784763192: goto L_0x03be;
                case -1730367663: goto L_0x03b3;
                case -1482641358: goto L_0x03a8;
                case -1482641357: goto L_0x039d;
                case -1373388978: goto L_0x0392;
                case -933872740: goto L_0x0384;
                case -538363189: goto L_0x0376;
                case -538363109: goto L_0x0368;
                case -425012669: goto L_0x035a;
                case -356037306: goto L_0x034c;
                case 62923557: goto L_0x033e;
                case 62923603: goto L_0x0330;
                case 62927045: goto L_0x0322;
                case 82338133: goto L_0x0316;
                case 82338134: goto L_0x030a;
                case 99146302: goto L_0x02fc;
                case 444813526: goto L_0x02ee;
                case 542569478: goto L_0x02e0;
                case 725957860: goto L_0x02d2;
                case 855502857: goto L_0x02c4;
                case 1422270023: goto L_0x02b6;
                case 1809237540: goto L_0x02a8;
                case 1950749482: goto L_0x029a;
                case 1950789798: goto L_0x028c;
                case 1951062397: goto L_0x027e;
                default: goto L_0x027c;
            }
        L_0x027c:
            goto L_0x03ea
        L_0x027e:
            java.lang.String r6 = "A_OPUS"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0288
            goto L_0x03ea
        L_0x0288:
            r6 = 27
            goto L_0x03eb
        L_0x028c:
            java.lang.String r6 = "A_FLAC"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0296
            goto L_0x03ea
        L_0x0296:
            r6 = 26
            goto L_0x03eb
        L_0x029a:
            java.lang.String r6 = "A_EAC3"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x02a4
            goto L_0x03ea
        L_0x02a4:
            r6 = 25
            goto L_0x03eb
        L_0x02a8:
            java.lang.String r6 = "V_MPEG2"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x02b2
            goto L_0x03ea
        L_0x02b2:
            r6 = 24
            goto L_0x03eb
        L_0x02b6:
            java.lang.String r6 = "S_TEXT/UTF8"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x02c0
            goto L_0x03ea
        L_0x02c0:
            r6 = 23
            goto L_0x03eb
        L_0x02c4:
            java.lang.String r6 = "V_MPEGH/ISO/HEVC"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x02ce
            goto L_0x03ea
        L_0x02ce:
            r6 = 22
            goto L_0x03eb
        L_0x02d2:
            java.lang.String r6 = "A_PCM/INT/LIT"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x02dc
            goto L_0x03ea
        L_0x02dc:
            r6 = 21
            goto L_0x03eb
        L_0x02e0:
            java.lang.String r6 = "A_DTS/EXPRESS"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x02ea
            goto L_0x03ea
        L_0x02ea:
            r6 = 20
            goto L_0x03eb
        L_0x02ee:
            java.lang.String r6 = "V_THEORA"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x02f8
            goto L_0x03ea
        L_0x02f8:
            r6 = 19
            goto L_0x03eb
        L_0x02fc:
            java.lang.String r6 = "S_HDMV/PGS"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0306
            goto L_0x03ea
        L_0x0306:
            r6 = 18
            goto L_0x03eb
        L_0x030a:
            boolean r6 = r12.equals(r10)
            if (r6 != 0) goto L_0x0312
            goto L_0x03ea
        L_0x0312:
            r6 = 17
            goto L_0x03eb
        L_0x0316:
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x031e
            goto L_0x03ea
        L_0x031e:
            r6 = 16
            goto L_0x03eb
        L_0x0322:
            java.lang.String r6 = "A_DTS"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x032c
            goto L_0x03ea
        L_0x032c:
            r6 = 15
            goto L_0x03eb
        L_0x0330:
            java.lang.String r6 = "A_AC3"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x033a
            goto L_0x03ea
        L_0x033a:
            r6 = 14
            goto L_0x03eb
        L_0x033e:
            java.lang.String r6 = "A_AAC"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0348
            goto L_0x03ea
        L_0x0348:
            r6 = 13
            goto L_0x03eb
        L_0x034c:
            java.lang.String r6 = "A_DTS/LOSSLESS"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0356
            goto L_0x03ea
        L_0x0356:
            r6 = 12
            goto L_0x03eb
        L_0x035a:
            java.lang.String r6 = "S_VOBSUB"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0364
            goto L_0x03ea
        L_0x0364:
            r6 = 11
            goto L_0x03eb
        L_0x0368:
            java.lang.String r6 = "V_MPEG4/ISO/AVC"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0372
            goto L_0x03ea
        L_0x0372:
            r6 = 10
            goto L_0x03eb
        L_0x0376:
            java.lang.String r6 = "V_MPEG4/ISO/ASP"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x0380
            goto L_0x03ea
        L_0x0380:
            r6 = 9
            goto L_0x03eb
        L_0x0384:
            java.lang.String r6 = "S_DVBSUB"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x038e
            goto L_0x03ea
        L_0x038e:
            r6 = 8
            goto L_0x03eb
        L_0x0392:
            java.lang.String r6 = "V_MS/VFW/FOURCC"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x039b
            goto L_0x03ea
        L_0x039b:
            r6 = 7
            goto L_0x03eb
        L_0x039d:
            java.lang.String r6 = "A_MPEG/L3"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x03a6
            goto L_0x03ea
        L_0x03a6:
            r6 = 6
            goto L_0x03eb
        L_0x03a8:
            java.lang.String r6 = "A_MPEG/L2"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x03b1
            goto L_0x03ea
        L_0x03b1:
            r6 = 5
            goto L_0x03eb
        L_0x03b3:
            java.lang.String r6 = "A_VORBIS"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x03bc
            goto L_0x03ea
        L_0x03bc:
            r6 = 4
            goto L_0x03eb
        L_0x03be:
            java.lang.String r6 = "A_TRUEHD"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x03c7
            goto L_0x03ea
        L_0x03c7:
            r6 = 3
            goto L_0x03eb
        L_0x03c9:
            java.lang.String r6 = "A_MS/ACM"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x03d2
            goto L_0x03ea
        L_0x03d2:
            r6 = 2
            goto L_0x03eb
        L_0x03d4:
            java.lang.String r6 = "V_MPEG4/ISO/SP"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x03dd
            goto L_0x03ea
        L_0x03dd:
            r6 = 1
            goto L_0x03eb
        L_0x03df:
            java.lang.String r6 = "V_MPEG4/ISO/AP"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L_0x03e8
            goto L_0x03ea
        L_0x03e8:
            r6 = 0
            goto L_0x03eb
        L_0x03ea:
            r6 = -1
        L_0x03eb:
            java.lang.String r10 = "audio/x-unknown"
            switch(r6) {
                case 0: goto L_0x0640;
                case 1: goto L_0x0640;
                case 2: goto L_0x05ee;
                case 3: goto L_0x05eb;
                case 4: goto L_0x056b;
                case 5: goto L_0x0564;
                case 6: goto L_0x0561;
                case 7: goto L_0x04e0;
                case 8: goto L_0x04c2;
                case 9: goto L_0x0640;
                case 10: goto L_0x04aa;
                case 11: goto L_0x04a0;
                case 12: goto L_0x049c;
                case 13: goto L_0x0492;
                case 14: goto L_0x048e;
                case 15: goto L_0x048a;
                case 16: goto L_0x0485;
                case 17: goto L_0x0480;
                case 18: goto L_0x047c;
                case 19: goto L_0x0477;
                case 20: goto L_0x048a;
                case 21: goto L_0x0468;
                case 22: goto L_0x0453;
                case 23: goto L_0x044f;
                case 24: goto L_0x044a;
                case 25: goto L_0x0446;
                case 26: goto L_0x043c;
                case 27: goto L_0x03f8;
                default: goto L_0x03f0;
            }
        L_0x03f0:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Unrecognized codec identifier."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03f8:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
            byte[] r4 = r3.f10911h
            r2.add(r4)
            r4 = 8
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r5 = r5.order(r6)
            long r8 = r3.f10897J
            java.nio.ByteBuffer r5 = r5.putLong(r8)
            byte[] r5 = r5.array()
            r2.add(r5)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r4 = r4.order(r5)
            long r5 = r3.f10898K
            java.nio.ByteBuffer r4 = r4.putLong(r5)
            byte[] r4 = r4.array()
            r2.add(r4)
            java.lang.String r4 = "audio/opus"
            r5 = 5760(0x1680, float:8.071E-42)
            goto L_0x05c5
        L_0x043c:
            byte[] r2 = r3.f10911h
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r4 = "audio/flac"
            goto L_0x0636
        L_0x0446:
            java.lang.String r10 = "audio/eac3"
            goto L_0x0633
        L_0x044a:
            java.lang.String r10 = "video/mpeg2"
            goto L_0x0633
        L_0x044f:
            java.lang.String r10 = "application/x-subrip"
            goto L_0x0633
        L_0x0453:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            byte[] r4 = r3.f10911h
            r2.<init>((byte[]) r4)
            com.fyber.inneractive.sdk.player.exoplayer2.video.c r2 = com.fyber.inneractive.sdk.player.exoplayer2.video.C3420c.m8632a(r2)
            java.util.List<byte[]> r4 = r2.f12219a
            int r2 = r2.f12220b
            r3.f10903P = r2
            java.lang.String r2 = "video/hevc"
            goto L_0x04be
        L_0x0468:
            int r2 = r3.f10895H
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8587a((int) r2)
            if (r2 != 0) goto L_0x0472
            goto L_0x0633
        L_0x0472:
            java.lang.String r4 = "audio/raw"
        L_0x0474:
            r5 = 0
            goto L_0x064f
        L_0x0477:
            java.lang.String r10 = "video/x-unknown"
            goto L_0x0633
        L_0x047c:
            java.lang.String r10 = "application/pgs"
            goto L_0x0633
        L_0x0480:
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            goto L_0x0633
        L_0x0485:
            java.lang.String r10 = "video/x-vnd.on2.vp8"
            goto L_0x0633
        L_0x048a:
            java.lang.String r10 = "audio/vnd.dts"
            goto L_0x0633
        L_0x048e:
            java.lang.String r10 = "audio/ac3"
            goto L_0x0633
        L_0x0492:
            byte[] r2 = r3.f10911h
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r4 = "audio/mp4a-latm"
            goto L_0x0636
        L_0x049c:
            java.lang.String r10 = "audio/vnd.dts.hd"
            goto L_0x0633
        L_0x04a0:
            byte[] r2 = r3.f10911h
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r4 = "application/vobsub"
            goto L_0x0636
        L_0x04aa:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            byte[] r4 = r3.f10911h
            r2.<init>((byte[]) r4)
            com.fyber.inneractive.sdk.player.exoplayer2.video.a r2 = com.fyber.inneractive.sdk.player.exoplayer2.video.C3417a.m8631b(r2)
            java.util.List<byte[]> r4 = r2.f12209a
            int r2 = r2.f12210b
            r3.f10903P = r2
            java.lang.String r2 = "video/avc"
        L_0x04be:
            r5 = r4
            r4 = r2
            goto L_0x064e
        L_0x04c2:
            byte[] r2 = new byte[r8]
            byte[] r6 = r3.f10911h
            byte r8 = r6[r4]
            r2[r4] = r8
            byte r4 = r6[r5]
            r2[r5] = r4
            r4 = 2
            byte r5 = r6[r4]
            r2[r4] = r5
            r4 = 3
            byte r5 = r6[r4]
            r2[r4] = r5
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r4 = "application/dvbsubs"
            goto L_0x0636
        L_0x04e0:
            byte[] r2 = r3.f10911h
            int r4 = r2.length
            if (r15 > r4) goto L_0x04e7
            r4 = 1
            goto L_0x04e8
        L_0x04e7:
            r4 = 0
        L_0x04e8:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8505a((boolean) r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            r4 = 17
            byte r5 = r2[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            long r5 = (long) r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            r9 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r9
            r12 = 18
            byte r4 = r2[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            long r14 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            long r14 = r14 & r9
            r4 = 8
            long r14 = r14 << r4
            long r4 = r14 | r5
            r6 = 19
            byte r12 = r2[r12]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            long r14 = (long) r12     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            long r14 = r14 & r9
            r12 = 16
            long r12 = r14 << r12
            long r4 = r4 | r12
            byte r6 = r2[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            long r12 = (long) r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            long r9 = r9 & r12
            r6 = 24
            long r9 = r9 << r6
            long r4 = r4 | r9
            r9 = 826496599(0x31435657, double:4.08343576E-315)
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x051a
            r2 = 0
            goto L_0x0542
        L_0x051a:
            r4 = 40
        L_0x051c:
            int r5 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            int r5 = r5 - r8
            if (r4 >= r5) goto L_0x0551
            byte r5 = r2[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            if (r5 != 0) goto L_0x054e
            int r5 = r4 + 1
            byte r5 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            if (r5 != 0) goto L_0x054e
            int r5 = r4 + 2
            byte r5 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            r6 = 1
            if (r5 != r6) goto L_0x054e
            int r5 = r4 + 3
            byte r5 = r2[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            r6 = 15
            if (r5 != r6) goto L_0x054e
            int r5 = r2.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r4, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            java.util.List r2 = java.util.Collections.singletonList(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
        L_0x0542:
            if (r2 == 0) goto L_0x0549
            java.lang.String r4 = "video/wvc1"
            goto L_0x0635
        L_0x0549:
            java.lang.String r4 = "video/x-unknown"
            goto L_0x0635
        L_0x054e:
            int r4 = r4 + 1
            goto L_0x051c
        L_0x0551:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            java.lang.String r2 = "Failed to find FourCC VC1 initialization data"
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0559 }
        L_0x0559:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Error parsing FourCC VC1 codec private"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0561:
            java.lang.String r2 = "audio/mpeg"
            goto L_0x0566
        L_0x0564:
            java.lang.String r2 = "audio/mpeg-L2"
        L_0x0566:
            r4 = r2
            r2 = 0
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x05c5
        L_0x056b:
            byte[] r4 = r3.f10911h
            r5 = 0
            byte r5 = r4[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r6 = 2
            if (r5 != r6) goto L_0x05df
            r5 = 0
            r6 = 1
        L_0x0575:
            byte r8 = r4[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r9 = -1
            if (r8 != r9) goto L_0x057f
            int r5 = r5 + 255
            int r6 = r6 + 1
            goto L_0x0575
        L_0x057f:
            int r6 = r6 + 1
            int r5 = r5 + r8
            r8 = 0
        L_0x0583:
            byte r9 = r4[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r10 = -1
            if (r9 != r10) goto L_0x058d
            int r8 = r8 + 255
            int r6 = r6 + 1
            goto L_0x0583
        L_0x058d:
            r10 = 1
            int r6 = r6 + r10
            int r8 = r8 + r9
            byte r9 = r4[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            if (r9 != r10) goto L_0x05d9
            byte[] r9 = new byte[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r10 = 0
            java.lang.System.arraycopy(r4, r6, r9, r10, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            int r6 = r6 + r5
            byte r5 = r4[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r10 = 3
            if (r5 != r10) goto L_0x05d3
            int r6 = r6 + r8
            byte r5 = r4[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r8 = 5
            if (r5 != r8) goto L_0x05cd
            int r5 = r4.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            int r5 = r5 - r6
            byte[] r5 = new byte[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            int r8 = r4.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            int r8 = r8 - r6
            r10 = 0
            java.lang.System.arraycopy(r4, r6, r5, r10, r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r6 = 2
            r4.<init>(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r4.add(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r4.add(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            java.lang.String r2 = "audio/vorbis"
            r5 = 8192(0x2000, float:1.14794E-41)
            r27 = r4
            r4 = r2
            r2 = r27
        L_0x05c5:
            r6 = -1
            r13 = r4
            r16 = r5
            r19 = -1
            goto L_0x0656
        L_0x05cd:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
        L_0x05d3:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
        L_0x05d9:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
        L_0x05df:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            r1.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
            throw r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05e5 }
        L_0x05e5:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05eb:
            java.lang.String r10 = "audio/true-hd"
            goto L_0x0633
        L_0x05ee:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            byte[] r4 = r3.f10911h
            r2.<init>((byte[]) r4)
            int r4 = r2.mo14553h()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0638 }
            r5 = 1
            if (r4 != r5) goto L_0x05fd
            goto L_0x0621
        L_0x05fd:
            r5 = 65534(0xfffe, float:9.1833E-41)
            if (r4 != r5) goto L_0x0623
            r4 = 24
            r2.mo14549e(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0638 }
            long r4 = r2.mo14554i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0638 }
            java.util.UUID r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.f10835b0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0638 }
            long r8 = r6.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0638 }
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x0623
            long r4 = r2.mo14554i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0638 }
            long r8 = r6.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0638 }
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0623
        L_0x0621:
            r2 = 1
            goto L_0x0624
        L_0x0623:
            r2 = 0
        L_0x0624:
            if (r2 == 0) goto L_0x0633
            int r2 = r3.f10895H
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8587a((int) r2)
            if (r2 != 0) goto L_0x062f
            goto L_0x0633
        L_0x062f:
            java.lang.String r4 = "audio/raw"
            goto L_0x0474
        L_0x0633:
            r2 = 0
            r4 = r10
        L_0x0635:
            r5 = -1
        L_0x0636:
            r5 = r2
            goto L_0x064e
        L_0x0638:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Error parsing MS/ACM codec private"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0640:
            byte[] r2 = r3.f10911h
            if (r2 != 0) goto L_0x0646
            r2 = 0
            goto L_0x064a
        L_0x0646:
            java.util.List r2 = java.util.Collections.singletonList(r2)
        L_0x064a:
            java.lang.String r4 = "video/mp4v-es"
            goto L_0x0636
        L_0x064e:
            r2 = -1
        L_0x064f:
            r6 = -1
            r19 = r2
            r13 = r4
            r2 = r5
            r16 = -1
        L_0x0656:
            boolean r4 = r3.f10900M
            r4 = r4 | 0
            boolean r5 = r3.f10899L
            if (r5 == 0) goto L_0x0660
            r5 = 2
            goto L_0x0661
        L_0x0660:
            r5 = 0
        L_0x0661:
            r4 = r4 | r5
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8521d(r13)
            if (r5 == 0) goto L_0x0689
            java.lang.String r12 = java.lang.Integer.toString(r11)
            int r5 = r3.f10894G
            int r6 = r3.f10896I
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r8 = r3.f10912i
            java.lang.String r9 = r3.f10901N
            r14 = 0
            r15 = -1
            r17 = r5
            r18 = r6
            r20 = r2
            r21 = r8
            r22 = r4
            r23 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8178a((java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (java.util.List<byte[]>) r20, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r21, (int) r22, (java.lang.String) r23)
            r4 = 1
            goto L_0x080d
        L_0x0689:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8522e(r13)
            if (r5 == 0) goto L_0x07ba
            int r4 = r3.f10917n
            if (r4 != 0) goto L_0x06a5
            int r4 = r3.f10915l
            r5 = -1
            if (r4 != r5) goto L_0x069a
            int r4 = r3.f10913j
        L_0x069a:
            r3.f10915l = r4
            int r4 = r3.f10916m
            if (r4 != r5) goto L_0x06a2
            int r4 = r3.f10914k
        L_0x06a2:
            r3.f10916m = r4
            goto L_0x06a6
        L_0x06a5:
            r5 = -1
        L_0x06a6:
            int r4 = r3.f10915l
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r4 == r5) goto L_0x06be
            int r8 = r3.f10916m
            if (r8 == r5) goto L_0x06be
            int r5 = r3.f10914k
            int r5 = r5 * r4
            float r4 = (float) r5
            int r5 = r3.f10913j
            int r5 = r5 * r8
            float r5 = (float) r5
            float r4 = r4 / r5
            r22 = r4
            goto L_0x06c2
        L_0x06be:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x06c2:
            boolean r4 = r3.f10920q
            if (r4 == 0) goto L_0x0791
            float r4 = r3.f10926w
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10927x
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10928y
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10929z
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10888A
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10889B
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10890C
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10891D
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10892E
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0782
            float r4 = r3.f10893F
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0704
            goto L_0x0782
        L_0x0704:
            r4 = 25
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r4)
            r6 = 0
            r5.put(r6)
            float r6 = r3.f10926w
            r8 = 1195593728(0x47435000, float:50000.0)
            float r6 = r6 * r8
            r9 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10927x
            float r6 = r6 * r8
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10928y
            float r6 = r6 * r8
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10929z
            float r6 = r6 * r8
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10888A
            float r6 = r6 * r8
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10889B
            float r6 = r6 * r8
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10890C
            float r6 = r6 * r8
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10891D
            float r6 = r6 * r8
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10892E
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            float r6 = r3.f10893F
            float r6 = r6 + r9
            int r6 = (int) r6
            short r6 = (short) r6
            r5.putShort(r6)
            int r6 = r3.f10924u
            short r6 = (short) r6
            r5.putShort(r6)
            int r6 = r3.f10925v
            short r6 = (short) r6
            r5.putShort(r6)
            goto L_0x0783
        L_0x0782:
            r4 = 0
        L_0x0783:
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.video.b
            int r6 = r3.f10921r
            int r8 = r3.f10923t
            int r9 = r3.f10922s
            r5.<init>(r6, r8, r9, r4)
            r25 = r5
            goto L_0x0794
        L_0x0791:
            r4 = 0
            r25 = r4
        L_0x0794:
            java.lang.String r12 = java.lang.Integer.toString(r11)
            int r4 = r3.f10913j
            int r5 = r3.f10914k
            byte[] r6 = r3.f10918o
            int r8 = r3.f10919p
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r9 = r3.f10912i
            r14 = 0
            r15 = -1
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            r21 = -1
            r17 = r4
            r18 = r5
            r20 = r2
            r23 = r6
            r24 = r8
            r26 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8176a((java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (int) r15, (int) r16, (int) r17, (int) r18, (float) r19, (java.util.List<byte[]>) r20, (int) r21, (float) r22, (byte[]) r23, (int) r24, (com.fyber.inneractive.sdk.player.exoplayer2.video.C3418b) r25, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r26)
            r4 = 2
            goto L_0x080d
        L_0x07ba:
            java.lang.String r5 = "application/x-subrip"
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L_0x07d7
            java.lang.String r12 = java.lang.Integer.toString(r11)
            java.lang.String r2 = r3.f10901N
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r3.f10912i
            r14 = 0
            r15 = -1
            r16 = r4
            r17 = r2
            r18 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8180a((java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (int) r15, (int) r16, (java.lang.String) r17, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r18)
            goto L_0x080c
        L_0x07d7:
            java.lang.String r4 = "application/vobsub"
            boolean r4 = r4.equals(r13)
            if (r4 != 0) goto L_0x07f8
            java.lang.String r4 = "application/pgs"
            boolean r4 = r4.equals(r13)
            if (r4 != 0) goto L_0x07f8
            java.lang.String r4 = "application/dvbsubs"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x07f0
            goto L_0x07f8
        L_0x07f0:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Unexpected MIME type."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x07f8:
            java.lang.String r12 = java.lang.Integer.toString(r11)
            java.lang.String r4 = r3.f10901N
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r3.f10912i
            r14 = 0
            r15 = -1
            r16 = r2
            r17 = r4
            r18 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8182a((java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (int) r15, (java.util.List<byte[]>) r16, (java.lang.String) r17, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r18)
        L_0x080c:
            r4 = 3
        L_0x080d:
            int r5 = r3.f10905b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r4 = r7.mo14122a(r5, r4)
            r3.f10902O = r4
            r4.mo14098a(r2)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c> r2 = r1.f10863c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r3 = r1.f10880t
            int r4 = r3.f10905b
            r2.put(r4, r3)
            r12 = 0
        L_0x0822:
            r1.f10880t = r12
            goto L_0x0847
        L_0x0825:
            int r2 = r1.f10840E
            r3 = 2
            if (r2 == r3) goto L_0x082b
            goto L_0x0847
        L_0x082b:
            boolean r2 = r1.f10859X
            if (r2 != 0) goto L_0x0835
            int r2 = r1.f10848M
            r2 = r2 | 1
            r1.f10848M = r2
        L_0x0835:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c> r2 = r1.f10863c
            int r3 = r1.f10846K
            java.lang.Object r2 = r2.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3133c) r2
            long r3 = r1.f10841F
            r1.mo14197a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3133c) r2, (long) r3)
            r2 = 0
            r1.f10840E = r2
        L_0x0847:
            r1 = 1
            return r1
        L_0x0849:
            r3 = 0
            r4 = 1
            int r5 = r0.f10828e
            if (r5 != 0) goto L_0x089c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f r5 = r0.f10826c
            long r4 = r5.mo14205a(r1, r4, r3, r8)
            r9 = -2
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x088e
            r9 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r9 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r9
            r9.f10550e = r3
        L_0x0860:
            byte[] r4 = r0.f10824a
            r9.mo14085a(r4, r3, r8, r3)
            byte[] r4 = r0.f10824a
            byte r4 = r4[r3]
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3135f.m7878a(r4)
            r5 = -1
            if (r4 == r5) goto L_0x0888
            if (r4 > r8) goto L_0x0888
            byte[] r5 = r0.f10824a
            long r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3135f.m7879a(r5, r4, r3)
            int r3 = (int) r10
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r5 = r0.f10827d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3132b) r5
            boolean r5 = r5.mo14203a(r3)
            if (r5 == 0) goto L_0x0888
            r9.mo14088c(r4)
            long r4 = (long) r3
            goto L_0x088e
        L_0x0888:
            r3 = 1
            r9.mo14088c(r3)
            r3 = 0
            goto L_0x0860
        L_0x088e:
            r3 = 1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0895
            r1 = 0
            return r1
        L_0x0895:
            r6 = 0
            int r5 = (int) r4
            r0.f10829f = r5
            r0.f10828e = r3
            goto L_0x089e
        L_0x089c:
            r3 = 1
            r6 = 0
        L_0x089e:
            int r4 = r0.f10828e
            if (r4 != r3) goto L_0x08af
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f r4 = r0.f10826c
            r5 = 8
            long r3 = r4.mo14205a(r1, r6, r3, r5)
            r0.f10830g = r3
            r3 = 2
            r0.f10828e = r3
        L_0x08af:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r3 = r0.f10827d
            int r4 = r0.f10829f
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3132b) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.this
            r3.getClass()
            switch(r4) {
                case 131: goto L_0x08c7;
                case 134: goto L_0x08c5;
                case 136: goto L_0x08c7;
                case 155: goto L_0x08c7;
                case 159: goto L_0x08c7;
                case 160: goto L_0x08c3;
                case 161: goto L_0x08c1;
                case 163: goto L_0x08c1;
                case 174: goto L_0x08c3;
                case 176: goto L_0x08c7;
                case 179: goto L_0x08c7;
                case 181: goto L_0x08bf;
                case 183: goto L_0x08c3;
                case 186: goto L_0x08c7;
                case 187: goto L_0x08c3;
                case 215: goto L_0x08c7;
                case 224: goto L_0x08c3;
                case 225: goto L_0x08c3;
                case 231: goto L_0x08c7;
                case 241: goto L_0x08c7;
                case 251: goto L_0x08c7;
                case 16980: goto L_0x08c7;
                case 16981: goto L_0x08c1;
                case 17026: goto L_0x08c5;
                case 17029: goto L_0x08c7;
                case 17143: goto L_0x08c7;
                case 17545: goto L_0x08bf;
                case 18401: goto L_0x08c7;
                case 18402: goto L_0x08c1;
                case 18407: goto L_0x08c3;
                case 18408: goto L_0x08c7;
                case 19899: goto L_0x08c3;
                case 20529: goto L_0x08c7;
                case 20530: goto L_0x08c7;
                case 20532: goto L_0x08c3;
                case 20533: goto L_0x08c3;
                case 21419: goto L_0x08c1;
                case 21420: goto L_0x08c7;
                case 21432: goto L_0x08c7;
                case 21680: goto L_0x08c7;
                case 21682: goto L_0x08c7;
                case 21690: goto L_0x08c7;
                case 21930: goto L_0x08c7;
                case 21936: goto L_0x08c3;
                case 21945: goto L_0x08c7;
                case 21946: goto L_0x08c7;
                case 21947: goto L_0x08c7;
                case 21948: goto L_0x08c7;
                case 21949: goto L_0x08c7;
                case 21968: goto L_0x08c3;
                case 21969: goto L_0x08bf;
                case 21970: goto L_0x08bf;
                case 21971: goto L_0x08bf;
                case 21972: goto L_0x08bf;
                case 21973: goto L_0x08bf;
                case 21974: goto L_0x08bf;
                case 21975: goto L_0x08bf;
                case 21976: goto L_0x08bf;
                case 21977: goto L_0x08bf;
                case 21978: goto L_0x08bf;
                case 22186: goto L_0x08c7;
                case 22203: goto L_0x08c7;
                case 25152: goto L_0x08c3;
                case 25188: goto L_0x08c7;
                case 25506: goto L_0x08c1;
                case 28032: goto L_0x08c3;
                case 30320: goto L_0x08c3;
                case 30322: goto L_0x08c1;
                case 2274716: goto L_0x08c5;
                case 2352003: goto L_0x08c7;
                case 2807729: goto L_0x08c7;
                case 290298740: goto L_0x08c3;
                case 357149030: goto L_0x08c3;
                case 374648427: goto L_0x08c3;
                case 408125543: goto L_0x08c3;
                case 440786851: goto L_0x08c3;
                case 475249515: goto L_0x08c3;
                case 524531317: goto L_0x08c3;
                default: goto L_0x08bd;
            }
        L_0x08bd:
            r3 = 0
            goto L_0x08c8
        L_0x08bf:
            r3 = 5
            goto L_0x08c8
        L_0x08c1:
            r3 = 4
            goto L_0x08c8
        L_0x08c3:
            r3 = 1
            goto L_0x08c8
        L_0x08c5:
            r3 = 3
            goto L_0x08c8
        L_0x08c7:
            r3 = 2
        L_0x08c8:
            if (r3 == 0) goto L_0x09ae
            r2 = 1
            if (r3 == r2) goto L_0x098a
            r2 = 2
            if (r3 == r2) goto L_0x095a
            r2 = 3
            if (r3 == r2) goto L_0x092a
            if (r3 == r8) goto L_0x091a
            r2 = 5
            if (r3 != r2) goto L_0x090e
            long r2 = r0.f10830g
            r4 = 4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x08fc
            r4 = 8
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x08e7
            goto L_0x08fc
        L_0x08e7:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Invalid float size: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            long r3 = r0.f10830g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x08fc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r4 = r0.f10827d
            int r5 = r0.f10829f
            int r3 = (int) r2
            double r1 = r0.mo14187a(r1, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3132b) r4
            r4.mo14198a((int) r5, (double) r1)
            r1 = 0
            r0.f10828e = r1
            goto L_0x0973
        L_0x090e:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Invalid element type "
            java.lang.String r2 = p379.C16759e.m42349e(r2, r3)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x091a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r2 = r0.f10827d
            int r3 = r0.f10829f
            long r4 = r0.f10830g
            int r5 = (int) r4
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3132b) r2
            r2.mo14199a((int) r3, (int) r5, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g) r1)
            r1 = 0
            r0.f10828e = r1
            goto L_0x0973
        L_0x092a:
            long r2 = r0.f10830g
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0945
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r4 = r0.f10827d
            int r5 = r0.f10829f
            int r3 = (int) r2
            java.lang.String r1 = r0.mo14191c(r1, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3132b) r4
            r4.mo14202a((int) r5, (java.lang.String) r1)
            r1 = 0
            r0.f10828e = r1
            goto L_0x0973
        L_0x0945:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "String element size: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            long r3 = r0.f10830g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x095a:
            long r2 = r0.f10830g
            r4 = 8
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0975
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r4 = r0.f10827d
            int r5 = r0.f10829f
            int r3 = (int) r2
            long r1 = r0.mo14190b(r1, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3132b) r4
            r4.mo14200a((int) r5, (long) r1)
            r1 = 0
            r0.f10828e = r1
        L_0x0973:
            r1 = 1
            return r1
        L_0x0975:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Invalid integer size: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            long r3 = r0.f10830g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x098a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r1
            long r4 = r1.f10548c
            long r1 = r0.f10830g
            long r1 = r1 + r4
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a> r3 = r0.f10825b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a r6 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a$a
            int r7 = r0.f10829f
            r6.<init>(r7, r1)
            r3.add(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c r1 = r0.f10827d
            int r3 = r0.f10829f
            long r6 = r0.f10830g
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.C3132b) r2
            r2.mo14201a((int) r3, (long) r4, (long) r6)
            r1 = 0
            r0.f10828e = r1
            r1 = 1
            return r1
        L_0x09ae:
            r3 = 0
            long r4 = r0.f10830g
            int r5 = (int) r4
            r4 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r4
            r4.mo14088c(r5)
            r0.f10828e = r3
            r4 = 0
            r5 = 1
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3126a.mo14189a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: a */
    public final double mo14187a(C3087g gVar, int i) throws IOException, InterruptedException {
        long b = mo14190b(gVar, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) b);
        }
        return Double.longBitsToDouble(b);
    }
}
