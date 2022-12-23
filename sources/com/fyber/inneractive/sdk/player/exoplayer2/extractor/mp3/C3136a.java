package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C3137b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a */
public final class C3136a implements C3137b.C3138a {

    /* renamed from: a */
    public final long f10936a;

    /* renamed from: b */
    public final int f10937b;

    /* renamed from: c */
    public final long f10938c;

    public C3136a(long j, int i, long j2) {
        long j3;
        this.f10936a = j;
        this.f10937b = i;
        if (j2 == -1) {
            j3 = -9223372036854775807L;
        } else {
            j3 = mo14206b(j2);
        }
        this.f10938c = j3;
    }

    /* renamed from: a */
    public boolean mo14079a() {
        return this.f10938c != -9223372036854775807L;
    }

    /* renamed from: b */
    public long mo14206b(long j) {
        return ((Math.max(0, j - this.f10936a) * 1000000) * 8) / ((long) this.f10937b);
    }

    /* renamed from: c */
    public long mo14080c() {
        return this.f10938c;
    }

    /* renamed from: a */
    public long mo14078a(long j) {
        long j2 = this.f10938c;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        int i = C3406u.f12148a;
        long max = Math.max(0, Math.min(j, j2));
        return ((max * ((long) this.f10937b)) / 8000000) + this.f10936a;
    }
}
