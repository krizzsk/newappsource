package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class LaskowskiProjection extends Projection {

    /* renamed from: a10  reason: collision with root package name */
    private static final double f65083a10 = 0.975534d;
    private static final double a12 = -0.119161d;
    private static final double a14 = -0.0547009d;
    private static final double a32 = -0.0143059d;
    private static final double b01 = 1.00384d;
    private static final double b03 = 0.0998909d;
    private static final double b05 = -0.0491032d;
    private static final double b21 = 0.0802894d;
    private static final double b23 = -0.02855d;
    private static final double b41 = 1.99025E-4d;

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = d * d;
        double d4 = d2 * d2;
        doubleR.f36952x = ((((a14 * d4) + (a32 * d3) + a12) * d4) + f65083a10) * d;
        doubleR.f36953y = ((((b05 * d4) + b03) * d4) + (((b41 * d3) + (b23 * d4) + b21) * d3) + b01) * d2;
        return doubleR;
    }

    public String toString() {
        return "Laskowski";
    }
}
