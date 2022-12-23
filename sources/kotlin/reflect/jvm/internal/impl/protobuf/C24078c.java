package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import vg0.C25091a;
import vg0.C25097e;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
public final class C24078c {

    /* renamed from: a */
    public final byte[] f61068a = new byte[4096];

    /* renamed from: b */
    public int f61069b = 0;

    /* renamed from: c */
    public int f61070c;

    /* renamed from: d */
    public int f61071d = 0;

    /* renamed from: e */
    public final InputStream f61072e;

    /* renamed from: f */
    public int f61073f;

    /* renamed from: g */
    public int f61074g = 0;

    /* renamed from: h */
    public int f61075h = Integer.MAX_VALUE;

    /* renamed from: i */
    public int f61076i;

    public C24078c(InputStream inputStream) {
        this.f61072e = inputStream;
    }

    /* renamed from: a */
    public final void mo60019a(int i) throws InvalidProtocolBufferException {
        if (this.f61073f != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: b */
    public final int mo60020b() {
        int i = this.f61075h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f61074g + this.f61071d);
    }

    /* renamed from: c */
    public final void mo60021c(int i) {
        this.f61075h = i;
        mo60033o();
    }

    /* renamed from: d */
    public final int mo60022d(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.f61074g + this.f61071d + i;
            int i3 = this.f61075h;
            if (i2 <= i3) {
                this.f61075h = i2;
                mo60033o();
                return i3;
            }
            throw InvalidProtocolBufferException.m60072c();
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public final C25097e mo60023e() throws IOException {
        int k = mo60029k();
        int i = this.f61069b;
        int i2 = this.f61071d;
        if (k <= i - i2 && k > 0) {
            byte[] bArr = this.f61068a;
            C25097e eVar = C25091a.f63298b;
            byte[] bArr2 = new byte[k];
            System.arraycopy(bArr, i2, bArr2, 0, k);
            C25097e eVar2 = new C25097e(bArr2);
            this.f61071d += k;
            return eVar2;
        } else if (k == 0) {
            return C25091a.f63298b;
        } else {
            return new C25097e(mo60026h(k));
        }
    }

    /* renamed from: f */
    public final int mo60024f() throws IOException {
        return mo60029k();
    }

    /* renamed from: g */
    public final C24090h mo60025g(C24077b bVar, C24079d dVar) throws IOException {
        int k = mo60029k();
        if (this.f61076i < 64) {
            int d = mo60022d(k);
            this.f61076i++;
            C24090h hVar = (C24090h) bVar.mo59643a(this, dVar);
            mo60019a(0);
            this.f61076i--;
            mo60021c(d);
            return hVar;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: h */
    public final byte[] mo60026h(int i) throws IOException {
        int i2;
        if (i > 0) {
            int i3 = this.f61074g;
            int i4 = this.f61071d;
            int i5 = i3 + i4 + i;
            int i6 = this.f61075h;
            if (i5 > i6) {
                mo60036r((i6 - i3) - i4);
                throw InvalidProtocolBufferException.m60072c();
            } else if (i < 4096) {
                byte[] bArr = new byte[i];
                int i7 = this.f61069b - i4;
                System.arraycopy(this.f61068a, i4, bArr, 0, i7);
                int i8 = this.f61069b;
                this.f61071d = i8;
                int i9 = i - i7;
                if (i8 - i8 < i9) {
                    mo60034p(i9);
                }
                System.arraycopy(this.f61068a, 0, bArr, i7, i9);
                this.f61071d = i9;
                return bArr;
            } else {
                int i11 = this.f61069b;
                this.f61074g = i3 + i11;
                this.f61071d = 0;
                this.f61069b = 0;
                int i12 = i11 - i4;
                int i13 = i - i12;
                ArrayList arrayList = new ArrayList();
                while (i13 > 0) {
                    int min = Math.min(i13, 4096);
                    byte[] bArr2 = new byte[min];
                    int i14 = 0;
                    while (i14 < min) {
                        InputStream inputStream = this.f61072e;
                        if (inputStream == null) {
                            i2 = -1;
                        } else {
                            i2 = inputStream.read(bArr2, i14, min - i14);
                        }
                        if (i2 != -1) {
                            this.f61074g += i2;
                            i14 += i2;
                        } else {
                            throw InvalidProtocolBufferException.m60072c();
                        }
                    }
                    i13 -= min;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(this.f61068a, i4, bArr3, 0, i12);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byte[] bArr4 = (byte[]) it.next();
                    System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
                    i12 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i == 0) {
            return C24084f.f61087a;
        } else {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    /* renamed from: i */
    public final int mo60027i() throws IOException {
        int i = this.f61071d;
        if (this.f61069b - i < 4) {
            mo60034p(4);
            i = this.f61071d;
        }
        byte[] bArr = this.f61068a;
        this.f61071d = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: j */
    public final long mo60028j() throws IOException {
        int i = this.f61071d;
        if (this.f61069b - i < 8) {
            mo60034p(8);
            i = this.f61071d;
        }
        byte[] bArr = this.f61068a;
        this.f61071d = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo60029k() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f61071d
            int r1 = r9.f61069b
            if (r1 != r0) goto L_0x0008
            goto L_0x007c
        L_0x0008:
            byte[] r2 = r9.f61068a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0013
            r9.f61071d = r3
            return r0
        L_0x0013:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x002d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x0029:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L_0x0082
        L_0x002d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x003f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L_0x003d:
            r1 = r3
            goto L_0x0082
        L_0x003f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x004f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x0029
        L_0x004f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0082
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x003d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0082
        L_0x007c:
            long r0 = r9.mo60031m()
            int r1 = (int) r0
            return r1
        L_0x0082:
            r9.f61071d = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C24078c.mo60029k():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo60030l() throws java.io.IOException {
        /*
            r9 = this;
            int r0 = r9.f61071d
            int r1 = r9.f61069b
            if (r1 != r0) goto L_0x0008
            goto L_0x00b8
        L_0x0008:
            byte[] r2 = r9.f61068a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r9.f61071d = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b8
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r5 = -128(0xffffffffffffff80, double:NaN)
        L_0x002b:
            long r2 = r3 ^ r5
            goto L_0x00bf
        L_0x002f:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            long r7 = (long) r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0042
            r1 = 16256(0x3f80, double:8.0315E-320)
        L_0x003d:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bf
        L_0x0042:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            int r0 = r0 << 21
            long r7 = (long) r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0052
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L_0x002b
        L_0x0052:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 28
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0063
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L_0x003d
        L_0x0063:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L_0x002b
        L_0x0076:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0089
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x003d
        L_0x0089:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x002b
        L_0x009c:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bd
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00b8:
            long r0 = r9.mo60031m()
            return r0
        L_0x00bd:
            r1 = r0
        L_0x00be:
            r2 = r3
        L_0x00bf:
            r9.f61071d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C24078c.mo60030l():long");
    }

    /* renamed from: m */
    public final long mo60031m() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f61071d == this.f61069b) {
                mo60034p(1);
            }
            byte[] bArr = this.f61068a;
            int i2 = this.f61071d;
            this.f61071d = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & Byte.MAX_VALUE)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: n */
    public final int mo60032n() throws IOException {
        boolean z = true;
        if (this.f61071d != this.f61069b || mo60037s(1)) {
            z = false;
        }
        if (z) {
            this.f61073f = 0;
            return 0;
        }
        int k = mo60029k();
        this.f61073f = k;
        if ((k >>> 3) != 0) {
            return k;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: o */
    public final void mo60033o() {
        int i = this.f61069b + this.f61070c;
        this.f61069b = i;
        int i2 = this.f61074g + i;
        int i3 = this.f61075h;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f61070c = i4;
            this.f61069b = i - i4;
            return;
        }
        this.f61070c = 0;
    }

    /* renamed from: p */
    public final void mo60034p(int i) throws IOException {
        if (!mo60037s(i)) {
            throw InvalidProtocolBufferException.m60072c();
        }
    }

    /* renamed from: q */
    public final boolean mo60035q(int i, CodedOutputStream codedOutputStream) throws IOException {
        int n;
        int i2 = i & 7;
        if (i2 == 0) {
            long l = mo60030l();
            codedOutputStream.mo59985v(i);
            codedOutputStream.mo59986w(l);
            return true;
        } else if (i2 == 1) {
            long j = mo60028j();
            codedOutputStream.mo59985v(i);
            codedOutputStream.mo59984u(j);
            return true;
        } else if (i2 == 2) {
            C25097e e = mo60023e();
            codedOutputStream.mo59985v(i);
            codedOutputStream.mo59985v(e.size());
            codedOutputStream.mo59981r(e);
            return true;
        } else if (i2 == 3) {
            codedOutputStream.mo59985v(i);
            do {
                n = mo60032n();
                if (n == 0 || !mo60035q(n, codedOutputStream)) {
                    int i3 = ((i >>> 3) << 3) | 4;
                    mo60019a(i3);
                    codedOutputStream.mo59985v(i3);
                }
                n = mo60032n();
                break;
            } while (!mo60035q(n, codedOutputStream));
            int i32 = ((i >>> 3) << 3) | 4;
            mo60019a(i32);
            codedOutputStream.mo59985v(i32);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                int i4 = mo60027i();
                codedOutputStream.mo59985v(i);
                codedOutputStream.mo59983t(i4);
                return true;
            }
            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
        }
    }

    /* renamed from: r */
    public final void mo60036r(int i) throws IOException {
        int i2 = this.f61069b;
        int i3 = this.f61071d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f61071d = i3 + i;
        } else if (i >= 0) {
            int i5 = this.f61074g;
            int i6 = i5 + i3 + i;
            int i7 = this.f61075h;
            if (i6 <= i7) {
                this.f61071d = i2;
                mo60034p(1);
                while (true) {
                    int i8 = i - i4;
                    int i9 = this.f61069b;
                    if (i8 > i9) {
                        i4 += i9;
                        this.f61071d = i9;
                        mo60034p(1);
                    } else {
                        this.f61071d = i8;
                        return;
                    }
                }
            } else {
                mo60036r((i7 - i5) - i3);
                throw InvalidProtocolBufferException.m60072c();
            }
        } else {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    /* renamed from: s */
    public final boolean mo60037s(int i) throws IOException {
        int i2 = this.f61071d;
        int i3 = i2 + i;
        int i4 = this.f61069b;
        if (i3 > i4) {
            if (this.f61074g + i2 + i <= this.f61075h && this.f61072e != null) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.f61068a;
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.f61074g += i2;
                    this.f61069b -= i2;
                    this.f61071d = 0;
                }
                InputStream inputStream = this.f61072e;
                byte[] bArr2 = this.f61068a;
                int i5 = this.f61069b;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.f61068a.length) {
                    throw new IllegalStateException(C13715c.m34242h(102, "InputStream#read(byte[]) returned invalid result: ", read, "\nThe InputStream implementation is buggy."));
                } else if (read > 0) {
                    this.f61069b += read;
                    if ((this.f61074g + i) - 67108864 <= 0) {
                        mo60033o();
                        if (this.f61069b >= i) {
                            return true;
                        }
                        return mo60037s(i);
                    }
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
        throw new IllegalStateException(C13715c.m34242h(77, "refillBuffer() called when ", i, " bytes were already available in buffer"));
    }
}
