package com.jhlabs.map.proj;

import java.awt.geom.Point2D;

public class DenoyerProjection extends Projection {

    /* renamed from: C0 */
    public static final double f36991C0 = 0.95d;

    /* renamed from: C1 */
    public static final double f36992C1 = -0.08333333333333333d;

    /* renamed from: C3 */
    public static final double f36993C3 = 0.0016666666666666666d;

    /* renamed from: D1 */
    public static final double f36994D1 = 0.9d;

    /* renamed from: D5 */
    public static final double f36995D5 = 0.03d;

    public boolean hasInverse() {
        return false;
    }

    public boolean parallelsAreParallel() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.y = d2;
        doubleR.x = d;
        double abs = Math.abs(d);
        doubleR.x = Math.cos(((0.03d * d2 * d2 * d2 * d2) + 0.9d) * d2 * (((((abs * abs) * 0.0016666666666666666d) - 53.333333333333336d) * abs) + 0.95d)) * doubleR.x;
        return doubleR;
    }

    public String toString() {
        return "Denoyer Semi-elliptical";
    }
}
