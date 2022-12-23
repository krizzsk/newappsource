package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class PutninsP4Projection extends Projection {
    public double C_x = 0.874038744d;
    public double C_y = 3.883251825d;

    public boolean hasInverse() {
        return true;
    }

    public boolean isEqualArea() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double asin = MapMath.asin(Math.sin(d2) * 0.883883476d);
        double cos = Math.cos(asin) * this.C_x * d;
        doubleR.f36952x = cos;
        double d3 = asin * 0.333333333333333d;
        doubleR.f36952x = cos / Math.cos(d3);
        doubleR.f36953y = Math.sin(d3) * this.C_y;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double asin = MapMath.asin(d2 / this.C_y);
        doubleR.f36953y = asin;
        double cos = (Math.cos(asin) * d) / this.C_x;
        doubleR.f36952x = cos;
        double d3 = doubleR.f36953y * 3.0d;
        doubleR.f36953y = d3;
        doubleR.f36952x = cos / Math.cos(d3);
        doubleR.f36953y = MapMath.asin(Math.sin(doubleR.f36953y) * 1.13137085d);
        return doubleR;
    }

    public String toString() {
        return "Putnins P4";
    }
}
