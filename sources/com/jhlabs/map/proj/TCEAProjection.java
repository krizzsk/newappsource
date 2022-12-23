package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class TCEAProjection extends Projection {
    private double rk0;

    public TCEAProjection() {
        initialize();
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        this.rk0 = 1.0d / this.scaleFactor;
    }

    public boolean isRectilinear() {
        return false;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = Math.sin(d) * Math.cos(d2) * this.rk0;
        doubleR.f36953y = (Math.atan2(Math.tan(d2), Math.cos(d)) - this.projectionLatitude) * this.scaleFactor;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36953y = (this.rk0 * d2) + this.projectionLatitude;
        doubleR.f36952x *= this.scaleFactor;
        double sqrt = Math.sqrt(1.0d - (d * d));
        doubleR.f36953y = Math.asin(Math.sin(d2) * sqrt);
        doubleR.f36952x = Math.atan2(d, Math.cos(d2) * sqrt);
        return doubleR;
    }

    public String toString() {
        return "Transverse Cylindrical Equal Area";
    }
}
