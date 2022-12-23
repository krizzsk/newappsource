package p580jh;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: jh.e */
public final class C17851e {

    /* renamed from: e */
    public static final int[] f45827e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    public static final C17851e[] f45828f = m44233a();

    /* renamed from: a */
    public final int f45829a;

    /* renamed from: b */
    public final int[] f45830b;

    /* renamed from: c */
    public final C17853b[] f45831c;

    /* renamed from: d */
    public final int f45832d;

    /* renamed from: jh.e$a */
    public static final class C17852a {

        /* renamed from: a */
        public final int f45833a;

        /* renamed from: b */
        public final int f45834b;

        public C17852a(int i, int i2) {
            this.f45833a = i;
            this.f45834b = i2;
        }
    }

    /* renamed from: jh.e$b */
    public static final class C17853b {

        /* renamed from: a */
        public final int f45835a;

        /* renamed from: b */
        public final C17852a[] f45836b;

        public C17853b(int i, C17852a... aVarArr) {
            this.f45835a = i;
            this.f45836b = aVarArr;
        }
    }

    public C17851e(int i, int[] iArr, C17853b... bVarArr) {
        this.f45829a = i;
        this.f45830b = iArr;
        this.f45831c = bVarArr;
        C17853b bVar = bVarArr[0];
        int i2 = bVar.f45835a;
        int i3 = 0;
        for (C17852a aVar : bVar.f45836b) {
            i3 += (aVar.f45834b + i2) * aVar.f45833a;
        }
        this.f45832d = i3;
    }

