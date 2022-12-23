package p043ch;

import com.appboy.support.ValidationUtils;
import java.lang.reflect.Array;

/* renamed from: ch.c */
public final class C13832c {

    /* renamed from: a */
    public final /* synthetic */ int f34031a = 1;

    /* renamed from: b */
    public int f34032b;

    /* renamed from: c */
    public int f34033c;

    /* renamed from: d */
    public final Object f34034d;

    public C13832c(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f34034d = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        this.f34032b = i;
        this.f34033c = i2;
    }

    /* renamed from: a */
    public final int mo40771a() {
        return ((((byte[]) this.f34034d).length - this.f34032b) * 8) - this.f34033c;
    }

    /* renamed from: b */
    public final byte mo40772b(int i, int i2) {
        return ((byte[][]) this.f34034d)[i2][i];
    }

    /* renamed from: c */
    public final int mo40773c(int i) {
        int i2;
        if (i <= 0 || i > 32 || i > mo40771a()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i3 = this.f34033c;
        byte b = 0;
        if (i3 > 0) {
            int i4 = 8 - i3;
            if (i < i4) {
                i2 = i;
            } else {
                i2 = i4;
            }
            int i5 = i4 - i2;
            int i6 = this.f34032b;
            int i7 = (((ValidationUtils.APPBOY_STRING_MAX_LENGTH >> (8 - i2)) << i5) & ((byte[]) this.f34034d)[i6]) >> i5;
            i -= i2;
            int i8 = i3 + i2;
            this.f34033c = i8;
            if (i8 == 8) {
                this.f34033c = 0;
                this.f34032b = i6 + 1;
            }
            b = i7;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            int i9 = this.f34032b;
            b = (((byte[]) this.f34034d)[i9] & 255) | (b << 8);
            this.f34032b = i9 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i11 = 8 - i;
        int i12 = (b << i) | ((((ValidationUtils.APPBOY_STRING_MAX_LENGTH >> i11) << i11) & ((byte[]) this.f34034d)[this.f34032b]) >> i11);
        this.f34033c += i;
        return i12;
    }

    /* renamed from: d */
    public final void mo40774d(int i, int i2, int i3) {
        ((byte[][]) this.f34034d)[i2][i] = (byte) i3;
    }

    /* renamed from: e */
    public final void mo40775e(int i, int i2, boolean z) {
        ((byte[][]) this.f34034d)[i2][i] = z ? (byte) 1 : 0;
    }

    public final String toString() {
        switch (this.f34031a) {
            case 1:
                StringBuilder sb = new StringBuilder((this.f34032b * 2 * this.f34033c) + 2);
                for (int i = 0; i < this.f34033c; i++) {
                    byte[] bArr = ((byte[][]) this.f34034d)[i];
                    for (int i2 = 0; i2 < this.f34032b; i2++) {
                        byte b = bArr[i2];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append(10);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C13832c(byte[] bArr) {
        this.f34034d = bArr;
    }
}
