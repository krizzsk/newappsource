package com.moovit.app.taxi;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import p567iq.C17636c;

public class MVViewAnimator extends FrameLayout {

    /* renamed from: b */
    public int f39897b = 0;

    /* renamed from: c */
    public boolean f39898c = true;

    /* renamed from: d */
    public boolean f39899d = true;

    /* renamed from: e */
    public Animation f39900e;

    /* renamed from: f */
    public Animation f39901f;

    public MVViewAnimator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            setMeasureAllChildren(true);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17636c.MVViewAnimator);
        setMeasureAllChildren(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo46070a(int i, boolean z) {
        Animation animation;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (i2 == i) {
                if (z && (animation = this.f39900e) != null) {
                    childAt.startAnimation(animation);
                }
                childAt.setVisibility(0);
                this.f39898c = false;
            } else {
                if (z && this.f39901f != null && childAt.getVisibility() == 0) {
                    childAt.startAnimation(this.f39901f);
                } else if (childAt.getAnimation() == this.f39900e) {
                    childAt.clearAnimation();
                }
                childAt.setVisibility(4);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        super.addView(view, i, layoutParams);
        if (getChildCount() == 1) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
        if (i >= 0 && (i2 = this.f39897b) >= i) {
            setDisplayedChild(i2 + 1);
        }
    }

    public boolean getAnimateFirstView() {
        return this.f39899d;
    }

    public int getBaseline() {
        return getCurrentView() != null ? getCurrentView().getBaseline() : super.getBaseline();
    }

    public View getCurrentView() {
        return getChildAt(this.f39897b);
    }

    public int getDisplayedChild() {
        return this.f39897b;
    }

    public Animation getInAnimation() {
        return this.f39900e;
    }

    public Animation getOutAnimation() {
        return this.f39901f;
    }

    public final void removeAllViews() {
        super.removeAllViews();
        this.f39897b = 0;
        this.f39898c = true;
    }

    public final void removeView(View view) {
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            removeViewAt(indexOfChild);
        }
    }

    public final void removeViewAt(int i) {
        super.removeViewAt(i);
        int childCount = getChildCount();
        if (childCount == 0) {
            this.f39897b = 0;
            this.f39898c = true;
            return;
        }
        int i2 = this.f39897b;
        if (i2 >= childCount) {
            setDisplayedChild(childCount - 1);
        } else if (i2 == i) {
            setDisplayedChild(i2);
        }
    }

    public final void removeViewInLayout(View view) {
        removeView(view);
    }

    public final void removeViews(int i, int i2) {
        super.removeViews(i, i2);
        if (getChildCount() == 0) {
            this.f39897b = 0;
            this.f39898c = true;
            return;
        }
        int i3 = this.f39897b;
        if (i3 >= i && i3 < i + i2) {
            setDisplayedChild(i3);
        }
    }

    public final void removeViewsInLayout(int i, int i2) {
        removeViews(i, i2);
    }

    public void setAnimateFirstView(boolean z) {
        this.f39899d = z;
    }

    public void setDisplayedChild(int i) {
        boolean z;
        this.f39897b = i;
        boolean z2 = true;
        if (i >= getChildCount()) {
            this.f39897b = 0;
        } else if (i < 0) {
            this.f39897b = getChildCount() - 1;
        }
        if (getFocusedChild() != null) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.f39897b;
        if (this.f39898c && !this.f39899d) {
            z2 = false;
        }
        mo46070a(i2, z2);
        if (z) {
            requestFocus(2);
        }
    }

    public void setInAnimation(Animation animation) {
        this.f39900e = animation;
    }

    public void setOutAnimation(Animation animation) {
        this.f39901f = animation;
    }
}
