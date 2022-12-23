package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p114i.C5220f;
import p114i.C5224j;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f1198b;

    /* renamed from: c */
    public boolean f1199c;

    /* renamed from: d */
    public int f1200d = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C5224j.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C6333d0.m15028p(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1198b = obtainStyledAttributes.getBoolean(C5224j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1198b);
        }
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        if (this.f1199c == z) {
            return;
        }
        if (!z || this.f1198b) {
            this.f1199c = z;
            setOrientation(z ? 1 : 0);
            if (z) {
                i = 8388613;
            } else {
                i = 80;
            }
            setGravity(i);
            View findViewById = findViewById(C5220f.spacer);
            if (findViewById != null) {
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                findViewById.setVisibility(i2);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i6 = 0;
        if (this.f1198b) {
            if (size > this.f1200d && this.f1199c) {
                setStacked(false);
            }
            this.f1200d = size;
        }
        if (this.f1199c || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1198b && !this.f1199c) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i4 = -1;
            if (i7 >= childCount) {
                i7 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i6 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1199c) {
                int i8 = i7 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i8 >= childCount2) {
                        break;
                    } else if (getChildAt(i8).getVisibility() == 0) {
                        i4 = i8;
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i4 >= 0) {
                    i5 = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i5 = getPaddingBottom();
            }
            i6 += i5;
        }
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6337d.m15044d(this) != i6) {
            setMinimumHeight(i6);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1198b != z) {
            this.f1198b = z;
            if (!z && this.f1199c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
