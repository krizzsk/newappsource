package p581ji;

import com.appboy.support.ValidationUtils;
import java.io.DataInputStream;
import p683np.C18579a;

/* renamed from: ji.a */
public final class C17854a implements C18579a {

    /* renamed from: i */
    public static final byte[] f45837i = new byte[0];

    /* renamed from: j */
    public static int[][] f45838j;

    /* renamed from: k */
    public static long[] f45839k;

    /* renamed from: l */
    public static int[][] f45840l;

    /* renamed from: m */
    public static final byte[] f45841m = new byte[256];

    /* renamed from: n */
    public static final int[] f45842n = new int[30];

    /* renamed from: a */
    public final boolean f45843a;

    /* renamed from: b */
    public byte[] f45844b;

    /* renamed from: c */
    public byte[] f45845c;

    /* renamed from: d */
    public final int[] f45846d = new int[896];

    /* renamed from: e */
    public final byte[] f45847e = new byte[16];

    /* renamed from: f */
    public byte[] f45848f = new byte[16];

    /* renamed from: g */
    public byte[] f45849g = new byte[16];

    /* renamed from: h */
    public int f45850h = 16;

    public C17854a(byte[] bArr, int[] iArr, boolean z) {
        System.arraycopy(bArr, 0, f45841m, 0, 256);
        System.arraycopy(iArr, 0, f45842n, 0, 30);
        this.f45843a = z;
    }

    /* renamed from: c */
    public static final void m44236c(byte[] bArr) {
        int i = 0;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        int i2 = 15;
        while (i2 >= 0) {
            byte b = bArr[i2];
            bArr[i2] = (byte) (i ^ (b << 1));
            i2--;
            i = (b >>> 7) & 1;
        }
    }

