package kc0;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: kc0.a */
public final /* synthetic */ class C12835a implements View.OnTouchListener {
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 2) {
            return true;
        }
        return false;
    }
}
