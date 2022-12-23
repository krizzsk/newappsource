package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import p305x0.C7133d;
import p305x0.C7138i;

public abstract class WidgetRun implements C7133d {

    /* renamed from: a */
    public int f2476a;

    /* renamed from: b */
    public ConstraintWidget f2477b;

    /* renamed from: c */
    public C7138i f2478c;

    /* renamed from: d */
    public ConstraintWidget.DimensionBehaviour f2479d;

    /* renamed from: e */
    public C0689a f2480e = new C0689a(this);

    /* renamed from: f */
    public int f2481f = 0;

    /* renamed from: g */
    public boolean f2482g = false;

    /* renamed from: h */
    public DependencyNode f2483h = new DependencyNode(this);

    /* renamed from: i */
    public DependencyNode f2484i = new DependencyNode(this);

    /* renamed from: j */
    public RunType f2485j = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$a */
    public static /* synthetic */ class C0688a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2486a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2486a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2486a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2486a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2486a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2486a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.C0688a.<clinit>():void");
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f2477b = constraintWidget;
    }

    /* renamed from: b */
    public static void m2017b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f2475l.add(dependencyNode2);
        dependencyNode.f2469f = i;
        dependencyNode2.f2474k.add(dependencyNode);
    }

    /* renamed from: h */
    public static DependencyNode m2018h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2379f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f2377d;
        int i = C0688a.f2486a[constraintAnchor2.f2378e.ordinal()];
        if (i == 1) {
            return constraintWidget.f2416d.f2483h;
        }
        if (i == 2) {
            return constraintWidget.f2416d.f2484i;
        }
        if (i == 3) {
            return constraintWidget.f2418e.f2483h;
        }
        if (i == 4) {
            return constraintWidget.f2418e.f2490k;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f2418e.f2484i;
    }

    /* renamed from: i */
    public static DependencyNode m2019i(ConstraintAnchor constraintAnchor, int i) {
        WidgetRun widgetRun;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2379f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f2377d;
        if (i == 0) {
            widgetRun = constraintWidget.f2416d;
        } else {
            widgetRun = constraintWidget.f2418e;
        }
        int i2 = C0688a.f2486a[constraintAnchor2.f2378e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f2484i;
        }
        return widgetRun.f2483h;
    }

    /* renamed from: a */
    public void mo2815a(C7133d dVar) {
    }

    /* renamed from: c */
    public final void mo2820c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, C0689a aVar) {
        dependencyNode.f2475l.add(dependencyNode2);
        dependencyNode.f2475l.add(this.f2480e);
        dependencyNode.f2471h = i;
        dependencyNode.f2472i = aVar;
        dependencyNode2.f2474k.add(dependencyNode);
        aVar.f2474k.add(dependencyNode);
    }

    /* renamed from: d */
    public abstract void mo2821d();

    /* renamed from: e */
    public abstract void mo2822e();

    /* renamed from: f */
    public abstract void mo2823f();

    /* renamed from: g */
    public final int mo2824g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f2477b;
            int i4 = constraintWidget.f2454w;
            i3 = Math.max(constraintWidget.f2452v, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f2477b;
            int i5 = constraintWidget2.f2457z;
            int max = Math.max(constraintWidget2.f2456y, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* renamed from: j */
    public long mo2825j() {
        C0689a aVar = this.f2480e;
        if (aVar.f2473j) {
            return (long) aVar.f2470g;
        }
        return 0;
    }

    /* renamed from: k */
    public abstract boolean mo2826k();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r10.f2476a == 3) goto L_0x00b6;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2827l(androidx.constraintlayout.core.widgets.ConstraintAnchor r13, androidx.constraintlayout.core.widgets.ConstraintAnchor r14, int r15) {
        /*
            r12 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = m2018h(r13)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = m2018h(r14)
            boolean r2 = r0.f2473j
            if (r2 == 0) goto L_0x00f9
            boolean r2 = r1.f2473j
            if (r2 != 0) goto L_0x0012
            goto L_0x00f9
        L_0x0012:
            int r2 = r0.f2470g
            int r13 = r13.mo2764e()
            int r13 = r13 + r2
            int r2 = r1.f2470g
            int r14 = r14.mo2764e()
            int r2 = r2 - r14
            int r14 = r2 - r13
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r12.f2480e
            boolean r4 = r3.f2473j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r12.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x00b6
            int r4 = r12.f2476a
            if (r4 == 0) goto L_0x00af
            r7 = 1
            if (r4 == r7) goto L_0x009f
            r8 = 2
            if (r4 == r8) goto L_0x0076
            r8 = 3
            if (r4 == r8) goto L_0x003f
            goto L_0x00b6
        L_0x003f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r12.f2477b
            androidx.constraintlayout.core.widgets.analyzer.c r9 = r4.f2416d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = r9.f2479d
            if (r10 != r6) goto L_0x0056
            int r10 = r9.f2476a
            if (r10 != r8) goto L_0x0056
            androidx.constraintlayout.core.widgets.analyzer.d r10 = r4.f2418e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r10.f2479d
            if (r11 != r6) goto L_0x0056
            int r6 = r10.f2476a
            if (r6 != r8) goto L_0x0056
            goto L_0x00b6
        L_0x0056:
            if (r15 != 0) goto L_0x005a
            androidx.constraintlayout.core.widgets.analyzer.d r9 = r4.f2418e
        L_0x005a:
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r9.f2480e
            boolean r8 = r6.f2473j
            if (r8 == 0) goto L_0x00b6
            float r4 = r4.f2409Z
            if (r15 != r7) goto L_0x006b
            int r6 = r6.f2470g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x0072
        L_0x006b:
            int r6 = r6.f2470g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x0072:
            r3.mo2818d(r4)
            goto L_0x00b6
        L_0x0076:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r12.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r4.f2406W
            if (r6 == 0) goto L_0x00b6
            if (r15 != 0) goto L_0x0081
            androidx.constraintlayout.core.widgets.analyzer.c r6 = r6.f2416d
            goto L_0x0083
        L_0x0081:
            androidx.constraintlayout.core.widgets.analyzer.d r6 = r6.f2418e
        L_0x0083:
            androidx.constraintlayout.core.widgets.analyzer.a r6 = r6.f2480e
            boolean r7 = r6.f2473j
            if (r7 == 0) goto L_0x00b6
            if (r15 != 0) goto L_0x008e
            float r4 = r4.f2455x
            goto L_0x0090
        L_0x008e:
            float r4 = r4.f2384A
        L_0x0090:
            int r6 = r6.f2470g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r12.mo2824g(r4, r15)
            r3.mo2818d(r4)
            goto L_0x00b6
        L_0x009f:
            int r3 = r3.f2487m
            int r3 = r12.mo2824g(r3, r15)
            androidx.constraintlayout.core.widgets.analyzer.a r4 = r12.f2480e
            int r3 = java.lang.Math.min(r3, r14)
            r4.mo2818d(r3)
            goto L_0x00b6
        L_0x00af:
            int r4 = r12.mo2824g(r14, r15)
            r3.mo2818d(r4)
        L_0x00b6:
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r12.f2480e
            boolean r4 = r3.f2473j
            if (r4 != 0) goto L_0x00bd
            return
        L_0x00bd:
            int r3 = r3.f2470g
            if (r3 != r14) goto L_0x00cc
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r12.f2483h
            r14.mo2818d(r13)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r12.f2484i
            r13.mo2818d(r2)
            return
        L_0x00cc:
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = r12.f2477b
            if (r15 != 0) goto L_0x00d3
            float r14 = r14.f2423g0
            goto L_0x00d5
        L_0x00d3:
            float r14 = r14.f2425h0
        L_0x00d5:
            if (r0 != r1) goto L_0x00dd
            int r13 = r0.f2470g
            int r2 = r1.f2470g
            r14 = 1056964608(0x3f000000, float:0.5)
        L_0x00dd:
            int r2 = r2 - r13
            int r2 = r2 - r3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r15 = r12.f2483h
            float r13 = (float) r13
            float r13 = r13 + r5
            float r0 = (float) r2
            float r0 = r0 * r14
            float r0 = r0 + r13
            int r13 = (int) r0
            r15.mo2818d(r13)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r13 = r12.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r14 = r12.f2483h
            int r14 = r14.f2470g
            androidx.constraintlayout.core.widgets.analyzer.a r15 = r12.f2480e
            int r15 = r15.f2470g
            int r14 = r14 + r15
            r13.mo2818d(r14)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.WidgetRun.mo2827l(androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int):void");
    }
}
