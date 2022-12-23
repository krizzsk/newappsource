package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class AugustProjection extends Projection {

    /* renamed from: M */
    private static final double f36965M = 1.333333333333333d;

    public boolean hasInverse() {
        return false;
    }

    public boolean isConformal() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        double tan = Math.tan(d2 * 0.5d);
        double sqrt = Math.sqrt(1.0d - (tan * tan));
        double d3 = 0.5d * d;
        double cos = (Math.cos(d3) * sqrt) + 1.0d;
        double sin = (Math.sin(d3) * sqrt) / cos;
        double d4 = tan / cos;
        double d5 = sin * f36965M;
        double d6 = sin * sin;
        double d7 = d4 * d4;
        doubleR2.f36952x = ((d6 + 3.0d) - (d7 * 3.0d)) * d5;
        doubleR2.f36953y = (((d6 * 3.0d) + 3.0d) - d7) * d4 * f36965M;
        return doubleR2;
    }

    public String toString() {
        return "August Epicycloidal";
    }
}
