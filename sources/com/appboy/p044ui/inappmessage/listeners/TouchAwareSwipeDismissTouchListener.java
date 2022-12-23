package com.appboy.p044ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;
import com.appboy.p044ui.inappmessage.listeners.SwipeDismissTouchListener;

/* renamed from: com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener */
public class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener {
    private ITouchListener mTouchListener;

    /* renamed from: com.appboy.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener$ITouchListener */
    public interface ITouchListener {
        void onTouchEnded();

        void onTouchStartedOrContinued();
    }

    public TouchAwareSwipeDismissTouchListener(View view, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        this(view, (Object) null, dismissCallbacks);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ITouchListener iTouchListener;
        int action = motionEvent.getAction();
        if (action == 0) {
            ITouchListener iTouchListener2 = this.mTouchListener;
            if (iTouchListener2 != null) {
                iTouchListener2.onTouchStartedOrContinued();
            }
        } else if ((action == 1 || action == 3) && (iTouchListener = this.mTouchListener) != null) {
            iTouchListener.onTouchEnded();
        }
        return super.onTouch(view, motionEvent);
    }

    public void setTouchListener(ITouchListener iTouchListener) {
        this.mTouchListener = iTouchListener;
    }

    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismissCallbacks) {
        super(view, obj, dismissCallbacks);
    }
}
