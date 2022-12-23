package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class NellHProjection extends Projection {
    private static final double EPS = 1.0E-7d;
    private static final int NITER = 9;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = (Math.cos(d2) + 1.0d) * d * 0.5d;
        doubleR.f36953y = (d2 - Math.tan(0.5d * d2)) * 2.0d;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        Point2D.Double doubleR2 = doubleR;
        double d4 = d2 * 0.5d;
        int i = 9;
        while (i > 0) {
            double cos = Math.cos(d4);
            double d5 = doubleR2.f36953y;
            double tan = ((d2 - Math.tan(d2 / 2.0d)) - d4) / (1.0d - (0.5d / (cos * cos)));
            doubleR2.f36953y = d5 - tan;
            if (Math.abs(tan) < EPS) {
                break;
            }
            i--;
        }
        if (i == 0) {
            if (d4 < 0.0d) {
                d3 = -1.5707963267948966d;
            } else {
                d3 = 1.5707963267948966d;
            }
            doubleR2.f36953y = d3;
            doubleR2.f36952x = d * 2.0d;
        } else {
            doubleR2.f36952x = (d * 2.0d) / (Math.cos(d2) + 1.0d);
        }
        return doubleR2;
    }

    public String toString() {
        return "Nell-Hammer";
    }
}
