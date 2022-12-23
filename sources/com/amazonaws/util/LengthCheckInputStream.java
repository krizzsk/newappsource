package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LengthCheckInputStream extends SdkFilterInputStream {
    public static final boolean EXCLUDE_SKIPPED_BYTES = false;
    public static final boolean INCLUDE_SKIPPED_BYTES = true;
    private long dataLength;
    private final long expectedLength;
    private final boolean includeSkipped;
    private long marked;

    public LengthCheckInputStream(InputStream inputStream, long j, boolean z) {
        super(inputStream);
        if (j >= 0) {
            this.expectedLength = j;
            this.includeSkipped = z;
            return;
        }
        throw new IllegalArgumentException();
    }

    private void checkLength(boolean z) {
        if (z) {
            if (this.dataLength != this.expectedLength) {
                StringBuilder k = C13555b.m33972k("Data read (");
                k.append(this.dataLength);
                k.append(") has a different length than the expected (");
                throw new AmazonClientException(C25541a.m63884o(k, this.expectedLength, ")"));
            }
        } else if (this.dataLength > this.expectedLength) {
            StringBuilder k2 = C13555b.m33972k("More data read (");
            k2.append(this.dataLength);
            k2.append(") than expected (");
            throw new AmazonClientException(C25541a.m63884o(k2, this.expectedLength, ")"));
        }
    }

    public void mark(int i) {
        super.mark(i);
        this.marked = this.dataLength;
    }

    public int read() throws IOException {
        int read = super.read();
        if (read >= 0) {
            this.dataLength++;
        }
        checkLength(read == -1);
        return read;
    }

    public void reset() throws IOException {
        super.reset();
        if (super.markSupported()) {
            this.dataLength = this.marked;
        }
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (this.includeSkipped && skip > 0) {
            this.dataLength += skip;
            checkLength(false);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        this.dataLength += read >= 0 ? (long) read : 0;
        checkLength(read == -1);
        return read;
    }
}
