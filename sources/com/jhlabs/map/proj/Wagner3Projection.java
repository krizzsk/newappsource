package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class Wagner3Projection extends PseudoCylindricalProjection {
    private static final double TWOTHIRD = 0.6666666666666666d;
    private double C_x;

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        this.C_x = Math.cos(this.trueScaleLatitude) / Math.cos((this.trueScaleLatitude * 2.0d) / 3.0d);
        this.f37062es = 0.0d;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = Math.cos(TWOTHIRD * d2) * this.C_x * d;
        doubleR.f36953y = d2;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36953y = d2;
        doubleR.f36952x = d / (Math.cos(d2 * TWOTHIRD) * this.C_x);
        return doubleR;
    }

    public String toString() {
        return "Wagner III";
    }
}
