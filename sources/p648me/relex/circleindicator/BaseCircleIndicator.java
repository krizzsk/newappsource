package p648me.relex.circleindicator;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: me.relex.circleindicator.BaseCircleIndicator */
class BaseCircleIndicator extends LinearLayout {

    /* renamed from: b */
    public int f61640b = -1;

    /* renamed from: c */
    public int f61641c = -1;

    /* renamed from: d */
    public int f61642d = -1;

    /* renamed from: e */
    public int f61643e;

    /* renamed from: f */
    public int f61644f;

    /* renamed from: g */
    public Animator f61645g;

    /* renamed from: h */
    public Animator f61646h;

    /* renamed from: i */
    public Animator f61647i;

    /* renamed from: j */
    public Animator f61648j;

    /* renamed from: k */
    public int f61649k = -1;

    /* renamed from: me.relex.circleindicator.BaseCircleIndicator$a */
    public interface C24340a {
        /* renamed from: a */
        void mo60500a();
    }

    /* renamed from: me.relex.circleindicator.BaseCircleIndicator$b */
    public static class C24341b implements Interpolator {
        public final float getInterpolation(float f) {
            return Math.abs(1.0f - f);
        }
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo60498c(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo60496a(int i) {
        View childAt;
        if (this.f61649k != i) {
            if (this.f61646h.isRunning()) {
                this.f61646h.end();
                this.f61646h.cancel();
            }
            if (this.f61645g.isRunning()) {
                this.f61645g.end();
                this.f61645g.cancel();
            }
            int i2 = this.f61649k;
            if (i2 >= 0 && (childAt = getChildAt(i2)) != null) {
                childAt.setBackgroundResource(this.f61644f);
                this.f61646h.setTarget(childAt);
                this.f61646h.start();
            }
            View childAt2 = getChildAt(i);
            if (childAt2 != null) {
                childAt2.setBackgroundResource(this.f61643e);
                this.f61645g.setTarget(childAt2);
                this.f61645g.start();
            }
            this.f61649k = i;
        }
    }

    /* renamed from: b */
    public final void mo60497b(int i, int i2) {
        if (this.f61647i.isRunning()) {
            this.f61647i.end();
            this.f61647i.cancel();
        }
        if (this.f61648j.isRunning()) {
            this.f61648j.end();
            this.f61648j.cancel();
        }
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            int i3 = i - childCount;
            int orientation = getOrientation();
            for (int i4 = 0; i4 < i3; i4++) {
                View view = new View(getContext());
                LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
                generateDefaultLayoutParams.width = this.f61641c;
                generateDefaultLayoutParams.height = this.f61642d;
                if (orientation == 0) {
                    int i5 = this.f61640b;
                    generateDefaultLayoutParams.leftMargin = i5;
                    generateDefaultLayoutParams.rightMargin = i5;
                } else {
                    int i6 = this.f61640b;
                    generateDefaultLayoutParams.topMargin = i6;
                    generateDefaultLayoutParams.bottomMargin = i6;
                }
                addView(view, generateDefaultLayoutParams);
            }
        }
        for (int i7 = 0; i7 < i; i7++) {
            View childAt = getChildAt(i7);
            if (i2 == i7) {
                childAt.setBackgroundResource(this.f61643e);
                this.f61647i.setTarget(childAt);
                this.f61647i.start();
                this.f61647i.end();
            } else {
                childAt.setBackgroundResource(this.f61644f);
                this.f61648j.setTarget(childAt);
                this.f61648j.start();
                this.f61648j.end();
            }
        }
        this.f61649k = i2;
    }

    /* renamed from: c */
    public final void mo60498c(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Animator animator;
        Animator animator2;
        int i7;
        int i8;
        AttributeSet attributeSet2 = attributeSet;
        int i9 = C24348a.scale_with_alpha;
        int i11 = C24349b.white_radius;
        int i12 = -1;
        int i13 = 0;
        if (attributeSet2 == null) {
            i6 = -1;
            i5 = -1;
            i4 = 17;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C24350c.BaseCircleIndicator);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C24350c.BaseCircleIndicator_ci_width, -1);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C24350c.BaseCircleIndicator_ci_height, -1);
            i5 = obtainStyledAttributes.getDimensionPixelSize(C24350c.BaseCircleIndicator_ci_margin, -1);
            int resourceId = obtainStyledAttributes.getResourceId(C24350c.BaseCircleIndicator_ci_animator, C24348a.scale_with_alpha);
            i3 = obtainStyledAttributes.getResourceId(C24350c.BaseCircleIndicator_ci_animator_reverse, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(C24350c.BaseCircleIndicator_ci_drawable, C24349b.white_radius);
            i2 = obtainStyledAttributes.getResourceId(C24350c.BaseCircleIndicator_ci_drawable_unselected, resourceId2);
            i = obtainStyledAttributes.getInt(C24350c.BaseCircleIndicator_ci_orientation, -1);
            int i14 = obtainStyledAttributes.getInt(C24350c.BaseCircleIndicator_ci_gravity, -1);
            obtainStyledAttributes.recycle();
            i6 = dimensionPixelSize2;
            i11 = resourceId2;
            int i15 = i14;
            i12 = dimensionPixelSize;
            i9 = resourceId;
            i4 = i15;
        }
        int applyDimension = (int) (TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        if (i12 < 0) {
            i12 = applyDimension;
        }
        this.f61641c = i12;
        if (i6 < 0) {
            i6 = applyDimension;
        }
        this.f61642d = i6;
        if (i5 < 0) {
            i5 = applyDimension;
        }
        this.f61640b = i5;
        this.f61645g = AnimatorInflater.loadAnimator(getContext(), i9);
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), i9);
        this.f61647i = loadAnimator;
        loadAnimator.setDuration(0);
        if (i3 == 0) {
            animator = AnimatorInflater.loadAnimator(getContext(), i9);
            animator.setInterpolator(new C24341b());
        } else {
            animator = AnimatorInflater.loadAnimator(getContext(), i3);
        }
        this.f61646h = animator;
        if (i3 == 0) {
            animator2 = AnimatorInflater.loadAnimator(getContext(), i9);
            animator2.setInterpolator(new C24341b());
        } else {
            animator2 = AnimatorInflater.loadAnimator(getContext(), i3);
        }
        this.f61648j = animator2;
        animator2.setDuration(0);
        if (i11 == 0) {
            i7 = C24349b.white_radius;
        } else {
            i7 = i11;
        }
        this.f61643e = i7;
        if (i2 != 0) {
            i11 = i2;
        }
        this.f61644f = i11;
        if (i == 1) {
            i13 = 1;
        }
        setOrientation(i13);
        if (i4 >= 0) {
            i8 = i4;
        } else {
            i8 = 17;
        }
        setGravity(i8);
        if (isInEditMode()) {
            mo60497b(3, 1);
        }
    }

    public void setIndicatorCreatedListener(C24340a aVar) {
    }

    public BaseCircleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo60498c(context, attributeSet);
    }
}
