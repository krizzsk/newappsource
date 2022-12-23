package p438dh;

/* renamed from: dh.a */
public final class C16666a {

    /* renamed from: h */
    public static final C16666a f43363h = new C16666a(4201, 4096, 1);

    /* renamed from: i */
    public static final C16666a f43364i = new C16666a(1033, 1024, 1);

    /* renamed from: j */
    public static final C16666a f43365j = new C16666a(67, 64, 1);

    /* renamed from: k */
    public static final C16666a f43366k = new C16666a(19, 16, 1);

    /* renamed from: l */
    public static final C16666a f43367l = new C16666a(285, 256, 0);

    /* renamed from: m */
    public static final C16666a f43368m = new C16666a(301, 256, 1);

    /* renamed from: a */
    public final int[] f43369a;

    /* renamed from: b */
    public final int[] f43370b;

    /* renamed from: c */
    public final C16667b f43371c;

    /* renamed from: d */
    public final C16667b f43372d;

    /* renamed from: e */
    public final int f43373e;

    /* renamed from: f */
    public final int f43374f;

    /* renamed from: g */
    public final int f43375g;

    public C16666a(int i, int i2, int i3) {
        this.f43374f = i;
        this.f43373e = i2;
        this.f43375g = i3;
        this.f43369a = new int[i2];
        this.f43370b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f43369a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f43370b[this.f43369a[i6]] = i6;
        }
        this.f43371c = new C16667b(this, new int[]{0});
        this.f43372d = new C16667b(this, new int[]{1});
    }

    /* renamed from: a */
    public final C16667b mo49386a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f43371c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C16667b(this, iArr);
        }
    }

    /* renamed from: b */
    public final int mo49387b(int i) {
        if (i != 0) {
            return this.f43369a[(this.f43373e - this.f43370b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: c */
    public final int mo49388c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f43369a;
        int[] iArr2 = this.f43370b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f43373e - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f43374f));
        sb.append(',');
        return C16530d.m42014g(sb, this.f43373e, ')');
    }
}
