package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import p001a0.C0016g;

public class AzimuthalProjection extends Projection {
    public static final int EQUATOR = 3;
    public static final int NORTH_POLE = 1;
    public static final int OBLIQUE = 4;
    public static final int SOUTH_POLE = 2;
    public double cosphi0;
    private double mapRadius;
    public int mode;
    public double sinphi0;

    public AzimuthalProjection() {
        this(Math.toRadians(45.0d), Math.toRadians(45.0d));
    }

    public double getMapRadius() {
        return this.mapRadius;
    }

    public void initialize() {
        int i;
        super.initialize();
        if (C0016g.m24g(this.projectionLatitude, 1.5707963267948966d) < 1.0E-10d) {
            if (this.projectionLatitude < 0.0d) {
                i = 2;
            } else {
                i = 1;
            }
            this.mode = i;
        } else if (Math.abs(this.projectionLatitude) > 1.0E-10d) {
            this.mode = 4;
            this.sinphi0 = Math.sin(this.projectionLatitude);
            this.cosphi0 = Math.cos(this.projectionLatitude);
        } else {
            this.mode = 3;
        }
    }

    public boolean inside(double d, double d2) {
        return MapMath.greatCircleDistance(Math.toRadians(d), Math.toRadians(d2), this.projectionLongitude, this.projectionLatitude) < Math.toRadians(this.mapRadius);
    }

    public void setMapRadius(double d) {
        this.mapRadius = d;
    }

    public AzimuthalProjection(double d, double d2) {
        this.mapRadius = 90.0d;
        this.projectionLatitude = d;
        this.projectionLongitude = d2;
        initialize();
    }
}
