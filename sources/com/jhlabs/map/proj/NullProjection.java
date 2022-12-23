package com.jhlabs.map.proj;

import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class NullProjection extends Projection {
    public Shape getBoundingShape() {
        return null;
    }

    public boolean isRectilinear() {
        return true;
    }

    public Shape projectPath(Shape shape, AffineTransform affineTransform, boolean z) {
        if (affineTransform != null) {
            affineTransform.createTransformedShape(shape);
        }
        return shape;
    }

    public String toString() {
        return "Null";
    }

    public Point2D.Double transform(Point2D.Double doubleR, Point2D.Double doubleR2) {
        doubleR2.x = doubleR.x;
        doubleR2.y = doubleR.y;
        return doubleR2;
    }
}
