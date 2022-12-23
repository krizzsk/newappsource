package p434dd;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: dd.g0 */
public final class C16554g0 implements C16585w {

    /* renamed from: a */
    public final FileChannel f43189a;

    /* renamed from: b */
    public final long f43190b;

    /* renamed from: c */
    public final long f43191c;

    public C16554g0(FileChannel fileChannel, long j, long j2) {
        this.f43189a = fileChannel;
        this.f43190b = j;
        this.f43191c = j2;
    }

    public final long zza() {
        return this.f43191c;
    }

    public final void zzb(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f43189a.map(FileChannel.MapMode.READ_ONLY, this.f43190b + j, (long) i);
        map.load();
        for (MessageDigest update : messageDigestArr) {
            map.position(0);
            update.update(map);
        }
    }
}
