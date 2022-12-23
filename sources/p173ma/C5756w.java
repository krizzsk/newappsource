package p173ma;

import com.appboy.support.ValidationUtils;
import java.lang.reflect.Array;
import p534hh.C17433a;
import p583jk.C17875h;

/* renamed from: ma.w */
public final class C5756w {

    /* renamed from: a */
    public int f18636a;

    /* renamed from: b */
    public int f18637b;

    /* renamed from: c */
    public int f18638c;

    /* renamed from: d */
    public final Object f18639d;

    public /* synthetic */ C5756w(int i, int i2) {
        C17433a[] aVarArr = new C17433a[i];
        this.f18639d = aVarArr;
        int length = aVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            ((C17433a[]) this.f18639d)[i3] = new C17433a(((i2 + 4) * 17) + 1);
        }
        this.f18638c = i2 * 17;
        this.f18637b = i;
        this.f18636a = -1;
    }

    /* renamed from: a */
    public final C17433a mo21610a() {
        return ((C17433a[]) this.f18639d)[this.f18636a];
    }

    /* renamed from: b */
    public final byte[][] mo21611b(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = this.f18638c * i;
        iArr[0] = this.f18637b * i2;
        byte[][] bArr = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        int i3 = this.f18637b * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            C17433a aVar = ((C17433a[]) this.f18639d)[i4 / i2];
            int length = ((byte[]) aVar.f44903c).length * i;
            byte[] bArr2 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr2[i6] = ((byte[]) aVar.f44903c)[i6 / i];
            }
            bArr[i5] = bArr2;
        }
        return bArr;
    }

    /* renamed from: c */
    public final boolean mo21612c() {
        boolean z;
        if ((((((byte[]) this.f18639d)[this.f18637b] & 255) >> this.f18638c) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        mo21614e(1);
        return z;
    }

    /* renamed from: d */
    public final int mo21613d(int i) {
        int i2 = this.f18637b;
        int min = Math.min(i, 8 - this.f18638c);
        int i3 = i2 + 1;
        int i4 = ((((byte[]) this.f18639d)[i2] & 255) >> this.f18638c) & (ValidationUtils.APPBOY_STRING_MAX_LENGTH >> (8 - min));
        while (min < i) {
            i4 |= (((byte[]) this.f18639d)[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo21614e(i);
        return i5;
    }

    /* renamed from: e */
    public final void mo21614e(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f18637b + i3;
        this.f18637b = i4;
        int i5 = (i - (i3 * 8)) + this.f18638c;
        this.f18638c = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f18637b = i4 + 1;
            this.f18638c = i5 - 8;
        }
        int i6 = this.f18637b;
        if (i6 < 0 || (i6 >= (i2 = this.f18636a) && !(i6 == i2 && this.f18638c == 0))) {
            z = false;
        }
        C17875h.m44304o(z);
    }

    public /* synthetic */ C5756w(byte[] bArr) {
        this.f18639d = bArr;
        this.f18636a = bArr.length;
    }
}
