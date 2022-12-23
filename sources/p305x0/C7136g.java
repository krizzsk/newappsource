package p305x0;

import androidx.constraintlayout.core.widgets.C0700f;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import p292w0.C6961b;

/* renamed from: x0.g */
public final class C7136g {
    /* renamed from: a */
    public static C7139j m16691a(ConstraintWidget constraintWidget, int i, ArrayList<C7139j> arrayList, C7139j jVar) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = constraintWidget.f2451u0;
        } else {
            i2 = constraintWidget.f2453v0;
        }
        int i4 = 0;
        if (i2 != -1 && (jVar == null || i2 != jVar.f22175b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                C7139j jVar2 = arrayList.get(i5);
                if (jVar2.f22175b == i2) {
                    if (jVar != null) {
                        jVar.mo23396d(i, jVar2);
                        arrayList.remove(jVar);
                    }
                    jVar = jVar2;
                } else {
                    i5++;
                }
            }
        } else if (i2 != -1) {
            return jVar;
        }
        if (jVar == null) {
            if (constraintWidget instanceof C6961b) {
                C6961b bVar = (C6961b) constraintWidget;
                int i6 = 0;
                while (true) {
                    if (i6 >= bVar.f21717x0) {
                        i3 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = bVar.f21716w0[i6];
                    if ((i == 0 && (i3 = constraintWidget2.f2451u0) != -1) || (i == 1 && (i3 = constraintWidget2.f2453v0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        C7139j jVar3 = arrayList.get(i7);
                        if (jVar3.f22175b == i3) {
                            jVar = jVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (jVar == null) {
                jVar = new C7139j(i);
            }
            arrayList.add(jVar);
        }
        if (jVar.mo23393a(constraintWidget)) {
            if (constraintWidget instanceof C0700f) {
                C0700f fVar = (C0700f) constraintWidget;
                ConstraintAnchor constraintAnchor = fVar.f2579z0;
                if (fVar.f2574A0 == 0) {
                    i4 = 1;
                }
                constraintAnchor.mo2762c(i4, jVar, arrayList);
            }
            if (i == 0) {
                constraintWidget.f2451u0 = jVar.f22175b;
                constraintWidget.f2394K.mo2762c(i, jVar, arrayList);
                constraintWidget.f2396M.mo2762c(i, jVar, arrayList);
            } else {
                constraintWidget.f2453v0 = jVar.f22175b;
                constraintWidget.f2395L.mo2762c(i, jVar, arrayList);
                constraintWidget.f2398O.mo2762c(i, jVar, arrayList);
                constraintWidget.f2397N.mo2762c(i, jVar, arrayList);
            }
            constraintWidget.f2401R.mo2762c(i, jVar, arrayList);
        }
        return jVar;
    }

    /* renamed from: b */
    public static boolean m16692b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z;
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) {
            z = true;
        } else {
            z = false;
        }
        if (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
