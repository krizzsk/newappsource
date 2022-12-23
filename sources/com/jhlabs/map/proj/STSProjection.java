package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

class STSProjection extends ConicProjection {
    private double C_p;
    private double C_x;
    private double C_y;
    private boolean tan_mode;

    public STSProjection(double d, double d2, boolean z) {
        this.f37062es = 0.0d;
        this.C_x = d2 / d;
        this.C_y = d;
        this.C_p = 1.0d / d2;
        this.tan_mode = z;
        initialize();
    }

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = Math.cos(d2) * this.C_x * d;
        doubleR.f36953y = this.C_y;
        double d3 = d2 * this.C_p;
        double cos = Math.cos(d3);
        if (this.tan_mode) {
            doubleR.f36952x = cos * cos * doubleR.f36952x;
            doubleR.f36953y = Math.tan(d3) * doubleR.f36953y;
        } else {
            doubleR.f36952x /= cos;
            doubleR.f36953y = Math.sin(d3) * doubleR.f36953y;
        }
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = d2 / this.C_y;
        if (this.tan_mode) {
            d3 = Math.atan(d4);
        } else {
            d3 = MapMath.asin(d4);
        }
        doubleR.f36953y = d3;
        double cos = Math.cos(d3);
        double d5 = doubleR.f36953y;
        double d6 = this.C_p;
        double d7 = this.C_x;
        double d8 = (d5 / d6) / d6;
        doubleR.f36953y = d8;
        double cos2 = d / (Math.cos(d8) * d7);
        doubleR.f36952x = cos2;
        if (this.tan_mode) {
            doubleR.f36952x = cos2 / (cos * cos);
        } else {
            doubleR.f36952x = cos2 * cos;
        }
        return doubleR;
    }
}
