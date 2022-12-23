package com.usebutton.thirdparty.com.flipboard.bottomsheet;

import android.view.View;

public abstract class BaseViewTransformer implements ViewTransformer {
    public static final float MAX_DIM_ALPHA = 0.7f;

    public float getDimAlpha(float f, float f2, float f3, BottomSheetLayout bottomSheetLayout, View view) {
        return (f / f2) * 0.7f;
    }
}
