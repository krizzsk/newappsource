package com.moovit.commons.view;

import i00.C17523b;

public enum Alignment$Vertical {
    TOP,
    CENTER,
    BOTTOM;

    public float getTopFor(float f, float f2, float f3, int i) {
        float f4 = (f * ((float) i)) + f2;
        int i2 = C17523b.f45107b[ordinal()];
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
}
