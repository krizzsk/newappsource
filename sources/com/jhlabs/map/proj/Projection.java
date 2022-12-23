package com.jhlabs.map.proj;

import com.jhlabs.map.AngleFormat;
import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;
import com.jhlabs.map.Rectangle2D;
import java.text.FieldPosition;

public class Projection implements Cloneable {
    public static final double DTR = 0.017453292519943295d;
    public static final double EPS10 = 1.0E-10d;
    public static final double RTD = 57.29577951308232d;

    /* renamed from: a */
    public double f37060a = 0.0d;

    /* renamed from: e */
    public double f37061e = 0.0d;
    public Ellipsoid ellipsoid;

    /* renamed from: es */
    public double f37062es = 0.0d;
    public double falseEasting = 0.0d;
    public double falseNorthing = 0.0d;
    public double fromMetres = 1.0d;
    public boolean geocentric;
    public double maxLatitude = 1.5707963267948966d;
    public double maxLongitude = 3.141592653589793d;
    public double minLatitude = -1.5707963267948966d;
    public double minLongitude = -3.141592653589793d;
    public String name = null;
    public double one_es = 0.0d;
    public double projectionLatitude = 0.0d;
    public double projectionLatitude1 = 0.0d;
    public double projectionLatitude2 = 0.0d;
    public double projectionLongitude = 0.0d;
    public double rone_es = 0.0d;
    public double scaleFactor = 1.0d;
    public boolean spherical;
    private double totalFalseEasting = 0.0d;
    private double totalFalseNorthing = 0.0d;
    private double totalScale = 0.0d;
    public double trueScaleLatitude = 0.0d;

    public Projection() {
        setEllipsoid(Ellipsoid.SPHERE);
    }

    public static float normalizeLongitude(float f) {
        double d = (double) f;
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Infinite longitude");
        }
        while (f > 180.0f) {
            f -= 360.0f;
        }
        while (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static double normalizeLongitudeRadians(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Infinite longitude");
        }
        while (d > 3.141592653589793d) {
            d -= 6.283185307179586d;
        }
        while (d < -3.141592653589793d) {
            d += 6.283185307179586d;
        }
        return d;
    }

