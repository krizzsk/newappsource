package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class LagrangeProjection extends Projection {
    private static final double TOL = 1.0E-10d;

    /* renamed from: a1 */
    private double f37022a1;
    private double hrw;
    private double phi1;

    /* renamed from: rw */
    private double f37023rw = 1.4d;

    public double getW() {
        return this.f37023rw;
    }

    public boolean hasInverse() {
        return false;
    }

    public void initialize() {
        super.initialize();
        double d = this.f37023rw;
        if (d > 0.0d) {
            double d2 = 1.0d / d;
            this.f37023rw = d2;
            this.hrw = d2 * 0.5d;
            double d3 = this.projectionLatitude1;
            this.phi1 = d3;
            double sin = Math.sin(d3);
            this.phi1 = sin;
            if (C0016g.m24g(sin, 1.0d) >= 1.0E-10d) {
                double d4 = this.phi1;
                this.f37022a1 = Math.pow((1.0d - d4) / (d4 + 1.0d), this.hrw);
                return;
            }
            throw new ProjectionException("-22");
        }
        throw new ProjectionException("-27");
    }

    public boolean isConformal() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = 2.0d;
        if (C0016g.m24g(d2, 1.5707963267948966d) < 1.0E-10d) {
            doubleR.f36952x = 0.0d;
            if (d2 < 0.0d) {
                d3 = -2.0d;
            }
            doubleR.f36953y = d3;
        } else {
            double sin = Math.sin(d2);
            double pow = Math.pow((sin + 1.0d) / (1.0d - sin), this.hrw) * this.f37022a1;
            double d4 = 1.0d / pow;
            double d5 = d * this.f37023rw;
            double cos = Math.cos(d5) + ((pow + d4) * 0.5d);
            if (cos >= 1.0E-10d) {
                doubleR.f36952x = (Math.sin(d5) * 2.0d) / cos;
                doubleR.f36953y = (pow - d4) / cos;
            } else {
                throw new ProjectionException();
            }
        }
        return doubleR;
    }

    public void setW(double d) {
        this.f37023rw = d;
    }

    public String toString() {
        return "Lagrange";
    }
}
