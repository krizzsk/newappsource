package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class AiryProjection extends Projection {
    private static final double EPS = 1.0E-10d;
    private static final int EQUIT = 2;
    private static final int N_POLE = 0;
    private static final int OBLIQ = 3;
    private static final int S_POLE = 1;

    /* renamed from: Cb */
    private double f36958Cb;
    private double cosph0;
    private int mode;
    private boolean no_cut = true;
    private double p_halfpi;
    private double sinph0;

    public AiryProjection() {
        this.minLatitude = Math.toRadians(-60.0d);
        this.maxLatitude = Math.toRadians(60.0d);
        this.minLongitude = Math.toRadians(-90.0d);
        this.maxLongitude = Math.toRadians(90.0d);
        initialize();
    }

    public void initialize() {
        super.initialize();
        this.no_cut = false;
        if (Math.abs(0.7853981633974483d) < 1.0E-10d) {
            this.f36958Cb = -0.5d;
        } else {
            double tan = 1.0d / Math.tan(0.7853981633974483d);
            this.f36958Cb = tan;
            this.f36958Cb = Math.log(Math.cos(0.7853981633974483d)) * tan * tan;
        }
        if (C0016g.m24g(this.projectionLatitude, 1.5707963267948966d) < 1.0E-10d) {
            if (this.projectionLatitude < 0.0d) {
                this.p_halfpi = -1.5707963267948966d;
                this.mode = 1;
                return;
            }
            this.p_halfpi = 1.5707963267948966d;
            this.mode = 0;
        } else if (Math.abs(this.projectionLatitude) < 1.0E-10d) {
            this.mode = 2;
        } else {
            this.mode = 3;
            this.sinph0 = Math.sin(this.projectionLatitude);
            this.cosph0 = Math.cos(this.projectionLatitude);
        }
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        double d5;
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(d);
        double cos = Math.cos(d);
        int i = this.mode;
        if (i == 0 || i == 1) {
            double abs = Math.abs(this.p_halfpi - d2);
            doubleR2.f36953y = abs;
            if (this.no_cut || d2 - 1.0E-10d <= 1.5707963267948966d) {
                double d6 = abs * 0.5d;
                doubleR2.f36953y = d6;
                if (d6 > 1.0E-10d) {
                    double tan = Math.tan(d2);
                    double log = ((tan * this.f36958Cb) + (Math.log(Math.cos(d2)) / tan)) * -2.0d;
                    doubleR2.f36952x = sin * log;
                    double d7 = log * cos;
                    doubleR2.f36953y = d7;
                    if (this.mode == 0) {
                        doubleR2.f36953y = -d7;
                    }
                } else {
                    doubleR2.f36953y = 0.0d;
                    doubleR2.f36952x = 0.0d;
                }
            } else {
                throw new ProjectionException("F");
            }
        } else if (i == 2 || i == 3) {
            double sin2 = Math.sin(d2);
            double cos2 = Math.cos(d2);
            double d8 = cos2 * cos;
            if (this.mode == 3) {
                d3 = sin2;
                d8 = (this.cosph0 * d8) + (this.sinph0 * sin2);
            } else {
                d3 = sin2;
            }
            if (this.no_cut || d8 >= -1.0E-10d) {
                double d9 = 1.0d - d8;
                if (Math.abs(d9) > 1.0E-10d) {
                    double d11 = (d8 + 1.0d) * 0.5d;
                    d5 = (-Math.log(d11)) / d9;
                    d4 = this.f36958Cb / d11;
                } else {
                    d5 = 0.5d;
                    d4 = this.f36958Cb;
                }
                double d12 = d5 - d4;
                doubleR2.f36952x = d12 * cos2 * sin;
                if (this.mode == 3) {
                    doubleR2.f36953y = ((this.cosph0 * d3) - ((this.sinph0 * cos2) * cos)) * d12;
                } else {
                    doubleR2.f36953y = d12 * d3;
                }
            } else {
                throw new ProjectionException("F");
            }
        }
        return doubleR2;
    }

    public String toString() {
        return "Airy";
    }
}
