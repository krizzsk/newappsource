package p238ra;

import java.io.IOException;
import p173ma.C5732e;

/* renamed from: ra.f */
public final class C6284f {

    /* renamed from: d */
    public static final long[] f19871d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f19872a = new byte[8];

    /* renamed from: b */
    public int f19873b;

    /* renamed from: c */
    public int f19874c;

    /* renamed from: a */
    public static long m14881a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f19871d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: b */
    public final long mo22273b(C5732e eVar, boolean z, boolean z2, int i) throws IOException {
        int i2;
        if (this.f19873b == 0) {
            if (!eVar.mo21581h(0, 1, this.f19872a, z)) {
                return -1;
            }
            byte b = this.f19872a[0] & 255;
            int i3 = 0;
            while (true) {
                long[] jArr = f19871d;
                if (i3 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((((long) b) & jArr[i3]) != 0) {
                    i2 = i3 + 1;
                    break;
                }
                i3++;
            }
            this.f19874c = i2;
            if (i2 != -1) {
                this.f19873b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i4 = this.f19874c;
        if (i4 > i) {
            this.f19873b = 0;
            return -2;
        }
        if (i4 != 1) {
            eVar.mo21581h(1, i4 - 1, this.f19872a, false);
        }
        this.f19873b = 0;
        return m14881a(this.f19872a, this.f19874c, z2);
    }
}
