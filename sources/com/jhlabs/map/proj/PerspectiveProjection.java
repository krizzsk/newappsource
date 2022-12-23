package com.jhlabs.map.proj;

public class PerspectiveProjection extends Projection {
    private static final double EPS10 = 1.0E-10d;
    private static final int EQUIT = 2;
    private static final int N_POLE = 0;
    private static final int OBLIQ = 3;
    private static final int S_POLE = 1;

    /* renamed from: cg */
    private double f37052cg;

    /* renamed from: cw */
    private double f37053cw;

    /* renamed from: h */
    private double f37054h;
    private double height;
    private int mode;

    /* renamed from: p */
    private double f37055p;
    private double pcosph0;
    private double pfact;
    private double pn1;
    private double psinph0;

    /* renamed from: rp */
    private double f37056rp;

    /* renamed from: sg */
    private double f37057sg;

    /* renamed from: sw */
    private double f37058sw;
    private int tilt;

    public boolean hasInverse() {
        return false;
    }

    public void initialize() {
        super.initialize();
        this.mode = 2;
        double d = this.f37060a;
        this.height = d;
        this.tilt = 0;
        double d2 = d / d;
        this.pn1 = d2;
        double d3 = d2 + 1.0d;
        this.f37055p = d3;
        this.f37056rp = 1.0d / d3;
        double d4 = 1.0d / d2;
        this.f37054h = d4;
        this.pfact = (d3 + 1.0d) * d4;
        this.f37062es = 0.0d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.jhlabs.map.Point2D.Double project(double r19, double r21, com.jhlabs.map.Point2D.Double r23) {
        /*
            r18 = this;
            r0 = r18
            r1 = r23
            double r2 = java.lang.Math.sin(r21)
            double r4 = java.lang.Math.cos(r21)
            double r6 = java.lang.Math.cos(r19)
            int r8 = r0.mode
            r9 = 3
            r10 = 2
            r11 = 1
            if (r8 == 0) goto L_0x0035
            if (r8 == r11) goto L_0x0031
            if (r8 == r10) goto L_0x002c
            if (r8 == r9) goto L_0x001e
            goto L_0x0037
        L_0x001e:
            double r12 = r0.psinph0
            double r12 = r12 * r2
            double r14 = r0.pcosph0
            double r14 = r14 * r4
            double r14 = r14 * r6
            double r14 = r14 + r12
            r1.f36953y = r14
            goto L_0x0037
        L_0x002c:
            double r12 = r4 * r6
            r1.f36953y = r12
            goto L_0x0037
        L_0x0031:
            double r12 = -r2
            r1.f36953y = r12
            goto L_0x0037
        L_0x0035:
            r1.f36953y = r2
        L_0x0037:
            double r12 = r0.pn1
            double r14 = r0.f37055p
            double r9 = r1.f36953y
            double r14 = r14 - r9
            double r12 = r12 / r14
            r1.f36953y = r12
            double r12 = r12 * r4
            double r8 = java.lang.Math.sin(r19)
            double r8 = r8 * r12
            r1.f36952x = r8
            int r10 = r0.mode
            if (r10 == 0) goto L_0x0071
            if (r10 == r11) goto L_0x0072
            r11 = 2
            if (r10 == r11) goto L_0x006a
            r11 = 3
            if (r10 == r11) goto L_0x0058
            goto L_0x007a
        L_0x0058:
            double r10 = r1.f36953y
            double r12 = r0.pcosph0
            double r12 = r12 * r2
            double r2 = r0.psinph0
            double r2 = r2 * r4
            double r2 = r2 * r6
            double r12 = r12 - r2
            double r12 = r12 * r10
            r1.f36953y = r12
            goto L_0x007a
        L_0x006a:
            double r4 = r1.f36953y
            double r4 = r4 * r2
            r1.f36953y = r4
            goto L_0x007a
        L_0x0071:
            double r6 = -r6
        L_0x0072:
            double r2 = r1.f36953y
            double r4 = r4 * r6
            double r4 = r4 * r2
            r1.f36953y = r4
        L_0x007a:
            int r2 = r0.tilt
            if (r2 == 0) goto L_0x00a7
            double r2 = r1.f36953y
            double r4 = r0.f37052cg
            double r6 = r2 * r4
            double r10 = r0.f37057sg
            double r12 = r8 * r10
            double r12 = r12 + r6
            double r14 = r0.f37058sw
            double r14 = r14 * r12
            double r6 = r0.f37054h
            double r14 = r14 * r6
            double r6 = r0.f37053cw
            double r14 = r14 + r6
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r16 / r14
            double r8 = r8 * r4
            double r2 = r2 * r10
            double r8 = r8 - r2
            double r8 = r8 * r6
            double r8 = r8 * r14
            r1.f36952x = r8
            double r12 = r12 * r14
            r1.f36953y = r12
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.PerspectiveProjection.project(double, double, com.jhlabs.map.Point2D$Double):com.jhlabs.map.Point2D$Double");
    }

    public String toString() {
        return "Perspective";
    }
}
