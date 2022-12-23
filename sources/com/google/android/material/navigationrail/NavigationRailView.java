package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.navigation.C14103d;
import com.google.android.material.navigation.NavigationBarView;
import p355ac.C13401b;
import p694oc.C18723b;

public class NavigationRailView extends NavigationBarView {

    /* renamed from: g */
    public final int f35219g;

    /* renamed from: h */
    public View f35220h;

    /* renamed from: i */
    public Boolean f35221i;

    /* renamed from: j */
    public Boolean f35222j;

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.navigationRailStyle);
    }

    private C18723b getNavigationRailMenuView() {
        return (C18723b) getMenuView();
    }

    /* renamed from: a */
    public final C14103d mo41046a(Context context) {
        return new C18723b(context);
    }

    public View getHeaderView() {
        return this.f35220h;
    }

    public int getItemMinimumHeight() {
        return ((C18723b) getMenuView()).getItemMinimumHeight();
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        C18723b navigationRailMenuView = getNavigationRailMenuView();
        View view = this.f35220h;
        boolean z3 = true;
        int i5 = 0;
        if (view == null || view.getVisibility() == 8) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            int bottom = this.f35220h.getBottom() + this.f35219g;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else {
            if ((navigationRailMenuView.f47635G.gravity & 112) != 48) {
                z3 = false;
            }
            if (z3) {
                i5 = this.f35219g;
            }
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            int paddingLeft = getPaddingLeft();
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), getPaddingRight() + paddingLeft + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i, i2);
        View view = this.f35220h;
        if (view == null || view.getVisibility() == 8) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            measureChild(getNavigationRailMenuView(), i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f35220h.getMeasuredHeight()) - this.f35219g, Integer.MIN_VALUE));
        }
    }

    public void setItemMinimumHeight(int i) {
        ((C18723b) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationRailView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = p355ac.C13410k.Widget_MaterialComponents_NavigationRailView
            r8.<init>(r9, r10, r11, r4)
            r9 = 0
            r8.f35221i = r9
            r8.f35222j = r9
            android.content.res.Resources r0 = r8.getResources()
            int r1 = p355ac.C13403d.mtrl_navigation_rail_margin
            int r6 = r0.getDimensionPixelSize(r1)
            r8.f35219g = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = p355ac.C13411l.NavigationRailView
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.h1 r10 = com.google.android.material.internal.C14077m.m35061e(r0, r1, r2, r3, r4, r5)
            int r11 = p355ac.C13411l.NavigationRailView_headerLayout
            int r11 = r10.mo2095i(r11, r7)
            r0 = 49
            if (r11 == 0) goto L_0x0053
            android.content.Context r1 = r8.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            android.view.View r11 = r1.inflate(r11, r8, r7)
            android.view.View r1 = r8.f35220h
            if (r1 == 0) goto L_0x0044
            r8.removeView(r1)
            r8.f35220h = r9
        L_0x0044:
            r8.f35220h = r11
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r9.<init>(r1, r1)
            r9.gravity = r0
            r9.topMargin = r6
            r8.addView(r11, r7, r9)
        L_0x0053:
            int r9 = p355ac.C13411l.NavigationRailView_menuGravity
            int r9 = r10.mo2094h(r9, r0)
            r8.setMenuGravity(r9)
            int r9 = p355ac.C13411l.NavigationRailView_itemMinHeight
            boolean r11 = r10.mo2098l(r9)
            if (r11 == 0) goto L_0x006c
            r11 = -1
            int r9 = r10.mo2090d(r9, r11)
            r8.setItemMinimumHeight(r9)
        L_0x006c:
            int r9 = p355ac.C13411l.NavigationRailView_paddingTopSystemWindowInsets
            boolean r11 = r10.mo2098l(r9)
            if (r11 == 0) goto L_0x007e
            boolean r9 = r10.mo2087a(r9, r7)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.f35221i = r9
        L_0x007e:
            int r9 = p355ac.C13411l.NavigationRailView_paddingBottomSystemWindowInsets
            boolean r11 = r10.mo2098l(r9)
            if (r11 == 0) goto L_0x0090
            boolean r9 = r10.mo2087a(r9, r7)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8.f35222j = r9
        L_0x0090:
            r10.mo2099n()
            oc.c r9 = new oc.c
            r9.<init>(r8)
            com.google.android.material.internal.C14083r.m35065a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
