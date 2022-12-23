package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i */
public final class C3189i implements C3188h {

    /* renamed from: n */
    public static final double[] f11343n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f11344a;

    /* renamed from: b */
    public C3161n f11345b;

    /* renamed from: c */
    public boolean f11346c;

    /* renamed from: d */
    public long f11347d;

    /* renamed from: e */
    public final boolean[] f11348e = new boolean[4];

    /* renamed from: f */
    public final C3190a f11349f = new C3190a(RecyclerView.C1119a0.FLAG_IGNORE);

    /* renamed from: g */
    public boolean f11350g;

    /* renamed from: h */
    public long f11351h;

    /* renamed from: i */
    public long f11352i;

    /* renamed from: j */
    public boolean f11353j;

    /* renamed from: k */
    public boolean f11354k;

    /* renamed from: l */
    public long f11355l;

    /* renamed from: m */
    public long f11356m;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i$a */
    public static final class C3190a {

        /* renamed from: a */
        public boolean f11357a;

        /* renamed from: b */
        public int f11358b;

        /* renamed from: c */
        public int f11359c;

        /* renamed from: d */
        public byte[] f11360d;

        public C3190a(int i) {
            this.f11360d = new byte[i];
        }

        /* renamed from: a */
        public void mo14254a(byte[] bArr, int i, int i2) {
            if (this.f11357a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f11360d;
                int length = bArr2.length;
                int i4 = this.f11358b + i3;
                if (length < i4) {
                    this.f11360d = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.f11360d, this.f11358b, i3);
                this.f11358b += i3;
            }
        }
    }

    /* renamed from: a */
    public void mo14242a() {
        C3389i.m8526a(this.f11348e);
        C3190a aVar = this.f11349f;
        aVar.f11357a = false;
        aVar.f11358b = 0;
        aVar.f11359c = 0;
        this.f11353j = false;
        this.f11350g = false;
        this.f11351h = 0;
    }

