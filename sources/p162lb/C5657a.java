package p162lb;

import java.util.zip.Inflater;
import p126ib.C5334b;
import p277ub.C6803r;

/* renamed from: lb.a */
public final class C5657a extends C5334b {

    /* renamed from: m */
    public final C6803r f18417m = new C6803r();

    /* renamed from: n */
    public final C6803r f18418n = new C6803r();

    /* renamed from: o */
    public final C5658a f18419o = new C5658a();

    /* renamed from: p */
    public Inflater f18420p;

    /* renamed from: lb.a$a */
    public static final class C5658a {

        /* renamed from: a */
        public final C6803r f18421a = new C6803r();

        /* renamed from: b */
        public final int[] f18422b = new int[256];

        /* renamed from: c */
        public boolean f18423c;

        /* renamed from: d */
        public int f18424d;

        /* renamed from: e */
        public int f18425e;

        /* renamed from: f */
        public int f18426f;

        /* renamed from: g */
        public int f18427g;

        /* renamed from: h */
        public int f18428h;

        /* renamed from: i */
        public int f18429i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0186, code lost:
        r2 = 0;
        r11 = null;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p126ib.C5336d mo21119g(byte[] r22, int r23, boolean r24) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            r21 = this;
            r0 = r21
            ub.r r1 = r0.f18417m
            r2 = r22
            r3 = r23
            r1.mo23005x(r3, r2)
            ub.r r1 = r0.f18417m
            int r2 = r1.f21040c
            int r3 = r1.f21039b
            int r2 = r2 - r3
            r4 = 255(0xff, float:3.57E-43)
            if (r2 <= 0) goto L_0x003d
            byte[] r2 = r1.f21038a
            byte r2 = r2[r3]
            r2 = r2 & r4
            r3 = 120(0x78, float:1.68E-43)
            if (r2 != r3) goto L_0x003d
            java.util.zip.Inflater r2 = r0.f18420p
            if (r2 != 0) goto L_0x002a
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>()
            r0.f18420p = r2
        L_0x002a:
            ub.r r2 = r0.f18418n
            java.util.zip.Inflater r3 = r0.f18420p
            boolean r2 = p277ub.C6774a0.m15962v(r1, r2, r3)
            if (r2 == 0) goto L_0x003d
            ub.r r2 = r0.f18418n
            byte[] r3 = r2.f21038a
            int r2 = r2.f21040c
            r1.mo23005x(r2, r3)
        L_0x003d:
            lb.a$a r1 = r0.f18419o
            r2 = 0
            r1.f18424d = r2
            r1.f18425e = r2
            r1.f18426f = r2
            r1.f18427g = r2
            r1.f18428h = r2
            r1.f18429i = r2
            ub.r r3 = r1.f18421a
            r3.mo23004w(r2)
            r1.f18423c = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0058:
            ub.r r3 = r0.f18417m
            int r5 = r3.f21040c
            int r6 = r3.f21039b
            int r6 = r5 - r6
            r7 = 3
            if (r6 < r7) goto L_0x0259
            lb.a$a r6 = r0.f18419o
            int r8 = r3.mo22997p()
            int r9 = r3.mo23002u()
            int r10 = r3.f21039b
            int r10 = r10 + r9
            if (r10 <= r5) goto L_0x007a
            r3.mo23007z(r5)
            r5 = 255(0xff, float:3.57E-43)
            r11 = 0
            goto L_0x0250
        L_0x007a:
            r5 = 128(0x80, float:1.794E-43)
            if (r8 == r5) goto L_0x018a
            switch(r8) {
                case 20: goto L_0x0101;
                case 21: goto L_0x00ac;
                case 22: goto L_0x0086;
                default: goto L_0x0081;
            }
        L_0x0081:
            r8 = r3
            r5 = 255(0xff, float:3.57E-43)
            goto L_0x0186
        L_0x0086:
            r6.getClass()
            r5 = 19
            if (r9 >= r5) goto L_0x008e
            goto L_0x0081
        L_0x008e:
            int r5 = r3.mo23002u()
            r6.f18424d = r5
            int r5 = r3.mo23002u()
            r6.f18425e = r5
            r5 = 11
            r3.mo22981A(r5)
            int r5 = r3.mo23002u()
            r6.f18426f = r5
            int r5 = r3.mo23002u()
            r6.f18427g = r5
            goto L_0x0081
        L_0x00ac:
            r6.getClass()
            r8 = 4
            if (r9 >= r8) goto L_0x00b3
            goto L_0x0081
        L_0x00b3:
            r3.mo22981A(r7)
            int r7 = r3.mo22997p()
            r5 = r5 & r7
            if (r5 == 0) goto L_0x00bf
            r12 = 1
            goto L_0x00c0
        L_0x00bf:
            r12 = 0
        L_0x00c0:
            int r9 = r9 + -4
            if (r12 == 0) goto L_0x00e4
            r5 = 7
            if (r9 >= r5) goto L_0x00c8
            goto L_0x0081
        L_0x00c8:
            int r5 = r3.mo22999r()
            if (r5 >= r8) goto L_0x00cf
            goto L_0x0081
        L_0x00cf:
            int r7 = r3.mo23002u()
            r6.f18428h = r7
            int r7 = r3.mo23002u()
            r6.f18429i = r7
            ub.r r7 = r6.f18421a
            int r5 = r5 + -4
            r7.mo23004w(r5)
            int r9 = r9 + -7
        L_0x00e4:
            ub.r r5 = r6.f18421a
            int r7 = r5.f21039b
            int r5 = r5.f21040c
            if (r7 >= r5) goto L_0x0081
            if (r9 <= 0) goto L_0x0081
            int r5 = r5 - r7
            int r5 = java.lang.Math.min(r9, r5)
            ub.r r8 = r6.f18421a
            byte[] r8 = r8.f21038a
            r3.mo22983b(r7, r5, r8)
            ub.r r6 = r6.f18421a
            int r7 = r7 + r5
            r6.mo23007z(r7)
            goto L_0x0081
        L_0x0101:
            r6.getClass()
            int r5 = r9 % 5
            r7 = 2
            if (r5 == r7) goto L_0x010b
            goto L_0x0081
        L_0x010b:
            r3.mo22981A(r7)
            int[] r5 = r6.f18422b
            java.util.Arrays.fill(r5, r2)
            int r9 = r9 / 5
            r5 = 0
        L_0x0116:
            if (r5 >= r9) goto L_0x0180
            int r7 = r3.mo22997p()
            int r8 = r3.mo22997p()
            int r13 = r3.mo22997p()
            int r14 = r3.mo22997p()
            int r15 = r3.mo22997p()
            double r11 = (double) r8
            r16 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r13 = r13 + -128
            r8 = r3
            double r2 = (double) r13
            double r16 = r16 * r2
            r18 = r5
            double r4 = r16 + r11
            int r4 = (int) r4
            r16 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r14 = r14 + -128
            double r13 = (double) r14
            double r16 = r16 * r13
            double r16 = r11 - r16
            r19 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r2 = r2 * r19
            double r2 = r16 - r2
            int r2 = (int) r2
            r16 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r13 = r13 * r16
            double r13 = r13 + r11
            int r3 = (int) r13
            int[] r11 = r6.f18422b
            int r12 = r15 << 24
            r5 = 255(0xff, float:3.57E-43)
            r13 = 0
            int r4 = p277ub.C6774a0.m15947g(r4, r13, r5)
            int r4 = r4 << 16
            r4 = r4 | r12
            int r2 = p277ub.C6774a0.m15947g(r2, r13, r5)
            int r2 = r2 << 8
            r2 = r2 | r4
            int r3 = p277ub.C6774a0.m15947g(r3, r13, r5)
            r2 = r2 | r3
            r11[r7] = r2
            int r2 = r18 + 1
            r5 = r2
            r3 = r8
            r2 = 0
            r4 = 255(0xff, float:3.57E-43)
            goto L_0x0116
        L_0x0180:
            r8 = r3
            r2 = 1
            r5 = 255(0xff, float:3.57E-43)
            r6.f18423c = r2
        L_0x0186:
            r2 = 0
            r11 = 0
            goto L_0x024d
        L_0x018a:
            r8 = r3
            r5 = 255(0xff, float:3.57E-43)
            int r2 = r6.f18424d
            if (r2 == 0) goto L_0x0238
            int r2 = r6.f18425e
            if (r2 == 0) goto L_0x0238
            int r2 = r6.f18428h
            if (r2 == 0) goto L_0x0238
            int r2 = r6.f18429i
            if (r2 == 0) goto L_0x0238
            ub.r r2 = r6.f18421a
            int r3 = r2.f21040c
            if (r3 == 0) goto L_0x0238
            int r4 = r2.f21039b
            if (r4 != r3) goto L_0x0238
            boolean r3 = r6.f18423c
            if (r3 != 0) goto L_0x01ad
            goto L_0x0238
        L_0x01ad:
            r3 = 0
            r2.mo23007z(r3)
            int r2 = r6.f18428h
            int r3 = r6.f18429i
            int r2 = r2 * r3
            int[] r3 = new int[r2]
            r4 = 0
        L_0x01ba:
            if (r4 >= r2) goto L_0x01fd
            ub.r r7 = r6.f18421a
            int r7 = r7.mo22997p()
            if (r7 == 0) goto L_0x01ce
            int r9 = r4 + 1
            int[] r11 = r6.f18422b
            r7 = r11[r7]
            r3[r4] = r7
        L_0x01cc:
            r4 = r9
            goto L_0x01ba
        L_0x01ce:
            ub.r r7 = r6.f18421a
            int r7 = r7.mo22997p()
            if (r7 == 0) goto L_0x01ba
            r9 = r7 & 64
            if (r9 != 0) goto L_0x01dd
            r9 = r7 & 63
            goto L_0x01e8
        L_0x01dd:
            r9 = r7 & 63
            int r9 = r9 << 8
            ub.r r11 = r6.f18421a
            int r11 = r11.mo22997p()
            r9 = r9 | r11
        L_0x01e8:
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x01ee
            r7 = 0
            goto L_0x01f8
        L_0x01ee:
            int[] r7 = r6.f18422b
            ub.r r11 = r6.f18421a
            int r11 = r11.mo22997p()
            r7 = r7[r11]
        L_0x01f8:
            int r9 = r9 + r4
            java.util.Arrays.fill(r3, r4, r9, r7)
            goto L_0x01cc
        L_0x01fd:
            int r2 = r6.f18428h
            int r4 = r6.f18429i
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r3, r2, r4, r7)
            ib.a$a r3 = new ib.a$a
            r3.<init>()
            r3.f17607b = r2
            int r2 = r6.f18426f
            float r2 = (float) r2
            int r4 = r6.f18424d
            float r4 = (float) r4
            float r2 = r2 / r4
            r3.f17613h = r2
            r2 = 0
            r3.f17614i = r2
            int r7 = r6.f18427g
            float r7 = (float) r7
            int r9 = r6.f18425e
            float r9 = (float) r9
            float r7 = r7 / r9
            r3.f17610e = r7
            r3.f17611f = r2
            r3.f17612g = r2
            int r2 = r6.f18428h
            float r2 = (float) r2
            float r2 = r2 / r4
            r3.f17617l = r2
            int r2 = r6.f18429i
            float r2 = (float) r2
            float r2 = r2 / r9
            r3.f17618m = r2
            ib.a r11 = r3.mo21116a()
            goto L_0x0239
        L_0x0238:
            r11 = 0
        L_0x0239:
            r2 = 0
            r6.f18424d = r2
            r6.f18425e = r2
            r6.f18426f = r2
            r6.f18427g = r2
            r6.f18428h = r2
            r6.f18429i = r2
            ub.r r3 = r6.f18421a
            r3.mo23004w(r2)
            r6.f18423c = r2
        L_0x024d:
            r8.mo23007z(r10)
        L_0x0250:
            if (r11 == 0) goto L_0x0255
            r1.add(r11)
        L_0x0255:
            r4 = 255(0xff, float:3.57E-43)
            goto L_0x0058
        L_0x0259:
            lb.b r2 = new lb.b
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p162lb.C5657a.mo21119g(byte[], int, boolean):ib.d");
    }
}
