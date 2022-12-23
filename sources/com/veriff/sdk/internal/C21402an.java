package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.an */
final class C21402an {

    /* renamed from: a */
    private final C21401am f53850a;

    /* renamed from: b */
    private final int[] f53851b;

    public C21402an(C21401am amVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f53850a = amVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f53851b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f53851b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.f53851b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public int mo54191a() {
        return this.f53851b.length - 1;
    }

    /* renamed from: b */
    public boolean mo54197b() {
        return this.f53851b[0] == 0;
    }

    /* renamed from: c */
    public C21402an mo54200c(C21402an anVar) {
        if (!this.f53850a.equals(anVar.f53850a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo54197b() || anVar.mo54197b()) {
            return this.f53850a.mo54182a();
        } else {
            int[] iArr = this.f53851b;
            int length = iArr.length;
            int[] iArr2 = anVar.f53851b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    C21401am amVar = this.f53850a;
                    iArr3[i4] = amVar.mo54185b(iArr3[i4], amVar.mo54190d(i2, iArr2[i3]));
                }
            }
            return new C21402an(this.f53850a, iArr3);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(mo54191a() * 8);
        for (int a = mo54191a(); a >= 0; a--) {
            int a2 = mo54192a(a);
            if (a2 != 0) {
                if (a2 < 0) {
                    sb.append(" - ");
                    a2 = -a2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (a == 0 || a2 != 1) {
                    sb.append(a2);
                }
                if (a != 0) {
                    if (a == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(a);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public int mo54192a(int i) {
        int[] iArr = this.f53851b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: b */
    public int mo54195b(int i) {
        if (i == 0) {
            return mo54192a(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int b : this.f53851b) {
                i2 = this.f53850a.mo54185b(i2, b);
            }
            return i2;
        }
        int[] iArr = this.f53851b;
        int i3 = iArr[0];
        int length = iArr.length;
        for (int i4 = 1; i4 < length; i4++) {
            C21401am amVar = this.f53850a;
            i3 = amVar.mo54185b(amVar.mo54190d(i, i3), this.f53851b[i4]);
        }
        return i3;
    }

    /* renamed from: a */
    public C21402an mo54194a(C21402an anVar) {
        if (!this.f53850a.equals(anVar.f53850a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (mo54197b()) {
            return anVar;
        } else {
            if (anVar.mo54197b()) {
                return this;
            }
            int[] iArr = this.f53851b;
            int[] iArr2 = anVar.f53851b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = this.f53850a.mo54185b(iArr2[i - length], iArr[i]);
            }
            return new C21402an(this.f53850a, iArr4);
        }
    }

    /* renamed from: b */
    public C21402an mo54196b(C21402an anVar) {
        if (!this.f53850a.equals(anVar.f53850a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        } else if (anVar.mo54197b()) {
            return this;
        } else {
            return mo54194a(anVar.mo54198c());
        }
    }

    /* renamed from: c */
    public C21402an mo54198c() {
        int length = this.f53851b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f53850a.mo54189c(0, this.f53851b[i]);
        }
        return new C21402an(this.f53850a, iArr);
    }

    /* renamed from: a */
    public C21402an mo54193a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f53850a.mo54182a();
        } else {
            int length = this.f53851b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f53850a.mo54190d(this.f53851b[i3], i2);
            }
            return new C21402an(this.f53850a, iArr);
        }
    }

    /* renamed from: c */
    public C21402an mo54199c(int i) {
        if (i == 0) {
            return this.f53850a.mo54182a();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f53851b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f53850a.mo54190d(this.f53851b[i2], i);
        }
        return new C21402an(this.f53850a, iArr);
    }
}
