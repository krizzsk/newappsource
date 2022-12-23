package p277ub;

/* renamed from: ub.h */
public final class C6783h {

    /* renamed from: a */
    public int f20981a = 0;

    /* renamed from: b */
    public int f20982b = -1;

    /* renamed from: c */
    public int f20983c = 0;

    /* renamed from: d */
    public int[] f20984d;

    /* renamed from: e */
    public int f20985e;

    public C6783h() {
        int[] iArr = new int[16];
        this.f20984d = iArr;
        this.f20985e = iArr.length - 1;
    }

    /* renamed from: a */
    public final void mo22955a(int i) {
        int i2 = this.f20983c;
        int[] iArr = this.f20984d;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i3 = this.f20981a;
                int i4 = length2 - i3;
                System.arraycopy(iArr, i3, iArr2, 0, i4);
                System.arraycopy(this.f20984d, 0, iArr2, i4, i3);
                this.f20981a = 0;
                this.f20982b = this.f20983c - 1;
                this.f20984d = iArr2;
                this.f20985e = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i5 = (this.f20982b + 1) & this.f20985e;
        this.f20982b = i5;
        this.f20984d[i5] = i;
        this.f20983c++;
    }
}
