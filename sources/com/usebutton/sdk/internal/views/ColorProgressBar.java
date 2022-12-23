package com.usebutton.sdk.internal.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ColorProgressBar extends ProgressBar {
    private int color;

    public ColorProgressBar(Context context) {
        super(context);
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int i) {
        this.color = i;
        setProgressTintList(ColorStateList.valueOf(i));
    }

    public ColorProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
