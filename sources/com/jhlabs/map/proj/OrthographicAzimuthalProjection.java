package com.jhlabs.map.proj;

import com.jhlabs.map.Point2D;

public class OrthographicAzimuthalProjection extends AzimuthalProjection {
    public OrthographicAzimuthalProjection() {
        initialize();
    }

    public boolean hasInverse() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double cos = Math.cos(d2);
        double cos2 = Math.cos(d);
        int i = this.mode;
        if (i == 1) {
            cos2 = -cos2;
        } else if (i != 2) {
            if (i == 3) {
                doubleR.f36953y = Math.sin(d2);
            } else if (i == 4) {
                doubleR.f36953y = (this.cosphi0 * Math.sin(d2)) - ((this.sinphi0 * cos) * cos2);
            }
            doubleR.f36952x = Math.sin(d) * cos;
            return doubleR;
        }
        doubleR.f36953y = cos2 * cos;
        doubleR.f36952x = Math.sin(d) * cos;
        return doubleR;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.jhlabs.map.Point2D.Double projectInverse(double r24, double r26, com.jhlabs.map.Point2D.Double r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r3 = r28
            double r4 = com.jhlabs.map.MapMath.distance((double) r24, (double) r26)
            r6 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0023
            double r10 = r4 - r8
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 > 0) goto L_0x001d
            r10 = r8
            goto L_0x0024
        L_0x001d:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>()
            throw r1
        L_0x0023:
            r10 = r4
        L_0x0024:
            double r12 = r10 * r10
            double r12 = r8 - r12
            double r12 = java.lang.Math.sqrt(r12)
            double r14 = java.lang.Math.abs(r4)
            r8 = 4
            r9 = 3
            r16 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            r18 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            r20 = 0
            int r22 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r22 > 0) goto L_0x0048
            double r4 = r0.projectionLatitude
            r3.f36953y = r4
            goto L_0x00c0
        L_0x0048:
            int r6 = r0.mode
            r7 = 1
            if (r6 == r7) goto L_0x00c3
            r7 = 2
            if (r6 == r7) goto L_0x00b9
            if (r6 == r9) goto L_0x008e
            if (r6 == r8) goto L_0x0056
            goto L_0x00c0
        L_0x0056:
            double r6 = r0.sinphi0
            double r14 = r12 * r6
            double r1 = r1 * r10
            double r8 = r0.cosphi0
            double r1 = r1 * r8
            double r1 = r1 / r4
            double r1 = r1 + r14
            r3.f36953y = r1
            double r6 = r6 * r1
            double r12 = r12 - r6
            double r4 = r4 * r12
            double r10 = r10 * r8
            double r6 = r10 * r24
            double r1 = java.lang.Math.abs(r1)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0085
            double r1 = r3.f36953y
            int r8 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r8 >= 0) goto L_0x0080
            r1 = r16
            goto L_0x0082
        L_0x0080:
            r1 = r18
        L_0x0082:
            r3.f36953y = r1
            goto L_0x00b7
        L_0x0085:
            double r1 = r3.f36953y
            double r1 = java.lang.Math.asin(r1)
            r3.f36953y = r1
            goto L_0x00b7
        L_0x008e:
            double r1 = r1 * r10
            double r1 = r1 / r4
            r3.f36953y = r1
            double r6 = r24 * r10
            double r4 = r4 * r12
            double r1 = java.lang.Math.abs(r1)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00af
            double r1 = r3.f36953y
            int r8 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r8 >= 0) goto L_0x00aa
            r1 = r16
            goto L_0x00ac
        L_0x00aa:
            r1 = r18
        L_0x00ac:
            r3.f36953y = r1
            goto L_0x00b7
        L_0x00af:
            double r1 = r3.f36953y
            double r1 = java.lang.Math.asin(r1)
            r3.f36953y = r1
        L_0x00b7:
            r1 = r4
            goto L_0x00cb
        L_0x00b9:
            double r4 = java.lang.Math.acos(r10)
            double r4 = -r4
            r3.f36953y = r4
        L_0x00c0:
            r6 = r24
            goto L_0x00cb
        L_0x00c3:
            double r1 = -r1
            double r4 = java.lang.Math.acos(r10)
            r3.f36953y = r4
            goto L_0x00c0
        L_0x00cb:
            int r4 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r4 != 0) goto L_0x00e6
            int r4 = r0.mode
            r5 = 4
            if (r4 == r5) goto L_0x00d7
            r5 = 3
            if (r4 != r5) goto L_0x00e6
        L_0x00d7:
            int r1 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x00de
            r1 = r20
            goto L_0x00ec
        L_0x00de:
            int r1 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x00e3
            goto L_0x00ea
        L_0x00e3:
            r1 = r18
            goto L_0x00ec
        L_0x00e6:
            double r16 = java.lang.Math.atan2(r6, r1)
        L_0x00ea:
            r1 = r16
        L_0x00ec:
            r3.f36952x = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.OrthographicAzimuthalProjection.projectInverse(double, double, com.jhlabs.map.Point2D$Double):com.jhlabs.map.Point2D$Double");
    }

    public String toString() {
        return "Orthographic Azimuthal";
    }
}
