package com.moovit.app.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

public class QuickActionHorizontalScrollView extends HorizontalScrollView {

    /* renamed from: b */
    public boolean f37421b;

    public QuickActionHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843603);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f37421b = true;
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getChildCount() > 0 && getLayoutDirection() == 1 && !this.f37421b) {
            scrollTo(getChildAt(0).getRight(), 0);
        }
    }

    public QuickActionHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f37421b = false;
    }
}
