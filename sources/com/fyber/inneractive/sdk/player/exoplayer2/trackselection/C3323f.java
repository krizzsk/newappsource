package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f */
public final class C3323f {

    /* renamed from: a */
    public final int f11909a;

    /* renamed from: b */
    public final C3321e[] f11910b;

    /* renamed from: c */
    public int f11911c;

    public C3323f(C3321e... eVarArr) {
        this.f11910b = eVarArr;
        this.f11909a = eVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3323f.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11910b, ((C3323f) obj).f11910b);
    }

    public int hashCode() {
        if (this.f11911c == 0) {
            this.f11911c = Arrays.hashCode(this.f11910b) + 527;
        }
        return this.f11911c;
    }
}
