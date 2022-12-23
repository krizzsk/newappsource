package com.veriff.sdk.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p001a0.C0016g;

final class abv implements abk {

    /* renamed from: a */
    public final abi f53592a = new abi();

    /* renamed from: b */
    public final aca f53593b;

    /* renamed from: c */
    public boolean f53594c;

    public abv(aca aca) {
        if (aca != null) {
            this.f53593b = aca;
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: a */
    public long mo53671a(abi abi, long j) throws IOException {
        if (abi == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
        } else if (!this.f53594c) {
            abi abi2 = this.f53592a;
            if (abi2.f53556b == 0 && this.f53593b.mo53671a(abi2, 8192) == -1) {
                return -1;
            }
            return this.f53592a.mo53671a(abi, Math.min(j, this.f53592a.f53556b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: b */
    public boolean mo53872b(long j) throws IOException {
        abi abi;
        if (j < 0) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
        } else if (!this.f53594c) {
            do {
                abi = this.f53592a;
                if (abi.f53556b >= j) {
                    return true;
                }
            } while (this.f53593b.mo53671a(abi, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: c */
    public abi mo53875c() {
        return this.f53592a;
    }

    public void close() throws IOException {
        if (!this.f53594c) {
            this.f53594c = true;
            this.f53593b.close();
            this.f53592a.mo53920v();
        }
    }

    /* renamed from: d */
    public abi mo53880d() {
        return this.f53592a;
    }

    /* renamed from: f */
    public boolean mo53890f() throws IOException {
        if (!this.f53594c) {
            return this.f53592a.mo53890f() && this.f53593b.mo53671a(this.f53592a, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: g */
    public abk mo53892g() {
        return abr.m50508a((aca) new C21326abt(this));
    }

    /* renamed from: h */
    public byte[] mo53896h(long j) throws IOException {
        mo53860a(j);
        return this.f53592a.mo53896h(j);
    }

    /* renamed from: i */
    public void mo53900i(long j) throws IOException {
        if (!this.f53594c) {
            while (j > 0) {
                abi abi = this.f53592a;
                if (abi.f53556b == 0 && this.f53593b.mo53671a(abi, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f53592a.mo53864b());
                this.f53592a.mo53900i(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f53594c;
    }

    /* renamed from: j */
    public byte mo53902j() throws IOException {
        mo53860a(1);
        return this.f53592a.mo53902j();
    }

    /* renamed from: k */
    public short mo53905k() throws IOException {
        mo53860a(2);
        return this.f53592a.mo53905k();
    }

    /* renamed from: l */
    public int mo53906l() throws IOException {
        mo53860a(4);
        return this.f53592a.mo53906l();
    }

    /* renamed from: m */
    public short mo53909m() throws IOException {
        mo53860a(2);
        return this.f53592a.mo53909m();
    }

    /* renamed from: n */
    public int mo53910n() throws IOException {
        mo53860a(4);
        return this.f53592a.mo53910n();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo53911o() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.mo53860a((long) r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.mo53872b((long) r3)
            if (r3 == 0) goto L_0x0040
            com.veriff.sdk.internal.abi r3 = r6.f53592a
            long r4 = (long) r1
            byte r3 = r3.mo53873c((long) r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            com.veriff.sdk.internal.abi r0 = r6.f53592a
            long r0 = r0.mo53911o()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.abv.mo53911o():long");
    }

    /* renamed from: p */
    public long mo53912p() throws IOException {
        mo53860a(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo53872b((long) i2)) {
                break;
            }
            byte c = this.f53592a.mo53873c((long) i);
            if ((c >= 48 && c <= 57) || ((c >= 97 && c <= 102) || (c >= 65 && c <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(c)}));
            }
        }
        return this.f53592a.mo53912p();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        abi abi = this.f53592a;
        if (abi.f53556b == 0 && this.f53593b.mo53671a(abi, 8192) == -1) {
            return -1;
        }
        return this.f53592a.read(byteBuffer);
    }

    /* renamed from: s */
    public String mo53916s() throws IOException {
        return mo53889f(Long.MAX_VALUE);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("buffer(");
        k.append(this.f53593b);
        k.append(")");
        return k.toString();
    }

    /* renamed from: u */
    public byte[] mo53919u() throws IOException {
        this.f53592a.mo53850a(this.f53593b);
        return this.f53592a.mo53919u();
    }

    /* renamed from: c */
    public long mo53874c(abl abl) throws IOException {
        return mo53975b(abl, 0);
    }

    /* renamed from: d */
    public abl mo53883d(long j) throws IOException {
        mo53860a(j);
        return this.f53592a.mo53883d(j);
    }

    /* renamed from: h */
    public InputStream mo53895h() {
        return new InputStream() {
            public int available() throws IOException {
                abv abv = abv.this;
                if (!abv.f53594c) {
                    return (int) Math.min(abv.f53592a.f53556b, 2147483647L);
                }
                throw new IOException("closed");
            }

            public void close() throws IOException {
                abv.this.close();
            }

            public int read() throws IOException {
                abv abv = abv.this;
                if (!abv.f53594c) {
                    abi abi = abv.f53592a;
                    if (abi.f53556b == 0 && abv.f53593b.mo53671a(abi, 8192) == -1) {
                        return -1;
                    }
                    return abv.this.f53592a.mo53902j() & 255;
                }
                throw new IOException("closed");
            }

            public String toString() {
                return abv.this + ".inputStream()";
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                if (!abv.this.f53594c) {
                    acc.m50627a((long) bArr.length, (long) i, (long) i2);
                    abv abv = abv.this;
                    abi abi = abv.f53592a;
                    if (abi.f53556b == 0 && abv.f53593b.mo53671a(abi, 8192) == -1) {
                        return -1;
                    }
                    return abv.this.f53592a.mo53845a(bArr, i, i2);
                }
                throw new IOException("closed");
            }
        };
    }

    /* renamed from: f */
    public String mo53889f(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a = mo53972a((byte) 10, 0, j2);
            if (a != -1) {
                return this.f53592a.mo53893g(a);
            }
            if (j2 < Long.MAX_VALUE && mo53872b(j2) && this.f53592a.mo53873c(j2 - 1) == 13 && mo53872b(1 + j2) && this.f53592a.mo53873c(j2) == 10) {
                return this.f53592a.mo53893g(j2);
            }
            abi abi = new abi();
            abi abi2 = this.f53592a;
            abi2.mo53852a(abi, 0, Math.min(32, abi2.mo53864b()));
            StringBuilder k = C13555b.m33972k("\\n not found: limit=");
            k.append(Math.min(this.f53592a.mo53864b(), j));
            k.append(" content=");
            k.append(abi.mo53913q().mo53944f());
            k.append(8230);
            throw new EOFException(k.toString());
        }
        throw new IllegalArgumentException(C0016g.m29l("limit < 0: ", j));
    }

    /* renamed from: b */
    public long mo53865b(abl abl) throws IOException {
        return mo53973a(abl, 0);
    }

    /* renamed from: b */
    public long mo53975b(abl abl, long j) throws IOException {
        if (!this.f53594c) {
            while (true) {
                long b = this.f53592a.mo53866b(abl, j);
                if (b != -1) {
                    return b;
                }
                abi abi = this.f53592a;
                long j2 = abi.f53556b;
                if (this.f53593b.mo53671a(abi, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: a */
    public void mo53860a(long j) throws IOException {
        if (!mo53872b(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public int mo53843a(C21325abs abs) throws IOException {
        if (!this.f53594c) {
            do {
                int a = this.f53592a.mo53844a(abs, true);
                if (a == -1) {
                    return -1;
                }
                if (a != -2) {
                    this.f53592a.mo53900i((long) abs.f53581a[a].mo53946h());
                    return a;
                }
            } while (this.f53593b.mo53671a(this.f53592a, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a */
    public void mo53861a(byte[] bArr) throws IOException {
        try {
            mo53860a((long) bArr.length);
            this.f53592a.mo53861a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                abi abi = this.f53592a;
                long j = abi.f53556b;
                if (j > 0) {
                    int a = abi.mo53845a(bArr, i, (int) j);
                    if (a != -1) {
                        i += a;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public long mo53849a(abz abz) throws IOException {
        if (abz != null) {
            long j = 0;
            while (this.f53593b.mo53671a(this.f53592a, 8192) != -1) {
                long i = this.f53592a.mo53898i();
                if (i > 0) {
                    j += i;
                    abz.mo53675a_(this.f53592a, i);
                }
            }
            if (this.f53592a.mo53864b() <= 0) {
                return j;
            }
            long b = j + this.f53592a.mo53864b();
            abi abi = this.f53592a;
            abz.mo53675a_(abi, abi.mo53864b());
            return b;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: a */
    public long mo53846a(byte b) throws IOException {
        return mo53972a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo53972a(byte b, long j, long j2) throws IOException {
        if (this.f53594c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long a = this.f53592a.mo53847a(b, j, j2);
                if (a == -1) {
                    abi abi = this.f53592a;
                    long j3 = abi.f53556b;
                    if (j3 >= j2 || this.f53593b.mo53671a(abi, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public long mo53973a(abl abl, long j) throws IOException {
        if (!this.f53594c) {
            while (true) {
                long a = this.f53592a.mo53848a(abl, j);
                if (a != -1) {
                    return a;
                }
                abi abi = this.f53592a;
                long j2 = abi.f53556b;
                if (this.f53593b.mo53671a(abi, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) abl.mo53946h())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: a */
    public boolean mo53862a(long j, abl abl) throws IOException {
        return mo53974a(j, abl, 0, abl.mo53946h());
    }

    /* renamed from: a */
    public boolean mo53974a(long j, abl abl, int i, int i2) throws IOException {
        if (this.f53594c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || abl.mo53946h() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!mo53872b(1 + j2) || this.f53592a.mo53873c(j2) != abl.mo53930a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public acb mo53672a() {
        return this.f53593b.mo53672a();
    }
}
