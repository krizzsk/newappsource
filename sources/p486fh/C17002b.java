package p486fh;

/* renamed from: fh.b */
public final class C17002b extends C17012l {

    /* renamed from: b */
    public static final char[] f44121b;

    /* renamed from: c */
    public static final char[] f44122c = {'T', 'N', '*', 'E'};

    /* renamed from: d */
    public static final char[] f44123d = {'/', ':', '+', '.'};

    /* renamed from: e */
    public static final char f44124e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f44121b = cArr;
        f44124e = cArr[0];
    }

    /* renamed from: b */
    public final boolean[] mo44158b(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f44124e;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f44121b;
            boolean v = C17001a.m42847v(upperCase, cArr);
            boolean v2 = C17001a.m42847v(upperCase2, cArr);
            char[] cArr2 = f44122c;
            boolean v3 = C17001a.m42847v(upperCase, cArr2);
            boolean v4 = C17001a.m42847v(upperCase2, cArr2);
            if (v) {
                if (!v2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (v3) {
                if (!v4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (v2 || v4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            } else {
                StringBuilder sb2 = new StringBuilder();
                char c2 = f44124e;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (C17001a.m42847v(str.charAt(i3), f44123d)) {
                    i2 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
            }
        }
        boolean[] zArr = new boolean[((str.length() - 1) + i2)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = C17001a.f44119b;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                } else if (upperCase3 == cArr3[i6]) {
                    i = C17001a.f44120c[i6];
                    break;
                } else {
                    i6++;
                }
            }
            int i7 = 0;
            boolean z = true;
            while (true) {
                int i8 = 0;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                        z = !z;
                        i7++;
                    } else {
                        i8++;
                    }
                }
                break;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
