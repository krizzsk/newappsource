package p558ih;

import com.google.android.play.core.assetpacks.C14343z0;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.qrcode.decoder.C14646b;
import com.google.zxing.qrcode.detector.C14647a;
import java.util.List;
import java.util.Map;
import p043ch.C13831b;
import p043ch.C13833d;
import p580jh.C17850d;
import p935yg.C20719b;
import p935yg.C20724f;
import p935yg.C20725g;

/* renamed from: ih.a */
public final class C17599a {

    /* renamed from: b */
    public static final C20725g[] f45274b = new C20725g[0];

    /* renamed from: a */
    public final C14646b f45275a = new C14646b();

    /* renamed from: a */
    public final C20724f mo50072a(C20719b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C20725g[] gVarArr;
        C13833d dVar;
        int[] iArr;
        int[] iArr2;
        Map<DecodeHintType, ?> map2 = map;
        boolean z = false;
        if (map2 == null || !map2.containsKey(DecodeHintType.PURE_BARCODE)) {
            C14343z0 b = new C14647a(bVar.mo52864a()).mo44176b(map2);
            dVar = this.f45275a.mo44169a((C13831b) b.f36140b, map2);
            gVarArr = (C20725g[]) b.f36141c;
        } else {
            C13831b a = bVar.mo52864a();
            int i = 0;
            while (true) {
                iArr = a.f34030e;
                if (i >= iArr.length || iArr[i] != 0) {
                    int[] iArr3 = null;
                } else {
                    i++;
                }
            }
            int[] iArr32 = null;
            if (i == iArr.length) {
                iArr2 = null;
            } else {
                int i2 = a.f34029d;
                int i3 = i / i2;
                int i4 = (i % i2) << 5;
                int i5 = iArr[i];
                int i6 = 0;
                while ((i5 << (31 - i6)) == 0) {
                    i6++;
                }
                iArr2 = new int[]{i4 + i6, i3};
            }
            int length = a.f34030e.length - 1;
            while (length >= 0 && a.f34030e[length] == 0) {
                length--;
            }
            if (length >= 0) {
                int i7 = a.f34029d;
                int i8 = length / i7;
                int i9 = (length % i7) << 5;
                int i11 = 31;
                while ((a.f34030e[length] >>> i11) == 0) {
                    i11--;
                }
                iArr32 = new int[]{i9 + i11, i8};
            }
            if (iArr2 == null || iArr32 == null) {
                throw NotFoundException.f36909d;
            }
            int i12 = a.f34028c;
            int i13 = a.f34027b;
            int i14 = iArr2[0];
            int i15 = iArr2[1];
            boolean z2 = true;
            int i16 = 0;
            while (i14 < i13 && i15 < i12) {
                if (z2 != a.mo40764b(i14, i15)) {
                    i16++;
                    if (i16 == 5) {
                        break;
                    }
                    z2 = !z2;
                }
                i14++;
                i15++;
            }
            if (i14 == i13 || i15 == i12) {
                throw NotFoundException.f36909d;
            }
            int i17 = iArr2[0];
            float f = ((float) (i14 - i17)) / 7.0f;
            int i18 = iArr2[1];
            int i19 = iArr32[1];
            int i21 = iArr32[0];
            if (i17 >= i21 || i18 >= i19) {
                throw NotFoundException.f36909d;
            }
            int i22 = i19 - i18;
            if (i22 == i21 - i17 || (i21 = i17 + i22) < a.f34027b) {
                int round = Math.round(((float) ((i21 - i17) + 1)) / f);
                int round2 = Math.round(((float) (i22 + 1)) / f);
                if (round <= 0 || round2 <= 0) {
                    throw NotFoundException.f36909d;
                } else if (round2 == round) {
                    int i23 = (int) (f / 2.0f);
                    int i24 = i18 + i23;
                    int i25 = i17 + i23;
                    int i26 = (((int) (((float) (round - 1)) * f)) + i25) - i21;
                    if (i26 > 0) {
                        if (i26 <= i23) {
                            i25 -= i26;
                        } else {
                            throw NotFoundException.f36909d;
                        }
                    }
                    int i27 = (((int) (((float) (round2 - 1)) * f)) + i24) - i19;
                    if (i27 > 0) {
                        if (i27 <= i23) {
                            i24 -= i27;
                        } else {
                            throw NotFoundException.f36909d;
                        }
                    }
                    C13831b bVar2 = new C13831b(round, round2);
                    for (int i28 = 0; i28 < round2; i28++) {
                        int i29 = ((int) (((float) i28) * f)) + i24;
                        for (int i31 = 0; i31 < round; i31++) {
                            if (a.mo40764b(((int) (((float) i31) * f)) + i25, i29)) {
                                bVar2.mo40765c(i31, i28);
                            }
                        }
                    }
                    dVar = this.f45275a.mo44169a(bVar2, map2);
                    gVarArr = f45274b;
                } else {
                    throw NotFoundException.f36909d;
                }
            } else {
                throw NotFoundException.f36909d;
            }
        }
        Object obj = dVar.f34038d;
        if ((obj instanceof C17850d) && ((C17850d) obj).f45826a && gVarArr != null && gVarArr.length >= 3) {
            C20725g gVar = gVarArr[0];
            gVarArr[0] = gVarArr[2];
            gVarArr[2] = gVar;
        }
        String str = dVar.f34035a;
        BarcodeFormat barcodeFormat = BarcodeFormat.AZTEC;
        C20724f fVar = new C20724f(str, gVarArr);
        List<byte[]> list = dVar.f34036b;
        if (list != null) {
            fVar.mo52873a(ResultMetadataType.BYTE_SEGMENTS, list);
        }
        String str2 = dVar.f34037c;
        if (str2 != null) {
            fVar.mo52873a(ResultMetadataType.ERROR_CORRECTION_LEVEL, str2);
        }
        if (dVar.f34039e >= 0 && dVar.f34040f >= 0) {
            z = true;
        }
        if (z) {
            fVar.mo52873a(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVar.f34040f));
            fVar.mo52873a(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVar.f34039e));
        }
        return fVar;
    }
}
