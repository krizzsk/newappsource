package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class FaheyProjection extends Projection {
    private static final double TOL = 1.0E-6d;

    private double asqrt(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        return Math.sqrt(d);
    }

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double tan = Math.tan(d2 * 0.5d);
        doubleR.f36952x = tan;
        doubleR.f36953y = 1.819152d * tan;
        doubleR.f36952x = d * 0.819152d * asqrt(1.0d - (tan * tan));
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = doubleR.f36953y / 1.819152d;
        doubleR.f36953y = d4;
        Math.atan(d4);
        double d5 = 1.0d - (d2 * d2);
        doubleR.f36953y = d5;
        if (Math.abs(d5) < TOL) {
            d3 = 0.0d;
        } else {
            d3 = d / (Math.sqrt(d2) * 0.819152d);
        }
        doubleR.f36952x = d3;
        return doubleR;
    }

    public String toString() {
        return "Fahey";
    }
}
