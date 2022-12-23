package p438dh;

/* renamed from: dh.b */
public final class C16667b {

    /* renamed from: a */
    public final C16666a f43376a;

    /* renamed from: b */
    public final int[] f43377b;

    public C16667b(C16666a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f43376a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f43377b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f43377b = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.f43377b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final C16667b mo49390a(C16667b bVar) {
        if (!this.f43376a.equals(bVar.f43376a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo49393d()) {
            return bVar;
        } else {
            if (bVar.mo49393d()) {
                return this;
            }
            int[] iArr = this.f43377b;
            int[] iArr2 = bVar.f43377b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = iArr2[i - length] ^ iArr[i];
            }
            return new C16667b(this.f43376a, iArr4);
        }
    }

    /* renamed from: b */
    public final int mo49391b(int i) {
        if (i == 0) {
            return mo49392c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f43377b) {
                C16666a aVar = C16666a.f43363h;
                i2 ^= i3;
            }
            return i2;
        }
        int[] iArr = this.f43377b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = this.f43376a.mo49388c(i, i4) ^ this.f43377b[i5];
        }
        return i4;
    }

    /* renamed from: c */
    public final int mo49392c(int i) {
        int[] iArr = this.f43377b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public final boolean mo49393d() {
        return this.f43377b[0] == 0;
    }

    /* renamed from: e */
    public final C16667b mo49394e(int i) {
        if (i == 0) {
            return this.f43376a.f43371c;
        }
        if (i == 1) {
            return this;
        }
        int length = this.f43377b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f43376a.mo49388c(this.f43377b[i2], i);
        }
        return new C16667b(this.f43376a, iArr);
    }

    /* renamed from: f */
    public final C16667b mo49395f(C16667b bVar) {
        if (!this.f43376a.equals(bVar.f43376a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo49393d() || bVar.mo49393d()) {
            return this.f43376a.f43371c;
        } else {
            int[] iArr = this.f43377b;
            int length = iArr.length;
            int[] iArr2 = bVar.f43377b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = iArr3[i4] ^ this.f43376a.mo49388c(i2, iArr2[i3]);
                }
            }
            return new C16667b(this.f43376a, iArr3);
        }
    }

    /* renamed from: g */
    public final C16667b mo49396g(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f43376a.f43371c;
        } else {
            int length = this.f43377b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f43376a.mo49388c(this.f43377b[i3], i2);
            }
            return new C16667b(this.f43376a, iArr);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f43377b.length - 1) * 8);
        int length = this.f43377b.length;
        while (true) {
            length--;
            if (length < 0) {
                return sb.toString();
            }
            int c = mo49392c(length);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || c != 1) {
                    C16666a aVar = this.f43376a;
                    if (c != 0) {
                        int i = aVar.f43370b[c];
                        if (i == 0) {
                            sb.append('1');
                        } else if (i == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i);
                        }
                    } else {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
    }
}
