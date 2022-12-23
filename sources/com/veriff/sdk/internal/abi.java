package com.veriff.sdk.internal;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p001a0.C0016g;

public final class abi implements abj, abk, Cloneable, ByteChannel {

    /* renamed from: c */
    private static final byte[] f53554c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    public abw f53555a;

    /* renamed from: b */
    public long f53556b;

    /* renamed from: a */
    public void mo53860a(long j) throws EOFException {
        if (this.f53556b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: a_ */
    public void mo53675a_(abi abi, long j) {
        abw abw;
        int i;
        if (abi == null) {
            throw new IllegalArgumentException("source == null");
        } else if (abi != this) {
            acc.m50627a(abi.f53556b, 0, j);
            while (j > 0) {
                abw abw2 = abi.f53555a;
                if (j < ((long) (abw2.f53598c - abw2.f53597b))) {
                    abw abw3 = this.f53555a;
                    if (abw3 != null) {
                        abw = abw3.f53602g;
                    } else {
                        abw = null;
                    }
                    if (abw != null && abw.f53600e) {
                        long j2 = ((long) abw.f53598c) + j;
                        if (abw.f53599d) {
                            i = 0;
                        } else {
                            i = abw.f53597b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            abw2.mo53987a(abw, (int) j);
                            abi.f53556b -= j;
                            this.f53556b += j;
                            return;
                        }
                    }
                    abi.f53555a = abw2.mo53985a((int) j);
                }
                abw abw4 = abi.f53555a;
                long j3 = (long) (abw4.f53598c - abw4.f53597b);
                abi.f53555a = abw4.mo53988b();
                abw abw5 = this.f53555a;
                if (abw5 == null) {
                    this.f53555a = abw4;
                    abw4.f53602g = abw4;
                    abw4.f53601f = abw4;
                } else {
                    abw5.f53602g.mo53986a(abw4).mo53989c();
                }
                abi.f53556b -= j3;
                this.f53556b += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: c */
    public abi mo53875c() {
        return this;
    }

    public void close() {
    }

    /* renamed from: d */
    public abi mo53880d() {
        return this;
    }

    /* renamed from: e */
    public abi mo53924y() {
        return this;
    }

    /* renamed from: e */
    public String mo53886e(long j) throws EOFException {
        return mo53858a(j, acc.f53612a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abi)) {
            return false;
        }
        abi abi = (abi) obj;
        long j = this.f53556b;
        if (j != abi.f53556b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        abw abw = this.f53555a;
        abw abw2 = abi.f53555a;
        int i = abw.f53597b;
        int i2 = abw2.f53597b;
        while (j2 < this.f53556b) {
            long min = (long) Math.min(abw.f53598c - i, abw2.f53598c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (abw.f53596a[i] != abw2.f53596a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == abw.f53598c) {
                abw = abw.f53601f;
                i = abw.f53597b;
            }
            if (i2 == abw2.f53598c) {
                abw2 = abw2.f53601f;
                i2 = abw2.f53597b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo53890f() {
        return this.f53556b == 0;
    }

    public void flush() {
    }

    public int hashCode() {
        abw abw = this.f53555a;
        if (abw == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = abw.f53598c;
            for (int i3 = abw.f53597b; i3 < i2; i3++) {
                i = (i * 31) + abw.f53596a[i3];
            }
            abw = abw.f53601f;
        } while (abw != this.f53555a);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public byte mo53902j() {
        long j = this.f53556b;
        if (j != 0) {
            abw abw = this.f53555a;
            int i = abw.f53597b;
            int i2 = abw.f53598c;
            int i3 = i + 1;
            byte b = abw.f53596a[i];
            this.f53556b = j - 1;
            if (i3 == i2) {
                this.f53555a = abw.mo53988b();
                abx.m50590a(abw);
            } else {
                abw.f53597b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: k */
    public short mo53905k() {
        long j = this.f53556b;
        if (j >= 2) {
            abw abw = this.f53555a;
            int i = abw.f53597b;
            int i2 = abw.f53598c;
            if (i2 - i < 2) {
                return (short) (((mo53902j() & 255) << 8) | (mo53902j() & 255));
            }
            byte[] bArr = abw.f53596a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f53556b = j - 2;
            if (i4 == i2) {
                this.f53555a = abw.mo53988b();
                abx.m50590a(abw);
            } else {
                abw.f53597b = i4;
            }
            return (short) b;
        }
        StringBuilder k = C13555b.m33972k("size < 2: ");
        k.append(this.f53556b);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: n */
    public int mo53910n() {
        return acc.m50625a(mo53906l());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        if (r8 == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return r3;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo53911o() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f53556b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00bd
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x0014:
            com.veriff.sdk.internal.abw r10 = r0.f53555a
            byte[] r11 = r10.f53596a
            int r12 = r10.f53597b
            int r13 = r10.f53598c
        L_0x001c:
            if (r12 >= r13) goto L_0x0096
            byte r14 = r11[r12]
            r15 = 48
            if (r14 < r15) goto L_0x0066
            r15 = 57
            if (r14 > r15) goto L_0x0066
            int r15 = 48 - r14
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003d
            if (r16 != 0) goto L_0x0036
            long r1 = (long) r15
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L_0x0036
            goto L_0x003d
        L_0x0036:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r15
            long r3 = r3 + r1
            goto L_0x0070
        L_0x003d:
            com.veriff.sdk.internal.abi r1 = new com.veriff.sdk.internal.abi
            r1.<init>()
            com.veriff.sdk.internal.abi r1 = r1.mo53908m(r3)
            com.veriff.sdk.internal.abi r1 = r1.mo53899i((int) r14)
            if (r8 != 0) goto L_0x004f
            r1.mo53902j()
        L_0x004f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = "Number too large: "
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            java.lang.String r1 = r1.mo53914r()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0066:
            r1 = 45
            if (r14 != r1) goto L_0x007a
            if (r7 != 0) goto L_0x007a
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L_0x0070:
            int r12 = r12 + 1
            int r7 = r7 + 1
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x001c
        L_0x007a:
            if (r7 == 0) goto L_0x007f
            r1 = 1
            r9 = 1
            goto L_0x0096
        L_0x007f:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r14)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0096:
            if (r12 != r13) goto L_0x00a2
            com.veriff.sdk.internal.abw r1 = r10.mo53988b()
            r0.f53555a = r1
            com.veriff.sdk.internal.abx.m50590a(r10)
            goto L_0x00a4
        L_0x00a2:
            r10.f53597b = r12
        L_0x00a4:
            if (r9 != 0) goto L_0x00b2
            com.veriff.sdk.internal.abw r1 = r0.f53555a
            if (r1 != 0) goto L_0x00ab
            goto L_0x00b2
        L_0x00ab:
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L_0x0014
        L_0x00b2:
            long r1 = r0.f53556b
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f53556b = r1
            if (r8 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            long r3 = -r3
        L_0x00bc:
            return r3
        L_0x00bd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.abi.mo53911o():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        if (r8 != r9) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r15.f53555a = r6.mo53988b();
        com.veriff.sdk.internal.abx.m50590a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r6.f53597b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r1 != false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0071 A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo53912p() {
        /*
            r15 = this;
            long r0 = r15.f53556b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a3
            r0 = 0
            r1 = 0
            r4 = r2
        L_0x000b:
            com.veriff.sdk.internal.abw r6 = r15.f53555a
            byte[] r7 = r6.f53596a
            int r8 = r6.f53597b
            int r9 = r6.f53598c
        L_0x0013:
            if (r8 >= r9) goto L_0x0088
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0039
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -97
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x006d
            r11 = 70
            if (r10 > r11) goto L_0x006d
            int r11 = r10 + -65
        L_0x0037:
            int r11 = r11 + 10
        L_0x0039:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0049
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0049:
            com.veriff.sdk.internal.abi r0 = new com.veriff.sdk.internal.abi
            r0.<init>()
            com.veriff.sdk.internal.abi r0 = r0.mo53907l(r4)
            com.veriff.sdk.internal.abi r0 = r0.mo53899i((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r0 = r0.mo53914r()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006d:
            if (r0 == 0) goto L_0x0071
            r1 = 1
            goto L_0x0088
        L_0x0071:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0088:
            if (r8 != r9) goto L_0x0094
            com.veriff.sdk.internal.abw r7 = r6.mo53988b()
            r15.f53555a = r7
            com.veriff.sdk.internal.abx.m50590a(r6)
            goto L_0x0096
        L_0x0094:
            r6.f53597b = r8
        L_0x0096:
            if (r1 != 0) goto L_0x009c
            com.veriff.sdk.internal.abw r6 = r15.f53555a
            if (r6 != 0) goto L_0x000b
        L_0x009c:
            long r1 = r15.f53556b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f53556b = r1
            return r4
        L_0x00a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.abi.mo53912p():long");
    }

    /* renamed from: q */
    public abl mo53913q() {
        return new abl(mo53919u());
    }

    /* renamed from: r */
    public String mo53914r() {
        try {
            return mo53858a(this.f53556b, acc.f53612a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        abw abw = this.f53555a;
        if (abw == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), abw.f53598c - abw.f53597b);
        byteBuffer.put(abw.f53596a, abw.f53597b, min);
        int i = abw.f53597b + min;
        abw.f53597b = i;
        this.f53556b -= (long) min;
        if (i == abw.f53598c) {
            this.f53555a = abw.mo53988b();
            abx.m50590a(abw);
        }
        return min;
    }

    /* renamed from: s */
    public String mo53916s() throws EOFException {
        return mo53889f(Long.MAX_VALUE);
    }

    /* renamed from: t */
    public int mo53917t() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.f53556b != 0) {
            byte c = mo53873c(0);
            int i2 = 1;
            if ((c & 128) == 0) {
                b2 = c & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((c & 224) == 192) {
                b2 = c & 31;
                i = 2;
                b = 128;
            } else if ((c & 240) == 224) {
                b2 = c & 15;
                i = 3;
                b = 2048;
            } else if ((c & 248) == 240) {
                b2 = c & 7;
                i = 4;
                b = 65536;
            } else {
                mo53900i(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f53556b >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte c2 = mo53873c(j2);
                    if ((c2 & 192) == 128) {
                        b2 = (b2 << 6) | (c2 & 63);
                        i2++;
                    } else {
                        mo53900i(j2);
                        return 65533;
                    }
                }
                mo53900i(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((b2 < 55296 || b2 > 57343) && b2 >= b) {
                    return b2;
                }
                return 65533;
            }
            StringBuilder r = C25541a.m63887r("size < ", i, ": ");
            r.append(this.f53556b);
            r.append(" (to read code point prefixed 0x");
            r.append(Integer.toHexString(c));
            r.append(")");
            throw new EOFException(r.toString());
        }
        throw new EOFException();
    }

    public String toString() {
        return mo53923x().toString();
    }

    /* renamed from: u */
    public byte[] mo53919u() {
        try {
            return mo53896h(this.f53556b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: v */
    public final void mo53920v() {
        try {
            mo53900i(this.f53556b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: w */
    public abi clone() {
        abi abi = new abi();
        if (this.f53556b == 0) {
            return abi;
        }
        abw a = this.f53555a.mo53984a();
        abi.f53555a = a;
        a.f53602g = a;
        a.f53601f = a;
        abw abw = this.f53555a;
        while (true) {
            abw = abw.f53601f;
            if (abw != this.f53555a) {
                abi.f53555a.f53602g.mo53986a(abw.mo53984a());
            } else {
                abi.f53556b = this.f53556b;
                return abi;
            }
        }
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                abw e = mo53885e(1);
                int min = Math.min(i, 8192 - e.f53598c);
                byteBuffer.get(e.f53596a, e.f53598c, min);
                i -= min;
                e.f53598c += min;
            }
            this.f53556b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: x */
    public final abl mo53923x() {
        long j = this.f53556b;
        if (j <= 2147483647L) {
            return mo53888f((int) j);
        }
        StringBuilder k = C13555b.m33972k("size > Integer.MAX_VALUE: ");
        k.append(this.f53556b);
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: a */
    public final abi mo53852a(abi abi, long j, long j2) {
        if (abi != null) {
            acc.m50627a(this.f53556b, j, j2);
            if (j2 == 0) {
                return this;
            }
            abi.f53556b += j2;
            abw abw = this.f53555a;
            while (true) {
                int i = abw.f53598c;
                int i2 = abw.f53597b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                abw = abw.f53601f;
            }
            while (j2 > 0) {
                abw a = abw.mo53984a();
                int i3 = (int) (((long) a.f53597b) + j);
                a.f53597b = i3;
                a.f53598c = Math.min(i3 + ((int) j2), a.f53598c);
                abw abw2 = abi.f53555a;
                if (abw2 == null) {
                    a.f53602g = a;
                    a.f53601f = a;
                    abi.f53555a = a;
                } else {
                    abw2.f53602g.mo53986a(a);
                }
                j2 -= (long) (a.f53598c - a.f53597b);
                abw = abw.f53601f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: d */
    public abl mo53883d(long j) throws EOFException {
        return new abl(mo53896h(j));
    }

    /* renamed from: e */
    public abw mo53885e(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        abw abw = this.f53555a;
        if (abw == null) {
            abw a = abx.m50589a();
            this.f53555a = a;
            a.f53602g = a;
            a.f53601f = a;
            return a;
        }
        abw abw2 = abw.f53602g;
        return (abw2.f53598c + i > 8192 || !abw2.f53600e) ? abw2.mo53986a(abx.m50589a()) : abw2;
    }

    /* renamed from: f */
    public String mo53889f(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a = mo53847a((byte) 10, 0, j2);
            if (a != -1) {
                return mo53893g(a);
            }
            if (j2 < mo53864b() && mo53873c(j2 - 1) == 13 && mo53873c(j2) == 10) {
                return mo53893g(j2);
            }
            abi abi = new abi();
            mo53852a(abi, 0, Math.min(32, mo53864b()));
            StringBuilder k = C13555b.m33972k("\\n not found: limit=");
            k.append(Math.min(mo53864b(), j));
            k.append(" content=");
            k.append(abi.mo53913q().mo53944f());
            k.append(8230);
            throw new EOFException(k.toString());
        }
        throw new IllegalArgumentException(C0016g.m29l("limit < 0: ", j));
    }

    /* renamed from: g */
    public abk mo53892g() {
        return abr.m50508a((aca) new C21326abt(this));
    }

    /* renamed from: h */
    public InputStream mo53895h() {
        return new InputStream() {
            public int available() {
                return (int) Math.min(abi.this.f53556b, 2147483647L);
            }

            public void close() {
            }

            public int read() {
                abi abi = abi.this;
                if (abi.f53556b > 0) {
                    return abi.mo53902j() & 255;
                }
                return -1;
            }

            public String toString() {
                return abi.this + ".inputStream()";
            }

            public int read(byte[] bArr, int i, int i2) {
                return abi.this.mo53845a(bArr, i, i2);
            }
        };
    }

    /* renamed from: i */
    public final long mo53898i() {
        long j = this.f53556b;
        if (j == 0) {
            return 0;
        }
        abw abw = this.f53555a.f53602g;
        int i = abw.f53598c;
        return (i >= 8192 || !abw.f53600e) ? j : j - ((long) (i - abw.f53597b));
    }

    /* renamed from: l */
    public int mo53906l() {
        long j = this.f53556b;
        if (j >= 4) {
            abw abw = this.f53555a;
            int i = abw.f53597b;
            int i2 = abw.f53598c;
            if (i2 - i < 4) {
                return ((mo53902j() & 255) << 24) | ((mo53902j() & 255) << 16) | ((mo53902j() & 255) << 8) | (mo53902j() & 255);
            }
            byte[] bArr = abw.f53596a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f53556b = j - 4;
            if (i6 == i2) {
                this.f53555a = abw.mo53988b();
                abx.m50590a(abw);
            } else {
                abw.f53597b = i6;
            }
            return b3;
        }
        StringBuilder k = C13555b.m33972k("size < 4: ");
        k.append(this.f53556b);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: m */
    public short mo53909m() {
        return acc.m50626a(mo53905k());
    }

    /* renamed from: b */
    public final long mo53864b() {
        return this.f53556b;
    }

    /* renamed from: c */
    public final byte mo53873c(long j) {
        int i;
        acc.m50627a(this.f53556b, j, 1);
        long j2 = this.f53556b;
        if (j2 - j > j) {
            abw abw = this.f53555a;
            while (true) {
                int i2 = abw.f53598c;
                int i3 = abw.f53597b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return abw.f53596a[i3 + ((int) j)];
                }
                j -= j3;
                abw = abw.f53601f;
            }
        } else {
            long j4 = j - j2;
            abw abw2 = this.f53555a;
            do {
                abw2 = abw2.f53602g;
                int i4 = abw2.f53598c;
                i = abw2.f53597b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return abw2.f53596a[i + ((int) j4)];
        }
    }

    /* renamed from: d */
    public abi mo53891g(int i) {
        abw e = mo53885e(4);
        byte[] bArr = e.f53596a;
        int i2 = e.f53598c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[i5] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        e.f53598c = i5 + 1;
        this.f53556b += 4;
        return this;
    }

    /* renamed from: g */
    public String mo53893g(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (mo53873c(j2) == 13) {
                String e = mo53886e(j2);
                mo53900i(2);
                return e;
            }
        }
        String e2 = mo53886e(j);
        mo53900i(1);
        return e2;
    }

    /* renamed from: h */
    public byte[] mo53896h(long j) throws EOFException {
        acc.m50627a(this.f53556b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            mo53861a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException(C0016g.m29l("byteCount > Integer.MAX_VALUE: ", j));
    }

    /* renamed from: b */
    public boolean mo53872b(long j) {
        return this.f53556b >= j;
    }

    /* renamed from: b */
    public abi mo53877c(byte[] bArr) {
        if (bArr != null) {
            return mo53878c(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: i */
    public void mo53900i(long j) throws EOFException {
        while (j > 0) {
            abw abw = this.f53555a;
            if (abw != null) {
                int min = (int) Math.min(j, (long) (abw.f53598c - abw.f53597b));
                long j2 = (long) min;
                this.f53556b -= j2;
                j -= j2;
                abw abw2 = this.f53555a;
                int i = abw2.f53597b + min;
                abw2.f53597b = i;
                if (i == abw2.f53598c) {
                    this.f53555a = abw2.mo53988b();
                    abx.m50590a(abw2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: b */
    public abi mo53878c(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            acc.m50627a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                abw e = mo53885e(1);
                int min = Math.min(i3 - i, 8192 - e.f53598c);
                System.arraycopy(bArr, i, e.f53596a, e.f53598c, min);
                i += min;
                e.f53598c += min;
            }
            this.f53556b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: c */
    public abi mo53894h(int i) {
        abw e = mo53885e(2);
        byte[] bArr = e.f53596a;
        int i2 = e.f53598c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[i3] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        e.f53598c = i3 + 1;
        this.f53556b += 2;
        return this;
    }

    /* renamed from: j */
    public abi mo53908m(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return mo53899i(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo53870b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        abw e = mo53885e(i2);
        byte[] bArr = e.f53596a;
        int i3 = e.f53598c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f53554c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        e.f53598c += i2;
        this.f53556b += (long) i2;
        return this;
    }

    /* renamed from: b */
    public abi mo53899i(int i) {
        abw e = mo53885e(1);
        byte[] bArr = e.f53596a;
        int i2 = e.f53598c;
        e.f53598c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f53556b++;
        return this;
    }

    /* renamed from: a */
    public int mo53843a(C21325abs abs) {
        int a = mo53844a(abs, false);
        if (a == -1) {
            return -1;
        }
        try {
            mo53900i((long) abs.f53581a[a].mo53946h());
            return a;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public long mo53865b(abl abl) throws IOException {
        return mo53848a(abl, 0);
    }

    /* renamed from: b */
    public long mo53866b(abl abl, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            abw abw = this.f53555a;
            if (abw == null) {
                return -1;
            }
            long j3 = this.f53556b;
            if (j3 - j < j) {
                while (j3 > j) {
                    abw = abw.f53602g;
                    j3 -= (long) (abw.f53598c - abw.f53597b);
                }
            } else {
                while (true) {
                    long j4 = ((long) (abw.f53598c - abw.f53597b)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    abw = abw.f53601f;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (abl.mo53946h() == 2) {
                byte a = abl.mo53930a(0);
                byte a2 = abl.mo53930a(1);
                while (j3 < this.f53556b) {
                    byte[] bArr = abw.f53596a;
                    i = (int) ((((long) abw.f53597b) + j) - j3);
                    int i3 = abw.f53598c;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == a || b == a2) {
                            i2 = abw.f53597b;
                        } else {
                            i++;
                        }
                    }
                    j3 += (long) (abw.f53598c - abw.f53597b);
                    abw = abw.f53601f;
                    j = j3;
                }
                return -1;
            }
            byte[] j5 = abl.mo53949j();
            while (j3 < this.f53556b) {
                byte[] bArr2 = abw.f53596a;
                int i4 = (int) ((((long) abw.f53597b) + j) - j3);
                int i5 = abw.f53598c;
                while (i < i5) {
                    byte b2 = bArr2[i];
                    int length = j5.length;
                    int i6 = 0;
                    while (i6 < length) {
                        if (b2 == j5[i6]) {
                            i2 = abw.f53597b;
                        } else {
                            i6++;
                        }
                    }
                    i4 = i + 1;
                }
                j3 += (long) (abw.f53598c - abw.f53597b);
                abw = abw.f53601f;
                j = j3;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    /* renamed from: a */
    public int mo53844a(C21325abs abs, boolean z) {
        int i;
        int i2;
        int i3;
        abw abw;
        int i4;
        C21325abs abs2 = abs;
        abw abw2 = this.f53555a;
        int i5 = -2;
        if (abw2 != null) {
            byte[] bArr = abw2.f53596a;
            int i6 = abw2.f53597b;
            int i7 = abw2.f53598c;
            int[] iArr = abs2.f53582b;
            abw abw3 = abw2;
            int i8 = 0;
            int i9 = -1;
            loop0:
            while (true) {
                int i11 = i8 + 1;
                int i12 = iArr[i8];
                int i13 = i11 + 1;
                int i14 = iArr[i11];
                if (i14 != -1) {
                    i9 = i14;
                }
                if (abw3 == null) {
                    break;
                }
                if (i12 < 0) {
                    int i15 = (i12 * -1) + i13;
                    while (true) {
                        int i16 = i6 + 1;
                        int i17 = i13 + 1;
                        if ((bArr[i6] & 255) != iArr[i13]) {
                            return i9;
                        }
                        boolean z2 = i17 == i15;
                        if (i16 == i7) {
                            abw abw4 = abw3.f53601f;
                            i4 = abw4.f53597b;
                            byte[] bArr2 = abw4.f53596a;
                            i3 = abw4.f53598c;
                            if (abw4 != abw2) {
                                byte[] bArr3 = bArr2;
                                abw = abw4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                abw = null;
                            }
                        } else {
                            abw abw5 = abw3;
                            i3 = i7;
                            i4 = i16;
                            abw = abw5;
                        }
                        if (z2) {
                            i = iArr[i17];
                            i2 = i4;
                            i7 = i3;
                            abw3 = abw;
                            break;
                        }
                        i6 = i4;
                        i7 = i3;
                        i13 = i17;
                        abw3 = abw;
                    }
                } else {
                    int i18 = i6 + 1;
                    byte b = bArr[i6] & 255;
                    int i19 = i13 + i12;
                    while (i13 != i19) {
                        if (b == iArr[i13]) {
                            i = iArr[i13 + i12];
                            if (i18 == i7) {
                                abw3 = abw3.f53601f;
                                i2 = abw3.f53597b;
                                bArr = abw3.f53596a;
                                i7 = abw3.f53598c;
                                if (abw3 == abw2) {
                                    abw3 = null;
                                }
                            } else {
                                i2 = i18;
                            }
                        } else {
                            i13++;
                        }
                    }
                    return i9;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i6 = i2;
                i5 = -2;
            }
            return z ? i5 : i9;
        } else if (z) {
            return -2;
        } else {
            return abs2.indexOf(abl.f53559b);
        }
    }

    /* renamed from: c */
    public long mo53874c(abl abl) {
        return mo53866b(abl, 0);
    }

    /* renamed from: k */
    public abi mo53907l(long j) {
        if (j == 0) {
            return mo53899i(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        abw e = mo53885e(numberOfTrailingZeros);
        byte[] bArr = e.f53596a;
        int i = e.f53598c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f53554c[(int) (15 & j)];
            j >>>= 4;
        }
        e.f53598c += numberOfTrailingZeros;
        this.f53556b += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: f */
    public final abl mo53888f(int i) {
        if (i == 0) {
            return abl.f53559b;
        }
        return new aby(this, i);
    }

    /* renamed from: a */
    public long mo53849a(abz abz) throws IOException {
        long j = this.f53556b;
        if (j > 0) {
            abz.mo53675a_(this, j);
        }
        return j;
    }

    /* renamed from: a */
    public String mo53859a(Charset charset) {
        try {
            return mo53858a(this.f53556b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public String mo53858a(long j, Charset charset) throws EOFException {
        acc.m50627a(this.f53556b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount > Integer.MAX_VALUE: ", j));
        } else if (j == 0) {
            return "";
        } else {
            abw abw = this.f53555a;
            int i = abw.f53597b;
            if (((long) i) + j > ((long) abw.f53598c)) {
                return new String(mo53896h(j), charset);
            }
            String str = new String(abw.f53596a, i, (int) j, charset);
            int i2 = (int) (((long) abw.f53597b) + j);
            abw.f53597b = i2;
            this.f53556b -= j;
            if (i2 == abw.f53598c) {
                this.f53555a = abw.mo53988b();
                abx.m50590a(abw);
            }
            return str;
        }
    }

    /* renamed from: a */
    public void mo53861a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = mo53845a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public int mo53845a(byte[] bArr, int i, int i2) {
        acc.m50627a((long) bArr.length, (long) i, (long) i2);
        abw abw = this.f53555a;
        if (abw == null) {
            return -1;
        }
        int min = Math.min(i2, abw.f53598c - abw.f53597b);
        System.arraycopy(abw.f53596a, abw.f53597b, bArr, i, min);
        int i3 = abw.f53597b + min;
        abw.f53597b = i3;
        this.f53556b -= (long) min;
        if (i3 == abw.f53598c) {
            this.f53555a = abw.mo53988b();
            abx.m50590a(abw);
        }
        return min;
    }

    /* renamed from: a */
    public abi mo53882d(abl abl) {
        if (abl != null) {
            abl.mo53933a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public abi mo53870b(String str) {
        return mo53871b(str, 0, str.length());
    }

    /* renamed from: a */
    public abi mo53871b(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException(C16759e.m42349e("beginIndex < 0: ", i));
        } else if (i2 < i) {
            throw new IllegalArgumentException(C13715c.m34244j("endIndex < beginIndex: ", i2, " < ", i));
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    abw e = mo53885e(1);
                    byte[] bArr = e.f53596a;
                    int i3 = e.f53598c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i5 = e.f53598c;
                            int i6 = (i3 + i) - i5;
                            e.f53598c = i5 + i6;
                            this.f53556b += (long) i6;
                        } else {
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                    }
                    int i52 = e.f53598c;
                    int i62 = (i3 + i) - i52;
                    e.f53598c = i52 + i62;
                    this.f53556b += (long) i62;
                } else {
                    if (charAt2 < 2048) {
                        mo53899i((charAt2 >> 6) | 192);
                        mo53899i((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        mo53899i((charAt2 >> 12) | 224);
                        mo53899i(((charAt2 >> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                        mo53899i((int) (charAt2 & '?') | 128);
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            mo53899i(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + SQLiteDatabase.OPEN_FULLMUTEX;
                            mo53899i((i8 >> 18) | 240);
                            mo53899i(((i8 >> 12) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                            mo53899i(((i8 >> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                            mo53899i((i8 & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder r = C25541a.m63887r("endIndex > string.length: ", i2, " > ");
            r.append(str.length());
            throw new IllegalArgumentException(r.toString());
        }
    }

    /* renamed from: a */
    public abi mo53851a(int i) {
        if (i < 128) {
            mo53899i(i);
        } else if (i < 2048) {
            mo53899i((i >> 6) | 192);
            mo53899i((i & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                mo53899i((i >> 12) | 224);
                mo53899i(((i >> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
                mo53899i((i & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            } else {
                mo53899i(63);
            }
        } else if (i <= 1114111) {
            mo53899i((i >> 18) | 240);
            mo53899i(((i >> 12) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            mo53899i(((i >> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
            mo53899i((i & 63) | RecyclerView.C1119a0.FLAG_IGNORE);
        } else {
            StringBuilder k = C13555b.m33972k("Unexpected code point: ");
            k.append(Integer.toHexString(i));
            throw new IllegalArgumentException(k.toString());
        }
        return this;
    }

    /* renamed from: a */
    public abi mo53856a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError(C16759e.m42349e("beginIndex < 0: ", i));
        } else if (i2 < i) {
            throw new IllegalArgumentException(C13715c.m34244j("endIndex < beginIndex: ", i2, " < ", i));
        } else if (i2 > str.length()) {
            StringBuilder r = C25541a.m63887r("endIndex > string.length: ", i2, " > ");
            r.append(str.length());
            throw new IllegalArgumentException(r.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(acc.f53612a)) {
            return mo53871b(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return mo53878c(bytes, 0, bytes.length);
        }
    }

    /* renamed from: a */
    public long mo53850a(aca aca) throws IOException {
        if (aca != null) {
            long j = 0;
            while (true) {
                long a = aca.mo53671a(this, 8192);
                if (a == -1) {
                    return j;
                }
                j += a;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* renamed from: a */
    public abj mo53857a(aca aca, long j) throws IOException {
        while (j > 0) {
            long a = aca.mo53671a(this, j);
            if (a != -1) {
                j -= a;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: a */
    public long mo53671a(abi abi, long j) {
        if (abi == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f53556b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            abi.mo53675a_(this, j);
            return j;
        } else {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
        }
    }

    /* renamed from: a */
    public long mo53846a(byte b) {
        return mo53847a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo53847a(byte b, long j, long j2) {
        abw abw;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f53556b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f53556b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (abw = this.f53555a) == null) {
            return -1;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                abw = abw.f53602g;
                j4 -= (long) (abw.f53598c - abw.f53597b);
            }
        } else {
            while (true) {
                long j6 = ((long) (abw.f53598c - abw.f53597b)) + j3;
                if (j6 >= j) {
                    break;
                }
                abw = abw.f53601f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = abw.f53596a;
            int min = (int) Math.min((long) abw.f53598c, (((long) abw.f53597b) + j5) - j4);
            for (int i = (int) ((((long) abw.f53597b) + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - abw.f53597b)) + j4;
                }
            }
            byte b2 = b;
            j4 += (long) (abw.f53598c - abw.f53597b);
            abw = abw.f53601f;
            j7 = j4;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo53848a(abl abl, long j) throws IOException {
        byte[] bArr;
        if (abl.mo53946h() != 0) {
            long j2 = 0;
            if (j >= 0) {
                abw abw = this.f53555a;
                long j3 = -1;
                if (abw == null) {
                    return -1;
                }
                long j4 = this.f53556b;
                if (j4 - j < j) {
                    while (j4 > j) {
                        abw = abw.f53602g;
                        j4 -= (long) (abw.f53598c - abw.f53597b);
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (abw.f53598c - abw.f53597b)) + j2;
                        if (j5 >= j) {
                            break;
                        }
                        abw = abw.f53601f;
                        j2 = j5;
                    }
                    j4 = j2;
                }
                byte a = abl.mo53930a(0);
                int h = abl.mo53946h();
                long j6 = 1 + (this.f53556b - ((long) h));
                long j7 = j;
                abw abw2 = abw;
                long j8 = j4;
                while (j8 < j6) {
                    byte[] bArr2 = abw2.f53596a;
                    int min = (int) Math.min((long) abw2.f53598c, (((long) abw2.f53597b) + j6) - j8);
                    int i = (int) ((((long) abw2.f53597b) + j7) - j8);
                    while (i < min) {
                        if (bArr2[i] == a) {
                            bArr = bArr2;
                            if (m50339a(abw2, i + 1, abl, 1, h)) {
                                return ((long) (i - abw2.f53597b)) + j8;
                            }
                        } else {
                            bArr = bArr2;
                        }
                        i++;
                        bArr2 = bArr;
                    }
                    j8 += (long) (abw2.f53598c - abw2.f53597b);
                    abw2 = abw2.f53601f;
                    j7 = j8;
                    j3 = -1;
                }
                return j3;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    /* renamed from: a */
    public boolean mo53862a(long j, abl abl) {
        return mo53863a(j, abl, 0, abl.mo53946h());
    }

    /* renamed from: a */
    public boolean mo53863a(long j, abl abl, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f53556b - j < ((long) i2) || abl.mo53946h() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo53873c(((long) i3) + j) != abl.mo53930a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m50339a(abw abw, int i, abl abl, int i2, int i3) {
        int i4 = abw.f53598c;
        byte[] bArr = abw.f53596a;
        while (i2 < i3) {
            if (i == i4) {
                abw = abw.f53601f;
                byte[] bArr2 = abw.f53596a;
                int i5 = abw.f53597b;
                bArr = bArr2;
                i = i5;
                i4 = abw.f53598c;
            }
            if (bArr[i] != abl.mo53930a(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: a */
    public acb mo53674a() {
        return acb.f53608c;
    }
}
