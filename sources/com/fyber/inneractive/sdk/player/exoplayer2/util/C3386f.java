package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.f */
public final class C3386f {

    /* renamed from: a */
    public int f12098a;

    /* renamed from: b */
    public long[] f12099b;

    public C3386f(int i) {
        this.f12099b = new long[i];
    }

    /* renamed from: a */
    public void mo14531a(long j) {
        int i = this.f12098a;
        long[] jArr = this.f12099b;
        if (i == jArr.length) {
            this.f12099b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f12099b;
        int i2 = this.f12098a;
        this.f12098a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: a */
    public long mo14530a(int i) {
        if (i >= 0 && i < this.f12098a) {
            return this.f12099b[i];
        }
        StringBuilder r = C25541a.m63887r("Invalid index ", i, ", size is ");
        r.append(this.f12098a);
        throw new IndexOutOfBoundsException(r.toString());
    }
}
