package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import p292w0.C6961b;
import p305x0.C7129b;

/* renamed from: androidx.constraintlayout.core.widgets.i */
public class C0704i extends C6961b {

    /* renamed from: A0 */
    public int f2582A0 = 0;

    /* renamed from: B0 */
    public int f2583B0 = 0;

    /* renamed from: C0 */
    public int f2584C0 = 0;

    /* renamed from: D0 */
    public int f2585D0 = 0;

    /* renamed from: E0 */
    public boolean f2586E0 = false;

    /* renamed from: F0 */
    public int f2587F0 = 0;

    /* renamed from: G0 */
    public int f2588G0 = 0;

    /* renamed from: H0 */
    public C7129b.C7130a f2589H0 = new C7129b.C7130a();

    /* renamed from: I0 */
    public C7129b.C7131b f2590I0 = null;

    /* renamed from: y0 */
    public int f2591y0 = 0;

    /* renamed from: z0 */
    public int f2592z0 = 0;

    /* renamed from: V */
    public void mo2838V(int i, int i2, int i3, int i4) {
    }

    /* renamed from: W */
    public final void mo2849W(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        C7129b.C7131b bVar;
        boolean z;
        ConstraintWidget constraintWidget2;
        while (true) {
            bVar = this.f2590I0;
            if (bVar != null || (constraintWidget2 = this.f2406W) == null) {
                C7129b.C7130a aVar = this.f2589H0;
                aVar.f22150a = dimensionBehaviour;
                aVar.f22151b = dimensionBehaviour2;
                aVar.f22152c = i;
                aVar.f22153d = i2;
                ((ConstraintLayout.C0737b) bVar).mo3200b(constraintWidget, aVar);
                constraintWidget.mo2788R(this.f2589H0.f22154e);
                constraintWidget.mo2785O(this.f2589H0.f22155f);
                C7129b.C7130a aVar2 = this.f2589H0;
                constraintWidget.f2389F = aVar2.f22157h;
                int i3 = aVar2.f22156g;
                constraintWidget.f2417d0 = i3;
            } else {
                this.f2590I0 = ((C0697d) constraintWidget2).f2510A0;
            }
        }
        C7129b.C7130a aVar3 = this.f2589H0;
        aVar3.f22150a = dimensionBehaviour;
        aVar3.f22151b = dimensionBehaviour2;
        aVar3.f22152c = i;
        aVar3.f22153d = i2;
        ((ConstraintLayout.C0737b) bVar).mo3200b(constraintWidget, aVar3);
        constraintWidget.mo2788R(this.f2589H0.f22154e);
        constraintWidget.mo2785O(this.f2589H0.f22155f);
        C7129b.C7130a aVar22 = this.f2589H0;
        constraintWidget.f2389F = aVar22.f22157h;
        int i32 = aVar22.f22156g;
        constraintWidget.f2417d0 = i32;
        if (i32 > 0) {
            z = true;
        } else {
            z = false;
        }
        constraintWidget.f2389F = z;
    }

    /* renamed from: c */
    public final void mo2850c() {
        for (int i = 0; i < this.f21717x0; i++) {
            ConstraintWidget constraintWidget = this.f21716w0[i];
            if (constraintWidget != null) {
                constraintWidget.f2391H = true;
            }
        }
    }
}
