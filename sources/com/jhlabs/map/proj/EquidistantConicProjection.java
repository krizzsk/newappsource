package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class EquidistantConicProjection extends ConicProjection {
    private double eccentricity = 0.822719d;
    private double eccentricity2;
    private double eccentricity4;
    private double eccentricity6;

    /* renamed from: f */
    private double f37009f;

    /* renamed from: n */
    private double f37010n;
    private boolean northPole;
    private double radius;
    private double rho0;
    private double standardLatitude1;
    private double standardLatitude2;

    public EquidistantConicProjection() {
        double d = 0.822719d * 0.822719d;
        this.eccentricity2 = d;
        double d2 = d * d;
        this.eccentricity4 = d2;
        this.eccentricity6 = d * d2;
        this.radius = 1.0d;
        this.minLatitude = MapMath.degToRad(10.0d);
        this.maxLatitude = MapMath.degToRad(70.0d);
        this.minLongitude = MapMath.degToRad(-90.0d);
        this.maxLongitude = MapMath.degToRad(90.0d);
        this.standardLatitude1 = Math.toDegrees(60.0d);
        this.standardLatitude2 = Math.toDegrees(20.0d);
        initialize(MapMath.degToRad(0.0d), MapMath.degToRad(37.5d), this.standardLatitude1, this.standardLatitude2);
    }

    private void initialize(double d, double d2, double d3, double d4) {
        boolean z;
        double d5;
        super.initialize();
        if (d2 > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        this.northPole = z;
        if (z) {
            d5 = 1.5707963267948966d;
        } else {
            d5 = -1.5707963267948966d;
        }
        this.projectionLatitude = d5;
        double tan = Math.tan(0.7853981633974483d - (d3 * 0.5d)) / Math.pow((1.0d - (Math.sin(d3) * this.eccentricity)) / ((Math.sin(d3) * this.eccentricity) + 1.0d), this.eccentricity * 0.5d);
        double cos = Math.cos(d3) / Math.sqrt(1.0d - (Math.pow(Math.sin(d3), 2.0d) * this.eccentricity2));
        double tan2 = Math.tan(0.7853981633974483d - (d4 * 0.5d)) / Math.pow((1.0d - (Math.sin(d4) * this.eccentricity)) / ((Math.sin(d4) * this.eccentricity) + 1.0d), this.eccentricity * 0.5d);
        double cos2 = Math.cos(d4) / Math.sqrt(1.0d - (Math.pow(Math.sin(d4), 2.0d) * this.eccentricity2));
        double tan3 = Math.tan(0.7853981633974483d - (d2 * 0.5d)) / Math.pow((1.0d - (Math.sin(d2) * this.eccentricity)) / ((Math.sin(d2) * this.eccentricity) + 1.0d), this.eccentricity * 0.5d);
        if (d3 != d4) {
            this.f37010n = (Math.log(cos) - Math.log(cos2)) / (Math.log(tan) - Math.log(tan2));
        } else {
            this.f37010n = Math.sin(d3);
        }
        double d6 = this.f37010n;
        double pow = cos / (Math.pow(tan, d6) * d6);
        this.f37009f = pow;
        this.projectionLongitude = d;
        this.rho0 = Math.pow(tan3, this.f37010n) * this.radius * pow;
    }

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double inverseTransform(Point2D.Double doubleR, Point2D.Double doubleR2) {
        Point2D.Double doubleR3 = doubleR;
        Point2D.Double doubleR4 = doubleR2;
        doubleR4.f36952x = (Math.atan(doubleR3.f36952x / (this.rho0 - doubleR3.f36953y)) / this.f37010n) + this.projectionLongitude;
        double d = doubleR3.f36952x;
        double d2 = this.rho0;
        double d3 = doubleR3.f36953y;
        double sqrt = Math.sqrt(((d2 - d3) * (d2 - d3)) + (d * d));
        double d4 = this.f37010n;
        double d5 = 0.0d;
        if (d4 < 0.0d) {
            sqrt = -sqrt;
        }
        double d6 = 1.0d;
        double pow = Math.pow(sqrt / (this.radius * this.f37009f), 1.0d / d4);
        double atan = 1.5707963267948966d - (Math.atan(pow) * 2.0d);
        int i = 0;
        double d7 = 1.0d;
        while (i < 100 && d7 > 1.0E-8d) {
            d5 = 1.5707963267948966d - (Math.atan(Math.pow((d6 - (Math.sin(atan) * this.eccentricity)) / ((Math.sin(atan) * this.eccentricity) + d6), this.eccentricity * 0.5d) * pow) * 2.0d);
            i++;
            d7 = Math.abs(Math.abs(atan) - Math.abs(d5));
            atan = d5;
            d6 = 1.0d;
        }
        doubleR4.f36953y = d5;
        return doubleR4;
    }

    public String toString() {
        return "Equidistant Conic";
    }

    public Point2D.Double transform(Point2D.Double doubleR, Point2D.Double doubleR2) {
        double normalizeLongitude = MapMath.normalizeLongitude(doubleR.f36952x - this.projectionLongitude);
        double d = doubleR.f36953y;
        double pow = Math.pow((1.0d - (Math.sin(d) * this.eccentricity)) / ((Math.sin(d) * this.eccentricity) + 1.0d), this.eccentricity * 0.5d);
        double tan = Math.tan(0.7853981633974483d - (d * 0.5d));
        double d2 = 0.0d;
        if (tan != 0.0d) {
            d2 = Math.pow(tan / pow, this.f37010n);
        }
        double d3 = this.radius * this.f37009f * d2;
        double d4 = this.f37010n * normalizeLongitude;
        doubleR2.f36952x = Math.sin(d4) * d3;
        doubleR2.f36953y = this.rho0 - (Math.cos(d4) * d3);
        return doubleR2;
    }
}
