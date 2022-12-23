package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p */
public final class C3201p implements C3080f {

    /* renamed from: a */
    public final C3403r f11471a;

    /* renamed from: b */
    public final SparseArray<C3202a> f11472b = new SparseArray<>();

    /* renamed from: c */
    public final C3393k f11473c = new C3393k(4096);

    /* renamed from: d */
    public boolean f11474d;

    /* renamed from: e */
    public boolean f11475e;

    /* renamed from: f */
    public boolean f11476f;

    /* renamed from: g */
    public C3088h f11477g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a */
    public static final class C3202a {

        /* renamed from: a */
        public final C3188h f11478a;

        /* renamed from: b */
        public final C3403r f11479b;

        /* renamed from: c */
        public final C3392j f11480c = new C3392j(new byte[64]);

        /* renamed from: d */
        public boolean f11481d;

        /* renamed from: e */
        public boolean f11482e;

        /* renamed from: f */
        public boolean f11483f;

        /* renamed from: g */
        public long f11484g;

        public C3202a(C3188h hVar, C3403r rVar) {
            this.f11478a = hVar;
            this.f11479b = rVar;
        }
    }

    public C3201p(C3403r rVar) {
        this.f11471a = rVar;
    }

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        C3072b bVar = (C3072b) gVar;
        bVar.mo14085a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bVar.mo14084a(bArr[13] & 7, false);
        bVar.mo14085a(bArr, 0, 3, false);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f11477g = hVar;
        hVar.mo14123a(new C3124m.C3125a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        this.f11471a.f12147c = -9223372036854775807L;
        for (int i = 0; i < this.f11472b.size(); i++) {
            C3202a valueAt = this.f11472b.valueAt(i);
            valueAt.f11483f = false;
            valueAt.f11478a.mo14242a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r14, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            byte[] r15 = r15.f12121a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r14
            r0 = 0
            r1 = 4
            r2 = 1
            boolean r15 = r14.mo14085a(r15, r0, r1, r2)
            r3 = -1
            if (r15 != 0) goto L_0x0011
            return r3
        L_0x0011:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            r15.mo14549e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            int r15 = r15.mo14544c()
            r4 = 441(0x1b9, float:6.18E-43)
            if (r15 != r4) goto L_0x0021
            return r3
        L_0x0021:
            r3 = 442(0x1ba, float:6.2E-43)
            if (r15 != r3) goto L_0x0043
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            byte[] r15 = r15.f12121a
            r1 = 10
            r14.mo14085a(r15, r0, r1, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            r1 = 9
            r15.mo14549e(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            int r15 = r15.mo14557l()
            r15 = r15 & 7
            int r15 = r15 + 14
            r14.mo14088c(r15)
            return r0
        L_0x0043:
            r3 = 443(0x1bb, float:6.21E-43)
            r4 = 2
            r5 = 6
            if (r15 != r3) goto L_0x0060
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            byte[] r15 = r15.f12121a
            r14.mo14085a(r15, r0, r4, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            r15.mo14549e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            int r15 = r15.mo14562q()
            int r15 = r15 + r5
            r14.mo14088c(r15)
            return r0
        L_0x0060:
            r3 = r15 & -256(0xffffffffffffff00, float:NaN)
            r6 = 8
            int r3 = r3 >> r6
            if (r3 == r2) goto L_0x006b
            r14.mo14088c(r2)
            return r0
        L_0x006b:
            r15 = r15 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a> r3 = r13.f11472b
            java.lang.Object r3 = r3.get(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3201p.C3202a) r3
            boolean r7 = r13.f11474d
            if (r7 != 0) goto L_0x00e2
            if (r3 != 0) goto L_0x00ca
            boolean r7 = r13.f11475e
            r8 = 0
            if (r7 != 0) goto L_0x008d
            r9 = 189(0xbd, float:2.65E-43)
            if (r15 != r9) goto L_0x008d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b
            r7.<init>(r8)
            r13.f11475e = r2
        L_0x008b:
            r8 = r7
            goto L_0x00ae
        L_0x008d:
            if (r7 != 0) goto L_0x009d
            r7 = r15 & 224(0xe0, float:3.14E-43)
            r9 = 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x009d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m
            r7.<init>(r8)
            r13.f11475e = r2
            goto L_0x008b
        L_0x009d:
            boolean r7 = r13.f11476f
            if (r7 != 0) goto L_0x00ae
            r7 = r15 & 240(0xf0, float:3.36E-43)
            r9 = 224(0xe0, float:3.14E-43)
            if (r7 != r9) goto L_0x00ae
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i
            r8.<init>()
            r13.f11476f = r2
        L_0x00ae:
            if (r8 == 0) goto L_0x00ca
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 256(0x100, float:3.59E-43)
            r3.<init>(r7, r15, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r7 = r13.f11477g
            r8.mo14244a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h) r7, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v.C3214d) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r7 = r13.f11471a
            r3.<init>(r8, r7)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a> r7 = r13.f11472b
            r7.put(r15, r3)
        L_0x00ca:
            boolean r15 = r13.f11475e
            if (r15 == 0) goto L_0x00d2
            boolean r15 = r13.f11476f
            if (r15 != 0) goto L_0x00db
        L_0x00d2:
            long r7 = r14.f10548c
            r9 = 1048576(0x100000, double:5.180654E-318)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 <= 0) goto L_0x00e2
        L_0x00db:
            r13.f11474d = r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r15 = r13.f11477g
            r15.mo14124c()
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            byte[] r15 = r15.f12121a
            r14.mo14085a(r15, r0, r4, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            r15.mo14549e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f11473c
            int r15 = r15.mo14562q()
            int r15 = r15 + r5
            if (r3 != 0) goto L_0x00fc
            r14.mo14088c(r15)
            goto L_0x01df
        L_0x00fc:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r13.f11473c
            r4.mo14545c(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r13.f11473c
            byte[] r4 = r4.f12121a
            r14.mo14087b(r4, r0, r15, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f11473c
            r14.mo14549e(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f11473c
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            byte[] r15 = r15.f12117a
            r4 = 3
            r14.mo14541a(r15, r0, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            r15.mo14534b(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            r15.mo14536c(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            boolean r15 = r15.mo14535b()
            r3.f11481d = r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            boolean r15 = r15.mo14535b()
            r3.f11482e = r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            r15.mo14536c(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            int r15 = r15.mo14532a(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r5 = r3.f11480c
            byte[] r5 = r5.f12117a
            r14.mo14541a(r5, r0, r15)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            r15.mo14534b(r0)
            r5 = 0
            r3.f11484g = r5
            boolean r15 = r3.f11481d
            if (r15 == 0) goto L_0x01c5
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            r15.mo14536c(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            int r15 = r15.mo14532a(r4)
            long r5 = (long) r15
            r15 = 30
            long r5 = r5 << r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f11480c
            r7.mo14536c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f11480c
            r8 = 15
            int r7 = r7.mo14532a(r8)
            int r7 = r7 << r8
            long r9 = (long) r7
            long r5 = r5 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f11480c
            r7.mo14536c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f11480c
            int r7 = r7.mo14532a(r8)
            long r9 = (long) r7
            long r5 = r5 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f11480c
            r7.mo14536c(r2)
            boolean r7 = r3.f11483f
            if (r7 != 0) goto L_0x01bd
            boolean r7 = r3.f11482e
            if (r7 == 0) goto L_0x01bd
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f11480c
            r7.mo14536c(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r1 = r3.f11480c
            int r1 = r1.mo14532a(r4)
            long r9 = (long) r1
            long r9 = r9 << r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            r15.mo14536c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            int r15 = r15.mo14532a(r8)
            int r15 = r15 << r8
            long r11 = (long) r15
            long r9 = r9 | r11
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            r15.mo14536c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            int r15 = r15.mo14532a(r8)
            long r7 = (long) r15
            long r7 = r7 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f11480c
            r15.mo14536c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r15 = r3.f11479b
            r15.mo14584b(r7)
            r3.f11483f = r2
        L_0x01bd:
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r15 = r3.f11479b
            long r4 = r15.mo14584b(r5)
            r3.f11484g = r4
        L_0x01c5:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r15 = r3.f11478a
            long r4 = r3.f11484g
            r15.mo14243a((long) r4, (boolean) r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r15 = r3.f11478a
            r15.mo14245a(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r14 = r3.f11478a
            r14.mo14246b()
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f11473c
            int r15 = r14.mo14542b()
            r14.mo14547d(r15)
        L_0x01df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3201p.mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }
}