    public Object clone() {
        try {
            return (Projection) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public int getEPSGCode() {
        return 0;
    }

    public Ellipsoid getEllipsoid() {
        return this.ellipsoid;
    }

    public double getEquatorRadius() {
        return this.f37060a;
    }

    public double getFalseEasting() {
        return this.falseEasting;
    }

    public double getFalseNorthing() {
        return this.falseNorthing;
    }

    public double getFromMetres() {
        return this.fromMetres;
    }

    public double getMaxLatitude() {
        return this.maxLatitude;
    }

    public double getMaxLatitudeDegrees() {
        return this.maxLatitude * 57.29577951308232d;
    }

    public double getMaxLongitude() {
        return this.maxLongitude;
    }

    public double getMaxLongitudeDegrees() {
        return this.maxLongitude * 57.29577951308232d;
    }

    public double getMinLatitude() {
        return this.minLatitude;
    }

    public double getMinLatitudeDegrees() {
        return this.minLatitude * 57.29577951308232d;
    }

    public double getMinLongitude() {
        return this.minLongitude;
    }

    public double getMinLongitudeDegrees() {
        return this.minLongitude * 57.29577951308232d;
    }

    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return toString();
    }

    public String getPROJ4Description() {
        AngleFormat angleFormat = new AngleFormat(AngleFormat.ddmmssPattern, false);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("+proj=" + getName() + " +a=" + this.f37060a);
        if (this.f37062es != 0.0d) {
            stringBuffer.append(" +es=" + this.f37062es);
        }
        stringBuffer.append(" +lon_0=");
        angleFormat.format(this.projectionLongitude, stringBuffer, (FieldPosition) null);
        stringBuffer.append(" +lat_0=");
        angleFormat.format(this.projectionLatitude, stringBuffer, (FieldPosition) null);
        if (this.falseEasting != 1.0d) {
            stringBuffer.append(" +x_0=" + this.falseEasting);
        }
        if (this.falseNorthing != 1.0d) {
            stringBuffer.append(" +y_0=" + this.falseNorthing);
        }
        if (this.scaleFactor != 1.0d) {
            stringBuffer.append(" +k=" + this.scaleFactor);
        }
        if (this.fromMetres != 1.0d) {
            stringBuffer.append(" +fr_meters=" + this.fromMetres);
        }
        return stringBuffer.toString();
    }

    public double getProjectionLatitude() {
        return this.projectionLatitude;
    }

    public double getProjectionLatitude1() {
        return this.projectionLatitude1;
    }

    public double getProjectionLatitude1Degrees() {
        return this.projectionLatitude1 * 57.29577951308232d;
    }

    public double getProjectionLatitude2() {
        return this.projectionLatitude2;
    }

    public double getProjectionLatitude2Degrees() {
        return this.projectionLatitude2 * 57.29577951308232d;
    }

    public double getProjectionLatitudeDegrees() {
        return this.projectionLatitude * 57.29577951308232d;
    }

    public double getProjectionLongitude() {
        return this.projectionLongitude;
    }

    public double getProjectionLongitudeDegrees() {
        return this.projectionLongitude * 57.29577951308232d;
    }

    public double getScaleFactor() {
        return this.scaleFactor;
    }

    public double getTrueScaleLatitude() {
        return this.trueScaleLatitude;
    }

    public double getTrueScaleLatitudeDegrees() {
        return this.trueScaleLatitude * 57.29577951308232d;
    }

    public boolean hasInverse() {
        return false;
    }

    public void initialize() {
        boolean z;
        if (this.f37061e == 0.0d) {
            z = true;
        } else {
            z = false;
        }
        this.spherical = z;
        double d = 1.0d - this.f37062es;
        this.one_es = d;
        this.rone_es = 1.0d / d;
        double d2 = this.f37060a;
        double d3 = this.fromMetres;
        this.totalScale = d2 * d3;
        this.totalFalseEasting = this.falseEasting * d3;
        this.totalFalseNorthing = this.falseNorthing * d3;
    }

    public boolean inside(double d, double d2) {
        double normalizeLongitude = (double) normalizeLongitude((float) ((d * 0.017453292519943295d) - this.projectionLongitude));
        if (this.minLongitude > normalizeLongitude || normalizeLongitude > this.maxLongitude || this.minLatitude > d2 || d2 > this.maxLatitude) {
            return false;
        }
        return true;
    }

    public Point2D.Double inverseTransform(Point2D.Double doubleR, Point2D.Double doubleR2) {
        double d = doubleR.f36952x - this.totalFalseEasting;
        double d2 = this.totalScale;
        projectInverse(d / d2, (doubleR.f36953y - this.totalFalseNorthing) / d2, doubleR2);
        double d3 = doubleR2.f36952x;
        if (d3 < -3.141592653589793d) {
            doubleR2.f36952x = -3.141592653589793d;
        } else if (d3 > 3.141592653589793d) {
            doubleR2.f36952x = 3.141592653589793d;
        }
        double d4 = this.projectionLongitude;
        if (d4 != 0.0d) {
            doubleR2.f36952x = MapMath.normalizeLongitude(doubleR2.f36952x + d4);
        }
        doubleR2.f36952x *= 57.29577951308232d;
        doubleR2.f36953y *= 57.29577951308232d;
        return doubleR2;
    }

    public Point2D.Double inverseTransformRadians(Point2D.Double doubleR, Point2D.Double doubleR2) {
        double d = doubleR.f36952x - this.totalFalseEasting;
        double d2 = this.totalScale;
        projectInverse(d / d2, (doubleR.f36953y - this.totalFalseNorthing) / d2, doubleR2);
        double d3 = doubleR2.f36952x;
        if (d3 < -3.141592653589793d) {
            doubleR2.f36952x = -3.141592653589793d;
        } else if (d3 > 3.141592653589793d) {
            doubleR2.f36952x = 3.141592653589793d;
        }
        double d4 = this.projectionLongitude;
        if (d4 != 0.0d) {
            doubleR2.f36952x = MapMath.normalizeLongitude(doubleR2.f36952x + d4);
        }
        return doubleR2;
    }

    public boolean isConformal() {
        return false;
    }

    public boolean isEqualArea() {
        return false;
    }

    public boolean isRectilinear() {
        return false;
    }

    public boolean parallelsAreParallel() {
        return isRectilinear();
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = d;
        doubleR.f36953y = d2;
        return doubleR;
    }

    public Point2D.Double projectInverse(double d, double d2, Point2D.Double doubleR) {
        doubleR.f36952x = d;
        doubleR.f36953y = d2;
        return doubleR;
    }

    public void setEllipsoid(Ellipsoid ellipsoid2) {
        this.ellipsoid = ellipsoid2;
        this.f37060a = ellipsoid2.equatorRadius;
        this.f37061e = ellipsoid2.eccentricity;
        this.f37062es = ellipsoid2.eccentricity2;
    }

    public void setFalseEasting(double d) {
        this.falseEasting = d;
    }

    public void setFalseNorthing(double d) {
        this.falseNorthing = d;
    }

    public void setFromMetres(double d) {
        this.fromMetres = d;
    }

    public void setMaxLatitude(double d) {
        this.maxLatitude = d;
    }

    public void setMaxLongitude(double d) {
        this.maxLongitude = d;
    }

    public void setMaxLongitudeDegrees(double d) {
        this.maxLongitude = d * 0.017453292519943295d;
    }

    public void setMinLatitude(double d) {
        this.minLatitude = d;
    }

    public void setMinLongitude(double d) {
        this.minLongitude = d;
    }

    public void setMinLongitudeDegrees(double d) {
        this.minLongitude = d * 0.017453292519943295d;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProjectionLatitude(double d) {
        this.projectionLatitude = d;
    }

    public void setProjectionLatitude1(double d) {
        this.projectionLatitude1 = d;
    }

    public void setProjectionLatitude1Degrees(double d) {
        this.projectionLatitude1 = d * 0.017453292519943295d;
    }

    public void setProjectionLatitude2(double d) {
        this.projectionLatitude2 = d;
    }

    public void setProjectionLatitude2Degrees(double d) {
        this.projectionLatitude2 = d * 0.017453292519943295d;
    }

    public void setProjectionLatitudeDegrees(double d) {
        this.projectionLatitude = d * 0.017453292519943295d;
    }

    public void setProjectionLongitude(double d) {
        this.projectionLongitude = normalizeLongitudeRadians(d);
    }

    public void setProjectionLongitudeDegrees(double d) {
        this.projectionLongitude = d * 0.017453292519943295d;
    }

    public void setScaleFactor(double d) {
        this.scaleFactor = d;
    }

    public void setTrueScaleLatitude(double d) {
        this.trueScaleLatitude = d;
    }

    public void setTrueScaleLatitudeDegrees(double d) {
        this.trueScaleLatitude = d * 0.017453292519943295d;
    }

    public String toString() {
        return "None";
    }

    public Point2D.Double transform(Point2D.Double doubleR, Point2D.Double doubleR2) {
        double d = doubleR.f36952x * 0.017453292519943295d;
        double d2 = this.projectionLongitude;
        if (d2 != 0.0d) {
            d = MapMath.normalizeLongitude(d - d2);
        }
        project(d, doubleR.f36953y * 0.017453292519943295d, doubleR2);
        double d3 = this.totalScale;
        doubleR2.f36952x = (doubleR2.f36952x * d3) + this.totalFalseEasting;
        doubleR2.f36953y = (d3 * doubleR2.f36953y) + this.totalFalseNorthing;
        return doubleR2;
    }

    public Point2D.Double transformRadians(Point2D.Double doubleR, Point2D.Double doubleR2) {
        double d = doubleR.f36952x;
        double d2 = this.projectionLongitude;
        if (d2 != 0.0d) {
            d = MapMath.normalizeLongitude(d - d2);
        }
        project(d, doubleR.f36953y, doubleR2);
        double d3 = this.totalScale;
        doubleR2.f36952x = (doubleR2.f36952x * d3) + this.totalFalseEasting;
        doubleR2.f36953y = (d3 * doubleR2.f36953y) + this.totalFalseNorthing;
        return doubleR2;
    }

    public void transform(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        Point2D.Double doubleR = new Point2D.Double();
        Point2D.Double doubleR2 = new Point2D.Double();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + 1;
            doubleR.f36952x = dArr[i];
            i = i5 + 1;
            doubleR.f36953y = dArr[i5];
            transform(doubleR, doubleR2);
            int i6 = i2 + 1;
            dArr2[i2] = doubleR2.f36952x;
            i2 = i6 + 1;
            dArr2[i6] = doubleR2.f36953y;
        }
    }

    public void transformRadians(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        Point2D.Double doubleR = new Point2D.Double();
        Point2D.Double doubleR2 = new Point2D.Double();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + 1;
            doubleR.f36952x = dArr[i];
            i = i5 + 1;
            doubleR.f36953y = dArr[i5];
            transform(doubleR, doubleR2);
            int i6 = i2 + 1;
            dArr2[i2] = doubleR2.f36952x;
            i2 = i6 + 1;
            dArr2[i6] = doubleR2.f36953y;
        }
    }

