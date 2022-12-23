package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* renamed from: androidx.constraintlayout.core.widgets.g */
public final class C0702g {

    /* renamed from: a */
    public static boolean[] f2581a = new boolean[3];

    /* renamed from: a */
    public static void m2079a(C0697d dVar, C0680c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f2440p = -1;
        constraintWidget.f2442q = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.f2405V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.f2405V[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i = constraintWidget.f2394K.f2380g;
            int u = dVar.mo2807u() - constraintWidget.f2396M.f2380g;
            ConstraintAnchor constraintAnchor = constraintWidget.f2394K;
            constraintAnchor.f2382i = cVar.mo2747k(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f2396M;
            constraintAnchor2.f2382i = cVar.mo2747k(constraintAnchor2);
            cVar.mo2740d(constraintWidget.f2394K.f2382i, i);
            cVar.mo2740d(constraintWidget.f2396M.f2382i, u);
            constraintWidget.f2440p = 2;
            constraintWidget.f2413b0 = i;
            int i2 = u - i;
            constraintWidget.f2407X = i2;
            int i3 = constraintWidget.f2419e0;
            if (i2 < i3) {
                constraintWidget.f2407X = i3;
            }
        }
        if (dVar.f2405V[1] != dimensionBehaviour2 && constraintWidget.f2405V[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int i4 = constraintWidget.f2395L.f2380g;
            int o = dVar.mo2802o() - constraintWidget.f2397N.f2380g;
            ConstraintAnchor constraintAnchor3 = constraintWidget.f2395L;
            constraintAnchor3.f2382i = cVar.mo2747k(constraintAnchor3);
            ConstraintAnchor constraintAnchor4 = constraintWidget.f2397N;
            constraintAnchor4.f2382i = cVar.mo2747k(constraintAnchor4);
            cVar.mo2740d(constraintWidget.f2395L.f2382i, i4);
            cVar.mo2740d(constraintWidget.f2397N.f2382i, o);
            if (constraintWidget.f2417d0 > 0 || constraintWidget.f2429j0 == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.f2398O;
                constraintAnchor5.f2382i = cVar.mo2747k(constraintAnchor5);
                cVar.mo2740d(constraintWidget.f2398O.f2382i, constraintWidget.f2417d0 + i4);
            }
            constraintWidget.f2442q = 2;
            constraintWidget.f2415c0 = i4;
            int i5 = o - i4;
            constraintWidget.f2408Y = i5;
            int i6 = constraintWidget.f2421f0;
            if (i5 < i6) {
                constraintWidget.f2408Y = i6;
            }
        }
    }

    /* renamed from: b */
    public static final boolean m2080b(int i, int i2) {
        return (i & i2) == i2;
    }
}
