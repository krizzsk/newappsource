package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3171h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.c */
public class C3166c implements C3080f {

    /* renamed from: a */
    public C3171h f11232a;

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        boolean z;
        boolean z2;
        try {
            C3168e eVar = new C3168e();
            if (eVar.mo14235a(gVar, true)) {
                if ((eVar.f11239a & 2) == 2) {
                    int min = Math.min(eVar.f11243e, 8);
                    C3393k kVar = new C3393k(min);
                    ((C3072b) gVar).mo14085a(kVar.f12121a, 0, min, false);
                    kVar.mo14549e(0);
                    if (kVar.mo14537a() >= 5 && kVar.mo14557l() == 127 && kVar.mo14558m() == 1179402563) {
                        this.f11232a = new C3164b();
                    } else {
                        kVar.mo14549e(0);
                        try {
                            z = C3177k.m8004a(1, kVar, true);
                        } catch (C3230l unused) {
                            z = false;
                        }
                        if (z) {
                            this.f11232a = new C3175j();
                        } else {
                            kVar.mo14549e(0);
                            int i = C3170g.f11246o;
                            int a = kVar.mo14537a();
                            byte[] bArr = C3170g.f11247p;
                            if (a < bArr.length) {
                                z2 = false;
                            } else {
                                byte[] bArr2 = new byte[bArr.length];
                                int length = bArr.length;
                                System.arraycopy(kVar.f12121a, kVar.f12122b, bArr2, 0, length);
                                kVar.f12122b += length;
                                z2 = Arrays.equals(bArr2, bArr);
                            }
                            if (z2) {
                                this.f11232a = new C3170g();
                            }
                        }
                    }
                    return true;
                }
            }
        } catch (C3230l unused2) {
        }
        return false;
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        C3161n a = hVar.mo14122a(0, 1);
        hVar.mo14124c();
        C3171h hVar2 = this.f11232a;
        hVar2.f11251c = hVar;
        hVar2.f11250b = a;
        hVar2.f11249a = new C3167d();
        hVar2.mo14230a(true);
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        C3171h hVar = this.f11232a;
        C3167d dVar = hVar.f11249a;
        dVar.f11233a.mo14234a();
        dVar.f11234b.mo14563r();
        dVar.f11235c = -1;
        dVar.f11237e = false;
        if (j == 0) {
            hVar.mo14230a(!hVar.f11260l);
        } else if (hVar.f11256h != 0) {
            hVar.f11253e = hVar.f11252d.mo14228c(j2);
            hVar.f11256h = 2;
        }
    }

    /* renamed from: a */
    public int mo14112a(C3087g gVar, C3123l lVar) throws IOException, InterruptedException {
        C3087g gVar2 = gVar;
        C3171h hVar = this.f11232a;
        int i = hVar.f11256h;
        if (i == 0) {
            boolean z = true;
            while (z) {
                if (!hVar.f11249a.mo14233a(gVar2)) {
                    hVar.f11256h = 3;
                    return -1;
                }
                C3072b bVar = (C3072b) gVar2;
                long j = bVar.f10548c;
                long j2 = hVar.f11254f;
                hVar.f11259k = j - j2;
                boolean a = hVar.mo14231a(hVar.f11249a.f11234b, j2, hVar.f11258j);
                if (a) {
                    hVar.f11254f = bVar.f10548c;
                }
                z = a;
            }
            C3226i iVar = hVar.f11258j.f11262a;
            hVar.f11257i = iVar.f11646s;
            if (!hVar.f11261m) {
                hVar.f11250b.mo14098a(iVar);
                hVar.f11261m = true;
            }
            C3169f fVar = hVar.f11258j.f11263b;
            if (fVar != null) {
                hVar.f11252d = fVar;
            } else {
                long j3 = ((C3072b) gVar2).f10547b;
                if (j3 == -1) {
                    hVar.f11252d = new C3171h.C3173b();
                } else {
                    C3168e eVar = hVar.f11249a.f11233a;
                    hVar.f11252d = new C3162a(hVar.f11254f, j3, hVar, eVar.f11242d + eVar.f11243e, eVar.f11240b);
                }
            }
            hVar.f11258j = null;
            hVar.f11256h = 2;
            C3393k kVar = hVar.f11249a.f11234b;
            byte[] bArr = kVar.f12121a;
            if (bArr.length != 65025) {
                kVar.f12121a = Arrays.copyOf(bArr, Math.max(65025, kVar.f12123c));
            }
        } else if (i == 1) {
            ((C3072b) gVar2).mo14088c((int) hVar.f11254f);
            hVar.f11256h = 2;
        } else if (i == 2) {
            long a2 = hVar.f11252d.mo14225a(gVar2);
            if (a2 >= 0) {
                lVar.f10822a = a2;
                return 1;
            }
            if (a2 < -1) {
                hVar.mo14238b(-(a2 + 2));
            }
            if (!hVar.f11260l) {
                hVar.f11251c.mo14123a(hVar.f11252d.mo14227b());
                hVar.f11260l = true;
            }
            if (hVar.f11259k > 0 || hVar.f11249a.mo14233a(gVar2)) {
                hVar.f11259k = 0;
                C3393k kVar2 = hVar.f11249a.f11234b;
                long a3 = hVar.mo14229a(kVar2);
                if (a3 >= 0) {
                    long j4 = hVar.f11255g;
                    if (j4 + a3 >= hVar.f11253e) {
                        long j5 = (j4 * 1000000) / ((long) hVar.f11257i);
                        hVar.f11250b.mo14099a(kVar2, kVar2.f12123c);
                        hVar.f11250b.mo14096a(j5, 1, kVar2.f12123c, 0, (byte[]) null);
                        hVar.f11253e = -1;
                    }
                }
                hVar.f11255g += a3;
            } else {
                hVar.f11256h = 3;
                return -1;
            }
        } else {
            throw new IllegalStateException();
        }
        return 0;
    }
}
