package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class ProgressSlider extends SeekBar {
    public ProgressSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ProgressSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
