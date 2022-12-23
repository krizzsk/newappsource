package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class NellProjection extends Projection {
    private static final double LOOP_TOL = 1.0E-7d;
    private static final int MAX_ITER = 10;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = d2;
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(d2) * 2.0d;
        double d4 = d3 * d3;
        doubleR2.f36953y = ((((-0.011412d * d4) - 48.1084416d) * d4) + 1.00371d) * doubleR2.f36953y;
        for (int i = 10; i > 0; i--) {
            double d5 = doubleR2.f36953y;
            double sin2 = ((Math.sin(d2) + d3) - sin) / (Math.cos(d2) + 1.0d);
            doubleR2.f36953y = d5 - sin2;
            if (Math.abs(sin2) < LOOP_TOL) {
                break;
            }
        }
        doubleR2.f36952x = (Math.cos(d2) + 1.0d) * 0.5d * d;
        doubleR2.f36953y = d3;
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = (d * 2.0d) / (Math.cos(d2) + 1.0d);
        doubleR.f36953y = MapMath.asin((Math.sin(d2) + d2) * 0.5d);
        return doubleR;
    }

    public String toString() {
        return "Nell";
    }
}
