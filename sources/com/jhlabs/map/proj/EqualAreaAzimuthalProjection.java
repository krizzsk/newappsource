package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;

public class EqualAreaAzimuthalProjection extends AzimuthalProjection {
    private double[] apa;
    private double cosb1;

    /* renamed from: dd */
    private double f37000dd;
    private double mmf;

    /* renamed from: qp */
    private double f37001qp;

    /* renamed from: rq */
    private double f37002rq;
    private double sinb1;
    private double xmf;
    private double ymf;

    public EqualAreaAzimuthalProjection() {
        initialize();
    }

    public Object clone() {
        EqualAreaAzimuthalProjection equalAreaAzimuthalProjection = (EqualAreaAzimuthalProjection) super.clone();
        double[] dArr = this.apa;
        if (dArr != null) {
            equalAreaAzimuthalProjection.apa = (double[]) dArr.clone();
        }
        return equalAreaAzimuthalProjection;
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        super.initialize();
        if (!this.spherical) {
            this.f37001qp = MapMath.qsfn(1.0d, this.f37061e, this.one_es);
            double d = this.f37062es;
            this.mmf = 0.5d / (1.0d - d);
            this.apa = MapMath.authset(d);
            int i = this.mode;
            if (i == 1 || i == 2) {
                this.f37000dd = 1.0d;
            } else if (i == 3) {
                double sqrt = Math.sqrt(this.f37001qp * 0.5d);
                this.f37002rq = sqrt;
                this.f37000dd = 1.0d / sqrt;
                this.xmf = 1.0d;
                this.ymf = this.f37001qp * 0.5d;
            } else if (i == 4) {
                this.f37002rq = Math.sqrt(this.f37001qp * 0.5d);
                double sin = Math.sin(this.projectionLatitude);
                double qsfn = MapMath.qsfn(sin, this.f37061e, this.one_es) / this.f37001qp;
                this.sinb1 = qsfn;
                this.cosb1 = Math.sqrt(1.0d - (qsfn * qsfn));
                double cos = Math.cos(this.projectionLatitude);
                double sqrt2 = Math.sqrt(1.0d - ((this.f37062es * sin) * sin));
                double d2 = this.f37002rq;
                double d3 = cos / ((sqrt2 * d2) * this.cosb1);
                this.f37000dd = d3;
                this.ymf = d2 / d3;
                this.xmf = d2 * d3;
            }
        } else if (this.mode == 4) {
            this.sinphi0 = Math.sin(this.projectionLatitude);
            this.cosphi0 = Math.cos(this.projectionLatitude);
        }
    }

