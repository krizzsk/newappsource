package org.tukaani.p981xz;

import ce0.C21100e;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import sj0.C24924c;
import tj0.C25015a;
import tj0.C25016b;
import vj0.C25126b;

/* renamed from: org.tukaani.xz.b */
public final class C24680b extends InputStream {

    /* renamed from: b */
    public InputStream f62491b;

    /* renamed from: c */
    public final int f62492c;

    /* renamed from: d */
    public final C25016b f62493d;

    /* renamed from: e */
    public final C24924c f62494e;

    /* renamed from: f */
    public final boolean f62495f;

    /* renamed from: g */
    public C24679a f62496g = null;

    /* renamed from: h */
    public final C25126b f62497h = new C25126b();

    /* renamed from: i */
    public boolean f62498i;

    /* renamed from: j */
    public IOException f62499j;

    /* renamed from: k */
    public final byte[] f62500k;

    public C24680b(InputStream inputStream, int i, boolean z, byte[] bArr) throws IOException {
        int i2 = 0;
        this.f62498i = false;
        this.f62499j = null;
        this.f62500k = new byte[1];
        this.f62491b = inputStream;
        this.f62492c = i;
        this.f62495f = z;
        while (true) {
            byte[] bArr2 = C21100e.f52946g;
            if (i2 < 6) {
                if (bArr[i2] == bArr2[i2]) {
                    i2++;
                } else {
                    throw new XZFormatException();
                }
            } else if (C25015a.m62724h0(6, 2, 8, bArr)) {
                try {
                    if (bArr[6] == 0) {
                        byte b = bArr[7];
                        if ((b & 255) < 16) {
                            C25016b bVar = new C25016b();
                            bVar.f63183a = b;
                            this.f62493d = bVar;
                            this.f62494e = C24924c.m62604b(b);
                            return;
                        }
                    }
                    throw new UnsupportedOptionsException();
                } catch (UnsupportedOptionsException unused) {
                    throw new UnsupportedOptionsException("Unsupported options in XZ Stream Header");
                }
            } else {
                throw new CorruptedInputException("XZ Stream Header is corrupt");
            }
        }
    }

