package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class URMFPSProjection extends Projection {
    private static final double C_x = 0.8773826753d;

    /* renamed from: Cy */
    private static final double f37074Cy = 1.139753528477d;
    private double C_y;

    /* renamed from: n */
    private double f37075n = 0.8660254037844386d;

    public double getN() {
        return this.f37075n;
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        double d = this.f37075n;
        if (d <= 0.0d || d > 1.0d) {
            throw new ProjectionException("-40");
        }
        this.C_y = f37074Cy / d;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36953y = MapMath.asin(Math.sin(d2) * this.f37075n);
        doubleR.f36952x = Math.cos(d2) * d * C_x;
        doubleR.f36953y = this.C_y * d2;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3 = d2 / this.C_y;
        doubleR.f36953y = MapMath.asin(Math.sin(d3) / this.f37075n);
        doubleR.f36952x = d / (Math.cos(d3) * C_x);
        return doubleR;
    }

    public void setN(double d) {
        this.f37075n = d;
    }

    public String toString() {
        return "Urmaev Flat-Polar Sinusoidal";
    }
}
