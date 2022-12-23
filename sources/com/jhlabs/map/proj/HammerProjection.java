package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class HammerProjection extends PseudoCylindricalProjection {

    /* renamed from: m */
    private double f37017m = 1.0d;

    /* renamed from: rm */
    private double f37018rm;

    /* renamed from: w */
    private double f37019w = 0.5d;

    public double getM() {
        return this.f37017m;
    }

    public double getW() {
        return this.f37019w;
    }

    public void initialize() {
        super.initialize();
        double abs = Math.abs(this.f37019w);
        this.f37019w = abs;
        if (abs > 0.0d) {
            this.f37019w = 0.5d;
            double abs2 = Math.abs(this.f37017m);
            this.f37017m = abs2;
            if (abs2 > 0.0d) {
                this.f37018rm = 1.0d / 1.0d;
                this.f37017m = 1.0d / this.f37019w;
                this.f37062es = 0.0d;
                return;
            }
            throw new ProjectionException("-27");
        }
        throw new ProjectionException("-27");
    }

    public boolean isEqualArea() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double cos = Math.cos(d2);
        double d3 = d * this.f37019w;
        double sqrt = Math.sqrt(2.0d / ((Math.cos(d3) * cos) + 1.0d));
        doubleR.f36952x = Math.sin(d3) * this.f37017m * sqrt * cos;
        doubleR.f36953y = Math.sin(d2) * this.f37018rm * sqrt;
        return doubleR;
    }

    public void setM(double d) {
        this.f37017m = d;
    }

    public void setW(double d) {
        this.f37019w = d;
    }

    public String toString() {
        return "Hammer & Eckert-Greifendorff";
    }
}
