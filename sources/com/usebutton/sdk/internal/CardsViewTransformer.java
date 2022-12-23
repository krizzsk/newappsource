package com.usebutton.sdk.internal;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.thirdparty.com.flipboard.bottomsheet.BaseViewTransformer;
import com.usebutton.thirdparty.com.flipboard.bottomsheet.BottomSheetLayout;

class CardsViewTransformer extends BaseViewTransformer {
    private static final float MAX_DIM_ALPHA = 0.7f;

    public float getDimAlpha(float f, float f2, float f3, BottomSheetLayout bottomSheetLayout, View view) {
        return (Math.max(BitmapDescriptorFactory.HUE_RED, f - f3) / f2) * 0.7f;
    }

    public void transformView(float f, float f2, float f3, BottomSheetLayout bottomSheetLayout, View view) {
    }
}