    public boolean isEqualArea() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.jhlabs.map.Point2D.Double project(double r26, double r28, com.jhlabs.map.Point2D.Double r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r30
            boolean r2 = r0.spherical
            r3 = 1
            r4 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            r6 = 4
            r9 = 2
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = 3
            if (r2 == 0) goto L_0x00ed
            double r13 = java.lang.Math.sin(r28)
            double r15 = java.lang.Math.cos(r28)
            double r7 = java.lang.Math.cos(r26)
            int r2 = r0.mode
            if (r2 == r3) goto L_0x00ab
            if (r2 == r9) goto L_0x00ac
            if (r2 == r12) goto L_0x006f
            if (r2 == r6) goto L_0x002b
            goto L_0x01e9
        L_0x002b:
            double r2 = r0.sinphi0
            double r2 = r2 * r13
            double r2 = r2 + r10
            double r9 = r0.cosphi0
            double r9 = r9 * r15
            double r9 = r9 * r7
            double r9 = r9 + r2
            r1.f36953y = r9
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0069
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 / r9
            double r2 = java.lang.Math.sqrt(r2)
            r1.f36953y = r2
            double r2 = r2 * r15
            double r4 = java.lang.Math.sin(r26)
            double r4 = r4 * r2
            r1.f36952x = r4
            double r2 = r1.f36953y
            int r4 = r0.mode
            if (r4 != r12) goto L_0x0057
            goto L_0x0063
        L_0x0057:
            double r4 = r0.cosphi0
            double r4 = r4 * r13
            double r9 = r0.sinphi0
            double r9 = r9 * r15
            double r9 = r9 * r7
            double r13 = r4 - r9
        L_0x0063:
            double r2 = r2 * r13
            r1.f36953y = r2
            goto L_0x01e9
        L_0x0069:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>()
            throw r1
        L_0x006f:
            double r2 = r15 * r7
            double r2 = r2 + r10
            r1.f36953y = r2
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a5
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r4 / r2
            double r2 = java.lang.Math.sqrt(r2)
            r1.f36953y = r2
            double r2 = r2 * r15
            double r4 = java.lang.Math.sin(r26)
            double r4 = r4 * r2
            r1.f36952x = r4
            double r2 = r1.f36953y
            int r4 = r0.mode
            if (r4 != r12) goto L_0x0093
            goto L_0x009f
        L_0x0093:
            double r4 = r0.cosphi0
            double r4 = r4 * r13
            double r9 = r0.sinphi0
            double r9 = r9 * r15
            double r9 = r9 * r7
            double r13 = r4 - r9
        L_0x009f:
            double r2 = r2 * r13
            r1.f36953y = r2
            goto L_0x01e9
        L_0x00a5:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>()
            throw r1
        L_0x00ab:
            double r7 = -r7
        L_0x00ac:
            double r2 = r0.projectionLatitude
            double r2 = r28 + r2
            double r2 = java.lang.Math.abs(r2)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x00e7
            r2 = 4605249457297304856(0x3fe921fb54442d18, double:0.7853981633974483)
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = r4 * r28
            double r2 = r2 - r4
            r1.f36953y = r2
            int r4 = r0.mode
            if (r4 != r9) goto L_0x00cd
            double r2 = java.lang.Math.cos(r2)
            goto L_0x00d1
        L_0x00cd:
            double r2 = java.lang.Math.sin(r2)
        L_0x00d1:
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r2 * r4
            r1.f36953y = r2
            double r4 = java.lang.Math.sin(r26)
            double r4 = r4 * r2
            r1.f36952x = r4
            double r2 = r1.f36953y
            double r2 = r2 * r7
            r1.f36953y = r2
            goto L_0x01e9
        L_0x00e7:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>()
            throw r1
        L_0x00ed:
            double r7 = java.lang.Math.cos(r26)
            double r13 = java.lang.Math.sin(r26)
            double r17 = java.lang.Math.sin(r28)
            double r4 = r0.f37061e
            double r9 = r0.one_es
            r19 = r4
            r21 = r9
            double r4 = com.jhlabs.map.MapMath.qsfn(r17, r19, r21)
            int r9 = r0.mode
            if (r9 == r6) goto L_0x0111
            if (r9 != r12) goto L_0x010c
            goto L_0x0111
        L_0x010c:
            r10 = 0
            r17 = 0
            goto L_0x0125
        L_0x0111:
            double r10 = r0.f37001qp
            double r9 = r4 / r10
            double r17 = r9 * r9
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r17 = r19 - r17
            double r17 = java.lang.Math.sqrt(r17)
            r23 = r9
            r10 = r17
            r17 = r23
        L_0x0125:
            int r9 = r0.mode
            r19 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            if (r9 == r3) goto L_0x015e
            r2 = 2
            if (r9 == r2) goto L_0x0156
            if (r9 == r12) goto L_0x014d
            if (r9 == r6) goto L_0x013b
            r21 = r13
            r12 = r4
            r3 = 0
            goto L_0x0168
        L_0x013b:
            r21 = r13
            double r12 = r0.sinb1
            double r12 = r12 * r17
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 + r19
            double r2 = r0.cosb1
            double r2 = r2 * r10
            double r2 = r2 * r7
            double r2 = r2 + r12
            goto L_0x0166
        L_0x014d:
            r21 = r13
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r10 * r7
            double r2 = r2 + r19
            goto L_0x0166
        L_0x0156:
            r21 = r13
            double r2 = r28 - r19
            double r12 = r0.f37001qp
            double r4 = r4 + r12
            goto L_0x0166
        L_0x015e:
            r21 = r13
            double r2 = r28 + r19
            double r12 = r0.f37001qp
            double r4 = r12 - r4
        L_0x0166:
            r12 = r4
            r3 = r2
        L_0x0168:
            double r19 = java.lang.Math.abs(r3)
            r15 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r2 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r2 < 0) goto L_0x01ea
            int r5 = r0.mode
            r2 = 1
            if (r5 == r2) goto L_0x01c9
            r2 = 2
            if (r5 == r2) goto L_0x01c9
            r9 = 3
            if (r5 == r9) goto L_0x01a9
            if (r5 == r6) goto L_0x0183
            goto L_0x01e9
        L_0x0183:
            double r5 = r0.ymf
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = r12 / r3
            double r2 = java.lang.Math.sqrt(r2)
            double r5 = r5 * r2
            double r12 = r0.cosb1
            double r12 = r12 * r17
            double r14 = r0.sinb1
            double r14 = r14 * r10
            double r14 = r14 * r7
            double r12 = r12 - r14
            double r12 = r12 * r5
            r1.f36953y = r12
            double r4 = r0.xmf
            double r4 = r4 * r2
            double r4 = r4 * r10
            double r4 = r4 * r21
            r1.f36952x = r4
            goto L_0x01e9
        L_0x01a9:
            double r7 = r7 * r10
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 + r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = r2 / r7
            double r2 = java.lang.Math.sqrt(r7)
            double r17 = r17 * r2
            double r4 = r0.ymf
            double r4 = r4 * r17
            r1.f36953y = r4
            double r4 = r0.xmf
            double r4 = r4 * r2
            double r4 = r4 * r10
            double r4 = r4 * r21
            r1.f36952x = r4
            goto L_0x01e9
        L_0x01c9:
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x01e3
            double r3 = java.lang.Math.sqrt(r12)
            double r13 = r3 * r21
            r1.f36952x = r13
            int r5 = r0.mode
            r2 = 2
            if (r5 != r2) goto L_0x01dd
            goto L_0x01de
        L_0x01dd:
            double r3 = -r3
        L_0x01de:
            double r7 = r7 * r3
            r1.f36953y = r7
            goto L_0x01e9
        L_0x01e3:
            r2 = 0
            r1.f36953y = r2
            r1.f36952x = r2
        L_0x01e9:
            return r1
        L_0x01ea:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.EqualAreaAzimuthalProjection.project(double, double, com.jhlabs.map.Point2D$Double):com.jhlabs.map.Point2D$Double");
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.jhlabs.map.Point2D.Double projectInverse(double r24, double r26, com.jhlabs.map.Point2D.Double r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r3 = r28
            boolean r4 = r0.spherical
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r11 = 1
            r12 = 4
            r14 = 0
            if (r4 == 0) goto L_0x00d1
            double r19 = com.jhlabs.map.MapMath.distance((double) r24, (double) r26)
            double r9 = r9 * r19
            r3.f36953y = r9
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 > 0) goto L_0x00cb
            double r7 = java.lang.Math.asin(r9)
            double r7 = r7 * r5
            r3.f36953y = r7
            int r4 = r0.mode
            if (r4 == r12) goto L_0x0033
            r5 = 3
            if (r4 != r5) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r4 = r14
            r6 = r4
            goto L_0x003d
        L_0x0033:
            double r4 = java.lang.Math.sin(r7)
            double r6 = r3.f36953y
            double r6 = java.lang.Math.cos(r6)
        L_0x003d:
            int r8 = r0.mode
            r9 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            if (r8 == r11) goto L_0x00b0
            r11 = 2
            if (r8 == r11) goto L_0x00a7
            r11 = 3
            if (r8 == r11) goto L_0x0089
            if (r8 == r12) goto L_0x004f
            goto L_0x00ac
        L_0x004f:
            double r8 = java.lang.Math.abs(r19)
            r10 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 > 0) goto L_0x005f
            double r1 = r0.projectionLatitude
            goto L_0x0070
        L_0x005f:
            double r8 = r0.sinphi0
            double r8 = r8 * r6
            double r1 = r1 * r4
            double r10 = r0.cosphi0
            double r1 = r1 * r10
            double r1 = r1 / r19
            double r1 = r1 + r8
            double r1 = java.lang.Math.asin(r1)
        L_0x0070:
            r3.f36953y = r1
            double r8 = r0.cosphi0
            double r4 = r4 * r8
            double r4 = r4 * r24
            double r1 = java.lang.Math.sin(r1)
            double r8 = r0.sinphi0
            double r1 = r1 * r8
            double r6 = r6 - r1
            double r1 = r6 * r19
            r21 = r1
            r1 = r4
            r4 = r21
            goto L_0x00b7
        L_0x0089:
            double r8 = java.lang.Math.abs(r19)
            r10 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 > 0) goto L_0x0098
            r1 = r14
            goto L_0x00a0
        L_0x0098:
            double r1 = r1 * r4
            double r1 = r1 / r19
            double r1 = java.lang.Math.asin(r1)
        L_0x00a0:
            r3.f36953y = r1
            double r1 = r24 * r4
            double r4 = r6 * r19
            goto L_0x00b7
        L_0x00a7:
            double r4 = r3.f36953y
            double r4 = r4 - r9
            r3.f36953y = r4
        L_0x00ac:
            r4 = r1
            r1 = r24
            goto L_0x00b7
        L_0x00b0:
            double r1 = -r1
            double r4 = r3.f36953y
            double r9 = r9 - r4
            r3.f36953y = r9
            goto L_0x00ac
        L_0x00b7:
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x00c3
            int r6 = r0.mode
            r7 = 3
            if (r6 == r7) goto L_0x00c7
            if (r6 != r12) goto L_0x00c3
            goto L_0x00c7
        L_0x00c3:
            double r14 = java.lang.Math.atan2(r1, r4)
        L_0x00c7:
            r3.f36952x = r14
            goto L_0x016a
        L_0x00cb:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            r1.<init>()
            throw r1
        L_0x00d1:
            int r4 = r0.mode
            if (r4 == r11) goto L_0x013d
            r11 = 2
            if (r4 == r11) goto L_0x013e
            r11 = 3
            if (r4 == r11) goto L_0x00e2
            if (r4 == r12) goto L_0x00e2
        L_0x00dd:
            r4 = r1
        L_0x00de:
            r1 = r24
            goto L_0x0158
        L_0x00e2:
            double r7 = r0.f37000dd
            double r12 = r24 / r7
            double r1 = r1 * r7
            double r7 = com.jhlabs.map.MapMath.distance((double) r12, (double) r1)
            r16 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x00fc
            r3.f36952x = r14
            double r1 = r0.projectionLatitude
            r3.f36953y = r1
            return r3
        L_0x00fc:
            double r9 = r9 * r7
            double r14 = r0.f37002rq
            double r9 = r9 / r14
            double r9 = java.lang.Math.asin(r9)
            double r9 = r9 * r5
            double r4 = java.lang.Math.cos(r9)
            double r9 = java.lang.Math.sin(r9)
            double r12 = r12 * r9
            int r6 = r0.mode
            r11 = 4
            if (r6 != r11) goto L_0x0134
            double r14 = r0.sinb1
            double r16 = r4 * r14
            double r18 = r1 * r9
            r24 = r12
            double r11 = r0.cosb1
            double r18 = r18 * r11
            double r18 = r18 / r7
            double r16 = r18 + r16
            double r7 = r7 * r11
            double r7 = r7 * r4
            double r1 = r1 * r14
            double r1 = r1 * r9
            double r1 = r7 - r1
            r4 = r1
            r14 = r16
            goto L_0x00de
        L_0x0134:
            r24 = r12
            double r1 = r1 * r9
            double r14 = r1 / r7
            double r1 = r7 * r4
            goto L_0x00dd
        L_0x013d:
            double r1 = -r1
        L_0x013e:
            double r5 = r24 * r24
            double r9 = r1 * r1
            double r9 = r9 + r5
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x014e
            r3.f36952x = r14
            double r1 = r0.projectionLatitude
            r3.f36953y = r1
            return r3
        L_0x014e:
            double r5 = r0.f37001qp
            double r9 = r9 / r5
            double r14 = r7 - r9
            r5 = 2
            if (r4 != r5) goto L_0x00dd
            double r14 = -r14
            goto L_0x00dd
        L_0x0158:
            double r1 = java.lang.Math.atan2(r1, r4)
            r3.f36952x = r1
            double r1 = java.lang.Math.asin(r14)
            double[] r4 = r0.apa
            double r1 = com.jhlabs.map.MapMath.authlat(r1, r4)
            r3.f36953y = r1
        L_0x016a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.EqualAreaAzimuthalProjection.projectInverse(double, double, com.jhlabs.map.Point2D$Double):com.jhlabs.map.Point2D$Double");
    }

    public String toString() {
        return "Lambert Equal Area Azimuthal";
    }
}
