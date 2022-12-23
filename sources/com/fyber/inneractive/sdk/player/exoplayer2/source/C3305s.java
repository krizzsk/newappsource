package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.s */
public final class C3305s {

    /* renamed from: d */
    public static final C3305s f11874d = new C3305s(new C3304r[0]);

    /* renamed from: a */
    public final int f11875a;

    /* renamed from: b */
    public final C3304r[] f11876b;

    /* renamed from: c */
    public int f11877c;

    public C3305s(C3304r... rVarArr) {
        this.f11876b = rVarArr;
        this.f11875a = rVarArr.length;
    }

    /* renamed from: a */
    public int mo14434a(C3304r rVar) {
        for (int i = 0; i < this.f11875a; i++) {
            if (this.f11876b[i] == rVar) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3305s.class != obj.getClass()) {
            return false;
        }
        C3305s sVar = (C3305s) obj;
        if (this.f11875a != sVar.f11875a || !Arrays.equals(this.f11876b, sVar.f11876b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f11877c == 0) {
            this.f11877c = Arrays.hashCode(this.f11876b);
        }
        return this.f11877c;
    }
}
