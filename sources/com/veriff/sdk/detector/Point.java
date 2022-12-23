package com.veriff.sdk.detector;

import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/detector/Point;", "", "", "by", "Lcom/veriff/sdk/detector/Rectangle;", "grow", "", "toString", "", "hashCode", "other", "", "equals", "x", "F", "getX", "()F", "y", "getY", "<init>", "(FF)V", "detector-common_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class Point {

    /* renamed from: x */
    private final float f31144x;

    /* renamed from: y */
    private final float f31145y;

    public Point(float f, float f2) {
        this.f31144x = f;
        this.f31145y = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return Float.compare(this.f31144x, point.f31144x) == 0 && Float.compare(this.f31145y, point.f31145y) == 0;
    }

    public final float getX() {
        return this.f31144x;
    }

    public final float getY() {
        return this.f31145y;
    }

    public final Rectangle grow(float f) {
        return new Rectangle(new Point(this.f31144x - f, this.f31145y - f), new Point(this.f31144x + f, this.f31145y + f));
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f31145y) + (Float.floatToIntBits(this.f31144x) * 31);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Point(x=");
        k.append(this.f31144x);
        k.append(", y=");
        k.append(this.f31145y);
        k.append(")");
        return k.toString();
    }
}
