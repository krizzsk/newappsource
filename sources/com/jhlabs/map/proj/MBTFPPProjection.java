package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class MBTFPPProjection extends Projection {
    private static final double C13 = 0.3333333333333333d;
    private static final double C23 = 0.6666666666666666d;

    /* renamed from: CS */
    private static final double f37040CS = 0.9525793444156804d;
    private static final double FXC = 0.9258200997725514d;
    private static final double FYC = 3.401680257083045d;
    private static final double ONEEPS = 1.0000001d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36953y = Math.asin(Math.sin(d2) * f37040CS);
        doubleR.f36952x = ((Math.cos(C23 * d2) * 2.0d) - 1.0d) * d * FXC;
        doubleR.f36953y = Math.sin(d2 * C13) * FYC;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        Point2D.Double doubleR2 = doubleR;
        double d5 = d2 / FYC;
        doubleR2.f36953y = d5;
        if (Math.abs(d5) < 1.0d) {
            doubleR2.f36953y = Math.asin(doubleR2.f36953y);
        } else if (Math.abs(doubleR2.f36953y) <= ONEEPS) {
            if (doubleR2.f36953y < 0.0d) {
                d4 = -1.5707963267948966d;
            } else {
                d4 = 1.5707963267948966d;
            }
            doubleR2.f36953y = d4;
        } else {
            throw new ProjectionException("I");
        }
        double d6 = doubleR2.f36953y * 3.0d;
        doubleR2.f36953y = d6;
        doubleR2.f36952x = d / (((Math.cos(d6 * C23) * 2.0d) - 1.0d) * FXC);
        double sin = Math.sin(doubleR2.f36953y) / f37040CS;
        doubleR2.f36953y = sin;
        if (Math.abs(sin) < 1.0d) {
            doubleR2.f36953y = Math.asin(doubleR2.f36953y);
        } else if (Math.abs(doubleR2.f36953y) <= ONEEPS) {
            if (doubleR2.f36953y < 0.0d) {
                d3 = -1.5707963267948966d;
            } else {
                d3 = 1.5707963267948966d;
            }
            doubleR2.f36953y = d3;
        } else {
            throw new ProjectionException("I");
        }
        return doubleR2;
    }

    public String toString() {
        return "McBride-Thomas Flat-Polar Parabolic";
    }
}
