package p935yg;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;
import p043ch.C13831b;
import p043ch.C13834e;

/* renamed from: yg.b */
public final class C20719b {

    /* renamed from: a */
    public final C20718a f52315a;

    /* renamed from: b */
    public C13831b f52316b;

    public C20719b(C13834e eVar) {
        this.f52315a = eVar;
    }

    /* renamed from: a */
    public final C13831b mo52864a() throws NotFoundException {
        int i;
        C20719b bVar = this;
        if (bVar.f52316b == null) {
            C13834e eVar = (C13834e) bVar.f52315a;
            C13831b bVar2 = eVar.f34044d;
            if (bVar2 == null) {
                C20723e eVar2 = eVar.f52314a;
                int i2 = eVar2.f52318a;
                int i3 = eVar2.f52319b;
                if (i2 < 40 || i3 < 40) {
                    C13831b bVar3 = new C13831b(i2, i3);
                    if (eVar.f34042b.length < i2) {
                        eVar.f34042b = new byte[i2];
                    }
                    for (int i4 = 0; i4 < 32; i4++) {
                        eVar.f34043c[i4] = 0;
                    }
                    int[] iArr = eVar.f34043c;
                    for (int i5 = 1; i5 < 5; i5++) {
                        byte[] b = eVar2.mo52870b((i3 * i5) / 5, eVar.f34042b);
                        int i6 = (i2 << 2) / 5;
                        for (int i7 = i2 / 5; i7 < i6; i7++) {
                            int i8 = (b[i7] & 255) >> 3;
                            iArr[i8] = iArr[i8] + 1;
                        }
                    }
                    int length = iArr.length;
                    int i9 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    for (int i13 = 0; i13 < length; i13++) {
                        int i14 = iArr[i13];
                        if (i14 > i9) {
                            i12 = i13;
                            i9 = i14;
                        }
                        if (i14 > i11) {
                            i11 = i14;
                        }
                    }
                    int i15 = 0;
                    int i16 = 0;
                    for (int i17 = 0; i17 < length; i17++) {
                        int i18 = i17 - i12;
                        int i19 = iArr[i17] * i18 * i18;
                        if (i19 > i16) {
                            i15 = i17;
                            i16 = i19;
                        }
                    }
                    if (i12 <= i15) {
                        int i21 = i12;
                        i12 = i15;
                        i15 = i21;
                    }
                    if (i12 - i15 > length / 16) {
                        int i22 = i12 - 1;
                        int i23 = i22;
                        int i24 = -1;
                        while (i22 > i15) {
                            int i25 = i22 - i15;
                            int i26 = (i11 - iArr[i22]) * (i12 - i22) * i25 * i25;
                            if (i26 > i24) {
                                i23 = i22;
                                i24 = i26;
                            }
                            i22--;
                        }
                        int i27 = i23 << 3;
                        byte[] a = eVar2.mo52869a();
                        for (int i28 = 0; i28 < i3; i28++) {
                            int i29 = i28 * i2;
                            for (int i31 = 0; i31 < i2; i31++) {
                                if ((a[i29 + i31] & 255) < i27) {
                                    bVar3.mo40765c(i31, i28);
                                }
                            }
                        }
                        eVar.f34044d = bVar3;
                    } else {
                        throw NotFoundException.f36909d;
                    }
                } else {
                    byte[] a2 = eVar2.mo52869a();
                    int i32 = i2 >> 3;
                    if ((i2 & 7) != 0) {
                        i32++;
                    }
                    int i33 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i33++;
                    }
                    int i34 = i3 - 8;
                    int i35 = i2 - 8;
                    int[] iArr2 = new int[2];
                    iArr2[1] = i32;
                    iArr2[0] = i33;
                    int[][] iArr3 = (int[][]) Array.newInstance(Integer.TYPE, iArr2);
                    int i36 = 0;
                    while (true) {
                        int i37 = 8;
                        if (i36 >= i33) {
                            break;
                        }
                        int i38 = i36 << 3;
                        if (i38 > i34) {
                            i38 = i34;
                        }
                        int i39 = 0;
                        while (i39 < i32) {
                            int i41 = i39 << 3;
                            if (i41 > i35) {
                                i41 = i35;
                            }
                            int i42 = (i38 * i2) + i41;
                            int i43 = 0;
                            int i44 = 0;
                            byte b2 = 255;
                            byte b3 = 0;
                            while (i43 < i37) {
                                int i45 = i43;
                                int i46 = i38;
                                byte b4 = b2;
                                byte b5 = b3;
                                int i47 = 0;
                                while (i47 < i37) {
                                    byte b6 = a2[i42 + i47] & 255;
                                    i44 += b6;
                                    if (b6 < b4) {
                                        b4 = b6;
                                    }
                                    if (b6 > b5) {
                                        b5 = b6;
                                    }
                                    i47++;
                                    i37 = 8;
                                }
                                if (b5 - b4 > 24) {
                                    while (true) {
                                        i = i45 + 1;
                                        i42 += i2;
                                        if (i >= 8) {
                                            break;
                                        }
                                        int i48 = 0;
                                        for (int i49 = 8; i48 < i49; i49 = 8) {
                                            i44 += a2[i42 + i48] & 255;
                                            i48++;
                                            b4 = b4;
                                        }
                                        i45 = i;
                                    }
                                    b2 = b4;
                                } else {
                                    b2 = b4;
                                    i = i45;
                                }
                                int i51 = i + 1;
                                i42 += i2;
                                i37 = 8;
                                b3 = b5;
                                i38 = i46;
                                i43 = i51;
                            }
                            int i52 = i38;
                            int i53 = i44 >> 6;
                            byte b7 = b2;
                            if (b3 - b7 <= 24) {
                                i53 = b7 / 2;
                                if (i36 > 0 && i39 > 0) {
                                    int[] iArr4 = iArr3[i36 - 1];
                                    int i54 = i39 - 1;
                                    int i55 = (((iArr3[i36][i54] * 2) + iArr4[i39]) + iArr4[i54]) / 4;
                                    if (b7 < i55) {
                                        i53 = i55;
                                    }
                                }
                            }
                            iArr3[i36][i39] = i53;
                            i39++;
                            i38 = i52;
                            i37 = 8;
                        }
                        i36++;
                    }
                    C13831b bVar4 = new C13831b(i2, i3);
                    for (int i56 = 0; i56 < i33; i56++) {
                        int i57 = i56 << 3;
                        if (i57 > i34) {
                            i57 = i34;
                        }
                        int i58 = i33 - 3;
                        if (i56 < 2) {
                            i58 = 2;
                        } else if (i56 <= i58) {
                            i58 = i56;
                        }
                        int i59 = 0;
                        while (i59 < i32) {
                            int i61 = i59 << 3;
                            if (i61 > i35) {
                                i61 = i35;
                            }
                            int i62 = i32 - 3;
                            if (i59 < 2) {
                                i62 = 2;
                            } else if (i59 <= i62) {
                                i62 = i59;
                            }
                            int i63 = i32;
                            int i64 = -2;
                            int i65 = 0;
                            for (int i66 = 2; i64 <= i66; i66 = 2) {
                                int[] iArr5 = iArr3[i58 + i64];
                                i65 = iArr5[i62 - 2] + iArr5[i62 - 1] + iArr5[i62] + iArr5[i62 + 1] + iArr5[i62 + 2] + i65;
                                i64++;
                            }
                            int i67 = i65 / 25;
                            int i68 = (i57 * i2) + i61;
                            int i69 = i58;
                            int i71 = 8;
                            int i72 = 0;
                            while (i72 < i71) {
                                int i73 = i33;
                                int i74 = 0;
                                while (i74 < i71) {
                                    byte[] bArr = a2;
                                    if ((a2[i68 + i74] & 255) <= i67) {
                                        bVar4.mo40765c(i61 + i74, i57 + i72);
                                    }
                                    i74++;
                                    a2 = bArr;
                                    i71 = 8;
                                }
                                byte[] bArr2 = a2;
                                i72++;
                                i68 += i2;
                                i33 = i73;
                                i71 = 8;
                            }
                            byte[] bArr3 = a2;
                            int i75 = i33;
                            i59++;
                            i58 = i69;
                            i32 = i63;
                        }
                        byte[] bArr4 = a2;
                        int i76 = i32;
                        int i77 = i33;
                    }
                    eVar.f34044d = bVar4;
                }
                bVar2 = eVar.f34044d;
                bVar = this;
            }
            bVar.f52316b = bVar2;
        }
        return bVar.f52316b;
    }

    public final String toString() {
        try {
            return mo52864a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
