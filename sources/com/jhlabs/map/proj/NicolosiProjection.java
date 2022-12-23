package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class NicolosiProjection extends Projection {
    private static final double EPS = 1.0E-10d;

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = d;
        double d4 = d2;
        Point2D.Double doubleR2 = doubleR;
        if (Math.abs(d) < 1.0E-10d) {
            doubleR2.f36952x = 0.0d;
            doubleR2.f36953y = d4;
        } else if (Math.abs(d2) < 1.0E-10d) {
            doubleR2.f36952x = d3;
            doubleR2.f36953y = 0.0d;
        } else if (C0016g.m24g(d3, 1.5707963267948966d) < 1.0E-10d) {
            doubleR2.f36952x = Math.cos(d2) * d3;
            doubleR2.f36953y = Math.sin(d2) * 1.5707963267948966d;
        } else if (C0016g.m24g(d4, 1.5707963267948966d) < 1.0E-10d) {
            doubleR2.f36952x = 0.0d;
            doubleR2.f36953y = d4;
        } else {
            double d5 = (1.5707963267948966d / d3) - (d3 / 1.5707963267948966d);
            double d6 = d4 / 1.5707963267948966d;
            double sin = Math.sin(d2);
            double d7 = (1.0d - (d6 * d6)) / (sin - d6);
            double d8 = d5 / d7;
            double d9 = d8 * d8;
            double d11 = ((d5 * sin) / d7) - (d5 * 0.5d);
            double d12 = d9 + 1.0d;
            double d13 = d11 / d12;
            double d14 = (1.0d / d9) + 1.0d;
            double d15 = ((0.5d * d7) + (sin / d9)) / d14;
            double cos = Math.cos(d2);
            double sqrt = Math.sqrt(((cos * cos) / d12) + (d13 * d13));
            if (d3 < 0.0d) {
                sqrt = -sqrt;
            }
            doubleR2.f36952x = (d13 + sqrt) * 1.5707963267948966d;
            double sqrt2 = Math.sqrt((d15 * d15) - ((((d7 * sin) + ((sin * sin) / d9)) - 1.0d) / d14));
            if (d4 >= 0.0d) {
                sqrt2 = -sqrt2;
            }
            doubleR2.f36953y = (d15 + sqrt2) * 1.5707963267948966d;
        }
        return doubleR2;
    }

    public String toString() {
        return "Nicolosi Globular";
    }
}
