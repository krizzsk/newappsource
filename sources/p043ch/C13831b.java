package p043ch;

import java.util.Arrays;

/* renamed from: ch.b */
public final class C13831b implements Cloneable {

    /* renamed from: b */
    public final int f34027b;

    /* renamed from: c */
    public final int f34028c;

    /* renamed from: d */
    public final int f34029d;

    /* renamed from: e */
    public final int[] f34030e;

    public C13831b() {
        throw null;
    }

    public C13831b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f34027b = i;
        this.f34028c = i2;
        int i3 = (i + 31) / 32;
        this.f34029d = i3;
        this.f34030e = new int[(i3 * i2)];
    }

    /* renamed from: a */
    public final void mo40763a(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f34029d);
        int[] iArr = this.f34030e;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    /* renamed from: b */
    public final boolean mo40764b(int i, int i2) {
        if (((this.f34030e[(i / 32) + (i2 * this.f34029d)] >>> (i & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo40765c(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f34029d);
        int[] iArr = this.f34030e;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C13831b(this.f34027b, this.f34028c, this.f34029d, (int[]) this.f34030e.clone());
    }

    /* renamed from: d */
    public final void mo40767d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f34028c || i5 > this.f34027b) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f34029d * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f34030e;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13831b)) {
            return false;
        }
        C13831b bVar = (C13831b) obj;
        if (this.f34027b == bVar.f34027b && this.f34028c == bVar.f34028c && this.f34029d == bVar.f34029d && Arrays.equals(this.f34030e, bVar.f34030e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f34027b;
        return Arrays.hashCode(this.f34030e) + (((((((i * 31) + i) * 31) + this.f34028c) * 31) + this.f34029d) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder((this.f34027b + 1) * this.f34028c);
        for (int i = 0; i < this.f34028c; i++) {
            for (int i2 = 0; i2 < this.f34027b; i2++) {
                if (mo40764b(i2, i)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public C13831b(int i, int i2, int i3, int[] iArr) {
        this.f34027b = i;
        this.f34028c = i2;
        this.f34029d = i3;
        this.f34030e = iArr;
    }
}
