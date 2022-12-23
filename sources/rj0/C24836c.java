package rj0;

import java.io.InputStream;
import org.tukaani.p981xz.UnsupportedOptionsException;

/* renamed from: rj0.c */
public final class C24836c implements C24839f, C24838e {

    /* renamed from: b */
    public final int f62781b;

    public C24836c(byte[] bArr) throws UnsupportedOptionsException {
        if (bArr.length == 1) {
            this.f62781b = (bArr[0] & 255) + 1;
            return;
        }
        throw new UnsupportedOptionsException("Unsupported Delta filter properties");
    }

    /* renamed from: g */
    public final InputStream mo61292g(InputStream inputStream) {
        return new C24837d(inputStream, this.f62781b);
    }

    /* renamed from: j */
    public final int mo61293j() {
        return 1;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ boolean mo19840m() {
        return true;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ boolean mo19841o() {
        return false;
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ boolean mo19842r() {
        return false;
    }
}
