package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class CollignonProjection extends Projection {
    private static final double FXC = 1.1283791670955126d;
    private static final double FYC = 1.772453850905516d;
    private static final double ONEEPS = 1.0000001d;

    public boolean hasInverse() {
        return true;
    }

    public boolean isEqualArea() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double sin = 1.0d - Math.sin(d2);
        doubleR.f36953y = sin;
        if (sin <= 0.0d) {
            doubleR.f36953y = 0.0d;
        } else {
            doubleR.f36953y = Math.sqrt(sin);
        }
        double d3 = d * FXC;
        double d4 = doubleR.f36953y;
        doubleR.f36952x = d3 * d4;
        doubleR.f36953y = (1.0d - d4) * FYC;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = (d2 / FYC) - 1.0d;
        double d5 = 1.0d - (d4 * d4);
        doubleR.f36953y = d5;
        if (Math.abs(d5) < 1.0d) {
            doubleR.f36953y = Math.asin(d4);
        } else if (Math.abs(d4) <= ONEEPS) {
            if (d4 < 0.0d) {
                d3 = -1.5707963267948966d;
            } else {
                d3 = 1.5707963267948966d;
            }
            doubleR.f36953y = d3;
        } else {
            throw new ProjectionException("I");
        }
        double sin = 1.0d - Math.sin(d4);
        doubleR.f36952x = sin;
        if (sin <= 0.0d) {
            doubleR.f36952x = 0.0d;
        } else {
            doubleR.f36952x = d / (Math.sqrt(sin) * FXC);
        }
        doubleR.f36953y = d4;
        return doubleR;
    }

    public String toString() {
        return "Collignon";
    }
}
