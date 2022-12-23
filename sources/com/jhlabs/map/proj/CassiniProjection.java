package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class CassiniProjection extends Projection {

    /* renamed from: C1 */
    private static final double f36971C1 = 0.16666666666666666d;

    /* renamed from: C2 */
    private static final double f36972C2 = 0.008333333333333333d;

    /* renamed from: C3 */
    private static final double f36973C3 = 0.041666666666666664d;

    /* renamed from: C4 */
    private static final double f36974C4 = 0.3333333333333333d;

    /* renamed from: C5 */
    private static final double f36975C5 = 0.06666666666666667d;
    private static final double EPS10 = 1.0E-10d;

    /* renamed from: a1 */
    private double f36976a1;

    /* renamed from: a2 */
    private double f36977a2;

    /* renamed from: c */
    private double f36978c;

    /* renamed from: d2 */
    private double f36979d2;

    /* renamed from: dd */
    private double f36980dd;

    /* renamed from: en */
    private double[] f36981en;

    /* renamed from: m0 */
    private double f36982m0;

    /* renamed from: n */
    private double f36983n;

    /* renamed from: r */
    private double f36984r;

    /* renamed from: t */
    private double f36985t;

    /* renamed from: tn */
    private double f36986tn;

    public CassiniProjection() {
        this.projectionLatitude = Math.toRadians(0.0d);
        this.projectionLongitude = Math.toRadians(0.0d);
        this.minLongitude = Math.toRadians(-90.0d);
        this.maxLongitude = Math.toRadians(90.0d);
        initialize();
    }

    public int getEPSGCode() {
        return 9806;
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        if (!this.spherical) {
            double[] enfn = MapMath.enfn(this.f37062es);
            this.f36981en = enfn;
            if (enfn != null) {
                double d = this.projectionLatitude;
                this.f36982m0 = MapMath.mlfn(d, Math.sin(d), Math.cos(this.projectionLatitude), this.f36981en);
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        if (this.spherical) {
            doubleR2.f36952x = Math.asin(Math.sin(d) * Math.cos(d2));
            doubleR2.f36953y = Math.atan2(Math.tan(d2), Math.cos(d)) - this.projectionLatitude;
        } else {
            double sin = Math.sin(d2);
            this.f36983n = sin;
            double cos = Math.cos(d2);
            this.f36978c = cos;
            doubleR2.f36953y = MapMath.mlfn(d2, sin, cos, this.f36981en);
            double d3 = this.f37062es;
            double d4 = this.f36983n;
            this.f36983n = 1.0d / Math.sqrt(1.0d - ((d3 * d4) * d4));
            double tan = Math.tan(d2);
            this.f36986tn = tan;
            double d5 = tan * tan;
            this.f36985t = d5;
            double d6 = this.f36978c;
            double d7 = d * d6;
            this.f36976a1 = d7;
            double d8 = this.f37062es;
            double d9 = ((d8 * d6) / (1.0d - d8)) * d6;
            this.f36978c = d9;
            double d11 = d7 * d7;
            this.f36977a2 = d11;
            double d12 = this.f36983n;
            doubleR2.f36952x = (1.0d - ((f36971C1 - ((((8.0d * d9) + (8.0d - d5)) * d11) * f36972C2)) * (d11 * d5))) * d7 * d12;
            doubleR2.f36953y -= this.f36982m0 - ((((((d9 * 6.0d) + (5.0d - d5)) * d11) * f36973C3) + 0.5d) * ((d12 * tan) * d11));
        }
        return doubleR2;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        Point2D.Double doubleR2 = doubleR;
        if (this.spherical) {
            double d3 = d2 + this.projectionLatitude;
            this.f36980dd = d3;
            doubleR2.f36953y = Math.asin(Math.cos(d) * Math.sin(d3));
            doubleR2.f36952x = Math.atan2(Math.tan(d), Math.cos(this.f36980dd));
        } else {
            double inv_mlfn = MapMath.inv_mlfn(this.f36982m0 + d2, this.f37062es, this.f36981en);
            double tan = Math.tan(inv_mlfn);
            this.f36986tn = tan;
            this.f36985t = tan * tan;
            double sin = Math.sin(inv_mlfn);
            this.f36983n = sin;
            double d4 = 1.0d / (1.0d - ((this.f37062es * sin) * sin));
            this.f36984r = d4;
            double sqrt = Math.sqrt(d4);
            this.f36983n = sqrt;
            double d5 = (1.0d - this.f37062es) * sqrt * this.f36984r;
            this.f36984r = d5;
            double d6 = d / sqrt;
            this.f36980dd = d6;
            double d7 = d6 * d6;
            this.f36979d2 = d7;
            double d8 = this.f36985t;
            doubleR2.f36953y = inv_mlfn - ((0.5d - ((((d8 * 3.0d) + 1.0d) * d7) * f36973C3)) * (((sqrt * this.f36986tn) / d5) * d7));
            doubleR2.f36952x = ((((((((d8 * 3.0d) + 1.0d) * d7) * f36975C5) - 13.333333333333334d) * (d8 * d7)) + 1.0d) * d6) / Math.cos(inv_mlfn);
        }
        return doubleR2;
    }

    public String toString() {
        return "Cassini";
    }
}
