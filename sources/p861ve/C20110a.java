package p861ve;

import java.io.OutputStream;

/* renamed from: ve.a */
public final class C20110a extends OutputStream {

    /* renamed from: b */
    public long f51027b = 0;

    public final void write(int i) {
        this.f51027b++;
    }

    public final void write(byte[] bArr) {
        this.f51027b += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f51027b += (long) i2;
    }
}
