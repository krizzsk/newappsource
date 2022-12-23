package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class EquidistantAzimuthalProjection extends AzimuthalProjection {
    private static final double TOL = 1.0E-8d;

    /* renamed from: G */
    private double f37003G;

    /* renamed from: He */
    private double f37004He;

    /* renamed from: M1 */
    private double f37005M1;

    /* renamed from: Mp */
    private double f37006Mp;

    /* renamed from: N1 */
    private double f37007N1;
    private double cosphi0;

    /* renamed from: en */
    private double[] f37008en;
    private int mode;
    private double sinphi0;

    public EquidistantAzimuthalProjection() {
        this(Math.toRadians(90.0d), Math.toRadians(0.0d));
    }

    public Object clone() {
        EquidistantAzimuthalProjection equidistantAzimuthalProjection = (EquidistantAzimuthalProjection) super.clone();
        double[] dArr = this.f37008en;
        if (dArr != null) {
            equidistantAzimuthalProjection.f37008en = (double[]) dArr.clone();
        }
        return equidistantAzimuthalProjection;
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        int i;
        double d;
        super.initialize();
        if (C0016g.m24g(this.projectionLatitude, 1.5707963267948966d) < 1.0E-10d) {
            double d2 = this.projectionLatitude;
            if (d2 < 0.0d) {
                i = 2;
            } else {
                i = 1;
            }
            this.mode = i;
            if (d2 < 0.0d) {
                d = -1.0d;
            } else {
                d = 1.0d;
            }
            this.sinphi0 = d;
            this.cosphi0 = 0.0d;
        } else if (Math.abs(this.projectionLatitude) < 1.0E-10d) {
            this.mode = 3;
            this.sinphi0 = 0.0d;
            this.cosphi0 = 1.0d;
        } else {
            this.mode = 4;
            this.sinphi0 = Math.sin(this.projectionLatitude);
            this.cosphi0 = Math.cos(this.projectionLatitude);
        }
        if (!this.spherical) {
            double[] enfn = MapMath.enfn(this.f37062es);
            this.f37008en = enfn;
            int i2 = this.mode;
            if (i2 == 1) {
                this.f37006Mp = MapMath.mlfn(1.5707963267948966d, 1.0d, 0.0d, enfn);
            } else if (i2 == 2) {
                this.f37006Mp = MapMath.mlfn(-1.5707963267948966d, -1.0d, 0.0d, enfn);
            } else if (i2 == 3 || i2 == 4) {
                double d3 = this.f37062es;
                double d4 = this.sinphi0;
                this.f37007N1 = 1.0d / Math.sqrt(1.0d - ((d3 * d4) * d4));
                double d5 = this.sinphi0;
                double sqrt = this.f37061e / Math.sqrt(this.one_es);
                this.f37003G = d5 * sqrt;
                this.f37004He = sqrt * this.cosphi0;
            }
        }
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2;
        double d3;
        double d4 = d2;
        Point2D.Double doubleR3 = doubleR;
        if (this.spherical) {
            double sin = Math.sin(d2);
            double cos = Math.cos(d2);
            double cos2 = Math.cos(d);
            int i = this.mode;
            if (i == 1) {
                d4 = -d4;
                cos2 = -cos2;
            } else if (i != 2) {
                if (i == 3 || i == 4) {
                    if (i == 3) {
                        doubleR3.f36953y = cos * cos2;
                    } else {
                        doubleR3.f36953y = (this.cosphi0 * cos * cos2) + (this.sinphi0 * sin);
                    }
                    if (C0016g.m24g(doubleR3.f36953y, 1.0d) >= TOL) {
                        double acos = Math.acos(doubleR3.f36953y);
                        doubleR3.f36953y = acos;
                        double sin2 = acos / Math.sin(acos);
                        doubleR3.f36953y = sin2;
                        doubleR3.f36952x = Math.sin(d) * sin2 * cos;
                        double d5 = doubleR3.f36953y;
                        if (this.mode != 3) {
                            sin = (this.cosphi0 * sin) - ((this.sinphi0 * cos) * cos2);
                        }
                        doubleR3.f36953y = d5 * sin;
                    } else if (doubleR3.f36953y >= 0.0d) {
                        doubleR3.f36953y = 0.0d;
                        doubleR3.f36952x = 0.0d;
                    } else {
                        throw new ProjectionException();
                    }
                }
            }
            if (Math.abs(d4 - 1.5707963267948966d) >= 1.0E-10d) {
                double d6 = d4 + 1.5707963267948966d;
                doubleR3.f36953y = d6;
                doubleR3.f36952x = Math.sin(d) * d6;
                doubleR3.f36953y *= cos2;
            } else {
                throw new ProjectionException();
            }
        } else {
            double cos3 = Math.cos(d);
            double cos4 = Math.cos(d2);
            double sin3 = Math.sin(d2);
            int i2 = this.mode;
            if (i2 == 1) {
                doubleR2 = doubleR3;
                cos3 = -cos3;
            } else if (i2 == 2) {
                doubleR2 = doubleR3;
            } else if (i2 == 3 || i2 == 4) {
                if (Math.abs(d) >= 1.0E-10d || Math.abs(d4 - this.projectionLatitude) >= 1.0E-10d) {
                    double d7 = this.f37062es;
                    double atan2 = Math.atan2((Math.sqrt(1.0d - ((d7 * sin3) * sin3)) * this.f37007N1 * d7 * this.sinphi0) + (this.one_es * sin3), cos4);
                    double cos5 = Math.cos(atan2);
                    double sin4 = Math.sin(atan2);
                    double atan22 = Math.atan2(Math.sin(d) * cos5, (this.cosphi0 * sin4) - ((this.sinphi0 * cos3) * cos5));
                    double cos6 = Math.cos(atan22);
                    double sin5 = Math.sin(atan22);
                    if (Math.abs(sin5) < TOL) {
                        d3 = ((this.cosphi0 * sin4) - ((this.sinphi0 * cos3) * cos5)) / cos6;
                    } else {
                        d3 = (Math.sin(d) * cos5) / sin5;
                    }
                    double asin = MapMath.asin(d3);
                    double d8 = this.f37004He * cos6;
                    double d9 = d8 * d8;
                    double d11 = cos6;
                    double d12 = sin5;
                    double d13 = this.f37003G;
                    double d14 = 7.0d * d9;
                    double d15 = (((((((((((4.0d - d14) * d9) - ((1.0d - d14) * ((3.0d * d13) * d13))) / 120.0d) - (((d13 * asin) * d8) / 48.0d)) * asin) + (((1.0d - ((2.0d * d9) * d9)) * (d13 * d8)) / 8.0d)) * asin) + (((1.0d - d9) * (-d9)) / 6.0d)) * asin * asin) + 1.0d) * this.f37007N1 * asin;
                    Point2D.Double doubleR4 = doubleR;
                    doubleR4.f36952x = d12 * d15;
                    doubleR4.f36953y = d11 * d15;
                    return doubleR4;
                }
                doubleR3.f36953y = 0.0d;
                doubleR3.f36952x = 0.0d;
            }
            double abs = Math.abs(this.f37006Mp - MapMath.mlfn(d2, sin3, cos4, this.f37008en));
            doubleR2.f36952x = Math.sin(d) * abs;
            doubleR2.f36953y = abs * cos3;
            return doubleR2;
        }
        return doubleR3;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        double d5;
        double d6 = d;
        double d7 = d2;
        Point2D.Double doubleR2 = doubleR;
        double d8 = 0.0d;
        if (this.spherical) {
            double distance = MapMath.distance(d, d2);
            if (distance > 3.141592653589793d) {
                if (distance - 1.0E-10d <= 3.141592653589793d) {
                    distance = 3.141592653589793d;
                } else {
                    throw new ProjectionException();
                }
            } else if (distance < 1.0E-10d) {
                doubleR2.f36953y = this.projectionLatitude;
                doubleR2.f36952x = 0.0d;
                return doubleR2;
            }
            int i = this.mode;
            if (i == 4 || i == 3) {
                double sin = Math.sin(distance);
                double cos = Math.cos(distance);
                if (this.mode == 3) {
                    doubleR2.f36953y = MapMath.asin((d7 * sin) / distance);
                    d5 = d6 * sin;
                    d4 = cos * distance;
                } else {
                    double asin = MapMath.asin((((d7 * sin) * this.cosphi0) / distance) + (this.sinphi0 * cos));
                    doubleR2.f36953y = asin;
                    d4 = (cos - (Math.sin(asin) * this.sinphi0)) * distance;
                    d5 = d6 * sin * this.cosphi0;
                }
                if (d4 != 0.0d) {
                    d8 = Math.atan2(d5, d4);
                }
                doubleR2.f36952x = d8;
            } else if (i == 1) {
                doubleR2.f36953y = 1.5707963267948966d - distance;
                doubleR2.f36952x = Math.atan2(d6, -d7);
            } else {
                doubleR2.f36953y = distance - 1.5707963267948966d;
                doubleR2.f36952x = Math.atan2(d, d2);
            }
        } else {
            double distance2 = MapMath.distance(d, d2);
            if (distance2 < 1.0E-10d) {
                doubleR2.f36953y = this.projectionLatitude;
                doubleR2.f36952x = 0.0d;
                return doubleR2;
            }
            int i2 = this.mode;
            if (i2 == 4 || i2 == 3) {
                double atan2 = Math.atan2(d, d2);
                double cos2 = this.cosphi0 * Math.cos(atan2);
                double d9 = (this.f37062es * cos2) / this.one_es;
                double d11 = (-d9) * cos2;
                double d12 = this.sinphi0;
                double d13 = (1.0d - d11) * 3.0d * d12 * d9;
                double d14 = distance2 / this.f37007N1;
                double d15 = (1.0d - (((((((3.0d * d11) + 1.0d) * d13) * d14) / 24.0d) + (((d11 + 1.0d) * d11) / 6.0d)) * (d14 * d14))) * d14;
                double d16 = 1.0d - ((((d13 * d15) / 6.0d) + (d11 / 2.0d)) * (d15 * d15));
                double asin2 = MapMath.asin((Math.sin(d15) * cos2) + (Math.cos(d15) * d12));
                doubleR2.f36952x = MapMath.asin((Math.sin(d15) * Math.sin(atan2)) / Math.cos(asin2));
                double abs = Math.abs(asin2);
                if (abs < 1.0E-10d) {
                    doubleR2.f36953y = 0.0d;
                } else if (Math.abs(abs - 1.5707963267948966d) < 0.0d) {
                    doubleR2.f36953y = 1.5707963267948966d;
                } else {
                    doubleR2.f36953y = Math.atan((Math.tan(asin2) * (1.0d - (((this.f37062es * d16) * this.sinphi0) / Math.sin(asin2)))) / this.one_es);
                }
            } else {
                if (i2 == 1) {
                    d3 = this.f37006Mp - distance2;
                } else {
                    d3 = this.f37006Mp + distance2;
                }
                doubleR2.f36953y = MapMath.inv_mlfn(d3, this.f37062es, this.f37008en);
                if (this.mode == 1) {
                    d7 = -d7;
                }
                doubleR2.f36952x = Math.atan2(d6, d7);
            }
        }
        return doubleR2;
    }

    public String toString() {
        return "Equidistant Azimuthal";
    }

    public EquidistantAzimuthalProjection(double d, double d2) {
        super(d, d2);
        initialize();
    }
}
