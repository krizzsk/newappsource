package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class BonneProjection extends Projection {
    private double am1;
    private double cphi1;

    /* renamed from: en */
    private double[] f36969en;

    /* renamed from: m1 */
    private double f36970m1;
    private double phi1;

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        this.phi1 = 1.5707963267948966d;
        if (Math.abs(1.5707963267948966d) < 1.0E-10d) {
            throw new ProjectionException("-23");
        } else if (!this.spherical) {
            this.f36969en = MapMath.enfn(this.f37062es);
            double d = this.phi1;
            double sin = Math.sin(d);
            this.am1 = sin;
            double cos = Math.cos(this.phi1);
            this.f36970m1 = MapMath.mlfn(d, sin, cos, this.f36969en);
            double d2 = this.f37062es;
            double d3 = this.am1;
            this.am1 = cos / (Math.sqrt(1.0d - ((d2 * d3) * d3)) * this.am1);
        } else if (Math.abs(this.phi1) + 1.0E-10d >= 1.5707963267948966d) {
            this.cphi1 = 0.0d;
        } else {
            this.cphi1 = 1.0d / Math.tan(this.phi1);
        }
    }

    public boolean isEqualArea() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        if (this.spherical) {
            double d3 = (this.cphi1 + this.phi1) - d2;
            if (Math.abs(d3) > 1.0E-10d) {
                double cos = (Math.cos(d2) * d) / d3;
                doubleR2.f36952x = Math.sin(cos) * d3;
                doubleR2.f36953y = this.cphi1 - (Math.cos(cos) * d3);
            } else {
                doubleR2.f36953y = 0.0d;
                doubleR2.f36952x = 0.0d;
            }
        } else {
            double d4 = this.am1 + this.f36970m1;
            double sin = Math.sin(d2);
            double cos2 = Math.cos(d2);
            double mlfn = d4 - MapMath.mlfn(d2, sin, cos2, this.f36969en);
            double sqrt = (cos2 * d) / (Math.sqrt(1.0d - ((this.f37062es * sin) * sin)) * mlfn);
            doubleR2.f36952x = Math.sin(sqrt) * mlfn;
            doubleR2.f36953y = this.am1 - (Math.cos(sqrt) * mlfn);
        }
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3 = d;
        Point2D.Double doubleR2 = doubleR;
        if (this.spherical) {
            double d4 = this.cphi1 - d2;
            doubleR2.f36953y = d4;
            double distance = MapMath.distance(d3, d4);
            double d5 = (this.cphi1 + this.phi1) - distance;
            doubleR2.f36953y = d5;
            if (Math.abs(d5) > 1.5707963267948966d) {
                throw new ProjectionException("I");
            } else if (C0016g.m24g(doubleR2.f36953y, 1.5707963267948966d) <= 1.0E-10d) {
                doubleR2.f36952x = 0.0d;
            } else {
                doubleR2.f36952x = (Math.atan2(d, d2) * distance) / Math.cos(doubleR2.f36953y);
            }
        } else {
            double d6 = this.am1 - d2;
            doubleR2.f36953y = d6;
            double distance2 = MapMath.distance(d3, d6);
            double inv_mlfn = MapMath.inv_mlfn((this.am1 + this.f36970m1) - distance2, this.f37062es, this.f36969en);
            doubleR2.f36953y = inv_mlfn;
            double abs = Math.abs(inv_mlfn);
            if (abs < 1.5707963267948966d) {
                double sin = Math.sin(doubleR2.f36953y);
                doubleR2.f36952x = (Math.sqrt(1.0d - ((this.f37062es * sin) * sin)) * (Math.atan2(d, d2) * distance2)) / Math.cos(doubleR2.f36953y);
            } else if (Math.abs(abs - 1.5707963267948966d) <= 1.0E-10d) {
                doubleR2.f36952x = 0.0d;
            } else {
                throw new ProjectionException("I");
            }
        }
        return doubleR2;
    }

    public String toString() {
        return "Bonne";
    }
}
