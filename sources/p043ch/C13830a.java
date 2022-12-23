package p043ch;

import java.util.Arrays;

/* renamed from: ch.a */
public final class C13830a implements Cloneable {

    /* renamed from: b */
    public int[] f34025b;

    /* renamed from: c */
    public int f34026c;

    public C13830a() {
        this.f34026c = 0;
        this.f34025b = new int[1];
    }

    /* renamed from: a */
    public final void mo40755a(boolean z) {
        mo40757c(this.f34026c + 1);
        if (z) {
            int[] iArr = this.f34025b;
            int i = this.f34026c;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f34026c++;
    }

    /* renamed from: b */
    public final void mo40756b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        mo40757c(this.f34026c + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            mo40755a(z);
            i2--;
        }
    }

    /* renamed from: c */
    public final void mo40757c(int i) {
        int[] iArr = this.f34025b;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[((i + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f34025b = iArr2;
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C13830a((int[]) this.f34025b.clone(), this.f34026c);
    }

    /* renamed from: d */
    public final boolean mo40759d(int i) {
        return ((1 << (i & 31)) & this.f34025b[i / 32]) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13830a)) {
            return false;
        }
        C13830a aVar = (C13830a) obj;
        if (this.f34026c != aVar.f34026c || !Arrays.equals(this.f34025b, aVar.f34025b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34025b) + (this.f34026c * 31);
    }

    public final String toString() {
        char c;
        int i = this.f34026c;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f34026c; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            if (mo40759d(i2)) {
                c = 'X';
            } else {
                c = '.';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public C13830a(int[] iArr, int i) {
        this.f34025b = iArr;
        this.f34026c = i;
    }
}
