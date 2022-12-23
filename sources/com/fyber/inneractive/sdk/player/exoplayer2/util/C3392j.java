package com.fyber.inneractive.sdk.player.exoplayer2.util;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.j */
public final class C3392j {

    /* renamed from: a */
    public byte[] f12117a;

    /* renamed from: b */
    public int f12118b;

    /* renamed from: c */
    public int f12119c;

    /* renamed from: d */
    public int f12120d;

    public C3392j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    /* renamed from: a */
    public int mo14532a(int i) {
        int i2;
        this.f12119c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f12119c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f12119c = i4;
            byte[] bArr = this.f12117a;
            int i5 = this.f12118b;
            this.f12118b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f12117a;
        int i6 = this.f12118b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f12119c = 0;
            this.f12118b = i6 + 1;
        }
        mo14533a();
        return i7;
    }

    /* renamed from: b */
    public void mo14534b(int i) {
        int i2 = i / 8;
        this.f12118b = i2;
        this.f12119c = i - (i2 * 8);
        mo14533a();
    }

    /* renamed from: c */
    public void mo14536c(int i) {
        int i2 = i / 8;
        int i3 = this.f12118b + i2;
        this.f12118b = i3;
        int i4 = (i - (i2 * 8)) + this.f12119c;
        this.f12119c = i4;
        if (i4 > 7) {
            this.f12118b = i3 + 1;
            this.f12119c = i4 - 8;
        }
        mo14533a();
    }

    public C3392j(byte[] bArr, int i) {
        this.f12117a = bArr;
        this.f12120d = i;
    }

    /* renamed from: b */
    public boolean mo14535b() {
        byte[] bArr = this.f12117a;
        int i = this.f12118b;
        byte b = bArr[i];
        int i2 = this.f12119c;
        boolean z = (b & (RecyclerView.C1119a0.FLAG_IGNORE >> i2)) != 0;
        int i3 = i2 + 1;
        this.f12119c = i3;
        if (i3 == 8) {
            this.f12119c = 0;
            this.f12118b = i + 1;
        }
        mo14533a();
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f12120d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14533a() {
        /*
            r2 = this;
            int r0 = r2.f12118b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f12120d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f12119c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j.mo14533a():void");
    }
}
