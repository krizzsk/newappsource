package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class CentralCylindricalProjection extends CylindricalProjection {
    private static final double EPS10 = 1.0E-10d;

    /* renamed from: ap */
    private double f36987ap;

    public CentralCylindricalProjection() {
        this.minLatitude = Math.toRadians(-80.0d);
        this.maxLatitude = Math.toRadians(80.0d);
    }

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        if (C0016g.m24g(d2, 1.5707963267948966d) > 1.0E-10d) {
            doubleR.f36952x = d;
            doubleR.f36953y = Math.tan(d2);
            return doubleR;
        }
        throw new ProjectionException("F");
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36953y = Math.atan(d2);
        doubleR.f36952x = d;
        return doubleR;
    }

    public String toString() {
        return "Central Cylindrical";
    }
}
