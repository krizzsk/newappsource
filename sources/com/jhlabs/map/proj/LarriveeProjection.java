package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class LarriveeProjection extends Projection {
    private static final double SIXTH = 0.16666666666666666d;

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = (Math.sqrt(Math.cos(d2)) + 1.0d) * d * 0.5d;
        doubleR.f36953y = d2 / (Math.cos(d * SIXTH) * Math.cos(0.5d * d2));
        return doubleR;
    }

    public String toString() {
        return "Larrivee";
    }
}
