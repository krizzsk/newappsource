package com.veriff.sdk.detector;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0000J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001d"}, mo59060d2 = {"Lcom/veriff/sdk/detector/Rectangle;", "", "Lcom/veriff/sdk/detector/Point;", "point", "", "contains", "normalize", "", "toString", "", "hashCode", "other", "equals", "topLeft", "Lcom/veriff/sdk/detector/Point;", "getTopLeft", "()Lcom/veriff/sdk/detector/Point;", "bottomRight", "getBottomRight", "", "getWidth", "()F", "width", "getHeight", "height", "getCenter", "center", "<init>", "(Lcom/veriff/sdk/detector/Point;Lcom/veriff/sdk/detector/Point;)V", "detector-common_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class Rectangle {
    private final Point bottomRight;
    private final Point topLeft;

    public Rectangle(Point point, Point point2) {
        C24362h.m61211f(point, "topLeft");
        C24362h.m61211f(point2, "bottomRight");
        this.topLeft = point;
        this.bottomRight = point2;
    }

    public final boolean contains(Point point) {
        C24362h.m61211f(point, "point");
        float x = this.topLeft.getX();
        float x2 = this.bottomRight.getX();
        float x3 = point.getX();
        if (x3 >= x && x3 <= x2) {
            float y = this.topLeft.getY();
            float y2 = this.bottomRight.getY();
            float y3 = point.getY();
            return y3 >= y && y3 <= y2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return C24362h.m61206a(this.topLeft, rectangle.topLeft) && C24362h.m61206a(this.bottomRight, rectangle.bottomRight);
    }

    public final Point getBottomRight() {
        return this.bottomRight;
    }

    public final Point getCenter() {
        float f = (float) 2;
        return new Point((this.bottomRight.getX() + this.topLeft.getX()) / f, (this.bottomRight.getY() + this.topLeft.getY()) / f);
    }

    public final float getHeight() {
        return Math.abs(this.topLeft.getY() - this.bottomRight.getY());
    }

    public final Point getTopLeft() {
        return this.topLeft;
    }

    public final float getWidth() {
        return Math.abs(this.topLeft.getX() - this.bottomRight.getX());
    }

    public int hashCode() {
        Point point = this.topLeft;
        int i = 0;
        int hashCode = (point != null ? point.hashCode() : 0) * 31;
        Point point2 = this.bottomRight;
        if (point2 != null) {
            i = point2.hashCode();
        }
        return hashCode + i;
    }

    public final Rectangle normalize() {
        return new Rectangle(new Point(Math.min(this.topLeft.getX(), this.bottomRight.getX()), Math.min(this.topLeft.getY(), this.bottomRight.getY())), new Point(Math.max(this.topLeft.getX(), this.bottomRight.getX()), Math.max(this.topLeft.getY(), this.bottomRight.getY())));
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Rectangle(topLeft=");
        k.append(this.topLeft);
        k.append(", bottomRight=");
        k.append(this.bottomRight);
        k.append(")");
        return k.toString();
    }
}
