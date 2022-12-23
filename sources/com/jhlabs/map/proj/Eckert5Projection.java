package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class Eckert5Projection extends Projection {
    private static final double RXF = 2.267508027238226d;
    private static final double RYF = 1.133754013619113d;

    /* renamed from: XF */
    private static final double f36998XF = 0.4410127717245515d;

    /* renamed from: YF */
    private static final double f36999YF = 0.882025543449103d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = (Math.cos(d2) + 1.0d) * f36998XF * d;
        doubleR.f36953y = d2 * f36999YF;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3 = d * RXF;
        double d4 = d2 * RYF;
        doubleR.f36953y = d4;
        doubleR.f36952x = d3 / (Math.cos(d4) + 1.0d);
        return doubleR;
    }

    public String toString() {
        return "Eckert V";
    }
}
