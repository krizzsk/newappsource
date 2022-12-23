package p289va;

import java.util.Arrays;
import p583jk.C17875h;

/* renamed from: va.r */
public final class C6921r {

    /* renamed from: a */
    public final int f21543a;

    /* renamed from: b */
    public boolean f21544b;

    /* renamed from: c */
    public boolean f21545c;

    /* renamed from: d */
    public byte[] f21546d;

    /* renamed from: e */
    public int f21547e;

    public C6921r(int i) {
        this.f21543a = i;
        byte[] bArr = new byte[131];
        this.f21546d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo23163a(int i, int i2, byte[] bArr) {
        if (this.f21544b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f21546d;
            int length = bArr2.length;
            int i4 = this.f21547e;
            if (length < i4 + i3) {
                this.f21546d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f21546d, this.f21547e, i3);
            this.f21547e += i3;
        }
    }

    /* renamed from: b */
    public final boolean mo23164b(int i) {
        if (!this.f21544b) {
            return false;
        }
        this.f21547e -= i;
        this.f21544b = false;
        this.f21545c = true;
        return true;
    }

    /* renamed from: c */
    public final void mo23165c() {
        this.f21544b = false;
        this.f21545c = false;
    }

    /* renamed from: d */
    public final void mo23166d(int i) {
        boolean z = true;
        C17875h.m44304o(!this.f21544b);
        if (i != this.f21543a) {
            z = false;
        }
        this.f21544b = z;
        if (z) {
            this.f21547e = 3;
            this.f21545c = false;
        }
    }
}
