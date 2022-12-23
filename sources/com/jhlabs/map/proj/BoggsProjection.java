package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class BoggsProjection extends PseudoCylindricalProjection {
    private static final double EPS = 1.0E-7d;
    private static final double FXC = 2.00276d;
    private static final double FXC2 = 1.11072d;
    private static final double FYC = 0.49931d;
    private static final double FYC2 = 1.4142135623730951d;
    private static final int NITER = 20;
    private static final double ONETOL = 1.000001d;

    public boolean hasInverse() {
        return false;
    }

    public boolean isEqualArea() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = d2;
        Point2D.Double doubleR2 = doubleR;
        if (C0016g.m24g(d4, 1.5707963267948966d) < EPS) {
            doubleR2.f36952x = 0.0d;
            d3 = d4;
        } else {
            double sin = Math.sin(d2) * 3.141592653589793d;
            double d5 = d4;
            for (int i = 20; i > 0; i--) {
                double sin2 = ((Math.sin(d5) + d5) - sin) / (Math.cos(d5) + 1.0d);
                d5 -= sin2;
                if (Math.abs(sin2) < EPS) {
                    break;
                }
            }
            d3 = d5 * 0.5d;
            doubleR2.f36952x = (FXC * d) / ((FXC2 / Math.cos(d3)) + (1.0d / Math.cos(d2)));
        }
        doubleR2.f36953y = ((Math.sin(d3) * FYC2) + d4) * FYC;
        return doubleR2;
    }

    public String toString() {
        return "Boggs Eumorphic";
    }
}
