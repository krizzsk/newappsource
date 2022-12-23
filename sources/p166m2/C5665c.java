package p166m2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* renamed from: m2.c */
public final class C5665c {

    /* renamed from: m2.c$a */
    public static class C5666a {

        /* renamed from: a */
        public long f18434a;

        /* renamed from: b */
        public long f18435b;
    }

    /* renamed from: a */
    public static C5666a m13938a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C5666a aVar = new C5666a();
                    aVar.f18435b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f18434a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder k = C13555b.m33972k("File too short to be a zip file: ");
        k.append(randomAccessFile.length());
        throw new ZipException(k.toString());
    }
}
