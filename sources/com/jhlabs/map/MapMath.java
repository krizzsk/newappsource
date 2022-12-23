package com.jhlabs.map;

import com.jhlabs.map.Point2D;
import com.jhlabs.map.Rectangle2D;
import com.jhlabs.map.proj.ProjectionException;

public class MapMath {
    private static final double C00 = 1.0d;
    private static final double C02 = 0.25d;
    private static final double C04 = 0.046875d;
    private static final double C06 = 0.01953125d;
    private static final double C08 = 0.01068115234375d;
    private static final double C22 = 0.75d;
    private static final double C44 = 0.46875d;
    private static final double C46 = 0.013020833333333334d;
    private static final double C48 = 0.007120768229166667d;
    private static final double C66 = 0.3645833333333333d;
    private static final double C68 = 0.005696614583333333d;
    private static final double C88 = 0.3076171875d;
    public static final int COLLINEAR = 2;
    public static final int DONT_INTERSECT = 0;
    public static final int DO_INTERSECT = 1;
    public static final double DTR = 0.017453292519943295d;
    public static final double HALFPI = 1.5707963267948966d;
    private static final int MAX_ITER = 10;
    private static final int N_ITER = 15;
    private static final double P00 = 0.3333333333333333d;
    private static final double P01 = 0.17222222222222222d;
    private static final double P02 = 0.10257936507936508d;
    private static final double P10 = 0.06388888888888888d;
    private static final double P11 = 0.0664021164021164d;
    private static final double P20 = 0.016415012942191543d;
    public static final double QUARTERPI = 0.7853981633974483d;
    public static final double RTD = 57.29577951308232d;
    public static final double TWOPI = 6.283185307179586d;
    public static final Rectangle2D WORLD_BOUNDS = new Rectangle2D.Double(-180.0d, -90.0d, 360.0d, 180.0d);
    public static final Rectangle2D WORLD_BOUNDS_RAD = new Rectangle2D.Double(-3.141592653589793d, -1.5707963267948966d, 6.283185307179586d, 3.141592653589793d);

    public static double acos(double d) {
        if (Math.abs(d) <= C00) {
            return Math.acos(d);
        }
        if (d < 0.0d) {
            return 3.141592653589793d;
        }
        return 0.0d;
    }

    public static double acosd(double d) {
        return Math.acos(d) * 57.29577951308232d;
    }

    public static Point2D.Double add(Point2D.Double doubleR, Point2D.Double doubleR2) {
        return new Point2D.Double(doubleR.f36952x + doubleR2.f36952x, doubleR.f36953y + doubleR2.f36953y);
    }

    public static double asin(double d) {
        if (Math.abs(d) <= C00) {
            return Math.asin(d);
        }
        if (d < 0.0d) {
            return -1.5707963267948966d;
        }
        return 1.5707963267948966d;
    }

    public static double asind(double d) {
        return Math.asin(d) * 57.29577951308232d;
    }

    public static double atan2(double d, double d2) {
        return Math.atan2(d, d2);
    }

    public static double atan2d(double d, double d2) {
        return Math.atan2(d, d2) * 57.29577951308232d;
    }

    public static double atand(double d) {
        return Math.atan(d) * 57.29577951308232d;
    }

    public static double authlat(double d, double[] dArr) {
        double d2 = d + d;
        double sin = (Math.sin(d2) * dArr[0]) + d;
        double d3 = dArr[1];
        double d4 = d2 + d2;
        return (Math.sin(d4 + d2) * dArr[2]) + (Math.sin(d4) * d3) + sin;
    }

    public static double[] authset(double d) {
        double[] dArr = new double[3];
        double d2 = P00 * d;
        dArr[0] = d2;
        double d3 = d * d;
        double d4 = (P01 * d3) + d2;
        dArr[0] = d4;
        double d5 = P10 * d3;
        dArr[1] = d5;
        double d6 = d3 * d;
        dArr[0] = (P02 * d6) + d4;
        dArr[1] = (P11 * d6) + d5;
        dArr[2] = d6 * P20;
        return dArr;
    }

    public static double cosd(double d) {
        return Math.cos(d * 0.017453292519943295d);
    }

    public static double cross(double d, double d2, double d3, double d4) {
        return (d * d4) - (d3 * d2);
    }

