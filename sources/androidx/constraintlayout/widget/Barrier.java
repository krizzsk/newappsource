package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.C0687a;
import androidx.constraintlayout.core.widgets.C0697d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.Constraints;
import p002a1.C0042d;
import p292w0.C6961b;

public class Barrier extends ConstraintHelper {

    /* renamed from: j */
    public int f2985j;

    /* renamed from: k */
    public int f2986k;

    /* renamed from: l */
    public C0687a f2987l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f2987l.f2463z0;
    }

    public int getMargin() {
        return this.f2987l.f2460A0;
    }

    public int getType() {
        return this.f2985j;
    }

    /* renamed from: n */
    public final void mo2868n(AttributeSet attributeSet) {
        super.mo2868n(attributeSet);
        this.f2987l = new C0687a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0042d.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2987l.f2463z0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == C0042d.ConstraintLayout_Layout_barrierMargin) {
                    this.f2987l.f2460A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3000e = this.f2987l;
        mo3168t();
    }

    /* renamed from: o */
    public final void mo2873o(C0738a.C0739a aVar, C6961b bVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.mo2873o(aVar, bVar, layoutParams, sparseArray);
        if (bVar instanceof C0687a) {
            C0687a aVar2 = (C0687a) bVar;
            mo3149u(aVar2, aVar.f3121e.f3177g0, ((C0697d) bVar.f2406W).f2511B0);
            C0738a.C0741b bVar2 = aVar.f3121e;
            aVar2.f2463z0 = bVar2.f3193o0;
            aVar2.f2460A0 = bVar2.f3179h0;
        }
    }

    /* renamed from: p */
    public final void mo2875p(ConstraintWidget constraintWidget, boolean z) {
        mo3149u(constraintWidget, this.f2985j, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2987l.f2463z0 = z;
    }

    public void setDpMargin(int i) {
        this.f2987l.f2460A0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f2987l.f2460A0 = i;
    }

    public void setType(int i) {
        this.f2985j = i;
    }

    /* renamed from: u */
    public final void mo3149u(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f2986k = i;
        if (z) {
            int i2 = this.f2985j;
            if (i2 == 5) {
                this.f2986k = 1;
            } else if (i2 == 6) {
                this.f2986k = 0;
            }
        } else {
            int i3 = this.f2985j;
            if (i3 == 5) {
                this.f2986k = 0;
            } else if (i3 == 6) {
                this.f2986k = 1;
            }
        }
        if (constraintWidget instanceof C0687a) {
            ((C0687a) constraintWidget).f2462y0 = this.f2986k;
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
