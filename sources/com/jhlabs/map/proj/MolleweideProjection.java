package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class MolleweideProjection extends PseudoCylindricalProjection {
    private static final int MAX_ITER = 10;
    public static final int MOLLEWEIDE = 0;
    private static final double TOLERANCE = 1.0E-7d;
    public static final int WAGNER4 = 1;
    public static final int WAGNER5 = 2;

    /* renamed from: cp */
    private double f37046cp;

    /* renamed from: cx */
    private double f37047cx;

    /* renamed from: cy */
    private double f37048cy;
    private int type;

    public MolleweideProjection() {
        this(1.5707963267948966d);
    }

    public boolean hasInverse() {
        return true;
    }

    public void init(double d) {
        double d2 = d + d;
        double sin = Math.sin(d);
        double sqrt = Math.sqrt((6.283185307179586d * sin) / (Math.sin(d2) + d2));
        this.f37047cx = (2.0d * sqrt) / 3.141592653589793d;
        this.f37048cy = sqrt / sin;
        this.f37046cp = Math.sin(d2) + d2;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double sin = Math.sin(d2) * this.f37046cp;
        int i = 10;
        while (i != 0) {
            double sin2 = ((Math.sin(d2) + d2) - sin) / (Math.cos(d2) + 1.0d);
            d2 -= sin2;
            if (Math.abs(sin2) < TOLERANCE) {
                break;
            }
            i--;
        }
        if (i != 0) {
            d3 = d2 * 0.5d;
        } else if (d2 < 0.0d) {
            d3 = -1.5707963267948966d;
        } else {
            d3 = 1.5707963267948966d;
        }
        doubleR.f36952x = Math.cos(d3) * this.f37047cx * d;
        doubleR.f36953y = Math.sin(d3) * this.f37048cy;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double asin = Math.asin(d2 / this.f37048cy);
        double d3 = this.f37047cx;
        double d4 = asin + asin;
        double asin2 = Math.asin((Math.sin(d4) + d4) / this.f37046cp);
        doubleR.f36952x = d / (Math.cos(asin) * d3);
        doubleR.f36953y = asin2;
        return doubleR;
    }

    public String toString() {
        int i = this.type;
        this.type = i;
        return i != 1 ? i != 2 ? "Molleweide" : "Wagner V" : "Wagner IV";
    }

    public MolleweideProjection(int i) {
        this.type = i;
        if (i == 0) {
            init(1.5707963267948966d);
        } else if (i == 1) {
            init(1.0471975511965976d);
        } else if (i == 2) {
            init(1.5707963267948966d);
            this.f37047cx = 0.90977d;
            this.f37048cy = 1.65014d;
            this.f37046cp = 3.00896d;
        }
    }

    public MolleweideProjection(double d) {
        this.type = 0;
        init(d);
    }

    public MolleweideProjection(double d, double d2, double d3) {
        this.type = 0;
        this.f37047cx = d;
        this.f37048cy = d2;
        this.f37046cp = d3;
    }
}
