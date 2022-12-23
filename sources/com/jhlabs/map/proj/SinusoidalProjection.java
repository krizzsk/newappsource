package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class SinusoidalProjection extends PseudoCylindricalProjection {
    public double getWidth(double d) {
        return Math.cos(d) * MapMath.normalizeLongitude(3.141592653589793d);
    }

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = Math.cos(d2) * d;
        doubleR.f36953y = d2;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = d / Math.cos(d2);
        doubleR.f36953y = d2;
        return doubleR;
    }

    public String toString() {
        return "Sinusoidal";
    }
}
