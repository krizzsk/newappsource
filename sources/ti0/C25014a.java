package ti0;

import mf0.C24362h;
import si0.C24898f;
import si0.C24913t;
import si0.C24920y;
import uh0.C25072a;

/* renamed from: ti0.a */
public final class C25014a {

    /* renamed from: a */
    public static final byte[] f63182a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C25072a.f63272a);
        C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
        f63182a = bytes;
    }

    /* renamed from: a */
    public static final String m62721a(C24898f fVar, long j) {
        C24362h.m61211f(fVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (fVar.mo61430v(j2) == ((byte) 13)) {
                String K = fVar.mo61381K(j2);
                fVar.skip(2);
                return K;
            }
        }
        String K2 = fVar.mo61381K(j);
        fVar.skip(1);
        return K2;
    }

    /* renamed from: b */
    public static final int m62722b(C24898f fVar, C24913t tVar, boolean z) {
        int i;
        int i2;
        boolean z2;
        int i3;
        C24920y yVar;
        int i4;
        C24898f fVar2 = fVar;
        C24913t tVar2 = tVar;
        C24362h.m61211f(fVar2, "$this$selectPrefix");
        C24362h.m61211f(tVar2, "options");
        C24920y yVar2 = fVar2.f62946b;
        if (yVar2 != null) {
            byte[] bArr = yVar2.f62991a;
            int i5 = yVar2.f62992b;
            int i6 = yVar2.f62993c;
            int[] iArr = tVar2.f62975c;
            C24920y yVar3 = yVar2;
            int i7 = 0;
            int i8 = -1;
            loop0:
            while (true) {
                int i9 = i7 + 1;
                int i11 = iArr[i7];
                int i12 = i9 + 1;
                int i13 = iArr[i9];
                if (i13 != -1) {
                    i8 = i13;
                }
                if (yVar3 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = (i11 * -1) + i12;
                    while (true) {
                        int i15 = i5 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i5] & 255) != iArr[i12]) {
                            return i8;
                        }
                        if (i16 == i14) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i15 == i6) {
                            C24362h.m61208c(yVar3);
                            C24920y yVar4 = yVar3.f62996f;
                            C24362h.m61208c(yVar4);
                            i4 = yVar4.f62992b;
                            byte[] bArr2 = yVar4.f62991a;
                            i3 = yVar4.f62993c;
                            if (yVar4 != yVar2) {
                                byte[] bArr3 = bArr2;
                                yVar = yVar4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                yVar = null;
                            }
                        } else {
                            C24920y yVar5 = yVar3;
                            i3 = i6;
                            i4 = i15;
                            yVar = yVar5;
                        }
                        if (z2) {
                            i2 = iArr[i16];
                            i = i4;
                            i6 = i3;
                            yVar3 = yVar;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i12 = i16;
                        yVar3 = yVar;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i17 = i12 + i11;
                    while (i12 != i17) {
                        if (b == iArr[i12]) {
                            i2 = iArr[i12 + i11];
                            if (i == i6) {
                                yVar3 = yVar3.f62996f;
                                C24362h.m61208c(yVar3);
                                i = yVar3.f62992b;
                                bArr = yVar3.f62991a;
                                i6 = yVar3.f62993c;
                                if (yVar3 == yVar2) {
                                    yVar3 = null;
                                }
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i8;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i7 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i8;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }
}