    /* renamed from: e */
    public static final void m44237e(DataInputStream dataInputStream) throws Exception {
        int i;
        long[] jArr = f45839k;
        int i2 = 0;
        if (jArr == null) {
            i = 0;
        } else {
            i = jArr.length + 1;
        }
        if (i == 0) {
            f45839k = new long[1];
            f45838j = new int[1][];
            f45840l = new int[1][];
        } else {
            long[] jArr2 = new long[i];
            f45839k = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, f45840l.length);
            int[][] iArr = f45838j;
            int[][] iArr2 = new int[i][];
            f45838j = iArr2;
            System.arraycopy(iArr, 0, iArr2, 0, f45840l.length);
            int[][] iArr3 = f45840l;
            int i3 = i - 1;
            int[][] iArr4 = new int[i][];
            f45840l = iArr4;
            System.arraycopy(iArr3, 0, iArr4, 0, i3);
            i = i3;
        }
        f45839k[i] = dataInputStream.readLong();
        f45838j[i] = new int[dataInputStream.read()];
        int i4 = 0;
        while (true) {
            int[] iArr5 = f45838j[i];
            if (i4 >= iArr5.length) {
                break;
            }
            iArr5[i4] = dataInputStream.readInt();
            i4++;
        }
        f45840l[i] = new int[dataInputStream.read()];
        while (true) {
            int[] iArr6 = f45840l[i];
            if (i2 < iArr6.length) {
                iArr6[i2] = dataInputStream.readInt();
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public static int m44238j(int i) {
        byte[] bArr = f45841m;
        return (bArr[(i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH] << 24) | (bArr[i & ValidationUtils.APPBOY_STRING_MAX_LENGTH] & 255) | ((bArr[(i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH] & 255) << 8) | ((bArr[(i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH] & 255) << 16);
    }

    /* renamed from: a */
    public final void mo50425a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = this.f45849g;
        int length = bArr2.length;
        while (length > 0) {
            length--;
            bArr2[length] = 0;
        }
        this.f45850h = 16;
        int i3 = i2 * 16;
        mo50432k(i, i3 - 8, bArr);
        System.arraycopy(mo50427d(), 0, bArr, (i3 + i) - 8, 8);
        while (true) {
            i2--;
            if (i2 >= 0) {
                mo50430h(this.f45845c, f45837i);
                int i4 = 0;
                while (i4 < 16) {
                    bArr[i] = (byte) (bArr[i] ^ this.f45845c[i4]);
                    i4++;
                    i++;
                }
                System.arraycopy(bArr, i - 16, this.f45845c, 0, 16);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo50426b(byte[] bArr) {
        int i;
        if (bArr == null) {
            bArr = new byte[32];
        }
        this.f45844b = bArr;
        this.f45845c = new byte[16];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int[] iArr = this.f45846d;
            byte[] bArr2 = this.f45844b;
            iArr[i3] = ((bArr2[i2 + 1] & 255) << 8) | (bArr2[i2] & 255) | ((bArr2[i2 + 2] & 255) << 16) | (bArr2[i2 + 3] << 24);
            i2 += 4;
            i3++;
        }
        for (i = 8; i < 60; i++) {
            int i4 = this.f45846d[i - 1];
            int i5 = i % 8;
            if (i5 == 0) {
                i4 = m44238j((i4 << -8) | (i4 >>> 8)) ^ f45842n[(i / 8) - 1];
            } else if (i5 == 4) {
                i4 = m44238j(i4);
            }
            int[] iArr2 = this.f45846d;
            iArr2[i] = i4 ^ iArr2[i - 8];
        }
    }

    /* renamed from: d */
    public final byte[] mo50427d() {
        byte[] bArr = this.f45848f;
        mo50430h(bArr, bArr);
        m44236c(this.f45848f);
        if (this.f45850h > 0) {
            m44236c(this.f45848f);
            byte[] bArr2 = this.f45849g;
            int i = 16 - this.f45850h;
            bArr2[i] = (byte) (bArr2[i] ^ 128);
            this.f45850h = 0;
        }
        mo50430h(this.f45849g, this.f45848f);
        return this.f45849g;
    }

    /* renamed from: f */
    public final void mo50428f(int i, byte[] bArr) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3 += 16) {
            if (!this.f45843a) {
                long currentTimeMillis = System.currentTimeMillis();
                long freeMemory = Runtime.getRuntime().freeMemory();
                for (int i4 = 0; i4 < 8; i4++) {
                    byte[] bArr2 = this.f45847e;
                    int i5 = i4 << 3;
                    bArr2[i4] = (byte) ((int) ((currentTimeMillis >> i5) & 255));
                    bArr2[i4 + 8] = (byte) ((int) ((freeMemory >> i5) & 255));
                }
            } else {
                byte[] bArr3 = this.f45847e;
                int length = bArr3.length;
                while (length > 0) {
                    length--;
                    bArr3[length] = 0;
                }
            }
            mo50430h(this.f45847e, f45837i);
            mo50430h(this.f45845c, this.f45847e);
            System.arraycopy(this.f45845c, 0, bArr, i3, Math.min(16, i2 - i3));
            mo50430h(this.f45845c, this.f45847e);
        }
    }

    /* renamed from: g */
    public final void mo50429g(int[] iArr, int[] iArr2, int i) {
        boolean z;
        int i2 = 0;
        if (i + 4 <= 56) {
            z = true;
        } else {
            z = false;
        }
        while (i2 < 4) {
            byte[] bArr = f45841m;
            int i3 = i2 + 1;
            int i4 = (bArr[(iArr[(i2 + 3) & 3] >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH] << 24) ^ (((bArr[iArr[i2] & ValidationUtils.APPBOY_STRING_MAX_LENGTH] & 255) ^ ((bArr[(iArr[i3 & 3] >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH] & 255) << 8)) ^ ((bArr[(iArr[(i2 + 2) & 3] >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH] & 255) << 16));
            iArr2[i2] = i4;
            if (z) {
                int i5 = ((2139062143 & i4) << 1) ^ (((-2139062144 & i4) >>> 7) * 27);
                int i6 = i4 ^ i5;
                iArr2[i2] = ((i4 << -24) | (i4 >>> 24)) ^ ((i5 ^ ((i6 << -8) | (i6 >>> 8))) ^ ((i4 >>> 16) | (i4 << -16)));
            }
            iArr2[i2] = iArr2[i2] ^ this.f45846d[i + i2];
            i2 = i3;
        }
    }

    /* renamed from: h */
    public final void mo50430h(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 16) {
            int i5 = i3 >> 2;
            iArr[i5] = ((bArr[i4] & 255) << ((i3 & 3) * 8)) | iArr[i5];
            i3++;
            i4++;
        }
        for (int i6 = 0; i6 < 4; i6++) {
            iArr[i6] = iArr[i6] ^ this.f45846d[i6];
        }
        int i7 = 4;
        while (i7 < 56) {
            mo50429g(iArr, iArr2, i7);
            int i8 = i7 + 4;
            mo50429g(iArr2, iArr, i8);
            i7 = i8 + 4;
        }
        int i9 = 0;
        while (i < 16) {
            bArr[i9] = (byte) (iArr[i >> 2] >> ((i & 3) << 3));
            i++;
            i9++;
        }
    }

    /* renamed from: i */
    public final void mo50431i(byte[] bArr) {
        if (this.f45844b != null) {
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr2 = this.f45845c;
                bArr2[i] = (byte) (bArr2[i] ^ bArr[i]);
            }
            byte[] bArr3 = this.f45844b;
            mo50428f(bArr3.length, bArr3);
        }
    }

    /* renamed from: k */
    public final void mo50432k(int i, int i2, byte[] bArr) {
        int i3 = 16 - this.f45850h;
        while (true) {
            int i4 = this.f45850h;
            if (i2 <= i4) {
                break;
            }
            while (i4 > 0) {
                byte[] bArr2 = this.f45849g;
                bArr2[i3] = (byte) (bArr[i] ^ bArr2[i3]);
                i4--;
                i3++;
                i++;
            }
            mo50430h(this.f45849g, f45837i);
            i2 -= this.f45850h;
            this.f45850h = 16;
            i3 = 0;
        }
        int i5 = i2;
        while (i5 > 0) {
            byte[] bArr3 = this.f45849g;
            bArr3[i3] = (byte) (bArr[i] ^ bArr3[i3]);
            i5--;
            i3++;
            i++;
        }
        this.f45850h -= i2;
    }
}
