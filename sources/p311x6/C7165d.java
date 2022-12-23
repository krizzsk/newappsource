package p311x6;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: x6.d */
public final class C7165d extends InputStream {

    /* renamed from: d */
    public static final ArrayDeque f22248d = new ArrayDeque(0);

    /* renamed from: b */
    public InputStream f22249b;

    /* renamed from: c */
    public IOException f22250c;

    static {
        char[] cArr = C7176l.f22265a;
    }

    public final int available() throws IOException {
        return this.f22249b.available();
    }

    public final void close() throws IOException {
        this.f22249b.close();
    }

    public final void mark(int i) {
        this.f22249b.mark(i);
    }

    public final boolean markSupported() {
        return this.f22249b.markSupported();
    }

    public final int read() throws IOException {
        try {
            return this.f22249b.read();
        } catch (IOException e) {
            this.f22250c = e;
            throw e;
        }
    }

    public final synchronized void reset() throws IOException {
        this.f22249b.reset();
    }

    public final long skip(long j) throws IOException {
        try {
            return this.f22249b.skip(j);
        } catch (IOException e) {
            this.f22250c = e;
            throw e;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f22249b.read(bArr);
        } catch (IOException e) {
            this.f22250c = e;
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f22249b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f22250c = e;
            throw e;
        }
    }
}
