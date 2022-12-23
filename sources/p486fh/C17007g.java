package p486fh;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;
import p043ch.C13831b;

/* renamed from: fh.g */
public final class C17007g extends C17012l {
    /* renamed from: d */
    public static void m42852d(boolean[] zArr, int i, int[] iArr) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            if (iArr[i2] != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
            i2++;
            i = i3;
        }
    }

    /* renamed from: e */
    public static int m42853e(int i, String str) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: f */
    public static void m42854f(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: b */
    public final boolean[] mo44158b(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            m42854f(C17006f.f44127b[47], iArr);
            boolean[] zArr = new boolean[(((str.length() + 2 + 2) * 9) + 1)];
            m42852d(zArr, 0, iArr);
            int i = 9;
            for (int i2 = 0; i2 < length; i2++) {
                m42854f(C17006f.f44127b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i2))], iArr);
                m42852d(zArr, i, iArr);
                i += 9;
            }
            int e = m42853e(20, str);
            int[] iArr2 = C17006f.f44127b;
            m42854f(iArr2[e], iArr);
            m42852d(zArr, i, iArr);
            int i3 = i + 9;
            StringBuilder k = C13555b.m33972k(str);
            k.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(e));
            m42854f(iArr2[m42853e(15, k.toString())], iArr);
            m42852d(zArr, i3, iArr);
            int i4 = i3 + 9;
            m42854f(iArr2[47], iArr);
            m42852d(zArr, i4, iArr);
            zArr[i4 + 9] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }

    /* renamed from: i */
    public final C13831b mo22696i(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.mo22696i(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
