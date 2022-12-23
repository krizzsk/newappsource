package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.c */
public final class C0691c extends WidgetRun {

    /* renamed from: k */
    public static int[] f2488k = new int[2];

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.c$a */
    public static /* synthetic */ class C0692a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2489a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2489a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2489a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2489a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0691c.C0692a.<clinit>():void");
        }
    }

    public C0691c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f2483h.f2468e = DependencyNode.Type.LEFT;
        this.f2484i.f2468e = DependencyNode.Type.RIGHT;
        this.f2481f = 0;
    }

    /* renamed from: m */
    public static void m2036m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x027a, code lost:
        if (r12 != 1) goto L_0x02dc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2815a(p305x0.C7133d r20) {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = androidx.constraintlayout.core.widgets.analyzer.C0691c.C0692a.f2489a
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r2 = r0.f2485j
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x03fa
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            boolean r4 = r1.f2473j
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            if (r4 != 0) goto L_0x02dc
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r0.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r7) goto L_0x02dc
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f2477b
            int r7 = r4.f2446s
            r8 = 2
            if (r7 == r8) goto L_0x02c4
            if (r7 == r3) goto L_0x002a
            goto L_0x02dc
        L_0x002a:
            int r7 = r4.f2448t
            r8 = -1
            if (r7 == 0) goto L_0x0063
            if (r7 != r3) goto L_0x0032
            goto L_0x0063
        L_0x0032:
            int r3 = r4.f2411a0
            if (r3 == r8) goto L_0x0051
            if (r3 == 0) goto L_0x0046
            if (r3 == r6) goto L_0x003c
            r3 = 0
            goto L_0x005e
        L_0x003c:
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r4.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r3 = r3.f2470g
            float r3 = (float) r3
            float r4 = r4.f2409Z
            goto L_0x005a
        L_0x0046:
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r4.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r3 = r3.f2470g
            float r3 = (float) r3
            float r4 = r4.f2409Z
            float r3 = r3 / r4
            goto L_0x005c
        L_0x0051:
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r4.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            int r3 = r3.f2470g
            float r3 = (float) r3
            float r4 = r4.f2409Z
        L_0x005a:
            float r3 = r3 * r4
        L_0x005c:
            float r3 = r3 + r5
            int r3 = (int) r3
        L_0x005e:
            r1.mo2818d(r3)
            goto L_0x02dc
        L_0x0063:
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r4.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r1.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2484i
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r4.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.f2379f
            if (r7 == 0) goto L_0x0071
            r7 = 1
            goto L_0x0072
        L_0x0071:
            r7 = 0
        L_0x0072:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r4.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f2379f
            if (r9 == 0) goto L_0x007a
            r9 = 1
            goto L_0x007b
        L_0x007a:
            r9 = 0
        L_0x007b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r4.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.f2379f
            if (r10 == 0) goto L_0x0083
            r10 = 1
            goto L_0x0084
        L_0x0083:
            r10 = 0
        L_0x0084:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r4.f2397N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r11.f2379f
            if (r11 == 0) goto L_0x008c
            r11 = 1
            goto L_0x008d
        L_0x008c:
            r11 = 0
        L_0x008d:
            int r15 = r4.f2411a0
            if (r7 == 0) goto L_0x01c8
            if (r9 == 0) goto L_0x01c8
            if (r10 == 0) goto L_0x01c8
            if (r11 == 0) goto L_0x01c8
            float r4 = r4.f2409Z
            boolean r7 = r3.f2473j
            if (r7 == 0) goto L_0x00fa
            boolean r7 = r1.f2473j
            if (r7 == 0) goto L_0x00fa
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r0.f2483h
            boolean r7 = r5.f2466c
            if (r7 == 0) goto L_0x00f9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f2484i
            boolean r7 = r7.f2466c
            if (r7 != 0) goto L_0x00ae
            goto L_0x00f9
        L_0x00ae:
            java.util.ArrayList r5 = r5.f2475l
            java.lang.Object r5 = r5.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r5
            int r5 = r5.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f2483h
            int r7 = r7.f2469f
            int r13 = r5 + r7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r0.f2484i
            java.util.ArrayList r5 = r5.f2475l
            java.lang.Object r5 = r5.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r5
            int r5 = r5.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f2484i
            int r7 = r7.f2469f
            int r14 = r5 - r7
            int r5 = r3.f2470g
            int r3 = r3.f2469f
            int r3 = r3 + r5
            int r5 = r1.f2470g
            int r1 = r1.f2469f
            int r16 = r5 - r1
            int[] r1 = f2488k
            r12 = r1
            r7 = r15
            r15 = r3
            r17 = r4
            r18 = r7
            m2036m(r12, r13, r14, r15, r16, r17, r18)
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r0.f2480e
            r2 = r1[r2]
            r3.mo2818d(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r2 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r2.f2480e
            r1 = r1[r6]
            r2.mo2818d(r1)
        L_0x00f9:
            return
        L_0x00fa:
            r7 = r15
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r0.f2483h
            boolean r9 = r8.f2473j
            if (r9 == 0) goto L_0x0156
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r0.f2484i
            boolean r10 = r9.f2473j
            if (r10 == 0) goto L_0x0156
            boolean r10 = r3.f2466c
            if (r10 == 0) goto L_0x0155
            boolean r10 = r1.f2466c
            if (r10 != 0) goto L_0x0110
            goto L_0x0155
        L_0x0110:
            int r10 = r8.f2470g
            int r8 = r8.f2469f
            int r13 = r10 + r8
            int r8 = r9.f2470g
            int r9 = r9.f2469f
            int r14 = r8 - r9
            java.util.ArrayList r8 = r3.f2475l
            java.lang.Object r8 = r8.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f2470g
            int r9 = r3.f2469f
            int r15 = r8 + r9
            java.util.ArrayList r8 = r1.f2475l
            java.lang.Object r8 = r8.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f2470g
            int r9 = r1.f2469f
            int r16 = r8 - r9
            int[] r8 = f2488k
            r12 = r8
            r17 = r4
            r18 = r7
            m2036m(r12, r13, r14, r15, r16, r17, r18)
            androidx.constraintlayout.core.widgets.analyzer.a r9 = r0.f2480e
            r10 = r8[r2]
            r9.mo2818d(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r0.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r9 = r9.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r9 = r9.f2480e
            r8 = r8[r6]
            r9.mo2818d(r8)
            goto L_0x0156
        L_0x0155:
            return
        L_0x0156:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r0.f2483h
            boolean r9 = r8.f2466c
            if (r9 == 0) goto L_0x01c7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r0.f2484i
            boolean r9 = r9.f2466c
            if (r9 == 0) goto L_0x01c7
            boolean r9 = r3.f2466c
            if (r9 == 0) goto L_0x01c7
            boolean r9 = r1.f2466c
            if (r9 != 0) goto L_0x016b
            goto L_0x01c7
        L_0x016b:
            java.util.ArrayList r8 = r8.f2475l
            java.lang.Object r8 = r8.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r0.f2483h
            int r9 = r9.f2469f
            int r13 = r8 + r9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r0.f2484i
            java.util.ArrayList r8 = r8.f2475l
            java.lang.Object r8 = r8.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r0.f2484i
            int r9 = r9.f2469f
            int r14 = r8 - r9
            java.util.ArrayList r8 = r3.f2475l
            java.lang.Object r8 = r8.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r8
            int r8 = r8.f2470g
            int r3 = r3.f2469f
            int r15 = r8 + r3
            java.util.ArrayList r3 = r1.f2475l
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            int r3 = r3.f2470g
            int r1 = r1.f2469f
            int r16 = r3 - r1
            int[] r1 = f2488k
            r12 = r1
            r17 = r4
            r18 = r7
            m2036m(r12, r13, r14, r15, r16, r17, r18)
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r0.f2480e
            r4 = r1[r2]
            r3.mo2818d(r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r3.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            r1 = r1[r6]
            r3.mo2818d(r1)
            goto L_0x02dc
        L_0x01c7:
            return
        L_0x01c8:
            r12 = r15
            if (r7 == 0) goto L_0x024d
            if (r10 == 0) goto L_0x024d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            boolean r3 = r1.f2466c
            if (r3 == 0) goto L_0x024c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.f2484i
            boolean r3 = r3.f2466c
            if (r3 != 0) goto L_0x01da
            goto L_0x024c
        L_0x01da:
            float r3 = r4.f2409Z
            java.util.ArrayList r1 = r1.f2475l
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            int r1 = r1.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f2483h
            int r4 = r4.f2469f
            int r1 = r1 + r4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f2484i
            java.util.ArrayList r4 = r4.f2475l
            java.lang.Object r4 = r4.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r4
            int r4 = r4.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f2484i
            int r7 = r7.f2469f
            int r4 = r4 - r7
            if (r12 == r8) goto L_0x0228
            if (r12 == 0) goto L_0x0228
            if (r12 == r6) goto L_0x0204
            goto L_0x02dc
        L_0x0204:
            int r4 = r4 - r1
            int r1 = r0.mo2824g(r4, r2)
            float r4 = (float) r1
            float r4 = r4 / r3
            float r4 = r4 + r5
            int r4 = (int) r4
            int r7 = r0.mo2824g(r4, r6)
            if (r4 == r7) goto L_0x0218
            float r1 = (float) r7
            float r1 = r1 * r3
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x0218:
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r0.f2480e
            r3.mo2818d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2480e
            r1.mo2818d(r7)
            goto L_0x02dc
        L_0x0228:
            int r4 = r4 - r1
            int r1 = r0.mo2824g(r4, r2)
            float r4 = (float) r1
            float r4 = r4 * r3
            float r4 = r4 + r5
            int r4 = (int) r4
            int r7 = r0.mo2824g(r4, r6)
            if (r4 == r7) goto L_0x023c
            float r1 = (float) r7
            float r1 = r1 / r3
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x023c:
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r0.f2480e
            r3.mo2818d(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2480e
            r1.mo2818d(r7)
            goto L_0x02dc
        L_0x024c:
            return
        L_0x024d:
            if (r9 == 0) goto L_0x02dc
            if (r11 == 0) goto L_0x02dc
            boolean r7 = r3.f2466c
            if (r7 == 0) goto L_0x02c3
            boolean r7 = r1.f2466c
            if (r7 != 0) goto L_0x025a
            goto L_0x02c3
        L_0x025a:
            float r4 = r4.f2409Z
            java.util.ArrayList r7 = r3.f2475l
            java.lang.Object r7 = r7.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r7
            int r7 = r7.f2470g
            int r3 = r3.f2469f
            int r7 = r7 + r3
            java.util.ArrayList r3 = r1.f2475l
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            int r3 = r3.f2470g
            int r1 = r1.f2469f
            int r3 = r3 - r1
            if (r12 == r8) goto L_0x02a0
            if (r12 == 0) goto L_0x027d
            if (r12 == r6) goto L_0x02a0
            goto L_0x02dc
        L_0x027d:
            int r3 = r3 - r7
            int r1 = r0.mo2824g(r3, r6)
            float r3 = (float) r1
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            int r7 = r0.mo2824g(r3, r2)
            if (r3 == r7) goto L_0x0291
            float r1 = (float) r7
            float r1 = r1 / r4
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x0291:
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r0.f2480e
            r3.mo2818d(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r3.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            r3.mo2818d(r1)
            goto L_0x02dc
        L_0x02a0:
            int r3 = r3 - r7
            int r1 = r0.mo2824g(r3, r6)
            float r3 = (float) r1
            float r3 = r3 / r4
            float r3 = r3 + r5
            int r3 = (int) r3
            int r7 = r0.mo2824g(r3, r2)
            if (r3 == r7) goto L_0x02b4
            float r1 = (float) r7
            float r1 = r1 * r4
            float r1 = r1 + r5
            int r1 = (int) r1
        L_0x02b4:
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r0.f2480e
            r3.mo2818d(r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r3.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            r3.mo2818d(r1)
            goto L_0x02dc
        L_0x02c3:
            return
        L_0x02c4:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r4.f2406W
            if (r3 == 0) goto L_0x02dc
            androidx.constraintlayout.core.widgets.analyzer.c r3 = r3.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r3.f2480e
            boolean r7 = r3.f2473j
            if (r7 == 0) goto L_0x02dc
            float r4 = r4.f2455x
            int r3 = r3.f2470g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            r1.mo2818d(r3)
        L_0x02dc:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            boolean r3 = r1.f2466c
            if (r3 == 0) goto L_0x03f9
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.f2484i
            boolean r4 = r3.f2466c
            if (r4 != 0) goto L_0x02ea
            goto L_0x03f9
        L_0x02ea:
            boolean r1 = r1.f2473j
            if (r1 == 0) goto L_0x02f9
            boolean r1 = r3.f2473j
            if (r1 == 0) goto L_0x02f9
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            boolean r1 = r1.f2473j
            if (r1 == 0) goto L_0x02f9
            return
        L_0x02f9:
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            boolean r1 = r1.f2473j
            if (r1 != 0) goto L_0x0343
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x0343
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2477b
            int r3 = r1.f2446s
            if (r3 != 0) goto L_0x0343
            boolean r1 = r1.mo2774B()
            if (r1 != 0) goto L_0x0343
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            java.util.ArrayList r1 = r1.f2475l
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.f2484i
            java.util.ArrayList r3 = r3.f2475l
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r1 = r1.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.f2483h
            int r4 = r3.f2469f
            int r1 = r1 + r4
            int r2 = r2.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f2484i
            int r4 = r4.f2469f
            int r2 = r2 + r4
            int r4 = r2 - r1
            r3.mo2818d(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2484i
            r1.mo2818d(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            r1.mo2818d(r4)
            return
        L_0x0343:
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            boolean r1 = r1.f2473j
            if (r1 != 0) goto L_0x03a7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r0.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L_0x03a7
            int r1 = r0.f2476a
            if (r1 != r6) goto L_0x03a7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            java.util.ArrayList r1 = r1.f2475l
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03a7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2484i
            java.util.ArrayList r1 = r1.f2475l
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03a7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            java.util.ArrayList r1 = r1.f2475l
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.f2484i
            java.util.ArrayList r3 = r3.f2475l
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            int r1 = r1.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f2483h
            int r4 = r4.f2469f
            int r1 = r1 + r4
            int r3 = r3.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f2484i
            int r4 = r4.f2469f
            int r3 = r3 + r4
            int r3 = r3 - r1
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            int r1 = r1.f2487m
            int r1 = java.lang.Math.min(r3, r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2477b
            int r4 = r3.f2454w
            int r3 = r3.f2452v
            int r1 = java.lang.Math.max(r3, r1)
            if (r4 <= 0) goto L_0x03a2
            int r1 = java.lang.Math.min(r4, r1)
        L_0x03a2:
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r0.f2480e
            r3.mo2818d(r1)
        L_0x03a7:
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            boolean r1 = r1.f2473j
            if (r1 != 0) goto L_0x03ae
            return
        L_0x03ae:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            java.util.ArrayList r1 = r1.f2475l
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.f2484i
            java.util.ArrayList r3 = r3.f2475l
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r2
            int r3 = r1.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r0.f2483h
            int r6 = r4.f2469f
            int r6 = r6 + r3
            int r7 = r2.f2470g
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r0.f2484i
            int r8 = r8.f2469f
            int r8 = r8 + r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r0.f2477b
            float r9 = r9.f2423g0
            if (r1 != r2) goto L_0x03d9
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x03db
        L_0x03d9:
            r3 = r6
            r7 = r8
        L_0x03db:
            int r7 = r7 - r3
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            int r1 = r1.f2470g
            int r7 = r7 - r1
            float r1 = (float) r3
            float r1 = r1 + r5
            float r2 = (float) r7
            float r2 = r2 * r9
            float r2 = r2 + r1
            int r1 = (int) r2
            r4.mo2818d(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.f2483h
            int r2 = r2.f2470g
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r0.f2480e
            int r3 = r3.f2470g
            int r2 = r2 + r3
            r1.mo2818d(r2)
        L_0x03f9:
            return
        L_0x03fa:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2396M
            r0.mo2827l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0691c.mo2815a(x0.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r0 = r8.f2477b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2821d() {
        /*
            r8 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            boolean r1 = r0.f2410a
            if (r1 == 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            int r0 = r0.mo2807u()
            r1.mo2818d(r0)
        L_0x000f:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            boolean r1 = r0.f2473j
            r2 = 0
            if (r1 != 0) goto L_0x007f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r1.f2405V
            r3 = r3[r2]
            r8.f2479d = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 == r4) goto L_0x00b7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r3 != r4) goto L_0x0073
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r1.f2406W
            if (r5 == 0) goto L_0x0073
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = r5.f2405V
            r6 = r6[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r6 == r7) goto L_0x0034
            if (r6 != r4) goto L_0x0073
        L_0x0034:
            int r0 = r5.mo2807u()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2394K
            int r1 = r1.mo2764e()
            int r0 = r0 - r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2396M
            int r1 = r1.mo2764e()
            int r0 = r0 - r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.analyzer.c r2 = r5.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2394K
            int r3 = r3.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2484i
            androidx.constraintlayout.core.widgets.analyzer.c r2 = r5.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2396M
            int r3 = r3.mo2764e()
            int r3 = -r3
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r1.mo2818d(r0)
            return
        L_0x0073:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r4) goto L_0x00b7
            int r1 = r1.mo2807u()
            r0.mo2818d(r1)
            goto L_0x00b7
        L_0x007f:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r8.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r1) goto L_0x00b7
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2406W
            if (r3 == 0) goto L_0x00b7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r3.f2405V
            r4 = r4[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r4 == r5) goto L_0x0095
            if (r4 != r1) goto L_0x00b7
        L_0x0095:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.analyzer.c r2 = r3.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.f2483h
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2394K
            int r0 = r0.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r2, r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            androidx.constraintlayout.core.widgets.analyzer.c r1 = r3.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2396M
            int r2 = r2.mo2764e()
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            return
        L_0x00b7:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            boolean r1 = r0.f2473j
            r3 = 1
            if (r1 == 0) goto L_0x01b6
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            boolean r4 = r1.f2410a
            if (r4 == 0) goto L_0x01b6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r1.f2402S
            r4 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.f2379f
            if (r5 == 0) goto L_0x0138
            r6 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f2379f
            if (r6 == 0) goto L_0x0138
            boolean r0 = r1.mo2774B()
            if (r0 == 0) goto L_0x00f7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.f2402S
            r1 = r1[r2]
            int r1 = r1.mo2764e()
            r0.f2469f = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.f2402S
            r1 = r1[r3]
            int r1 = r1.mo2764e()
            int r1 = -r1
            r0.f2469f = r1
            goto L_0x03a5
        L_0x00f7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.f2402S
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r0)
            if (r0 == 0) goto L_0x0112
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r4.f2402S
            r2 = r4[r2]
            int r2 = r2.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r2)
        L_0x0112:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.f2402S
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r0)
            if (r0 == 0) goto L_0x012e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.f2402S
            r2 = r2[r3]
            int r2 = r2.mo2764e()
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r2)
        L_0x012e:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2483h
            r0.f2465b = r3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            r0.f2465b = r3
            goto L_0x03a5
        L_0x0138:
            if (r5 == 0) goto L_0x015c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r4)
            if (r0 == 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.f2402S
            r2 = r3[r2]
            int r2 = r2.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r8.f2480e
            int r2 = r2.f2470g
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            goto L_0x03a5
        L_0x015c:
            r0 = r0[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.f2379f
            if (r2 == 0) goto L_0x0186
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r0)
            if (r0 == 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.f2402S
            r2 = r2[r3]
            int r2 = r2.mo2764e()
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2484i
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r8.f2480e
            int r2 = r2.f2470g
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            goto L_0x03a5
        L_0x0186:
            boolean r0 = r1 instanceof p292w0.C6960a
            if (r0 != 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.f2406W
            if (r0 == 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mo2800m(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2379f
            if (r0 != 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2406W
            androidx.constraintlayout.core.widgets.analyzer.c r1 = r1.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f2483h
            int r0 = r0.mo2808v()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r2, r1, r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r8.f2480e
            int r2 = r2.f2470g
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            goto L_0x03a5
        L_0x01b6:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r8.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r4) goto L_0x02e7
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            int r4 = r1.f2446s
            r5 = 2
            if (r4 == r5) goto L_0x02be
            r5 = 3
            if (r4 == r5) goto L_0x01c8
            goto L_0x02e7
        L_0x01c8:
            int r4 = r1.f2448t
            if (r4 != r5) goto L_0x026d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f2483h
            r4.f2464a = r8
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r8.f2484i
            r4.f2464a = r8
            androidx.constraintlayout.core.widgets.analyzer.d r4 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r4.f2483h
            r5.f2464a = r8
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r4.f2484i
            r4.f2464a = r8
            r0.f2464a = r8
            boolean r0 = r1.mo2775C()
            if (r0 == 0) goto L_0x023a
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            java.util.ArrayList r0 = r0.f2475l
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2480e
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r0.f2480e
            r1.f2464a = r8
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            java.util.ArrayList r1 = r1.f2475l
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2483h
            r1.add(r0)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            java.util.ArrayList r0 = r0.f2475l
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2484i
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2483h
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            goto L_0x02e7
        L_0x023a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            boolean r0 = r0.mo2774B()
            if (r0 == 0) goto L_0x025e
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2480e
            java.util.ArrayList r0 = r0.f2475l
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2480e
            r0.add(r1)
            goto L_0x02e7
        L_0x025e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2480e
            java.util.ArrayList r0 = r0.f2475l
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            goto L_0x02e7
        L_0x026d:
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2480e
            java.util.ArrayList r0 = r0.f2475l
            r0.add(r1)
            java.util.ArrayList r0 = r1.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2483h
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r0.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2484i
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            r0.f2465b = r3
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2484i
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2483h
            java.util.ArrayList r0 = r0.f2475l
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            java.util.ArrayList r0 = r0.f2475l
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            goto L_0x02e7
        L_0x02be:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f2406W
            if (r1 != 0) goto L_0x02c3
            goto L_0x02e7
        L_0x02c3:
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r1.f2480e
            java.util.ArrayList r0 = r0.f2475l
            r0.add(r1)
            java.util.ArrayList r0 = r1.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r8.f2480e
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            r0.f2465b = r3
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r8.f2480e
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2484i
            r0.add(r1)
        L_0x02e7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r0.f2402S
            r4 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.f2379f
            if (r5 == 0) goto L_0x033f
            r6 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.f2379f
            if (r6 == 0) goto L_0x033f
            boolean r0 = r0.mo2774B()
            if (r0 == 0) goto L_0x031c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.f2402S
            r1 = r1[r2]
            int r1 = r1.mo2764e()
            r0.f2469f = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.f2402S
            r1 = r1[r3]
            int r1 = r1.mo2764e()
            int r1 = -r1
            r0.f2469f = r1
            goto L_0x03a5
        L_0x031c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.f2402S
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.f2402S
            r1 = r1[r3]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r1)
            if (r0 == 0) goto L_0x0335
            r0.mo2816b(r8)
        L_0x0335:
            if (r1 == 0) goto L_0x033a
            r1.mo2816b(r8)
        L_0x033a:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER
            r8.f2485j = r0
            goto L_0x03a5
        L_0x033f:
            if (r5 == 0) goto L_0x0360
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r4)
            if (r0 == 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r4 = r4.f2402S
            r2 = r4[r2]
            int r2 = r2.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r8.f2480e
            r8.mo2820c(r0, r1, r3, r2)
            goto L_0x03a5
        L_0x0360:
            r1 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.f2379f
            if (r2 == 0) goto L_0x0387
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r1)
            if (r0 == 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r8.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.f2402S
            r2 = r2[r3]
            int r2 = r2.mo2764e()
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2484i
            r2 = -1
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r8.f2480e
            r8.mo2820c(r0, r1, r2, r3)
            goto L_0x03a5
        L_0x0387:
            boolean r1 = r0 instanceof p292w0.C6960a
            if (r1 != 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2406W
            if (r1 == 0) goto L_0x03a5
            androidx.constraintlayout.core.widgets.analyzer.c r1 = r1.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r8.f2483h
            int r0 = r0.mo2808v()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r2, r1, r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r8.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r8.f2480e
            r8.mo2820c(r0, r1, r3, r2)
        L_0x03a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0691c.mo2821d():void");
    }

    /* renamed from: e */
    public final void mo2822e() {
        DependencyNode dependencyNode = this.f2483h;
        if (dependencyNode.f2473j) {
            this.f2477b.f2413b0 = dependencyNode.f2470g;
        }
    }

    /* renamed from: f */
    public final void mo2823f() {
        this.f2478c = null;
        this.f2483h.mo2817c();
        this.f2484i.mo2817c();
        this.f2480e.mo2817c();
        this.f2482g = false;
    }

    /* renamed from: k */
    public final boolean mo2826k() {
        if (this.f2479d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2477b.f2446s == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void mo2829n() {
        this.f2482g = false;
        this.f2483h.mo2817c();
        this.f2483h.f2473j = false;
        this.f2484i.mo2817c();
        this.f2484i.f2473j = false;
        this.f2480e.f2473j = false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("HorizontalRun ");
        k.append(this.f2477b.f2433l0);
        return k.toString();
    }
}
