package wj0;

import java.io.IOException;
import org.tukaani.p981xz.CorruptedInputException;

/* renamed from: wj0.a */
public final class C25241a {

    /* renamed from: a */
    public final byte[] f63507a;

    /* renamed from: b */
    public int f63508b = 0;

    /* renamed from: c */
    public int f63509c = 0;

    /* renamed from: d */
    public int f63510d = 0;

    /* renamed from: e */
    public int f63511e = 0;

    /* renamed from: f */
    public int f63512f = 0;

    /* renamed from: g */
    public int f63513g = 0;

    public C25241a(int i) {
        this.f63507a = new byte[i];
    }

    /* renamed from: a */
    public final void mo61868a(int i, int i2) throws IOException {
        int i3;
        int i4;
        if (i < 0 || i >= this.f63510d) {
            throw new CorruptedInputException();
        }
        int min = Math.min(this.f63511e - this.f63509c, i2);
        this.f63512f = i2 - min;
        this.f63513g = i;
        int i5 = this.f63509c;
        int i6 = (i5 - i) - 1;
        if (i >= i5) {
            i6 += this.f63507a.length;
        }
        do {
            byte[] bArr = this.f63507a;
            int i7 = this.f63509c;
            i4 = i7 + 1;
            this.f63509c = i4;
            int i8 = i3 + 1;
            bArr[i7] = bArr[i3];
            i3 = i8 == bArr.length ? 0 : i8;
            min--;
        } while (min > 0);
        if (this.f63510d < i4) {
            this.f63510d = i4;
        }
    }
}
