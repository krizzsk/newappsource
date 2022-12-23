package org.tukaani.p981xz;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import p001a0.C0016g;
import rj0.C24834a;
import rj0.C24835b;
import rj0.C24836c;
import rj0.C24839f;
import rj0.C24840g;
import rj0.C24842i;
import sj0.C24924c;
import tj0.C25015a;

/* renamed from: org.tukaani.xz.a */
public final class C24679a extends InputStream {

    /* renamed from: b */
    public final DataInputStream f62479b;

    /* renamed from: c */
    public final C24835b f62480c;

    /* renamed from: d */
    public InputStream f62481d;

    /* renamed from: e */
    public final C24924c f62482e;

    /* renamed from: f */
    public final boolean f62483f;

    /* renamed from: g */
    public long f62484g = -1;

    /* renamed from: h */
    public long f62485h = -1;

    /* renamed from: i */
    public long f62486i;

    /* renamed from: j */
    public final int f62487j;

    /* renamed from: k */
    public long f62488k = 0;

    /* renamed from: l */
    public boolean f62489l = false;

    /* renamed from: m */
    public final byte[] f62490m = new byte[1];

    public C24679a(InputStream inputStream, C24924c cVar, boolean z, int i) throws IOException, IndexIndicatorException {
        boolean z2;
        this.f62482e = cVar;
        this.f62483f = z;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f62479b = dataInputStream;
        byte[] bArr = new byte[1024];
        dataInputStream.readFully(bArr, 0, 1);
        byte b = bArr[0];
        if (b != 0) {
            int i2 = ((b & 255) + 1) * 4;
            this.f62487j = i2;
            dataInputStream.readFully(bArr, 1, i2 - 1);
            int i3 = i2 - 4;
            if (C25015a.m62724h0(0, i3, i3, bArr)) {
                byte b2 = bArr[1];
                if ((b2 & 60) == 0) {
                    int i4 = (b2 & 3) + 1;
                    long[] jArr = new long[i4];
                    byte[][] bArr2 = new byte[i4][];
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 2, i2 - 6);
                    try {
                        this.f62486i = (9223372036854775804L - ((long) i2)) - ((long) cVar.f63004a);
                        if ((bArr[1] & 64) != 0) {
                            long g0 = C25015a.m62723g0(byteArrayInputStream);
                            this.f62485h = g0;
                            if (g0 == 0 || g0 > this.f62486i) {
                                throw new CorruptedInputException();
                            }
                            this.f62486i = g0;
                        }
                        if ((bArr[1] & 128) != 0) {
                            this.f62484g = C25015a.m62723g0(byteArrayInputStream);
                        }
                        int i5 = 0;
                        while (i5 < i4) {
                            jArr[i5] = C25015a.m62723g0(byteArrayInputStream);
                            long g02 = C25015a.m62723g0(byteArrayInputStream);
                            if (g02 <= ((long) byteArrayInputStream.available())) {
                                byte[] bArr3 = new byte[((int) g02)];
                                bArr2[i5] = bArr3;
                                byteArrayInputStream.read(bArr3);
                                i5++;
                            } else {
                                throw new CorruptedInputException();
                            }
                        }
                        int available = byteArrayInputStream.available();
                        while (available > 0) {
                            if (byteArrayInputStream.read() == 0) {
                                available--;
                            } else {
                                throw new UnsupportedOptionsException("Unsupported options in XZ Block Header");
                            }
                        }
                        C24839f[] fVarArr = new C24839f[i4];
                        for (int i6 = 0; i6 < i4; i6++) {
                            long j = jArr[i6];
                            if (j == 33) {
                                fVarArr[i6] = new C24840g(bArr2[i6]);
                            } else if (j == 3) {
                                fVarArr[i6] = new C24836c(bArr2[i6]);
                            } else {
                                if (j < 4 || j > 9) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    fVarArr[i6] = new C24834a(jArr[i6], bArr2[i6]);
                                } else {
                                    StringBuffer q = C0016g.m33q("Unknown Filter ID ");
                                    q.append(jArr[i6]);
                                    throw new UnsupportedOptionsException(q.toString());
                                }
                            }
                        }
                        C24842i.m62383a(fVarArr);
                        if (i >= 0) {
                            int i7 = 0;
                            for (int i8 = 0; i8 < i4; i8++) {
                                i7 += fVarArr[i8].mo61293j();
                            }
                            if (i7 > i) {
                                throw new MemoryLimitException(i7, i);
                            }
                        }
                        C24835b bVar = new C24835b(inputStream);
                        this.f62480c = bVar;
                        this.f62481d = bVar;
                        for (int i9 = i4 - 1; i9 >= 0; i9--) {
                            this.f62481d = fVarArr[i9].mo61292g(this.f62481d);
                        }
                    } catch (IOException unused) {
                        throw new CorruptedInputException("XZ Block Header is corrupt");
                    }
                } else {
                    throw new UnsupportedOptionsException("Unsupported options in XZ Block Header");
                }
            } else {
                throw new CorruptedInputException("XZ Block Header is corrupt");
            }
        } else {
            throw new IndexIndicatorException();
        }
    }

    public final int available() throws IOException {
        return this.f62481d.available();
    }

    /* renamed from: e */
    public final void mo61125e() throws IOException {
        long j = this.f62480c.f62780b;
        long j2 = this.f62485h;
        if (j2 == -1 || j2 == j) {
            long j3 = this.f62484g;
            if (j3 == -1 || j3 == this.f62488k) {
                while (true) {
                    long j4 = 1 + j;
                    if ((j & 3) == 0) {
                        byte[] bArr = new byte[this.f62482e.f63004a];
                        this.f62479b.readFully(bArr);
                        if (this.f62483f && !Arrays.equals(this.f62482e.mo61479a(), bArr)) {
                            StringBuffer q = C0016g.m33q("Integrity check (");
                            q.append(this.f62482e.f63005b);
                            q.append(") does not match");
                            throw new CorruptedInputException(q.toString());
                        }
                        return;
                    } else if (this.f62479b.readUnsignedByte() == 0) {
                        j = j4;
                    } else {
                        throw new CorruptedInputException();
                    }
                }
            }
        }
        throw new CorruptedInputException();
    }

    public final int read() throws IOException {
        if (read(this.f62490m, 0, 1) == -1) {
            return -1;
        }
        return this.f62490m[0] & 255;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        if (r0 == -1) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r11, int r12, int r13) throws java.io.IOException {
        /*
            r10 = this;
            boolean r0 = r10.f62489l
            r1 = -1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.io.InputStream r0 = r10.f62481d
            int r0 = r0.read(r11, r12, r13)
            r2 = 1
            if (r0 <= 0) goto L_0x0059
            boolean r3 = r10.f62483f
            if (r3 == 0) goto L_0x0018
            sj0.c r3 = r10.f62482e
            r3.mo61480c(r12, r0, r11)
        L_0x0018:
            long r11 = r10.f62488k
            long r3 = (long) r0
            long r11 = r11 + r3
            r10.f62488k = r11
            rj0.b r3 = r10.f62480c
            long r3 = r3.f62780b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0053
            long r7 = r10.f62486i
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0053
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0053
            long r3 = r10.f62484g
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x003e
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0053
        L_0x003e:
            if (r0 < r13) goto L_0x0044
            int r13 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0060
        L_0x0044:
            java.io.InputStream r11 = r10.f62481d
            int r11 = r11.read()
            if (r11 != r1) goto L_0x004d
            goto L_0x005b
        L_0x004d:
            org.tukaani.xz.CorruptedInputException r11 = new org.tukaani.xz.CorruptedInputException
            r11.<init>()
            throw r11
        L_0x0053:
            org.tukaani.xz.CorruptedInputException r11 = new org.tukaani.xz.CorruptedInputException
            r11.<init>()
            throw r11
        L_0x0059:
            if (r0 != r1) goto L_0x0060
        L_0x005b:
            r10.mo61125e()
            r10.f62489l = r2
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.p981xz.C24679a.read(byte[], int, int):int");
    }
}
