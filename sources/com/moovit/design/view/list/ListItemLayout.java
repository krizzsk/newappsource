package com.moovit.design.view.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.moovit.app.ridesharing.view.BookingOptionListItemView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.view.TransitLineListItemView;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p977zz.C20941h;
import w00.C20261b;
import w00.C20263d;
import w00.C20267h;

public class ListItemLayout extends ViewGroup {

    /* renamed from: b */
    public final int f41442b;

    /* renamed from: c */
    public final int f41443c;

    /* renamed from: d */
    public final int f41444d;

    /* renamed from: e */
    public final int f41445e;

    /* renamed from: f */
    public Drawable f41446f;

    /* renamed from: g */
    public int f41447g;

    /* renamed from: h */
    public int f41448h;

    /* renamed from: i */
    public boolean f41449i;

    /* renamed from: j */
    public boolean f41450j;

    /* renamed from: k */
    public final boolean f41451k;

    /* renamed from: l */
    public final Rect f41452l;

    /* renamed from: m */
    public final Rect f41453m;

    /* renamed from: n */
    public final Rect f41454n;

    /* renamed from: o */
    public int f41455o;

    public ListItemLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C20261b.listItemLayoutStyle);
    }

    /* renamed from: a */
    public View mo47778a() {
        return UiUtils.m40241I(this, C20263d.accessory, "accessory");
    }

    /* renamed from: b */
    public View mo47779b() {
        return UiUtils.m40241I(this, C20263d.icon, "icon");
    }

    /* renamed from: c */
    public View mo47780c() {
        return UiUtils.m40241I(this, C20263d.subtitle, "subtitle");
    }

    /* renamed from: d */
    public View mo47781d() {
        return UiUtils.m40241I(this, C20263d.title, "title");
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        super.draw(canvas);
        if (this.f41446f != null) {
            View a = mo47778a();
            if (a == null || a.getVisibility() == 8) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int intrinsicWidth = this.f41446f.getIntrinsicWidth();
                int paddingTop = getPaddingTop();
                int height = getHeight() - getPaddingBottom();
                if (true ^ C15780a.m40269b(this)) {
                    i = (a.getLeft() - this.f41447g) - intrinsicWidth;
                } else {
                    i = a.getRight();
                }
                this.f41446f.setBounds(i, paddingTop, intrinsicWidth + i, height);
                this.f41446f.draw(canvas);
            }
        }
    }

    /* renamed from: e */
    public boolean mo24760e() {
        return this instanceof BookingOptionListItemView;
    }

    /* renamed from: f */
    public void mo23935f(int i, int i2) {
    }

    /* renamed from: g */
    public void mo23936g(int i) {
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(this.f41451k ? -2 : -1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public CharSequence getAccessibilityClassName() {
        if (isClickable()) {
            return Button.class.getName();
        }
        return super.getAccessibilityClassName();
    }

    public int getExtraBottomViewsMeasuredHeight() {
        return 0;
    }

    public int getExtraTopViewsMeasuredHeight() {
        return 0;
    }

    /* renamed from: h */
    public void mo23939h(int i, int i2, int i3, int i4) {
    }

    /* renamed from: i */
    public void mo23940i(int i, int i2, int i3, int i4) {
    }

    /* renamed from: j */
    public boolean mo47795j() {
        return this.f41446f != null;
    }

    /* renamed from: k */
    public final void mo47894k() {
        super.setWillNotDraw(!mo47795j());
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int extraTopViewsMeasuredHeight = getExtraTopViewsMeasuredHeight();
        int extraBottomViewsMeasuredHeight = getExtraBottomViewsMeasuredHeight();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int f = C6333d0.C6338e.m15065f(this);
        int e = C6333d0.C6338e.m15064e(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        View b = mo47779b();
        View d = mo47781d();
        View c = mo47780c();
        View a = mo47778a();
        int i9 = 0;
        if (b == null || b.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (d == null || d.getVisibility() == 8) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (c == null || c.getVisibility() == 8) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (a == null || a.getVisibility() == 8) {
            z5 = false;
        } else {
            z5 = true;
        }
        this.f41452l.set(f, paddingTop + extraTopViewsMeasuredHeight, i7, (i8 - paddingBottom) - extraBottomViewsMeasuredHeight);
        if (!z5 || !this.f41450j) {
            this.f41452l.right -= e;
        }
        Gravity.apply(this.f41442b, this.f41452l.width(), this.f41455o, this.f41452l, this.f41453m);
        if (z2) {
            int measuredWidth = b.getMeasuredWidth();
            int measuredHeight = b.getMeasuredHeight();
            Rect rect = this.f41453m;
            int i11 = rect.left;
            int height = ((rect.height() - measuredHeight) / 2) + rect.top;
            int i12 = i11 + measuredWidth;
            int i13 = measuredHeight + height;
            int i14 = height - extraTopViewsMeasuredHeight;
            if (!(this instanceof TransitLineListItemView)) {
                i13 += extraBottomViewsMeasuredHeight;
            }
            C15780a.m40270c(this, i7, b, i11, i14, i12, i13);
            Rect rect2 = this.f41453m;
            rect2.left = measuredWidth + this.f41443c + rect2.left;
        }
        if (z5) {
            int measuredWidth2 = a.getMeasuredWidth();
            int measuredHeight2 = a.getMeasuredHeight();
            Rect rect3 = this.f41453m;
            int i15 = rect3.right - measuredWidth2;
            int i16 = this.f41448h;
            if (i16 != 1) {
                if (i16 == 2) {
                    int i17 = rect3.top;
                    int i18 = rect3.bottom;
                    if (this.f41449i) {
                        i17 -= paddingTop;
                        i18 += paddingBottom;
                    }
                    int i19 = i17 - extraTopViewsMeasuredHeight;
                    if (!mo24760e()) {
                        i18 += extraBottomViewsMeasuredHeight;
                    }
                    i6 = ((i19 + i18) - measuredHeight2) / 2;
                } else {
                    StringBuilder k = C13555b.m33972k("Unknown accessory layout mode: ");
                    k.append(this.f41448h);
                    throw new IllegalStateException(k.toString());
                }
            } else if (!this.f41449i) {
                i6 = paddingTop + 0;
            } else {
                i6 = 0;
            }
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginStart = (marginLayoutParams.getMarginStart() + i15) - marginLayoutParams.getMarginEnd();
                i6 = (i6 + marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
                i15 = marginStart;
            }
            int i21 = i6;
            C15780a.m40270c(this, i7, a, i15, i21, i15 + measuredWidth2, i21 + measuredHeight2);
            this.f41453m.right -= measuredWidth2 + this.f41445e;
        }
        if (z3) {
            i5 = d.getMeasuredHeight();
        } else {
            i5 = 0;
        }
        if (z4) {
            i9 = c.getMeasuredHeight();
        }
        int i22 = i5 + i9;
        if (z3 && z4) {
            i22 += this.f41444d;
        }
        int i23 = i22;
        if (z3) {
            int measuredWidth3 = d.getMeasuredWidth();
            Rect rect4 = this.f41453m;
            int i24 = rect4.left;
            int height2 = rect4.top + ((rect4.height() - i23) / 2);
            C15780a.m40270c(this, i7, d, i24, height2, i24 + measuredWidth3, height2 + i5);
        }
        if (z4) {
            int measuredWidth4 = c.getMeasuredWidth();
            Rect rect5 = this.f41453m;
            int i25 = rect5.left;
            int height3 = (((rect5.height() + i23) / 2) + rect5.top) - i9;
            C15780a.m40270c(this, i7, c, i25, height3, i25 + measuredWidth4, height3 + i9);
        }
        Rect rect6 = this.f41454n;
        Rect rect7 = this.f41453m;
        int i26 = rect7.left;
        int i27 = rect7.top;
        int i28 = i27 - extraTopViewsMeasuredHeight;
        int i29 = rect7.right;
        if (rect6 == null) {
            rect6 = new Rect();
        }
        rect6.set(i26, i28, i29, i27);
        if (C15780a.m40269b(this)) {
            int i31 = i29 - i26;
            int i32 = i7 - i26;
            rect6.right = i32;
            rect6.left = i32 - i31;
        }
        Rect rect8 = this.f41454n;
        mo23940i(rect8.left, rect8.top, rect8.right, rect8.bottom);
        Rect rect9 = this.f41454n;
        Rect rect10 = this.f41453m;
        int i33 = rect10.left;
        int i34 = rect10.bottom;
        int i35 = rect10.right;
        int i36 = extraBottomViewsMeasuredHeight + i34;
        if (rect9 == null) {
            rect9 = new Rect();
        }
        rect9.set(i33, i34, i35, i36);
        if (C15780a.m40269b(this)) {
            int i37 = i7 - i33;
            rect9.right = i37;
            rect9.left = i37 - (i35 - i33);
        }
        Rect rect11 = this.f41454n;
        mo23939h(rect11.left, rect11.top, rect11.right, rect11.bottom);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i11 = i2;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int f = C6333d0.C6338e.m15065f(this);
        int e = C6333d0.C6338e.m15064e(this);
        View b = mo47779b();
        View d = mo47781d();
        View c = mo47780c();
        View a = mo47778a();
        if (b == null || b.getVisibility() == 8) {
            z = false;
        } else {
            z = true;
        }
        if (d == null || d.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        View view = d;
        if (c == null || c.getVisibility() == 8) {
            z3 = false;
        } else {
            z3 = true;
        }
        View view2 = c;
        if (a == null || a.getVisibility() == 8) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z2 || z3) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            measureChild(b, i9, i11);
            int measuredWidth = b.getMeasuredWidth() + f;
            if (z5) {
                measuredWidth += this.f41443c;
            }
            i4 = Math.max(0, b.getMeasuredHeight());
            f = measuredWidth;
            i3 = 0;
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (z4) {
            z6 = z4;
            a.measure(View.MeasureSpec.makeMeasureSpec(i3, i3), View.MeasureSpec.makeMeasureSpec(i3, i3));
            i5 = a.getMeasuredWidth() + f;
            if (z5 || z) {
                i5 += this.f41445e;
            }
            int measuredHeight = a.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i5 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                measuredHeight += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            if (this.f41449i) {
                measuredHeight -= paddingTop + paddingBottom;
            }
            int max = Math.max(i4, measuredHeight);
            Drawable drawable = this.f41446f;
            if (drawable != null) {
                i5 = C16530d.m42021o(this.f41447g, 2, Math.max(0, drawable.getIntrinsicWidth()), i5);
                max = Math.max(max, this.f41446f.getIntrinsicHeight());
            }
            if (!this.f41450j) {
                i5 += e;
            }
        } else {
            z6 = z4;
            i5 = f + e;
        }
        int max2 = Math.max(0, size - i5);
        if (z2) {
            View view3 = view;
            view3.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(max2, mode), 0, view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            i7 = Math.max(0, view3.getMeasuredWidth());
            i6 = view3.getMeasuredHeight() + 0;
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (z3) {
            View view4 = view2;
            view4.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(max2, mode), 0, view2.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            i7 = Math.max(i7, view4.getMeasuredWidth());
            i6 += view4.getMeasuredHeight();
        }
        if (z2 && z3) {
            i6 += this.f41444d;
        }
        int max3 = Math.max(i4, i6);
        this.f41455o = max3;
        mo23936g(max2);
        mo23935f(i9, max2);
        int max4 = Math.max(getExtraBottomViewsMeasuredHeight() + getExtraTopViewsMeasuredHeight() + max3 + paddingTop + paddingBottom, C6333d0.C6337d.m15044d(this));
        int max5 = Math.max(i5 + i7, C6333d0.C6337d.m15045e(this));
        if (z6 && this.f41448h == 1) {
            if (!this.f41449i) {
                i8 = max4 - (paddingTop + paddingBottom);
            } else {
                i8 = max4;
            }
            if (mo24760e()) {
                i8 -= getExtraBottomViewsMeasuredHeight();
            }
            a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
        }
        setMeasuredDimension(View.resolveSize(max5, i9), View.resolveSize(max4, i2));
    }

    public void setAccessoryDivider(Drawable drawable) {
        if (this.f41446f != drawable) {
            this.f41446f = drawable;
            requestLayout();
        }
    }

    public void setAccessoryDividerSpacing(int i) {
        if (this.f41447g != i) {
            this.f41447g = Math.max(0, i);
            requestLayout();
        }
    }

    public void setAccessoryIgnoreHorizontalPadding(boolean z) {
        this.f41450j = z;
        requestLayout();
    }

    public void setAccessoryIgnoreVerticalPadding(boolean z) {
        this.f41449i = z;
        requestLayout();
    }

    public void setAccessoryLayoutMode(int i) {
        if (this.f41448h != i) {
            if (i == 1 || i == 2) {
                this.f41448h = i;
                requestLayout();
                return;
            }
            throw new IllegalArgumentException(C16759e.m42349e("Unknown accessory layout mode: ", i));
        }
    }

    @Deprecated
    public final void setWillNotDraw(boolean z) {
        throw new UnsupportedOperationException("Unsupported operation by ListItemLayout!");
    }

    /* JADX INFO: finally extract failed */
    public ListItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41452l = new Rect();
        this.f41453m = new Rect();
        this.f41454n = new Rect();
        TypedArray o = UiUtils.m40256o(context, attributeSet, C20267h.ListItemLayout, i);
        try {
            this.f41442b = o.getInt(C20267h.ListItemLayout_android_gravity, 16);
            this.f41443c = C20941h.m49040c(context, o, C20267h.ListItemLayout_iconSpacing);
            this.f41444d = C20941h.m49040c(context, o, C20267h.ListItemLayout_titlesSpacing);
            this.f41445e = C20941h.m49040c(context, o, C20267h.ListItemLayout_accessorySpacing);
            this.f41446f = C20941h.m49042e(context, o, C20267h.ListItemLayout_accessoryDivider);
            this.f41447g = Math.max(0, C20941h.m49040c(context, o, C20267h.ListItemLayout_accessoryDividerSpacing));
            this.f41449i = o.getBoolean(C20267h.ListItemLayout_accessoryIgnoreVerticalPadding, false);
            this.f41450j = o.getBoolean(C20267h.ListItemLayout_accessoryIgnoreHorizontalPadding, false);
            setAccessoryLayoutMode(o.getInt(C20267h.ListItemLayout_accessoryLayoutMode, 2));
            this.f41451k = o.getBoolean(C20267h.ListItemLayout_wrapContent, false);
            o.recycle();
            setClipToPadding(false);
            mo47894k();
        } catch (Throwable th) {
            o.recycle();
            throw th;
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
