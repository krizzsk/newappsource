package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class StereographicAzimuthalProjection extends AzimuthalProjection {
    private static final double TOL = 1.0E-8d;
    private double akm1;

    public StereographicAzimuthalProjection() {
        this(Math.toRadians(90.0d), Math.toRadians(0.0d));
    }

    private double ssfn(double d, double d2, double d3) {
        double d4 = d2 * d3;
        return Math.pow((1.0d - d4) / (d4 + 1.0d), d3 * 0.5d) * Math.tan((d + 1.5707963267948966d) * 0.5d);
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        double d;
        int i;
        int i2;
        super.initialize();
        double abs = Math.abs(this.projectionLatitude);
        if (Math.abs(abs - 1.5707963267948966d) < 1.0E-10d) {
            if (this.projectionLatitude < 0.0d) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            this.mode = i2;
        } else {
            if (abs > 1.0E-10d) {
                i = 4;
            } else {
                i = 3;
            }
            this.mode = i;
        }
        double abs2 = Math.abs(this.trueScaleLatitude);
        this.trueScaleLatitude = abs2;
        if (this.spherical) {
            int i3 = this.mode;
            if (i3 == 1 || i3 == 2) {
                if (Math.abs(abs2 - 1.5707963267948966d) < 1.0E-10d) {
                    double d2 = this.f37061e;
                    double pow = Math.pow(d2 + 1.0d, d2 + 1.0d);
                    double d3 = this.f37061e;
                    this.akm1 = (this.scaleFactor * 2.0d) / Math.sqrt(Math.pow(1.0d - d3, 1.0d - d3) * pow);
                    return;
                }
                double cos = Math.cos(this.trueScaleLatitude);
                double d4 = this.trueScaleLatitude;
                double sin = Math.sin(d4);
                double tsfn = cos / MapMath.tsfn(d4, sin, this.f37061e);
                this.akm1 = tsfn;
                double d5 = sin * this.f37061e;
                this.akm1 = tsfn / Math.sqrt(1.0d - (d5 * d5));
            } else if (i3 == 3) {
                this.akm1 = this.scaleFactor * 2.0d;
            } else if (i3 == 4) {
                double sin2 = Math.sin(this.projectionLatitude);
                double atan = (Math.atan(ssfn(this.projectionLatitude, sin2, this.f37061e)) * 2.0d) - 1.5707963267948966d;
                double d6 = sin2 * this.f37061e;
                this.akm1 = (Math.cos(this.projectionLatitude) * (this.scaleFactor * 2.0d)) / Math.sqrt(1.0d - (d6 * d6));
                this.sinphi0 = Math.sin(atan);
                this.cosphi0 = Math.cos(atan);
            }
        } else {
            int i4 = this.mode;
            if (i4 == 1 || i4 == 2) {
                if (Math.abs(abs2 - 1.5707963267948966d) >= 1.0E-10d) {
                    d = Math.cos(this.trueScaleLatitude) / Math.tan(0.7853981633974483d - (this.trueScaleLatitude * 0.5d));
                } else {
                    d = this.scaleFactor * 2.0d;
                }
                this.akm1 = d;
                return;
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    this.sinphi0 = Math.sin(this.projectionLatitude);
                    this.cosphi0 = Math.cos(this.projectionLatitude);
                } else {
                    return;
                }
            }
            this.akm1 = this.scaleFactor * 2.0d;
        }
    }

    public boolean isConformal() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9 = d2;
        Point2D.Double doubleR2 = doubleR;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        double sin2 = Math.sin(d2);
        if (this.spherical) {
            double cos2 = Math.cos(d2);
            int i = this.mode;
            if (i == 1) {
                cos = -cos;
                d8 = -d9;
            } else if (i == 2) {
                double d11 = cos;
                d8 = d9;
            } else if (i == 3) {
                double d12 = (cos2 * cos) + 1.0d;
                doubleR2.f36953y = d12;
                if (d12 > 1.0E-10d) {
                    double d13 = this.akm1 / d12;
                    doubleR2.f36952x = cos2 * d13 * sin;
                    doubleR2.f36953y = d13 * sin2;
                } else {
                    throw new ProjectionException();
                }
            } else if (i == 4) {
                double d14 = this.sinphi0;
                double d15 = this.cosphi0;
                double d16 = (d14 * sin2) + 1.0d + (d15 * cos2 * cos);
                doubleR2.f36953y = d16;
                if (d16 > 1.0E-10d) {
                    double d17 = cos;
                    double d18 = this.akm1 / d16;
                    doubleR2.f36952x = d18 * cos2 * sin;
                    doubleR2.f36953y = ((d15 * sin2) - ((d14 * cos2) * d17)) * d18;
                } else {
                    throw new ProjectionException();
                }
            }
            if (Math.abs(d8 - 1.5707963267948966d) >= TOL) {
                double tan = Math.tan((d8 * 0.5d) + 0.7853981633974483d) * this.akm1;
                doubleR2.f36952x = sin * tan;
                doubleR2.f36953y = tan * cos;
            } else {
                throw new ProjectionException();
            }
        } else {
            int i2 = this.mode;
            double d19 = 0.0d;
            if (i2 == 4 || i2 == 3) {
                d3 = sin;
                d4 = sin2;
                double atan = (Math.atan(ssfn(d2, sin2, this.f37061e)) * 2.0d) - 1.5707963267948966d;
                double sin3 = Math.sin(atan);
                double cos3 = Math.cos(atan);
                d5 = sin3;
                d19 = cos3;
            } else {
                d4 = sin2;
                d3 = sin;
                d5 = 0.0d;
            }
            int i3 = this.mode;
            if (i3 == 1) {
                d6 = d4;
                d7 = d9;
            } else if (i3 != 2) {
                if (i3 == 3) {
                    double d21 = (this.akm1 * 2.0d) / ((cos * d19) + 1.0d);
                    doubleR2.f36953y = d5 * d21;
                    doubleR2.f36952x = d21 * d19;
                } else if (i3 == 4) {
                    double d22 = this.akm1;
                    double d23 = this.cosphi0;
                    double d24 = this.sinphi0;
                    double d25 = d22 / ((((d23 * d19) * cos) + ((d24 * d5) + 1.0d)) * d23);
                    doubleR2.f36953y = ((d23 * d5) - ((d24 * d19) * cos)) * d25;
                    doubleR2.f36952x = d25 * d19;
                }
                doubleR2.f36952x *= d3;
            } else {
                cos = -cos;
                d7 = -d9;
                d6 = -d4;
            }
            double tsfn = this.akm1 * MapMath.tsfn(d7, d6, this.f37061e);
            doubleR2.f36952x = tsfn;
            doubleR2.f36953y = (-tsfn) * cos;
            doubleR2.f36952x *= d3;
        }
        return doubleR2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01bb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.jhlabs.map.Point2D.Double projectInverse(double r26, double r28, com.jhlabs.map.Point2D.Double r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r3 = r28
            r5 = r30
            boolean r6 = r0.spherical
            r7 = 1
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r12 = 2
            r13 = 0
            if (r6 == 0) goto L_0x00e3
            double r15 = com.jhlabs.map.MapMath.distance((double) r26, (double) r28)
            double r8 = r0.akm1
            double r8 = r15 / r8
            double r8 = java.lang.Math.atan(r8)
            double r8 = r8 * r10
            double r10 = java.lang.Math.sin(r8)
            double r8 = java.lang.Math.cos(r8)
            r5.f36952x = r13
            int r6 = r0.mode
            if (r6 == r7) goto L_0x00b0
            if (r6 == r12) goto L_0x00b1
            r7 = 3
            if (r6 == r7) goto L_0x0080
            r7 = 4
            if (r6 == r7) goto L_0x0038
            goto L_0x00e2
        L_0x0038:
            double r6 = java.lang.Math.abs(r15)
            r17 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r12 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r12 > 0) goto L_0x004a
            double r3 = r0.projectionLatitude
            r5.f36953y = r3
            goto L_0x005c
        L_0x004a:
            double r6 = r0.sinphi0
            double r6 = r6 * r8
            double r3 = r3 * r10
            double r13 = r0.cosphi0
            double r3 = r3 * r13
            double r3 = r3 / r15
            double r3 = r3 + r6
            double r3 = java.lang.Math.asin(r3)
            r5.f36953y = r3
        L_0x005c:
            double r3 = r0.sinphi0
            double r6 = r5.f36953y
            double r6 = java.lang.Math.sin(r6)
            double r6 = r6 * r3
            double r8 = r8 - r6
            r3 = 0
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0071
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00e2
        L_0x0071:
            double r1 = r1 * r10
            double r3 = r0.cosphi0
            double r1 = r1 * r3
            double r8 = r8 * r15
            double r1 = java.lang.Math.atan2(r1, r8)
            r5.f36952x = r1
            goto L_0x00e2
        L_0x0080:
            double r6 = java.lang.Math.abs(r15)
            r12 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x0092
            r6 = 0
            r5.f36953y = r6
            goto L_0x009d
        L_0x0092:
            r6 = 0
            double r3 = r3 * r10
            double r3 = r3 / r15
            double r3 = java.lang.Math.asin(r3)
            r5.f36953y = r3
        L_0x009d:
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x00a5
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00e2
        L_0x00a5:
            double r1 = r1 * r10
            double r8 = r8 * r15
            double r1 = java.lang.Math.atan2(r1, r8)
            r5.f36952x = r1
            goto L_0x00e2
        L_0x00b0:
            double r3 = -r3
        L_0x00b1:
            double r6 = java.lang.Math.abs(r15)
            r10 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r13 > 0) goto L_0x00c5
            double r6 = r0.projectionLatitude
            r5.f36953y = r6
        L_0x00c2:
            r6 = 0
            goto L_0x00d1
        L_0x00c5:
            int r6 = r0.mode
            if (r6 != r12) goto L_0x00ca
            double r8 = -r8
        L_0x00ca:
            double r6 = java.lang.Math.asin(r8)
            r5.f36953y = r6
            goto L_0x00c2
        L_0x00d1:
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00dc
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00dc
            r13 = 0
            goto L_0x00e0
        L_0x00dc:
            double r13 = java.lang.Math.atan2(r1, r3)
        L_0x00e0:
            r5.f36952x = r13
        L_0x00e2:
            return r5
        L_0x00e3:
            double r8 = com.jhlabs.map.MapMath.distance((double) r26, (double) r28)
            int r6 = r0.mode
            if (r6 == r7) goto L_0x013d
            if (r6 == r12) goto L_0x013e
            double r6 = r0.cosphi0
            double r6 = r6 * r8
            double r12 = r0.akm1
            double r6 = java.lang.Math.atan2(r6, r12)
            double r6 = r6 * r10
            double r12 = java.lang.Math.cos(r6)
            double r6 = java.lang.Math.sin(r6)
            double r10 = r0.sinphi0
            double r10 = r10 * r12
            double r21 = r3 * r6
            double r14 = r0.cosphi0
            double r21 = r21 * r14
            double r21 = r21 / r8
            double r21 = r21 + r10
            double r10 = java.lang.Math.asin(r21)
            r14 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r21 = r10 + r14
            r14 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r21 = r21 * r14
            double r21 = java.lang.Math.tan(r21)
            double r1 = r1 * r6
            double r14 = r0.cosphi0
            double r8 = r8 * r14
            double r8 = r8 * r12
            double r12 = r0.sinphi0
            double r3 = r3 * r12
            double r3 = r3 * r6
            double r8 = r8 - r3
            double r3 = r0.f37061e
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r3 = r3 * r6
            r13 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            goto L_0x015f
        L_0x013d:
            double r3 = -r3
        L_0x013e:
            double r6 = -r8
            double r8 = r0.akm1
            double r21 = r6 / r8
            double r6 = java.lang.Math.atan(r21)
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 * r8
            r8 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r10 = r8 - r6
            r13 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            double r8 = r0.f37061e
            double r6 = r6 * r8
            r8 = r3
            r3 = r6
        L_0x015f:
            r6 = 8
        L_0x0161:
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x01bb
            r26 = r7
            double r6 = r0.f37061e
            double r19 = java.lang.Math.sin(r10)
            double r19 = r19 * r6
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r23 = r19 + r6
            double r6 = r6 - r19
            double r6 = r23 / r6
            double r6 = java.lang.Math.pow(r6, r3)
            double r6 = r6 * r21
            double r6 = java.lang.Math.atan(r6)
            r19 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 * r19
            double r6 = r6 - r13
            r5.f36953y = r6
            double r10 = r10 - r6
            double r6 = java.lang.Math.abs(r10)
            r10 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x01b3
            int r3 = r0.mode
            r6 = 2
            if (r3 != r6) goto L_0x01a0
            double r3 = r5.f36953y
            double r3 = -r3
            r5.f36953y = r3
        L_0x01a0:
            r15 = 0
            int r3 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x01ac
            int r3 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x01ac
            r13 = r15
            goto L_0x01b0
        L_0x01ac:
            double r13 = java.lang.Math.atan2(r1, r8)
        L_0x01b0:
            r5.f36952x = r13
            return r5
        L_0x01b3:
            r15 = 0
            double r6 = r5.f36953y
            r10 = r6
            r6 = r26
            goto L_0x0161
        L_0x01bb:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Iteration didn't converge"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.StereographicAzimuthalProjection.projectInverse(double, double, com.jhlabs.map.Point2D$Double):com.jhlabs.map.Point2D$Double");
    }

    public void setupUPS(int i) {
        double d;
        if (i == 2) {
            d = -1.5707963267948966d;
        } else {
            d = 1.5707963267948966d;
        }
        this.projectionLatitude = d;
        this.projectionLongitude = 0.0d;
        this.scaleFactor = 0.994d;
        this.falseEasting = 2000000.0d;
        this.falseNorthing = 2000000.0d;
        this.trueScaleLatitude = 1.5707963267948966d;
        initialize();
    }

    public String toString() {
        return "Stereographic Azimuthal";
    }

    public StereographicAzimuthalProjection(double d, double d2) {
        super(d, d2);
        initialize();
    }
}
