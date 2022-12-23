package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.android.gms.base.C25573R;
import com.google.android.gms.common.util.DeviceProperties;
import p141k1.C5450a;

public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException(C16759e.m42349e("Unknown color scheme: ", i));
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C25573R.C25574drawable.common_google_signin_btn_icon_dark;
        int i5 = C25573R.C25574drawable.common_google_signin_btn_icon_light;
        int zab = zab(i2, i4, i5, i5);
        int i6 = C25573R.C25574drawable.common_google_signin_btn_text_dark;
        int i7 = C25573R.C25574drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            zab = zab2;
        } else if (i != 2) {
            throw new IllegalStateException(C16759e.m42349e("Unknown button size: ", i));
        }
        Drawable g = C5450a.m13604g(resources.getDrawable(zab));
        C5450a.C5452b.m13617h(g, resources.getColorStateList(C25573R.color.common_google_signin_btn_tint));
        C5450a.C5452b.m13618i(g, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(g);
        int i8 = C25573R.color.common_google_signin_btn_text_dark;
        int i9 = C25573R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(C25573R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C25573R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown button size: ", i));
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
