package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class MBTFPSProjection extends Projection {

    /* renamed from: C1 */
    private static final double f37043C1 = 0.45503d;
    private static final double C1_2 = 0.3333333333333333d;

    /* renamed from: C2 */
    private static final double f37044C2 = 1.36509d;

    /* renamed from: C3 */
    private static final double f37045C3 = 1.41546d;
    private static final double C_x = 0.22248d;
    private static final double C_y = 1.44492d;
    private static final double LOOP_TOL = 1.0E-7d;
    private static final int MAX_ITER = 10;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(d2) * f37045C3;
        for (int i = 10; i > 0; i--) {
            double d3 = d2 / f37044C2;
            double d4 = doubleR2.f36953y;
            double sin2 = ((Math.sin(d2) + (Math.sin(d3) * f37043C1)) - sin) / (Math.cos(d2) + (Math.cos(d3) * C1_2));
            doubleR2.f36953y = d4 - sin2;
            if (Math.abs(sin2) < LOOP_TOL) {
                break;
            }
        }
        double d5 = d2 / f37044C2;
        doubleR2.f36952x = (((Math.cos(d2) * 3.0d) / Math.cos(d5)) + 1.0d) * C_x * d;
        doubleR2.f36953y = Math.sin(d5) * C_y;
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double asin = MapMath.asin(d2 / C_y);
        double d3 = f37044C2 * asin;
        doubleR.f36953y = d3;
        doubleR.f36952x = d / ((((Math.cos(d3) * 3.0d) / Math.cos(asin)) + 1.0d) * C_x);
        doubleR.f36953y = MapMath.asin((Math.sin(doubleR.f36953y) + (Math.sin(asin) * f37043C1)) / f37045C3);
        return doubleR;
    }

    public String toString() {
        return "McBryde-Thomas Flat-Pole Sine (No. 2)";
    }
}