    /* renamed from: b */
    public void mo14246b() {
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        dVar.mo14271a();
        this.f11344a = dVar.mo14272b();
        this.f11345b = hVar.mo14122a(dVar.mo14273c(), 2);
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        boolean z2 = j != -9223372036854775807L;
        this.f11353j = z2;
        if (z2) {
            this.f11352i = j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14245a(com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r1.f12122b
            int r3 = r1.f12123c
            byte[] r4 = r1.f12121a
            long r5 = r0.f11351h
            int r7 = r26.mo14537a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f11351h = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r0.f11345b
            int r6 = r26.mo14537a()
            r5.mo14099a(r1, r6)
            r5 = r2
        L_0x001e:
            boolean[] r6 = r0.f11348e
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.m8524a(r4, r2, r3, r6)
            if (r2 != r3) goto L_0x0030
            boolean r1 = r0.f11346c
            if (r1 != 0) goto L_0x002f
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i$a r1 = r0.f11349f
            r1.mo14254a(r4, r5, r3)
        L_0x002f:
            return
        L_0x0030:
            byte[] r6 = r1.f12121a
            int r7 = r2 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            boolean r8 = r0.f11346c
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L_0x0122
            int r8 = r2 - r5
            if (r8 <= 0) goto L_0x0047
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i$a r11 = r0.f11349f
            r11.mo14254a(r4, r5, r2)
        L_0x0047:
            if (r8 >= 0) goto L_0x004b
            int r5 = -r8
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i$a r8 = r0.f11349f
            boolean r11 = r8.f11357a
            if (r11 == 0) goto L_0x0068
            int r11 = r8.f11359c
            if (r11 != 0) goto L_0x005f
            r11 = 181(0xb5, float:2.54E-43)
            if (r6 != r11) goto L_0x005f
            int r5 = r8.f11358b
            r8.f11359c = r5
            goto L_0x006e
        L_0x005f:
            int r11 = r8.f11358b
            int r11 = r11 - r5
            r8.f11358b = r11
            r8.f11357a = r9
            r5 = 1
            goto L_0x006f
        L_0x0068:
            r5 = 179(0xb3, float:2.51E-43)
            if (r6 != r5) goto L_0x006e
            r8.f11357a = r10
        L_0x006e:
            r5 = 0
        L_0x006f:
            if (r5 == 0) goto L_0x0122
            java.lang.String r11 = r0.f11344a
            byte[] r5 = r8.f11360d
            int r12 = r8.f11358b
            byte[] r5 = java.util.Arrays.copyOf(r5, r12)
            r12 = 4
            byte r13 = r5[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r23 = 5
            byte r14 = r5[r23]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 6
            byte r15 = r5[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r12
            int r16 = r14 >> 4
            r16 = r13 | r16
            r13 = r14 & 15
            int r13 = r13 << 8
            r17 = r13 | r15
            r13 = 1065353216(0x3f800000, float:1.0)
            r24 = 7
            byte r14 = r5[r24]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            int r14 = r14 >> r12
            r15 = 2
            if (r14 == r15) goto L_0x00b6
            r15 = 3
            if (r14 == r15) goto L_0x00b0
            if (r14 == r12) goto L_0x00aa
            r21 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00bf
        L_0x00aa:
            int r12 = r17 * 121
            float r12 = (float) r12
            int r13 = r16 * 100
            goto L_0x00bb
        L_0x00b0:
            int r12 = r17 * 16
            float r12 = (float) r12
            int r13 = r16 * 9
            goto L_0x00bb
        L_0x00b6:
            int r12 = r17 * 4
            float r12 = (float) r12
            int r13 = r16 * 3
        L_0x00bb:
            float r13 = (float) r13
            float r12 = r12 / r13
            r21 = r12
        L_0x00bf:
            java.util.List r19 = java.util.Collections.singletonList(r5)
            r13 = 0
            r14 = -1
            r15 = -1
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            r20 = -1
            r22 = 0
            java.lang.String r12 = "video/mpeg2"
            com.fyber.inneractive.sdk.player.exoplayer2.i r11 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8175a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14, (int) r15, (int) r16, (int) r17, (float) r18, (java.util.List<byte[]>) r19, (int) r20, (float) r21, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r22)
            byte r14 = r5[r24]
            r14 = r14 & 15
            int r14 = r14 - r10
            if (r14 < 0) goto L_0x0102
            double[] r15 = f11343n
            int r12 = r15.length
            if (r14 >= r12) goto L_0x0102
            r12 = r15[r14]
            int r8 = r8.f11359c
            int r8 = r8 + 9
            byte r5 = r5[r8]
            r8 = r5 & 96
            int r8 = r8 >> 5
            r5 = r5 & 31
            if (r8 == r5) goto L_0x00fa
            double r14 = (double) r8
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 + r16
            int r5 = r5 + 1
            double r9 = (double) r5
            double r14 = r14 / r9
            double r12 = r12 * r14
        L_0x00fa:
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r9 = r9 / r12
            long r12 = (long) r9
            goto L_0x0104
        L_0x0102:
            r12 = 0
        L_0x0104:
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            android.util.Pair r5 = android.util.Pair.create(r11, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f11345b
            java.lang.Object r10 = r5.first
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r10
            r9.mo14098a(r10)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r9 = r5.longValue()
            r0.f11347d = r9
            r5 = 1
            r0.f11346c = r5
        L_0x0122:
            boolean r5 = r0.f11346c
            if (r5 == 0) goto L_0x0171
            r5 = 184(0xb8, float:2.58E-43)
            if (r6 == r5) goto L_0x012c
            if (r6 != 0) goto L_0x0171
        L_0x012c:
            int r15 = r3 - r2
            boolean r9 = r0.f11350g
            if (r9 == 0) goto L_0x014d
            boolean r12 = r0.f11354k
            long r9 = r0.f11351h
            long r13 = r0.f11355l
            long r9 = r9 - r13
            int r10 = (int) r9
            int r13 = r10 - r15
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f11345b
            long r10 = r0.f11356m
            r16 = 0
            r14 = r15
            r8 = r15
            r15 = r16
            r9.mo14096a(r10, r12, r13, r14, r15)
            r9 = 0
            r0.f11354k = r9
            goto L_0x014f
        L_0x014d:
            r8 = r15
            r9 = 0
        L_0x014f:
            if (r6 != r5) goto L_0x0157
            r0.f11350g = r9
            r5 = 1
            r0.f11354k = r5
            goto L_0x0171
        L_0x0157:
            boolean r6 = r0.f11353j
            if (r6 == 0) goto L_0x015e
            long r9 = r0.f11352i
            goto L_0x0163
        L_0x015e:
            long r9 = r0.f11356m
            long r11 = r0.f11347d
            long r9 = r9 + r11
        L_0x0163:
            r0.f11356m = r9
            long r9 = r0.f11351h
            long r11 = (long) r8
            long r9 = r9 - r11
            r0.f11355l = r9
            r5 = 0
            r0.f11353j = r5
            r5 = 1
            r0.f11350g = r5
        L_0x0171:
            r5 = r2
            r2 = r7
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3189i.mo14245a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }
}
