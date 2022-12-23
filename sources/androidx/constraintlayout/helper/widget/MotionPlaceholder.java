package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0703h;
import androidx.constraintlayout.core.widgets.C0704i;
import androidx.constraintlayout.widget.VirtualLayout;
import p292w0.C6960a;

public class MotionPlaceholder extends VirtualLayout {
    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: n */
    public final void mo2868n(AttributeSet attributeSet) {
        super.mo2868n(attributeSet);
        this.f3000e = new C0703h();
        mo3168t();
    }

    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        mo2900u((C0704i) null, i, i2);
    }

    /* renamed from: s */
    public final void mo2918s(C6960a aVar, SparseArray sparseArray) {
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

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
