package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class PutninsP2Projection extends Projection {
    private static final double C_p = 0.6141848493043784d;
    private static final double C_x = 1.8949d;
    private static final double C_y = 1.71848d;
    private static final double EPS = 1.0E-10d;
    private static final int NITER = 10;
    private static final double PI_DIV_3 = 1.0471975511965976d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(d2) * C_p;
        double d4 = d2 * d2;
        doubleR2.f36953y = ((((0.0046292d * d4) + 0.00909953d) * d4) + 0.615709d) * doubleR2.f36953y;
        int i = 10;
        while (i > 0) {
            double cos = Math.cos(d2);
            double sin2 = Math.sin(d2);
            double d5 = cos - 1.0d;
            double d6 = (((sin2 * d5) + d2) - sin) / (((cos * d5) + 1.0d) - (sin2 * sin2));
            doubleR2.f36953y -= d6;
            if (Math.abs(d6) < 1.0E-10d) {
                break;
            }
            i--;
        }
        if (i == 0) {
            if (d2 < 0.0d) {
                d3 = -1.0471975511965976d;
            } else {
                d3 = PI_DIV_3;
            }
            doubleR2.f36953y = d3;
        }
        doubleR2.f36952x = (Math.cos(d2) - 0.5d) * C_x * d;
        doubleR2.f36953y = Math.sin(d2) * C_y;
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double asin = MapMath.asin(d2 / C_y);
        doubleR.f36953y = asin;
        double cos = Math.cos(asin);
        doubleR.f36952x = d / ((cos - 0.5d) * C_x);
        double d3 = doubleR.f36953y;
        doubleR.f36953y = MapMath.asin((((cos - 1.0d) * Math.sin(d3)) + d3) / C_p);
        return doubleR;
    }

    public String toString() {
        return "Putnins P2";
    }
}
