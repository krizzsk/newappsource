package p731pp;

import ce0.C21100e;
import java.util.Arrays;

/* renamed from: pp.a */
public final class C18938a {

    /* renamed from: a */
    public final byte[] f48238a;

    /* renamed from: b */
    public final byte[] f48239b;

    /* renamed from: c */
    public final int f48240c;

    public C18938a(int i, byte[] bArr) {
        byte[] bArr2;
        this.f48240c = i;
        this.f48238a = bArr;
        int length = bArr.length;
        if (length == 1 || length == 2 || length == 4) {
            if (i >= 63) {
                bArr2 = new byte[2];
                C21100e.m49311H0(0, 6, 63, bArr2);
                C21100e.m49311H0(6, 2, (long) m46019a(length), bArr2);
                C21100e.m49311H0(8, 8, (long) (i - 63), bArr2);
            } else {
                bArr2 = new byte[1];
                C21100e.m49311H0(0, 6, (long) i, bArr2);
                C21100e.m49311H0(6, 2, (long) m46019a(length), bArr2);
            }
        } else if (i >= 63) {
            bArr2 = new byte[3];
            C21100e.m49311H0(0, 8, 255, bArr2);
            C21100e.m49311H0(8, 8, (long) (i - 63), bArr2);
            C21100e.m49311H0(16, 8, (long) length, bArr2);
        } else {
            bArr2 = new byte[2];
            C21100e.m49311H0(0, 6, (long) i, bArr2);
            C21100e.m49311H0(6, 2, 3, bArr2);
            C21100e.m49311H0(8, 8, (long) length, bArr2);
        }
        this.f48239b = bArr2;
    }

    /* renamed from: a */
    public static int m46019a(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        throw new IllegalArgumentException(C16759e.m42349e("valid length argument should be betwen 1 and 4, given : ", i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18938a.class != obj.getClass()) {
            return false;
        }
        C18938a aVar = (C18938a) obj;
        if (Arrays.equals(this.f48238a, aVar.f48238a) && this.f48240c == aVar.f48240c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f48238a) + 31) * 31) + this.f48240c;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PayloadChunk [id=");
        k.append(this.f48240c);
        k.append(", content=");
        k.append(Arrays.toString(this.f48238a));
        k.append("]");
        return k.toString();
    }
}
