package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;

public class Layer extends ConstraintHelper {

    /* renamed from: A */
    public boolean f2627A;

    /* renamed from: j */
    public float f2628j = Float.NaN;

    /* renamed from: k */
    public float f2629k = Float.NaN;

    /* renamed from: l */
    public float f2630l = Float.NaN;

    /* renamed from: m */
    public ConstraintLayout f2631m;

    /* renamed from: n */
    public float f2632n = 1.0f;

    /* renamed from: o */
    public float f2633o = 1.0f;

    /* renamed from: p */
    public float f2634p = Float.NaN;

    /* renamed from: q */
    public float f2635q = Float.NaN;

    /* renamed from: r */
    public float f2636r = Float.NaN;

    /* renamed from: s */
    public float f2637s = Float.NaN;

    /* renamed from: t */
    public float f2638t = Float.NaN;

    /* renamed from: u */
    public float f2639u = Float.NaN;

    /* renamed from: v */
    public boolean f2640v = true;

    /* renamed from: w */
    public View[] f2641w = null;

    /* renamed from: x */
    public float f2642x = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: y */
    public float f2643y = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: z */
    public boolean f2644z;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: j */
    public final void mo2901j(ConstraintLayout constraintLayout) {
        mo3159i(constraintLayout);
    }

    /* renamed from: n */
    public final void mo2868n(AttributeSet attributeSet) {
        super.mo2868n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintLayout_Layout_android_visibility) {
                    this.f2644z = true;
                } else if (index == C0042d.ConstraintLayout_Layout_android_elevation) {
                    this.f2627A = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2631m = (ConstraintLayout) getParent();
        if (this.f2644z || this.f2627A) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f2998c; i++) {
                View viewById = this.f2631m.getViewById(this.f2997b[i]);
                if (viewById != null) {
                    if (this.f2644z) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f2627A && elevation > BitmapDescriptorFactory.HUE_RED) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo2902q() {
        mo2914v();
        this.f2634p = Float.NaN;
        this.f2635q = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).f3064q0;
        constraintWidget.mo2788R(0);
        constraintWidget.mo2785O(0);
        mo2913u();
        layout(((int) this.f2638t) - getPaddingLeft(), ((int) this.f2639u) - getPaddingTop(), getPaddingRight() + ((int) this.f2636r), getPaddingBottom() + ((int) this.f2637s));
        mo2915w();
    }

    /* renamed from: r */
    public final void mo2903r(ConstraintLayout constraintLayout) {
        this.f2631m = constraintLayout;
        float rotation = getRotation();
        if (rotation != BitmapDescriptorFactory.HUE_RED) {
            this.f2630l = rotation;
        } else if (!Float.isNaN(this.f2630l)) {
            this.f2630l = rotation;
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo3158h();
    }

    public void setPivotX(float f) {
        this.f2628j = f;
        mo2915w();
    }

    public void setPivotY(float f) {
        this.f2629k = f;
        mo2915w();
    }

    public void setRotation(float f) {
        this.f2630l = f;
        mo2915w();
    }

    public void setScaleX(float f) {
        this.f2632n = f;
        mo2915w();
    }

    public void setScaleY(float f) {
        this.f2633o = f;
        mo2915w();
    }

    public void setTranslationX(float f) {
        this.f2642x = f;
        mo2915w();
    }

    public void setTranslationY(float f) {
        this.f2643y = f;
        mo2915w();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo3158h();
    }

    /* renamed from: u */
    public final void mo2913u() {
        if (this.f2631m != null) {
            if (!this.f2640v && !Float.isNaN(this.f2634p) && !Float.isNaN(this.f2635q)) {
                return;
            }
            if (Float.isNaN(this.f2628j) || Float.isNaN(this.f2629k)) {
                View[] m = mo3162m(this.f2631m);
                int left = m[0].getLeft();
                int top = m[0].getTop();
                int right = m[0].getRight();
                int bottom = m[0].getBottom();
                for (int i = 0; i < this.f2998c; i++) {
                    View view = m[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f2636r = (float) right;
                this.f2637s = (float) bottom;
                this.f2638t = (float) left;
                this.f2639u = (float) top;
                if (Float.isNaN(this.f2628j)) {
                    this.f2634p = (float) ((left + right) / 2);
                } else {
                    this.f2634p = this.f2628j;
                }
                if (Float.isNaN(this.f2629k)) {
                    this.f2635q = (float) ((top + bottom) / 2);
                } else {
                    this.f2635q = this.f2629k;
                }
            } else {
                this.f2635q = this.f2629k;
                this.f2634p = this.f2628j;
            }
        }
    }

    /* renamed from: v */
    public final void mo2914v() {
        int i;
        if (this.f2631m != null && (i = this.f2998c) != 0) {
            View[] viewArr = this.f2641w;
            if (viewArr == null || viewArr.length != i) {
                this.f2641w = new View[i];
            }
            for (int i2 = 0; i2 < this.f2998c; i2++) {
                this.f2641w[i2] = this.f2631m.getViewById(this.f2997b[i2]);
            }
        }
    }

    /* renamed from: w */
    public final void mo2915w() {
        double d;
        if (this.f2631m != null) {
            if (this.f2641w == null) {
                mo2914v();
            }
            mo2913u();
            if (Float.isNaN(this.f2630l)) {
                d = 0.0d;
            } else {
                d = Math.toRadians((double) this.f2630l);
            }
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = this.f2632n;
            float f2 = f * cos;
            float f3 = this.f2633o;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.f2998c; i++) {
                View view = this.f2641w[i];
                int left = view.getLeft();
                int top = view.getTop();
                float right = ((float) ((view.getRight() + left) / 2)) - this.f2634p;
                float bottom = ((float) ((view.getBottom() + top) / 2)) - this.f2635q;
                view.setTranslationX((((f4 * bottom) + (f2 * right)) - right) + this.f2642x);
                view.setTranslationY((((f6 * bottom) + (right * f5)) - bottom) + this.f2643y);
                view.setScaleY(this.f2633o);
                view.setScaleX(this.f2632n);
                if (!Float.isNaN(this.f2630l)) {
                    view.setRotation(this.f2630l);
                }
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
