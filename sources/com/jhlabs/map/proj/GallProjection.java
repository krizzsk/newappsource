package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class GallProjection extends Projection {
    private static final double RXF = 1.4142135623730951d;
    private static final double RYF = 0.585786437626905d;

    /* renamed from: XF */
    private static final double f37013XF = 0.7071067811865476d;

    /* renamed from: YF */
    private static final double f37014YF = 1.7071067811865475d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = d * f37013XF;
        doubleR.f36953y = Math.tan(d2 * 0.5d) * f37014YF;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = d * RXF;
        doubleR.f36953y = Math.atan(d2 * RYF) * 2.0d;
        return doubleR;
    }

    public String toString() {
        return "Gall (Gall Stereographic)";
    }
}
