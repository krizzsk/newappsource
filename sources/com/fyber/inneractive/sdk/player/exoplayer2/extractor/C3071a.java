package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.a */
public final class C3071a implements C3124m {

    /* renamed from: a */
    public final long[] f10542a;

    /* renamed from: b */
    public final long[] f10543b;

    /* renamed from: c */
    public final long f10544c;

    public C3071a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f10542a = jArr;
        this.f10543b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f10544c = jArr2[i] + jArr3[i];
            return;
        }
        this.f10544c = 0;
    }

    /* renamed from: a */
    public long mo14078a(long j) {
        return this.f10542a[C3406u.m8599b(this.f10543b, j, true, true)];
    }

    /* renamed from: a */
    public boolean mo14079a() {
        return true;
    }

    /* renamed from: c */
    public long mo14080c() {
        return this.f10544c;
    }
}