    /* renamed from: a */
    public static C17851e[] m44233a() {
        return new C17851e[]{new C17851e(1, new int[0], new C17853b(7, new C17852a(1, 19)), new C17853b(10, new C17852a(1, 16)), new C17853b(13, new C17852a(1, 13)), new C17853b(17, new C17852a(1, 9))), new C17851e(2, new int[]{6, 18}, new C17853b(10, new C17852a(1, 34)), new C17853b(16, new C17852a(1, 28)), new C17853b(22, new C17852a(1, 22)), new C17853b(28, new C17852a(1, 16))), new C17851e(3, new int[]{6, 22}, new C17853b(15, new C17852a(1, 55)), new C17853b(26, new C17852a(1, 44)), new C17853b(18, new C17852a(2, 17)), new C17853b(22, new C17852a(2, 13))), new C17851e(4, new int[]{6, 26}, new C17853b(20, new C17852a(1, 80)), new C17853b(18, new C17852a(2, 32)), new C17853b(26, new C17852a(2, 24)), new C17853b(16, new C17852a(4, 9))), new C17851e(5, new int[]{6, 30}, new C17853b(26, new C17852a(1, 108)), new C17853b(24, new C17852a(2, 43)), new C17853b(18, new C17852a(2, 15), new C17852a(2, 16)), new C17853b(22, new C17852a(2, 11), new C17852a(2, 12))), new C17851e(6, new int[]{6, 34}, new C17853b(18, new C17852a(2, 68)), new C17853b(16, new C17852a(4, 27)), new C17853b(24, new C17852a(4, 19)), new C17853b(28, new C17852a(4, 15))), new C17851e(7, new int[]{6, 22, 38}, new C17853b(20, new C17852a(2, 78)), new C17853b(18, new C17852a(4, 31)), new C17853b(18, new C17852a(2, 14), new C17852a(4, 15)), new C17853b(26, new C17852a(4, 13), new C17852a(1, 14))), new C17851e(8, new int[]{6, 24, 42}, new C17853b(24, new C17852a(2, 97)), new C17853b(22, new C17852a(2, 38), new C17852a(2, 39)), new C17853b(22, new C17852a(4, 18), new C17852a(2, 19)), new C17853b(26, new C17852a(4, 14), new C17852a(2, 15))), new C17851e(9, new int[]{6, 26, 46}, new C17853b(30, new C17852a(2, 116)), new C17853b(22, new C17852a(3, 36), new C17852a(2, 37)), new C17853b(20, new C17852a(4, 16), new C17852a(4, 17)), new C17853b(24, new C17852a(4, 12), new C17852a(4, 13))), new C17851e(10, new int[]{6, 28, 50}, new C17853b(18, new C17852a(2, 68), new C17852a(2, 69)), new C17853b(26, new C17852a(4, 43), new C17852a(1, 44)), new C17853b(24, new C17852a(6, 19), new C17852a(2, 20)), new C17853b(28, new C17852a(6, 15), new C17852a(2, 16))), new C17851e(11, new int[]{6, 30, 54}, new C17853b(20, new C17852a(4, 81)), new C17853b(30, new C17852a(1, 50), new C17852a(4, 51)), new C17853b(28, new C17852a(4, 22), new C17852a(4, 23)), new C17853b(24, new C17852a(3, 12), new C17852a(8, 13))), new C17851e(12, new int[]{6, 32, 58}, new C17853b(24, new C17852a(2, 92), new C17852a(2, 93)), new C17853b(22, new C17852a(6, 36), new C17852a(2, 37)), new C17853b(26, new C17852a(4, 20), new C17852a(6, 21)), new C17853b(28, new C17852a(7, 14), new C17852a(4, 15))), new C17851e(13, new int[]{6, 34, 62}, new C17853b(26, new C17852a(4, 107)), new C17853b(22, new C17852a(8, 37), new C17852a(1, 38)), new C17853b(24, new C17852a(8, 20), new C17852a(4, 21)), new C17853b(22, new C17852a(12, 11), new C17852a(4, 12))), new C17851e(14, new int[]{6, 26, 46, 66}, new C17853b(30, new C17852a(3, 115), new C17852a(1, 116)), new C17853b(24, new C17852a(4, 40), new C17852a(5, 41)), new C17853b(20, new C17852a(11, 16), new C17852a(5, 17)), new C17853b(24, new C17852a(11, 12), new C17852a(5, 13))), new C17851e(15, new int[]{6, 26, 48, 70}, new C17853b(22, new C17852a(5, 87), new C17852a(1, 88)), new C17853b(24, new C17852a(5, 41), new C17852a(5, 42)), new C17853b(30, new C17852a(5, 24), new C17852a(7, 25)), new C17853b(24, new C17852a(11, 12), new C17852a(7, 13))), new C17851e(16, new int[]{6, 26, 50, 74}, new C17853b(24, new C17852a(5, 98), new C17852a(1, 99)), new C17853b(28, new C17852a(7, 45), new C17852a(3, 46)), new C17853b(24, new C17852a(15, 19), new C17852a(2, 20)), new C17853b(30, new C17852a(3, 15), new C17852a(13, 16))), new C17851e(17, new int[]{6, 30, 54, 78}, new C17853b(28, new C17852a(1, 107), new C17852a(5, 108)), new C17853b(28, new C17852a(10, 46), new C17852a(1, 47)), new C17853b(28, new C17852a(1, 22), new C17852a(15, 23)), new C17853b(28, new C17852a(2, 14), new C17852a(17, 15))), new C17851e(18, new int[]{6, 30, 56, 82}, new C17853b(30, new C17852a(5, 120), new C17852a(1, 121)), new C17853b(26, new C17852a(9, 43), new C17852a(4, 44)), new C17853b(28, new C17852a(17, 22), new C17852a(1, 23)), new C17853b(28, new C17852a(2, 14), new C17852a(19, 15))), new C17851e(19, new int[]{6, 30, 58, 86}, new C17853b(28, new C17852a(3, 113), new C17852a(4, 114)), new C17853b(26, new C17852a(3, 44), new C17852a(11, 45)), new C17853b(26, new C17852a(17, 21), new C17852a(4, 22)), new C17853b(26, new C17852a(9, 13), new C17852a(16, 14))), new C17851e(20, new int[]{6, 34, 62, 90}, new C17853b(28, new C17852a(3, 107), new C17852a(5, 108)), new C17853b(26, new C17852a(3, 41), new C17852a(13, 42)), new C17853b(30, new C17852a(15, 24), new C17852a(5, 25)), new C17853b(28, new C17852a(15, 15), new C17852a(10, 16))), new C17851e(21, new int[]{6, 28, 50, 72, 94}, new C17853b(28, new C17852a(4, 116), new C17852a(4, 117)), new C17853b(26, new C17852a(17, 42)), new C17853b(28, new C17852a(17, 22), new C17852a(6, 23)), new C17853b(30, new C17852a(19, 16), new C17852a(6, 17))), new C17851e(22, new int[]{6, 26, 50, 74, 98}, new C17853b(28, new C17852a(2, 111), new C17852a(7, 112)), new C17853b(28, new C17852a(17, 46)), new C17853b(30, new C17852a(7, 24), new C17852a(16, 25)), new C17853b(24, new C17852a(34, 13))), new C17851e(23, new int[]{6, 30, 54, 78, 102}, new C17853b(30, new C17852a(4, 121), new C17852a(5, 122)), new C17853b(28, new C17852a(4, 47), new C17852a(14, 48)), new C17853b(30, new C17852a(11, 24), new C17852a(14, 25)), new C17853b(30, new C17852a(16, 15), new C17852a(14, 16))), new C17851e(24, new int[]{6, 28, 54, 80, 106}, new C17853b(30, new C17852a(6, 117), new C17852a(4, 118)), new C17853b(28, new C17852a(6, 45), new C17852a(14, 46)), new C17853b(30, new C17852a(11, 24), new C17852a(16, 25)), new C17853b(30, new C17852a(30, 16), new C17852a(2, 17))), new C17851e(25, new int[]{6, 32, 58, 84, 110}, new C17853b(26, new C17852a(8, 106), new C17852a(4, 107)), new C17853b(28, new C17852a(8, 47), new C17852a(13, 48)), new C17853b(30, new C17852a(7, 24), new C17852a(22, 25)), new C17853b(30, new C17852a(22, 15), new C17852a(13, 16))), new C17851e(26, new int[]{6, 30, 58, 86, 114}, new C17853b(28, new C17852a(10, 114), new C17852a(2, 115)), new C17853b(28, new C17852a(19, 46), new C17852a(4, 47)), new C17853b(28, new C17852a(28, 22), new C17852a(6, 23)), new C17853b(30, new C17852a(33, 16), new C17852a(4, 17))), new C17851e(27, new int[]{6, 34, 62, 90, 118}, new C17853b(30, new C17852a(8, 122), new C17852a(4, 123)), new C17853b(28, new C17852a(22, 45), new C17852a(3, 46)), new C17853b(30, new C17852a(8, 23), new C17852a(26, 24)), new C17853b(30, new C17852a(12, 15), new C17852a(28, 16))), new C17851e(28, new int[]{6, 26, 50, 74, 98, 122}, new C17853b(30, new C17852a(3, 117), new C17852a(10, 118)), new C17853b(28, new C17852a(3, 45), new C17852a(23, 46)), new C17853b(30, new C17852a(4, 24), new C17852a(31, 25)), new C17853b(30, new C17852a(11, 15), new C17852a(31, 16))), new C17851e(29, new int[]{6, 30, 54, 78, 102, 126}, new C17853b(30, new C17852a(7, 116), new C17852a(7, 117)), new C17853b(28, new C17852a(21, 45), new C17852a(7, 46)), new C17853b(30, new C17852a(1, 23), new C17852a(37, 24)), new C17853b(30, new C17852a(19, 15), new C17852a(26, 16))), new C17851e(30, new int[]{6, 26, 52, 78, 104, 130}, new C17853b(30, new C17852a(5, 115), new C17852a(10, 116)), new C17853b(28, new C17852a(19, 47), new C17852a(10, 48)), new C17853b(30, new C17852a(15, 24), new C17852a(25, 25)), new C17853b(30, new C17852a(23, 15), new C17852a(25, 16))), new C17851e(31, new int[]{6, 30, 56, 82, 108, 134}, new C17853b(30, new C17852a(13, 115), new C17852a(3, 116)), new C17853b(28, new C17852a(2, 46), new C17852a(29, 47)), new C17853b(30, new C17852a(42, 24), new C17852a(1, 25)), new C17853b(30, new C17852a(23, 15), new C17852a(28, 16))), new C17851e(32, new int[]{6, 34, 60, 86, 112, 138}, new C17853b(30, new C17852a(17, 115)), new C17853b(28, new C17852a(10, 46), new C17852a(23, 47)), new C17853b(30, new C17852a(10, 24), new C17852a(35, 25)), new C17853b(30, new C17852a(19, 15), new C17852a(35, 16))), new C17851e(33, new int[]{6, 30, 58, 86, 114, 142}, new C17853b(30, new C17852a(17, 115), new C17852a(1, 116)), new C17853b(28, new C17852a(14, 46), new C17852a(21, 47)), new C17853b(30, new C17852a(29, 24), new C17852a(19, 25)), new C17853b(30, new C17852a(11, 15), new C17852a(46, 16))), new C17851e(34, new int[]{6, 34, 62, 90, 118, 146}, new C17853b(30, new C17852a(13, 115), new C17852a(6, 116)), new C17853b(28, new C17852a(14, 46), new C17852a(23, 47)), new C17853b(30, new C17852a(44, 24), new C17852a(7, 25)), new C17853b(30, new C17852a(59, 16), new C17852a(1, 17))), new C17851e(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C17853b(30, new C17852a(12, 121), new C17852a(7, 122)), new C17853b(28, new C17852a(12, 47), new C17852a(26, 48)), new C17853b(30, new C17852a(39, 24), new C17852a(14, 25)), new C17853b(30, new C17852a(22, 15), new C17852a(41, 16))), new C17851e(36, new int[]{6, 24, 50, 76, 102, RecyclerView.C1119a0.FLAG_IGNORE, 154}, new C17853b(30, new C17852a(6, 121), new C17852a(14, 122)), new C17853b(28, new C17852a(6, 47), new C17852a(34, 48)), new C17853b(30, new C17852a(46, 24), new C17852a(10, 25)), new C17853b(30, new C17852a(2, 15), new C17852a(64, 16))), new C17851e(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C17853b(30, new C17852a(17, 122), new C17852a(4, 123)), new C17853b(28, new C17852a(29, 46), new C17852a(14, 47)), new C17853b(30, new C17852a(49, 24), new C17852a(10, 25)), new C17853b(30, new C17852a(24, 15), new C17852a(46, 16))), new C17851e(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C17853b(30, new C17852a(4, 122), new C17852a(18, 123)), new C17853b(28, new C17852a(13, 46), new C17852a(32, 47)), new C17853b(30, new C17852a(48, 24), new C17852a(14, 25)), new C17853b(30, new C17852a(42, 15), new C17852a(32, 16))), new C17851e(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C17853b(30, new C17852a(20, 117), new C17852a(4, 118)), new C17853b(28, new C17852a(40, 47), new C17852a(7, 48)), new C17853b(30, new C17852a(43, 24), new C17852a(22, 25)), new C17853b(30, new C17852a(10, 15), new C17852a(67, 16))), new C17851e(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C17853b(30, new C17852a(19, 118), new C17852a(6, 119)), new C17853b(28, new C17852a(18, 47), new C17852a(31, 48)), new C17853b(30, new C17852a(34, 24), new C17852a(34, 25)), new C17853b(30, new C17852a(20, 15), new C17852a(61, 16)))};
    }

    /* renamed from: b */
    public static C17851e m44234b(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            int[] iArr = f45827e;
            if (i2 < 34) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m44235c(i2 + 7);
                }
                int bitCount = Integer.bitCount(i5 ^ i);
                if (bitCount < i4) {
                    i3 = i2 + 7;
                    i4 = bitCount;
                }
                i2++;
            } else if (i4 <= 3) {
                return m44235c(i3);
            } else {
                return null;
            }
        }
    }

    /* renamed from: c */
    public static C17851e m44235c(int i) {
        if (i > 0 && i <= 40) {
            return f45828f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f45829a);
    }
}
