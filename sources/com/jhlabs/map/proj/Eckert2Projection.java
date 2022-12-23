package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class Eckert2Projection extends Projection {
    private static final double C13 = 0.3333333333333333d;
    private static final double FXC = 0.46065886596178063d;
    private static final double FYC = 1.4472025091165353d;
    private static final double ONEEPS = 1.0000001d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = d * FXC;
        double sqrt = Math.sqrt(4.0d - (Math.sin(Math.abs(d2)) * 3.0d));
        doubleR.f36952x = d3 * sqrt;
        double d4 = (2.0d - sqrt) * FYC;
        doubleR.f36953y = d4;
        if (d2 < 0.0d) {
            doubleR.f36953y = -d4;
        }
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double abs = 2.0d - (Math.abs(d2) / FYC);
        doubleR.f36952x = d / (FXC * abs);
        double d4 = (4.0d - (abs * abs)) * C13;
        doubleR.f36953y = d4;
        if (Math.abs(d4) < 1.0d) {
            doubleR.f36953y = Math.asin(doubleR.f36953y);
        } else if (Math.abs(doubleR.f36953y) <= ONEEPS) {
            if (doubleR.f36953y < 0.0d) {
                d3 = -1.5707963267948966d;
            } else {
                d3 = 1.5707963267948966d;
            }
            doubleR.f36953y = d3;
        } else {
            throw new ProjectionException("I");
        }
        if (d2 < 0.0d) {
            doubleR.f36953y = -doubleR.f36953y;
        }
        return doubleR;
    }

    public String toString() {
        return "Eckert II";
    }
}