    public static double cross(Point2D.Double doubleR, Point2D.Double doubleR2) {
        return (doubleR.f36952x * doubleR2.f36953y) - (doubleR2.f36952x * doubleR.f36953y);
    }

    public static double degToRad(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static double distance(double d, double d2) {
        return Math.sqrt((d2 * d2) + (d * d));
    }

    public static double dmsToDeg(double d, double d2, double d3) {
        if (d < 0.0d) {
            return (d - (d2 / 60.0d)) - (d3 / 3600.0d);
        }
        return (d3 / 3600.0d) + (d2 / 60.0d) + d;
    }

    public static double dmsToRad(double d, double d2, double d3) {
        if (d < 0.0d) {
            return (((d - (d2 / 60.0d)) - (d3 / 3600.0d)) * 3.141592653589793d) / 180.0d;
        }
        return (((d3 / 3600.0d) + ((d2 / 60.0d) + d)) * 3.141592653589793d) / 180.0d;
    }

    public static double dot(Point2D.Double doubleR, Point2D.Double doubleR2) {
        return (doubleR.f36953y * doubleR2.f36953y) + (doubleR.f36952x * doubleR2.f36952x);
    }

    public static double[] enfn(double d) {
        double d2 = ((((C08 * d) + C06) * d) + C04) * d;
        double d3 = d * d;
        double d4 = d3 * d;
        return new double[]{C00 - ((C02 + d2) * d), (C22 - d2) * d, (C44 - (((C48 * d) + C46) * d)) * d3, (C66 - (C68 * d)) * d4, d4 * d * C88};
    }

    public static double frac(double d) {
        return d - trunc(d);
    }

    public static double geocentricLatitude(double d, double d2) {
        double d3 = C00 - d2;
        return Math.atan(Math.tan(d) * d3 * d3);
    }

    public static double geographicLatitude(double d, double d2) {
        double d3 = C00 - d2;
        return Math.atan(Math.tan(d) / (d3 * d3));
    }

    public static double greatCircleDistance(double d, double d2, double d3, double d4) {
        double sin = Math.sin((d4 - d2) / 2.0d);
        double sin2 = Math.sin((d3 - d) / 2.0d);
        return Math.asin(Math.sqrt((Math.cos(d4) * Math.cos(d2) * sin2 * sin2) + (sin * sin))) * 2.0d;
    }

    public static double hypot(double d, double d2) {
        if (d < 0.0d) {
            d = -d;
        } else if (d == 0.0d) {
            if (d2 < 0.0d) {
                return -d2;
            }
            return d2;
        }
        if (d2 < 0.0d) {
            d2 = -d2;
        } else if (d2 == 0.0d) {
            return d;
        }
        if (d < d2) {
            double d3 = d / d2;
            return Math.sqrt((d3 * d3) + C00) * d2;
        }
        double d4 = d2 / d;
        return Math.sqrt((d4 * d4) + C00) * d;
    }

    public static int intersectSegments(Point2D.Double doubleR, Point2D.Double doubleR2, Point2D.Double doubleR3, Point2D.Double doubleR4, Point2D.Double doubleR5) {
        double d;
        double d2;
        double d3;
        Point2D.Double doubleR6 = doubleR;
        Point2D.Double doubleR7 = doubleR2;
        Point2D.Double doubleR8 = doubleR3;
        Point2D.Double doubleR9 = doubleR4;
        Point2D.Double doubleR10 = doubleR5;
        double d4 = doubleR7.f36953y;
        double d5 = doubleR6.f36953y;
        double d6 = d4 - d5;
        double d7 = doubleR6.f36952x;
        double d8 = doubleR7.f36952x;
        double d9 = d7 - d8;
        double d11 = (d8 * d5) - (d7 * d4);
        double d12 = (doubleR8.f36953y * d9) + (doubleR8.f36952x * d6) + d11;
        double d13 = (doubleR9.f36953y * d9) + (doubleR9.f36952x * d6) + d11;
        if (d12 != 0.0d && d13 != 0.0d && sameSigns(d12, d13)) {
            return 0;
        }
        double d14 = doubleR9.f36953y;
        double d15 = doubleR8.f36953y;
        double d16 = d14 - d15;
        double d17 = doubleR8.f36952x;
        double d18 = doubleR9.f36952x;
        double d19 = d17 - d18;
        double d21 = (d18 * d15) - (d17 * d14);
        double d22 = (doubleR6.f36953y * d19) + (doubleR6.f36952x * d16) + d21;
        double d23 = (doubleR7.f36953y * d19) + (doubleR7.f36952x * d16) + d21;
        if (d22 != 0.0d && d23 != 0.0d && sameSigns(d22, d23)) {
            return 0;
        }
        double d24 = (d6 * d19) - (d16 * d9);
        if (d24 == 0.0d) {
            return 2;
        }
        if (d24 < 0.0d) {
            d = (-d24) / 2.0d;
        } else {
            d = d24 / 2.0d;
        }
        double d25 = (d9 * d21) - (d19 * d11);
        if (d25 < 0.0d) {
            d2 = d25 - d;
        } else {
            d2 = d25 + d;
        }
        doubleR10.f36952x = d2 / d24;
        double d26 = (d16 * d11) - (d6 * d21);
        if (d26 < 0.0d) {
            d3 = d26 - d;
        } else {
            d3 = d26 + d;
        }
        doubleR10.f36953y = d3 / d24;
        return 1;
    }

    public static double inv_mlfn(double d, double d2, double[] dArr) {
        double d3 = C00 / (C00 - d2);
        double d4 = d;
        for (int i = 10; i != 0; i--) {
            double sin = Math.sin(d4);
            double d5 = C00 - ((d2 * sin) * sin);
            double sqrt = Math.sqrt(d5) * d5 * (mlfn(d4, sin, Math.cos(d4), dArr) - d) * d3;
            d4 -= sqrt;
            if (Math.abs(sqrt) < 1.0E-11d) {
                return d4;
            }
        }
        return d4;
    }

    public static double longitudeDistance(double d, double d2) {
        double d3;
        double d4;
        double abs = Math.abs(d - d2);
        if (d < 0.0d) {
            d3 = d + 3.141592653589793d;
        } else {
            d3 = 3.141592653589793d - d;
        }
        if (d2 < 0.0d) {
            d4 = d2 + 3.141592653589793d;
        } else {
            d4 = 3.141592653589793d - d2;
        }
        return Math.min(abs, d3 + d4);
    }

    public static double mlfn(double d, double d2, double d3, double[] dArr) {
        double d4 = d3 * d2;
        double d5 = d2 * d2;
        return (dArr[0] * d) - (((((((dArr[4] * d5) + dArr[3]) * d5) + dArr[2]) * d5) + dArr[1]) * d4);
    }

    public static double msfn(double d, double d2, double d3) {
        return d2 / Math.sqrt(C00 - ((d3 * d) * d));
    }

    public static Point2D.Double multiply(Point2D.Double doubleR, Point2D.Double doubleR2) {
        return new Point2D.Double(doubleR.f36952x * doubleR2.f36952x, doubleR.f36953y * doubleR2.f36953y);
    }

    public static void negate(Point2D.Double doubleR) {
        doubleR.f36952x = -doubleR.f36952x;
        doubleR.f36953y = -doubleR.f36953y;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r12 <= 5.0d) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        r4 = 10.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r12 < 7.0d) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double niceNumber(double r12, boolean r14) {
        /*
            double r0 = java.lang.Math.log(r12)
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r4 = java.lang.Math.log(r2)
            double r0 = r0 / r4
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            double r0 = (double) r0
            double r4 = java.lang.Math.pow(r2, r0)
            double r12 = r12 / r4
            r4 = 4617315517961601024(0x4014000000000000, double:5.0)
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r14 == 0) goto L_0x0033
            r10 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            r8 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 >= 0) goto L_0x002c
            goto L_0x003d
        L_0x002c:
            r6 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x0044
            goto L_0x0045
        L_0x0033:
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 > 0) goto L_0x0039
        L_0x0037:
            r4 = r8
            goto L_0x0045
        L_0x0039:
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 > 0) goto L_0x003f
        L_0x003d:
            r4 = r6
            goto L_0x0045
        L_0x003f:
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            double r12 = java.lang.Math.pow(r2, r0)
            double r12 = r12 * r4
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.MapMath.niceNumber(double, boolean):double");
    }

    public static void normalize(Point2D.Double doubleR) {
        double distance = distance(doubleR.f36952x, doubleR.f36953y);
        doubleR.f36952x /= distance;
        doubleR.f36953y /= distance;
    }

    public static double normalizeAngle(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new ProjectionException("Infinite angle");
        }
        while (d > 6.283185307179586d) {
            d -= 6.283185307179586d;
        }
        while (d < 0.0d) {
            d += 6.283185307179586d;
        }
        return d;
    }

    public static double normalizeLatitude(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new ProjectionException("Infinite latitude");
        }
        while (d > 1.5707963267948966d) {
            d -= 3.141592653589793d;
        }
        while (d < -1.5707963267948966d) {
            d += 3.141592653589793d;
        }
        return d;
    }

    public static double normalizeLongitude(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new ProjectionException("Infinite longitude");
        }
        while (d > 3.141592653589793d) {
            d -= 6.283185307179586d;
        }
        while (d < -3.141592653589793d) {
            d += 6.283185307179586d;
        }
        return d;
    }

    public static Point2D.Double perpendicular(Point2D.Double doubleR) {
        return new Point2D.Double(-doubleR.f36953y, doubleR.f36952x);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double phi2(double r15, double r17) {
        /*
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 * r17
            double r2 = java.lang.Math.atan(r15)
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 * r4
            r6 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r2 = r6 - r2
            r8 = 15
        L_0x0015:
            double r9 = java.lang.Math.sin(r2)
            double r9 = r9 * r17
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r11 - r9
            double r9 = r9 + r11
            double r13 = r13 / r9
            double r9 = java.lang.Math.pow(r13, r0)
            double r9 = r9 * r15
            double r9 = java.lang.Math.atan(r9)
            double r9 = r9 * r4
            double r9 = r6 - r9
            double r9 = r9 - r2
            double r2 = r2 + r9
            double r9 = java.lang.Math.abs(r9)
            r11 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0042
            int r8 = r8 + -1
            if (r8 != 0) goto L_0x0015
        L_0x0042:
            if (r8 <= 0) goto L_0x0045
            return r2
        L_0x0045:
            com.jhlabs.map.proj.ProjectionException r0 = new com.jhlabs.map.proj.ProjectionException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.MapMath.phi2(double, double):double");
    }

    public static double qsfn(double d, double d2, double d3) {
        if (d2 < 1.0E-7d) {
            return d + d;
        }
        double d4 = d2 * d;
        return ((d / (C00 - (d4 * d4))) - (Math.log((C00 - d4) / (d4 + C00)) * (0.5d / d2))) * d3;
    }

    public static double radToDeg(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    public static boolean sameSigns(double d, double d2) {
        return ((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)) < 0) == ((d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1)) < 0);
    }

    public static boolean sameSigns(int i, int i2) {
        return (i < 0) == (i2 < 0);
    }

    public static double sind(double d) {
        return Math.sin(d * 0.017453292519943295d);
    }

    public static double sphericalAzimuth(double d, double d2, double d3, double d4) {
        double d5 = d4 - d2;
        double cos = Math.cos(d3);
        return Math.atan2(Math.sin(d5) * cos, (Math.sin(d3) * Math.cos(d)) - (Math.cos(d5) * (Math.sin(d) * cos)));
    }

    public static double sqrt(double d) {
        if (d < 0.0d) {
            return 0.0d;
        }
        return Math.sqrt(d);
    }

    public static Point2D.Double subtract(Point2D.Double doubleR, Point2D.Double doubleR2) {
        return new Point2D.Double(doubleR.f36952x - doubleR2.f36952x, doubleR.f36953y - doubleR2.f36953y);
    }

    public static double takeSign(double d, double d2) {
        double abs = Math.abs(d);
        return d2 < 0.0d ? -abs : abs;
    }

    public static double tand(double d) {
        return Math.tan(d * 0.017453292519943295d);
    }

    public static double trunc(double d) {
        return d < 0.0d ? Math.ceil(d) : Math.floor(d);
    }

    public static double tsfn(double d, double d2, double d3) {
        double d4 = d2 * d3;
        return Math.tan((1.5707963267948966d - d) * 0.5d) / Math.pow((C00 - d4) / (d4 + C00), d3 * 0.5d);
    }

    public static double distance(Point2D.Double doubleR, Point2D.Double doubleR2) {
        return distance(doubleR.f36952x - doubleR2.f36952x, doubleR.f36953y - doubleR2.f36953y);
    }

    public static int takeSign(int i, int i2) {
        int abs = Math.abs(i);
        return i2 < 0 ? -abs : abs;
    }
}
