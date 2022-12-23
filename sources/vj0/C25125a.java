package vj0;

import org.tukaani.p981xz.XZIOException;

/* renamed from: vj0.a */
public abstract class C25125a {

    /* renamed from: a */
    public final XZIOException f63402a;

    /* renamed from: b */
    public long f63403b = 0;

    /* renamed from: c */
    public long f63404c = 0;

    /* renamed from: d */
    public long f63405d = 0;

    /* renamed from: e */
    public long f63406e = 0;

    public C25125a(XZIOException xZIOException) {
        this.f63402a = xZIOException;
    }

    /* renamed from: a */
    public void mo61739a(long j, long j2) throws XZIOException {
        this.f63403b += (j + 3) & -4;
        this.f63404c += j2;
        long j3 = this.f63405d;
        long j4 = j;
        int i = 0;
        do {
            i++;
            j4 >>= 7;
        } while (j4 != 0);
        long j5 = j2;
        int i2 = 0;
        do {
            i2++;
            j5 >>= 7;
        } while (j5 != 0);
        this.f63405d = j3 + ((long) (i2 + i));
        long j6 = this.f63406e + 1;
        this.f63406e = j6;
        if (this.f63403b >= 0 && this.f63404c >= 0) {
            int i3 = 0;
            do {
                i3++;
                j6 >>= 7;
            } while (j6 != 0);
            if (((((long) (i3 + 1)) + this.f63405d + 4 + 3) & -4) <= 17179869184L) {
                long j7 = this.f63403b + 12;
                long j8 = this.f63406e;
                int i4 = 0;
                do {
                    i4++;
                    j8 >>= 7;
                } while (j8 != 0);
                if (((((long) (i4 + 1)) + this.f63405d + 4 + 3) & -4) + j7 + 12 >= 0) {
                    return;
                }
            }
        }
        throw this.f63402a;
    }
}
