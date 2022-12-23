package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a */
public final class C3181a implements C3080f {

    /* renamed from: e */
    public static final int f11284e = C3406u.m8589a("ID3");

    /* renamed from: a */
    public final long f11285a;

    /* renamed from: b */
    public final C3393k f11286b = new C3393k(2786);

    /* renamed from: c */
    public C3182b f11287c;

    /* renamed from: d */
    public boolean f11288d;

    public C3181a(long j) {
        this.f11285a = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        r5.f10550e = 0;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if ((r1 - r3) < 8192) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14115a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r10 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f12121a
            r5 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r5
            r5.mo14085a(r4, r2, r1, r2)
            r0.mo14549e(r2)
            int r4 = r0.mo14559n()
            int r6 = f11284e
            if (r4 == r6) goto L_0x0066
            r5.f10550e = r2
            r5.mo14084a(r3, r2)
            r1 = r3
        L_0x0022:
            r11 = 0
        L_0x0023:
            byte[] r4 = r0.f12121a
            r6 = 5
            r5.mo14085a(r4, r2, r6, r2)
            r0.mo14549e(r2)
            int r4 = r0.mo14562q()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r4 == r7) goto L_0x0043
            r5.f10550e = r2
            int r1 = r1 + 1
            int r11 = r1 - r3
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r11 < r4) goto L_0x003f
            return r2
        L_0x003f:
            r5.mo14084a(r1, r2)
            goto L_0x0022
        L_0x0043:
            r4 = 1
            int r11 = r11 + r4
            r7 = 4
            if (r11 < r7) goto L_0x0049
            return r4
        L_0x0049:
            byte[] r4 = r0.f12121a
            int r8 = r4.length
            r9 = -1
            if (r8 >= r6) goto L_0x0051
            r4 = -1
            goto L_0x005d
        L_0x0051:
            byte r4 = r4[r7]
            r6 = r4 & 192(0xc0, float:2.69E-43)
            int r6 = r6 >> 6
            r4 = r4 & 63
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C3035a.m7585a(r6, r4)
        L_0x005d:
            if (r4 != r9) goto L_0x0060
            return r2
        L_0x0060:
            int r4 = r4 + -5
            r5.mo14084a(r4, r2)
            goto L_0x0023
        L_0x0066:
            r4 = 3
            r0.mo14551f(r4)
            int r4 = r0.mo14556k()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo14084a(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3181a.mo14115a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        C3182b bVar = new C3182b((String) null);
        this.f11287c = bVar;
        bVar.f11292d = "0";
        bVar.f11293e = hVar.mo14122a(0, 1);
        hVar.mo14124c();
        hVar.mo14123a(new C3124m.C3125a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        this.f11288d = false;
        this.f11287c.mo14242a();
    }

    /* renamed from: a */
    public int mo14112a(C3087g gVar, C3123l lVar) throws IOException, InterruptedException {
        int a = ((C3072b) gVar).mo14081a(this.f11286b.f12121a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f11286b.mo14549e(0);
        this.f11286b.mo14547d(a);
        if (!this.f11288d) {
            this.f11287c.f11300l = this.f11285a;
            this.f11288d = true;
        }
        this.f11287c.mo14245a(this.f11286b);
        return 0;
    }
}
