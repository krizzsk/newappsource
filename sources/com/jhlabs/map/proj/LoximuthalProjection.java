package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;
import p001a0.C0016g;

public class LoximuthalProjection extends PseudoCylindricalProjection {
    private static final double EPS = 1.0E-8d;

    /* renamed from: FC */
    private static final double f37038FC = 0.9213177319235613d;

    /* renamed from: RP */
    private static final double f37039RP = 0.3183098861837907d;
    private double cosphi1;
    private double phi1;
    private double tanphi1 = Math.tan((this.phi1 * 0.5d) + 0.7853981633974483d);

    public LoximuthalProjection() {
        double radians = Math.toRadians(40.0d);
        this.phi1 = radians;
        this.cosphi1 = Math.cos(radians);
    }

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = d2 - this.phi1;
        if (d4 < EPS) {
            d3 = d * this.cosphi1;
        } else {
            double d5 = (d2 * 0.5d) + 0.7853981633974483d;
            if (Math.abs(d5) < EPS || C0016g.m24g(d5, 1.5707963267948966d) < EPS) {
                d3 = 0.0d;
            } else {
                d3 = (d * d4) / Math.log(Math.tan(d5) / this.tanphi1);
            }
        }
        doubleR.f36952x = d3;
        doubleR.f36953y = d4;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = this.phi1 + d2;
        if (Math.abs(d2) < EPS) {
            d3 = d / this.cosphi1;
        } else {
            double d5 = (0.5d * d2) + 0.7853981633974483d;
            if (Math.abs(d5) < EPS || C0016g.m24g(d, 1.5707963267948966d) < EPS) {
                d3 = 0.0d;
            } else {
                d3 = (Math.log(Math.tan(d5) / this.tanphi1) * d) / d2;
            }
        }
        doubleR.f36952x = d3;
        doubleR.f36953y = d4;
        return doubleR;
    }

    public String toString() {
        return "Loximuthal";
    }
}
