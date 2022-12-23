package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.C3217c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.a */
public final class C3215a implements C3080f, C3124m {

    /* renamed from: a */
    public C3088h f11527a;

    /* renamed from: b */
    public C3161n f11528b;

    /* renamed from: c */
    public C3216b f11529c;

    /* renamed from: d */
    public int f11530d;

    /* renamed from: e */
    public int f11531e;

    /* renamed from: a */
    public boolean mo14079a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        return C3217c.m8126a(gVar) != null;
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: c */
    public long mo14080c() {
        C3216b bVar = this.f11529c;
        return ((bVar.f11539h / ((long) bVar.f11535d)) * 1000000) / ((long) bVar.f11533b);
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f11527a = hVar;
        this.f11528b = hVar.mo14122a(0, 1);
        this.f11529c = null;
        hVar.mo14124c();
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        this.f11531e = 0;
    }

    /* renamed from: a */
    public int mo14112a(C3087g gVar, C3123l lVar) throws IOException, InterruptedException {
        C3087g gVar2 = gVar;
        if (this.f11529c == null) {
            C3216b a = C3217c.m8126a(gVar);
            this.f11529c = a;
            if (a != null) {
                int i = a.f11533b;
                int i2 = a.f11532a;
                this.f11528b.mo14098a(C3226i.m8178a((String) null, "audio/raw", (String) null, a.f11536e * i * i2, 32768, i2, i, a.f11537f, (List<byte[]>) null, (C3059a) null, 0, (String) null));
                this.f11530d = this.f11529c.f11535d;
            } else {
                throw new C3230l("Unsupported or unrecognized wav header.");
            }
        }
        C3216b bVar = this.f11529c;
        if (!((bVar.f11538g == 0 || bVar.f11539h == 0) ? false : true)) {
            gVar.getClass();
            C3072b bVar2 = (C3072b) gVar2;
            bVar2.f10550e = 0;
            C3393k kVar = new C3393k(8);
            C3217c.C3218a a2 = C3217c.C3218a.m8127a(gVar2, kVar);
            while (a2.f11540a != C3406u.m8589a("data")) {
                int i3 = a2.f11540a;
                long j = a2.f11541b + 8;
                if (i3 == C3406u.m8589a("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    bVar2.mo14088c((int) j);
                    a2 = C3217c.C3218a.m8127a(gVar2, kVar);
                } else {
                    StringBuilder k = C13555b.m33972k("Chunk is too large (~2GB+) to skip; id: ");
                    k.append(a2.f11540a);
                    throw new C3230l(k.toString());
                }
            }
            bVar2.mo14088c(8);
            long j2 = bVar2.f10548c;
            long j3 = a2.f11541b;
            bVar.f11538g = j2;
            bVar.f11539h = j3;
            this.f11527a.mo14123a(this);
        }
        int a3 = this.f11528b.mo14092a(gVar2, 32768 - this.f11531e, true);
        if (a3 != -1) {
            this.f11531e += a3;
        }
        int i4 = this.f11531e;
        int i5 = this.f11530d;
        int i6 = i4 / i5;
        if (i6 > 0) {
            C3216b bVar3 = this.f11529c;
            int i7 = i6 * i5;
            int i8 = i4 - i7;
            this.f11531e = i8;
            this.f11528b.mo14096a(((((C3072b) gVar2).f10548c - ((long) i4)) * 1000000) / ((long) bVar3.f11534c), 1, i7, i8, (byte[]) null);
        }
        if (a3 == -1) {
            return -1;
        }
        return 0;
    }

    /* renamed from: a */
    public long mo14078a(long j) {
        C3216b bVar = this.f11529c;
        long j2 = (long) bVar.f11535d;
        return Math.min((((j * ((long) bVar.f11534c)) / 1000000) / j2) * j2, bVar.f11539h - j2) + bVar.f11538g;
    }
}
