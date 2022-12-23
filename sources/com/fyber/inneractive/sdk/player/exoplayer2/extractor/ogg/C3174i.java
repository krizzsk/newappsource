package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i */
public final class C3174i {

    /* renamed from: a */
    public final byte[] f11264a;

    /* renamed from: b */
    public final int f11265b;

    /* renamed from: c */
    public int f11266c;

    /* renamed from: d */
    public int f11267d;

    public C3174i(byte[] bArr) {
        this.f11264a = bArr;
        this.f11265b = bArr.length;
    }

    /* renamed from: a */
    public boolean mo14240a() {
        boolean z = (((this.f11264a[this.f11266c] & 255) >> this.f11267d) & 1) == 1;
        mo14241b(1);
        return z;
    }

    /* renamed from: b */
    public void mo14241b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f11266c + i3;
        this.f11266c = i4;
        int i5 = (i - (i3 * 8)) + this.f11267d;
        this.f11267d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f11266c = i4 + 1;
            this.f11267d = i5 - 8;
        }
        int i6 = this.f11266c;
        if (i6 < 0 || (i6 >= (i2 = this.f11265b) && !(i6 == i2 && this.f11267d == 0))) {
            z = false;
        }
        C3380a.m8507b(z);
    }

    /* renamed from: a */
    public int mo14239a(int i) {
        int i2 = this.f11266c;
        int min = Math.min(i, 8 - this.f11267d);
        int i3 = i2 + 1;
        int i4 = ((this.f11264a[i2] & 255) >> this.f11267d) & (ValidationUtils.APPBOY_STRING_MAX_LENGTH >> (8 - min));
        while (min < i) {
            i4 |= (this.f11264a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo14241b(i);
        return i5;
    }
}
