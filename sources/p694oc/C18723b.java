package p694oc;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.C14096a;
import com.google.android.material.navigation.C14103d;

/* renamed from: oc.b */
public final class C18723b extends C14103d {

    /* renamed from: F */
    public int f47634F = -1;

    /* renamed from: G */
    public final FrameLayout.LayoutParams f47635G;

    public C18723b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f47635G = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    /* renamed from: e */
    public final C14096a mo42041e(Context context) {
        return new C18722a(context);
    }

    /* renamed from: g */
    public final int mo51084g(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.f47634F;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    public int getItemMinimumHeight() {
        return this.f47634F;
    }

    public int getMenuGravity() {
        return this.f47635G.gravity;
    }

    /* renamed from: h */
    public final int mo51087h(View view, int i, int i2, int i3) {
        int i4;
        int i5;
        mo51084g(i, i2, i3);
        if (view == null) {
            i4 = mo51084g(i, i2, i3);
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i, i4);
                    i5 = childAt.getMeasuredHeight();
                } else {
                    i5 = 0;
                }
                i6 += i5;
            }
        }
        return i6;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().mo1118l().size();
        if (size2 <= 1 || !C14103d.m35102f(getLabelVisibilityMode(), size2)) {
            i3 = mo51087h((View) null, i, size, size2);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int g = mo51084g(i, size, size2);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i, g);
                    i4 = childAt.getMeasuredHeight();
                } else {
                    i4 = 0;
                }
                size -= i4;
                size2--;
            } else {
                i4 = 0;
            }
            i3 = mo51087h(childAt, i, size, size2) + i4;
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(i3, i2, 0));
    }

    public void setItemMinimumHeight(int i) {
        if (this.f47634F != i) {
            this.f47634F = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.f47635G;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
