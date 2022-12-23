package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: j */
    public final void mo2901j(ConstraintLayout constraintLayout) {
        mo3159i(constraintLayout);
    }

    /* renamed from: n */
    public final void mo2868n(AttributeSet attributeSet) {
        super.mo2868n(attributeSet);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo3158h();
    }

    /* renamed from: q */
    public final void mo2902q() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f3064q0.mo2788R(0);
        layoutParams.f3064q0.mo2785O(0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo3158h();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo3158h();
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
