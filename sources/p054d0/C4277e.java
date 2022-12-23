package p054d0;

import android.graphics.Matrix;
import p066e0.C4450p0;

/* renamed from: d0.e */
public final class C4277e extends C4287i0 {

    /* renamed from: a */
    public final C4450p0 f15196a;

    /* renamed from: b */
    public final long f15197b;

    /* renamed from: c */
    public final int f15198c;

    /* renamed from: d */
    public final Matrix f15199d;

    public C4277e(C4450p0 p0Var, long j, int i, Matrix matrix) {
        if (p0Var != null) {
            this.f15196a = p0Var;
            this.f15197b = j;
            this.f15198c = i;
            if (matrix != null) {
                this.f15199d = matrix;
                return;
            }
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        throw new NullPointerException("Null tagBundle");
    }

    /* renamed from: b */
    public final int mo19790b() {
        return this.f15198c;
    }

    /* renamed from: c */
    public final Matrix mo19791c() {
        return this.f15199d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4287i0)) {
            return false;
        }
        C4287i0 i0Var = (C4287i0) obj;
        if (!this.f15196a.equals(i0Var.getTagBundle()) || this.f15197b != i0Var.getTimestamp() || this.f15198c != i0Var.mo19790b() || !this.f15199d.equals(i0Var.mo19791c())) {
            return false;
        }
        return true;
    }

    public final C4450p0 getTagBundle() {
        return this.f15196a;
    }

    public final long getTimestamp() {
        return this.f15197b;
    }

    public final int hashCode() {
        long j = this.f15197b;
        return ((((((this.f15196a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f15198c) * 1000003) ^ this.f15199d.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ImmutableImageInfo{tagBundle=");
        k.append(this.f15196a);
        k.append(", timestamp=");
        k.append(this.f15197b);
        k.append(", rotationDegrees=");
        k.append(this.f15198c);
        k.append(", sensorToBufferTransformMatrix=");
        k.append(this.f15199d);
        k.append("}");
        return k.toString();
    }
}
