package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class RectangularPolyconicProjection extends Projection {
    private static final double EPS = 1.0E-9d;
    private double fxa;
    private double fxb;
    private boolean mode;
    private double phi0;
    private double phi1;

    public void initialize() {
        super.initialize();
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        if (this.mode) {
            d = Math.tan(d * this.fxb);
            d3 = this.fxa;
        } else {
            d3 = 0.5d;
        }
        double d4 = d * d3;
        if (Math.abs(d2) < EPS) {
            doubleR.f36952x = d4 + d4;
            doubleR.f36953y = -this.phi0;
        } else {
            doubleR.f36953y = 1.0d / Math.tan(d2);
            double atan = Math.atan(Math.sin(d2) * d4) * 2.0d;
            doubleR.f36952x = Math.sin(atan) * doubleR.f36953y;
            doubleR.f36953y = ((1.0d - Math.cos(atan)) * doubleR.f36953y) + (d2 - this.phi0);
        }
        return doubleR;
    }

    public String toString() {
        return "Rectangular Polyconic";
    }
}
