package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class PolyconicProjection extends Projection {
    private static final double CONV = 1.0E-10d;
    private static final double ITOL = 1.0E-12d;
    private static final int I_ITER = 20;
    private static final int N_ITER = 10;
    private static final double TOL = 1.0E-10d;

    /* renamed from: en */
    private double[] f37059en;
    private double ml0;

    public PolyconicProjection() {
        this.minLatitude = MapMath.degToRad(0.0d);
        this.maxLatitude = MapMath.degToRad(80.0d);
        this.minLongitude = MapMath.degToRad(-60.0d);
        this.maxLongitude = MapMath.degToRad(60.0d);
        initialize();
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        this.spherical = true;
        this.ml0 = -this.projectionLatitude;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = d;
        Point2D.Double doubleR2 = doubleR;
        if (this.spherical) {
            if (Math.abs(d2) <= 1.0E-10d) {
                doubleR2.f36952x = d4;
                doubleR2.f36953y = this.ml0;
            } else {
                double tan = 1.0d / Math.tan(d2);
                double sin = Math.sin(d2) * d4;
                doubleR2.f36952x = Math.sin(sin) * tan;
                doubleR2.f36953y = ((1.0d - Math.cos(sin)) * tan) + (d2 - this.projectionLatitude);
            }
        } else if (Math.abs(d2) <= 1.0E-10d) {
            doubleR2.f36952x = d4;
            doubleR2.f36953y = -this.ml0;
        } else {
            double sin2 = Math.sin(d2);
            double cos = Math.cos(d2);
            if (Math.abs(cos) > 1.0E-10d) {
                d3 = MapMath.msfn(sin2, cos, this.f37062es) / sin2;
            } else {
                d3 = 0.0d;
            }
            double d5 = doubleR2.f36952x * sin2;
            doubleR2.f36952x = d5;
            doubleR2.f36952x = Math.sin(d5) * d3;
            doubleR2.f36953y = ((1.0d - Math.cos(d)) * d3) + (MapMath.mlfn(d2, sin2, cos, this.f37059en) - this.ml0);
        }
        return doubleR2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.jhlabs.map.Point2D.Double projectInverse(double r36, double r38, com.jhlabs.map.Point2D.Double r40) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r3 = r38
            r5 = r40
            boolean r6 = r0.spherical
            r7 = 0
            java.lang.String r9 = "I"
            r10 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r6 == 0) goto L_0x0088
            double r14 = r0.projectionLatitude
            double r14 = r14 + r3
            double r14 = java.lang.Math.abs(r14)
            int r6 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x0028
            r5.f36952x = r1
            r5.f36953y = r7
            goto L_0x014a
        L_0x0028:
            double r6 = r1 * r1
            double r14 = r3 * r3
            double r6 = r6 + r14
            r8 = 10
        L_0x002f:
            double r16 = java.lang.Math.tan(r38)
            double r10 = r5.f36953y
            double r20 = r3 * r16
            double r20 = r20 + r12
            double r20 = r20 * r3
            double r20 = r20 - r3
            r22 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r24 = r14 + r6
            double r24 = r24 * r22
            double r24 = r24 * r16
            double r20 = r20 - r24
            double r22 = r3 - r3
            double r22 = r22 / r16
            double r22 = r22 - r12
            double r20 = r20 / r22
            double r10 = r10 - r20
            r5.f36953y = r10
            double r10 = java.lang.Math.abs(r20)
            r16 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r20 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r20 <= 0) goto L_0x006b
            int r8 = r8 + -1
            if (r8 > 0) goto L_0x0065
            goto L_0x006b
        L_0x0065:
            r10 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            goto L_0x002f
        L_0x006b:
            if (r8 == 0) goto L_0x0082
            double r6 = java.lang.Math.tan(r38)
            double r6 = r6 * r1
            double r1 = java.lang.Math.asin(r6)
            double r6 = java.lang.Math.sin(r38)
            double r1 = r1 / r6
            r5.f36952x = r1
            r5.f36953y = r3
            goto L_0x014a
        L_0x0082:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>(r9)
            throw r1
        L_0x0088:
            double r10 = r0.ml0
            double r3 = r3 + r10
            double r10 = java.lang.Math.abs(r3)
            r14 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 > 0) goto L_0x009e
            r5.f36952x = r1
            r5.f36953y = r7
            goto L_0x014a
        L_0x009e:
            double r6 = r3 * r3
            double r10 = r1 * r1
            double r10 = r10 + r6
            r6 = 20
            r7 = r3
        L_0x00a6:
            if (r6 > 0) goto L_0x00aa
            goto L_0x0124
        L_0x00aa:
            double r16 = java.lang.Math.sin(r7)
            double r18 = java.lang.Math.cos(r7)
            double r21 = r16 * r18
            double r14 = java.lang.Math.abs(r18)
            r23 = 4427486594234968593(0x3d719799812dea11, double:1.0E-12)
            int r20 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r20 < 0) goto L_0x0157
            double r14 = r0.f37062es
            double r14 = r14 * r16
            double r14 = r14 * r16
            double r14 = r12 - r14
            double r25 = java.lang.Math.sqrt(r14)
            double r14 = r16 * r25
            double r27 = r14 / r18
            double[] r14 = r0.f37059en
            r20 = r14
            r14 = r7
            double r14 = com.jhlabs.map.MapMath.mlfn(r14, r16, r18, r20)
            double r16 = r14 * r14
            double r16 = r16 + r10
            r38 = r10
            double r10 = r0.f37062es
            double r18 = r12 / r10
            double r29 = r25 * r25
            double r29 = r29 * r25
            double r18 = r18 / r29
            double r25 = r14 + r14
            double r29 = r27 * r16
            double r29 = r29 + r25
            r25 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r31 = r3 * r25
            double r33 = r27 * r14
            double r33 = r33 + r12
            double r33 = r33 * r31
            double r29 = r29 - r33
            double r10 = r10 * r21
            double r31 = r31 * r14
            double r16 = r16 - r31
            double r16 = r16 * r10
            double r16 = r16 / r27
            double r10 = r3 - r14
            double r10 = r10 * r25
            double r27 = r27 * r18
            double r14 = r12 / r21
            double r27 = r27 - r14
            double r27 = r27 * r10
            double r27 = r27 + r16
            double r27 = r27 - r18
            double r27 = r27 - r18
            double r29 = r29 / r27
            double r7 = r7 + r29
            double r10 = java.lang.Math.abs(r29)
            int r14 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r14 > 0) goto L_0x0151
        L_0x0124:
            if (r6 == 0) goto L_0x014b
            double r3 = java.lang.Math.sin(r7)
            double r9 = java.lang.Math.tan(r7)
            double r9 = r9 * r1
            double r1 = r0.f37062es
            double r1 = r1 * r3
            double r1 = r1 * r3
            double r12 = r12 - r1
            double r1 = java.lang.Math.sqrt(r12)
            double r1 = r1 * r9
            double r1 = java.lang.Math.asin(r1)
            double r3 = java.lang.Math.sin(r7)
            double r1 = r1 / r3
            r5.f36952x = r1
            r5.f36953y = r7
        L_0x014a:
            return r5
        L_0x014b:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>(r9)
            throw r1
        L_0x0151:
            int r6 = r6 + -1
            r10 = r38
            goto L_0x00a6
        L_0x0157:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.PolyconicProjection.projectInverse(double, double, com.jhlabs.map.Point2D$Double):com.jhlabs.map.Point2D$Double");
    }

    public String toString() {
        return "Polyconic (American)";
    }
}
