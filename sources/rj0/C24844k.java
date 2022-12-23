package rj0;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.tukaani.p981xz.C24680b;
import org.tukaani.p981xz.XZIOException;

/* renamed from: rj0.k */
public final class C24844k extends InputStream {

    /* renamed from: b */
    public final int f62809b;

    /* renamed from: c */
    public InputStream f62810c;

    /* renamed from: d */
    public C24680b f62811d;

    /* renamed from: e */
    public final boolean f62812e;

    /* renamed from: f */
    public boolean f62813f = false;

    /* renamed from: g */
    public IOException f62814g = null;

    /* renamed from: h */
    public final byte[] f62815h = new byte[1];

    public C24844k(FileInputStream fileInputStream) throws IOException {
        this.f62810c = fileInputStream;
        this.f62809b = -1;
        this.f62812e = true;
        byte[] bArr = new byte[12];
        new DataInputStream(fileInputStream).readFully(bArr);
        this.f62811d = new C24680b(fileInputStream, -1, true, bArr);
    }

    public final int available() throws IOException {
        if (this.f62810c != null) {
            IOException iOException = this.f62814g;
            if (iOException == null) {
                C24680b bVar = this.f62811d;
                if (bVar == null) {
                    return 0;
                }
                return bVar.available();
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    public final void close() throws IOException {
        InputStream inputStream = this.f62810c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f62810c = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0017  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61311e() throws java.io.IOException {
        /*
            r6 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            java.io.InputStream r1 = r6.f62810c
            r0.<init>(r1)
            r1 = 12
            byte[] r1 = new byte[r1]
        L_0x000b:
            r2 = 0
            r3 = 1
            int r4 = r0.read(r1, r2, r3)
            r5 = -1
            if (r4 != r5) goto L_0x0017
            r6.f62813f = r3
            return
        L_0x0017:
            r4 = 3
            r0.readFully(r1, r3, r4)
            byte r2 = r1[r2]
            if (r2 != 0) goto L_0x002c
            byte r2 = r1[r3]
            if (r2 != 0) goto L_0x002c
            r2 = 2
            byte r2 = r1[r2]
            if (r2 != 0) goto L_0x002c
            byte r2 = r1[r4]
            if (r2 == 0) goto L_0x000b
        L_0x002c:
            r2 = 4
            r3 = 8
            r0.readFully(r1, r2, r3)
            org.tukaani.xz.b r0 = new org.tukaani.xz.b     // Catch:{ XZFormatException -> 0x0040 }
            java.io.InputStream r2 = r6.f62810c     // Catch:{ XZFormatException -> 0x0040 }
            int r3 = r6.f62809b     // Catch:{ XZFormatException -> 0x0040 }
            boolean r4 = r6.f62812e     // Catch:{ XZFormatException -> 0x0040 }
            r0.<init>(r2, r3, r4, r1)     // Catch:{ XZFormatException -> 0x0040 }
            r6.f62811d = r0     // Catch:{ XZFormatException -> 0x0040 }
            return
        L_0x0040:
            org.tukaani.xz.CorruptedInputException r0 = new org.tukaani.xz.CorruptedInputException
            java.lang.String r1 = "Garbage after a valid XZ Stream"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rj0.C24844k.mo61311e():void");
    }

    public final int read() throws IOException {
        if (read(this.f62815h, 0, 1) == -1) {
            return -1;
        }
        return this.f62815h[0] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f62810c != null) {
            IOException iOException = this.f62814g;
            if (iOException != null) {
                throw iOException;
            } else if (this.f62813f) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        if (this.f62811d == null) {
                            mo61311e();
                            if (this.f62813f) {
                                if (i4 == 0) {
                                    return -1;
                                }
                                return i4;
                            }
                        }
                        int read = this.f62811d.read(bArr, i, i2);
                        if (read > 0) {
                            i4 += read;
                            i += read;
                            i2 -= read;
                        } else if (read == -1) {
                            this.f62811d = null;
                        }
                    } catch (IOException e) {
                        this.f62814g = e;
                        if (i4 == 0) {
                            throw e;
                        }
                    }
                }
                return i4;
            }
        } else {
            throw new XZIOException("Stream closed");
        }
    }
}
