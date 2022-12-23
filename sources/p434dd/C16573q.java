package p434dd;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: dd.q */
public final class C16573q implements C16585w {

    /* renamed from: a */
    public final ByteBuffer f43232a;

    public C16573q(ByteBuffer byteBuffer) {
        this.f43232a = byteBuffer.slice();
    }

    public final long zza() {
        return (long) this.f43232a.capacity();
    }

    public final void zzb(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer slice;
        synchronized (this.f43232a) {
            int i2 = (int) j;
            this.f43232a.position(i2);
            this.f43232a.limit(i2 + i);
            slice = this.f43232a.slice();
        }
        for (MessageDigest update : messageDigestArr) {
            slice.position(0);
            update.update(slice);
        }
    }
}
