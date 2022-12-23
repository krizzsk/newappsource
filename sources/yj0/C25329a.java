package yj0;

import java.io.IOException;
import je0.C23715f;
import org.tukaani.p981xz.CorruptedInputException;

/* renamed from: yj0.a */
public final class C25329a extends C23715f {

    /* renamed from: b */
    public int f63631b = 0;

    /* renamed from: c */
    public int f63632c = 0;

    /* renamed from: d */
    public final byte[] f63633d = new byte[65531];

    /* renamed from: e */
    public int f63634e = 0;

    /* renamed from: f */
    public int f63635f = 0;

    /* renamed from: j */
    public final int mo61911j(short[] sArr, int i) {
        mo61913l();
        short s = sArr[i];
        int i2 = this.f63631b;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.f63632c;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.f63631b = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.f63631b = i2 - i3;
        this.f63632c = i4 - i3;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* renamed from: k */
    public final int mo61912k(short[] sArr) {
        int i = 1;
        do {
            i = mo61911j(sArr, i) | (i << 1);
        } while (i < sArr.length);
        return i - sArr.length;
    }

    /* renamed from: l */
    public final void mo61913l() throws IOException {
        int i = this.f63631b;
        if ((-16777216 & i) == 0) {
            try {
                byte[] bArr = this.f63633d;
                int i2 = this.f63634e;
                this.f63634e = i2 + 1;
                this.f63632c = (this.f63632c << 8) | (bArr[i2] & 255);
                this.f63631b = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new CorruptedInputException();
            }
        }
    }
}
