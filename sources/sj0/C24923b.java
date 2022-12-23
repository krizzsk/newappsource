package sj0;

/* renamed from: sj0.b */
public final class C24923b extends C24924c {

    /* renamed from: d */
    public static final long[] f63002d = new long[256];

    /* renamed from: c */
    public long f63003c = -1;

    static {
        for (int i = 0; i < f63002d.length; i++) {
            long j = (long) i;
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = ((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1));
                j >>>= 1;
                if (i3 == 0) {
                    j ^= -3932672073523589310L;
                }
            }
            f63002d[i] = j;
        }
    }

    public C24923b() {
        this.f63004a = 8;
        this.f63005b = "CRC64";
    }

    /* renamed from: a */
    public final byte[] mo61479a() {
        long j = ~this.f63003c;
        this.f63003c = -1;
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((int) (j >> (i * 8)));
        }
        return bArr;
    }

    /* renamed from: c */
    public final void mo61480c(int i, int i2, byte[] bArr) {
        int i3 = i2 + i;
        while (i < i3) {
            long[] jArr = f63002d;
            int i4 = i + 1;
            byte b = bArr[i];
            long j = this.f63003c;
            this.f63003c = (j >>> 8) ^ jArr[(b ^ ((int) j)) & 255];
            i = i4;
        }
    }
}
