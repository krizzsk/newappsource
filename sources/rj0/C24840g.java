package rj0;

import ci0.C21211f;
import java.io.InputStream;
import org.tukaani.p981xz.UnsupportedOptionsException;

/* renamed from: rj0.g */
public final class C24840g extends C21211f implements C24839f {

    /* renamed from: b */
    public int f62786b;

    public C24840g(byte[] bArr) throws UnsupportedOptionsException {
        if (bArr.length == 1) {
            byte b = bArr[0];
            if ((b & 255) <= 37) {
                this.f62786b = ((b & 1) | 2) << ((b >>> 1) + 11);
                return;
            }
        }
        throw new UnsupportedOptionsException("Unsupported LZMA2 properties");
    }

    /* renamed from: g */
    public final InputStream mo61292g(InputStream inputStream) {
        return new C24841h(inputStream, this.f62786b);
    }

    /* renamed from: j */
    public final int mo61293j() {
        return (C24841h.m62381f(this.f62786b) / 1024) + 104;
    }
}
