package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import p002a1.C0042d;
import p328z0.C7394n;

public class MotionHelper extends ConstraintHelper implements MotionLayout.C0716i {

    /* renamed from: j */
    public boolean f2653j = false;

    /* renamed from: k */
    public boolean f2654k = false;

    /* renamed from: l */
    public float f2655l;

    /* renamed from: m */
    public View[] f2656m;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2868n(attributeSet);
    }

    /* renamed from: a */
    public void mo2851a(int i) {
    }

    /* renamed from: b */
    public final void mo2919b() {
    }

    /* renamed from: c */
    public void mo2852c() {
    }

    /* renamed from: d */
    public final void mo2920d() {
    }

    public float getProgress() {
        return this.f2655l;
    }

    /* renamed from: n */
    public final void mo2868n(AttributeSet attributeSet) {
        super.mo2868n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.MotionHelper_onShow) {
                    this.f2653j = obtainStyledAttributes.getBoolean(index, this.f2653j);
                } else if (index == C0042d.MotionHelper_onHide) {
                    this.f2654k = obtainStyledAttributes.getBoolean(index, this.f2654k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.f2655l = f;
        int i = 0;
        if (this.f2998c > 0) {
            this.f2656m = mo3162m((ConstraintLayout) getParent());
            while (i < this.f2998c) {
                View view = this.f2656m[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            boolean z = viewGroup.getChildAt(i) instanceof MotionHelper;
            i++;
        }
    }

    /* renamed from: u */
    public void mo2916u(MotionLayout motionLayout, HashMap<View, C7394n> hashMap) {
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2868n(attributeSet);
    }
}
