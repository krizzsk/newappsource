package tj0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import org.tukaani.p981xz.CorruptedInputException;
import p583jk.C17884p;

/* renamed from: tj0.a */
public final class C25015a extends C17884p {
    /* renamed from: g0 */
    public static long m62723g0(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            long j = (long) (read & 127);
            int i = 0;
            while ((read & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                i++;
                if (i < 9) {
                    read = inputStream.read();
                    if (read == -1) {
                        throw new EOFException();
                    } else if (read != 0) {
                        j |= ((long) (read & 127)) << (i * 7);
                    } else {
                        throw new CorruptedInputException();
                    }
                } else {
                    throw new CorruptedInputException();
                }
            }
            return j;
        }
        throw new EOFException();
    }

    /* renamed from: h0 */
    public static boolean m62724h0(int i, int i2, int i3, byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) ((int) (value >>> (i4 * 8)))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }
}
