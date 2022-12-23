package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class Wagner7Projection extends Projection {
    public boolean isEqualArea() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double sin = Math.sin(d2) * 0.9063077870366499d;
        doubleR.f36953y = sin;
        double cos = Math.cos(Math.asin(sin));
        double d3 = d / 3.0d;
        doubleR.f36952x = Math.sin(d3) * 2.66723d * cos;
        double d4 = doubleR.f36953y;
        double sqrt = 1.0d / Math.sqrt(((Math.cos(d3) * cos) + 1.0d) * 0.5d);
        doubleR.f36953y = 1.24104d * sqrt * d4;
        doubleR.f36952x *= sqrt;
        return doubleR;
    }

    public String toString() {
        return "Wagner VII";
    }
}
