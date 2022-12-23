package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class MBTFPQProjection extends Projection {

    /* renamed from: C */
    private static final double f37041C = 1.7071067811865475d;
    private static final double EPS = 1.0E-7d;
    private static final double FXC = 0.3124597141037825d;
    private static final double FYC = 1.874758284622695d;
    private static final int NITER = 20;
    private static final double ONETOL = 1.000001d;

    /* renamed from: RC */
    private static final double f37042RC = 0.585786437626905d;
    private static final double RXC = 3.2004125807650623d;
    private static final double RYC = 0.533402096794177d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(d2) * f37041C;
        for (int i = 20; i > 0; i--) {
            double d3 = doubleR2.f36953y;
            double d4 = d2 * 0.5d;
            double sin2 = ((Math.sin(d2) + Math.sin(d4)) - sin) / (Math.cos(d2) + (Math.cos(d4) * 0.5d));
            doubleR2.f36953y = d3 - sin2;
            if (Math.abs(sin2) < EPS) {
                break;
            }
        }
        double d5 = d2 * 0.5d;
        doubleR2.f36952x = (((Math.cos(d2) * 2.0d) / Math.cos(d5)) + 1.0d) * FXC * d;
        doubleR2.f36953y = Math.sin(d5) * FYC;
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        Point2D.Double doubleR2 = doubleR;
        double d5 = RYC * d2;
        if (Math.abs(d5) <= 1.0d) {
            d3 = Math.asin(d5) * 2.0d;
        } else if (Math.abs(d5) > ONETOL) {
            throw new ProjectionException("I");
        } else if (d5 < 0.0d) {
            d5 = -1.0d;
            d3 = -3.141592653589793d;
        } else {
            d3 = 3.141592653589793d;
            d5 = 1.0d;
        }
        doubleR2.f36952x = (RXC * d) / (((Math.cos(d3) * 2.0d) / Math.cos(0.5d * d3)) + 1.0d);
        double sin = (Math.sin(d3) + d5) * f37042RC;
        if (Math.abs(sin) <= 1.0d) {
            d4 = Math.asin(sin);
        } else if (Math.abs(sin) > ONETOL) {
            throw new ProjectionException("I");
        } else if (sin < 0.0d) {
            d4 = -1.5707963267948966d;
        } else {
            d4 = 1.5707963267948966d;
        }
        doubleR2.f36953y = d4;
        return doubleR2;
    }

    public String toString() {
        return "McBryde-Thomas Flat-Polar Quartic";
    }
}
