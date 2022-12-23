package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.internal.i0 */
public final /* synthetic */ class C2405i0 implements View.OnTouchListener {
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }
}
