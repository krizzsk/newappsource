package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C3137b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c */
public final class C3139c implements C3137b.C3138a {

    /* renamed from: a */
    public final long[] f10954a;

    /* renamed from: b */
    public final long[] f10955b;

    /* renamed from: c */
    public final long f10956c;

    public C3139c(long[] jArr, long[] jArr2, long j) {
        this.f10954a = jArr;
        this.f10955b = jArr2;
        this.f10956c = j;
    }

    /* renamed from: a */
    public long mo14078a(long j) {
        return this.f10955b[C3406u.m8599b(this.f10954a, j, true, true)];
    }

    /* renamed from: a */
    public boolean mo14079a() {
        return true;
    }

    /* renamed from: b */
    public long mo14206b(long j) {
        return this.f10954a[C3406u.m8599b(this.f10955b, j, true, true)];
    }

    /* renamed from: c */
    public long mo14080c() {
        return this.f10956c;
    }
}
