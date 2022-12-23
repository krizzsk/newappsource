package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class Ginsburg8Projection extends Projection {
    private static final double C12 = 0.08333333333333333d;

    /* renamed from: Cl */
    private static final double f37015Cl = 9.52426E-4d;

    /* renamed from: Cp */
    private static final double f37016Cp = 0.162388d;

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = d2 * d2;
        doubleR.f36953y = ((C12 * d3) + 1.0d) * d2;
        double d4 = (1.0d - (d3 * f37016Cp)) * d;
        double d5 = d * d;
        doubleR.f36952x = (0.87d - ((f37015Cl * d5) * d5)) * d4;
        return doubleR;
    }

    public String toString() {
        return "Ginsburg VIII (TsNIIGAiK)";
    }
}
