package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: com.google.android.material.timepicker.b */
public final class C14215b implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ GestureDetector f35711b;

    public C14215b(GestureDetector gestureDetector) {
        this.f35711b = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f35711b.onTouchEvent(motionEvent);
        }
        return false;
    }
}
