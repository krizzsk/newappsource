package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class CylindricalEqualAreaProjection extends Projection {
    private double[] apa;

    /* renamed from: qp */
    private double f36990qp;
    private double trueScaleLatitude;

    public CylindricalEqualAreaProjection() {
        this(0.0d, 0.0d, 0.0d);
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        double d = this.trueScaleLatitude;
        this.scaleFactor = Math.cos(d);
        if (this.f37062es != 0.0d) {
            double sin = Math.sin(d);
            this.scaleFactor /= Math.sqrt(1.0d - ((this.f37062es * sin) * sin));
            this.apa = MapMath.authset(this.f37062es);
            this.f36990qp = MapMath.qsfn(1.0d, this.f37061e, this.one_es);
        }
    }

    public boolean isRectilinear() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        if (this.spherical) {
            doubleR.f36952x = this.scaleFactor * d;
            doubleR.f36953y = Math.sin(d2) / this.scaleFactor;
        } else {
            doubleR.f36952x = this.scaleFactor * d;
            doubleR.f36953y = (MapMath.qsfn(Math.sin(d2), this.f37061e, this.one_es) * 0.5d) / this.scaleFactor;
        }
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        if (this.spherical) {
            double d4 = d2 * this.scaleFactor;
            double abs = Math.abs(d4);
            if (abs - 1.0E-10d <= 1.0d) {
                if (abs >= 1.0d) {
                    if (d4 < 0.0d) {
                        d3 = -1.5707963267948966d;
                    } else {
                        d3 = 1.5707963267948966d;
                    }
                    doubleR.f36953y = d3;
                } else {
                    doubleR.f36953y = Math.asin(d4);
                }
                doubleR.f36952x = d / this.scaleFactor;
            } else {
                throw new ProjectionException();
            }
        } else {
            doubleR.f36953y = MapMath.authlat(Math.asin(((d2 * 2.0d) * this.scaleFactor) / this.f36990qp), this.apa);
            doubleR.f36952x = d / this.scaleFactor;
        }
        return doubleR;
    }

    public CylindricalEqualAreaProjection(double d, double d2, double d3) {
        this.projectionLatitude = d;
        this.projectionLongitude = d2;
        this.trueScaleLatitude = d3;
        initialize();
    }
}
