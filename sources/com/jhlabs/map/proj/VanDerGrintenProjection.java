package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class VanDerGrintenProjection extends Projection {
    private static final double C2_27 = 0.07407407407407407d;
    private static final double HPISQ = 4.934802200544679d;
    private static final double PI4_3 = 4.188790204786391d;
    private static final double PISQ = 9.869604401089358d;
    private static final double THIRD = 0.3333333333333333d;
    private static final double TOL = 1.0E-10d;
    private static final double TPISQ = 19.739208802178716d;
    private static final double TWO_THRD = 0.6666666666666666d;

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3 = d;
        Point2D.Double doubleR2 = doubleR;
        double abs = Math.abs(d2 / 1.5707963267948966d);
        if (abs - 1.0E-10d <= 1.0d) {
            if (abs > 1.0d) {
                abs = 1.0d;
            }
            if (Math.abs(d2) <= 1.0E-10d) {
                doubleR2.f36952x = d3;
                doubleR2.f36953y = 0.0d;
            } else {
                double d4 = 3.141592653589793d;
                if (Math.abs(d) <= 1.0E-10d || Math.abs(abs - 1.0d) < 1.0E-10d) {
                    doubleR2.f36952x = 0.0d;
                    double tan = Math.tan(Math.asin(abs) * 0.5d) * 3.141592653589793d;
                    doubleR2.f36953y = tan;
                    if (d2 < 0.0d) {
                        doubleR2.f36953y = -tan;
                    }
                } else {
                    double abs2 = Math.abs((3.141592653589793d / d3) - (d3 / 3.141592653589793d)) * 0.5d;
                    double d5 = abs2 * abs2;
                    double sqrt = Math.sqrt(1.0d - (abs * abs));
                    double d6 = sqrt / ((abs + sqrt) - 1.0d);
                    double d7 = d6 * d6;
                    double d8 = ((2.0d / abs) - 1.0d) * d6;
                    double d9 = d8 * d8;
                    double d11 = d6 - d9;
                    doubleR2.f36952x = d11;
                    double d12 = d9 + d5;
                    double sqrt2 = ((Math.sqrt(((d5 * d11) * d11) - ((d7 - d9) * d12)) + (abs2 * d11)) * 3.141592653589793d) / d12;
                    doubleR2.f36952x = sqrt2;
                    if (d3 < 0.0d) {
                        doubleR2.f36952x = -sqrt2;
                    }
                    double abs3 = Math.abs(doubleR2.f36952x / 3.141592653589793d);
                    double d13 = 1.0d - (((abs2 * 2.0d) + abs3) * abs3);
                    doubleR2.f36953y = d13;
                    if (d13 < -1.0E-10d) {
                        throw new ProjectionException("F");
                    } else if (d13 < 0.0d) {
                        doubleR2.f36953y = 0.0d;
                    } else {
                        double sqrt3 = Math.sqrt(d13);
                        if (d2 < 0.0d) {
                            d4 = -3.141592653589793d;
                        }
                        doubleR2.f36953y = sqrt3 * d4;
                    }
                }
            }
            return doubleR2;
        }
        throw new ProjectionException("F");
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        Point2D.Double doubleR2 = doubleR;
        double d4 = d * d;
        double abs = Math.abs(d2);
        double d5 = 0.0d;
        if (abs < 1.0E-10d) {
            doubleR2.f36953y = 0.0d;
            double d6 = ((HPISQ + d4) * TPISQ) + (d4 * d4);
            if (Math.abs(d) > 1.0E-10d) {
                d5 = ((Math.sqrt(d6) + (d4 - PISQ)) * 0.5d) / d;
            }
            doubleR2.f36952x = d5;
            return doubleR2;
        }
        double d7 = d2 * d2;
        double d8 = d4 + d7;
        double d9 = d8 * d8;
        double d11 = (d8 + PISQ) * -3.141592653589793d * abs;
        double d12 = ((((((abs + 1.5707963267948966d) * 3.141592653589793d) + d7) * 3.141592653589793d) + (abs * d8)) * 6.283185307179586d) + d9;
        double d13 = abs * 3.141592653589793d;
        double d14 = (((d8 - (d7 * 3.0d)) * PISQ) + d11) / d12;
        double d15 = d14 * THIRD;
        double d16 = (d11 / d12) - (d15 * d14);
        double sqrt = Math.sqrt(-0.3333333333333333d * d16) * 2.0d;
        double d17 = (((((d13 * d13) - (d11 * d15)) / d12) + (((C2_27 * d14) * d14) * d14)) * 3.0d) / (d16 * sqrt);
        double abs2 = Math.abs(d17);
        if (abs2 - 1.0E-10d <= 1.0d) {
            if (abs2 <= 1.0d) {
                d3 = Math.acos(d17);
            } else if (d17 > 0.0d) {
                d3 = 0.0d;
            } else {
                d3 = 3.141592653589793d;
            }
            double cos = ((Math.cos((d3 * THIRD) + PI4_3) * sqrt) - d15) * 3.141592653589793d;
            doubleR2.f36953y = cos;
            if (d2 < 0.0d) {
                doubleR2.f36953y = -cos;
            }
            double d18 = (((d4 - d7) + HPISQ) * TPISQ) + d9;
            if (Math.abs(d) > 1.0E-10d) {
                double d19 = d8 - PISQ;
                if (d18 > 0.0d) {
                    d5 = Math.sqrt(d18);
                }
                d5 = ((d19 + d5) * 0.5d) / d;
            }
            doubleR2.f36952x = d5;
            return doubleR2;
        }
        throw new ProjectionException("I");
    }

    public String toString() {
        return "van der Grinten (I)";
    }
}
