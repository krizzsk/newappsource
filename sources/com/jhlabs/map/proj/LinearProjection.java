package com.jhlabs.map.proj;

import java.awt.geom.Point2D;

public class LinearProjection extends Projection {
    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double inverseTransform(Point2D.Double doubleR, Point2D.Double doubleR2) {
        doubleR2.x = doubleR.x;
        doubleR2.y = doubleR.y;
        return doubleR2;
    }

    public boolean isRectilinear() {
        return true;
    }

    public String toString() {
        return "Linear";
    }

    public Point2D.Double transform(Point2D.Double doubleR, Point2D.Double doubleR2) {
        doubleR2.x = doubleR.x;
        doubleR2.y = doubleR.y;
        return doubleR2;
    }

    public void inverseTransform(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + 1;
            int i6 = i + 1;
            dArr2[i2] = dArr[i];
            i2 = i5 + 1;
            i = i6 + 1;
            dArr2[i5] = dArr[i6];
        }
    }

    public void transform(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + 1;
            int i6 = i + 1;
            dArr2[i2] = dArr[i];
            i2 = i5 + 1;
            i = i6 + 1;
            dArr2[i5] = dArr[i6];
        }
    }
}
