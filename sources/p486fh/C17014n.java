package p486fh;

import com.google.zxing.FormatException;
import p057d3.C4339c;

/* renamed from: fh.n */
public abstract class C17014n extends C4339c {

    /* renamed from: b */
    public static final int[] f44133b = {1, 1, 1};

    /* renamed from: c */
    public static final int[] f44134c = {1, 1, 1, 1, 1};

    /* renamed from: d */
    public static final int[] f44135d = {1, 1, 1, 1, 1, 1};

    /* renamed from: e */
    public static final int[][] f44136e;

    /* renamed from: f */
    public static final int[][] f44137f;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f44136e = iArr;
        int[][] iArr2 = new int[20][];
        f44137f = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f44136e[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f44137f[i] = iArr4;
        }
    }

    /* renamed from: v */
    public static boolean m42868v(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (m42869w(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static int m42869w(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.m36739a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.m36739a();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }
}
