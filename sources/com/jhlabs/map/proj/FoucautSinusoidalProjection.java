package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class FoucautSinusoidalProjection extends Projection {
    private static final double LOOP_TOL = 1.0E-7d;
    private static final int MAX_ITER = 10;

    /* renamed from: n */
    private double f37011n;

    /* renamed from: n1 */
    private double f37012n1;

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        double d = this.f37011n;
        if (d < 0.0d || d > 1.0d) {
            throw new ProjectionException("-99");
        }
        this.f37012n1 = 1.0d - d;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double cos = Math.cos(d2);
        double d3 = this.f37011n;
        double d4 = this.f37012n1;
        doubleR.f36952x = (d * cos) / ((cos * d4) + d3);
        doubleR.f36953y = (Math.sin(d2) * d4) + (d3 * d2);
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = d2;
        Point2D.Double doubleR2 = doubleR;
        if (this.f37011n != 0.0d) {
            doubleR2.f36953y = d4;
            int i = 10;
            while (i > 0) {
                double d5 = doubleR2.f36953y;
                double sin = (((Math.sin(d5) * this.f37012n1) + (this.f37011n * d5)) - d4) / ((Math.cos(doubleR2.f36953y) * this.f37012n1) + this.f37011n);
                doubleR2.f36953y = d5 - sin;
                if (Math.abs(sin) < LOOP_TOL) {
                    break;
                }
                i--;
            }
            if (i == 0) {
                if (d4 < 0.0d) {
                    d3 = -1.5707963267948966d;
                } else {
                    d3 = 1.5707963267948966d;
                }
                doubleR2.f36953y = d3;
            }
        } else {
            doubleR2.f36953y = MapMath.asin(d2);
        }
        double cos = Math.cos(doubleR2.f36953y);
        doubleR2.f36952x = (((this.f37012n1 * cos) + this.f37011n) * d) / cos;
        return doubleR2;
    }

    public String toString() {
        return "Foucaut Sinusoidal";
    }
}
