package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;

public class SquareTextView extends MaterialTextView {
    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(getMeasuredWidth(), getMeasuredHeight());
        setMeasuredDimension(max, max);
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
