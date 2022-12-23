package com.jhlabs.map.proj;

import com.jhlabs.map.MapMath;
import com.jhlabs.map.Point2D;

public class AlbersProjection extends Projection {
    private static final double EPS10 = 1.0E-10d;
    private static final double EPSILON = 1.0E-7d;
    private static final int N_ITER = 15;
    private static final double TOL = 1.0E-10d;
    private static final double TOL7 = 1.0E-7d;

    /* renamed from: c */
    private double f36959c;

    /* renamed from: dd */
    private double f36960dd;

    /* renamed from: ec */
    private double f36961ec;

    /* renamed from: en */
    private double[] f36962en;

    /* renamed from: n */
    private double f36963n;

    /* renamed from: n2 */
    private double f36964n2;
    private double phi1;
    private double phi2;
    public double projectionLatitude1 = MapMath.degToRad(45.5d);
    public double projectionLatitude2 = MapMath.degToRad(29.5d);
    private double rho0;

    public AlbersProjection() {
        this.minLatitude = Math.toRadians(0.0d);
        this.maxLatitude = Math.toRadians(80.0d);
        initialize();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0051 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double phi1_(double r17, double r19, double r21) {
        /*
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r17 * r0
            double r2 = java.lang.Math.asin(r2)
            r4 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r6 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0012
            return r2
        L_0x0012:
            r4 = 15
        L_0x0014:
            double r5 = java.lang.Math.sin(r2)
            double r7 = java.lang.Math.cos(r2)
            double r9 = r19 * r5
            double r11 = r9 * r9
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r13 - r11
            double r15 = r11 * r0
            double r15 = r15 * r11
            double r15 = r15 / r7
            double r7 = r17 / r21
            double r5 = r5 / r11
            double r7 = r7 - r5
            double r5 = r0 / r19
            double r11 = r13 - r9
            double r9 = r9 + r13
            double r11 = r11 / r9
            double r9 = java.lang.Math.log(r11)
            double r9 = r9 * r5
            double r9 = r9 + r7
            double r9 = r9 * r15
            double r2 = r2 + r9
            double r5 = java.lang.Math.abs(r9)
            r7 = 4457293557087583675(0x3ddb7cdfd9d7bdbb, double:1.0E-10)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x004e
            int r4 = r4 + -1
            if (r4 != 0) goto L_0x0014
        L_0x004e:
            if (r4 == 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.AlbersProjection.phi1_(double, double, double):double");
    }

    public int getEPSGCode() {
        return 9822;
    }

    public boolean hasInverse() {
        return true;
    }

    public void initialize() {
        boolean z;
        super.initialize();
        double d = this.projectionLatitude1;
        this.phi1 = d;
        double d2 = this.projectionLatitude2;
        this.phi2 = d2;
        if (Math.abs(d + d2) >= 1.0E-10d) {
            double sin = Math.sin(this.phi1);
            this.f36963n = sin;
            double cos = Math.cos(this.phi1);
            boolean z2 = true;
            if (Math.abs(this.phi1 - this.phi2) >= 1.0E-10d) {
                z = true;
            } else {
                z = false;
            }
            double d3 = this.f37062es;
            if (d3 <= 0.0d) {
                z2 = false;
            }
            this.spherical = z2;
            if (!z2) {
                double[] enfn = MapMath.enfn(d3);
                this.f36962en = enfn;
                if (enfn != null) {
                    double d4 = sin;
                    double msfn = MapMath.msfn(d4, cos, this.f37062es);
                    double qsfn = MapMath.qsfn(d4, this.f37061e, this.one_es);
                    if (z) {
                        double sin2 = Math.sin(this.phi2);
                        double msfn2 = MapMath.msfn(sin2, Math.cos(this.phi2), this.f37062es);
                        this.f36963n = ((msfn * msfn) - (msfn2 * msfn2)) / (MapMath.qsfn(sin2, this.f37061e, this.one_es) - qsfn);
                    }
                    double d5 = this.f37061e;
                    this.f36961ec = 1.0d - ((Math.log((1.0d - d5) / (d5 + 1.0d)) * (this.one_es * 0.5d)) / this.f37061e);
                    double d6 = this.f36963n;
                    double d7 = (qsfn * d6) + (msfn * msfn);
                    this.f36959c = d7;
                    double d8 = 1.0d / d6;
                    this.f36960dd = d8;
                    this.rho0 = Math.sqrt(d7 - (d6 * MapMath.qsfn(Math.sin(this.projectionLatitude), this.f37061e, this.one_es))) * d8;
                    return;
                }
                throw new IllegalArgumentException("0");
            }
            if (z) {
                this.f36963n = (Math.sin(this.phi2) + this.f36963n) * 0.5d;
            }
            double d9 = this.f36963n;
            double d11 = d9 + d9;
            this.f36964n2 = d11;
            double d12 = (sin * d11) + (cos * cos);
            this.f36959c = d12;
            double d13 = 1.0d / d9;
            this.f36960dd = d13;
            this.rho0 = Math.sqrt(d12 - (Math.sin(this.projectionLatitude) * d11)) * d13;
            return;
        }
        throw new IllegalArgumentException("-21");
    }

    public boolean isEqualArea() {
        return true;
    }

    public Point2D.Double project(double d, double d2, Point2D.Double doubleR) {
        double d3;
        double d4 = this.f36959c;
        if (!this.spherical) {
            d3 = this.f36963n * MapMath.qsfn(Math.sin(d2), this.f37061e, this.one_es);
        } else {
            d3 = this.f36964n2 * Math.sin(d2);
        }
        double d5 = d4 - d3;
        if (d5 >= 0.0d) {
            double sqrt = Math.sqrt(d5) * this.f36960dd;
            double d6 = d * this.f36963n;
            doubleR.f36952x = Math.sin(d6) * sqrt;
            doubleR.f36953y = this.rho0 - (Math.cos(d6) * sqrt);
            return doubleR;
        }
        throw new ProjectionException("F");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        if (r16 < 0.0d) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        if (r6 < 0.0d) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        r8 = 1.5707963267948966d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.jhlabs.map.Point2D.Double projectInverse(double r23, double r25, com.jhlabs.map.Point2D.Double r27) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r27
            double r4 = r0.rho0
            double r4 = r4 - r25
            double r6 = com.jhlabs.map.MapMath.distance((double) r1, (double) r4)
            r10 = -4613618979930100456(0xbff921fb54442d18, double:-1.5707963267948966)
            r12 = 0
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0098
            double r14 = r0.f36963n
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 >= 0) goto L_0x0022
            double r6 = -r6
            double r1 = -r1
            double r4 = -r4
        L_0x0022:
            double r8 = r0.f36960dd
            double r6 = r6 / r8
            boolean r8 = r0.spherical
            if (r8 != 0) goto L_0x0067
            double r8 = r0.f36959c
            double r6 = r6 * r6
            double r8 = r8 - r6
            double r16 = r8 / r14
            double r6 = r0.f36961ec
            double r8 = java.lang.Math.abs(r16)
            double r6 = r6 - r8
            double r6 = java.lang.Math.abs(r6)
            r8 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x0062
            double r6 = r0.f37061e
            double r8 = r0.one_es
            r18 = r6
            r20 = r8
            double r6 = phi1_(r16, r18, r20)
            r8 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x005a
            goto L_0x008c
        L_0x005a:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            java.lang.String r2 = "I"
            r1.<init>(r2)
            throw r1
        L_0x0062:
            int r6 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x0086
            goto L_0x0084
        L_0x0067:
            double r8 = r0.f36959c
            double r14 = r6 * r6
            double r8 = r8 - r14
            double r14 = r0.f36964n2
            double r8 = r8 / r14
            r3.f36953y = r8
            double r8 = java.lang.Math.abs(r8)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0080
            double r6 = java.lang.Math.asin(r6)
            goto L_0x008c
        L_0x0080:
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0086
        L_0x0084:
            r8 = r10
            goto L_0x008b
        L_0x0086:
            r8 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
        L_0x008b:
            r6 = r8
        L_0x008c:
            double r1 = java.lang.Math.atan2(r1, r4)
            double r4 = r0.f36963n
            double r1 = r1 / r4
            r3.f36952x = r1
            r3.f36953y = r6
            goto L_0x00a9
        L_0x0098:
            r3.f36952x = r12
            double r1 = r0.f36963n
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a6
            r8 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            goto L_0x00a7
        L_0x00a6:
            r8 = r10
        L_0x00a7:
            r3.f36953y = r8
        L_0x00a9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.AlbersProjection.projectInverse(double, double, com.jhlabs.map.Point2D$Double):com.jhlabs.map.Point2D$Double");
    }

    public String toString() {
        return "Albers Equal Area";
    }
}
