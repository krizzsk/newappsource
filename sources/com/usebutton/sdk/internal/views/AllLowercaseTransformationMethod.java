package com.usebutton.sdk.internal.views;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class AllLowercaseTransformationMethod implements TransformationMethod {
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString().toLowerCase(Locale.getDefault());
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
