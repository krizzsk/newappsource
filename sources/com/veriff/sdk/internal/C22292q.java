package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.q */
public class C22292q {

    /* renamed from: a */
    private final float f56249a;

    /* renamed from: b */
    private final float f56250b;

    public C22292q(float f, float f2) {
        this.f56249a = f;
        this.f56250b = f2;
    }

    /* renamed from: a */
    public final float mo56294a() {
        return this.f56249a;
    }

    /* renamed from: b */
    public final float mo56295b() {
        return this.f56250b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22292q) {
            C22292q qVar = (C22292q) obj;
            if (this.f56249a == qVar.f56249a && this.f56250b == qVar.f56250b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f56250b) + (Float.floatToIntBits(this.f56249a) * 31);
    }

    public final String toString() {
        return "(" + this.f56249a + ',' + this.f56250b + ')';
    }
}
