package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0678b;
import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import p001a0.C0016g;
import p292w0.C6961b;

/* renamed from: androidx.constraintlayout.core.widgets.a */
public final class C0687a extends C6961b {

    /* renamed from: A0 */
    public int f2460A0 = 0;

    /* renamed from: B0 */
    public boolean f2461B0 = false;

    /* renamed from: y0 */
    public int f2462y0 = 0;

    /* renamed from: z0 */
    public boolean f2463z0 = true;

    /* renamed from: E */
    public final boolean mo2777E() {
        return this.f2461B0;
    }

    /* renamed from: F */
    public final boolean mo2778F() {
        return this.f2461B0;
    }

    /* renamed from: V */
    public final boolean mo2813V() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f21717x0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.f21716w0[i4];
            if ((this.f2463z0 || constraintWidget.mo2793f()) && ((((i2 = this.f2462y0) == 0 || i2 == 1) && !constraintWidget.mo2777E()) || (((i3 = this.f2462y0) == 2 || i3 == 3) && !constraintWidget.mo2778F()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f21717x0; i6++) {
            ConstraintWidget constraintWidget2 = this.f21716w0[i6];
            if (this.f2463z0 || constraintWidget2.mo2793f()) {
                if (!z2) {
                    int i7 = this.f2462y0;
                    if (i7 == 0) {
                        i5 = constraintWidget2.mo2800m(ConstraintAnchor.Type.LEFT).mo2763d();
                    } else if (i7 == 1) {
                        i5 = constraintWidget2.mo2800m(ConstraintAnchor.Type.RIGHT).mo2763d();
                    } else if (i7 == 2) {
                        i5 = constraintWidget2.mo2800m(ConstraintAnchor.Type.TOP).mo2763d();
                    } else if (i7 == 3) {
                        i5 = constraintWidget2.mo2800m(ConstraintAnchor.Type.BOTTOM).mo2763d();
                    }
                    z2 = true;
                }
                int i8 = this.f2462y0;
                if (i8 == 0) {
                    i5 = Math.min(i5, constraintWidget2.mo2800m(ConstraintAnchor.Type.LEFT).mo2763d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, constraintWidget2.mo2800m(ConstraintAnchor.Type.RIGHT).mo2763d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, constraintWidget2.mo2800m(ConstraintAnchor.Type.TOP).mo2763d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, constraintWidget2.mo2800m(ConstraintAnchor.Type.BOTTOM).mo2763d());
                }
            }
        }
        int i9 = i5 + this.f2460A0;
        int i11 = this.f2462y0;
        if (i11 == 0 || i11 == 1) {
            mo2783M(i9, i9);
        } else {
            mo2784N(i9, i9);
        }
        this.f2461B0 = true;
        return true;
    }

    /* renamed from: W */
    public final int mo2814W() {
        int i = this.f2462y0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* renamed from: e */
    public final void mo2792e(C0680c cVar, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        int i3;
        ConstraintAnchor[] constraintAnchorArr2 = this.f2402S;
        constraintAnchorArr2[0] = this.f2394K;
        constraintAnchorArr2[2] = this.f2395L;
        constraintAnchorArr2[1] = this.f2396M;
        constraintAnchorArr2[3] = this.f2397N;
        int i4 = 0;
        while (true) {
            constraintAnchorArr = this.f2402S;
            if (i4 >= constraintAnchorArr.length) {
                break;
            }
            ConstraintAnchor constraintAnchor = constraintAnchorArr[i4];
            constraintAnchor.f2382i = cVar.mo2747k(constraintAnchor);
            i4++;
        }
        int i5 = this.f2462y0;
        if (i5 >= 0 && i5 < 4) {
            ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i5];
            if (!this.f2461B0) {
                mo2813V();
            }
            if (this.f2461B0) {
                this.f2461B0 = false;
                int i6 = this.f2462y0;
                if (i6 == 0 || i6 == 1) {
                    cVar.mo2740d(this.f2394K.f2382i, this.f2413b0);
                    cVar.mo2740d(this.f2396M.f2382i, this.f2413b0);
                } else if (i6 == 2 || i6 == 3) {
                    cVar.mo2740d(this.f2395L.f2382i, this.f2415c0);
                    cVar.mo2740d(this.f2397N.f2382i, this.f2415c0);
                }
            } else {
                int i7 = 0;
                while (true) {
                    if (i7 >= this.f21717x0) {
                        z2 = false;
                        break;
                    }
                    ConstraintWidget constraintWidget = this.f21716w0[i7];
                    if ((this.f2463z0 || constraintWidget.mo2793f()) && ((((i3 = this.f2462y0) == 0 || i3 == 1) && constraintWidget.f2405V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2394K.f2379f != null && constraintWidget.f2396M.f2379f != null) || ((i3 == 2 || i3 == 3) && constraintWidget.f2405V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2395L.f2379f != null && constraintWidget.f2397N.f2379f != null))) {
                        z2 = true;
                    } else {
                        i7++;
                    }
                }
                z2 = true;
                if (this.f2394K.mo2766g() || this.f2396M.mo2766g()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.f2395L.mo2766g() || this.f2397N.mo2766g()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2 || (((i2 = this.f2462y0) != 0 || !z3) && ((i2 != 2 || !z4) && ((i2 != 1 || !z3) && (i2 != 3 || !z4))))) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                int i8 = 5;
                if (!z5) {
                    i8 = 4;
                }
                for (int i9 = 0; i9 < this.f21717x0; i9++) {
                    ConstraintWidget constraintWidget2 = this.f21716w0[i9];
                    if (this.f2463z0 || constraintWidget2.mo2793f()) {
                        SolverVariable k = cVar.mo2747k(constraintWidget2.f2402S[this.f2462y0]);
                        ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f2402S;
                        int i11 = this.f2462y0;
                        ConstraintAnchor constraintAnchor3 = constraintAnchorArr3[i11];
                        constraintAnchor3.f2382i = k;
                        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2379f;
                        if (constraintAnchor4 == null || constraintAnchor4.f2377d != this) {
                            i = 0;
                        } else {
                            i = constraintAnchor3.f2380g + 0;
                        }
                        if (i11 == 0 || i11 == 2) {
                            C0678b l = cVar.mo2748l();
                            SolverVariable m = cVar.mo2749m();
                            m.f2327e = 0;
                            l.mo2730d(constraintAnchor2.f2382i, k, m, this.f2460A0 - i);
                            cVar.mo2739c(l);
                        } else {
                            C0678b l2 = cVar.mo2748l();
                            SolverVariable m2 = cVar.mo2749m();
                            m2.f2327e = 0;
                            l2.mo2729c(constraintAnchor2.f2382i, k, m2, this.f2460A0 + i);
                            cVar.mo2739c(l2);
                        }
                        cVar.mo2741e(constraintAnchor2.f2382i, k, this.f2460A0 + i, i8);
                    }
                }
                int i12 = this.f2462y0;
                if (i12 == 0) {
                    cVar.mo2741e(this.f2396M.f2382i, this.f2394K.f2382i, 0, 8);
                    cVar.mo2741e(this.f2394K.f2382i, this.f2406W.f2396M.f2382i, 0, 4);
                    cVar.mo2741e(this.f2394K.f2382i, this.f2406W.f2394K.f2382i, 0, 0);
                } else if (i12 == 1) {
                    cVar.mo2741e(this.f2394K.f2382i, this.f2396M.f2382i, 0, 8);
                    cVar.mo2741e(this.f2394K.f2382i, this.f2406W.f2394K.f2382i, 0, 4);
                    cVar.mo2741e(this.f2394K.f2382i, this.f2406W.f2396M.f2382i, 0, 0);
                } else if (i12 == 2) {
                    cVar.mo2741e(this.f2397N.f2382i, this.f2395L.f2382i, 0, 8);
                    cVar.mo2741e(this.f2395L.f2382i, this.f2406W.f2397N.f2382i, 0, 4);
                    cVar.mo2741e(this.f2395L.f2382i, this.f2406W.f2395L.f2382i, 0, 0);
                } else if (i12 == 3) {
                    cVar.mo2741e(this.f2395L.f2382i, this.f2397N.f2382i, 0, 8);
                    cVar.mo2741e(this.f2395L.f2382i, this.f2406W.f2395L.f2382i, 0, 4);
                    cVar.mo2741e(this.f2395L.f2382i, this.f2406W.f2397N.f2382i, 0, 0);
                }
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
        C0687a aVar = (C0687a) constraintWidget;
        this.f2462y0 = aVar.f2462y0;
        this.f2463z0 = aVar.f2463z0;
        this.f2460A0 = aVar.f2460A0;
    }

    public final String toString() {
        String o = C0016g.m31o(C13555b.m33972k("[Barrier] "), this.f2433l0, " {");
        for (int i = 0; i < this.f21717x0; i++) {
            ConstraintWidget constraintWidget = this.f21716w0[i];
            if (i > 0) {
                o = C25541a.m63881k(o, ", ");
            }
            StringBuilder k = C13555b.m33972k(o);
            k.append(constraintWidget.f2433l0);
            o = k.toString();
        }
        return C25541a.m63881k(o, "}");
    }
}
