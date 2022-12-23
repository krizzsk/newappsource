package com.google.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import com.google.protobuf.Utf8;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p911xg.C20491a;
import p911xg.C20492b;
import p911xg.C20512t;
import p911xg.C20518x;

public abstract class CodedOutputStream extends C20492b {

    /* renamed from: b */
    public static final Logger f36799b = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: c */
    public static final boolean f36800c = C20518x.f51911e;

    /* renamed from: a */
    public C14602f f36801a;

    /* renamed from: com.google.protobuf.CodedOutputStream$a */
    public static class C14570a extends CodedOutputStream {

        /* renamed from: d */
        public final byte[] f36802d;

        /* renamed from: e */
        public final int f36803e;

        /* renamed from: f */
        public int f36804f;

        public C14570a(byte[] bArr, int i) {
            int i2 = 0 + i;
            if ((0 | i | (bArr.length - i2)) >= 0) {
                this.f36802d = bArr;
                this.f36804f = 0;
                this.f36803e = i2;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
        }

        /* renamed from: A */
        public final void mo43908A(int i, byte[] bArr) throws IOException {
            mo43925R(i);
            mo43931V(bArr, 0, i);
        }

        /* renamed from: B */
        public final void mo43909B(int i, ByteString byteString) throws IOException {
            mo43923P(i, 2);
            mo43910C(byteString);
        }

        /* renamed from: C */
        public final void mo43910C(ByteString byteString) throws IOException {
            mo43925R(byteString.size());
            byteString.mo43903x(this);
        }

        /* renamed from: D */
        public final void mo43911D(int i, int i2) throws IOException {
            mo43923P(i, 5);
            mo43912E(i2);
        }

        /* renamed from: E */
        public final void mo43912E(int i) throws IOException {
            try {
                byte[] bArr = this.f36802d;
                int i2 = this.f36804f;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f36804f = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36804f), Integer.valueOf(this.f36803e), 1}), e);
            }
        }

        /* renamed from: F */
        public final void mo43913F(int i, long j) throws IOException {
            mo43923P(i, 1);
            mo43914G(j);
        }

        /* renamed from: G */
        public final void mo43914G(long j) throws IOException {
            try {
                byte[] bArr = this.f36802d;
                int i = this.f36804f;
                int i2 = i + 1;
                bArr[i] = (byte) (((int) j) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i3 = i2 + 1;
                bArr[i2] = (byte) (((int) (j >> 8)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (((int) (j >> 16)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (((int) (j >> 24)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((int) (j >> 32)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (((int) (j >> 40)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (((int) (j >> 48)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                this.f36804f = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36804f), Integer.valueOf(this.f36803e), 1}), e);
            }
        }

        /* renamed from: H */
        public final void mo43915H(int i, int i2) throws IOException {
            mo43923P(i, 0);
            mo43916I(i2);
        }

        /* renamed from: I */
        public final void mo43916I(int i) throws IOException {
            if (i >= 0) {
                mo43925R(i);
            } else {
                mo43927T((long) i);
            }
        }

        /* renamed from: J */
        public final void mo43917J(int i, C14629t tVar, C20512t tVar2) throws IOException {
            mo43923P(i, 2);
            C14583a aVar = (C14583a) tVar;
            int c = aVar.mo43943c();
            if (c == -1) {
                c = tVar2.mo44132d(aVar);
                aVar.mo43944e(c);
            }
            mo43925R(c);
            tVar2.mo44133e(tVar, this.f36801a);
        }

        /* renamed from: K */
        public final void mo43918K(C14629t tVar) throws IOException {
            mo43925R(tVar.getSerializedSize());
            tVar.mo43942a(this);
        }

        /* renamed from: L */
        public final void mo43919L(int i, C14629t tVar) throws IOException {
            mo43923P(1, 3);
            mo43924Q(2, i);
            mo43923P(3, 2);
            mo43918K(tVar);
            mo43923P(1, 4);
        }

        /* renamed from: M */
        public final void mo43920M(int i, ByteString byteString) throws IOException {
            mo43923P(1, 3);
            mo43924Q(2, i);
            mo43909B(3, byteString);
            mo43923P(1, 4);
        }

        /* renamed from: N */
        public final void mo43921N(int i, String str) throws IOException {
            mo43923P(i, 2);
            mo43922O(str);
        }

        /* renamed from: O */
        public final void mo43922O(String str) throws IOException {
            int i = this.f36804f;
            try {
                int v = CodedOutputStream.m36450v(str.length() * 3);
                int v2 = CodedOutputStream.m36450v(str.length());
                if (v2 == v) {
                    int i2 = i + v2;
                    this.f36804f = i2;
                    int a = Utf8.f36813a.mo43979a(str, this.f36802d, i2, this.f36803e - i2);
                    this.f36804f = i;
                    mo43925R((a - i) - v2);
                    this.f36804f = a;
                    return;
                }
                mo43925R(Utf8.m36529b(str));
                byte[] bArr = this.f36802d;
                int i3 = this.f36804f;
                this.f36804f = Utf8.f36813a.mo43979a(str, bArr, i3, this.f36803e - i3);
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f36804f = i;
                CodedOutputStream.f36799b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
                byte[] bytes = str.getBytes(C14610k.f36861a);
                try {
                    mo43925R(bytes.length);
                    mo43931V(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                } catch (OutOfSpaceException e3) {
                    throw e3;
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        /* renamed from: P */
        public final void mo43923P(int i, int i2) throws IOException {
            mo43925R((i << 3) | i2);
        }

        /* renamed from: Q */
        public final void mo43924Q(int i, int i2) throws IOException {
            mo43923P(i, 0);
            mo43925R(i2);
        }

        /* renamed from: R */
        public final void mo43925R(int i) throws IOException {
            if (CodedOutputStream.f36800c && !C20491a.m48115a()) {
                int i2 = this.f36803e;
                int i3 = this.f36804f;
                if (i2 - i3 >= 5) {
                    if ((i & -128) == 0) {
                        byte[] bArr = this.f36802d;
                        this.f36804f = i3 + 1;
                        C20518x.m48174q(bArr, (long) i3, (byte) i);
                        return;
                    }
                    byte[] bArr2 = this.f36802d;
                    this.f36804f = i3 + 1;
                    C20518x.m48174q(bArr2, (long) i3, (byte) (i | RecyclerView.C1119a0.FLAG_IGNORE));
                    int i4 = i >>> 7;
                    if ((i4 & -128) == 0) {
                        byte[] bArr3 = this.f36802d;
                        int i5 = this.f36804f;
                        this.f36804f = i5 + 1;
                        C20518x.m48174q(bArr3, (long) i5, (byte) i4);
                        return;
                    }
                    byte[] bArr4 = this.f36802d;
                    int i6 = this.f36804f;
                    this.f36804f = i6 + 1;
                    C20518x.m48174q(bArr4, (long) i6, (byte) (i4 | RecyclerView.C1119a0.FLAG_IGNORE));
                    int i7 = i4 >>> 7;
                    if ((i7 & -128) == 0) {
                        byte[] bArr5 = this.f36802d;
                        int i8 = this.f36804f;
                        this.f36804f = i8 + 1;
                        C20518x.m48174q(bArr5, (long) i8, (byte) i7);
                        return;
                    }
                    byte[] bArr6 = this.f36802d;
                    int i9 = this.f36804f;
                    this.f36804f = i9 + 1;
                    C20518x.m48174q(bArr6, (long) i9, (byte) (i7 | RecyclerView.C1119a0.FLAG_IGNORE));
                    int i11 = i7 >>> 7;
                    if ((i11 & -128) == 0) {
                        byte[] bArr7 = this.f36802d;
                        int i12 = this.f36804f;
                        this.f36804f = i12 + 1;
                        C20518x.m48174q(bArr7, (long) i12, (byte) i11);
                        return;
                    }
                    byte[] bArr8 = this.f36802d;
                    int i13 = this.f36804f;
                    this.f36804f = i13 + 1;
                    C20518x.m48174q(bArr8, (long) i13, (byte) (i11 | RecyclerView.C1119a0.FLAG_IGNORE));
                    byte[] bArr9 = this.f36802d;
                    int i14 = this.f36804f;
                    this.f36804f = i14 + 1;
                    C20518x.m48174q(bArr9, (long) i14, (byte) (i11 >>> 7));
                    return;
                }
            }
            while ((i & -128) != 0) {
                byte[] bArr10 = this.f36802d;
                int i15 = this.f36804f;
                this.f36804f = i15 + 1;
                bArr10[i15] = (byte) ((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                i >>>= 7;
            }
            try {
                byte[] bArr11 = this.f36802d;
                int i16 = this.f36804f;
                this.f36804f = i16 + 1;
                bArr11[i16] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36804f), Integer.valueOf(this.f36803e), 1}), e);
            }
        }

        /* renamed from: S */
        public final void mo43926S(int i, long j) throws IOException {
            mo43923P(i, 0);
            mo43927T(j);
        }

        /* renamed from: T */
        public final void mo43927T(long j) throws IOException {
            if (!CodedOutputStream.f36800c || this.f36803e - this.f36804f < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f36802d;
                    int i = this.f36804f;
                    this.f36804f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f36802d;
                    int i2 = this.f36804f;
                    this.f36804f = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36804f), Integer.valueOf(this.f36803e), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f36802d;
                    int i3 = this.f36804f;
                    this.f36804f = i3 + 1;
                    C20518x.m48174q(bArr3, (long) i3, (byte) ((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f36802d;
                int i4 = this.f36804f;
                this.f36804f = i4 + 1;
                C20518x.m48174q(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: U */
        public final int mo43930U() {
            return this.f36803e - this.f36804f;
        }

        /* renamed from: V */
        public final void mo43931V(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f36802d, this.f36804f, i2);
                this.f36804f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36804f), Integer.valueOf(this.f36803e), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: a */
        public final void mo43932a(int i, int i2, byte[] bArr) throws IOException {
            mo43931V(bArr, i, i2);
        }

        /* renamed from: y */
        public final void mo43928y(byte b) throws IOException {
            try {
                byte[] bArr = this.f36802d;
                int i = this.f36804f;
                this.f36804f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f36804f), Integer.valueOf(this.f36803e), 1}), e);
            }
        }

        /* renamed from: z */
        public final void mo43929z(int i, boolean z) throws IOException {
            mo43923P(i, 0);
            mo43928y(z ? (byte) 1 : 0);
        }
    }

    /* renamed from: b */
    public static int m36430b(int i) {
        return m36448t(i) + 1;
    }

    /* renamed from: c */
    public static int m36431c(int i, ByteString byteString) {
        int t = m36448t(i);
        int size = byteString.size();
        return m36450v(size) + size + t;
    }

    /* renamed from: d */
    public static int m36432d(int i) {
        return m36448t(i) + 8;
    }

    /* renamed from: e */
    public static int m36433e(int i, int i2) {
        return m36439k(i2) + m36448t(i);
    }

    /* renamed from: f */
    public static int m36434f(int i) {
        return m36448t(i) + 4;
    }

    /* renamed from: g */
    public static int m36435g(int i) {
        return m36448t(i) + 8;
    }

    /* renamed from: h */
    public static int m36436h(int i) {
        return m36448t(i) + 4;
    }

    @Deprecated
    /* renamed from: i */
    public static int m36437i(int i, C14629t tVar, C20512t tVar2) {
        int t = m36448t(i) * 2;
        C14583a aVar = (C14583a) tVar;
        int c = aVar.mo43943c();
        if (c == -1) {
            c = tVar2.mo44132d(aVar);
            aVar.mo43944e(c);
        }
        return c + t;
    }

    /* renamed from: j */
    public static int m36438j(int i, int i2) {
        return m36439k(i2) + m36448t(i);
    }

    /* renamed from: k */
    public static int m36439k(int i) {
        if (i >= 0) {
            return m36450v(i);
        }
        return 10;
    }

    /* renamed from: l */
    public static int m36440l(int i, long j) {
        return m36452x(j) + m36448t(i);
    }

    /* renamed from: m */
    public static int m36441m(C14619m mVar) {
        int i;
        if (mVar.f36866b != null) {
            i = mVar.f36866b.size();
        } else if (mVar.f36865a != null) {
            i = mVar.f36865a.getSerializedSize();
        } else {
            i = 0;
        }
        return m36450v(i) + i;
    }

    /* renamed from: n */
    public static int m36442n(int i) {
        return m36448t(i) + 4;
    }

    /* renamed from: o */
    public static int m36443o(int i) {
        return m36448t(i) + 8;
    }

    /* renamed from: p */
    public static int m36444p(int i, int i2) {
        return m36450v((i2 >> 31) ^ (i2 << 1)) + m36448t(i);
    }

    /* renamed from: q */
    public static int m36445q(int i, long j) {
        return m36452x((j >> 63) ^ (j << 1)) + m36448t(i);
    }

    /* renamed from: r */
    public static int m36446r(int i, String str) {
        return m36447s(str) + m36448t(i);
    }

    /* renamed from: s */
    public static int m36447s(String str) {
        int i;
        try {
            i = Utf8.m36529b(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            i = str.getBytes(C14610k.f36861a).length;
        }
        return m36450v(i) + i;
    }

    /* renamed from: t */
    public static int m36448t(int i) {
        return m36450v((i << 3) | 0);
    }

    /* renamed from: u */
    public static int m36449u(int i, int i2) {
        return m36450v(i2) + m36448t(i);
    }

    /* renamed from: v */
    public static int m36450v(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: w */
    public static int m36451w(int i, long j) {
        return m36452x(j) + m36448t(i);
    }

    /* renamed from: x */
    public static int m36452x(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: A */
    public abstract void mo43908A(int i, byte[] bArr) throws IOException;

    /* renamed from: B */
    public abstract void mo43909B(int i, ByteString byteString) throws IOException;

    /* renamed from: C */
    public abstract void mo43910C(ByteString byteString) throws IOException;

    /* renamed from: D */
    public abstract void mo43911D(int i, int i2) throws IOException;

    /* renamed from: E */
    public abstract void mo43912E(int i) throws IOException;

    /* renamed from: F */
    public abstract void mo43913F(int i, long j) throws IOException;

    /* renamed from: G */
    public abstract void mo43914G(long j) throws IOException;

    /* renamed from: H */
    public abstract void mo43915H(int i, int i2) throws IOException;

    /* renamed from: I */
    public abstract void mo43916I(int i) throws IOException;

    /* renamed from: J */
    public abstract void mo43917J(int i, C14629t tVar, C20512t tVar2) throws IOException;

    /* renamed from: K */
    public abstract void mo43918K(C14629t tVar) throws IOException;

    /* renamed from: L */
    public abstract void mo43919L(int i, C14629t tVar) throws IOException;

    /* renamed from: M */
    public abstract void mo43920M(int i, ByteString byteString) throws IOException;

    /* renamed from: N */
    public abstract void mo43921N(int i, String str) throws IOException;

    /* renamed from: O */
    public abstract void mo43922O(String str) throws IOException;

    /* renamed from: P */
    public abstract void mo43923P(int i, int i2) throws IOException;

    /* renamed from: Q */
    public abstract void mo43924Q(int i, int i2) throws IOException;

    /* renamed from: R */
    public abstract void mo43925R(int i) throws IOException;

    /* renamed from: S */
    public abstract void mo43926S(int i, long j) throws IOException;

    /* renamed from: T */
    public abstract void mo43927T(long j) throws IOException;

    /* renamed from: y */
    public abstract void mo43928y(byte b) throws IOException;

    /* renamed from: z */
    public abstract void mo43929z(int i, boolean z) throws IOException;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super(C25541a.m63881k("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), indexOutOfBoundsException);
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }
    }
}
