package com.moovit.commons.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import ce0.C21100e;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import p622kz.C18165g;

public class SimpleGridLayout extends ViewGroup {

    /* renamed from: b */
    public final Rect f41138b;

    /* renamed from: c */
    public final Rect f41139c;

    /* renamed from: d */
    public int f41140d;

    /* renamed from: e */
    public int f41141e;

    /* renamed from: f */
    public int f41142f;

    public SimpleGridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getMeasuredTotalCellsHeight() {
        View a;
        int rowCount = getRowCount();
        int i = 0;
        int i2 = 0;
        while (i < rowCount) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < this.f41140d && (a = mo47121a(i, i3)) != null) {
                i4 = Math.max(i4, a.getMeasuredHeight());
                i3++;
            }
            i2 += i4;
            i++;
        }
        return i2;
    }

    private int getMeasuredTotalHeight() {
        int rowCount = getRowCount();
        return getPaddingBottom() + getPaddingTop() + ((rowCount - 1) * this.f41142f) + getMeasuredTotalCellsHeight();
    }

    private int getRowCount() {
        int childCount = getChildCount();
        int i = this.f41140d;
        return ((childCount + i) - 1) / i;
    }

    /* renamed from: a */
    public final View mo47121a(int i, int i2) {
        int i3 = (i * this.f41140d) + i2;
        if (i3 >= getChildCount()) {
            return null;
        }
        return getChildAt(i3);
    }

    /* renamed from: b */
    public final void mo47122b(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((((i - ((this.f41140d - 1) * this.f41141e)) - getPaddingLeft()) - getPaddingRight()) / this.f41140d, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            measureChildWithMargins(getChildAt(i3), makeMeasureSpec, 0, makeMeasureSpec2, 0);
        }
        setMeasuredDimension(i, View.resolveSize(getMeasuredTotalHeight(), i2));
    }

    /* renamed from: c */
    public final void mo47123c(int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            measureChildWithMargins(getChildAt(i2), makeMeasureSpec, 0, makeMeasureSpec2, 0);
        }
        int rowCount = getRowCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f41140d;
            if (i3 < i5) {
                for (int i6 = 0; i6 < rowCount; i6++) {
                    View a = mo47121a(i6, i3);
                    if (a == null) {
                        break;
                    }
                    i4 = Math.max(i4, a.getMeasuredWidth());
                }
                i3++;
            } else {
                int i7 = this.f41141e;
                int paddingRight = getPaddingRight();
                setMeasuredDimension(paddingRight + getPaddingLeft() + (((i4 + i7) * i5) - i7), View.resolveSize(getMeasuredTotalHeight(), i));
                return;
            }
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new GravityLayoutParams(getContext(), attributeSet, 17);
    }

    public int getColumnCount() {
        return this.f41140d;
    }

    public int getColumnPadding() {
        return this.f41141e;
    }

    public int getRowPadding() {
        return this.f41142f;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View a;
        View a2;
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingLeft2 = (((i5 - ((this.f41140d - 1) * this.f41141e)) - getPaddingLeft()) - getPaddingRight()) / this.f41140d;
        int rowCount = getRowCount();
        int i6 = paddingTop;
        int i7 = 0;
        while (i7 < rowCount) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.f41140d && (a2 = mo47121a(i7, i8)) != null) {
                i9 = Math.max(i9, a2.getMeasuredHeight());
                i8++;
            }
            int i11 = paddingLeft;
            int i12 = 0;
            while (i12 < this.f41140d && (a = mo47121a(i7, i12)) != null) {
                GravityLayoutParams gravityLayoutParams = (GravityLayoutParams) a.getLayoutParams();
                this.f41138b.set(i11, i6, i11 + paddingLeft2, i6 + i9);
                Rect rect = this.f41138b;
                rect.left += gravityLayoutParams.leftMargin;
                rect.right -= gravityLayoutParams.rightMargin;
                rect.top += gravityLayoutParams.topMargin;
                rect.bottom -= gravityLayoutParams.bottomMargin;
                Gravity.apply(gravityLayoutParams.f41132a, a.getMeasuredWidth(), a.getMeasuredHeight(), this.f41138b, this.f41139c);
                Rect rect2 = this.f41139c;
                int i13 = i11;
                C15780a.m40270c(this, i5, a, rect2.left, rect2.top, rect2.right, rect2.bottom);
                i11 = this.f41141e + paddingLeft2 + i13;
                i12++;
            }
            i6 += i9 + this.f41142f;
            i7++;
        }
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            mo47123c(i2);
            if (getMeasuredWidth() < size) {
                mo47122b(size, i2);
            }
        } else if (mode == 0) {
            mo47123c(i2);
        } else if (mode == 1073741824) {
            mo47122b(size, i2);
        }
    }

    public void setColumnCount(int i) {
        C21100e.m49365t(i, "columnCount");
        this.f41140d = i;
        requestLayout();
    }

    public void setColumnPadding(int i) {
        this.f41141e = i;
        requestLayout();
    }

    public void setRowPadding(int i) {
        this.f41142f = i;
        requestLayout();
    }

    public SimpleGridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41138b = new Rect();
        this.f41139c = new Rect();
        TypedArray o = UiUtils.m40256o(context, attributeSet, C18165g.SimpleGridLayout, i);
        try {
            setColumnCount(o.getInt(C18165g.SimpleGridLayout_android_columnCount, 1));
            setRowPadding(o.getDimensionPixelOffset(C18165g.SimpleGridLayout_rowPadding, 0));
            setColumnPadding(o.getDimensionPixelOffset(C18165g.SimpleGridLayout_columnPadding, 0));
        } finally {
            o.recycle();
        }
    }
}
