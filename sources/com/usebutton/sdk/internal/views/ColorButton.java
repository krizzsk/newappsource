package com.usebutton.sdk.internal.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.Button;

public class ColorButton extends Button {
    private int color;

    public ColorButton(Context context) {
        super(context);
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int i) {
        this.color = i;
        getBackground().setColorFilter(this.color, PorterDuff.Mode.SRC_ATOP);
    }

    public ColorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
