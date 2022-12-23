package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6362h;
import p242s1.C6382p0;
import p355ac.C13405f;
import p355ac.C13411l;

public class FlowLayout extends ViewGroup {

    /* renamed from: b */
    public int f34932b;

    /* renamed from: c */
    public int f34933c;

    /* renamed from: d */
    public boolean f34934d;

    /* renamed from: e */
    public int f34935e;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public boolean mo41364a() {
        return this.f34934d;
    }

    public int getItemSpacing() {
        return this.f34933c;
    }

    public int getLineSpacing() {
        return this.f34932b;
    }

    public int getRowCount() {
        return this.f34935e;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (getChildCount() == 0) {
            this.f34935e = 0;
            return;
        }
        this.f34935e = 1;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6338e.m15063d(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (z2) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i9 = (i3 - i) - i6;
        int i11 = i5;
        int i12 = paddingTop;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C13405f.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = C6362h.m15167c(marginLayoutParams);
                    i8 = C6362h.m15166b(marginLayoutParams);
                } else {
                    i8 = 0;
                    i7 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i11 + i7;
                if (!this.f34934d && measuredWidth > i9) {
                    i12 = this.f34932b + paddingTop;
                    this.f34935e++;
                    i11 = i5;
                }
                childAt.setTag(C13405f.row_index_key, Integer.valueOf(this.f34935e - 1));
                int i14 = i11 + i7;
                int measuredWidth2 = childAt.getMeasuredWidth() + i14;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (z2) {
                    childAt.layout(i9 - measuredWidth2, i12, (i9 - i11) - i7, measuredHeight);
                } else {
                    childAt.layout(i14, i12, measuredWidth2, measuredHeight);
                }
                i11 += childAt.getMeasuredWidth() + i7 + i8 + this.f34933c;
                paddingTop = measuredHeight;
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin + 0;
                    i6 = marginLayoutParams.rightMargin + 0;
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !mo41364a()) {
                    paddingLeft = getPaddingLeft();
                    i7 = this.f34932b + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i6 + this.f34933c + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i6;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i4 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i4 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i4) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f34933c = i;
    }

    public void setLineSpacing(int i) {
        this.f34932b = i;
    }

    public void setSingleLine(boolean z) {
        this.f34934d = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34934d = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C13411l.FlowLayout, 0, 0);
        this.f34932b = obtainStyledAttributes.getDimensionPixelSize(C13411l.FlowLayout_lineSpacing, 0);
        this.f34933c = obtainStyledAttributes.getDimensionPixelSize(C13411l.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }
}
