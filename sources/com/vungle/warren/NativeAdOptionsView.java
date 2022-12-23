package com.vungle.warren;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

class NativeAdOptionsView extends FrameLayout {

    /* renamed from: b */
    public ImageView f58507b;

    public NativeAdOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58507b = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f58507b.setLayoutParams(layoutParams);
        addView(this.f58507b);
    }

    public NativeAdOptionsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f58507b = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f58507b.setLayoutParams(layoutParams);
        addView(this.f58507b);
    }
}
