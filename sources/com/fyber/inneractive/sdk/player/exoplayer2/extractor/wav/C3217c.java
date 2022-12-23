package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c */
public final class C3217c {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.c$a */
    public static final class C3218a {

        /* renamed from: a */
        public final int f11540a;

        /* renamed from: b */
        public final long f11541b;

        public C3218a(int i, long j) {
            this.f11540a = i;
            this.f11541b = j;
        }

        /* renamed from: a */
        public static C3218a m8127a(C3087g gVar, C3393k kVar) throws IOException, InterruptedException {
            ((C3072b) gVar).mo14085a(kVar.f12121a, 0, 8, false);
            kVar.mo14549e(0);
            return new C3218a(kVar.mo14544c(), kVar.mo14550f());
        }
    }

    /* renamed from: a */
    public static C3216b m8126a(C3087g gVar) throws IOException, InterruptedException {
        boolean z;
        gVar.getClass();
        C3393k kVar = new C3393k(16);
        if (C3218a.m8127a(gVar, kVar).f11540a != C3406u.m8589a("RIFF")) {
            return null;
        }
        C3072b bVar = (C3072b) gVar;
        bVar.mo14085a(kVar.f12121a, 0, 4, false);
        kVar.mo14549e(0);
        if (kVar.mo14544c() != C3406u.m8589a("WAVE")) {
            return null;
        }
        C3218a a = C3218a.m8127a(gVar, kVar);
        while (a.f11540a != C3406u.m8589a("fmt ")) {
            bVar.mo14084a((int) a.f11541b, false);
            a = C3218a.m8127a(gVar, kVar);
        }
        if (a.f11541b >= 16) {
            z = true;
        } else {
            z = false;
        }
        C3380a.m8507b(z);
        bVar.mo14085a(kVar.f12121a, 0, 16, false);
        kVar.mo14549e(0);
        int h = kVar.mo14553h();
        int h2 = kVar.mo14553h();
        int g = kVar.mo14552g();
        int g2 = kVar.mo14552g();
        int h3 = kVar.mo14553h();
        int h4 = kVar.mo14553h();
        int i = (h2 * h4) / 8;
        if (h3 == i) {
            int a2 = C3406u.m8587a(h4);
            if (a2 == 0) {
                return null;
            }
            if (h != 1 && h != 65534) {
                return null;
            }
            bVar.mo14084a(((int) a.f11541b) - 16, false);
            return new C3216b(h2, g, g2, h3, h4, a2);
        }
        throw new C3230l(C13715c.m34244j("Expected block alignment: ", i, "; got: ", h3));
    }
}
