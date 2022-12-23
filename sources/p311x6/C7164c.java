package p311x6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: x6.c */
public final class C7164c extends FilterInputStream {

    /* renamed from: b */
    public final long f22246b;

    /* renamed from: c */
    public int f22247c;

    public C7164c(InputStream inputStream, long j) {
        super(inputStream);
        this.f22246b = j;
    }

    /* renamed from: a */
    public final void mo23455a(int i) throws IOException {
        if (i >= 0) {
            this.f22247c += i;
        } else if (this.f22246b - ((long) this.f22247c) > 0) {
            StringBuilder k = C13555b.m33972k("Failed to read all expected data, expected: ");
            k.append(this.f22246b);
            k.append(", but read: ");
            k.append(this.f22247c);
            throw new IOException(k.toString());
        }
    }

    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f22246b - ((long) this.f22247c), (long) this.in.available());
    }

    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        mo23455a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        mo23455a(read);
        return read;
    }
}
