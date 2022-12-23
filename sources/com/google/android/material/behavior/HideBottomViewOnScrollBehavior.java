package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p068e2.C4527d;
import p380bc.C13577a;
import p402cc.C13781a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public int f34278a = 0;

    /* renamed from: b */
    public int f34279b = 2;

    /* renamed from: c */
    public int f34280c = 0;

    /* renamed from: d */
    public ViewPropertyAnimator f34281d;

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: a */
    public final void mo40999a(View view, int i, long j, C4527d dVar) {
        this.f34281d = view.animate().translationY((float) i).setInterpolator(dVar).setDuration(j).setListener(new C13781a(this));
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f34278a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z = true;
        boolean z2 = false;
        if (i2 > 0) {
            if (this.f34279b == 1) {
                z2 = true;
            }
            if (!z2) {
                ViewPropertyAnimator viewPropertyAnimator = this.f34281d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v.clearAnimation();
                }
                this.f34279b = 1;
                mo40999a(v, this.f34278a + this.f34280c, 175, C13577a.f33539c);
            }
        } else if (i2 < 0) {
            if (this.f34279b != 2) {
                z = false;
            }
            if (!z) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f34281d;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    v.clearAnimation();
                }
                this.f34279b = 2;
                mo40999a(v, 0, 225, C13577a.f33540d);
            }
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
