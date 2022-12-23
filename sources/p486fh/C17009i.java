package p486fh;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
import p043ch.C13831b;

/* renamed from: fh.i */
public final class C17009i extends C17015o {
    /* renamed from: b */
    public final boolean[] mo44158b(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = C16759e.m42349e(str, C17014n.m42869w(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!C17014n.m42868v(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
        }
        int i = C17008h.f44128g[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int a = C17012l.m42863a(zArr, 0, C17014n.f44133b, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            a += C17012l.m42863a(zArr, a, C17014n.f44137f[digit], false);
        }
        int a2 = C17012l.m42863a(zArr, a, C17014n.f44134c, false) + a;
        for (int i3 = 7; i3 <= 12; i3++) {
            a2 += C17012l.m42863a(zArr, a2, C17014n.f44136e[Character.digit(str.charAt(i3), 10)], true);
        }
        C17012l.m42863a(zArr, a2, C17014n.f44133b, true);
        return zArr;
    }

    /* renamed from: i */
    public final C13831b mo22696i(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.mo22696i(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
