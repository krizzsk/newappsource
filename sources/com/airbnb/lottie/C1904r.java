package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.r */
public final class C1904r<V> {

    /* renamed from: a */
    public final V f6703a;

    /* renamed from: b */
    public final Throwable f6704b;

    public C1904r(C1867f fVar) {
        this.f6703a = fVar;
        this.f6704b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1904r)) {
            return false;
        }
        C1904r rVar = (C1904r) obj;
        V v = this.f6703a;
        if (v != null && v.equals(rVar.f6703a)) {
            return true;
        }
        Throwable th = this.f6704b;
        if (th == null || rVar.f6704b == null) {
            return false;
        }
        return th.toString().equals(this.f6704b.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6703a, this.f6704b});
    }

    public C1904r(Throwable th) {
        this.f6704b = th;
        this.f6703a = null;
    }
}
