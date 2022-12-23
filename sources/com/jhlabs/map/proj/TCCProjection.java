package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class TCCProjection extends CylindricalProjection {
    public TCCProjection() {
        this.minLongitude = MapMath.degToRad(-60.0d);
        this.maxLongitude = MapMath.degToRad(60.0d);
    }

    public boolean isRectilinear() {
        return false;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double sin = Math.sin(d) * Math.cos(d2);
        double d3 = 1.0d - (sin * sin);
        if (d3 >= 1.0E-10d) {
            doubleR.f36952x = sin / Math.sqrt(d3);
            doubleR.f36953y = Math.atan2(Math.tan(d2), Math.cos(d));
            return doubleR;
        }
        throw new ProjectionException("F");
    }

    public String toString() {
        return "Transverse Central Cylindrical";
    }
}
