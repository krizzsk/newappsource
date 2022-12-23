package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.g */
public final class C3156g {

    /* renamed from: a */
    public static final int[] f11174a = {C3406u.m8589a("isom"), C3406u.m8589a("iso2"), C3406u.m8589a("iso3"), C3406u.m8589a("iso4"), C3406u.m8589a("iso5"), C3406u.m8589a("iso6"), C3406u.m8589a("avc1"), C3406u.m8589a("hvc1"), C3406u.m8589a("hev1"), C3406u.m8589a("mp41"), C3406u.m8589a("mp42"), C3406u.m8589a("3g2a"), C3406u.m8589a("3g2b"), C3406u.m8589a("3gr6"), C3406u.m8589a("3gs6"), C3406u.m8589a("3ge6"), C3406u.m8589a("3gg6"), C3406u.m8589a("M4V "), C3406u.m8589a("M4A "), C3406u.m8589a("f4v "), C3406u.m8589a("kddi"), C3406u.m8589a("M4VP"), C3406u.m8589a("qt  "), C3406u.m8589a("MSNV")};

    /* renamed from: a */
    public static boolean m7948a(C3087g gVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        boolean z3;
        C3072b bVar = (C3072b) gVar;
        long j = bVar.f10547b;
        if (j == -1 || j > 4096) {
            j = 4096;
        }
        int i = (int) j;
        C3393k kVar = new C3393k(64);
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            kVar.mo14545c(8);
            bVar.mo14085a(kVar.f12121a, 0, 8, false);
            long m = kVar.mo14558m();
            int c = kVar.mo14544c();
            int i3 = 16;
            if (m == 1) {
                bVar.mo14085a(kVar.f12121a, 8, 8, false);
                kVar.mo14547d(16);
                m = kVar.mo14561p();
            } else {
                i3 = 8;
            }
            long j2 = (long) i3;
            if (m < j2) {
                return false;
            }
            i2 += i3;
            if (c != C3141a.f10967C) {
                if (c == C3141a.f10985L || c == C3141a.f10989N) {
                    z2 = true;
                } else if ((((long) i2) + m) - j2 >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (m - j2);
                    i2 += i4;
                    if (c == C3141a.f11005b) {
                        if (i4 < 8) {
                            return false;
                        }
                        kVar.mo14545c(i4);
                        bVar.mo14085a(kVar.f12121a, 0, i4, false);
                        int i5 = i4 / 4;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                kVar.mo14551f(4);
                            } else {
                                int c2 = kVar.mo14544c();
                                if ((c2 >>> 8) != C3406u.m8589a("3gp")) {
                                    int[] iArr = f11174a;
                                    int length = iArr.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= length) {
                                            z3 = false;
                                            break;
                                        } else if (iArr[i7] == c2) {
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    z4 = true;
                                    break;
                                }
                            }
                            i6++;
                        }
                        if (!z4) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        bVar.mo14084a(i4, false);
                    }
                }
            }
        }
        z2 = false;
        if (!z4 || z != z2) {
            return false;
        }
        return true;
    }
}
