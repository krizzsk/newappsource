package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c */
public final class C3183c implements C3080f {

    /* renamed from: e */
    public static final int f11301e = C3406u.m8589a("ID3");

    /* renamed from: a */
    public final long f11302a;

    /* renamed from: b */
    public final C3393k f11303b = new C3393k(200);

    /* renamed from: c */
    public C3184d f11304c;

    /* renamed from: d */
    public boolean f11305d;

    public C3183c(long j) {
        this.f11302a = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        r6.f10550e = 0;
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004a, code lost:
        if ((r1 - r4) < 8192) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
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
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.j
            byte[] r3 = r0.f12121a
            int r4 = r3.length
            r2.<init>(r3, r4)
            r3 = 0
            r4 = 0
        L_0x0011:
            byte[] r5 = r0.f12121a
            r6 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r6
            r6.mo14085a(r5, r3, r1, r3)
            r0.mo14549e(r3)
            int r5 = r0.mo14559n()
            int r7 = f11301e
            if (r5 == r7) goto L_0x0076
            r6.f10550e = r3
            r6.mo14084a(r4, r3)
            r1 = r4
        L_0x002a:
            r11 = 0
            r5 = 0
        L_0x002c:
            byte[] r7 = r0.f12121a
            r8 = 2
            r6.mo14085a(r7, r3, r8, r3)
            r0.mo14549e(r3)
            int r7 = r0.mo14562q()
            r8 = 65526(0xfff6, float:9.1821E-41)
            r7 = r7 & r8
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r7 == r8) goto L_0x0051
            r6.f10550e = r3
            int r1 = r1 + 1
            int r11 = r1 - r4
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r11 < r5) goto L_0x004d
            return r3
        L_0x004d:
            r6.mo14084a(r1, r3)
            goto L_0x002a
        L_0x0051:
            r7 = 1
            int r11 = r11 + r7
            r8 = 4
            if (r11 < r8) goto L_0x005b
            r9 = 188(0xbc, float:2.63E-43)
            if (r5 <= r9) goto L_0x005b
            return r7
        L_0x005b:
            byte[] r7 = r0.f12121a
            r6.mo14085a(r7, r3, r8, r3)
            r7 = 14
            r2.mo14534b(r7)
            r7 = 13
            int r7 = r2.mo14532a(r7)
            r8 = 6
            if (r7 > r8) goto L_0x006f
            return r3
        L_0x006f:
            int r8 = r7 + -6
            r6.mo14084a(r8, r3)
            int r5 = r5 + r7
            goto L_0x002c
        L_0x0076:
            r5 = 3
            r0.mo14551f(r5)
            int r5 = r0.mo14556k()
            int r7 = r5 + 10
            int r4 = r4 + r7
            r6.mo14084a(r5, r3)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3183c.mo14115a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        C3184d dVar = new C3184d(true, (String) null);
        this.f11304c = dVar;
        dVar.mo14244a(hVar, new C3210v.C3214d(Integer.MIN_VALUE, 0, 1));
        hVar.mo14124c();
        hVar.mo14123a(new C3124m.C3125a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        this.f11305d = false;
        this.f11304c.mo14248c();
    }

    /* renamed from: a */
    public int mo14112a(C3087g gVar, C3123l lVar) throws IOException, InterruptedException {
        int a = ((C3072b) gVar).mo14081a(this.f11303b.f12121a, 0, 200);
        if (a == -1) {
            return -1;
        }
        this.f11303b.mo14549e(0);
        this.f11303b.mo14547d(a);
        if (!this.f11305d) {
            this.f11304c.f11321o = this.f11302a;
            this.f11305d = true;
        }
        this.f11304c.mo14245a(this.f11303b);
        return 0;
    }
}
