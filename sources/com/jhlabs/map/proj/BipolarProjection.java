package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class BipolarProjection extends Projection {
    private static final double Azab = 0.8165004367468637d;
    private static final double Azba = 1.8226184385618593d;
    private static final double C20 = 0.9396926207859084d;
    private static final double C45 = 0.7071067811865476d;
    private static final double EPS = 1.0E-10d;
    private static final double EPS10 = 1.0E-10d;

    /* renamed from: F */
    private static final double f36966F = 1.8972474256746104d;
    private static final int NITER = 10;
    private static final double ONEEPS = 1.000000001d;
    private static final double R104 = 1.8151424220741028d;
    private static final double R110 = 1.9198621771937625d;
    private static final double S20 = -0.3420201433256687d;
    private static final double S45 = 0.7071067811865476d;

    /* renamed from: T */
    private static final double f36967T = 1.27246578267089d;
    private static final double cAzc = 0.6969152303867837d;
    private static final double lamB = -0.3489497672625068d;

    /* renamed from: n */
    private static final double f36968n = 0.6305584488127469d;
    private static final double rhoc = 1.2070912152156872d;
    private static final double sAzc = 0.7171535133114361d;
    private boolean noskew;

    public BipolarProjection() {
        this.minLatitude = Math.toRadians(-80.0d);
        this.maxLatitude = Math.toRadians(80.0d);
        this.projectionLongitude = Math.toRadians(-90.0d);
        this.minLongitude = Math.toRadians(-90.0d);
        this.maxLongitude = Math.toRadians(90.0d);
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        boolean z;
        double d5;
        double d6;
        double d7;
        double acos;
        double d8 = d2;
        Point2D.Double doubleR2 = doubleR;
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        double d9 = lamB - d;
        double cos2 = Math.cos(d9);
        double sin2 = Math.sin(d9);
        if (C0016g.m24g(d8, 1.5707963267948966d) < 1.0E-10d) {
            if (d8 < 0.0d) {
                d4 = 3.141592653589793d;
            } else {
                d4 = 0.0d;
            }
            d3 = Double.MAX_VALUE;
        } else {
            double d11 = sin / cos;
            double d12 = d11;
            d4 = Math.atan2(sin2, (d11 - cos2) * 0.7071067811865476d);
            d3 = d12;
        }
        if (d4 > Azba) {
            z = true;
        } else {
            z = false;
        }
        double d13 = -1.0d;
        if (z) {
            double d14 = d + R110;
            double cos3 = Math.cos(d14);
            double sin3 = Math.sin(d14);
            double d15 = (cos * C20 * cos3) + (sin * S20);
            if (Math.abs(d15) <= 1.0d) {
                d6 = Math.acos(d15);
            } else if (Math.abs(d15) > ONEEPS) {
                throw new ProjectionException("F");
            } else if (d15 < 0.0d) {
                d6 = -1.0d;
            } else {
                d6 = 1.0d;
            }
            if (d3 != Double.MAX_VALUE) {
                d4 = Math.atan2(sin3, (d3 * C20) - (cos3 * S20));
            }
            d5 = Azab;
            doubleR2.f36953y = rhoc;
        } else {
            double d16 = ((cos * cos2) + sin) * 0.7071067811865476d;
            if (Math.abs(d16) <= 1.0d) {
                acos = Math.acos(d16);
            } else if (Math.abs(d16) > ONEEPS) {
                throw new ProjectionException("F");
            } else if (d16 < 0.0d) {
                acos = -1.0d;
            } else {
                acos = 1.0d;
            }
            doubleR2.f36953y = -1.2070912152156872d;
            d5 = Azba;
        }
        if (d6 >= 0.0d) {
            double pow = Math.pow(Math.tan(0.5d * d6), f36968n);
            double d17 = f36966F * pow;
            double d18 = 0.5d * (R104 - d6);
            if (d18 >= 0.0d) {
                double pow2 = (Math.pow(d18, f36968n) + pow) / f36967T;
                if (Math.abs(pow2) <= 1.0d) {
                    d13 = Math.acos(pow2);
                } else if (Math.abs(pow2) > ONEEPS) {
                    throw new ProjectionException("F");
                } else if (pow2 >= 0.0d) {
                    d13 = 1.0d;
                }
                double d19 = (d5 - d4) * f36968n;
                if (Math.abs(d19) < d13) {
                    if (z) {
                        d7 = d19;
                    } else {
                        d7 = -d19;
                    }
                    d17 /= Math.cos(d13 + d7);
                }
                doubleR2.f36952x = Math.sin(d19) * d17;
                double d21 = doubleR2.f36953y;
                if (z) {
                    d17 = -d17;
                }
                double cos4 = (Math.cos(d19) * d17) + d21;
                doubleR2.f36953y = cos4;
                if (this.noskew) {
                    double d22 = doubleR2.f36952x;
                    doubleR2.f36952x = ((-d22) * cAzc) - (cos4 * sAzc);
                    doubleR2.f36953y = (d22 * sAzc) + ((-cos4) * cAzc);
                }
                return doubleR2;
            }
            throw new ProjectionException("F");
        }
        throw new ProjectionException("F");
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        boolean z;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9 = d;
        double d11 = d2;
        Point2D.Double doubleR2 = doubleR;
        if (this.noskew) {
            doubleR2.f36952x = (d11 * sAzc) + ((-d9) * cAzc);
            doubleR2.f36953y = ((-d11) * cAzc) - (d9 * sAzc);
        }
        if (d9 < 0.0d) {
            z = true;
        } else {
            z = false;
        }
        double d12 = 0.7071067811865476d;
        if (z) {
            doubleR2.f36953y = rhoc - d11;
            d12 = S20;
            d4 = C20;
            d3 = Azab;
        } else {
            doubleR2.f36953y += rhoc;
            d3 = Azba;
            d4 = 0.7071067811865476d;
        }
        double distance = MapMath.distance(d, d2);
        double atan2 = Math.atan2(d, d2);
        double abs = Math.abs(atan2);
        int i = 10;
        double d13 = 0.0d;
        double d14 = distance;
        while (true) {
            if (i <= 0) {
                d5 = d13;
                d6 = d4;
                break;
            }
            double atan = Math.atan(Math.pow(d14 / f36966F, 1.585895806935677d)) * 2.0d;
            d6 = d4;
            double d15 = atan;
            double acos = Math.acos((Math.pow(Math.tan((R104 - atan) * 0.5d), f36968n) + Math.pow(Math.tan(atan * 0.5d), f36968n)) / f36967T);
            if (abs < acos) {
                if (z) {
                    d8 = atan2;
                } else {
                    d8 = -atan2;
                }
                d7 = Math.cos(acos + d8) * distance;
            } else {
                d7 = d14;
            }
            if (Math.abs(d14 - d7) < 1.0E-10d) {
                d5 = d15;
                break;
            }
            i--;
            d13 = d15;
            d14 = d7;
            Point2D.Double doubleR3 = doubleR;
            d4 = d6;
        }
        if (i != 0) {
            double d16 = d3 - (atan2 / f36968n);
            Point2D.Double doubleR4 = doubleR;
            doubleR4.f36953y = Math.asin((Math.cos(d16) * Math.sin(d5) * d6) + (Math.cos(d5) * d12));
            double atan22 = Math.atan2(Math.sin(d16), (d6 / Math.tan(d5)) - (Math.cos(d16) * d12));
            doubleR4.f36952x = atan22;
            if (z) {
                doubleR4.f36952x = atan22 - R110;
            } else {
                doubleR4.f36952x = lamB - atan22;
            }
            return doubleR4;
        }
        throw new ProjectionException("I");
    }

    public String toString() {
        return "Bipolar Conic of Western Hemisphere";
    }
}
