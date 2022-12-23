package p292w0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p305x0.C7136g;
import p305x0.C7139j;

/* renamed from: w0.b */
public class C6961b extends ConstraintWidget implements C6960a {

    /* renamed from: w0 */
    public ConstraintWidget[] f21716w0 = new ConstraintWidget[4];

    /* renamed from: x0 */
    public int f21717x0 = 0;

    /* renamed from: U */
    public final void mo23205U(int i, C7139j jVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f21717x0; i2++) {
            jVar.mo23393a(this.f21716w0[i2]);
        }
        for (int i3 = 0; i3 < this.f21717x0; i3++) {
            C7136g.m16691a(this.f21716w0[i3], i, arrayList, jVar);
        }
    }

    /* renamed from: a */
    public final void mo23203a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.f21717x0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f21716w0;
            if (i > constraintWidgetArr.length) {
                this.f21716w0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f21716w0;
            int i2 = this.f21717x0;
            constraintWidgetArr2[i2] = constraintWidget;
            this.f21717x0 = i2 + 1;
        }
    }

    /* renamed from: b */
    public final void mo23204b() {
        this.f21717x0 = 0;
        Arrays.fill(this.f21716w0, (Object) null);
    }

    /* renamed from: c */
    public void mo2850c() {
    }

    /* renamed from: j */
    public void mo2797j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.mo2797j(constraintWidget, hashMap);
        C6961b bVar = (C6961b) constraintWidget;
        this.f21717x0 = 0;
        int i = bVar.f21717x0;
        for (int i2 = 0; i2 < i; i2++) {
            mo23203a(hashMap.get(bVar.f21716w0[i2]));
        }
    }
}
