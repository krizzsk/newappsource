package com.moovit.app.itinerary.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.commons.view.pager.ViewPager;
import p435de.C16596f;

public class CustomViewPager extends ViewPager {

    /* renamed from: i */
    public boolean f38650i;

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: f */
    public static View m38176f(View view, int i, int i2, Rect rect) {
        if (view instanceof ViewGroup) {
            int scrollX = view.getScrollX() + i;
            int scrollY = view.getScrollY() + i2;
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isClickable()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    return null;
                }
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt.getVisibility() == 0) {
                    childAt.getHitRect(rect);
                    if (rect.contains(scrollX, scrollY)) {
                        int left = scrollX - childAt.getLeft();
                        int top = scrollY - childAt.getTop();
                        View f = m38176f(childAt, left, top, rect);
                        if (f != null) {
                            return f;
                        }
                        int left2 = childAt.getLeft() + left;
                        scrollY = childAt.getTop() + top;
                        scrollX = left2;
                    } else {
                        continue;
                    }
                }
            }
        } else if (view.isClickable()) {
            return view;
        } else {
            return null;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f38650i = false;
        ViewGroup viewGroup = (ViewGroup) getPrimaryItem();
        if (viewGroup != null) {
            Rect rect = new Rect();
            viewGroup.getHitRect(rect);
            if (rect.contains(getScrollX() + ((int) motionEvent.getX()), getScrollY() + ((int) motionEvent.getY()))) {
                if (m38176f(viewGroup, (int) motionEvent.getX(), (int) motionEvent.getY(), new Rect()) != null) {
                    this.f38650i = false;
                    return false;
                }
                this.f38650i = true;
            }
        }
        if (this.f38650i) {
            try {
                this.f38650i = super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e) {
                C16596f.m42113a().mo49364c(e);
            }
        }
        return this.f38650i;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38650i) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            C16596f.m42113a().mo49364c(e);
            return false;
        }
    }
}
