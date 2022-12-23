package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.e */
public final class C0698e extends C0704i {

    /* renamed from: J0 */
    public int f2531J0 = -1;

    /* renamed from: K0 */
    public int f2532K0 = -1;

    /* renamed from: L0 */
    public int f2533L0 = -1;

    /* renamed from: M0 */
    public int f2534M0 = -1;

    /* renamed from: N0 */
    public int f2535N0 = -1;

    /* renamed from: O0 */
    public int f2536O0 = -1;

    /* renamed from: P0 */
    public float f2537P0 = 0.5f;

    /* renamed from: Q0 */
    public float f2538Q0 = 0.5f;

    /* renamed from: R0 */
    public float f2539R0 = 0.5f;

    /* renamed from: S0 */
    public float f2540S0 = 0.5f;

    /* renamed from: T0 */
    public float f2541T0 = 0.5f;

    /* renamed from: U0 */
    public float f2542U0 = 0.5f;

    /* renamed from: V0 */
    public int f2543V0 = 0;

    /* renamed from: W0 */
    public int f2544W0 = 0;

    /* renamed from: X0 */
    public int f2545X0 = 2;

    /* renamed from: Y0 */
    public int f2546Y0 = 2;

    /* renamed from: Z0 */
    public int f2547Z0 = 0;

    /* renamed from: a1 */
    public int f2548a1 = -1;

    /* renamed from: b1 */
    public int f2549b1 = 0;

    /* renamed from: c1 */
    public ArrayList<C0699a> f2550c1 = new ArrayList<>();

    /* renamed from: d1 */
    public ConstraintWidget[] f2551d1 = null;

    /* renamed from: e1 */
    public ConstraintWidget[] f2552e1 = null;

    /* renamed from: f1 */
    public int[] f2553f1 = null;

    /* renamed from: g1 */
    public ConstraintWidget[] f2554g1;

    /* renamed from: h1 */
    public int f2555h1 = 0;

    /* renamed from: androidx.constraintlayout.core.widgets.e$a */
    public class C0699a {

        /* renamed from: a */
        public int f2556a;

        /* renamed from: b */
        public ConstraintWidget f2557b = null;

        /* renamed from: c */
        public int f2558c = 0;

        /* renamed from: d */
        public ConstraintAnchor f2559d;

        /* renamed from: e */
        public ConstraintAnchor f2560e;

        /* renamed from: f */
        public ConstraintAnchor f2561f;

        /* renamed from: g */
        public ConstraintAnchor f2562g;

        /* renamed from: h */
        public int f2563h = 0;

        /* renamed from: i */
        public int f2564i = 0;

        /* renamed from: j */
        public int f2565j = 0;

        /* renamed from: k */
        public int f2566k = 0;

        /* renamed from: l */
        public int f2567l = 0;

        /* renamed from: m */
        public int f2568m = 0;

        /* renamed from: n */
        public int f2569n = 0;

        /* renamed from: o */
        public int f2570o = 0;

        /* renamed from: p */
        public int f2571p = 0;

        /* renamed from: q */
        public int f2572q = 0;

        public C0699a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f2556a = i;
            this.f2559d = constraintAnchor;
            this.f2560e = constraintAnchor2;
            this.f2561f = constraintAnchor3;
            this.f2562g = constraintAnchor4;
            this.f2563h = C0698e.this.f2584C0;
            this.f2564i = C0698e.this.f2591y0;
            this.f2565j = C0698e.this.f2585D0;
            this.f2566k = C0698e.this.f2592z0;
            this.f2572q = i2;
        }

        /* renamed from: a */
        public final void mo2841a(ConstraintWidget constraintWidget) {
            int i = 0;
            if (this.f2556a == 0) {
                int Y = C0698e.this.mo2840Y(this.f2572q, constraintWidget);
                if (constraintWidget.f2405V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2571p++;
                    Y = 0;
                }
                C0698e eVar = C0698e.this;
                int i2 = eVar.f2543V0;
                if (constraintWidget.f2429j0 != 8) {
                    i = i2;
                }
                this.f2567l = Y + i + this.f2567l;
                int X = eVar.mo2839X(this.f2572q, constraintWidget);
                if (this.f2557b == null || this.f2558c < X) {
                    this.f2557b = constraintWidget;
                    this.f2558c = X;
                    this.f2568m = X;
                }
            } else {
                int Y2 = C0698e.this.mo2840Y(this.f2572q, constraintWidget);
                int X2 = C0698e.this.mo2839X(this.f2572q, constraintWidget);
                if (constraintWidget.f2405V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2571p++;
                    X2 = 0;
                }
                int i3 = C0698e.this.f2544W0;
                if (constraintWidget.f2429j0 != 8) {
                    i = i3;
                }
                this.f2568m = X2 + i + this.f2568m;
                if (this.f2557b == null || this.f2558c < Y2) {
                    this.f2557b = constraintWidget;
                    this.f2558c = Y2;
                    this.f2567l = Y2;
                }
            }
            this.f2570o++;
        }

