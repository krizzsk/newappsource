package xi0;

import java.io.IOException;
import java.io.InputStream;
import org.apache.thrift.transport.TTransportException;

/* renamed from: xi0.b */
public abstract class C25277b {
    /* renamed from: a */
    public abstract void mo61877a() throws TTransportException;

    /* renamed from: b */
    public final int mo61879b(int i, byte[] bArr) throws TTransportException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = 0 + i2;
            int i4 = i - i2;
            InputStream inputStream = ((C25276a) this).f63550a;
            if (inputStream != null) {
                try {
                    int read = inputStream.read(bArr, i3, i4);
                    if (read < 0) {
                        throw new TTransportException();
                    } else if (read > 0) {
                        i2 += read;
                    } else {
                        throw new TTransportException("Cannot read. Remote side has closed. Tried to read " + i + " bytes, but only got " + i2 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
                    }
                } catch (IOException e) {
                    throw new TTransportException(e);
                }
            } else {
                throw new TTransportException("Cannot read from null inputStream", 0);
            }
        }
        return i2;
    }

    /* renamed from: c */
    public abstract void mo61878c(byte[] bArr, int i, int i2) throws TTransportException;
}
