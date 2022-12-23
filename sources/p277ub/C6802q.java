package p277ub;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;
import p583jk.C17875h;

/* renamed from: ub.q */
public final class C6802q {

    /* renamed from: a */
    public byte[] f21034a;

    /* renamed from: b */
    public int f21035b;

    /* renamed from: c */
    public int f21036c;

    /* renamed from: d */
    public int f21037d;

    public C6802q() {
        this.f21034a = C6774a0.f20964f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f21037d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22968a() {
        /*
            r2 = this;
            int r0 = r2.f21035b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f21037d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f21036c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p583jk.C17875h.m44304o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p277ub.C6802q.mo22968a():void");
    }

    /* renamed from: b */
    public final int mo22969b() {
        return ((this.f21037d - this.f21035b) * 8) - this.f21036c;
    }

    /* renamed from: c */
    public final void mo22970c() {
        if (this.f21036c != 0) {
            this.f21036c = 0;
            this.f21035b++;
            mo22968a();
        }
    }

    /* renamed from: d */
    public final int mo22971d() {
        boolean z;
        if (this.f21036c == 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        return this.f21035b;
    }

    /* renamed from: e */
    public final boolean mo22972e() {
        boolean z;
        if ((this.f21034a[this.f21035b] & (RecyclerView.C1119a0.FLAG_IGNORE >> this.f21036c)) != 0) {
            z = true;
        } else {
            z = false;
        }
        mo22978k();
        return z;
    }

    /* renamed from: f */
    public final int mo22973f(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f21036c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f21036c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f21036c = i4;
            byte[] bArr = this.f21034a;
            int i5 = this.f21035b;
            this.f21035b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f21034a;
        int i6 = this.f21035b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f21036c = 0;
            this.f21035b = i6 + 1;
        }
        mo22968a();
        return i7;
    }

    /* renamed from: g */
    public final void mo22974g(int i, byte[] bArr) {
        int i2 = (i >> 3) + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f21034a;
            int i4 = this.f21035b;
            int i5 = i4 + 1;
            this.f21035b = i5;
            byte b = bArr2[i4];
            int i6 = this.f21036c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (ValidationUtils.APPBOY_STRING_MAX_LENGTH >> i7));
            bArr[i2] = b3;
            int i8 = this.f21036c;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.f21034a;
                int i9 = this.f21035b;
                this.f21035b = i9 + 1;
                bArr[i2] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                this.f21036c = i8 - 8;
            }
            int i11 = this.f21036c + i7;
            this.f21036c = i11;
            byte[] bArr4 = this.f21034a;
            int i12 = this.f21035b;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i2]);
            if (i11 == 8) {
                this.f21036c = 0;
                this.f21035b = i12 + 1;
            }
            mo22968a();
        }
    }

    /* renamed from: h */
    public final void mo22975h(int i, byte[] bArr) {
        boolean z;
        if (this.f21036c == 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        System.arraycopy(this.f21034a, this.f21035b, bArr, 0, i);
        this.f21035b += i;
        mo22968a();
    }

    /* renamed from: i */
    public final void mo22976i(int i, byte[] bArr) {
        this.f21034a = bArr;
        this.f21035b = 0;
        this.f21036c = 0;
        this.f21037d = i;
    }

    /* renamed from: j */
    public final void mo22977j(int i) {
        int i2 = i / 8;
        this.f21035b = i2;
        this.f21036c = i - (i2 * 8);
        mo22968a();
    }

    /* renamed from: k */
    public final void mo22978k() {
        int i = this.f21036c + 1;
        this.f21036c = i;
        if (i == 8) {
            this.f21036c = 0;
            this.f21035b++;
        }
        mo22968a();
    }

    /* renamed from: l */
    public final void mo22979l(int i) {
        int i2 = i / 8;
        int i3 = this.f21035b + i2;
        this.f21035b = i3;
        int i4 = (i - (i2 * 8)) + this.f21036c;
        this.f21036c = i4;
        if (i4 > 7) {
            this.f21035b = i3 + 1;
            this.f21036c = i4 - 8;
        }
        mo22968a();
    }

    /* renamed from: m */
    public final void mo22980m(int i) {
        boolean z;
        if (this.f21036c == 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        this.f21035b += i;
        mo22968a();
    }

    public C6802q(byte[] bArr, int i) {
        this.f21034a = bArr;
        this.f21037d = i;
    }
}