        /* JADX WARNING: Removed duplicated region for block: B:57:0x00b7  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2842b(int r17, boolean r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f2570o
                r2 = 0
                r3 = 0
            L_0x0006:
                if (r3 >= r1) goto L_0x001e
                int r4 = r0.f2569n
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.e r5 = androidx.constraintlayout.core.widgets.C0698e.this
                int r6 = r5.f2555h1
                if (r4 < r6) goto L_0x0012
                goto L_0x001e
            L_0x0012:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r5.f2554g1
                r4 = r5[r4]
                if (r4 == 0) goto L_0x001b
                r4.mo2780H()
            L_0x001b:
                int r3 = r3 + 1
                goto L_0x0006
            L_0x001e:
                if (r1 == 0) goto L_0x030a
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2557b
                if (r3 != 0) goto L_0x0026
                goto L_0x030a
            L_0x0026:
                if (r19 == 0) goto L_0x002c
                if (r17 != 0) goto L_0x002c
                r4 = 1
                goto L_0x002d
            L_0x002c:
                r4 = 0
            L_0x002d:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L_0x0031:
                if (r6 >= r1) goto L_0x0055
                if (r18 == 0) goto L_0x0039
                int r9 = r1 + -1
                int r9 = r9 - r6
                goto L_0x003a
            L_0x0039:
                r9 = r6
            L_0x003a:
                int r10 = r0.f2569n
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.e r9 = androidx.constraintlayout.core.widgets.C0698e.this
                int r11 = r9.f2555h1
                if (r10 < r11) goto L_0x0044
                goto L_0x0055
            L_0x0044:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r9.f2554g1
                r9 = r9[r10]
                if (r9 == 0) goto L_0x0052
                int r9 = r9.f2429j0
                if (r9 != 0) goto L_0x0052
                if (r7 != r5) goto L_0x0051
                r7 = r6
            L_0x0051:
                r8 = r6
            L_0x0052:
                int r6 = r6 + 1
                goto L_0x0031
            L_0x0055:
                int r6 = r0.f2556a
                r9 = 0
                if (r6 != 0) goto L_0x01b6
                androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r0.f2557b
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C0698e.this
                int r11 = r10.f2532K0
                r6.f2439o0 = r11
                int r11 = r0.f2564i
                if (r17 <= 0) goto L_0x0069
                int r10 = r10.f2544W0
                int r11 = r11 + r10
            L_0x0069:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.f2395L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.f2560e
                r10.mo2760a(r12, r11)
                if (r19 == 0) goto L_0x007b
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.f2397N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.f2562g
                int r12 = r0.f2566k
                r10.mo2760a(r11, r12)
            L_0x007b:
                if (r17 <= 0) goto L_0x0088
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f2560e
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f2377d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.f2397N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.f2395L
                r10.mo2760a(r11, r2)
            L_0x0088:
                androidx.constraintlayout.core.widgets.e r10 = androidx.constraintlayout.core.widgets.C0698e.this
                int r10 = r10.f2546Y0
                r11 = 3
                if (r10 != r11) goto L_0x00b3
                boolean r10 = r6.f2389F
                if (r10 != 0) goto L_0x00b3
                r10 = 0
            L_0x0094:
                if (r10 >= r1) goto L_0x00b3
                if (r18 == 0) goto L_0x009c
                int r12 = r1 + -1
                int r12 = r12 - r10
                goto L_0x009d
            L_0x009c:
                r12 = r10
            L_0x009d:
                int r13 = r0.f2569n
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.e r12 = androidx.constraintlayout.core.widgets.C0698e.this
                int r14 = r12.f2555h1
                if (r13 < r14) goto L_0x00a7
                goto L_0x00b3
            L_0x00a7:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r12 = r12.f2554g1
                r12 = r12[r13]
                boolean r13 = r12.f2389F
                if (r13 == 0) goto L_0x00b0
                goto L_0x00b4
            L_0x00b0:
                int r10 = r10 + 1
                goto L_0x0094
            L_0x00b3:
                r12 = r6
            L_0x00b4:
                r10 = 0
            L_0x00b5:
                if (r10 >= r1) goto L_0x030a
                if (r18 == 0) goto L_0x00bd
                int r13 = r1 + -1
                int r13 = r13 - r10
                goto L_0x00be
            L_0x00bd:
                r13 = r10
            L_0x00be:
                int r14 = r0.f2569n
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.e r15 = androidx.constraintlayout.core.widgets.C0698e.this
                int r11 = r15.f2555h1
                if (r14 < r11) goto L_0x00c9
                goto L_0x030a
            L_0x00c9:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r11 = r15.f2554g1
                r11 = r11[r14]
                if (r11 != 0) goto L_0x00d2
                r3 = 3
                goto L_0x01b0
            L_0x00d2:
                if (r10 != 0) goto L_0x00dd
                androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r11.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r0.f2559d
                int r3 = r0.f2563h
                r11.mo2796i(r14, r15, r3)
            L_0x00dd:
                if (r13 != 0) goto L_0x0114
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C0698e.this
                int r13 = r3.f2531J0
                r14 = 1065353216(0x3f800000, float:1.0)
                if (r18 == 0) goto L_0x00ec
                float r15 = r3.f2537P0
                float r15 = r14 - r15
                goto L_0x00ee
            L_0x00ec:
                float r15 = r3.f2537P0
            L_0x00ee:
                int r2 = r0.f2569n
                if (r2 != 0) goto L_0x00fe
                int r2 = r3.f2533L0
                if (r2 == r5) goto L_0x00fe
                if (r18 == 0) goto L_0x00fb
                float r3 = r3.f2539R0
                goto L_0x0108
            L_0x00fb:
                float r3 = r3.f2539R0
                goto L_0x010e
            L_0x00fe:
                if (r19 == 0) goto L_0x0110
                int r2 = r3.f2535N0
                if (r2 == r5) goto L_0x0110
                if (r18 == 0) goto L_0x010c
                float r3 = r3.f2541T0
            L_0x0108:
                float r14 = r14 - r3
                r13 = r2
                r15 = r14
                goto L_0x0110
            L_0x010c:
                float r3 = r3.f2541T0
            L_0x010e:
                r13 = r2
                r15 = r3
            L_0x0110:
                r11.f2437n0 = r13
                r11.f2423g0 = r15
            L_0x0114:
                int r2 = r1 + -1
                if (r10 != r2) goto L_0x0121
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f2561f
                int r13 = r0.f2565j
                r11.mo2796i(r2, r3, r13)
            L_0x0121:
                if (r9 == 0) goto L_0x0155
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r9.f2396M
                androidx.constraintlayout.core.widgets.e r13 = androidx.constraintlayout.core.widgets.C0698e.this
                int r13 = r13.f2543V0
                r2.mo2760a(r3, r13)
                if (r10 != r7) goto L_0x013c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2394K
                int r3 = r0.f2563h
                boolean r13 = r2.mo2767h()
                if (r13 == 0) goto L_0x013c
                r2.f2381h = r3
            L_0x013c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r9.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r11.f2394K
                r13 = 0
                r2.mo2760a(r3, r13)
                r2 = 1
                int r3 = r8 + 1
                if (r10 != r3) goto L_0x0155
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r9.f2396M
                int r3 = r0.f2565j
                boolean r9 = r2.mo2767h()
                if (r9 == 0) goto L_0x0155
                r2.f2381h = r3
            L_0x0155:
                if (r11 == r6) goto L_0x01ae
                androidx.constraintlayout.core.widgets.e r2 = androidx.constraintlayout.core.widgets.C0698e.this
                int r2 = r2.f2546Y0
                r3 = 3
                if (r2 != r3) goto L_0x0171
                boolean r9 = r12.f2389F
                if (r9 == 0) goto L_0x0171
                if (r11 == r12) goto L_0x0171
                boolean r9 = r11.f2389F
                if (r9 == 0) goto L_0x0171
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2398O
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r12.f2398O
                r13 = 0
                r2.mo2760a(r9, r13)
                goto L_0x01ac
            L_0x0171:
                if (r2 == 0) goto L_0x01a4
                r9 = 1
                if (r2 == r9) goto L_0x019b
                if (r4 == 0) goto L_0x018b
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2395L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f2560e
                int r13 = r0.f2564i
                r2.mo2760a(r9, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2397N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f2562g
                int r13 = r0.f2566k
                r2.mo2760a(r9, r13)
                goto L_0x01ac
            L_0x018b:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2395L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.f2395L
                r13 = 0
                r2.mo2760a(r9, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2397N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.f2397N
                r2.mo2760a(r9, r13)
                goto L_0x01ac
            L_0x019b:
                r13 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2397N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.f2397N
                r2.mo2760a(r9, r13)
                goto L_0x01ac
            L_0x01a4:
                r13 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r11.f2395L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r6.f2395L
                r2.mo2760a(r9, r13)
            L_0x01ac:
                r9 = r11
                goto L_0x01b0
            L_0x01ae:
                r3 = 3
                goto L_0x01ac
            L_0x01b0:
                int r10 = r10 + 1
                r2 = 0
                r11 = 3
                goto L_0x00b5
            L_0x01b6:
                androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.f2557b
                androidx.constraintlayout.core.widgets.e r3 = androidx.constraintlayout.core.widgets.C0698e.this
                int r6 = r3.f2531J0
                r2.f2437n0 = r6
                int r6 = r0.f2563h
                if (r17 <= 0) goto L_0x01c5
                int r3 = r3.f2543V0
                int r6 = r6 + r3
            L_0x01c5:
                if (r18 == 0) goto L_0x01e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f2561f
                r3.mo2760a(r10, r6)
                if (r19 == 0) goto L_0x01d9
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.f2559d
                int r10 = r0.f2565j
                r3.mo2760a(r6, r10)
            L_0x01d9:
                if (r17 <= 0) goto L_0x0208
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f2561f
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r2.f2396M
                r10 = 0
                r3.mo2760a(r6, r10)
                goto L_0x0208
            L_0x01e8:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f2559d
                r3.mo2760a(r10, r6)
                if (r19 == 0) goto L_0x01fa
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r0.f2561f
                int r10 = r0.f2565j
                r3.mo2760a(r6, r10)
            L_0x01fa:
                if (r17 <= 0) goto L_0x0208
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f2559d
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2377d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r2.f2394K
                r10 = 0
                r3.mo2760a(r6, r10)
            L_0x0208:
                r13 = 0
            L_0x0209:
                if (r13 >= r1) goto L_0x030a
                int r3 = r0.f2569n
                int r3 = r3 + r13
                androidx.constraintlayout.core.widgets.e r6 = androidx.constraintlayout.core.widgets.C0698e.this
                int r10 = r6.f2555h1
                if (r3 < r10) goto L_0x0216
                goto L_0x030a
            L_0x0216:
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r6.f2554g1
                r3 = r6[r3]
                if (r3 != 0) goto L_0x0220
                r10 = 1
                r11 = 0
                goto L_0x0306
            L_0x0220:
                if (r13 != 0) goto L_0x024b
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2395L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f2560e
                int r11 = r0.f2564i
                r3.mo2796i(r6, r10, r11)
                androidx.constraintlayout.core.widgets.e r6 = androidx.constraintlayout.core.widgets.C0698e.this
                int r10 = r6.f2532K0
                float r11 = r6.f2538Q0
                int r12 = r0.f2569n
                if (r12 != 0) goto L_0x023e
                int r12 = r6.f2534M0
                if (r12 == r5) goto L_0x023e
                float r6 = r6.f2540S0
            L_0x023b:
                r11 = r6
                r10 = r12
                goto L_0x0247
            L_0x023e:
                if (r19 == 0) goto L_0x0247
                int r12 = r6.f2536O0
                if (r12 == r5) goto L_0x0247
                float r6 = r6.f2542U0
                goto L_0x023b
            L_0x0247:
                r3.f2439o0 = r10
                r3.f2425h0 = r11
            L_0x024b:
                int r6 = r1 + -1
                if (r13 != r6) goto L_0x0258
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2397N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.f2562g
                int r11 = r0.f2566k
                r3.mo2796i(r6, r10, r11)
            L_0x0258:
                if (r9 == 0) goto L_0x028c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2395L
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r9.f2397N
                androidx.constraintlayout.core.widgets.e r11 = androidx.constraintlayout.core.widgets.C0698e.this
                int r11 = r11.f2544W0
                r6.mo2760a(r10, r11)
                if (r13 != r7) goto L_0x0273
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2395L
                int r10 = r0.f2564i
                boolean r11 = r6.mo2767h()
                if (r11 == 0) goto L_0x0273
                r6.f2381h = r10
            L_0x0273:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r9.f2397N
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.f2395L
                r11 = 0
                r6.mo2760a(r10, r11)
                r6 = 1
                int r10 = r8 + 1
                if (r13 != r10) goto L_0x028c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r9.f2397N
                int r9 = r0.f2566k
                boolean r10 = r6.mo2767h()
                if (r10 == 0) goto L_0x028c
                r6.f2381h = r9
            L_0x028c:
                if (r3 == r2) goto L_0x0303
                r6 = 2
                if (r18 == 0) goto L_0x02bf
                androidx.constraintlayout.core.widgets.e r9 = androidx.constraintlayout.core.widgets.C0698e.this
                int r9 = r9.f2545X0
                if (r9 == 0) goto L_0x02b6
                r10 = 1
                if (r9 == r10) goto L_0x02ad
                if (r9 == r6) goto L_0x029d
                goto L_0x0303
            L_0x029d:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2394K
                r10 = 0
                r6.mo2760a(r9, r10)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2396M
                r6.mo2760a(r9, r10)
                goto L_0x0303
            L_0x02ad:
                r10 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2394K
                r6.mo2760a(r9, r10)
                goto L_0x0303
            L_0x02b6:
                r10 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2396M
                r6.mo2760a(r9, r10)
                goto L_0x0303
            L_0x02bf:
                androidx.constraintlayout.core.widgets.e r9 = androidx.constraintlayout.core.widgets.C0698e.this
                int r9 = r9.f2545X0
                if (r9 == 0) goto L_0x02f9
                r10 = 1
                if (r9 == r10) goto L_0x02f0
                if (r9 == r6) goto L_0x02cb
                goto L_0x0304
            L_0x02cb:
                if (r4 == 0) goto L_0x02e0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f2559d
                int r11 = r0.f2563h
                r6.mo2760a(r9, r11)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.f2561f
                int r11 = r0.f2565j
                r6.mo2760a(r9, r11)
                goto L_0x0304
            L_0x02e0:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2394K
                r11 = 0
                r6.mo2760a(r9, r11)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2396M
                r6.mo2760a(r9, r11)
                goto L_0x0305
            L_0x02f0:
                r11 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2396M
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2396M
                r6.mo2760a(r9, r11)
                goto L_0x0305
            L_0x02f9:
                r10 = 1
                r11 = 0
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r3.f2394K
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r2.f2394K
                r6.mo2760a(r9, r11)
                goto L_0x0305
            L_0x0303:
                r10 = 1
            L_0x0304:
                r11 = 0
            L_0x0305:
                r9 = r3
            L_0x0306:
                int r13 = r13 + 1
                goto L_0x0209
            L_0x030a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0698e.C0699a.mo2842b(int, boolean, boolean):void");
        }

        /* renamed from: c */
        public final int mo2843c() {
            if (this.f2556a == 1) {
                return this.f2568m - C0698e.this.f2544W0;
            }
            return this.f2568m;
        }

