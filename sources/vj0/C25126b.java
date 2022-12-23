package vj0;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import org.tukaani.p981xz.CorruptedInputException;
import org.tukaani.p981xz.XZIOException;
import sj0.C24922a;
import sj0.C24924c;
import sj0.C24926e;
import tj0.C25015a;

/* renamed from: vj0.b */
public final class C25126b extends C25125a {

    /* renamed from: f */
    public C24924c f63407f;

    public C25126b() {
        super(new CorruptedInputException());
        try {
            this.f63407f = new C24926e();
        } catch (NoSuchAlgorithmException unused) {
            this.f63407f = new C24922a();
        }
    }

    /* renamed from: a */
    public final void mo61739a(long j, long j2) throws XZIOException {
        super.mo61739a(j, j2);
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(j);
        allocate.putLong(j2);
        C24924c cVar = this.f63407f;
        byte[] array = allocate.array();
        cVar.getClass();
        cVar.mo61480c(0, array.length, array);
    }

    /* renamed from: b */
    public final void mo61740b(InputStream inputStream) throws IOException {
        CRC32 crc32 = new CRC32();
        int i = 0;
        crc32.update(0);
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, crc32);
        if (C25015a.m62723g0(checkedInputStream) == this.f63406e) {
            C25126b bVar = new C25126b();
            long j = 0;
            while (j < this.f63406e) {
                try {
                    bVar.mo61739a(C25015a.m62723g0(checkedInputStream), C25015a.m62723g0(checkedInputStream));
                    if (bVar.f63403b > this.f63403b || bVar.f63404c > this.f63404c || bVar.f63405d > this.f63405d) {
                        throw new CorruptedInputException("XZ Index is corrupt");
                    }
                    j++;
                } catch (XZIOException unused) {
                    throw new CorruptedInputException("XZ Index is corrupt");
                }
            }
            if (bVar.f63403b == this.f63403b && bVar.f63404c == this.f63404c && bVar.f63405d == this.f63405d && Arrays.equals(bVar.f63407f.mo61479a(), this.f63407f.mo61479a())) {
                DataInputStream dataInputStream = new DataInputStream(checkedInputStream);
                long j2 = this.f63406e;
                int i2 = 0;
                do {
                    i2++;
                    j2 >>= 7;
                } while (j2 != 0);
                int i3 = (int) (3 & (4 - ((((long) (i2 + 1)) + this.f63405d) + 4)));
                while (i3 > 0) {
                    if (dataInputStream.readUnsignedByte() == 0) {
                        i3--;
                    } else {
                        throw new CorruptedInputException("XZ Index is corrupt");
                    }
                }
                long value = crc32.getValue();
                while (i < 4) {
                    if (((value >>> (i * 8)) & 255) == ((long) dataInputStream.readUnsignedByte())) {
                        i++;
                    } else {
                        throw new CorruptedInputException("XZ Index is corrupt");
                    }
                }
                return;
            }
            throw new CorruptedInputException("XZ Index is corrupt");
        }
        throw new CorruptedInputException("XZ Block Header or the start of XZ Index is corrupt");
    }
}
