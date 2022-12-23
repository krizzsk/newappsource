package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;

public class ImeFrameLayout extends FrameLayout {

    /* renamed from: b */
    public final GestureDetector f41136b;

    /* renamed from: com.moovit.commons.view.ImeFrameLayout$a */
    public class C15799a extends GestureDetector.SimpleOnGestureListener {
        public C15799a() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            ImeFrameLayout imeFrameLayout = ImeFrameLayout.this;
            InputMethodManager inputMethodManager = (InputMethodManager) imeFrameLayout.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(imeFrameLayout.getWindowToken(), 0);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            ImeFrameLayout imeFrameLayout = ImeFrameLayout.this;
            InputMethodManager inputMethodManager = (InputMethodManager) imeFrameLayout.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(imeFrameLayout.getWindowToken(), 0);
            }
            return false;
        }
    }

    public ImeFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f41136b.onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ImeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41136b = new GestureDetector(context, new C15799a());
    }
}
