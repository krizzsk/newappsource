package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class Wagner2Projection extends Projection {
    private static final double C_p1 = 0.88022d;
    private static final double C_p2 = 0.8855d;
    private static final double C_x = 0.92483d;
    private static final double C_y = 1.38725d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36953y = MapMath.asin(Math.sin(C_p2 * d2) * C_p1);
        doubleR.f36952x = Math.cos(d2) * d * C_x;
        doubleR.f36953y = d2 * C_y;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3 = d2 / C_y;
        doubleR.f36953y = d3;
        doubleR.f36952x = d / (Math.cos(d3) * C_x);
        doubleR.f36953y = MapMath.asin(Math.sin(doubleR.f36953y) / C_p1) / C_p2;
        return doubleR;
    }

    public String toString() {
        return "Wagner II";
    }
}
