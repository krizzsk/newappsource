package p486fh;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;
import p043ch.C13831b;

/* renamed from: fh.j */
public final class C17010j extends C17015o {
    /* renamed from: b */
    public final boolean[] mo44158b(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = C16759e.m42349e(str, C17014n.m42869w(str));
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!C17014n.m42868v(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int a = C17012l.m42863a(zArr, 0, C17014n.f44133b, true) + 0;
        for (int i = 0; i <= 3; i++) {
            a += C17012l.m42863a(zArr, a, C17014n.f44136e[Character.digit(str.charAt(i), 10)], false);
        }
        int a2 = C17012l.m42863a(zArr, a, C17014n.f44134c, false) + a;
        for (int i2 = 4; i2 <= 7; i2++) {
            a2 += C17012l.m42863a(zArr, a2, C17014n.f44136e[Character.digit(str.charAt(i2), 10)], true);
        }
        C17012l.m42863a(zArr, a2, C17014n.f44133b, true);
        return zArr;
    }

    /* renamed from: i */
    public final C13831b mo22696i(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.mo22696i(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
