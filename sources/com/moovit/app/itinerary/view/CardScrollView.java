package com.moovit.app.itinerary.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.moovit.commons.utils.UiUtils;

public class CardScrollView extends ScrollView {

    /* renamed from: b */
    public boolean f38649b;

    public CardScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static View m38175a(View view, int i, int i2, Rect rect) {
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
                        View a = m38175a(childAt, left, top, rect);
                        if (a != null) {
                            return a;
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
        View I = UiUtils.m40241I(this, 0, "scroll_object");
        if (I != null) {
            Rect rect = new Rect();
            I.getHitRect(rect);
            if (!rect.contains(getScrollX() + ((int) motionEvent.getX()), getScrollY() + ((int) motionEvent.getY()))) {
                this.f38649b = false;
                return false;
            } else if (m38175a(this, (int) motionEvent.getX(), (int) motionEvent.getY(), new Rect()) != null) {
                this.f38649b = false;
                return false;
            } else {
                super.onInterceptTouchEvent(motionEvent);
                this.f38649b = true;
                return true;
            }
        } else {
            this.f38649b = false;
            return false;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38649b) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public CardScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38649b = false;
        setOverScrollMode(2);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }
}
