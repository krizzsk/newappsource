package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class TransverseMercatorProjection extends CylindricalProjection {
    private static final double FC1 = 1.0d;
    private static final double FC2 = 0.5d;
    private static final double FC3 = 0.16666666666666666d;
    private static final double FC4 = 0.08333333333333333d;
    private static final double FC5 = 0.05d;
    private static final double FC6 = 0.03333333333333333d;
    private static final double FC7 = 0.023809523809523808d;
    private static final double FC8 = 0.017857142857142856d;

    /* renamed from: en */
    private double[] f37073en;
    private double esp;
    private double ml0;

    public TransverseMercatorProjection() {
        this.ellipsoid = Ellipsoid.GRS_1980;
        this.projectionLatitude = Math.toRadians(0.0d);
        this.projectionLongitude = Math.toRadians(0.0d);
        this.minLongitude = Math.toRadians(-90.0d);
        this.maxLongitude = Math.toRadians(90.0d);
        initialize();
    }

    public Object clone() {
        TransverseMercatorProjection transverseMercatorProjection = (TransverseMercatorProjection) super.clone();
        double[] dArr = this.f37073en;
        if (dArr != null) {
            transverseMercatorProjection.f37073en = (double[]) dArr.clone();
        }
        return transverseMercatorProjection;
    }

    public int getRowFromNearestParallel(double d) {
        int radToDeg = (int) MapMath.radToDeg(MapMath.normalizeLatitude(d));
        if (radToDeg < -80 || radToDeg > 84) {
            return 0;
        }
        if (radToDeg > 80) {
            return 24;
        }
        return ((radToDeg + 80) / 8) + 3;
    }

    public int getZoneFromNearestMeridian(double d) {
        int floor = ((int) Math.floor(((MapMath.normalizeLongitude(d) + 3.141592653589793d) * 30.0d) / 3.141592653589793d)) + 1;
        if (floor < 1) {
            return 1;
        }
        if (floor > 60) {
            return 60;
        }
        return floor;
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        if (this.spherical) {
            double d = this.scaleFactor;
            this.esp = d;
            this.ml0 = d * 0.5d;
            return;
        }
        this.f37073en = MapMath.enfn(this.f37062es);
        double d2 = this.projectionLatitude;
        this.ml0 = MapMath.mlfn(d2, Math.sin(d2), Math.cos(this.projectionLatitude), this.f37073en);
        double d3 = this.f37062es;
        this.esp = d3 / (FC1 - d3);
    }

    public boolean isRectilinear() {
        return false;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        double d3 = 0.0d;
        if (this.spherical) {
            double cos = Math.cos(d2);
            double sin = Math.sin(d) * cos;
            doubleR2.f36952x = Math.log((sin + FC1) / (FC1 - sin)) * this.ml0 * this.scaleFactor;
            double acos = MapMath.acos((Math.cos(d) * cos) / Math.sqrt(FC1 - (sin * sin)));
            if (d2 < 0.0d) {
                acos = -acos;
            }
            doubleR2.f36953y = (acos - this.projectionLatitude) * this.esp;
        } else {
            double sin2 = Math.sin(d2);
            double cos2 = Math.cos(d2);
            if (Math.abs(cos2) > 1.0E-10d) {
                d3 = sin2 / cos2;
            }
            double d4 = d3 * d3;
            double d5 = cos2 * d;
            double d6 = d5 * d5;
            double sqrt = d5 / Math.sqrt(FC1 - ((this.f37062es * sin2) * sin2));
            double d7 = this.esp * cos2 * cos2;
            double d8 = this.scaleFactor;
            doubleR2.f36952x = d8 * sqrt * (((((((((((179.0d - d4) * d4) - 479.0d) * d4) + 61.0d) * FC7 * d6) + ((14.0d - (d4 * 58.0d)) * d7) + C16530d.m42010c(d4, 18.0d, d4, 5.0d)) * d6 * FC5) + (FC1 - d4) + d7) * d6 * FC3) + FC1);
            double d9 = d8;
            double mlfn = MapMath.mlfn(d2, sin2, cos2, this.f37073en) - this.ml0;
            double d11 = FC4 * d6;
            double d12 = (((4.0d * d7) + 9.0d) * d7) + (5.0d - d4);
            double d13 = d6 * FC6;
            double c = C16530d.m42010c(d4, 58.0d, d4, 61.0d);
            doubleR2.f36953y = (((((((((((((543.0d - d4) * d4) - 3111.0d) * d4) + 1385.0d) * d6 * FC8) + ((270.0d - (330.0d * d4)) * d7) + c) * d13) + d12) * d11) + FC1) * sin2 * sqrt * d * 0.5d) + mlfn) * d9;
        }
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        double d3 = 0.0d;
        if (this.spherical) {
            double exp = Math.exp(d / this.scaleFactor);
            double d4 = (exp - (FC1 / exp)) * 0.5d;
            double cos = Math.cos((d2 / this.scaleFactor) + this.projectionLatitude);
            double asin = MapMath.asin(Math.sqrt((FC1 - (cos * cos)) / ((d4 * d4) + FC1)));
            doubleR2.f36953y = asin;
            if (d2 < 0.0d) {
                doubleR2.f36953y = -asin;
            }
            doubleR2.f36952x = Math.atan2(d4, cos);
        } else {
            doubleR2.f36953y = MapMath.inv_mlfn((d2 / this.scaleFactor) + this.ml0, this.f37062es, this.f37073en);
            double d5 = 1.5707963267948966d;
            if (Math.abs(d2) >= 1.5707963267948966d) {
                if (d2 < 0.0d) {
                    d5 = -1.5707963267948966d;
                }
                doubleR2.f36953y = d5;
                doubleR2.f36952x = 0.0d;
            } else {
                double sin = Math.sin(doubleR2.f36953y);
                double cos2 = Math.cos(doubleR2.f36953y);
                if (Math.abs(cos2) > 1.0E-10d) {
                    d3 = sin / cos2;
                }
                double d6 = this.esp * cos2 * cos2;
                double d7 = FC1 - ((this.f37062es * sin) * sin);
                double sqrt = (Math.sqrt(d7) * d) / this.scaleFactor;
                double d8 = d7 * d3;
                double d9 = d3 * d3;
                double d11 = sqrt * sqrt;
                doubleR2.f36953y -= (FC1 - (((((FC1 - (4.0d * d6)) * d6) + (((3.0d - (9.0d * d6)) * d9) + 5.0d)) - ((((46.0d * d6) + ((((45.0d * d9) + (90.0d - (252.0d * d6))) * d9) + 61.0d)) - (((((((1574.0d * d9) + 4095.0d) * d9) + 3633.0d) * d9) + 1385.0d) * (FC8 * d11))) * (FC6 * d11))) * (FC4 * d11))) * (((d8 * d11) / (FC1 - this.f37062es)) * 0.5d);
                doubleR2.f36952x = ((FC1 - (((((2.0d * d9) + FC1) + d6) - ((((d6 * 6.0d) + ((((8.0d * d6) + ((24.0d * d9) + 28.0d)) * d9) + 5.0d)) - (((((((720.0d * d9) + 1320.0d) * d9) + 662.0d) * d9) + 61.0d) * (d11 * FC7))) * (FC5 * d11))) * (FC3 * d11))) * sqrt) / cos2;
            }
        }
        return doubleR2;
    }

    public void setUTMZone(int i) {
        this.projectionLongitude = (((((double) (i - 1)) + 0.5d) * 3.141592653589793d) / 30.0d) - 3.141592653589793d;
        this.projectionLatitude = 0.0d;
        this.scaleFactor = 0.9996d;
        this.falseEasting = 500000.0d;
        initialize();
    }

    public String toString() {
        return "Transverse Mercator";
    }

    public TransverseMercatorProjection(Ellipsoid ellipsoid, double d, double d2, double d3, double d4, double d5) {
        setEllipsoid(ellipsoid);
        this.projectionLongitude = d;
        this.projectionLatitude = d2;
        this.scaleFactor = d3;
        this.falseEasting = d4;
        this.falseNorthing = d5;
        initialize();
    }
}
