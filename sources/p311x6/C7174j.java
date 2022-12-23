package p311x6;

import java.io.FilterInputStream;
import java.io.IOException;

/* renamed from: x6.j */
public final class C7174j extends FilterInputStream {

    /* renamed from: b */
    public int f22261b = Integer.MIN_VALUE;

    public C7174j(C7165d dVar) {
        super(dVar);
    }

    public final int available() throws IOException {
        int i = this.f22261b;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    /* renamed from: c */
    public final long mo23475c(long j) {
        int i = this.f22261b;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: e */
    public final void mo23476e(long j) {
        int i = this.f22261b;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f22261b = (int) (((long) i) - j);
        }
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.f22261b = i;
    }

    public final int read() throws IOException {
        if (mo23475c(1) == -1) {
            return -1;
        }
        int read = super.read();
        mo23476e(1);
        return read;
    }

    public final synchronized void reset() throws IOException {
        super.reset();
        this.f22261b = Integer.MIN_VALUE;
    }

    public final long skip(long j) throws IOException {
        long c = mo23475c(j);
        if (c == -1) {
            return 0;
        }
        long skip = super.skip(c);
        mo23476e(skip);
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int c = (int) mo23475c((long) i2);
        if (c == -1) {
            return -1;
        }
        int read = super.read(bArr, i, c);
        mo23476e((long) read);
        return read;
    }
}
