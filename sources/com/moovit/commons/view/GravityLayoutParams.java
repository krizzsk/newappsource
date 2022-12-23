package com.moovit.commons.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.moovit.commons.utils.UiUtils;
import p622kz.C18165g;

public class GravityLayoutParams extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f41132a;

    public GravityLayoutParams(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 17);
    }

    public GravityLayoutParams(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        TypedArray n = UiUtils.m40255n(context, attributeSet, C18165g.GravityLayoutParams);
        try {
            this.f41132a = n.getInt(C18165g.GravityLayoutParams_android_layout_gravity, i);
        } finally {
            n.recycle();
        }
    }

    public GravityLayoutParams(int i) {
        super(-2, -2);
        this.f41132a = i;
    }
}
