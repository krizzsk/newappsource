package si0;

import java.io.OutputStream;
import mf0.C24362h;

/* renamed from: si0.g */
public final class C24900g extends OutputStream {

    /* renamed from: b */
    public final /* synthetic */ C24898f f62949b;

    public C24900g(C24898f fVar) {
        this.f62949b = fVar;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f62949b + ".outputStream()";
    }

    public final void write(int i) {
        this.f62949b.mo61395V(i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        C24362h.m61211f(bArr, "data");
        this.f62949b.mo61392T(i, i2, bArr);
    }
}
