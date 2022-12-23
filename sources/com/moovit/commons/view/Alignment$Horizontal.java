package com.moovit.commons.view;

import android.graphics.Paint;
import i00.C17523b;

public enum Alignment$Horizontal {
    LEFT,
    CENTER,
    RIGHT;

    public float getLeftFor(float f, float f2, float f3, int i) {
        float f4 = (f * ((float) i)) + f2;
        int i2 = C17523b.f45106a[ordinal()];
        if (i2 == 1) {
            return f4;
        }
        if (i2 == 2) {
            return f4 - (f3 / 2.0f);
        }
        if (i2 == 3) {
            return f4 - f3;
        }
        throw new IllegalStateException();
    }

    public Paint.Align getPaintAlign() {
        int i = C17523b.f45106a[ordinal()];
        if (i == 1) {
            return Paint.Align.LEFT;
        }
        if (i == 2) {
            return Paint.Align.CENTER;
        }
        if (i == 3) {
            return Paint.Align.RIGHT;
        }
        throw new IllegalStateException();
    }
}
