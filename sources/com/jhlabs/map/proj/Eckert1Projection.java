package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class Eckert1Projection extends Projection {

    /* renamed from: FC */
    private static final double f36996FC = 0.9213177319235613d;

    /* renamed from: RP */
    private static final double f36997RP = 0.3183098861837907d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = (1.0d - (Math.abs(d2) * f36997RP)) * d * f36996FC;
        doubleR.f36953y = d2 * f36996FC;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3 = d2 / f36996FC;
        doubleR.f36953y = d3;
        doubleR.f36952x = d / ((1.0d - (Math.abs(d3) * f36997RP)) * f36996FC);
        return doubleR;
    }

    public String toString() {
        return "Eckert I";
    }
}