    public final int available() throws IOException {
        if (this.f62491b != null) {
            IOException iOException = this.f62499j;
            if (iOException == null) {
                C24679a aVar = this.f62496g;
                if (aVar == null) {
                    return 0;
                }
                return aVar.available();
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    public final void close() throws IOException {
        InputStream inputStream = this.f62491b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f62491b = null;
            }
        }
    }

    /* renamed from: e */
    public final void mo61130e() throws IOException {
        boolean z;
        byte[] bArr = new byte[12];
        new DataInputStream(this.f62491b).readFully(bArr);
        byte b = bArr[10];
        byte[] bArr2 = C21100e.f52947h;
        int i = 0;
        if (b != bArr2[0] || bArr[11] != bArr2[1]) {
            throw new CorruptedInputException("XZ Stream Footer is corrupt");
        } else if (C25015a.m62724h0(4, 6, 0, bArr)) {
            try {
                if (bArr[8] == 0) {
                    byte b2 = bArr[9];
                    if ((b2 & 255) < 16) {
                        long j = 0;
                        for (int i2 = 0; i2 < 4; i2++) {
                            j |= (long) ((bArr[i2 + 4] & 255) << (i2 * 8));
                        }
                        long j2 = (j + 1) * 4;
                        if (this.f62493d.f63183a == b2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            C25126b bVar = this.f62497h;
                            long j3 = bVar.f63406e;
                            do {
                                i++;
                                j3 >>= 7;
                            } while (j3 != 0);
                            if (((((long) (i + 1)) + bVar.f63405d + 4 + 3) & -4) == j2) {
                                return;
                            }
                        }
                        throw new CorruptedInputException("XZ Stream Footer does not match Stream Header");
                    }
                }
                throw new UnsupportedOptionsException();
            } catch (UnsupportedOptionsException unused) {
                throw new UnsupportedOptionsException("Unsupported options in XZ Stream Footer");
            }
        } else {
            throw new CorruptedInputException("XZ Stream Footer is corrupt");
        }
    }

    public final int read() throws IOException {
        if (read(this.f62500k, 0, 1) == -1) {
            return -1;
        }
        return this.f62500k[0] & 255;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:20|21|22|23|(2:25|46)(1:47)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0033 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[Catch:{ IOException -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[Catch:{ IOException -> 0x006d }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            if (r10 < 0) goto L_0x007e
            if (r11 < 0) goto L_0x007e
            int r0 = r10 + r11
            if (r0 < 0) goto L_0x007e
            int r1 = r9.length
            if (r0 > r1) goto L_0x007e
            r0 = 0
            if (r11 != 0) goto L_0x000f
            return r0
        L_0x000f:
            java.io.InputStream r1 = r8.f62491b
            if (r1 == 0) goto L_0x0076
            java.io.IOException r1 = r8.f62499j
            if (r1 != 0) goto L_0x0075
            boolean r1 = r8.f62498i
            r2 = -1
            if (r1 == 0) goto L_0x001d
            return r2
        L_0x001d:
            if (r11 <= 0) goto L_0x0074
            org.tukaani.xz.a r1 = r8.f62496g     // Catch:{ IOException -> 0x006d }
            if (r1 != 0) goto L_0x0044
            org.tukaani.xz.a r1 = new org.tukaani.xz.a     // Catch:{ IndexIndicatorException -> 0x0033 }
            java.io.InputStream r3 = r8.f62491b     // Catch:{ IndexIndicatorException -> 0x0033 }
            sj0.c r4 = r8.f62494e     // Catch:{ IndexIndicatorException -> 0x0033 }
            boolean r5 = r8.f62495f     // Catch:{ IndexIndicatorException -> 0x0033 }
            int r6 = r8.f62492c     // Catch:{ IndexIndicatorException -> 0x0033 }
            r1.<init>(r3, r4, r5, r6)     // Catch:{ IndexIndicatorException -> 0x0033 }
            r8.f62496g = r1     // Catch:{ IndexIndicatorException -> 0x0033 }
            goto L_0x0044
        L_0x0033:
            vj0.b r9 = r8.f62497h     // Catch:{ IOException -> 0x006d }
            java.io.InputStream r10 = r8.f62491b     // Catch:{ IOException -> 0x006d }
            r9.mo61740b(r10)     // Catch:{ IOException -> 0x006d }
            r8.mo61130e()     // Catch:{ IOException -> 0x006d }
            r9 = 1
            r8.f62498i = r9     // Catch:{ IOException -> 0x006d }
            if (r0 <= 0) goto L_0x0043
            r2 = r0
        L_0x0043:
            return r2
        L_0x0044:
            org.tukaani.xz.a r1 = r8.f62496g     // Catch:{ IOException -> 0x006d }
            int r1 = r1.read(r9, r10, r11)     // Catch:{ IOException -> 0x006d }
            if (r1 <= 0) goto L_0x0050
            int r0 = r0 + r1
            int r10 = r10 + r1
            int r11 = r11 - r1
            goto L_0x001d
        L_0x0050:
            if (r1 != r2) goto L_0x001d
            vj0.b r1 = r8.f62497h     // Catch:{ IOException -> 0x006d }
            org.tukaani.xz.a r3 = r8.f62496g     // Catch:{ IOException -> 0x006d }
            int r4 = r3.f62487j     // Catch:{ IOException -> 0x006d }
            long r4 = (long) r4     // Catch:{ IOException -> 0x006d }
            rj0.b r6 = r3.f62480c     // Catch:{ IOException -> 0x006d }
            long r6 = r6.f62780b     // Catch:{ IOException -> 0x006d }
            long r4 = r4 + r6
            sj0.c r6 = r3.f62482e     // Catch:{ IOException -> 0x006d }
            int r6 = r6.f63004a     // Catch:{ IOException -> 0x006d }
            long r6 = (long) r6     // Catch:{ IOException -> 0x006d }
            long r4 = r4 + r6
            long r6 = r3.f62488k     // Catch:{ IOException -> 0x006d }
            r1.mo61739a(r4, r6)     // Catch:{ IOException -> 0x006d }
            r1 = 0
            r8.f62496g = r1     // Catch:{ IOException -> 0x006d }
            goto L_0x001d
        L_0x006d:
            r9 = move-exception
            r8.f62499j = r9
            if (r0 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            throw r9
        L_0x0074:
            return r0
        L_0x0075:
            throw r1
        L_0x0076:
            org.tukaani.xz.XZIOException r9 = new org.tukaani.xz.XZIOException
            java.lang.String r10 = "Stream closed"
            r9.<init>(r10)
            throw r9
        L_0x007e:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.p981xz.C24680b.read(byte[], int, int):int");
    }
}
