package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class ObliqueMercatorProjection extends Projection {
    private static final double TOL = 1.0E-7d;
    private double Gamma;

    /* renamed from: al */
    private double f37049al;
    private double alpha;

    /* renamed from: bl */
    private double f37050bl;
    private double cosgam;
    private double cosrot;

    /* renamed from: el */
    private double f37051el;
    private boolean ellips;
    private double lam1;
    private double lam2;
    private double lamc;
    private double phi1;
    private double phi2;
    private boolean rot;
    private double singam;
    private double sinrot;
    private double u_0;

    public ObliqueMercatorProjection() {
        this.ellipsoid = Ellipsoid.WGS_1984;
        this.projectionLatitude = Math.toRadians(0.0d);
        this.projectionLongitude = Math.toRadians(0.0d);
        this.minLongitude = Math.toRadians(-60.0d);
        this.maxLongitude = Math.toRadians(60.0d);
        this.minLatitude = Math.toRadians(-80.0d);
        this.maxLatitude = Math.toRadians(80.0d);
        this.alpha = Math.toRadians(-45.0d);
        initialize();
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        double d;
        double d2;
        double d3;
        double d4;
        super.initialize();
        boolean z = true;
        this.rot = true;
        if (Math.abs(this.alpha) <= TOL || C0016g.m24g(this.projectionLatitude, 1.5707963267948966d) <= TOL || C0016g.m24g(this.alpha, 1.5707963267948966d) <= TOL) {
            throw new ProjectionException("Obl 1");
        }
        if (this.f37062es != 0.0d) {
            z = false;
        }
        this.spherical = z;
        if (z) {
            d = 1.0d;
        } else {
            d = Math.sqrt(this.one_es);
        }
        if (Math.abs(this.projectionLatitude) > 1.0E-10d) {
            double sin = Math.sin(this.projectionLatitude);
            double cos = Math.cos(this.projectionLatitude);
            if (!this.spherical) {
                double d5 = this.f37062es;
                double d6 = 1.0d - ((d5 * sin) * sin);
                double d7 = cos * cos;
                this.f37050bl = d7;
                double sqrt = Math.sqrt((((d5 * d7) * d7) / this.one_es) + 1.0d);
                this.f37050bl = sqrt;
                this.f37049al = ((this.scaleFactor * sqrt) * d) / d6;
                d3 = (sqrt * d) / (Math.sqrt(d6) * cos);
            } else {
                this.f37050bl = 1.0d;
                this.f37049al = this.scaleFactor;
                d3 = 1.0d / cos;
            }
            double d8 = (d3 * d3) - 1.0d;
            if (d8 <= 0.0d) {
                d4 = 0.0d;
            } else {
                d4 = Math.sqrt(d8);
                if (this.projectionLatitude < 0.0d) {
                    d4 = -d4;
                }
            }
            d2 = d4 + d3;
            this.f37051el = d2;
            if (!this.spherical) {
                this.f37051el = Math.pow(MapMath.tsfn(this.projectionLatitude, sin, this.f37061e), this.f37050bl) * d2;
            } else {
                this.f37051el = Math.tan((1.5707963267948966d - this.projectionLatitude) * 0.5d) * d2;
            }
        } else {
            this.f37050bl = 1.0d / d;
            this.f37049al = this.scaleFactor;
            this.f37051el = 1.0d;
            d3 = 1.0d;
            d2 = 1.0d;
        }
        double asin = Math.asin(Math.sin(this.alpha) / d3);
        this.Gamma = asin;
        this.projectionLongitude = this.lamc - (Math.asin(Math.tan(asin) * ((d2 - (1.0d / d2)) * 0.5d)) / this.f37050bl);
        this.singam = Math.sin(this.Gamma);
        this.cosgam = Math.cos(this.Gamma);
        double d9 = this.alpha;
        this.sinrot = Math.sin(d9);
        this.cosrot = Math.cos(d9);
        double abs = Math.abs((Math.atan(Math.sqrt((d3 * d3) - 1.0d) / this.cosrot) * this.f37049al) / this.f37050bl);
        this.u_0 = abs;
        if (this.projectionLatitude < 0.0d) {
            this.u_0 = -abs;
        }
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8 = d2;
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(this.f37050bl * d);
        if (C0016g.m24g(d8, 1.5707963267948966d) <= 1.0E-10d) {
            if (d8 < 0.0d) {
                d4 = -this.singam;
            } else {
                d4 = this.singam;
            }
            d3 = (this.f37049al * d8) / this.f37050bl;
            d5 = 1.0d;
        } else {
            double d9 = this.f37051el;
            if (!this.spherical) {
                d6 = Math.pow(MapMath.tsfn(d2, Math.sin(d2), this.f37061e), this.f37050bl);
                d7 = 0.5d;
            } else {
                double d11 = 1.5707963267948966d - d8;
                d7 = 0.5d;
                d6 = Math.tan(d11 * 0.5d);
            }
            double d12 = d9 / d6;
            double d13 = 1.0d / d12;
            double d14 = (d12 - d13) * d7;
            d4 = (((this.singam * d14) - (this.cosgam * sin)) * 2.0d) / (d12 + d13);
            double cos = Math.cos(this.f37050bl * d);
            if (Math.abs(cos) >= TOL) {
                double d15 = this.f37049al;
                double d16 = d14 * this.cosgam;
                double d17 = this.f37050bl;
                d3 = (Math.atan(((sin * this.singam) + d16) / cos) * d15) / d17;
                if (cos < 0.0d) {
                    d3 += (this.f37049al * 3.141592653589793d) / d17;
                }
            } else {
                d3 = this.f37049al * this.f37050bl * d;
            }
            d5 = 1.0d;
        }
        if (C0016g.m24g(d4, d5) > 1.0E-10d) {
            double log = (Math.log((d5 - d4) / (d4 + d5)) * (this.f37049al * 0.5d)) / this.f37050bl;
            double d18 = d3 - this.u_0;
            if (!this.rot) {
                doubleR2.f36952x = d18;
                doubleR2.f36953y = log;
            } else {
                double d19 = this.cosrot;
                double d21 = this.sinrot;
                doubleR2.f36952x = (d18 * d21) + (log * d19);
                doubleR2.f36953y = (d18 * d19) - (log * d21);
            }
            return doubleR2;
        }
        throw new ProjectionException("Obl 3");
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        Point2D.Double doubleR2 = doubleR;
        if (!this.rot) {
            d4 = d;
            d3 = d2;
        } else {
            double d5 = this.cosrot;
            double d6 = this.sinrot;
            d3 = (d * d5) - (d2 * d6);
            d4 = (d5 * d2) + (d6 * d);
        }
        double d7 = d4 + this.u_0;
        double exp = Math.exp(((-this.f37050bl) * d3) / this.f37049al);
        double d8 = 1.0d / exp;
        double d9 = (exp - d8) * 0.5d;
        double sin = Math.sin((this.f37050bl * d7) / this.f37049al);
        double d11 = (((this.singam * d9) + (this.cosgam * sin)) * 2.0d) / (exp + d8);
        double d12 = 1.5707963267948966d;
        if (C0016g.m24g(d11, 1.0d) < 1.0E-10d) {
            doubleR2.f36952x = 0.0d;
            if (d11 < 0.0d) {
                d12 = -1.5707963267948966d;
            }
            doubleR2.f36953y = d12;
        } else {
            double sqrt = this.f37051el / Math.sqrt((d11 + 1.0d) / (1.0d - d11));
            doubleR2.f36953y = sqrt;
            if (!this.spherical) {
                doubleR2.f36953y = MapMath.phi2(Math.pow(sqrt, 1.0d / this.f37050bl), this.f37061e);
            } else {
                doubleR2.f36953y = 1.5707963267948966d - (Math.atan(sqrt) * 2.0d);
            }
            doubleR2.f36952x = (-Math.atan2((d9 * this.cosgam) - (sin * this.singam), Math.cos((this.f37050bl * d7) / this.f37049al))) / this.f37050bl;
        }
        return doubleR2;
    }

    public String toString() {
        return "Oblique Mercator";
    }

    public ObliqueMercatorProjection(Ellipsoid ellipsoid, double d, double d2, double d3, double d4, double d5, double d6) {
        setEllipsoid(ellipsoid);
        this.lamc = d;
        this.projectionLatitude = d2;
        this.alpha = d3;
        this.scaleFactor = d4;
        this.falseEasting = d5;
        this.falseNorthing = d6;
        initialize();
    }
}
