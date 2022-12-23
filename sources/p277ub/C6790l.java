package p277ub;

import java.util.Arrays;

/* renamed from: ub.l */
public final class C6790l {

    /* renamed from: a */
    public int f21001a;

    /* renamed from: b */
    public long[] f21002b = new long[32];

    /* renamed from: a */
    public final void mo22963a(long j) {
        int i = this.f21001a;
        long[] jArr = this.f21002b;
        if (i == jArr.length) {
            this.f21002b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f21002b;
        int i2 = this.f21001a;
        this.f21001a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public final long mo22964b(int i) {
        if (i >= 0 && i < this.f21001a) {
            return this.f21002b[i];
        }
        throw new IndexOutOfBoundsException(C13715c.m34243i(46, "Invalid index ", i, ", size is ", this.f21001a));
    }
}
