package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class Eckert4Projection extends Projection {
    private static final double C_p = 3.5707963267948966d;
    private static final double C_x = 0.4222382003157712d;
    private static final double C_y = 1.3265004281770023d;
    private static final double EPS = 1.0E-7d;
    private static final double RC_p = 0.2800495767557787d;
    private static final double RC_y = 0.7538633073600218d;
    private final int NITER = 6;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(d2) * C_p;
        double d3 = d2 * d2;
        double d4 = ((((0.00826809d * d3) + 0.0218849d) * d3) + 0.895168d) * d2;
        int i = 6;
        while (i > 0) {
            double cos = Math.cos(d4);
            double sin2 = Math.sin(d4);
            double d5 = 2.0d + cos;
            double d6 = (((sin2 * d5) + d4) - sin) / (((cos * d5) + 1.0d) - (sin2 * sin2));
            d4 -= d6;
            if (Math.abs(d6) < EPS) {
                break;
            }
            i--;
        }
        double d7 = C_y;
        if (i == 0) {
            doubleR2.f36952x = d * C_x;
            if (d4 < 0.0d) {
                d7 = -1.3265004281770023d;
            }
            doubleR2.f36953y = d7;
        } else {
            doubleR2.f36952x = (Math.cos(d4) + 1.0d) * d * C_x;
            doubleR2.f36953y = Math.sin(d4) * C_y;
        }
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double asin = MapMath.asin(d2 / C_y);
        doubleR.f36953y = asin;
        double cos = Math.cos(asin);
        doubleR.f36952x = d / ((1.0d + cos) * C_x);
        double d3 = doubleR.f36953y;
        doubleR.f36953y = MapMath.asin((((cos + 2.0d) * Math.sin(d3)) + d3) / C_p);
        return doubleR;
    }

    public String toString() {
        return "Eckert IV";
    }
}
