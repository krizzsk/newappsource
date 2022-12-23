package com.moovit.map.nutiteq;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class NonLayoutingView extends ViewGroup {
    public NonLayoutingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public NonLayoutingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
