package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class SimpleConicProjection extends ConicProjection {
    private static final double EPS = 1.0E-10d;
    private static final double EPS10 = 1.0E-10d;
    public static final int EULER = 0;
    public static final int MURD1 = 1;
    public static final int MURD2 = 2;
    public static final int MURD3 = 3;
    public static final int PCONIC = 4;
    public static final int TISSOT = 5;
    public static final int VITK1 = 6;

    /* renamed from: c1 */
    private double f37070c1;

    /* renamed from: c2 */
    private double f37071c2;

    /* renamed from: n */
    private double f37072n;
    private double rho_0;
    private double rho_c;
    private double sig;
    private int type;

    public SimpleConicProjection() {
        this(0);
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        int i;
        super.initialize();
        double radians = Math.toRadians(30.0d);
        double radians2 = Math.toRadians(60.0d);
        double d = (radians2 - radians) * 0.5d;
        this.sig = (radians2 + radians) * 0.5d;
        if (Math.abs(d) < 1.0E-10d || Math.abs(this.sig) < 1.0E-10d) {
            i = -42;
        } else {
            i = 0;
        }
        if (i == 0) {
            switch (this.type) {
                case 0:
                    this.f37072n = (Math.sin(d) * Math.sin(this.sig)) / d;
                    double d2 = d * 0.5d;
                    double tan = (d2 / (Math.tan(this.sig) * Math.tan(d2))) + this.sig;
                    this.rho_c = tan;
                    this.rho_0 = tan - this.projectionLatitude;
                    return;
                case 1:
                    double sin = Math.sin(d) / (Math.tan(this.sig) * d);
                    double d3 = this.sig;
                    double d4 = sin + d3;
                    this.rho_c = d4;
                    this.rho_0 = d4 - this.projectionLatitude;
                    this.f37072n = Math.sin(d3);
                    return;
                case 2:
                    double sqrt = Math.sqrt(Math.cos(d));
                    double tan2 = sqrt / Math.tan(this.sig);
                    this.rho_c = tan2;
                    this.rho_0 = Math.tan(this.sig - this.projectionLatitude) + tan2;
                    this.f37072n = Math.sin(this.sig) * sqrt;
                    return;
                case 3:
                    double tan3 = d / (Math.tan(d) * Math.tan(this.sig));
                    double d5 = this.sig;
                    double d6 = tan3 + d5;
                    this.rho_c = d6;
                    this.rho_0 = d6 - this.projectionLatitude;
                    this.f37072n = (Math.tan(d) * (Math.sin(d) * Math.sin(d5))) / (d * d);
                    return;
                case 4:
                    this.f37072n = Math.sin(this.sig);
                    this.f37071c2 = Math.cos(d);
                    this.f37070c1 = 1.0d / Math.tan(this.sig);
                    double d7 = this.projectionLatitude - this.sig;
                    if (Math.abs(d7) - 1.0E-10d < 1.5707963267948966d) {
                        this.rho_0 = (this.f37070c1 - Math.tan(d7)) * this.f37071c2;
                        this.maxLatitude = Math.toRadians(60.0d);
                        return;
                    }
                    throw new ProjectionException("-43");
                case 5:
                    this.f37072n = Math.sin(this.sig);
                    double cos = Math.cos(d);
                    double d8 = this.f37072n;
                    double d9 = (cos / d8) + (d8 / cos);
                    this.rho_c = d9;
                    this.rho_0 = Math.sqrt((d9 - (Math.sin(this.projectionLatitude) * 2.0d)) / this.f37072n);
                    return;
                case 6:
                    double tan4 = Math.tan(d);
                    this.f37072n = (Math.sin(this.sig) * tan4) / d;
                    double tan5 = (d / (Math.tan(this.sig) * tan4)) + this.sig;
                    this.rho_c = tan5;
                    this.rho_0 = tan5 - this.projectionLatitude;
                    return;
                default:
                    return;
            }
        } else {
            throw new ProjectionException("Error " + i);
        }
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        int i = this.type;
        if (i == 2) {
            d3 = this.rho_c + Math.tan(this.sig - d2);
        } else if (i != 4) {
            d3 = this.rho_c - d2;
        } else {
            d3 = this.f37071c2 * (this.f37070c1 - Math.tan(d2));
        }
        double d4 = d * this.f37072n;
        doubleR.f36952x = Math.sin(d4) * d3;
        doubleR.f36953y = this.rho_0 - (Math.cos(d4) * d3);
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3 = this.rho_0 - d2;
        doubleR.f36953y = d3;
        double distance = MapMath.distance(d, d3);
        if (this.f37072n < 0.0d) {
            distance = -distance;
            doubleR.f36952x = -d;
            doubleR.f36953y = -d2;
        }
        doubleR.f36952x = Math.atan2(d, d2) / this.f37072n;
        int i = this.type;
        if (i == 2) {
            doubleR.f36953y = this.sig - Math.atan(distance - this.rho_c);
        } else if (i != 4) {
            doubleR.f36953y = this.rho_c - distance;
        } else {
            doubleR.f36953y = Math.atan(this.f37070c1 - (distance / this.f37071c2)) + this.sig;
        }
        return doubleR;
    }

    public String toString() {
        return "Simple Conic";
    }

    public SimpleConicProjection(int i) {
        this.type = i;
        this.minLatitude = Math.toRadians(0.0d);
        this.maxLatitude = Math.toRadians(80.0d);
    }
}
