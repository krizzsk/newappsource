package p486fh;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import java.util.Map;
import p043ch.C13831b;
import p935yg.C20727i;

/* renamed from: fh.l */
public abstract class C17012l implements C20727i {
    /* renamed from: a */
    public static int m42863a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* renamed from: b */
    public abstract boolean[] mo44158b(String str);

    /* renamed from: c */
    public int mo49637c() {
        return 10;
    }

    /* renamed from: i */
    public C13831b mo22696i(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        } else {
            int c = mo49637c();
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType)) {
                    c = Integer.parseInt(map.get(encodeHintType).toString());
                }
            }
            boolean[] b = mo44158b(str);
            int length = b.length;
            int i3 = c + length;
            int max = Math.max(i, i3);
            int max2 = Math.max(1, i2);
            int i4 = max / i3;
            int i5 = (max - (length * i4)) / 2;
            C13831b bVar = new C13831b(max, max2);
            int i6 = 0;
            while (i6 < length) {
                if (b[i6]) {
                    bVar.mo40767d(i5, 0, i4, max2);
                }
                i6++;
                i5 += i4;
            }
            return bVar;
        }
    }
}
