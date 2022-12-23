package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0678b;
import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.core.widgets.f */
public final class C0700f extends ConstraintWidget {

    /* renamed from: A0 */
    public int f2574A0;

    /* renamed from: B0 */
    public boolean f2575B0;

    /* renamed from: w0 */
    public float f2576w0 = -1.0f;

    /* renamed from: x0 */
    public int f2577x0 = -1;

    /* renamed from: y0 */
    public int f2578y0 = -1;

    /* renamed from: z0 */
    public ConstraintAnchor f2579z0 = this.f2395L;

    /* renamed from: androidx.constraintlayout.core.widgets.f$a */
    public static /* synthetic */ class C0701a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2580a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2580a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2580a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2580a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2580a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2580a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2580a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2580a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2580a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2580a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.C0700f.C0701a.<clinit>():void");
        }
    }

    public C0700f() {
        this.f2574A0 = 0;
        this.f2403T.clear();
        this.f2403T.add(this.f2579z0);
        int length = this.f2402S.length;
        for (int i = 0; i < length; i++) {
            this.f2402S[i] = this.f2579z0;
        }
    }

    /* renamed from: E */
    public final boolean mo2777E() {
        return this.f2575B0;
    }

    /* renamed from: F */
    public final boolean mo2778F() {
        return this.f2575B0;
    }

    /* renamed from: T */
    public final void mo2790T(C0680c cVar, boolean z) {
        if (this.f2406W != null) {
            ConstraintAnchor constraintAnchor = this.f2579z0;
            cVar.getClass();
            int n = C0680c.m1925n(constraintAnchor);
            if (this.f2574A0 == 1) {
                this.f2413b0 = n;
                this.f2415c0 = 0;
                mo2785O(this.f2406W.mo2802o());
                mo2788R(0);
                return;
            }
            this.f2413b0 = 0;
            this.f2415c0 = n;
            mo2788R(this.f2406W.mo2807u());
            mo2785O(0);
        }
    }

    /* renamed from: U */
    public final void mo2847U(int i) {
        this.f2579z0.mo2771l(i);
        this.f2575B0 = true;
    }

    /* renamed from: V */
    public final void mo2848V(int i) {
        if (this.f2574A0 != i) {
            this.f2574A0 = i;
            this.f2403T.clear();
            if (this.f2574A0 == 1) {
                this.f2579z0 = this.f2394K;
            } else {
                this.f2579z0 = this.f2395L;
            }
            this.f2403T.add(this.f2579z0);
            int length = this.f2402S.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f2402S[i2] = this.f2579z0;
            }
        }
    }

    /* renamed from: e */
    public final void mo2792e(C0680c cVar, boolean z) {
        boolean z2;
        C0697d dVar = (C0697d) this.f2406W;
        if (dVar != null) {
            ConstraintAnchor m = dVar.mo2800m(ConstraintAnchor.Type.LEFT);
            ConstraintAnchor m2 = dVar.mo2800m(ConstraintAnchor.Type.RIGHT);
            ConstraintWidget constraintWidget = this.f2406W;
            boolean z3 = true;
            if (constraintWidget == null || constraintWidget.f2405V[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f2574A0 == 0) {
                m = dVar.mo2800m(ConstraintAnchor.Type.TOP);
                m2 = dVar.mo2800m(ConstraintAnchor.Type.BOTTOM);
                ConstraintWidget constraintWidget2 = this.f2406W;
                if (constraintWidget2 == null || constraintWidget2.f2405V[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    z3 = false;
                }
                z2 = z3;
            }
            if (this.f2575B0) {
                ConstraintAnchor constraintAnchor = this.f2579z0;
                if (constraintAnchor.f2376c) {
                    SolverVariable k = cVar.mo2747k(constraintAnchor);
                    cVar.mo2740d(k, this.f2579z0.mo2763d());
                    if (this.f2577x0 != -1) {
                        if (z2) {
                            cVar.mo2742f(cVar.mo2747k(m2), k, 0, 5);
                        }
                    } else if (this.f2578y0 != -1 && z2) {
                        SolverVariable k2 = cVar.mo2747k(m2);
                        cVar.mo2742f(k, cVar.mo2747k(m), 0, 5);
                        cVar.mo2742f(k2, k, 0, 5);
                    }
                    this.f2575B0 = false;
                    return;
                }
            }
            if (this.f2577x0 != -1) {
                SolverVariable k3 = cVar.mo2747k(this.f2579z0);
                cVar.mo2741e(k3, cVar.mo2747k(m), this.f2577x0, 8);
                if (z2) {
                    cVar.mo2742f(cVar.mo2747k(m2), k3, 0, 5);
                }
            } else if (this.f2578y0 != -1) {
                SolverVariable k4 = cVar.mo2747k(this.f2579z0);
                SolverVariable k5 = cVar.mo2747k(m2);
                cVar.mo2741e(k4, k5, -this.f2578y0, 8);
                if (z2) {
                    cVar.mo2742f(k4, cVar.mo2747k(m), 0, 5);
                    cVar.mo2742f(k5, k4, 0, 5);
                }
            } else if (this.f2576w0 != -1.0f) {
                SolverVariable k6 = cVar.mo2747k(this.f2579z0);
                SolverVariable k7 = cVar.mo2747k(m2);
                float f = this.f2576w0;
                C0678b l = cVar.mo2748l();
                l.f2349d.mo2722h(k6, -1.0f);
                l.f2349d.mo2722h(k7, f);
                cVar.mo2739c(l);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo2793f() {
        return true;
    }

    /* renamed from: j */
    public final void mo2797j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo2797j(constraintWidget, hashMap);
        C0700f fVar = (C0700f) constraintWidget;
        this.f2576w0 = fVar.f2576w0;
        this.f2577x0 = fVar.f2577x0;
        this.f2578y0 = fVar.f2578y0;
        mo2848V(fVar.f2574A0);
    }

    /* renamed from: m */
    public final ConstraintAnchor mo2800m(ConstraintAnchor.Type type) {
        int i = C0701a.f2580a[type.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f2574A0 == 1) {
                return this.f2579z0;
            }
            return null;
        } else if ((i == 3 || i == 4) && this.f2574A0 == 0) {
            return this.f2579z0;
        } else {
            return null;
        }
    }
}
