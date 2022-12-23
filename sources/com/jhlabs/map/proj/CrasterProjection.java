package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class CrasterProjection extends Projection {
    private static final double RXM = 1.0233267079464885d;
    private static final double RYM = 0.32573500793527993d;
    private static final double THIRD = 0.3333333333333333d;

    /* renamed from: XM */
    private static final double f36988XM = 0.9772050238058398d;

    /* renamed from: YM */
    private static final double f36989YM = 3.0699801238394655d;

    public boolean hasInverse() {
        return true;
    }

    public boolean isEqualArea() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = d2 * THIRD;
        doubleR.f36952x = ((Math.cos(d3 + d3) * 2.0d) - 1.0d) * d * f36988XM;
        doubleR.f36953y = Math.sin(d3) * f36989YM;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double asin = Math.asin(d2 * RYM) * 3.0d;
        doubleR.f36953y = asin;
        doubleR.f36952x = (d * RXM) / ((Math.cos((asin + asin) * THIRD) * 2.0d) - 1.0d);
        return doubleR;
    }

    public String toString() {
        return "Craster Parabolic (Putnins P4)";
    }
}
