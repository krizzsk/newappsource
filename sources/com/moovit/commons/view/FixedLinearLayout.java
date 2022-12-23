package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.moovit.commons.utils.C15780a;

public class FixedLinearLayout extends LinearLayout {
    public FixedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount;
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        if (getOrientation() == 0 && C15780a.m40269b(this) && (childCount = getChildCount()) != 0) {
            int showDividers = getShowDividers();
            if ((showDividers & 1) == 0 || childCount <= 1) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            if ((showDividers & 2) != 0) {
                i5 += childCount - 1;
            }
            if (i5 != 0) {
                int intrinsicWidth = getDividerDrawable().getIntrinsicWidth();
                int i7 = (i5 + 1) * intrinsicWidth;
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = getChildAt(i9);
                    if (childAt.getVisibility() != 8) {
                        int i11 = -i7;
                        if (i8 == 0) {
                            i6 = intrinsicWidth;
                        } else {
                            i6 = 0;
                        }
                        childAt.offsetLeftAndRight(i11 + i6);
                        i8++;
                    }
                }
            }
        }
    }

    public FixedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
