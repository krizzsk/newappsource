package p484ff;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: ff.d */
public final class C16964d {
    /* renamed from: a */
    public static byte[] m42802a(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static byte[] m42803b(C16965a aVar) throws IOException {
        int i;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(RecyclerView.C1119a0.FLAG_IGNORE, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = aVar.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return m42802a(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j = (long) min;
            if (min < 4096) {
                i = 4;
            } else {
                i = 2;
            }
            long j2 = j * ((long) i);
            if (j2 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j2 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j2;
            }
        }
        if (aVar.read() == -1) {
            return m42802a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: ff.d$a */
    public static final class C16965a extends FilterInputStream {

        /* renamed from: b */
        public long f44032b = 1048577;

        /* renamed from: c */
        public long f44033c = -1;

        public C16965a(InputStream inputStream) {
            super(inputStream);
        }

        public final int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f44032b);
        }

        public final synchronized void mark(int i) {
            this.in.mark(i);
            this.f44033c = this.f44032b;
        }

        public final int read() throws IOException {
            if (this.f44032b == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f44032b--;
            }
            return read;
        }

        public final synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f44033c != -1) {
                this.in.reset();
                this.f44032b = this.f44033c;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public final long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f44032b));
            this.f44032b -= skip;
            return skip;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f44032b;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f44032b -= (long) read;
            }
            return read;
        }
    }
}
