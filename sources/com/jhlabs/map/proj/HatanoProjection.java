package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class HatanoProjection extends Projection {

    /* renamed from: CN */
    private static final double f37020CN = 2.67595d;

    /* renamed from: CS */
    private static final double f37021CS = 2.43763d;
    private static final double EPS = 1.0E-7d;
    private static final double FXC = 0.85d;
    private static final double FYCN = 1.75859d;
    private static final double FYCS = 1.93052d;
    private static final int NITER = 20;
    private static final double ONETOL = 1.000001d;
    private static final double RCN = 0.3736990601468637d;
    private static final double RCS = 0.4102345310814193d;
    private static final double RXC = 1.1764705882352942d;
    private static final double RYCN = 0.5686373742600607d;
    private static final double RYCS = 0.5179951515653813d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(d2);
        if (d2 < 0.0d) {
            d3 = f37021CS;
        } else {
            d3 = f37020CN;
        }
        double d5 = sin * d3;
        double d6 = d2;
        for (int i = 20; i > 0; i--) {
            double sin2 = ((Math.sin(d6) + d6) - d5) / (Math.cos(d6) + 1.0d);
            d6 -= sin2;
            if (Math.abs(sin2) < EPS) {
                break;
            }
        }
        double d7 = d6 * 0.5d;
        doubleR2.f36952x = Math.cos(d7) * FXC * d;
        double sin3 = Math.sin(d7);
        if (d7 < 0.0d) {
            d4 = FYCS;
        } else {
            d4 = FYCN;
        }
        doubleR2.f36953y = sin3 * d4;
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        double d5;
        Point2D.Double doubleR2 = doubleR;
        int i = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        if (i < 0) {
            d3 = RYCS;
        } else {
            d3 = RYCN;
        }
        double d6 = d3 * d2;
        double d7 = 1.5707963267948966d;
        if (Math.abs(d6) <= 1.0d) {
            d4 = Math.asin(d6);
        } else if (Math.abs(d6) > ONETOL) {
            throw new ProjectionException("I");
        } else if (d6 > 0.0d) {
            d4 = 1.5707963267948966d;
        } else {
            d4 = -1.5707963267948966d;
        }
        doubleR2.f36952x = (RXC * d) / Math.cos(d4);
        double d8 = d4 + d4;
        double sin = Math.sin(d8) + d8;
        if (i < 0) {
            d5 = RCS;
        } else {
            d5 = RCN;
        }
        double d9 = sin * d5;
        doubleR2.f36953y = d9;
        if (Math.abs(d9) <= 1.0d) {
            doubleR2.f36953y = Math.asin(doubleR2.f36953y);
        } else if (Math.abs(doubleR2.f36953y) <= ONETOL) {
            if (doubleR2.f36953y <= 0.0d) {
                d7 = -1.5707963267948966d;
            }
            doubleR2.f36953y = d7;
        } else {
            throw new ProjectionException("I");
        }
        return doubleR2;
    }

    public String toString() {
        return "Hatano Asymmetrical Equal Area";
    }
}
