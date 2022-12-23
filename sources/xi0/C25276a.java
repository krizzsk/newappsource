package xi0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.thrift.transport.TTransportException;

/* renamed from: xi0.a */
public final class C25276a extends C25277b {

    /* renamed from: a */
    public InputStream f63550a;

    /* renamed from: b */
    public OutputStream f63551b;

    public C25276a(InputStream inputStream) {
        this.f63551b = null;
        this.f63550a = inputStream;
    }

    /* renamed from: a */
    public final void mo61877a() throws TTransportException {
        OutputStream outputStream = this.f63551b;
        if (outputStream != null) {
            try {
                outputStream.flush();
            } catch (IOException e) {
                throw new TTransportException(e);
            }
        } else {
            throw new TTransportException("Cannot flush null outputStream", 0);
        }
    }

    /* renamed from: c */
    public final void mo61878c(byte[] bArr, int i, int i2) throws TTransportException {
        OutputStream outputStream = this.f63551b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException e) {
                throw new TTransportException(e);
            }
        } else {
            throw new TTransportException("Cannot write to null outputStream", 0);
        }
    }

    public C25276a(OutputStream outputStream) {
        this.f63550a = null;
        this.f63551b = outputStream;
    }
}
