package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class PutninsP5Projection extends Projection {

    /* renamed from: C */
    private static final double f37063C = 1.01346d;

    /* renamed from: D */
    private static final double f37064D = 1.2158542d;

    /* renamed from: A */
    public double f37065A = 2.0d;

    /* renamed from: B */
    public double f37066B = 1.0d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = (this.f37065A - (Math.sqrt(((f37064D * d2) * d2) + 1.0d) * this.f37066B)) * d * f37063C;
        doubleR.f36953y = d2 * f37063C;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3 = d2 / f37063C;
        doubleR.f36953y = d3;
        doubleR.f36952x = d / ((this.f37065A - (Math.sqrt(((f37064D * d3) * d3) + 1.0d) * this.f37066B)) * f37063C);
        return doubleR;
    }

    public String toString() {
        return "Putnins P5";
    }
}
