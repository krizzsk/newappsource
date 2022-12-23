package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class LambertConformalConicProjection extends ConicProjection {

    /* renamed from: c */
    private double f37024c;

    /* renamed from: n */
    private double f37025n;
    private double rho0;

    public LambertConformalConicProjection() {
        this.minLatitude = Math.toRadians(0.0d);
        this.maxLatitude = Math.toRadians(80.0d);
        this.projectionLatitude = 0.7853981633974483d;
        this.projectionLatitude1 = 0.0d;
        this.projectionLatitude2 = 0.0d;
        initialize();
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        boolean z;
        double d;
        double d2;
        super.initialize();
        if (this.projectionLatitude1 == 0.0d) {
            double d3 = this.projectionLatitude;
            this.projectionLatitude2 = d3;
            this.projectionLatitude1 = d3;
        }
        if (Math.abs(this.projectionLatitude1 + this.projectionLatitude2) >= 1.0E-10d) {
            double sin = Math.sin(this.projectionLatitude1);
            this.f37025n = sin;
            double cos = Math.cos(this.projectionLatitude1);
            boolean z2 = true;
            if (Math.abs(this.projectionLatitude1 - this.projectionLatitude2) >= 1.0E-10d) {
                z = true;
            } else {
                z = false;
            }
            double d4 = this.f37062es;
            if (d4 != 0.0d) {
                z2 = false;
            }
            this.spherical = z2;
            if (!z2) {
                double msfn = MapMath.msfn(sin, cos, d4);
                double tsfn = MapMath.tsfn(this.projectionLatitude1, sin, this.f37061e);
                if (z) {
                    double sin2 = Math.sin(this.projectionLatitude2);
                    double log = Math.log(msfn / MapMath.msfn(sin2, Math.cos(this.projectionLatitude2), this.f37062es));
                    this.f37025n = log;
                    this.f37025n = log / Math.log(tsfn / MapMath.tsfn(this.projectionLatitude2, sin2, this.f37061e));
                }
                double pow = (Math.pow(tsfn, -this.f37025n) * msfn) / this.f37025n;
                this.rho0 = pow;
                this.f37024c = pow;
                if (C0016g.m24g(this.projectionLatitude, 1.5707963267948966d) < 1.0E-10d) {
                    d2 = 0.0d;
                } else {
                    double d5 = this.projectionLatitude;
                    d2 = Math.pow(MapMath.tsfn(d5, Math.sin(d5), this.f37061e), this.f37025n);
                }
                this.rho0 = pow * d2;
                return;
            }
            if (z) {
                this.f37025n = Math.log(cos / Math.cos(this.projectionLatitude2)) / Math.log(Math.tan((this.projectionLatitude2 * 0.5d) + 0.7853981633974483d) / Math.tan((this.projectionLatitude1 * 0.5d) + 0.7853981633974483d));
            }
            this.f37024c = (Math.pow(Math.tan((this.projectionLatitude1 * 0.5d) + 0.7853981633974483d), this.f37025n) * cos) / this.f37025n;
            if (C0016g.m24g(this.projectionLatitude, 1.5707963267948966d) < 1.0E-10d) {
                d = 0.0d;
            } else {
                d = Math.pow(Math.tan((this.projectionLatitude * 0.5d) + 0.7853981633974483d), -this.f37025n) * this.f37024c;
            }
            this.rho0 = d;
            return;
        }
        throw new ProjectionException();
    }

    public boolean isConformal() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        if (C0016g.m24g(d2, 1.5707963267948966d) < 1.0E-10d) {
            d3 = 0.0d;
        } else {
            double d5 = this.f37024c;
            if (this.spherical) {
                d4 = Math.pow(Math.tan((d2 * 0.5d) + 0.7853981633974483d), -this.f37025n);
            } else {
                d4 = Math.pow(MapMath.tsfn(d2, Math.sin(d2), this.f37061e), this.f37025n);
            }
            d3 = d4 * d5;
        }
        double d6 = this.scaleFactor;
        double d7 = d * this.f37025n;
        doubleR.f36952x = Math.sin(d7) * d3 * d6;
        doubleR.f36953y = (this.rho0 - (Math.cos(d7) * d3)) * this.scaleFactor;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        double d3 = this.scaleFactor;
        double d4 = d / d3;
        double d5 = this.rho0 - (d2 / d3);
        double distance = MapMath.distance(d4, d5);
        if (distance != 0.0d) {
            double d6 = this.f37025n;
            if (d6 < 0.0d) {
                distance = -distance;
                d4 = -d4;
                d5 = -d5;
            }
            if (this.spherical) {
                doubleR2.f36953y = (Math.atan(Math.pow(this.f37024c / distance, 1.0d / d6)) * 2.0d) - 1.5707963267948966d;
            } else {
                doubleR2.f36953y = MapMath.phi2(Math.pow(distance / this.f37024c, 1.0d / d6), this.f37061e);
            }
            doubleR2.f36952x = Math.atan2(d4, d5) / this.f37025n;
        } else {
            double d7 = 1.5707963267948966d;
            doubleR2.f36952x = 0.0d;
            if (this.f37025n <= 0.0d) {
                d7 = -1.5707963267948966d;
            }
            doubleR2.f36953y = d7;
        }
        return doubleR2;
    }

    public String toString() {
        return "Lambert Conformal Conic";
    }

    public LambertConformalConicProjection(Ellipsoid ellipsoid, double d, double d2, double d3, double d4, double d5, double d6) {
        setEllipsoid(ellipsoid);
        this.projectionLongitude = d;
        this.projectionLatitude = d4;
        this.scaleFactor = 1.0d;
        this.falseEasting = d5;
        this.falseNorthing = d6;
        this.projectionLatitude1 = d2;
        this.projectionLatitude2 = d3;
        initialize();
    }
}
