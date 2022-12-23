package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0698e;
import androidx.constraintlayout.core.widgets.C0704i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.VirtualLayout;
import p002a1.C0042d;
import p292w0.C6961b;

public class Flow extends VirtualLayout {

    /* renamed from: l */
    public C0698e f2626l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: n */
    public final void mo2868n(AttributeSet attributeSet) {
        super.mo2868n(attributeSet);
        this.f2626l = new C0698e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintLayout_Layout_android_orientation) {
                    this.f2626l.f2549b1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_android_padding) {
                    C0698e eVar = this.f2626l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.f2591y0 = dimensionPixelSize;
                    eVar.f2592z0 = dimensionPixelSize;
                    eVar.f2582A0 = dimensionPixelSize;
                    eVar.f2583B0 = dimensionPixelSize;
                } else if (index == C0042d.ConstraintLayout_Layout_android_paddingStart) {
                    C0698e eVar2 = this.f2626l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.f2582A0 = dimensionPixelSize2;
                    eVar2.f2584C0 = dimensionPixelSize2;
                    eVar2.f2585D0 = dimensionPixelSize2;
                } else if (index == C0042d.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f2626l.f2583B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f2626l.f2584C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_android_paddingTop) {
                    this.f2626l.f2591y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_android_paddingRight) {
                    this.f2626l.f2585D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f2626l.f2592z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f2626l.f2547Z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f2626l.f2531J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f2626l.f2532K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f2626l.f2533L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f2626l.f2535N0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f2626l.f2534M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f2626l.f2536O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f2626l.f2537P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f2626l.f2539R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f2626l.f2541T0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f2626l.f2540S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f2626l.f2542U0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f2626l.f2538Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f2626l.f2545X0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f2626l.f2546Y0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f2626l.f2543V0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f2626l.f2544W0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C0042d.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f2626l.f2548a1 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3000e = this.f2626l;
        mo3168t();
    }

    /* renamed from: o */
    public final void mo2873o(C0738a.C0739a aVar, C6961b bVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.mo2873o(aVar, bVar, layoutParams, sparseArray);
        if (bVar instanceof C0698e) {
            C0698e eVar = (C0698e) bVar;
            int i = layoutParams.f3026V;
            if (i != -1) {
                eVar.f2549b1 = i;
            }
        }
    }

    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        mo2900u(this.f2626l, i, i2);
    }

    /* renamed from: p */
    public final void mo2875p(ConstraintWidget constraintWidget, boolean z) {
        C0698e eVar = this.f2626l;
        int i = eVar.f2582A0;
        if (i <= 0 && eVar.f2583B0 <= 0) {
            return;
        }
        if (z) {
            eVar.f2584C0 = eVar.f2583B0;
            eVar.f2585D0 = i;
            return;
        }
        eVar.f2584C0 = i;
        eVar.f2585D0 = eVar.f2583B0;
    }

    public void setFirstHorizontalBias(float f) {
        this.f2626l.f2539R0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f2626l.f2533L0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f2626l.f2540S0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f2626l.f2534M0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f2626l.f2545X0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f2626l.f2537P0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f2626l.f2543V0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f2626l.f2531J0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f2626l.f2541T0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f2626l.f2535N0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f2626l.f2542U0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f2626l.f2536O0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f2626l.f2548a1 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f2626l.f2549b1 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C0698e eVar = this.f2626l;
        eVar.f2591y0 = i;
        eVar.f2592z0 = i;
        eVar.f2582A0 = i;
        eVar.f2583B0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f2626l.f2592z0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f2626l.f2584C0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f2626l.f2585D0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f2626l.f2591y0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f2626l.f2546Y0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f2626l.f2538Q0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f2626l.f2544W0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f2626l.f2532K0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f2626l.f2547Z0 = i;
        requestLayout();
    }

    /* renamed from: u */
    public final void mo2900u(C0704i iVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (iVar != null) {
            iVar.mo2838V(mode, size, mode2, size2);
            setMeasuredDimension(iVar.f2587F0, iVar.f2588G0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
