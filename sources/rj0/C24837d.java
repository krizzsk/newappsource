package rj0;

import com.appboy.support.ValidationUtils;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.p981xz.XZIOException;
import uj0.C25086a;

/* renamed from: rj0.d */
public final class C24837d extends InputStream {

    /* renamed from: b */
    public InputStream f62782b;

    /* renamed from: c */
    public final C25086a f62783c;

    /* renamed from: d */
    public IOException f62784d = null;

    /* renamed from: e */
    public final byte[] f62785e = new byte[1];

    public C24837d(InputStream inputStream, int i) {
        inputStream.getClass();
        this.f62782b = inputStream;
        this.f62783c = new C25086a(i);
    }

    public final int available() throws IOException {
        InputStream inputStream = this.f62782b;
        if (inputStream != null) {
            IOException iOException = this.f62784d;
            if (iOException == null) {
                return inputStream.available();
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    public final void close() throws IOException {
        InputStream inputStream = this.f62782b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f62782b = null;
            }
        }
    }

    public final int read() throws IOException {
        if (read(this.f62785e, 0, 1) == -1) {
            return -1;
        }
        return this.f62785e[0] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.f62782b;
        if (inputStream != null) {
            IOException iOException = this.f62784d;
            if (iOException == null) {
                try {
                    int read = inputStream.read(bArr, i, i2);
                    if (read == -1) {
                        return -1;
                    }
                    C25086a aVar = this.f62783c;
                    aVar.getClass();
                    int i3 = read + i;
                    while (i < i3) {
                        byte b = bArr[i];
                        byte[] bArr2 = aVar.f63290b;
                        int i4 = aVar.f63289a;
                        int i5 = aVar.f63291c;
                        byte b2 = (byte) (b + bArr2[(i4 + i5) & ValidationUtils.APPBOY_STRING_MAX_LENGTH]);
                        bArr[i] = b2;
                        aVar.f63291c = i5 - 1;
                        bArr2[i5 & ValidationUtils.APPBOY_STRING_MAX_LENGTH] = b2;
                        i++;
                    }
                    return read;
                } catch (IOException e) {
                    this.f62784d = e;
                    throw e;
                }
            } else {
                throw iOException;
            }
        } else {
            throw new XZIOException("Stream closed");
        }
    }
}
