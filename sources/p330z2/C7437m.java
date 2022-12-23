package p330z2;

/* renamed from: z2.m */
public final class C7437m extends C7452z {

    /* renamed from: c */
    public int f22841c = 80;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (r6 != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (r6 != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a8, code lost:
        r8 = 5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0100  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo23645q(android.view.ViewGroup r19, androidx.transition.Transition r20, p330z2.C7441q r21, p330z2.C7441q r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 0
            if (r2 != 0) goto L_0x000d
            if (r22 != 0) goto L_0x000d
            return r3
        L_0x000d:
            androidx.transition.Transition$c r5 = r1.f4961u
            if (r5 != 0) goto L_0x0013
            r5 = 0
            goto L_0x0017
        L_0x0013:
            android.graphics.Rect r5 = r5.mo5431a()
        L_0x0017:
            r6 = 1
            if (r22 == 0) goto L_0x0037
            r7 = 8
            if (r2 != 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            java.util.HashMap r8 = r2.f22854a
            java.lang.String r9 = "android:visibilityPropagation:visibility"
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r7 = r8.intValue()
        L_0x0030:
            if (r7 != 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            r2 = r22
            r7 = 1
            goto L_0x0038
        L_0x0037:
            r7 = -1
        L_0x0038:
            r8 = 0
            int r9 = p330z2.C7452z.m17099w(r2, r8)
            int r2 = p330z2.C7452z.m17099w(r2, r6)
            r10 = 2
            int[] r11 = new int[r10]
            r12 = r19
            r12.getLocationOnScreen(r11)
            r13 = r11[r8]
            float r14 = r19.getTranslationX()
            int r14 = java.lang.Math.round(r14)
            int r14 = r14 + r13
            r11 = r11[r6]
            float r13 = r19.getTranslationY()
            int r13 = java.lang.Math.round(r13)
            int r13 = r13 + r11
            int r11 = r19.getWidth()
            int r11 = r11 + r14
            int r15 = r19.getHeight()
            int r15 = r15 + r13
            if (r5 == 0) goto L_0x0074
            int r10 = r5.centerX()
            int r5 = r5.centerY()
            goto L_0x0080
        L_0x0074:
            int r5 = r14 + r11
            int r5 = r5 / r10
            int r16 = r13 + r15
            int r10 = r16 / 2
            r17 = r10
            r10 = r5
            r5 = r17
        L_0x0080:
            int r8 = r0.f22841c
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3 = 3
            if (r8 != r4) goto L_0x0095
            java.util.WeakHashMap<android.view.View, s1.p0> r8 = p242s1.C6333d0.f19990a
            int r8 = p242s1.C6333d0.C6338e.m15063d(r19)
            if (r8 != r6) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r6 = 0
        L_0x0092:
            if (r6 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x0095:
            r4 = 8388613(0x800005, float:1.175495E-38)
            if (r8 != r4) goto L_0x00a9
            java.util.WeakHashMap<android.view.View, s1.p0> r4 = p242s1.C6333d0.f19990a
            int r4 = p242s1.C6333d0.C6338e.m15063d(r19)
            if (r4 != r6) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r6 = 0
        L_0x00a4:
            if (r6 == 0) goto L_0x00a8
        L_0x00a6:
            r8 = 3
            goto L_0x00a9
        L_0x00a8:
            r8 = 5
        L_0x00a9:
            if (r8 == r3) goto L_0x00d3
            r4 = 5
            if (r8 == r4) goto L_0x00ca
            r4 = 48
            if (r8 == r4) goto L_0x00c1
            r4 = 80
            if (r8 == r4) goto L_0x00b8
            r8 = 0
            goto L_0x00db
        L_0x00b8:
            int r2 = r2 - r13
            int r10 = r10 - r9
            int r4 = java.lang.Math.abs(r10)
            int r8 = r4 + r2
            goto L_0x00db
        L_0x00c1:
            int r15 = r15 - r2
            int r10 = r10 - r9
            int r2 = java.lang.Math.abs(r10)
            int r8 = r2 + r15
            goto L_0x00db
        L_0x00ca:
            int r9 = r9 - r14
            int r5 = r5 - r2
            int r2 = java.lang.Math.abs(r5)
            int r8 = r2 + r9
            goto L_0x00db
        L_0x00d3:
            int r11 = r11 - r9
            int r5 = r5 - r2
            int r2 = java.lang.Math.abs(r5)
            int r8 = r2 + r11
        L_0x00db:
            float r2 = (float) r8
            int r4 = r0.f22841c
            if (r4 == r3) goto L_0x00f2
            r3 = 5
            if (r4 == r3) goto L_0x00f2
            r3 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 == r3) goto L_0x00f2
            r3 = 8388613(0x800005, float:1.175495E-38)
            if (r4 == r3) goto L_0x00f2
            int r3 = r19.getHeight()
            goto L_0x00f6
        L_0x00f2:
            int r3 = r19.getWidth()
        L_0x00f6:
            float r3 = (float) r3
            float r2 = r2 / r3
            long r3 = r1.f4944d
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0102
            r3 = 300(0x12c, double:1.48E-321)
        L_0x0102:
            long r5 = (long) r7
            long r3 = r3 * r5
            float r1 = (float) r3
            r3 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r3
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            long r1 = (long) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p330z2.C7437m.mo23645q(android.view.ViewGroup, androidx.transition.Transition, z2.q, z2.q):long");
    }
}
