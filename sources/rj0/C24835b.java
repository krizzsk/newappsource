package rj0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: rj0.b */
public final class C24835b extends FilterInputStream {

    /* renamed from: b */
    public long f62780b = 0;

    public C24835b(InputStream inputStream) {
        super(inputStream);
    }

    public final int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            long j = this.f62780b;
            if (j >= 0) {
                this.f62780b = j + 1;
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read > 0) {
            long j = this.f62780b;
            if (j >= 0) {
                this.f62780b = j + ((long) read);
            }
        }
        return read;
    }
}
