package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import p305x0.C7128a;
import p305x0.C7133d;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.d */
public final class C0693d extends WidgetRun {

    /* renamed from: k */
    public DependencyNode f2490k;

    /* renamed from: l */
    public C7128a f2491l = null;

    /* renamed from: androidx.constraintlayout.core.widgets.analyzer.d$a */
    public static /* synthetic */ class C0694a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2492a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType[] r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2492a = r0
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2492a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2492a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r1 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0693d.C0694a.<clinit>():void");
        }
    }

    public C0693d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f2490k = dependencyNode;
        this.f2483h.f2468e = DependencyNode.Type.TOP;
        this.f2484i.f2468e = DependencyNode.Type.BOTTOM;
        dependencyNode.f2468e = DependencyNode.Type.BASELINE;
        this.f2481f = 1;
    }

    /* renamed from: a */
    public final void mo2815a(C7133d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        if (C0694a.f2492a[this.f2485j.ordinal()] != 3) {
            C0689a aVar = this.f2480e;
            if (aVar.f2466c && !aVar.f2473j && this.f2479d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget constraintWidget = this.f2477b;
                int i2 = constraintWidget.f2448t;
                if (i2 == 2) {
                    ConstraintWidget constraintWidget2 = constraintWidget.f2406W;
                    if (constraintWidget2 != null) {
                        C0689a aVar2 = constraintWidget2.f2418e.f2480e;
                        if (aVar2.f2473j) {
                            aVar.mo2818d((int) ((((float) aVar2.f2470g) * constraintWidget.f2384A) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    C0689a aVar3 = constraintWidget.f2416d.f2480e;
                    if (aVar3.f2473j) {
                        int i3 = constraintWidget.f2411a0;
                        if (i3 == -1) {
                            f3 = (float) aVar3.f2470g;
                            f2 = constraintWidget.f2409Z;
                        } else if (i3 == 0) {
                            f = ((float) aVar3.f2470g) * constraintWidget.f2409Z;
                            i = (int) (f + 0.5f);
                            aVar.mo2818d(i);
                        } else if (i3 != 1) {
                            i = 0;
                            aVar.mo2818d(i);
                        } else {
                            f3 = (float) aVar3.f2470g;
                            f2 = constraintWidget.f2409Z;
                        }
                        f = f3 / f2;
                        i = (int) (f + 0.5f);
                        aVar.mo2818d(i);
                    }
                }
            }
            DependencyNode dependencyNode = this.f2483h;
            if (dependencyNode.f2466c) {
                DependencyNode dependencyNode2 = this.f2484i;
                if (dependencyNode2.f2466c) {
                    if (!dependencyNode.f2473j || !dependencyNode2.f2473j || !this.f2480e.f2473j) {
                        if (!this.f2480e.f2473j && this.f2479d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            ConstraintWidget constraintWidget3 = this.f2477b;
                            if (constraintWidget3.f2446s == 0 && !constraintWidget3.mo2775C()) {
                                int i4 = ((DependencyNode) this.f2483h.f2475l.get(0)).f2470g;
                                DependencyNode dependencyNode3 = this.f2483h;
                                int i5 = i4 + dependencyNode3.f2469f;
                                int i6 = ((DependencyNode) this.f2484i.f2475l.get(0)).f2470g + this.f2484i.f2469f;
                                dependencyNode3.mo2818d(i5);
                                this.f2484i.mo2818d(i6);
                                this.f2480e.mo2818d(i6 - i5);
                                return;
                            }
                        }
                        if (!this.f2480e.f2473j && this.f2479d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f2476a == 1 && this.f2483h.f2475l.size() > 0 && this.f2484i.f2475l.size() > 0) {
                            int i7 = (((DependencyNode) this.f2484i.f2475l.get(0)).f2470g + this.f2484i.f2469f) - (((DependencyNode) this.f2483h.f2475l.get(0)).f2470g + this.f2483h.f2469f);
                            C0689a aVar4 = this.f2480e;
                            int i8 = aVar4.f2487m;
                            if (i7 < i8) {
                                aVar4.mo2818d(i7);
                            } else {
                                aVar4.mo2818d(i8);
                            }
                        }
                        if (this.f2480e.f2473j && this.f2483h.f2475l.size() > 0 && this.f2484i.f2475l.size() > 0) {
                            DependencyNode dependencyNode4 = (DependencyNode) this.f2483h.f2475l.get(0);
                            DependencyNode dependencyNode5 = (DependencyNode) this.f2484i.f2475l.get(0);
                            int i9 = dependencyNode4.f2470g;
                            DependencyNode dependencyNode6 = this.f2483h;
                            int i11 = dependencyNode6.f2469f + i9;
                            int i12 = dependencyNode5.f2470g;
                            int i13 = this.f2484i.f2469f + i12;
                            float f4 = this.f2477b.f2425h0;
                            if (dependencyNode4 == dependencyNode5) {
                                f4 = 0.5f;
                            } else {
                                i9 = i11;
                                i12 = i13;
                            }
                            dependencyNode6.mo2818d((int) ((((float) ((i12 - i9) - this.f2480e.f2470g)) * f4) + ((float) i9) + 0.5f));
                            this.f2484i.mo2818d(this.f2483h.f2470g + this.f2480e.f2470g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ConstraintWidget constraintWidget4 = this.f2477b;
        mo2827l(constraintWidget4.f2395L, constraintWidget4.f2397N, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
        r0 = r10.f2477b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2821d() {
        /*
            r10 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r1 = r0.f2410a
            if (r1 == 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r10.f2480e
            int r0 = r0.mo2802o()
            r1.mo2818d(r0)
        L_0x000f:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            boolean r0 = r0.f2473j
            r1 = 1
            if (r0 != 0) goto L_0x0090
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.f2405V
            r2 = r2[r1]
            r10.f2479d = r2
            boolean r0 = r0.f2389F
            if (r0 == 0) goto L_0x0029
            x0.a r0 = new x0.a
            r0.<init>(r10)
            r10.f2491l = r0
        L_0x0029:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 == r2) goto L_0x00c6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r2) goto L_0x0080
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.f2406W
            if (r2 == 0) goto L_0x0080
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.f2405V
            r3 = r3[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r4) goto L_0x0080
            int r0 = r2.mo2802o()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2395L
            int r1 = r1.mo2764e()
            int r0 = r0 - r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2397N
            int r1 = r1.mo2764e()
            int r0 = r0 - r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2395L
            int r4 = r4.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r3, r4)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.d r2 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2397N
            int r3 = r3.mo2764e()
            int r3 = -r3
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.a r1 = r10.f2480e
            r1.mo2818d(r0)
            return
        L_0x0080:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r2) goto L_0x00c6
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            int r2 = r2.mo2802o()
            r0.mo2818d(r2)
            goto L_0x00c6
        L_0x0090:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r0 != r2) goto L_0x00c6
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.f2406W
            if (r2 == 0) goto L_0x00c6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r2.f2405V
            r3 = r3[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r3 != r4) goto L_0x00c6
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.d r3 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2483h
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2395L
            int r0 = r0.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r3, r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2397N
            int r2 = r2.mo2764e()
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            return
        L_0x00c6:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            boolean r2 = r0.f2473j
            r3 = 0
            r4 = 4
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L_0x022d
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r10.f2477b
            boolean r8 = r7.f2410a
            if (r8 == 0) goto L_0x022d
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r7.f2402S
            r2 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.f2379f
            if (r8 == 0) goto L_0x0158
            r9 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f2379f
            if (r9 == 0) goto L_0x0158
            boolean r0 = r7.mo2775C()
            if (r0 == 0) goto L_0x0108
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.f2402S
            r1 = r1[r5]
            int r1 = r1.mo2764e()
            r0.f2469f = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r1 = r1.f2402S
            r1 = r1[r6]
            int r1 = r1.mo2764e()
            int r1 = -r1
            r0.f2469f = r1
            goto L_0x0147
        L_0x0108:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.f2402S
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r0)
            if (r0 == 0) goto L_0x0123
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.f2402S
            r3 = r3[r5]
            int r3 = r3.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r2, r0, r3)
        L_0x0123:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.f2402S
            r0 = r0[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r0)
            if (r0 == 0) goto L_0x013f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.f2402S
            r3 = r3[r6]
            int r3 = r3.mo2764e()
            int r3 = -r3
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r2, r0, r3)
        L_0x013f:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2483h
            r0.f2465b = r1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            r0.f2465b = r1
        L_0x0147:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r1 = r0.f2389F
            if (r1 == 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            int r0 = r0.f2417d0
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r2, r0)
            goto L_0x042a
        L_0x0158:
            if (r8 == 0) goto L_0x018b
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r2)
            if (r0 == 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.f2402S
            r2 = r2[r5]
            int r2 = r2.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            int r2 = r2.f2470g
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r1 = r0.f2389F
            if (r1 == 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            int r0 = r0.f2417d0
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r2, r0)
            goto L_0x042a
        L_0x018b:
            r1 = r0[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.f2379f
            if (r2 == 0) goto L_0x01c4
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r1)
            if (r0 == 0) goto L_0x01b3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.f2402S
            r2 = r2[r6]
            int r2 = r2.mo2764e()
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            int r2 = r2.f2470g
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
        L_0x01b3:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r1 = r0.f2389F
            if (r1 == 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            int r0 = r0.f2417d0
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r2, r0)
            goto L_0x042a
        L_0x01c4:
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2379f
            if (r1 == 0) goto L_0x01ee
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r0)
            if (r0 == 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2490k
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            int r2 = r2.f2417d0
            int r2 = -r2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            int r2 = r2.f2470g
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            goto L_0x042a
        L_0x01ee:
            boolean r0 = r7 instanceof p292w0.C6960a
            if (r0 != 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.f2406W
            if (r0 == 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mo2800m(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2379f
            if (r0 != 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2406W
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            int r0 = r0.mo2809w()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r2, r1, r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            int r2 = r2.f2470g
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r1 = r0.f2389F
            if (r1 == 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            int r0 = r0.f2417d0
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r1, r2, r0)
            goto L_0x042a
        L_0x022d:
            if (r2 != 0) goto L_0x029c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r10.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r7) goto L_0x029c
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            int r7 = r2.f2448t
            if (r7 == r5) goto L_0x0272
            if (r7 == r6) goto L_0x023e
            goto L_0x029f
        L_0x023e:
            boolean r0 = r2.mo2775C()
            if (r0 != 0) goto L_0x029f
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            int r2 = r0.f2446s
            if (r2 != r6) goto L_0x024b
            goto L_0x029f
        L_0x024b:
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r0.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2480e
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            java.util.ArrayList r2 = r2.f2475l
            r2.add(r0)
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            r0.f2465b = r1
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2484i
            r0.add(r2)
            goto L_0x029f
        L_0x0272:
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.f2406W
            if (r2 != 0) goto L_0x0277
            goto L_0x029f
        L_0x0277:
            androidx.constraintlayout.core.widgets.analyzer.d r2 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r2.f2480e
            java.util.ArrayList r0 = r0.f2475l
            r0.add(r2)
            java.util.ArrayList r0 = r2.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            r0.f2465b = r1
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2484i
            r0.add(r2)
            goto L_0x029f
        L_0x029c:
            r0.mo2816b(r10)
        L_0x029f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r0.f2402S
            r7 = r2[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r7.f2379f
            if (r8 == 0) goto L_0x0306
            r9 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.f2379f
            if (r9 == 0) goto L_0x0306
            boolean r0 = r0.mo2775C()
            if (r0 == 0) goto L_0x02d3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.f2402S
            r2 = r2[r5]
            int r2 = r2.mo2764e()
            r0.f2469f = r2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.f2402S
            r2 = r2[r6]
            int r2 = r2.mo2764e()
            int r2 = -r2
            r0.f2469f = r2
            goto L_0x02f5
        L_0x02d3:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r0.f2402S
            r0 = r0[r5]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r2 = r2.f2402S
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r2)
            if (r0 == 0) goto L_0x02ec
            r0.mo2816b(r10)
        L_0x02ec:
            if (r2 == 0) goto L_0x02f1
            r2.mo2816b(r10)
        L_0x02f1:
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun$RunType r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.RunType.CENTER
            r10.f2485j = r0
        L_0x02f5:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r0 = r0.f2389F
            if (r0 == 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            x0.a r3 = r10.f2491l
            r10.mo2820c(r0, r2, r1, r3)
            goto L_0x041c
        L_0x0306:
            r9 = 0
            if (r8 == 0) goto L_0x0366
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r7)
            if (r0 == 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.f2402S
            r3 = r3[r5]
            int r3 = r3.mo2764e()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r2, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r10.f2480e
            r10.mo2820c(r0, r2, r1, r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r0 = r0.f2389F
            if (r0 == 0) goto L_0x0336
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            x0.a r3 = r10.f2491l
            r10.mo2820c(r0, r2, r1, r3)
        L_0x0336:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x041c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            float r3 = r0.f2409Z
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r0.f2416d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r0.f2479d
            if (r3 != r2) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2480e
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            java.util.ArrayList r0 = r0.f2475l
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.analyzer.c r2 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r2.f2480e
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            r0.f2464a = r10
            goto L_0x041c
        L_0x0366:
            r5 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.f2379f
            r8 = -1
            if (r7 == 0) goto L_0x039d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r5)
            if (r0 == 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2484i
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r10.f2477b
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r3 = r3.f2402S
            r3 = r3[r6]
            int r3 = r3.mo2764e()
            int r3 = -r3
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r2, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r10.f2480e
            r10.mo2820c(r0, r2, r8, r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r0 = r0.f2389F
            if (r0 == 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            x0.a r3 = r10.f2491l
            r10.mo2820c(r0, r2, r1, r3)
            goto L_0x041c
        L_0x039d:
            r2 = r2[r4]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r2.f2379f
            if (r4 == 0) goto L_0x03c1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2018h(r2)
            if (r0 == 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r2, r0, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2490k
            x0.a r3 = r10.f2491l
            r10.mo2820c(r0, r2, r8, r3)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r10.f2480e
            r10.mo2820c(r0, r2, r1, r3)
            goto L_0x041c
        L_0x03c1:
            boolean r2 = r0 instanceof p292w0.C6960a
            if (r2 != 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.f2406W
            if (r2 == 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.d r2 = r2.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.f2483h
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r10.f2483h
            int r0 = r0.mo2809w()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun.m2017b(r3, r2, r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2484i
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r10.f2480e
            r10.mo2820c(r0, r2, r1, r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            boolean r0 = r0.f2389F
            if (r0 == 0) goto L_0x03ee
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r10.f2490k
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r10.f2483h
            x0.a r3 = r10.f2491l
            r10.mo2820c(r0, r2, r1, r3)
        L_0x03ee:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r10.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x041c
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r10.f2477b
            float r3 = r0.f2409Z
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r0.f2416d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r0.f2479d
            if (r3 != r2) goto L_0x041c
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r0.f2480e
            java.util.ArrayList r0 = r0.f2474k
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r10.f2480e
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            java.util.ArrayList r0 = r0.f2475l
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r10.f2477b
            androidx.constraintlayout.core.widgets.analyzer.c r2 = r2.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r2 = r2.f2480e
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            r0.f2464a = r10
        L_0x041c:
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            java.util.ArrayList r0 = r0.f2475l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x042a
            androidx.constraintlayout.core.widgets.analyzer.a r0 = r10.f2480e
            r0.f2466c = r1
        L_0x042a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C0693d.mo2821d():void");
    }

    /* renamed from: e */
    public final void mo2822e() {
        DependencyNode dependencyNode = this.f2483h;
        if (dependencyNode.f2473j) {
            this.f2477b.f2415c0 = dependencyNode.f2470g;
        }
    }

    /* renamed from: f */
    public final void mo2823f() {
        this.f2478c = null;
        this.f2483h.mo2817c();
        this.f2484i.mo2817c();
        this.f2490k.mo2817c();
        this.f2480e.mo2817c();
        this.f2482g = false;
    }

    /* renamed from: k */
    public final boolean mo2826k() {
        if (this.f2479d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2477b.f2448t == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void mo2831m() {
        this.f2482g = false;
        this.f2483h.mo2817c();
        this.f2483h.f2473j = false;
        this.f2484i.mo2817c();
        this.f2484i.f2473j = false;
        this.f2490k.mo2817c();
        this.f2490k.f2473j = false;
        this.f2480e.f2473j = false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("VerticalRun ");
        k.append(this.f2477b.f2433l0);
        return k.toString();
    }
}
