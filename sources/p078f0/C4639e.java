package p078f0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p358af.C13437d;

/* renamed from: f0.e */
public final class C4639e {

    /* renamed from: d */
    public static final Charset f15860d = StandardCharsets.US_ASCII;

    /* renamed from: e */
    public static final String[] f15861e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f */
    public static final int[] f15862f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a */
    public final int f15863a;

    /* renamed from: b */
    public final int f15864b;

    /* renamed from: c */
    public final byte[] f15865c;

    public C4639e(int i, int i2, byte[] bArr) {
        this.f15863a = i;
        this.f15864b = i2;
        this.f15865c = bArr;
    }

    /* renamed from: a */
    public static C4639e m11956a(long j, ByteOrder byteOrder) {
        return m11957b(new long[]{j}, byteOrder);
    }

    /* renamed from: b */
    public static C4639e m11957b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(f15862f[4] * jArr.length)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C4639e(4, jArr.length, wrap.array());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("(");
        k.append(f15861e[this.f15863a]);
        k.append(", data length:");
        return C13437d.m33707l(k, this.f15865c.length, ")");
    }
}