        /* renamed from: d */
        public final int mo2844d() {
            if (this.f2556a == 0) {
                return this.f2567l - C0698e.this.f2543V0;
            }
            return this.f2567l;
        }

        /* renamed from: e */
        public final void mo2845e(int i) {
            int i2 = this.f2571p;
            if (i2 != 0) {
                int i3 = this.f2570o;
                int i4 = i / i2;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = this.f2569n;
                    int i7 = i6 + i5;
                    C0698e eVar = C0698e.this;
                    if (i7 >= eVar.f2555h1) {
                        break;
                    }
                    ConstraintWidget constraintWidget = eVar.f2554g1[i6 + i5];
                    if (this.f2556a == 0) {
                        if (constraintWidget != null) {
                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f2405V;
                            if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2446s == 0) {
                                eVar.mo2849W(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, dimensionBehaviourArr[1], constraintWidget.mo2802o());
                            }
                        }
                    } else if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.f2405V;
                        if (dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2448t == 0) {
                            eVar.mo2849W(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.mo2807u(), ConstraintWidget.DimensionBehaviour.FIXED, i4);
                        }
                    }
                }
                this.f2567l = 0;
                this.f2568m = 0;
                this.f2557b = null;
                this.f2558c = 0;
                int i8 = this.f2570o;
                int i9 = 0;
                while (i9 < i8) {
                    int i11 = this.f2569n + i9;
                    C0698e eVar2 = C0698e.this;
                    if (i11 < eVar2.f2555h1) {
                        ConstraintWidget constraintWidget2 = eVar2.f2554g1[i11];
                        if (this.f2556a == 0) {
                            int u = constraintWidget2.mo2807u();
                            C0698e eVar3 = C0698e.this;
                            int i12 = eVar3.f2543V0;
                            if (constraintWidget2.f2429j0 == 8) {
                                i12 = 0;
                            }
                            this.f2567l = u + i12 + this.f2567l;
                            int X = eVar3.mo2839X(this.f2572q, constraintWidget2);
                            if (this.f2557b == null || this.f2558c < X) {
                                this.f2557b = constraintWidget2;
                                this.f2558c = X;
                                this.f2568m = X;
                            }
                        } else {
                            int Y = eVar2.mo2840Y(this.f2572q, constraintWidget2);
                            int X2 = C0698e.this.mo2839X(this.f2572q, constraintWidget2);
                            int i13 = C0698e.this.f2544W0;
                            if (constraintWidget2.f2429j0 == 8) {
                                i13 = 0;
                            }
                            this.f2568m = X2 + i13 + this.f2568m;
                            if (this.f2557b == null || this.f2558c < Y) {
                                this.f2557b = constraintWidget2;
                                this.f2558c = Y;
                                this.f2567l = Y;
                            }
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: f */
        public final void mo2846f(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f2556a = i;
            this.f2559d = constraintAnchor;
            this.f2560e = constraintAnchor2;
            this.f2561f = constraintAnchor3;
            this.f2562g = constraintAnchor4;
            this.f2563h = i2;
            this.f2564i = i3;
            this.f2565j = i4;
            this.f2566k = i5;
            this.f2572q = i6;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v12, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r15v13 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x051a A[SYNTHETIC] */
    /* renamed from: V */
    public final void mo2838V(int r34, int r35, int r36, int r37) {
        /*
            r33 = this;
            r8 = r33
            int r0 = r8.f21717x0
            r9 = 1
            r10 = 0
            if (r0 <= 0) goto L_0x0090
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.f2406W
            if (r0 == 0) goto L_0x0011
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C0697d) r0
            x0.b$b r0 = r0.f2510A0
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0017
            r0 = 0
            goto L_0x0087
        L_0x0017:
            r2 = 0
        L_0x0018:
            int r3 = r8.f21717x0
            if (r2 >= r3) goto L_0x0086
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r8.f21716w0
            r3 = r3[r2]
            if (r3 != 0) goto L_0x0023
            goto L_0x0083
        L_0x0023:
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r4 == 0) goto L_0x0028
            goto L_0x0083
        L_0x0028:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r3.mo2801n(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r3.mo2801n(r9)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x0040
            int r7 = r3.f2446s
            if (r7 == r9) goto L_0x0040
            if (r5 != r6) goto L_0x0040
            int r7 = r3.f2448t
            if (r7 == r9) goto L_0x0040
            r7 = 1
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            if (r7 == 0) goto L_0x0044
            goto L_0x0083
        L_0x0044:
            if (r4 != r6) goto L_0x0048
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x0048:
            if (r5 != r6) goto L_0x004c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L_0x004c:
            x0.b$a r6 = r8.f2589H0
            r6.f22150a = r4
            r6.f22151b = r5
            int r4 = r3.mo2807u()
            r6.f22152c = r4
            x0.b$a r4 = r8.f2589H0
            int r5 = r3.mo2802o()
            r4.f22153d = r5
            x0.b$a r4 = r8.f2589H0
            r5 = r0
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = (androidx.constraintlayout.widget.ConstraintLayout.C0737b) r5
            r5.mo3200b(r3, r4)
            x0.b$a r4 = r8.f2589H0
            int r4 = r4.f22154e
            r3.mo2788R(r4)
            x0.b$a r4 = r8.f2589H0
            int r4 = r4.f22155f
            r3.mo2785O(r4)
            x0.b$a r4 = r8.f2589H0
            int r4 = r4.f22156g
            r3.f2417d0 = r4
            if (r4 <= 0) goto L_0x0080
            r4 = 1
            goto L_0x0081
        L_0x0080:
            r4 = 0
        L_0x0081:
            r3.f2389F = r4
        L_0x0083:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x0086:
            r0 = 1
        L_0x0087:
            if (r0 != 0) goto L_0x0090
            r8.f2587F0 = r10
            r8.f2588G0 = r10
            r8.f2586E0 = r10
            return
        L_0x0090:
            int r11 = r8.f2584C0
            int r12 = r8.f2585D0
            int r13 = r8.f2591y0
            int r14 = r8.f2592z0
            r0 = 2
            int[] r15 = new int[r0]
            int r2 = r35 - r11
            int r2 = r2 - r12
            int r3 = r8.f2549b1
            if (r3 != r9) goto L_0x00a5
            int r2 = r37 - r13
            int r2 = r2 - r14
        L_0x00a5:
            r6 = r2
            r2 = -1
            if (r3 != 0) goto L_0x00b6
            int r3 = r8.f2531J0
            if (r3 != r2) goto L_0x00af
            r8.f2531J0 = r10
        L_0x00af:
            int r3 = r8.f2532K0
            if (r3 != r2) goto L_0x00c2
            r8.f2532K0 = r10
            goto L_0x00c2
        L_0x00b6:
            int r3 = r8.f2531J0
            if (r3 != r2) goto L_0x00bc
            r8.f2531J0 = r10
        L_0x00bc:
            int r3 = r8.f2532K0
            if (r3 != r2) goto L_0x00c2
            r8.f2532K0 = r10
        L_0x00c2:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r8.f21716w0
            r3 = 0
            r4 = 0
        L_0x00c6:
            int r5 = r8.f21717x0
            r7 = 8
            if (r3 >= r5) goto L_0x00d9
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r8.f21716w0
            r5 = r5[r3]
            int r5 = r5.f2429j0
            if (r5 != r7) goto L_0x00d6
            int r4 = r4 + 1
        L_0x00d6:
            int r3 = r3 + 1
            goto L_0x00c6
        L_0x00d9:
            if (r4 <= 0) goto L_0x00f3
            int r5 = r5 - r4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r5]
            r3 = 0
            r5 = 0
        L_0x00e0:
            int r4 = r8.f21717x0
            if (r3 >= r4) goto L_0x00f3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r8.f21716w0
            r4 = r4[r3]
            int r1 = r4.f2429j0
            if (r1 == r7) goto L_0x00f0
            r2[r5] = r4
            int r5 = r5 + 1
        L_0x00f0:
            int r3 = r3 + 1
            goto L_0x00e0
        L_0x00f3:
            r7 = r2
            r8.f2554g1 = r7
            r8.f2555h1 = r5
            int r1 = r8.f2547Z0
            if (r1 == 0) goto L_0x0739
            if (r1 == r9) goto L_0x0536
            if (r1 == r0) goto L_0x036f
            r0 = 3
            if (r1 == r0) goto L_0x0104
            goto L_0x0108
        L_0x0104:
            int r4 = r8.f2549b1
            if (r5 != 0) goto L_0x0114
        L_0x0108:
            r28 = r11
            r29 = r12
            r31 = r13
            r30 = r14
            r32 = r15
            goto L_0x074a
        L_0x0114:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.clear()
            androidx.constraintlayout.core.widgets.e$a r3 = new androidx.constraintlayout.core.widgets.e$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r8.f2397N
            r16 = r0
            r0 = r3
            r17 = r1
            r1 = r33
            r18 = r2
            r2 = r4
            r9 = r3
            r3 = r18
            r27 = r4
            r4 = r17
            r28 = r11
            r11 = r5
            r5 = r16
            r29 = r6
            r6 = r10
            r10 = r7
            r7 = r29
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.add(r9)
            if (r27 != 0) goto L_0x01e9
            r3 = r9
            r0 = 0
            r1 = 0
            r2 = 0
            r9 = 0
        L_0x014e:
            if (r9 >= r11) goto L_0x01dd
            r4 = 1
            int r7 = r0 + 1
            r6 = r10[r9]
            r5 = r29
            int r16 = r8.mo2840Y(r5, r6)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r6.f2405V
            r4 = 0
            r0 = r0[r4]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r4) goto L_0x0166
            int r1 = r1 + 1
        L_0x0166:
            r17 = r1
            if (r2 == r5) goto L_0x0171
            int r0 = r8.f2543V0
            int r0 = r0 + r2
            int r0 = r0 + r16
            if (r0 <= r5) goto L_0x0177
        L_0x0171:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.f2557b
            if (r0 == 0) goto L_0x0177
            r0 = 1
            goto L_0x0178
        L_0x0177:
            r0 = 0
        L_0x0178:
            if (r0 != 0) goto L_0x0183
            if (r9 <= 0) goto L_0x0183
            int r1 = r8.f2548a1
            if (r1 <= 0) goto L_0x0183
            if (r7 <= r1) goto L_0x0183
            r0 = 1
        L_0x0183:
            if (r0 == 0) goto L_0x01bc
            androidx.constraintlayout.core.widgets.e$a r4 = new androidx.constraintlayout.core.widgets.e$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r8.f2397N
            r18 = r0
            r0 = r4
            r19 = r1
            r1 = r33
            r20 = r2
            r2 = r27
            r29 = r12
            r12 = r4
            r4 = r20
            r30 = r5
            r5 = r19
            r31 = r13
            r13 = r6
            r6 = r18
            r18 = r7
            r7 = r30
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r12.f2569n = r9
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.add(r12)
            r3 = r12
            r2 = r16
            r0 = r18
            goto L_0x01ce
        L_0x01bc:
            r30 = r5
            r29 = r12
            r31 = r13
            r13 = r6
            if (r9 <= 0) goto L_0x01cb
            int r0 = r8.f2543V0
            int r0 = r0 + r16
            int r16 = r0 + r2
        L_0x01cb:
            r2 = r16
            r0 = 0
        L_0x01ce:
            r3.mo2841a(r13)
            int r9 = r9 + 1
            r1 = r17
            r12 = r29
            r29 = r30
            r13 = r31
            goto L_0x014e
        L_0x01dd:
            r31 = r13
            r30 = r29
            r29 = r12
            r13 = r30
            r30 = r14
            goto L_0x0264
        L_0x01e9:
            r31 = r13
            r30 = r29
            r29 = r12
            r3 = r9
            r0 = 0
            r1 = 0
            r9 = 0
        L_0x01f3:
            if (r9 >= r11) goto L_0x025f
            r12 = r10[r9]
            r13 = r30
            int r16 = r8.mo2839X(r13, r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r12.f2405V
            r4 = 1
            r2 = r2[r4]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x0208
            int r0 = r0 + 1
        L_0x0208:
            r17 = r0
            if (r1 == r13) goto L_0x0213
            int r0 = r8.f2544W0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r13) goto L_0x0219
        L_0x0213:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.f2557b
            if (r0 == 0) goto L_0x0219
            r0 = 1
            goto L_0x021a
        L_0x0219:
            r0 = 0
        L_0x021a:
            if (r0 != 0) goto L_0x0225
            if (r9 <= 0) goto L_0x0225
            int r2 = r8.f2548a1
            if (r2 <= 0) goto L_0x0225
            if (r2 >= 0) goto L_0x0225
            r0 = 1
        L_0x0225:
            if (r0 == 0) goto L_0x0246
            androidx.constraintlayout.core.widgets.e$a r7 = new androidx.constraintlayout.core.widgets.e$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.f2397N
            r0 = r7
            r1 = r33
            r2 = r27
            r30 = r14
            r14 = r7
            r7 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r14.f2569n = r9
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.add(r14)
            r3 = r14
            goto L_0x0251
        L_0x0246:
            r30 = r14
            if (r9 <= 0) goto L_0x0251
            int r0 = r8.f2544W0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0253
        L_0x0251:
            r1 = r16
        L_0x0253:
            r3.mo2841a(r12)
            int r9 = r9 + 1
            r0 = r17
            r14 = r30
            r30 = r13
            goto L_0x01f3
        L_0x025f:
            r13 = r30
            r30 = r14
            r1 = r0
        L_0x0264:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            int r0 = r0.size()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2397N
            int r6 = r8.f2584C0
            int r7 = r8.f2591y0
            int r9 = r8.f2585D0
            int r10 = r8.f2592z0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r11 = r8.f2405V
            r12 = 0
            r14 = r11[r12]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r14 == r12) goto L_0x028b
            r14 = 1
            r11 = r11[r14]
            if (r11 != r12) goto L_0x0289
            goto L_0x028b
        L_0x0289:
            r11 = 0
            goto L_0x028c
        L_0x028b:
            r11 = 1
        L_0x028c:
            if (r1 <= 0) goto L_0x02b3
            if (r11 == 0) goto L_0x02b3
            r1 = 0
        L_0x0291:
            if (r1 >= r0) goto L_0x02b3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r11 = r8.f2550c1
            java.lang.Object r11 = r11.get(r1)
            androidx.constraintlayout.core.widgets.e$a r11 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r11
            if (r27 != 0) goto L_0x02a7
            int r12 = r11.mo2844d()
            int r12 = r13 - r12
            r11.mo2845e(r12)
            goto L_0x02b0
        L_0x02a7:
            int r12 = r11.mo2843c()
            int r12 = r13 - r12
            r11.mo2845e(r12)
        L_0x02b0:
            int r1 = r1 + 1
            goto L_0x0291
        L_0x02b3:
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x02b6:
            if (r1 >= r0) goto L_0x0365
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r14 = r8.f2550c1
            java.lang.Object r14 = r14.get(r1)
            androidx.constraintlayout.core.widgets.e$a r14 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r14
            if (r27 != 0) goto L_0x0312
            int r5 = r0 + -1
            if (r1 >= r5) goto L_0x02d8
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r5 = r8.f2550c1
            int r10 = r1 + 1
            java.lang.Object r5 = r5.get(r10)
            androidx.constraintlayout.core.widgets.e$a r5 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2557b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f2395L
            r32 = r15
            r10 = 0
            goto L_0x02de
        L_0x02d8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2397N
            int r10 = r8.f2592z0
            r32 = r15
        L_0x02de:
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = r14.f2557b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r15.f2397N
            r16 = r14
            r17 = r27
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r10
            r26 = r13
            r16.mo2846f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r14.mo2844d()
            int r3 = java.lang.Math.max(r11, r3)
            int r7 = r14.mo2843c()
            int r7 = r7 + r12
            if (r1 <= 0) goto L_0x030d
            int r11 = r8.f2544W0
            int r7 = r7 + r11
        L_0x030d:
            r11 = r3
            r12 = r7
            r3 = r15
            r7 = 0
            goto L_0x035f
        L_0x0312:
            r32 = r15
            int r4 = r0 + -1
            if (r1 >= r4) goto L_0x0328
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r4 = r8.f2550c1
            int r9 = r1 + 1
            java.lang.Object r4 = r4.get(r9)
            androidx.constraintlayout.core.widgets.e$a r4 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r4
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.f2557b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.f2394K
            r9 = 0
            goto L_0x032c
        L_0x0328:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2396M
            int r9 = r8.f2585D0
        L_0x032c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r15 = r14.f2557b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r15.f2396M
            r16 = r14
            r17 = r27
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r25 = r10
            r26 = r13
            r16.mo2846f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r14.mo2844d()
            int r2 = r2 + r11
            int r6 = r14.mo2843c()
            int r6 = java.lang.Math.max(r12, r6)
            if (r1 <= 0) goto L_0x035b
            int r11 = r8.f2543V0
            int r2 = r2 + r11
        L_0x035b:
            r11 = r2
            r12 = r6
            r2 = r15
            r6 = 0
        L_0x035f:
            int r1 = r1 + 1
            r15 = r32
            goto L_0x02b6
        L_0x0365:
            r32 = r15
            r1 = 0
            r32[r1] = r11
            r0 = 1
            r32[r0] = r12
            goto L_0x074a
        L_0x036f:
            r10 = r7
            r28 = r11
            r29 = r12
            r31 = r13
            r30 = r14
            r32 = r15
            r11 = r5
            r13 = r6
            int r1 = r8.f2549b1
            if (r1 != 0) goto L_0x03a5
            int r2 = r8.f2548a1
            if (r2 > 0) goto L_0x03a2
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0387:
            if (r2 >= r11) goto L_0x03a1
            if (r2 <= 0) goto L_0x038e
            int r5 = r8.f2543V0
            int r3 = r3 + r5
        L_0x038e:
            r5 = r10[r2]
            if (r5 != 0) goto L_0x0393
            goto L_0x039e
        L_0x0393:
            int r5 = r8.mo2840Y(r13, r5)
            int r5 = r5 + r3
            if (r5 <= r13) goto L_0x039b
            goto L_0x03a1
        L_0x039b:
            int r4 = r4 + 1
            r3 = r5
        L_0x039e:
            int r2 = r2 + 1
            goto L_0x0387
        L_0x03a1:
            r2 = r4
        L_0x03a2:
            r3 = r2
            r2 = 0
            goto L_0x03c8
        L_0x03a5:
            int r2 = r8.f2548a1
            if (r2 > 0) goto L_0x03c7
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x03ac:
            if (r2 >= r11) goto L_0x03c6
            if (r2 <= 0) goto L_0x03b3
            int r5 = r8.f2544W0
            int r3 = r3 + r5
        L_0x03b3:
            r5 = r10[r2]
            if (r5 != 0) goto L_0x03b8
            goto L_0x03c3
        L_0x03b8:
            int r5 = r8.mo2839X(r13, r5)
            int r5 = r5 + r3
            if (r5 <= r13) goto L_0x03c0
            goto L_0x03c6
        L_0x03c0:
            int r4 = r4 + 1
            r3 = r5
        L_0x03c3:
            int r2 = r2 + 1
            goto L_0x03ac
        L_0x03c6:
            r2 = r4
        L_0x03c7:
            r3 = 0
        L_0x03c8:
            int[] r4 = r8.f2553f1
            if (r4 != 0) goto L_0x03d0
            int[] r0 = new int[r0]
            r8.f2553f1 = r0
        L_0x03d0:
            if (r2 != 0) goto L_0x03d5
            r0 = 1
            if (r1 == r0) goto L_0x03d9
        L_0x03d5:
            if (r3 != 0) goto L_0x03f3
            if (r1 != 0) goto L_0x03f3
        L_0x03d9:
            r4 = r37
            r5 = r1
            r6 = r2
            r7 = r3
            r17 = r8
            r18 = r10
            r12 = r29
            r14 = r30
            r15 = r32
            r0 = 1
            r1 = r34
            r2 = r35
            r3 = r36
            r10 = r17
            goto L_0x050e
        L_0x03f3:
            r0 = r34
            r4 = r1
            r5 = r2
            r6 = r3
            r17 = r8
            r7 = r10
            r12 = r29
            r14 = r30
            r15 = r32
            r9 = 0
            r1 = r35
            r2 = r36
            r3 = r37
            r10 = r17
        L_0x040a:
            if (r9 != 0) goto L_0x051a
            if (r4 != 0) goto L_0x041d
            float r5 = (float) r11
            r34 = r0
            float r0 = (float) r6
            float r5 = r5 / r0
            r35 = r1
            double r0 = (double) r5
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r5 = r0
            goto L_0x042b
        L_0x041d:
            r34 = r0
            r35 = r1
            float r0 = (float) r11
            float r1 = (float) r5
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r6 = r0
        L_0x042b:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r10.f2552e1
            if (r0 == 0) goto L_0x0438
            int r1 = r0.length
            if (r1 >= r6) goto L_0x0433
            goto L_0x0438
        L_0x0433:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            goto L_0x043d
        L_0x0438:
            r1 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r6]
            r10.f2552e1 = r0
        L_0x043d:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r10.f2551d1
            if (r0 == 0) goto L_0x044a
            int r1 = r0.length
            if (r1 >= r5) goto L_0x0445
            goto L_0x044a
        L_0x0445:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            goto L_0x044e
        L_0x044a:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r5]
            r10.f2551d1 = r0
        L_0x044e:
            r0 = 0
        L_0x044f:
            if (r0 >= r6) goto L_0x04ac
            r1 = 0
        L_0x0452:
            if (r1 >= r5) goto L_0x04a3
            int r18 = r1 * r6
            int r18 = r18 + r0
            r36 = r2
            r2 = 1
            if (r4 != r2) goto L_0x0461
            int r2 = r0 * r5
            int r18 = r2 + r1
        L_0x0461:
            r37 = r3
            r2 = r18
            int r3 = r7.length
            if (r2 < r3) goto L_0x046b
        L_0x0468:
            r18 = r7
            goto L_0x049a
        L_0x046b:
            r2 = r7[r2]
            if (r2 != 0) goto L_0x0470
            goto L_0x0468
        L_0x0470:
            int r3 = r10.mo2840Y(r13, r2)
            r18 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r10.f2552e1
            r7 = r7[r0]
            if (r7 == 0) goto L_0x0482
            int r7 = r7.mo2807u()
            if (r7 >= r3) goto L_0x0486
        L_0x0482:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r10.f2552e1
            r3[r0] = r2
        L_0x0486:
            int r3 = r10.mo2839X(r13, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r7 = r10.f2551d1
            r7 = r7[r1]
            if (r7 == 0) goto L_0x0496
            int r7 = r7.mo2802o()
            if (r7 >= r3) goto L_0x049a
        L_0x0496:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r10.f2551d1
            r3[r1] = r2
        L_0x049a:
            int r1 = r1 + 1
            r2 = r36
            r3 = r37
            r7 = r18
            goto L_0x0452
        L_0x04a3:
            r36 = r2
            r37 = r3
            r18 = r7
            int r0 = r0 + 1
            goto L_0x044f
        L_0x04ac:
            r36 = r2
            r37 = r3
            r18 = r7
            r0 = 0
            r1 = 0
        L_0x04b4:
            if (r0 >= r6) goto L_0x04ca
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r10.f2552e1
            r2 = r2[r0]
            if (r2 == 0) goto L_0x04c7
            if (r0 <= 0) goto L_0x04c1
            int r3 = r10.f2543V0
            int r1 = r1 + r3
        L_0x04c1:
            int r2 = r10.mo2840Y(r13, r2)
            int r2 = r2 + r1
            r1 = r2
        L_0x04c7:
            int r0 = r0 + 1
            goto L_0x04b4
        L_0x04ca:
            r0 = 0
            r2 = 0
        L_0x04cc:
            if (r0 >= r5) goto L_0x04e2
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = r10.f2551d1
            r3 = r3[r0]
            if (r3 == 0) goto L_0x04df
            if (r0 <= 0) goto L_0x04d9
            int r7 = r10.f2544W0
            int r2 = r2 + r7
        L_0x04d9:
            int r3 = r10.mo2839X(r13, r3)
            int r3 = r3 + r2
            r2 = r3
        L_0x04df:
            int r0 = r0 + 1
            goto L_0x04cc
        L_0x04e2:
            r0 = 0
            r32[r0] = r1
            r0 = 1
            r32[r0] = r2
            if (r4 != 0) goto L_0x04f1
            if (r1 <= r13) goto L_0x0503
            if (r6 <= r0) goto L_0x0503
            int r6 = r6 + -1
            goto L_0x04f7
        L_0x04f1:
            if (r2 <= r13) goto L_0x0503
            if (r5 <= r0) goto L_0x0503
            int r5 = r5 + -1
        L_0x04f7:
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            r7 = r18
            goto L_0x040a
        L_0x0503:
            r1 = r34
            r2 = r35
            r3 = r36
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r37
        L_0x050e:
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r18
            r9 = 1
            goto L_0x040a
        L_0x051a:
            r34 = r0
            r35 = r1
            r36 = r2
            r37 = r3
            r0 = 1
            int[] r1 = r10.f2553f1
            r2 = 0
            r1[r2] = r6
            r1[r0] = r5
            r0 = r34
            r1 = r35
            r2 = r36
            r11 = r28
            r13 = r31
            goto L_0x075e
        L_0x0536:
            r10 = r7
            r28 = r11
            r29 = r12
            r31 = r13
            r30 = r14
            r32 = r15
            r11 = r5
            r13 = r6
            int r9 = r8.f2549b1
            if (r11 != 0) goto L_0x0549
            goto L_0x074a
        L_0x0549:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.clear()
            androidx.constraintlayout.core.widgets.e$a r12 = new androidx.constraintlayout.core.widgets.e$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.f2397N
            r0 = r12
            r1 = r33
            r2 = r9
            r7 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.add(r12)
            if (r9 != 0) goto L_0x05cb
            r0 = 0
            r1 = 0
            r14 = 0
        L_0x056a:
            if (r14 >= r11) goto L_0x062f
            r15 = r10[r14]
            int r16 = r8.mo2840Y(r13, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.f2405V
            r3 = 0
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x057d
            int r0 = r0 + 1
        L_0x057d:
            r17 = r0
            if (r1 == r13) goto L_0x0588
            int r0 = r8.f2543V0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r13) goto L_0x058e
        L_0x0588:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.f2557b
            if (r0 == 0) goto L_0x058e
            r0 = 1
            goto L_0x058f
        L_0x058e:
            r0 = 0
        L_0x058f:
            if (r0 != 0) goto L_0x059c
            if (r14 <= 0) goto L_0x059c
            int r2 = r8.f2548a1
            if (r2 <= 0) goto L_0x059c
            int r2 = r14 % r2
            if (r2 != 0) goto L_0x059c
            r0 = 1
        L_0x059c:
            if (r0 == 0) goto L_0x05b8
            androidx.constraintlayout.core.widgets.e$a r12 = new androidx.constraintlayout.core.widgets.e$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.f2397N
            r0 = r12
            r1 = r33
            r2 = r9
            r7 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r12.f2569n = r14
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.add(r12)
            goto L_0x05c1
        L_0x05b8:
            if (r14 <= 0) goto L_0x05c1
            int r0 = r8.f2543V0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x05c3
        L_0x05c1:
            r1 = r16
        L_0x05c3:
            r12.mo2841a(r15)
            int r14 = r14 + 1
            r0 = r17
            goto L_0x056a
        L_0x05cb:
            r0 = 0
            r1 = 0
            r14 = 0
        L_0x05ce:
            if (r14 >= r11) goto L_0x062f
            r15 = r10[r14]
            int r16 = r8.mo2839X(r13, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r15.f2405V
            r3 = 1
            r2 = r2[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x05e1
            int r0 = r0 + 1
        L_0x05e1:
            r17 = r0
            if (r1 == r13) goto L_0x05ec
            int r0 = r8.f2544W0
            int r0 = r0 + r1
            int r0 = r0 + r16
            if (r0 <= r13) goto L_0x05f2
        L_0x05ec:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r12.f2557b
            if (r0 == 0) goto L_0x05f2
            r0 = 1
            goto L_0x05f3
        L_0x05f2:
            r0 = 0
        L_0x05f3:
            if (r0 != 0) goto L_0x0600
            if (r14 <= 0) goto L_0x0600
            int r2 = r8.f2548a1
            if (r2 <= 0) goto L_0x0600
            int r2 = r14 % r2
            if (r2 != 0) goto L_0x0600
            r0 = 1
        L_0x0600:
            if (r0 == 0) goto L_0x061c
            androidx.constraintlayout.core.widgets.e$a r12 = new androidx.constraintlayout.core.widgets.e$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.f2397N
            r0 = r12
            r1 = r33
            r2 = r9
            r7 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r12.f2569n = r14
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.add(r12)
            goto L_0x0625
        L_0x061c:
            if (r14 <= 0) goto L_0x0625
            int r0 = r8.f2544W0
            int r0 = r0 + r16
            int r0 = r0 + r1
            r1 = r0
            goto L_0x0627
        L_0x0625:
            r1 = r16
        L_0x0627:
            r12.mo2841a(r15)
            int r14 = r14 + 1
            r0 = r17
            goto L_0x05ce
        L_0x062f:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r1 = r8.f2550c1
            int r1 = r1.size()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2397N
            int r6 = r8.f2584C0
            int r7 = r8.f2591y0
            int r10 = r8.f2585D0
            int r11 = r8.f2592z0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r12 = r8.f2405V
            r14 = 0
            r15 = r12[r14]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r15 == r14) goto L_0x0656
            r15 = 1
            r12 = r12[r15]
            if (r12 != r14) goto L_0x0654
            goto L_0x0656
        L_0x0654:
            r12 = 0
            goto L_0x0657
        L_0x0656:
            r12 = 1
        L_0x0657:
            if (r0 <= 0) goto L_0x067e
            if (r12 == 0) goto L_0x067e
            r0 = 0
        L_0x065c:
            if (r0 >= r1) goto L_0x067e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r12 = r8.f2550c1
            java.lang.Object r12 = r12.get(r0)
            androidx.constraintlayout.core.widgets.e$a r12 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r12
            if (r9 != 0) goto L_0x0672
            int r14 = r12.mo2844d()
            int r14 = r13 - r14
            r12.mo2845e(r14)
            goto L_0x067b
        L_0x0672:
            int r14 = r12.mo2843c()
            int r14 = r13 - r14
            r12.mo2845e(r14)
        L_0x067b:
            int r0 = r0 + 1
            goto L_0x065c
        L_0x067e:
            r0 = 0
            r12 = 0
            r14 = 0
        L_0x0681:
            if (r0 >= r1) goto L_0x0732
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r15 = r8.f2550c1
            java.lang.Object r15 = r15.get(r0)
            androidx.constraintlayout.core.widgets.e$a r15 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r15
            if (r9 != 0) goto L_0x06dd
            int r5 = r1 + -1
            if (r0 >= r5) goto L_0x06a3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r5 = r8.f2550c1
            int r11 = r0 + 1
            java.lang.Object r5 = r5.get(r11)
            androidx.constraintlayout.core.widgets.e$a r5 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r5.f2557b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.f2395L
            r27 = r1
            r11 = 0
            goto L_0x06a9
        L_0x06a3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2397N
            int r11 = r8.f2592z0
            r27 = r1
        L_0x06a9:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r15.f2557b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2397N
            r16 = r15
            r17 = r9
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r10
            r25 = r11
            r26 = r13
            r16.mo2846f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r15.mo2844d()
            int r3 = java.lang.Math.max(r12, r3)
            int r7 = r15.mo2843c()
            int r7 = r7 + r14
            if (r0 <= 0) goto L_0x06d8
            int r12 = r8.f2544W0
            int r7 = r7 + r12
        L_0x06d8:
            r12 = r3
            r14 = r7
            r7 = 0
            r3 = r1
            goto L_0x072c
        L_0x06dd:
            r27 = r1
            int r1 = r27 + -1
            if (r0 >= r1) goto L_0x06f3
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r1 = r8.f2550c1
            int r4 = r0 + 1
            java.lang.Object r1 = r1.get(r4)
            androidx.constraintlayout.core.widgets.e$a r1 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r1
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f2557b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2394K
            r4 = 0
            goto L_0x06f7
        L_0x06f3:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.f2396M
            int r4 = r8.f2585D0
        L_0x06f7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r15.f2557b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.f2396M
            r16 = r15
            r17 = r9
            r18 = r2
            r19 = r3
            r20 = r1
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r4
            r25 = r11
            r26 = r13
            r16.mo2846f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r2 = r15.mo2844d()
            int r2 = r2 + r12
            int r6 = r15.mo2843c()
            int r6 = java.lang.Math.max(r14, r6)
            if (r0 <= 0) goto L_0x0726
            int r12 = r8.f2543V0
            int r2 = r2 + r12
        L_0x0726:
            r12 = r2
            r14 = r6
            r2 = r10
            r6 = 0
            r10 = r4
            r4 = r1
        L_0x072c:
            int r0 = r0 + 1
            r1 = r27
            goto L_0x0681
        L_0x0732:
            r0 = 0
            r32[r0] = r12
            r0 = 1
            r32[r0] = r14
            goto L_0x074a
        L_0x0739:
            r10 = r7
            r28 = r11
            r29 = r12
            r31 = r13
            r30 = r14
            r32 = r15
            r11 = r5
            r13 = r6
            int r2 = r8.f2549b1
            if (r11 != 0) goto L_0x0767
        L_0x074a:
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            r17 = r8
            r11 = r28
            r12 = r29
            r14 = r30
            r13 = r31
            r15 = r32
        L_0x075e:
            r5 = r3
            r6 = r17
            r4 = 0
            r3 = r2
            r2 = r1
            r1 = 1
            goto L_0x07f4
        L_0x0767:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0786
            androidx.constraintlayout.core.widgets.e$a r9 = new androidx.constraintlayout.core.widgets.e$a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.f2397N
            r0 = r9
            r1 = r33
            r7 = r13
            r0.<init>(r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r0.add(r9)
            goto L_0x07c8
        L_0x0786:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.e$a> r0 = r8.f2550c1
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r9 = r0
            androidx.constraintlayout.core.widgets.e$a r9 = (androidx.constraintlayout.core.widgets.C0698e.C0699a) r9
            r9.f2558c = r1
            r0 = 0
            r9.f2557b = r0
            r9.f2567l = r1
            r9.f2568m = r1
            r9.f2569n = r1
            r9.f2570o = r1
            r9.f2571p = r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r8.f2394K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.f2395L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.f2396M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.f2397N
            int r5 = r8.f2584C0
            int r6 = r8.f2591y0
            int r7 = r8.f2585D0
            int r12 = r8.f2592z0
            r16 = r9
            r17 = r2
            r18 = r0
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r12
            r26 = r13
            r16.mo2846f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x07c8:
            r4 = 0
        L_0x07c9:
            if (r4 >= r11) goto L_0x07d3
            r0 = r10[r4]
            r9.mo2841a(r0)
            int r4 = r4 + 1
            goto L_0x07c9
        L_0x07d3:
            int r0 = r9.mo2844d()
            r4 = 0
            r32[r4] = r0
            int r0 = r9.mo2843c()
            r1 = 1
            r32[r1] = r0
            r0 = r34
            r2 = r35
            r3 = r36
            r5 = r37
            r6 = r8
            r11 = r28
            r12 = r29
            r14 = r30
            r13 = r31
            r15 = r32
        L_0x07f4:
            r7 = r15[r4]
            int r7 = r7 + r11
            int r7 = r7 + r12
            r9 = r15[r1]
            int r9 = r9 + r13
            int r9 = r9 + r14
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 1073741824(0x40000000, float:2.0)
            if (r0 != r11) goto L_0x0804
            r0 = r2
            goto L_0x0810
        L_0x0804:
            if (r0 != r10) goto L_0x080b
            int r0 = java.lang.Math.min(r7, r2)
            goto L_0x0810
        L_0x080b:
            if (r0 != 0) goto L_0x080f
            r0 = r7
            goto L_0x0810
        L_0x080f:
            r0 = 0
        L_0x0810:
            if (r3 != r11) goto L_0x0814
            r2 = r5
            goto L_0x0820
        L_0x0814:
            if (r3 != r10) goto L_0x081b
            int r2 = java.lang.Math.min(r9, r5)
            goto L_0x0820
        L_0x081b:
            if (r3 != 0) goto L_0x081f
            r2 = r9
            goto L_0x0820
        L_0x081f:
            r2 = 0
        L_0x0820:
            r6.f2587F0 = r0
            r6.f2588G0 = r2
            r6.mo2788R(r0)
            r6.mo2785O(r2)
            int r0 = r6.f21717x0
            if (r0 <= 0) goto L_0x0830
            r9 = 1
            goto L_0x0831
        L_0x0830:
            r9 = 0
        L_0x0831:
            r6.f2586E0 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0698e.mo2838V(int, int, int, int):void");
    }

    /* renamed from: X */
    public final int mo2839X(int i, ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f2405V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f2448t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f2384A * ((float) i));
                if (i3 != constraintWidget.mo2802o()) {
                    constraintWidget.f2422g = true;
                    mo2849W(constraintWidget, constraintWidget.f2405V[0], constraintWidget.mo2807u(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.mo2802o();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.mo2807u()) * constraintWidget.f2409Z) + 0.5f);
                }
            }
        }
        return constraintWidget.mo2802o();
    }

    /* renamed from: Y */
    public final int mo2840Y(int i, ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.f2405V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f2446s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f2455x * ((float) i));
                if (i3 != constraintWidget.mo2807u()) {
                    constraintWidget.f2422g = true;
                    mo2849W(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.f2405V[1], constraintWidget.mo2802o());
                }
                return i3;
            } else if (i2 == 1) {
                return constraintWidget.mo2807u();
            } else {
                if (i2 == 3) {
                    return (int) ((((float) constraintWidget.mo2802o()) * constraintWidget.f2409Z) + 0.5f);
                }
            }
        }
        return constraintWidget.mo2807u();
    }

    /* renamed from: e */
    public final void mo2792e(C0680c cVar, boolean z) {
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget;
        float f;
        int i;
        boolean z4;
        super.mo2792e(cVar, z);
        ConstraintWidget constraintWidget2 = this.f2406W;
        if (constraintWidget2 == null || !((C0697d) constraintWidget2).f2511B0) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i2 = this.f2547Z0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = this.f2550c1.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0699a aVar = this.f2550c1.get(i3);
                    if (i3 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    aVar.mo2842b(i3, z2, z3);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = this.f2550c1.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        C0699a aVar2 = this.f2550c1.get(i4);
                        if (i4 == size2 - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        aVar2.mo2842b(i4, z2, z4);
                    }
                }
            } else if (!(this.f2553f1 == null || this.f2552e1 == null || this.f2551d1 == null)) {
                for (int i5 = 0; i5 < this.f2555h1; i5++) {
                    this.f2554g1[i5].mo2780H();
                }
                int[] iArr = this.f2553f1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                ConstraintWidget constraintWidget3 = null;
                float f2 = this.f2537P0;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.f2537P0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ConstraintWidget constraintWidget4 = this.f2552e1[i];
                    if (!(constraintWidget4 == null || constraintWidget4.f2429j0 == 8)) {
                        if (i8 == 0) {
                            constraintWidget4.mo2796i(constraintWidget4.f2394K, this.f2394K, this.f2584C0);
                            constraintWidget4.f2437n0 = this.f2531J0;
                            constraintWidget4.f2423g0 = f;
                        }
                        if (i8 == i6 - 1) {
                            constraintWidget4.mo2796i(constraintWidget4.f2396M, this.f2396M, this.f2585D0);
                        }
                        if (i8 > 0 && constraintWidget3 != null) {
                            constraintWidget4.mo2796i(constraintWidget4.f2394K, constraintWidget3.f2396M, this.f2543V0);
                            constraintWidget3.mo2796i(constraintWidget3.f2396M, constraintWidget4.f2394K, 0);
                        }
                        constraintWidget3 = constraintWidget4;
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ConstraintWidget constraintWidget5 = this.f2551d1[i9];
                    if (!(constraintWidget5 == null || constraintWidget5.f2429j0 == 8)) {
                        if (i9 == 0) {
                            constraintWidget5.mo2796i(constraintWidget5.f2395L, this.f2395L, this.f2591y0);
                            constraintWidget5.f2439o0 = this.f2532K0;
                            constraintWidget5.f2425h0 = this.f2538Q0;
                        }
                        if (i9 == i7 - 1) {
                            constraintWidget5.mo2796i(constraintWidget5.f2397N, this.f2397N, this.f2592z0);
                        }
                        if (i9 > 0 && constraintWidget3 != null) {
                            constraintWidget5.mo2796i(constraintWidget5.f2395L, constraintWidget3.f2397N, this.f2544W0);
                            constraintWidget3.mo2796i(constraintWidget3.f2397N, constraintWidget5.f2395L, 0);
                        }
                        constraintWidget3 = constraintWidget5;
                    }
                }
                for (int i11 = 0; i11 < i6; i11++) {
                    for (int i12 = 0; i12 < i7; i12++) {
                        int i13 = (i12 * i6) + i11;
                        if (this.f2549b1 == 1) {
                            i13 = (i11 * i7) + i12;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f2554g1;
                        if (!(i13 >= constraintWidgetArr.length || (constraintWidget = constraintWidgetArr[i13]) == null || constraintWidget.f2429j0 == 8)) {
                            ConstraintWidget constraintWidget6 = this.f2552e1[i11];
                            ConstraintWidget constraintWidget7 = this.f2551d1[i12];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.mo2796i(constraintWidget.f2394K, constraintWidget6.f2394K, 0);
                                constraintWidget.mo2796i(constraintWidget.f2396M, constraintWidget6.f2396M, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.mo2796i(constraintWidget.f2395L, constraintWidget7.f2395L, 0);
                                constraintWidget.mo2796i(constraintWidget.f2397N, constraintWidget7.f2397N, 0);
                            }
                        }
                    }
                }
            }
        } else if (this.f2550c1.size() > 0) {
            this.f2550c1.get(0).mo2842b(0, z2, true);
        }
        this.f2586E0 = false;
    }

    /* renamed from: j */
    public final void mo2797j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo2797j(constraintWidget, hashMap);
        C0698e eVar = (C0698e) constraintWidget;
        this.f2531J0 = eVar.f2531J0;
        this.f2532K0 = eVar.f2532K0;
        this.f2533L0 = eVar.f2533L0;
        this.f2534M0 = eVar.f2534M0;
        this.f2535N0 = eVar.f2535N0;
        this.f2536O0 = eVar.f2536O0;
        this.f2537P0 = eVar.f2537P0;
        this.f2538Q0 = eVar.f2538Q0;
        this.f2539R0 = eVar.f2539R0;
        this.f2540S0 = eVar.f2540S0;
        this.f2541T0 = eVar.f2541T0;
        this.f2542U0 = eVar.f2542U0;
        this.f2543V0 = eVar.f2543V0;
        this.f2544W0 = eVar.f2544W0;
        this.f2545X0 = eVar.f2545X0;
        this.f2546Y0 = eVar.f2546Y0;
        this.f2547Z0 = eVar.f2547Z0;
        this.f2548a1 = eVar.f2548a1;
        this.f2549b1 = eVar.f2549b1;
    }
}
