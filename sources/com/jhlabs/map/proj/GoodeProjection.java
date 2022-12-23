package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class GoodeProjection extends Projection {
    private static final double PHI_LIM = 0.7109307819790236d;
    private static final double Y_COR = 0.0528d;
    private MolleweideProjection moll = new MolleweideProjection();
    private SinusoidalProjection sinu = new SinusoidalProjection();

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        if (Math.abs(d2) <= PHI_LIM) {
            return this.sinu.project(d, d2, doubleR);
        }
        Point2D.Double project = this.moll.project(d, d2, doubleR);
        double d4 = project.f36953y;
        if (d2 >= 0.0d) {
            d3 = Y_COR;
        } else {
            d3 = -0.0528d;
        }
        project.f36953y = d4 - d3;
        return project;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        double d3;
        if (Math.abs(d2) <= PHI_LIM) {
            return this.sinu.projectInverse(d, d2, doubleR);
        }
        if (d2 >= 0.0d) {
            d3 = Y_COR;
        } else {
            d3 = -0.0528d;
        }
        return this.moll.projectInverse(d, d2 + d3, doubleR);
    }

    public String toString() {
        return "Goode Homolosine";
    }
}
