package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class MercatorProjection extends CylindricalProjection {
    public MercatorProjection() {
        this.minLatitude = MapMath.degToRad(-85.0d);
        this.maxLatitude = MapMath.degToRad(85.0d);
    }

    public int getEPSGCode() {
        return 9804;
    }

    public boolean hasInverse() {
        return true;
    }

    public boolean isRectilinear() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        if (this.spherical) {
            double d3 = this.scaleFactor;
            doubleR.f36952x = d * d3;
            doubleR.f36953y = Math.log(Math.tan((d2 * 0.5d) + 0.7853981633974483d)) * d3;
        } else {
            double d4 = this.scaleFactor;
            doubleR.f36952x = d * d4;
            doubleR.f36953y = Math.log(MapMath.tsfn(d2, Math.sin(d2), this.f37061e)) * (-d4);
        }
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        if (this.spherical) {
            doubleR.f36953y = 1.5707963267948966d - (Math.atan(Math.exp((-d2) / this.scaleFactor)) * 2.0d);
            doubleR.f36952x = d / this.scaleFactor;
        } else {
            doubleR.f36953y = MapMath.phi2(Math.exp((-d2) / this.scaleFactor), this.f37061e);
            doubleR.f36952x = d / this.scaleFactor;
        }
        return doubleR;
    }

    public String toString() {
        return "Mercator";
    }
}