    public void inverseTransformRadians(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        Point2D.Double doubleR = new Point2D.Double();
        Point2D.Double doubleR2 = new Point2D.Double();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + 1;
            doubleR.f36952x = dArr[i];
            i = i5 + 1;
            doubleR.f36953y = dArr[i5];
            inverseTransformRadians(doubleR, doubleR2);
            int i6 = i2 + 1;
            dArr2[i2] = doubleR2.f36952x;
            i2 = i6 + 1;
            dArr2[i6] = doubleR2.f36953y;
        }
    }

    public void inverseTransform(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        Point2D.Double doubleR = new Point2D.Double();
        Point2D.Double doubleR2 = new Point2D.Double();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + 1;
            doubleR.f36952x = dArr[i];
            i = i5 + 1;
            doubleR.f36953y = dArr[i5];
            inverseTransform(doubleR, doubleR2);
            int i6 = i2 + 1;
            dArr2[i2] = doubleR2.f36952x;
            i2 = i6 + 1;
            dArr2[i6] = doubleR2.f36953y;
        }
    }

    public Rectangle2D transform(Rectangle2D rectangle2D) {
        double d;
        Rectangle2D.Double doubleR;
        Point2D.Double doubleR2 = new Point2D.Double();
        Point2D.Double doubleR3 = new Point2D.Double();
        Rectangle2D.Double doubleR4 = null;
        if (isRectilinear()) {
            for (int i = 0; i < 2; i++) {
                double width = (rectangle2D.getWidth() * ((double) i)) + rectangle2D.getX();
                for (int i2 = 0; i2 < 2; i2++) {
                    double y = rectangle2D.getY();
                    Rectangle2D.Double doubleR5 = doubleR4;
                    doubleR2.f36952x = width;
                    doubleR2.f36953y = (rectangle2D.getHeight() * ((double) i2)) + y;
                    transform(doubleR2, doubleR3);
                    if (i == 0 && i2 == 0) {
                        doubleR4 = new Rectangle2D.Double(doubleR3.f36952x, doubleR3.f36953y, 0.0d, 0.0d);
                    } else {
                        Rectangle2D.Double doubleR6 = doubleR5;
                        doubleR6.add(doubleR3.f36952x, doubleR3.f36953y);
                        doubleR4 = doubleR6;
                    }
                }
            }
        } else {
            int i3 = 0;
            while (true) {
                if (i3 >= 7) {
                    break;
                }
                double width2 = ((rectangle2D.getWidth() * ((double) i3)) / 6.0d) + rectangle2D.getX();
                int i4 = 0;
                for (int i5 = 7; i4 < i5; i5 = 7) {
                    double y2 = rectangle2D.getY();
                    Rectangle2D.Double doubleR7 = doubleR4;
                    doubleR2.f36952x = width2;
                    doubleR2.f36953y = ((rectangle2D.getHeight() * ((double) i4)) / 6.0d) + y2;
                    transform(doubleR2, doubleR3);
                    if (i3 == 0 && i4 == 0) {
                        d = width2;
                        doubleR = new Rectangle2D.Double(doubleR3.f36952x, doubleR3.f36953y, 0.0d, 0.0d);
                    } else {
                        d = width2;
                        doubleR7.add(doubleR3.f36952x, doubleR3.f36953y);
                        doubleR = doubleR7;
                    }
                    i4++;
                    width2 = d;
                }
                i3++;
            }
        }
        return doubleR4;
    }

    public Rectangle2D inverseTransform(Rectangle2D rectangle2D) {
        double d;
        Rectangle2D.Double doubleR;
        Point2D.Double doubleR2 = new Point2D.Double();
        Point2D.Double doubleR3 = new Point2D.Double();
        Rectangle2D.Double doubleR4 = null;
        if (isRectilinear()) {
            for (int i = 0; i < 2; i++) {
                double width = (rectangle2D.getWidth() * ((double) i)) + rectangle2D.getX();
                for (int i2 = 0; i2 < 2; i2++) {
                    double y = rectangle2D.getY();
                    Rectangle2D.Double doubleR5 = doubleR4;
                    doubleR2.f36952x = width;
                    doubleR2.f36953y = (rectangle2D.getHeight() * ((double) i2)) + y;
                    inverseTransform(doubleR2, doubleR3);
                    if (i == 0 && i2 == 0) {
                        doubleR4 = new Rectangle2D.Double(doubleR3.f36952x, doubleR3.f36953y, 0.0d, 0.0d);
                    } else {
                        Rectangle2D.Double doubleR6 = doubleR5;
                        doubleR6.add(doubleR3.f36952x, doubleR3.f36953y);
                        doubleR4 = doubleR6;
                    }
                }
            }
        } else {
            int i3 = 0;
            while (true) {
                if (i3 >= 7) {
                    break;
                }
                double width2 = ((rectangle2D.getWidth() * ((double) i3)) / 6.0d) + rectangle2D.getX();
                int i4 = 0;
                for (int i5 = 7; i4 < i5; i5 = 7) {
                    double y2 = rectangle2D.getY();
                    Rectangle2D.Double doubleR7 = doubleR4;
                    doubleR2.f36952x = width2;
                    doubleR2.f36953y = ((rectangle2D.getHeight() * ((double) i4)) / 6.0d) + y2;
                    inverseTransform(doubleR2, doubleR3);
                    if (i3 == 0 && i4 == 0) {
                        d = width2;
                        doubleR = new Rectangle2D.Double(doubleR3.f36952x, doubleR3.f36953y, 0.0d, 0.0d);
                    } else {
                        d = width2;
                        doubleR7.add(doubleR3.f36952x, doubleR3.f36953y);
                        doubleR = doubleR7;
                    }
                    i4++;
                    width2 = d;
                }
                i3++;
            }
        }
        return doubleR4;
    }
}
