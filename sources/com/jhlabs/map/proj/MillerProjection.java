package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class MillerProjection extends CylindricalProjection {
    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = d;
        doubleR.f36953y = Math.log(Math.tan((d2 * 0.4d) + 0.7853981633974483d)) * 1.25d;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = d;
        doubleR.f36953y = (Math.atan(Math.exp(d2 * 0.8d)) - 0.7853981633974483d) * 2.5d;
        return doubleR;
    }

    public String toString() {
        return "Miller Cylindrical";
    }
}
