package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class AitoffProjection extends PseudoCylindricalProjection {
    public static final int AITOFF = 0;
    public static final int WINKEL = 1;
    private double cosphi1 = 0.0d;
    private boolean winkel = false;

    public AitoffProjection() {
    }

    public boolean hasInverse() {
        return false;
    }

    public void initialize() {
        super.initialize();
        if (this.winkel) {
            this.cosphi1 = 0.6366197723675814d;
        }
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = d * 0.5d;
        double acos = Math.acos(Math.cos(d3) * Math.cos(d2));
        if (acos != 0.0d) {
            double cos = Math.cos(d2);
            double sin = 1.0d / Math.sin(acos);
            doubleR.f36953y = sin;
            doubleR.f36952x = Math.sin(d3) * cos * 2.0d * acos * sin;
            doubleR.f36953y = Math.sin(d2) * acos * sin;
        } else {
            doubleR.f36953y = 0.0d;
            doubleR.f36952x = 0.0d;
        }
        if (this.winkel) {
            doubleR.f36952x = ((d * this.cosphi1) + doubleR.f36952x) * 0.5d;
            doubleR.f36953y = (doubleR.f36953y + d2) * 0.5d;
        }
        return doubleR;
    }

    public String toString() {
        return this.winkel ? "Winkel Tripel" : "Aitoff";
    }

    public AitoffProjection(int i, double d) {
        boolean z = false;
        this.projectionLatitude = d;
        this.winkel = i == 1 ? true : z;
    }
}
