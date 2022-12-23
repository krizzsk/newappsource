package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class LandsatProjection extends Projection {
    private static final double PI_HALFPI = 4.71238898038469d;
    private static final double TOL = 1.0E-7d;
    private static final double TWOPI_HALFPI = 7.853981633974483d;

    /* renamed from: a2 */
    private double f37026a2;

    /* renamed from: a4 */
    private double f37027a4;

    /* renamed from: b */
    private double f37028b;

    /* renamed from: c1 */
    private double f37029c1;

    /* renamed from: c3 */
    private double f37030c3;

    /* renamed from: ca */
    private double f37031ca;
    private double p22;

    /* renamed from: q */
    private double f37032q;
    private double rlm;
    private double rlm2;

    /* renamed from: sa */
    private double f37033sa;

    /* renamed from: t */
    private double f37034t;

    /* renamed from: u */
    private double f37035u;

    /* renamed from: w */
    private double f37036w;

    /* renamed from: xj */
    private double f37037xj;

    private void seraz0(double d, double d2) {
        double d3 = 0.017453292519943295d * d;
        double sin = Math.sin(d3);
        double d4 = sin * sin;
        double sqrt = Math.sqrt(((this.f37034t * d4) + 1.0d) / (((this.f37032q * d4) + 1.0d) * ((this.f37036w * d4) + 1.0d))) * Math.cos(d3) * this.p22 * this.f37033sa;
        double d5 = this.f37032q;
        double d6 = (d5 * d4) + 1.0d;
        double sqrt2 = ((((this.f37036w * d4) + 1.0d) / (d6 * d6)) - (this.p22 * this.f37031ca)) * Math.sqrt(((d5 * d4) + 1.0d) / ((this.f37036w * d4) + 1.0d));
        double d7 = this.f37037xj;
        double d8 = sqrt * sqrt;
        double sqrt3 = Math.sqrt((d7 * d7) + d8);
        double d9 = this.f37028b;
        double d11 = (((this.f37037xj * sqrt2) - d8) * d2) / sqrt3;
        this.f37028b = d9 + d11;
        this.f37026a2 = (Math.cos(d3 + d3) * d11) + this.f37026a2;
        this.f37027a4 = (Math.cos(4.0d * d3) * d11) + this.f37027a4;
        double d12 = ((sqrt2 + this.f37037xj) * (sqrt * d2)) / sqrt3;
        this.f37029c1 = (Math.cos(d3) * d12) + this.f37029c1;
        this.f37030c3 = (Math.cos(d3 * 3.0d) * d12) + this.f37030c3;
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        this.projectionLongitude = 2.2492058070450924d - (((double) 120) * 0.025032610785576042d);
        this.p22 = 103.2669323d / 1440.0d;
        this.f37033sa = Math.sin(1.729481662386221d);
        double cos = Math.cos(1.729481662386221d);
        this.f37031ca = cos;
        if (Math.abs(cos) < 1.0E-9d) {
            this.f37031ca = 1.0E-9d;
        }
        double d = this.f37062es;
        double d2 = this.f37031ca;
        double d3 = d * d2 * d2;
        double d4 = this.f37033sa;
        double d5 = d * d4 * d4;
        double d6 = this.rone_es;
        double d7 = (1.0d - d3) * d6;
        this.f37036w = (d7 * d7) - 1.0d;
        this.f37032q = d5 * d6;
        this.f37034t = (2.0d - d) * d5 * d6 * d6;
        this.f37035u = d3 * d6;
        double d8 = this.one_es;
        this.f37037xj = d8 * d8 * d8;
        this.rlm = 1.6341348883592068d;
        this.rlm2 = 1.6341348883592068d + 6.283185307179586d;
        this.f37030c3 = 0.0d;
        this.f37029c1 = 0.0d;
        this.f37028b = 0.0d;
        this.f37027a4 = 0.0d;
        this.f37026a2 = 0.0d;
        seraz0(0.0d, 1.0d);
        for (double d9 = 9.0d; d9 <= 81.0001d; d9 += 18.0d) {
            seraz0(d9, 4.0d);
        }
        for (double d11 = 18.0d; d11 <= 72.0001d; d11 += 18.0d) {
            seraz0(d11, 2.0d);
        }
        seraz0(90.0d, 1.0d);
        this.f37026a2 /= 30.0d;
        this.f37027a4 /= 60.0d;
        this.f37028b /= 30.0d;
        this.f37029c1 /= 15.0d;
        this.f37030c3 /= 45.0d;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        double d5;
        int i;
        double d6;
        double d7;
        double d8;
        Point2D.Double doubleR2 = doubleR;
        double d9 = 1.5707963267948966d;
        if (d2 > 1.5707963267948966d) {
            d3 = 1.5707963267948966d;
        } else if (d2 < -1.5707963267948966d) {
            d3 = -1.5707963267948966d;
        } else {
            d3 = d2;
        }
        double d11 = 0.0d;
        if (d3 >= 0.0d) {
            d4 = 1.5707963267948966d;
        } else {
            d4 = PI_HALFPI;
        }
        double tan = Math.tan(d3);
        int i2 = 0;
        double d12 = 0.0d;
        double d13 = 0.0d;
        while (true) {
            double cos = Math.cos((this.p22 * d4) + d);
            Math.abs(cos);
            double sin = Math.sin(d4);
            if (cos < d11) {
                d5 = -1.5707963267948966d;
            } else {
                d5 = d9;
            }
            double d14 = d4 - (sin * d5);
            i = 50;
            double d15 = d4;
            while (true) {
                if (i <= 0) {
                    d6 = d4;
                    d7 = d12;
                    break;
                }
                double d16 = (this.p22 * d15) + d;
                double cos2 = Math.cos(d16);
                if (Math.abs(cos2) < TOL) {
                    d16 -= TOL;
                }
                d6 = d4;
                double d17 = d16;
                d7 = Math.atan(((Math.sin(d16) * this.f37031ca) + ((this.one_es * tan) * this.f37033sa)) / cos2) + d14;
                if (Math.abs(Math.abs(d15) - Math.abs(d7)) < TOL) {
                    d13 = d17;
                    break;
                }
                i--;
                d12 = d7;
                d15 = d12;
                d4 = d6;
                d13 = d17;
            }
            if (i == 0 || (i2 = i2 + 1) >= 3) {
                break;
            }
            double d18 = this.rlm;
            if (d7 > d18 && d7 < this.rlm2) {
                break;
            }
            if (d7 <= d18) {
                d8 = TWOPI_HALFPI;
                d12 = d7;
            } else {
                d12 = d7;
                if (d7 >= this.rlm2) {
                    d9 = 1.5707963267948966d;
                    d11 = 0.0d;
                    d8 = 1.5707963267948966d;
                } else {
                    d8 = d6;
                }
            }
            d9 = 1.5707963267948966d;
            d11 = 0.0d;
        }
        if (i != 0) {
            double sin2 = Math.sin(d3);
            double log = Math.log(Math.tan((MapMath.asin((((this.one_es * this.f37031ca) * sin2) - (Math.sin(d13) * (Math.cos(d3) * this.f37033sa))) / Math.sqrt(1.0d - ((this.f37062es * sin2) * sin2))) * 0.5d) + 0.7853981633974483d));
            double sin3 = Math.sin(d7);
            double d19 = sin3 * sin3;
            double d21 = sin3;
            double d22 = log;
            double sqrt = Math.sqrt(((this.f37034t * d19) + 1.0d) / (((this.f37032q * d19) + 1.0d) * ((this.f37036w * d19) + 1.0d))) * Math.cos(d7) * this.p22 * this.f37033sa;
            double d23 = this.f37037xj;
            double sqrt2 = Math.sqrt((sqrt * sqrt) + (d23 * d23));
            double d24 = d22;
            doubleR2.f36952x = ((Math.sin(4.0d * d7) * this.f37027a4) + ((Math.sin(2.0d * d7) * this.f37026a2) + (this.f37028b * d7))) - ((sqrt * d24) / sqrt2);
            doubleR2.f36953y = ((this.f37037xj * d24) / sqrt2) + (Math.sin(d7 * 3.0d) * this.f37030c3) + (this.f37029c1 * d21);
        } else {
            doubleR2.f36953y = Double.POSITIVE_INFINITY;
            doubleR2.f36952x = Double.POSITIVE_INFINITY;
        }
        return doubleR2;
    }

    public String toString() {
        return "Landsat";
    }
}
