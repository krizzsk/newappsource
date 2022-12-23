package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n */
public final class C3199n {

    /* renamed from: a */
    public final int f11454a;

    /* renamed from: b */
    public boolean f11455b;

    /* renamed from: c */
    public boolean f11456c;

    /* renamed from: d */
    public byte[] f11457d;

    /* renamed from: e */
    public int f11458e;

    public C3199n(int i, int i2) {
        this.f11454a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f11457d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo14258a() {
        this.f11455b = false;
        this.f11456c = false;
    }

    /* renamed from: b */
    public void mo14261b(int i) {
        boolean z = true;
        C3380a.m8507b(!this.f11455b);
        if (i != this.f11454a) {
            z = false;
        }
        this.f11455b = z;
        if (z) {
            this.f11458e = 3;
            this.f11456c = false;
        }
    }

    /* renamed from: a */
    public void mo14259a(byte[] bArr, int i, int i2) {
        if (this.f11455b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f11457d;
            int length = bArr2.length;
            int i4 = this.f11458e + i3;
            if (length < i4) {
                this.f11457d = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.f11457d, this.f11458e, i3);
            this.f11458e += i3;
        }
    }

    /* renamed from: a */
    public boolean mo14260a(int i) {
        if (!this.f11455b) {
            return false;
        }
        this.f11458e -= i;
        this.f11455b = false;
        this.f11456c = true;
        return true;
    }
}
