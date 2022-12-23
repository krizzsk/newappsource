package com.moovit.map;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.GravityLayoutParams;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6357f;
import p242s1.C6382p0;
import p824tp.C19748z;

public class MapOverlaysLayout extends ViewGroup {

    /* renamed from: b */
    public final Rect f42441b = new Rect();

    /* renamed from: c */
    public final Rect f42442c = new Rect();

    /* renamed from: d */
    public final Rect f42443d = new Rect();

    public MapOverlaysLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f42441b.set(getPaddingLeft() + this.f42443d.left, getPaddingTop() + this.f42443d.top, (i3 - i) - (getPaddingRight() + this.f42443d.right), (i4 - i2) - (getPaddingBottom() + this.f42443d.bottom));
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = (int) (layoutParams.f42444b * ((float) measuredWidth));
                int i7 = (int) (layoutParams.f42445c * ((float) measuredHeight));
                int i8 = layoutParams.f41132a;
                Rect rect = this.f42441b;
                Rect rect2 = this.f42442c;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6357f.m15159a(i8, measuredWidth, measuredHeight, rect, i6, i7, rect2, C6333d0.C6338e.m15063d(this));
                int absoluteGravity = Gravity.getAbsoluteGravity(layoutParams.f41132a, C6333d0.C6338e.m15063d(this)) & 7;
                int i9 = layoutParams.f41132a & 112;
                if (absoluteGravity == 1) {
                    this.f42442c.offset(layoutParams.leftMargin - layoutParams.rightMargin, 0);
                } else if (absoluteGravity != 5) {
                    this.f42442c.offset(layoutParams.leftMargin, 0);
                } else {
                    this.f42442c.offset(-layoutParams.rightMargin, 0);
                }
                if (i9 == 16) {
                    this.f42442c.offset(0, layoutParams.topMargin - layoutParams.bottomMargin);
                } else if (i9 != 80) {
                    this.f42442c.offset(0, layoutParams.topMargin);
                } else {
                    this.f42442c.offset(0, -layoutParams.bottomMargin);
                }
                Rect rect3 = this.f42442c;
                childAt.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        super.onMeasure(i, i2);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i2 - i4;
        int i6 = i - i3;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i8 = layoutParams.f41132a & 112;
                if (i8 == 16) {
                    childAt.offsetTopAndBottom(i5 / 2);
                } else if (i8 == 80) {
                    childAt.offsetTopAndBottom(i5);
                } else if (i8 == 112) {
                    childAt.setBottom(childAt.getBottom() + i5);
                }
                int i9 = layoutParams.f41132a & 7;
                if (i9 == 1) {
                    childAt.offsetLeftAndRight(i6 / 2);
                } else if (i9 == 5) {
                    childAt.offsetLeftAndRight(i6);
                } else if (i9 == 7) {
                    childAt.setRight(childAt.getRight() + i6);
                } else if (i9 != 8388611) {
                    if (i9 == 8388613 && (!C15780a.m40269b(this))) {
                        childAt.offsetLeftAndRight(i6);
                    }
                } else if (C15780a.m40269b(this)) {
                    childAt.offsetLeftAndRight(i6);
                }
            }
        }
    }

    public static class LayoutParams extends GravityLayoutParams {

        /* renamed from: b */
        public float f42444b;

        /* renamed from: c */
        public float f42445c;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray n = UiUtils.m40255n(context, attributeSet, C19748z.MapOverlaysLayout_LayoutParams);
            try {
                this.f42444b = n.getFloat(C19748z.MapOverlaysLayout_LayoutParams_relativeOffsetX, BitmapDescriptorFactory.HUE_RED);
                this.f42445c = n.getFloat(C19748z.MapOverlaysLayout_LayoutParams_relativeOffsetY, BitmapDescriptorFactory.HUE_RED);
            } finally {
                n.recycle();
            }
        }

        public LayoutParams(int i) {
            super(i);
            this.f42444b = BitmapDescriptorFactory.HUE_RED;
            this.f42445c = BitmapDescriptorFactory.HUE_RED;
        }
    }
}
