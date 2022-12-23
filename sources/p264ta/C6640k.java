package p264ta;

import java.io.IOException;
import p173ma.C5736i;
import p277ub.C6803r;

/* renamed from: ta.k */
public final class C6640k {

    /* renamed from: a */
    public static final int[] f20602a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m15701a(C5736i iVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        C5736i iVar2 = iVar;
        long length = iVar.getLength();
        long j = -1;
        long j2 = 4096;
        int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i != 0 && length <= 4096) {
            j2 = length;
        }
        int i2 = (int) j2;
        C6803r rVar = new C6803r(64);
        boolean z5 = false;
        int i3 = 0;
        boolean z6 = false;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            rVar.mo23004w(8);
            if (!iVar2.mo21583j(z5 ? 1 : 0, 8, rVar.f21038a, true)) {
                break;
            }
            long q = rVar.mo22998q();
            int c = rVar.mo22984c();
            int i4 = 16;
            if (q == 1) {
                iVar2.mo21575a(8, 8, rVar.f21038a);
                rVar.mo23006y(16);
                q = rVar.mo22991j();
            } else {
                if (q == 0) {
                    long length2 = iVar.getLength();
                    if (length2 != j) {
                        q = (length2 - iVar.mo21577f()) + ((long) 8);
                    }
                }
                i4 = 8;
            }
            long j3 = (long) i4;
            if (q < j3) {
                return z5;
            }
            i3 += i4;
            if (c == 1836019574) {
                i2 += (int) q;
                if (i != 0 && ((long) i2) > length) {
                    i2 = (int) length;
                }
                j = -1;
            } else if (c == 1836019558 || c == 1836475768) {
                z3 = true;
            } else {
                long j4 = length;
                int i5 = i3;
                if ((((long) i3) + q) - j3 >= ((long) i2)) {
                    break;
                }
                int i6 = (int) (q - j3);
                i3 = i5 + i6;
                if (c == 1718909296) {
                    if (i6 < 8) {
                        return false;
                    }
                    rVar.mo23004w(i6);
                    iVar2.mo21575a(0, i6, rVar.f21038a);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            break;
                        }
                        if (i8 == 1) {
                            rVar.mo22981A(4);
                        } else {
                            int c2 = rVar.mo22984c();
                            if ((c2 >>> 8) != 3368816 && (c2 != 1751476579 || !z2)) {
                                int[] iArr = f20602a;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= 29) {
                                        z4 = false;
                                        break;
                                    } else if (iArr[i9] == c2) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            z4 = true;
                            if (z4) {
                                z6 = true;
                                break;
                            }
                        }
                        i8++;
                    }
                    if (!z6) {
                        return false;
                    }
                } else if (i6 != 0) {
                    iVar2.mo21578g(i6);
                }
                length = j4;
                j = -1;
                z5 = false;
            }
        }
        z3 = false;
        if (!z6 || z != z3) {
            return false;
        }
        return true;
    }
}
