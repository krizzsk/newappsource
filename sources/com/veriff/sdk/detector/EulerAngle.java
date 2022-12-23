package com.veriff.sdk.detector;

import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/detector/EulerAngle;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "x", "F", "getX", "()F", "y", "getY", "z", "getZ", "<init>", "(FFF)V", "detector-common_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class EulerAngle {

    /* renamed from: x */
    private final float f31141x;

    /* renamed from: y */
    private final float f31142y;

    /* renamed from: z */
    private final float f31143z;

    public EulerAngle(float f, float f2, float f3) {
        this.f31141x = f;
        this.f31142y = f2;
        this.f31143z = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EulerAngle)) {
            return false;
        }
        EulerAngle eulerAngle = (EulerAngle) obj;
        return Float.compare(this.f31141x, eulerAngle.f31141x) == 0 && Float.compare(this.f31142y, eulerAngle.f31142y) == 0 && Float.compare(this.f31143z, eulerAngle.f31143z) == 0;
    }

    public final float getX() {
        return this.f31141x;
    }

    public final float getY() {
        return this.f31142y;
    }

    public final float getZ() {
        return this.f31143z;
    }

    public int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f31142y);
        return Float.floatToIntBits(this.f31143z) + ((floatToIntBits + (Float.floatToIntBits(this.f31141x) * 31)) * 31);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("EulerAngle(x=");
        k.append(this.f31141x);
        k.append(", y=");
        k.append(this.f31142y);
        k.append(", z=");
        k.append(this.f31143z);
        k.append(")");
        return k.toString();
    }
}
