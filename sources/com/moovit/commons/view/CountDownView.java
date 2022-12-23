package com.moovit.commons.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textview.MaterialTextView;

public class CountDownView extends MaterialTextView {
    public CountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
