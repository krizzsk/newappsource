package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* renamed from: androidx.constraintlayout.core.widgets.h */
public final class C0703h extends C0704i {
    /* renamed from: V */
    public final void mo2838V(int i, int i2, int i3, int i4) {
        int i5 = this.f2584C0 + this.f2585D0;
        boolean z = false;
        int i6 = i5 + 0;
        int i7 = this.f2591y0 + this.f2592z0 + 0;
        if (this.f21717x0 > 0) {
            i6 += this.f21716w0[0].mo2807u();
            i7 += this.f21716w0[0].mo2802o();
        }
        int max = Math.max(this.f2419e0, i6);
        int max2 = Math.max(this.f2421f0, i7);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(max, i2);
            } else if (i == 0) {
                i2 = max;
            } else {
                i2 = 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(max2, i4);
            } else if (i3 == 0) {
                i4 = max2;
            } else {
                i4 = 0;
            }
        }
        this.f2587F0 = i2;
        this.f2588G0 = i4;
        mo2788R(i2);
        mo2785O(i4);
        if (this.f21717x0 > 0) {
            z = true;
        }
        this.f2586E0 = z;
    }

    /* renamed from: e */
    public final void mo2792e(C0680c cVar, boolean z) {
        super.mo2792e(cVar, z);
        if (this.f21717x0 > 0) {
            ConstraintWidget constraintWidget = this.f21716w0[0];
            constraintWidget.mo2780H();
            constraintWidget.f2425h0 = 0.5f;
            constraintWidget.f2423g0 = 0.5f;
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.mo2795h(type, this, type, 0);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.mo2795h(type2, this, type2, 0);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.mo2795h(type3, this, type3, 0);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.mo2795h(type4, this, type4, 0);
        }
    }
}
