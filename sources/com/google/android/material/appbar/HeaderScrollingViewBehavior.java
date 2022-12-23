package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import ce0.C21100e;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6357f;
import p242s1.C6382p0;
import p242s1.C6396v0;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: c */
    public final Rect f34209c = new Rect();

    /* renamed from: d */
    public final Rect f34210d = new Rect();

    /* renamed from: e */
    public int f34211e = 0;

    /* renamed from: f */
    public int f34212f;

    public HeaderScrollingViewBehavior() {
    }

    /* renamed from: b */
    public final void mo40961b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        AppBarLayout c = mo40878c(coordinatorLayout.mo3296q(view));
        int i3 = 0;
        if (c != null) {
            CoordinatorLayout.C0752e eVar = (CoordinatorLayout.C0752e) view.getLayoutParams();
            Rect rect = this.f34209c;
            rect.set(coordinatorLayout.getPaddingLeft() + eVar.leftMargin, c.getBottom() + eVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - eVar.rightMargin, ((c.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - eVar.bottomMargin);
            C6396v0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6337d.m15042b(coordinatorLayout) && !C6333d0.C6337d.m15042b(view)) {
                    rect.left = lastWindowInsets.mo22504c() + rect.left;
                    rect.right -= lastWindowInsets.mo22505d();
                }
            }
            Rect rect2 = this.f34210d;
            int i4 = eVar.f3271c;
            if (i4 == 0) {
                i2 = 8388659;
            } else {
                i2 = i4;
            }
            C6357f.m15160b(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.f34212f != 0) {
                float d = mo40879d(c);
                int i5 = this.f34212f;
                i3 = C21100e.m49377z((int) (d * ((float) i5)), 0, i5);
            }
            view.layout(rect2.left, rect2.top - i3, rect2.right, rect2.bottom - i3);
            this.f34211e = rect2.top - c.getBottom();
            return;
        }
        coordinatorLayout.mo3309w(i, view);
        this.f34211e = 0;
    }

    /* renamed from: c */
    public abstract AppBarLayout mo40878c(ArrayList arrayList);

    /* renamed from: d */
    public float mo40879d(View view) {
        return 1.0f;
    }

    /* renamed from: e */
    public int mo40880e(View view) {
        return view.getMeasuredHeight();
    }

    public final boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout c;
        int i5;
        C6396v0 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (c = mo40878c(coordinatorLayout.mo3296q(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6337d.m15042b(c) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.mo22503b() + lastWindowInsets.mo22506e();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int e = (size + mo40880e(c)) - c.getMeasuredHeight();
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.mo3310x(view, i, i2, View.MeasureSpec.makeMeasureSpec(e, i5), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
