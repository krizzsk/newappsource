package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class GnomonicAzimuthalProjection extends AzimuthalProjection {
    public GnomonicAzimuthalProjection() {
        this(Math.toRadians(90.0d), Math.toRadians(0.0d));
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        double sin = Math.sin(d2);
        double cos = Math.cos(d2);
        double cos2 = Math.cos(d);
        int i = this.mode;
        if (i == 1) {
            doubleR2.f36953y = sin;
        } else if (i == 2) {
            doubleR2.f36953y = -sin;
        } else if (i == 3) {
            doubleR2.f36953y = cos * cos2;
        } else if (i == 4) {
            doubleR2.f36953y = (this.cosphi0 * cos * cos2) + (this.sinphi0 * sin);
        }
        if (Math.abs(doubleR2.f36953y) > 1.0E-10d) {
            double d3 = 1.0d / doubleR2.f36953y;
            doubleR2.f36953y = d3;
            doubleR2.f36952x = Math.sin(d) * d3 * cos;
            int i2 = this.mode;
            if (i2 == 1) {
                cos2 = -cos2;
            } else if (i2 != 2) {
                if (i2 == 3) {
                    doubleR2.f36953y *= sin;
                } else if (i2 == 4) {
                    doubleR2.f36953y = ((this.cosphi0 * sin) - ((this.sinphi0 * cos) * cos2)) * doubleR2.f36953y;
                }
                return doubleR2;
            }
            doubleR2.f36953y = cos * cos2 * doubleR2.f36953y;
            return doubleR2;
        }
        throw new ProjectionException();
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        double d5;
        double d6 = d2;
        Point2D.Double doubleR2 = doubleR;
        double distance = MapMath.distance(d, d2);
        double atan = Math.atan(distance);
        doubleR2.f36953y = atan;
        double sin = Math.sin(atan);
        double sqrt = Math.sqrt(1.0d - (sin * sin));
        if (Math.abs(distance) <= 1.0E-10d) {
            doubleR2.f36953y = this.projectionLatitude;
            doubleR2.f36952x = 0.0d;
        } else {
            int i = this.mode;
            if (i == 1) {
                doubleR2.f36953y = 1.5707963267948966d - doubleR2.f36953y;
                d6 = -d6;
            } else if (i != 2) {
                if (i == 3) {
                    double d7 = (d6 * sin) / distance;
                    doubleR2.f36953y = d7;
                    if (Math.abs(d7) >= 1.0d) {
                        if (doubleR2.f36953y > 0.0d) {
                            d4 = 1.5707963267948966d;
                        } else {
                            d4 = -1.5707963267948966d;
                        }
                        doubleR2.f36953y = d4;
                    } else {
                        doubleR2.f36953y = Math.asin(doubleR2.f36953y);
                    }
                    d6 = sqrt * distance;
                    d3 = d * sin;
                } else if (i == 4) {
                    double d8 = (((d6 * sin) * this.cosphi0) / distance) + (this.sinphi0 * sqrt);
                    doubleR2.f36953y = d8;
                    if (Math.abs(d8) >= 1.0d) {
                        if (doubleR2.f36953y > 0.0d) {
                            d5 = 1.5707963267948966d;
                        } else {
                            d5 = -1.5707963267948966d;
                        }
                        doubleR2.f36953y = d5;
                    } else {
                        doubleR2.f36953y = Math.asin(doubleR2.f36953y);
                    }
                    d6 = (sqrt - (Math.sin(doubleR2.f36953y) * this.sinphi0)) * distance;
                    d3 = sin * this.cosphi0 * d;
                }
                doubleR2.f36952x = Math.atan2(d3, d6);
            } else {
                doubleR2.f36953y -= 1.5707963267948966d;
            }
            d3 = d;
            doubleR2.f36952x = Math.atan2(d3, d6);
        }
        return doubleR2;
    }

    public String toString() {
        return "Gnomonic Azimuthal";
    }

    public GnomonicAzimuthalProjection(double d, double d2) {
        super(d, d2);
        this.minLatitude = Math.toRadians(0.0d);
        this.maxLatitude = Math.toRadians(90.0d);
        initialize();
    }
}
