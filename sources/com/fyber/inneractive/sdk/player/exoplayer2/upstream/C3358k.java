package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.k */
public final class C3358k implements C3328b {

    /* renamed from: a */
    public final boolean f12011a;

    /* renamed from: b */
    public final int f12012b;

    /* renamed from: c */
    public final byte[] f12013c;

    /* renamed from: d */
    public final C3326a[] f12014d;

    /* renamed from: e */
    public int f12015e;

    /* renamed from: f */
    public int f12016f;

    /* renamed from: g */
    public int f12017g;

    /* renamed from: h */
    public C3326a[] f12018h;

    public C3358k(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C3380a.m8505a(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C3380a.m8505a(z3);
        this.f12011a = z;
        this.f12012b = i;
        this.f12017g = i2;
        this.f12018h = new C3326a[(i2 + 100)];
        if (i2 > 0) {
            this.f12013c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f12018h[i3] = new C3326a(this.f12013c, i3 * i);
            }
        } else {
            this.f12013c = null;
        }
        this.f12014d = new C3326a[1];
    }

    /* renamed from: a */
    public synchronized void mo14505a(C3326a[] aVarArr) {
        boolean z;
        int i = this.f12017g;
        int length = aVarArr.length + i;
        C3326a[] aVarArr2 = this.f12018h;
        if (length >= aVarArr2.length) {
            this.f12018h = (C3326a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (C3326a aVar : aVarArr) {
            byte[] bArr = aVar.f11916a;
            if (bArr != this.f12013c) {
                if (bArr.length != this.f12012b) {
                    z = false;
                    C3380a.m8505a(z);
                    C3326a[] aVarArr3 = this.f12018h;
                    int i2 = this.f12017g;
                    this.f12017g = i2 + 1;
                    aVarArr3[i2] = aVar;
                }
            }
            z = true;
            C3380a.m8505a(z);
            C3326a[] aVarArr32 = this.f12018h;
            int i22 = this.f12017g;
            this.f12017g = i22 + 1;
            aVarArr32[i22] = aVar;
        }
        this.f12016f -= aVarArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public synchronized void mo14506b() {
        int i = 0;
        int max = Math.max(0, C3406u.m8588a(this.f12015e, this.f12012b) - this.f12016f);
        int i2 = this.f12017g;
        if (max < i2) {
            if (this.f12013c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    C3326a[] aVarArr = this.f12018h;
                    C3326a aVar = aVarArr[i];
                    byte[] bArr = aVar.f11916a;
                    byte[] bArr2 = this.f12013c;
                    if (bArr == bArr2) {
                        i++;
                    } else {
                        C3326a aVar2 = aVarArr[i3];
                        if (aVar2.f11916a != bArr2) {
                            i3--;
                        } else {
                            aVarArr[i] = aVar2;
                            aVarArr[i3] = aVar;
                            i3--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f12017g) {
                    return;
                }
            }
            Arrays.fill(this.f12018h, max, this.f12017g, (Object) null);
            this.f12017g = max;
        }
    }

    /* renamed from: a */
    public int mo14504a() {
        return this.f12012b;
    }
}
