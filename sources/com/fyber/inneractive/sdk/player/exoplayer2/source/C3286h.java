package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.h */
public final class C3286h implements C3302p {

    /* renamed from: a */
    public final C3302p[] f11801a;

    public C3286h(C3302p[] pVarArr) {
        this.f11801a = pVarArr;
    }

    /* renamed from: a */
    public long mo14138a() {
        long j = Long.MAX_VALUE;
        for (C3302p a : this.f11801a) {
            long a2 = a.mo14138a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: a */
    public boolean mo14144a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long a = mo14138a();
            if (a == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (C3302p pVar : this.f11801a) {
                if (pVar.mo14138a() == a) {
                    z |= pVar.mo14144a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
